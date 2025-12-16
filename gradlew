#!/bin/sh

DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

APP_NAME="Gradle"
APP_BASE_NAME=${0##*/}

APP_HOME=$( cd "${0%/*}" && pwd )

JAVA_HOME=${JAVA_HOME:-$(dirname $(dirname $(readlink -f $(which java))))}

exec "$JAVA_HOME/bin/java" $DEFAULT_JVM_OPTS $JAVA_OPTS -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
