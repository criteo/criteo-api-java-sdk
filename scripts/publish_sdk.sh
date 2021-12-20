echo "Looping through generated Java SDKs..."

SDK_REPO="$GITHUB_WORKSPACE/sdks"

for dir in $SDK_REPO/*;
    do (
        if [ -d "$dir" ];
            then
                echo "$dir"
                cd "$dir"
                echo "Publishing this SDK to Maven Central."
        fi
    );
done

echo "Done."