echo "What is your age?"
read age
allowed=21
if [$age >= 21]
then
	echo "You are allowed to vote"
else
	waiting=`expr $allowed - $age`
	echo "You have to wait "
	echo "$waiting"
	echo "years!"
fi
