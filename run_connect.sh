#!/bin/bash

cd "$(dirname "$0")"

docker-compose exec connect bash -c 'curl -i -X POST -H "Accept:application/json" \
        -H  "Content-Type:application/json" http://localhost:8083/connectors/ \
        -d @/connect/postgres-source.json'
