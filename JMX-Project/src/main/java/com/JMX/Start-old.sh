#!/bin/sh

MAIN_CLASS = com.JMX.SimpleAgent
JAVA_OPTS = "-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1617 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"
$JAVA_HOME/bin/java $JAVA_OPTS -cp com.JMX.SimpleAgent