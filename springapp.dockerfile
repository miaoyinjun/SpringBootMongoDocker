FROM registry.cn-hangzhou.aliyuncs.com/jimmy_miao/spring_boot_mongodb

#ENV appName SpringBootMongoDocker-1.0-SNAPSHOT.jar

#ADD target/SpringBootMongoDocker-1.0-SNAPSHOT.jar /opt/spring-boot-maven-docker/

EXPOSE 8080 5005

#WORKDIR /opt/spring-boot-maven-docker/

CMD ["java", "-jar", "SpringBootMongoDocker-1.0-SNAPSHOT.jar"]
