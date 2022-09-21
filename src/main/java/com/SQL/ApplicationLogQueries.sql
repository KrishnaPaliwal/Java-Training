create database log;
USE log;
CREATE TABLE `applicationlogs` (
  `USER_ID` varchar(20) NOT NULL,
  `DATED` date NOT NULL,
  `LOGGER` varchar(50) NOT NULL,
  `LEVEL` varchar(10) NOT NULL,
  `MESSAGE` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM log.applicationlogs;
 