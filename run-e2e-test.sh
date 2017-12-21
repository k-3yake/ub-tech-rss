#!/usr/bin/env bash

BASE_DIR=$(cd $(dirname $0); pwd)
export TARGET_JAR="${BASE_DIR}/ub-tech-rss-app/target/ub-tech-rss-app-1.0-SNAPSHOT.jar"
cd ${BASE_DIR}/ub-tech-rss-app;mvn clean package
cd ${BASE_DIR}/ub-tech-rss-e2e;mvn clean test