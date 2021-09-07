## Create mongoDB for development purpose

docker run -p27017:27017 --name my-mongodb-container -d mongo:latest
docker run -it --rm mongo mongo --host host.docker.internal

## docker for AMQ
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq
## http://localhost:8161/admin admin admin

##Rabbit MQ https://www.architect.io/blog/rabbitmq-docker-tutorial
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3-management
## http://localhost:15672/#/ guest guest

## MYSQL https://severalnines.com/database-blog/mysql-docker-containers-understanding-basics

## KAFKA https://docs.confluent.io/platform/current/quickstart/ce-docker-quickstart.html

## Postgresql https://hub.docker.com/r/centos/postgresql/

## Cassandra https://hub.docker.com/_/cassandra

