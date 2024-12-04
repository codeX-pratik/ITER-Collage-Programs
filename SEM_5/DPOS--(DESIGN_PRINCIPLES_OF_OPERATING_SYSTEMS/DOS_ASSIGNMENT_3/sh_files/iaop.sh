echo Enter the first number! 
read a
echo Enter the second number! 
read b
echo Sum : `expr $a + $b`
echo Difference : `expr $a - $b`
echo Product : `expr $a \* $b`
echo Quotient : `expr $a / $b`
echo Remainder : `expr $a % $b`
