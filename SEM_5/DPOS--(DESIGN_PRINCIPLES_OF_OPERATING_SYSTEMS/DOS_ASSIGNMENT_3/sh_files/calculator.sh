if [ $# -ne 3 ]; then
	echo "Invalid input"
	exit 1
fi
n1=$1
operator=$2
n2=$3
case $operator in
	"+")
	    result=$(( n1 + n2 )) ;;
	"-")
	    result=$(( n1 - n2 )) ;;
	"x")
	    result=$(( n1 * n2 )) ;;
	"/")
	    result=$(( n1 / n2 )) ;;
	"^")
	    result=$(( n1 ^ n2 )) ;;
	*)
	    echo "Invalid input"
	    exit 1 ;;
esac
echo "$n1 $operator $n2 = $result"
