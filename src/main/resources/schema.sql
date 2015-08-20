DELETE FROM `platform`.`user_tag`;
DELETE FROM `platform`.`tag`;
DELETE FROM `platform`.`article`;
DELETE FROM `platform`.`user`;


--init the tag
INSERT INTO `platform`.`tag` (`id`, `title`) VALUES (1, '萝莉');
INSERT INTO `platform`.`tag` (`id`, `title`) VALUES (2, '正太');
INSERT INTO `platform`.`tag` (`id`, `title`) VALUES (3, '御姐');
INSERT INTO `platform`.`tag` (`id`, `title`) VALUES (4, '大叔');
INSERT INTO `platform`.`tag` (`id`, `title`) VALUES (5, '女神');

--init the user
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `nickname`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (1, 26, 'yingu.jpeg', '2015-07-20 15:29:36', 'zrb0307@163.com', 'cadcad57624057519301a3ff444ff856', '银古', 'Yingu', '安徽', '每天夜里下定决心从明天开始改变，好好生活努力奋斗，第二天中午在被窝里打了个滚:操，改天吧！', 'MALE', 'SINGLE', 'Red');
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `nickname`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (2, 26, 'yinhun.jpg', '2015-07-20 15:29:36', 'zrb0307@gmail.com', 'd6ee160202f15553420d57a8257e1d0f', '银时', 'Yinshi',  '大阪', '这个人很懒，什么都没有写', 'MALE', 'SINGLE', 'Pink');
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `nickname`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (3, 26, 'shenle.jpeg', '2015-07-20 15:29:36', 'baogee@vip.qq.com', 'bdcd56c7620de50be59128575c21bc4b', '神乐', 'Shenle', '银座', '这个人很懒，什么都没有写', 'FEMALE', 'SINGLE', 'Blue');
--init the article
INSERT INTO `platform`.`article` (`content`, `date_created`, `date_updated`, `title`, `user_id`) VALUES ('你不是真正的快乐', '2015-07-21 14:02:32', NULL, '五月天', 1);

--init user tag
INSERT INTO `platform`.`user_tag` (`tag_id`, `user_id`) VALUES (2, 1);
INSERT INTO `platform`.`user_tag` (`tag_id`, `user_id`) VALUES (4, 2);
INSERT INTO `platform`.`user_tag` (`tag_id`, `user_id`) VALUES (1, 3);
INSERT INTO `platform`.`user_tag` (`tag_id`, `user_id`) VALUES (5, 3);
