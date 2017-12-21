#!/usr/bin/env bash

export TARGET_JAR="`dirname $0`/ub-tech-rss/ub-tech-rss-app/target/ub-tech-rss-app-1.0-SNAPSHOT.jar"
cd `dirname $0`/ub-tech-rss-app;mvn clean package
cd `dirname $0`/ub-tech-rss-e2e;mvn clean test