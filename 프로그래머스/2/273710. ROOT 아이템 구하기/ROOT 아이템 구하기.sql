-- parent_item_id 가 NULL 인 아이템 찾기
SELECT I.ITEM_ID, I.ITEM_NAME FROM ITEM_INFO I
JOIN ITEM_TREE F ON I.ITEM_ID = F.ITEM_ID
WHERE F.PARENT_ITEM_ID IS NULL
GROUP BY I.ITEM_ID
ORDER BY 1;