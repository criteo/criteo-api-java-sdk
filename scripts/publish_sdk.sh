echo "Looping through generated Java SDKs..."

DID_FAIL=false

for dir in ./sdks/*;
    do (
        if [ -d "$dir" ];
            then
                echo "$dir"
                cd "$dir"
                echo "Publishing this SDK to Maven Central."
                chmod +x gradlew
                # Use this instead to only upload to the staging repo
                #./gradlew publishToSonatype closeSonatypeStagingRepository; gradlew_return_code=$?
                ./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository; gradlew_return_code=$?
                if (( gradlew_return_code !=0 )); then
                    echo "Publication failed"
                    DID_FAIL=true
                fi
        fi
    );
done

if [[ $DID_FAIL == true ]]
then
    echo "At least one SDK failed to publish."
    exit 1
fi

echo "SDKs were published successfully."
