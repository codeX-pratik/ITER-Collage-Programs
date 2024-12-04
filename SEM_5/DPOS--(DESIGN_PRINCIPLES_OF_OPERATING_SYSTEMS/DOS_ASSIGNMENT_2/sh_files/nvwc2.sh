echo "File Name : $1"
echo "Line Count : $(wc -l < $1)"
echo "Word Count : $(wc -w < $1)"
echo "Char Count : $(wc -c < $1)"
