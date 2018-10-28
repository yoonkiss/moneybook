
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (1, '통신요금', '통신요금', 1, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (2, '세금 및 이자', '', 2, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (3, '주거/통신', '', 3, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (4, '장기저축', '', 4, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (5, '단기저축', '', 5, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (7, '보험', '', 6, 0);

INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (6, '식비', '', 6, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (601, '주식', '', 1, 6);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (602, '외식', '', 1, 6);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (603, '커피/음료', '', 1, 6);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (604, '술/유흥', '', 1, 6);

INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (8, '의복/미용', '', 8, 0);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (801, '의류비', '', 1, 8);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (802, '패션잡화', '', 1, 8);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (803, '헤어/뷰티', '', 1, 8);
INSERT INTO common_code (id, name, description, sorting, parent_id) VALUES (804, '세탁수선', '', 1, 8);

--
INSERT INTO creadit_card (id, user_id, name, started_at, end_at, billing_at) VALUES (1, 'yoonki', 'Samsung', '^1', '^31', '13');
INSERT INTO creadit_card (id, user_id, name, started_at, end_at, billing_at) VALUES (2, 'yoonki', 'Hana Mile', '^1', '^31', '13');
INSERT INTO creadit_card (id, user_id, name, started_at, end_at, billing_at) VALUES (3, 'yoonki', 'Hana U+', '^1', '^31', '13');
INSERT INTO creadit_card (id, user_id, name, started_at, end_at, billing_at) VALUES (4, 'yoonki', 'Lotte', '^1', '^31', '14');
INSERT INTO creadit_card (id, user_id, name, started_at, end_at, billing_at) VALUES (5, 'yoonki', 'Woori', '^8', '7', '21');



---- INSERT INTO public.records (id, amount, billing_type, category_id, comments, created_at, description, divided, record_at, user_id, card_id) VALUES (1, 6200, 1, 601, '..', '2018-10-23 18:09:53.225', 'sdsd', 1, '2018-10-21', 'yoonki', 1);
