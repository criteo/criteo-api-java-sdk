echo "Looping through generated Java SDKs..."

for dir in ./sdks/*;
    do (
        if [ -d "$dir" ];
            then
                echo "$dir"
                cd "$dir"
                echo "Publishing this SDK to Maven Central."
                chmod +x gradlew
                ./gradlew publishToSonatype closeSonatypeStagingRepository; gradlew_return_code=$?
                echo gradlew_return_code
                if (( gradlew_return_code !=0 )); then
                    echo "Publication failed"
                    exit 1
                fi
        fi
    );
done

echo "Done."