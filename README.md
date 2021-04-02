# Rabbit MQ install: 
- sudo docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
- 

# run Zipkin:
- curl -sSL https://zipkin.io/quickstart.sh | bash -s
- java -jar zipkin.jar
- set rabbit URI: java -jar zipkin.jar RABBIT_URI=amqp://localhost 
