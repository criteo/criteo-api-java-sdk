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
                ./gradlew publishToSonatype closeSonatypeStagingRepository; gradlew_return_code=$?
                # TODO - When ready to have the process fully automated, delete the line above and uncomment out the line below.
                # The current script will push the SDKs to the Nexus Repository Manager, but will not publish them to MavenCentral.
                # ./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository; gradlew_return_code=$?
                if (( gradlew_return_code !=0 )); then
                    echo "Publication failed"
                    DID_FAIL=true
                fi
        fi
    );
done

if [ "$DID_FAIL" = true ]
then
    echo "At least one SDK failed to publish."
    exit 1
fi

echo "SDKs were published successfully."