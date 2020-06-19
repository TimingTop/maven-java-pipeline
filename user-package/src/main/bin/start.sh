#!/usr/bin/env bash

_startdir=`pwd`

## 可以填自己的jdk 环境
JAVA_HOME=${JAVA_HOME:-/opt/jdk}

JAVA_JPDA_DEBUG=${JAVA_JPDA_DEBUG:-false}

BASE_DIR="/opt/timing/app"

if ["${JAVA_JPDA_DEBUG}" = "true"]; then
  JPDA_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,address=8001,server=y,suspend=n"

fi

exec ${JAVA_HOME}/bin/java \
-server \
-cp ${BASE_DIR}/application/*jar \
org.springframework.boot.loader.JarLauncher