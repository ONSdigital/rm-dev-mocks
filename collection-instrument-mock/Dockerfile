FROM openjdk
ARG jar
VOLUME /tmp
ADD $jar collectioninstrumentsvc.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /collectioninstrumentsvc.jar" ]

