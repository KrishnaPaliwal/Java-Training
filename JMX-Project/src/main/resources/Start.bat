@echo off

set JAVA_OPTS=-server
set JAVA_OPTS=%JAVA_OPTS% -Xms512m -Xmx512m
set JAVA_OPTS=%JAVA_OPTS% -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1630 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false
set CLASS_PATH=JavaTraining\JMX-Project\target
set MAIN_JAR=JMX-Project-0.0.1-SNAPSHOT.jar
set RUNNING_FROM=%~dp0
echo script location %RUNNING_FROM%
pushd %RUNNING_FROM%
cd ../
echo running from %CD%
set CMD=java -jar %JAVA_OPTS% %MAIN_JAR%