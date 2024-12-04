if [ $# -ne 3 ]; then
	echo "Please provide 3 input"
	exit 1
fi
n1=$1
n2=$2
n3=$3
if [ $n1 -le $n2 ] && [ $n1 -le $n3 ]; then
	echo "The smallest number is : $n1"
elif [ $n2 -le $n1 ] && [ $n2 -le $n3 ]; then
	echo "The smallest number is : $n2"
else
	echo "The smallest number is : $n3"
fi
