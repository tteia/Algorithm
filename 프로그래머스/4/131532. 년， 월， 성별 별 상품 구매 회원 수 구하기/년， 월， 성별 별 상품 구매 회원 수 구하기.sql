SELECT 
    EXTRACT(YEAR FROM S.SALES_DATE) AS YEAR,
    EXTRACT(MONTH FROM S.SALES_DATE) AS MONTH,
    U.GENDER,
    COUNT(DISTINCT S.USER_ID) AS USERS
FROM USER_INFO U
JOIN ONLINE_SALE S ON U.USER_ID = S.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY EXTRACT(YEAR FROM S.SALES_DATE), EXTRACT(MONTH FROM S.SALES_DATE), U.GENDER
ORDER BY YEAR, MONTH, GENDER;
