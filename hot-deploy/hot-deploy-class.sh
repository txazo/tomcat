#!/bin/bash

rm -f ../webapps/test/WEB-INF/classes/javax/servlet/TestServlet.class
cp class/TestServlet"$1".class ../webapps/test/WEB-INF/classes/javax/servlet/TestServlet.class
