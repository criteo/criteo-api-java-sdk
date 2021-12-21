echo "Looping through generated Java SDKs..."

for dir in ./sdks/*;
    do (
        if [ -d "$dir" ];
            then
                echo "$dir"
                cd "$dir"
                echo "Publishing this SDK to Maven Central."
                chmod +x gradlew
                ./gradlew publishToSonatype closeSonatypeStagingRepository
        fi
    );
done

echo "Done."