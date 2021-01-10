# springboot-prometheus-grafana-docker

### Monitoring SpringBoot with Prometheus and grafana in Docker

_Navigate to spring-boot-with-docker and run below commands_

docker build -t docker .

docker container run -p 8082:8082 -d docker



_Navigate to my_prometheus and run below commands_

docker build -t my_prometheus .

docker run -p 9090:9090 my_prometheus




_Navigate to my_grafana and run below commands_

docker build -t my_grafana .

docker run -p 3000:3000 my_grafana
