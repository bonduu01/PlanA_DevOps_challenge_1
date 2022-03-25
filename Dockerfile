FROM maven:3.5-jdk-8-alpine as build
RUN useradd -u 1005 peter
USER peter

WORKDIR /app
COPY . ./

RUN mvn clean install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/Spring-boot-Peter-1.0.0.jar /app
CMD ["java -jar Spring-boot-Peter-1.0.0.jar"]
