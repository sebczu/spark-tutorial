# spark-tutorial
mvn clean package
docker build -t spark-tutorial:0.0.1 service/
bash spark-submit --class com.sebczu.spark.tutorial.Main ../jobs/job1.jar


master:
http://localhost:8080
history
http://localhost:18080