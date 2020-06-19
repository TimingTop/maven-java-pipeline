FROM openjdk:8

LABEL com.label.name=@docker.image.name@ \
      com.label.build-date=@buildDate@ \
      com.label.vendor='Timing'

WORKDIR /opt/timing/app

RUN groupadd -r appuser && \
    useradd -r -g appuser appuser && \
    echo appuser:appuser | chpasswd

COPY app/ ./
COPY

RUN chmod ug+x ./bin/*.sh \
    && chmod -R 777 ./config \
    && chown -R appuser:appuser .


EXPOSE 8080
USER appuser
ENTRYPOINT ["/opt/timing/app/bin/start.sh"]

