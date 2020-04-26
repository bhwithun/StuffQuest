
INSERT INTO grid(description,uuid)
VALUES ("Feldpost's Inn","aa3fddd0-6b57-4288-be48-1c6ca30e25fe");

INSERT INTO grid(description,uuid)
VALUES ("Beregost","a48a9f74-2303-4f29-b7ab-01e796ae7cf2");

INSERT INTO portal
 ( uuid
 , entrance, entrance_x, entrance_y
 , exit, exit_x, exit_y
 )
VALUES
 ( "138aa139-f94d-4b47-9bbf-9a56e9e0f674"
 , "a48a9f74-2303-4f29-b7ab-01e796ae7cf2"
 , 0.10, 0.45
 , "aa3fddd0-6b57-4288-be48-1c6ca30e25fe"
 , 0.50, 0.00
 );
