-- 평균 길이가 33 이상인 물고기를 종류별로 분류
SELECT COUNT(*) AS FISH_COUNT, MAX(LENGTH) AS MAX_LENGTH, FISH_TYPE FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING AVG(LENGTH) >= 33
ORDER BY 3;
