SELECT DISTINCT CITY FROM STATION WHERE mod(ID, 2) = 0;

SELECT (count(city) - count(distinct city)) from station
