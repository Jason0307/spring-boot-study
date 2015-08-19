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
    <div class="htmleaf-container">
        <br>
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
                            <a class="fa fa-fw fa-user"></a>
                            <a class="fa fa-fw fa-qq"></a>
                            <a class="fa fa-fw fa-comment"></a>
                            <a class="fa fa-fw fa-weixin"></a>
                        </div>
                    </article>
                </div>
            </#list>
            </div>
        </section>
    </div>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.material-cards.min.js"></script>
    <script>
        $(function () {
            $('.material-card').materialCard({
                icon_close: 'fa-chevron-left',
                icon_open: 'fa-thumbs-o-up',
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