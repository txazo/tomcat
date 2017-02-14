#!/bin/bash

function stop() {
    pid='0'`ps -ef | grep tomcat | grep org.apache.catalina.startup.Bootstrap | awk '{print $2}'`
    [ $pid -ne 0 ] && kill -9 $pid
}

function start() {
    ./bin/startup.sh
}

stop
start
