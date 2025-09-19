#!/bin/bash

echo "Looping through generated Java SDKs..."

ORIGINAL_TOP_DIR=$(pwd)
DID_FAIL=false

for dir in $ORIGINAL_TOP_DIR/sdks/*;
    do
        echo "Inspecting candidate sub directory: $dir"
        if [ -d "$dir" ];
            then
                cd "$dir"
                echo "Publishing SDK to Maven Central for $dir."
                chmod +x gradlew
                chmod +x uploadToMavenCentral.sh
                if ! ./uploadToMavenCentral.sh; then
                    echo "Publication failed"
                    DID_FAIL=true
                fi
                echo "Moving back to $ORIGINAL_TOP_DIR"
                cd $ORIGINAL_TOP_DIR
        fi
done

if [[ $DID_FAIL == true ]]
then
    echo "At least one SDK failed to publish."
    exit 1
fi

echo "SDKs were published successfully."
