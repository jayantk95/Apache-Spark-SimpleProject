# Apache-Spark-SimpleProject
# This is very basic project which count the number of times the given word exists in the dataset file.
To run it using sbt:
  1. Change directory to SimpleProject
  2. run sbt
  3. compile
  4. run

To it using spark-submit:
  1.Change directory to SimpleProject
  2.run
    YOUR SPARKPATH/bin/spark-submit \
    --class "SimpleProject" \
    --master local[*] \
    target/simpleproject_2.12-0.1.0-SNAPSHOT.jar
