echo "Looping through generated Java SDKs..."

SDK_REPO="$GITHUB_WORKSPACE/sdks"

echo $SDK_REPO

for d in $SDK_REPO
do
    echo "$d"
done

echo "Done."