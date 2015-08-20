<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>终有一天，你会觉得你的孤独虽败犹荣</title>
    <link rel="icon" type="image/png" href="/images/favicon.ico">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/material-cards.css">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
    <header class="header">
        <div class="wrap header-inner clearfix">
            <h1 class="logo"><a href="/hc/" title="单身会所"><img class="logo-icon" src="images/single.jpg" alt=""></a></h1>
            <nav class="header-nav">
                <div class="user-nav clearfix">
                    <div class="user-info dropdown">
                        <div class="dropdown-toggle">
                            <img class="user-info-avatar" src="images/end_user.jpg" />
                            <span class="user-info-name">baogee</span>
                        </div>
                        <div class="dropdown-panel">
                            <ul class="user-info-menu">
                                <li>
                                    <a href="/hc/message/index/">我的消息</a>
                                </li>
                                <li class="my-activities">
                                    <a href="/hc/request/listview/">我的活动</a>
                                </li>
                                <li>
                                    <a href="/user/logout/">退出</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="language-selector dropdown">
                        <div class="dropdown-toggle">
                            <span id="user-name">简体中文</span>
                        </div>
                        <div class="dropdown-panel">
                            <ul id="user-menu" class="language-selector-memu">
                                <li><a class="language-cn" href="javascript:void(0);" onclick="set_language('zh_cn')">简体中文</a></li>
                                <li><a class="language-en" href="javascript:void(0);" onclick="set_language('en')">English</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </header>
    <div class="htmleaf-container">
        <section class="container">
            <div class="row active-with-click">
            <#list users as user>
                <div class="col-md-4 col-sm-6 col-xs-12">
                    <article class="material-card ${user.introduceBgColor}">
                        <h2>
                            <span>${user.username}</span>
                            <strong>
                                <i class="fa fa-fw fa-star"></i>
                                ${user.address} / ${user.age} / 
                                 <#if user.gender == 'MALE'>
                                     <i class="fa fa-mars"></i>
                                 <#else>
                                     <i class="fa fa-venus"></i>
                                </#if>
                                
                            </strong>
                        </h2>
                        <div class="mc-content">
                            <div class="img-container">
                                <img class="img-responsive" src="images/user/${user.avatar}">
                            </div>
                            <div class="mc-description">
                                ${user.introduce}
                            </div>
                        </div>
                        <a class="mc-btn-action">
                            <i class="fa fa-bars"></i>
                        </a>
                        <div class="mc-footer">
                            <h4>
                            <#list user.tags as tag>
                                <a class="user-tag">${tag.title}</a>
                            </#list>
                            </h4>
                            <a class="fa fa-fw fa-user" title="信息"></a>
                            <a class="fa fa-fw fa-qq" title="QQ"></a>
                            <a class="fa fa-fw fa-comment" title="留言"></a>
                            <a class="fa fa-fw fa-weixin" title="微信"></a>
                        </div>
                        <div class="qutton-dialog">
                            <textarea name="comment" id="comment-input" placeholder="留言..."></textarea>
                            <div class="submit-comment">发送</div>
                        </div>
                    </article>
                </div>
            </#list>
            </div>
        </section>
    </div>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.material-cards.min.js"></script>
    <script src="js/jquery.tool.js"></script>
    <script>
        $(function () {
            $('.material-card').materialCard({
                icon_close: 'fa-chevron-left',
                icon_open: 'fa-info-circle',
                icon_spin: 'fa-spin-fast',
                card_activator: 'click'
            });

            $('.material-card').on('shown.material-card show.material-card hide.material-card hidden.material-card', function (event) {
                console.log(event.type, event.namespace, $(this));
            });

        });
    </script>
</body>
</html>