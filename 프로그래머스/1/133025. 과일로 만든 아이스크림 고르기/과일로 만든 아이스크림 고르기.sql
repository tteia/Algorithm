
SELECT i.flavor FROM icecream_info i INNER JOIN first_half f ON i.flavor = f.flavor WHERE f.total_order >= 3000 AND i.ingredient_type LIKE "fr%";