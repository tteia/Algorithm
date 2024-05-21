SELECT CAST(date_format(datetime, '%H') as unsigned) as HOUR, COUNT(*) FROM animal_outs WHERE DATE_FORMAT(datetime, '%H:%i')
between '09:00' and '19:59' GROUP BY HOUR ORDER BY HOUR;