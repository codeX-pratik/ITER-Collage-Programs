echo "Enter the cost price of the item : "
read costprice
echo "Enter the selling price of the item : "
read sellingprice
if [ $sellingprice -gt $costprice ]; then
	profit=$((sellingprice - costprice))
	echo "The seller had made a profit of $profit"
elif [ $sellingprice -lt $costprice ]; then
	loss=$((costprice - sellingprice))
	echo "The seller has incurred a loss of $loss"
else
	echo "No profit, no loss. The selling price is equal to the cost price"
fi
