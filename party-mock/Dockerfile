FROM openjdk
ARG jar
VOLUME /tmp
ADD $jar partysvc.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /partysvc.jar" ]

