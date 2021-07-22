DROP TABLE IF EXISTS Travellers;
DROP TABLE IF EXISTS Orders;
CREATE TABLE Travellers(travellerid INT,flightid INT, numberoftravellers INT, travellername VARCHAR(200));

INSERT INTO Travellers(travellerid,flightid,numberoftravellers,travellername)
VALUES(10001,20001,4,'person1');


CREATE TABLE IF NOT EXISTS  Cart ( flightid INT, cartid INT, airwaysname VARCHAR(200), source VARCHAR(200),destination VARCHAR(200),seats INT); 

INSERT INTO Cart( flightid, cartid, airwaysname, source,destination ,seats )
VALUES(1,2,'SAS','Chennai','Dubai',5);

CREATE TABLE IF NOT EXISTS FLIGHTS(flightid INT, Airwaysname VARCHAR(200),destination VARCHAR(200),seats INT,source VARCHAR(200));

INSERT INTO FLIGHTS (flightid,Airwaysname,destination,seats,source)
VALUES
(1,'Indian Airways','US',150,'Chennai'),
(2,'IndiGo','UK',180,'Mumbai');


CREATE TABLE Orders(orderid INT,flightid INT,travellerid INT,Airwaysname VARCHAR(200),cartid INT,numberoftravellers INT, travellername VARCHAR(200),source VARCHAR(200),destination VARCHAR(200));
INSERT INTO Orders(orderid,flightid,travellerid,Airwaysname,cartid,numberoftravellers,travellername,source,destination)
VALUES(1,20001,101,'sas',2,4,'person1','dubai','chennai');