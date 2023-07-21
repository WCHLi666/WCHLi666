INSERT INTO `goods` (id, goods_name, price)
VALUES(20, '苹果手机', 3000);
SELECT * FROM goods;
CREATE TABLE `goods2` (
id INT ,
goods_name VARCHAR(10), -- 长度 10
price DOUBLE NOT NULL DEFAULT 100 );
