javac -d bin BruteForceSearch.java
javac -d bin src/FileToStringArray.java
javac -d bin src/BinarySearch.java
javac -d bin -cp bin Tester.java
java -cp bin Tester $1 $2
