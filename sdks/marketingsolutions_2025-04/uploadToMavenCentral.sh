#!/bin/bash

set -e

## See https://central.sonatype.org/publish/generate-portal-token/ to generate it
#if [[ -z "$SONATYPE_USERNAME" ]]; then
#  echo error: empty SONATYPE_USERNAME
#  exit 1
#fi
## See https://central.sonatype.org/publish/generate-portal-token/ to generate it
#if [[ -z "$SONATYPE_PASSWORD" ]]; then
#  echo error: empty SONATYPE_PASSWORD
#  exit 1
#fi

VERSION="2024.07.0.250919"

gradle clean build publishMavenJavaPublicationToMavenLocal

# TODO: find out whether we need to do something to sign the artifacts
