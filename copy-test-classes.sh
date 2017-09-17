#!/bin/bash

sourcePath="target/test-classes/javax/servlet"
destPath="webapps/test/WEB-INF/classes/javax/servlet"

rm -f ${destPath}/*.class
cp ${sourcePath}/*.class ${destPath}

echo "[Shell] Copy ${sourcePath}/*.class to ${destPath}"
