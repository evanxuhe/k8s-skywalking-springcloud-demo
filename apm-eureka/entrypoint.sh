#!/bin/sh
echo Launch
exec java -Djava.security.egd=file:/dev/./urandom  -jar "${HOME}/app.jar" "$@"