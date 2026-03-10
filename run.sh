rm -rf out
mkdir out
javac -d out src/app/*.java src/model/*.java 
java -cp out app.Main
