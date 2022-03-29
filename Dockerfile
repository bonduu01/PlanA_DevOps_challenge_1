#Build environment
FROM maven:3.6.3-openjdk-11-slim AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn -B -f ./pom.xml clean package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
#Production packaging
FROM openjdk:8-jre-alpine

MAINTAINER Peter Molokwu bonduu01@gmail.com
ARG DEPENDENCY=target/dependency
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/Spring-boot-Peter-1.0.0.jar /app/Spring-bo                       ot-Peter-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Spring-boot-Peter-1.0.0.jar"]
