#!/bin/bash

echo "./gradlew clean deployToPluginsFolder"
./gradlew clean deployToPluginsFolder

# if exit code is 0, restart Tomcat service
if [ $? == 0 ]; then
    echo "service tomcat7 restart"
    service tomcat7 restart
    exit 0
else
    echo "Gradle task didn't finish properly..."
    exit 1
fi
