-- 입양 간 동물 중 보호 기간이 가장 긴 동물 두 마리

SELECT I.ANIMAL_ID, I.NAME FROM ANIMAL_INS I
INNER JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY O.DATETIME - I.DATETIME DESC
LIMIT 2;
