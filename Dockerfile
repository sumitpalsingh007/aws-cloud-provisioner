FROM openjdk:8-jre-alpine

WORKDIR /tmp
COPY target/aws-cloud-provisioner-0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
