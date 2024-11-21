#!/bin/bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
JAVA_MEM_OPTS=" -Xmx2560m "
nohup java $JAVA_MEM_OPTS -jar BeiDou.jar >/dev/null 2>&1 &
echo $!
