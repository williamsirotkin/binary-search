javac -d bin src/BinarySearch.java
javac -d bin -cp bin src/Tester.java
java -cp bin Tester $1 $2