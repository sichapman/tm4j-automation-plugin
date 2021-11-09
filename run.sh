#!/usr/bin/env bash
set -e
/opt/homebrew/bin/atlas-mvn clean
/opt/homebrew/bin/atlas-mvn hpi:run
