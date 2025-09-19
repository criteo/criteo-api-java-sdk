#!/bin/bash

set -e

# See https://central.sonatype.org/publish/generate-portal-token/ to generate it
if [[ -z "$USER_NAME" ]]; then
  echo error: empty USER_NAME
  exit 1
fi
# See https://central.sonatype.org/publish/generate-portal-token/ to generate it
if [[ -z "$PASSWORD" ]]; then
  echo error: empty PASSWORD
  exit 1
fi

VERSION="2024.07.0.250919"

gradle clean build publishMavenJavaPublicationToMavenLocal

# TODO: find out whether we need to do something to sign the artifacts
