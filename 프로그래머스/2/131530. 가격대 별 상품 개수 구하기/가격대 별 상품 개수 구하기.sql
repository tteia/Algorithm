-- 만원 단위 별로 상품 개수 출력
SELECT TRUNC(PRICE / 10000) * 10000 AS PRICE_GROUP, COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY TRUNC(PRICE / 10000) * 10000
ORDER BY 1;