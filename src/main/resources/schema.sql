DELETE FROM `platform`.`article`;
DELETE FROM `platform`.`user` WHERE user_id in (1, 2, 3);
--init the user
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (1, 26, 'yingu.jpeg', '2015-07-20 15:29:36', 'zrb0307@163.com', 'f7bdc5af0611b089b6ea59abf842388b', '银古', '安徽', '每天夜里下定决心从明天开始改变，好好生活努力奋斗，第二天中午在被窝里打了个滚:操，改天吧！', 'MALE', 'SINGLE', 'Red');
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (2, 26, 'yinhun.jpg', '2015-07-20 15:29:36', 'zrb0307@gmail.com', 'f7bdc5af0611b089b6ea59abf842388b', '银时', '大阪', '这个人很懒，什么都没有写', 'MALE', 'SINGLE', 'Pink');
INSERT INTO `platform`.`user` (`user_id`, `age`, `avatar`, `date_created`, `email_address`, `password`, `username`, `address`, `introduce`, `gender`, `status`, `introduce_bg_color`) VALUES (3, 26, 'shenle.jpeg', '2015-07-20 15:29:36', 'baogee@vip.qq.com', 'f7bdc5af0611b089b6ea59abf842388b', '神乐', '银座', '这个人很懒，什么都没有写', 'FEMALE', 'SINGLE', 'Blue');
--init the article
INSERT INTO `article` (`content`, `date_created`, `date_updated`, `title`, `user_id`) VALUES ('你不是真正的快乐', '2015-07-21 14:02:32', NULL, '五月天', 1);
