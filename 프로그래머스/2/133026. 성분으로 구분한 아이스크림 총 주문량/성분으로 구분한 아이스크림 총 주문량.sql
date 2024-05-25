
SELECT i.INGREDIENT_TYPE, SUM(h.TOTAL_ORDER) as TOTAL_ORDER
FROM icecream_info i INNER JOIN first_half h ON i.flavor = h.flavor
GROUP BY i.ingredient_type
ORDER BY total_order;