FROM bitnami/spark:3.1.2

RUN mkdir /tmp/spark-events

COPY /scripts/init.sh /opt/bitnami/spark/init.sh
COPY /scripts/spark.conf /opt/bitnami/spark/conf/spark-defaults.conf
COPY /target/service-0.0.1.jar /opt/bitnami/spark/jobs/job1.jar

WORKDIR /opt/bitnami/spark

ENTRYPOINT ["sh", "init.sh"]