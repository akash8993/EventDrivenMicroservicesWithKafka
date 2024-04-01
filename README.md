
go til kafka folder then :-  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
it will start the kafka zookeeper

For Kafka Server(go till kafka folder) :- .\bin\windows\kafka-server-start.bat .\config\server.properties 

For topic(Go till kafka folder) :- .\bin\windows\kafka-topics.bat --create --topic topic-example --bootstrap-server localhost:9092

Write some commands in topic:-
.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

For reading events
.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
