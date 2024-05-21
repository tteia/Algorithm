
SELECT o.ANIMAL_ID, o.NAME FROM animal_outs o LEFT JOIN animal_ins i ON o.animal_id = i.animal_id WHERE i.animal_id is null ORDER BY o.animal_id;