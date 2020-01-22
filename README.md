# kafka-connect-postgres

Single-broker Kafka cluster with ability to fetch pg logs. (database connection config - `connect/postgres-source.json`).

`scala_test` contains simple consumer and producer. (scala)

Run:
1. docker-compose up -d - to run kafka cluster
2. sh run_connect.sh - to start streaming from the database.
