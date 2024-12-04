echo "Enter Ramesh's basic salary! "
read basic_salary
dearness=$(echo "$basic_salary * 0.40" | bc)
house_rent=$(echo "$basic_salary * 0.20" | bc)
gross_salary=$(echo "$basic_salary + $dearness + $house_rent" | bc)
echo "Gross Salary : $gross_salary"
