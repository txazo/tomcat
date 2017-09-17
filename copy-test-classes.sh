#!/bin/bash

classPath="webapps/test/WEB-INF/classes/javax/servlet"

rm -f ${classPath}/*.class
cp target/test-classes/javax/servlet/*.class ${classPath}

echo "[Shell] Copy target/test-classes/javax/servlet/*.class to ${classPath}"
echo "[Shell]"
