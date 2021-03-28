-- H2 connection 
-- url: http://localhost:8002/h2-console
-- memory: jdbc:h2:mem:6a5d1bf9-f10b-4a52-a61a-3d10de555dcc
-- sudo docker run -d -p 1521:1521 -p 81:81 -v /home/leonel/h2:/opt/h2-data -e H2_OPTIONS='-ifNotExists' --name=spring-example oscarfonts/h2

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10002,'EUR','INR',75,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10003,'AUD','INR',25,0);