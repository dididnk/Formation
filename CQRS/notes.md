# Documentation

- CQRS, pour Command Query Responsibility Segregation est une architecture logiciel qui repose sur un principe simple : la séparation, au sein d'une application, des composants de modification et de restitution de l'information sous les termes Command (pour l'écriture) et Query (pour la lecture).

Apache Kafka est un système de streaming open source distribué utilisé pour le traitement des flux, les pipelines de données en temps réel et l'intégration des données à grande échelle.

CQRS separe les web services en deux méthodes différentes (requête pour l'écriture et pour la lecture):

- Command : Create, Update et Delete
- Query : Read

## Prérequis (les outils ou programmes à installer)

- .NET : dotnet --version
- Docker : docker --version
- Docker-compose : dotnet --version

## Commandes de base pour docker

- docker ps : verifier
- docker network create --attachable -d bridge mydockernetwork
- docker network ls

## lancer docker-compose

- cd docker
- docker-compose up -d

## lancer Mongo-Db

- docker run -it -d --name mongo-container -p 27017:27017 --network mydockernetwork --restart always -v mongodb_data_container:/data/db mongo:latest

## lancer MSQL Server

docker run -d --name sql-container --network mydockernetwork --restart always -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=$tr0ngS@P@ssw0rd02' -e 'MSSQL_PID=Express' -p 1433:1433 mcr.microsoft.com/mssql/server:2017-latest-ubuntu
