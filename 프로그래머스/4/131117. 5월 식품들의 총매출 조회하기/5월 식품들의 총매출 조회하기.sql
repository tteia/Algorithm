-- 생산일자가 2022년 5월인 식품
-- 총매출 내림차순, 식품 아이디 오름차순

SELECT PRODUCT_ID, PRODUCT_NAME, SUM(PRICE * AMOUNT) AS TOTAL_SALES FROM FOOD_PRODUCT
JOIN FOOD_ORDER USING(PRODUCT_ID)
WHERE TO_CHAR(PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY PRODUCT_ID, PRODUCT_NAME
ORDER BY 3 DESC, 1;