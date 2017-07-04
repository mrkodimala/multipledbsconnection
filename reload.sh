#!/usr/bin/env bash
rm -rvf ~/Documents/tomcat/webapps/multipledbs
ps -aef | grep cata | grep -v grep | awk '{print $2}' | xargs kill -9
cp target/multipledbs.war  ~/Documents/tomcat/webapps/multipledbs.war
~/Documents/tomcat/bin/catalina.sh jpda start
