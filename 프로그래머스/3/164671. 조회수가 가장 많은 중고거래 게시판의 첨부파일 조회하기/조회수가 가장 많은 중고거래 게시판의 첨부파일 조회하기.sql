-- 조회수가 가장 높은 중고거래 게시물에 대한 첨부 파일 경로 확인
-- 파일 ID 기준 내림차순 정렬
SELECT '/home/grep/src/' || BOARD_ID || '/' || FILE_ID || FILE_NAME || FILE_EXT AS FILE_PATH
FROM USED_GOODS_FILE
WHERE BOARD_ID IN (SELECT BOARD_ID FROM USED_GOODS_BOARD
                  ORDER BY VIEWS DESC
                  FETCH FIRST 1 ROWS ONLY)
ORDER BY FILE_ID DESC;
