DELETE FROM `platform`.`article`;
DELETE FROM `platform`.`user` WHERE username = 'Jason';
--init the user
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `username`) VALUES (1, 26, 'default_avartar.png', '2015-07-20 15:29:36', 'zrb0307@163.com', 'f7bdc5af0611b089b6ea59abf842388b', 'Jason');
--init the article
INSERT INTO `article` (`content`, `date_created`, `date_updated`, `title`, `user_id`) VALUES ('你不是真正的快乐', '2015-07-21 14:02:32', NULL, '五月天', 1);
