<#macro main>
<#assign ctx=request.getContextPath()>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>终有一天，你会觉得你的孤独虽败犹荣</title>
    <link rel="icon" type="image/png" href="/images/favicon.ico">
    <link rel="stylesheet" href="${ctx}/css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${ctx}/css/material-cards.css">
    <link rel="stylesheet" href="${ctx}/css/main.css">
</head>
<body>
    <header class="header">
        <div class="wrap header-inner clearfix">
            <h1 class="logo"><a href="/hc/" title="单身会所"><img class="logo-icon" src="${ctx}/images/single.jpg" alt=""></a></h1>
            <nav class="header-nav">
                <div class="user-nav clearfix">
                    <div class="user-info dropdown">
                        <div class="dropdown-toggle">
                            <#if user??>
                                <img class="user-info-avatar" src="${ctx}/images/end_user.jpg" />
                                <span class="user-info-name">${user.nickname}</span>
                            <#else>
                                <span class="user-info-name">
                                    <a href="${ctx}/user/login" class="login" role="button">登录</a>
                                </span>
                            </#if>
                        </div>
                        <#if user??>
                        <div class="dropdown-panel">
                            <ul class="user-info-menu">
                                <li>
                                    <a href="/hc/message/index/">我的消息</a>
                                </li>
                                <li class="my-activities">
                                    <a href="/hc/request/listview/">我的活动</a>
                                </li>
                                <li>
                                    <a href="${ctx}/user/logout">退出</a>
                                </li>
                            </ul>
                        </div>
                        </#if>
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
 <#nested>
<script src="${ctx}/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery.material-cards.min.js"></script>
<script src="${ctx}/js/jquery.tool.js"></script>
</body>
</html>
</#macro>