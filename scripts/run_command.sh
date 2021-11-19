# Run command on each SDK

COMMAND=$1

for dir in sdks/*/
do
    cd $dir
    dir=${dir%*/}
    echo "[INFO] Running command: \"$COMMAND\" for SDK ${dir##*/}"
    $COMMAND
    echo "[INFO] Command \"$COMMAND\" Successful."
done
