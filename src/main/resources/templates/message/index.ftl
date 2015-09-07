<#import "../layout/layout.ftl" as layout> 
<#assign ctx=request.getContextPath()>
<@layout.main>
<main>
    <section class="content">
        <div class="wrap user-center clearfix">
            <nav class="sub-nav">
                <ul class="breadcrumbs">
                    <li><a href="/hc/">首页</a></li>
                    <li>个人中心</li>
                </ul>
            </nav>
            <section class="user-center-main">
                <h2>我的消息<span>(${messages?size})</span></h2>
                <ul class="user-center-msg-list">
                <#list messages as message>
                    <li>
                        <div class="user">
                            <img alt="神乐" src="${request.getContextPath()}/images/user/shenle.jpeg">
                        </div>
                        <div class="body">
                            <div class="name">
                                <a href="#">${message.fromUsername}</a>
                            </div>
                            <div class="time">
                                <i class="ace-icon fa fa-clock-o"></i> <span class="green">${message.dateCreated}</span>
                            </div>
                            <div class="text">
                                <i class="ace-icon fa fa-quote-left"></i> ${message.content}
                            </div>
                        </div>
                    </li>
                </#list>
                </ul>
            </section>
            <section class="user-center-sidebar">
                <nav class="user-center-nav js-scroll-fixed" style="z-index: 1000;">
                    <ul>
                        <li class="active"><a href="/hc/message/">我的消息 </a></li>
                        <li><a href="/hc/request/listview/">我的提问</a></li>
                        <li><a href="/hc/publish/articlecomment/">我的发表</a></li>
                        <li><a href="/hc/subscription/">我的关注</a></li>
                        <li><a href="/hc/userinfo/">我的资料</a></li>
                    </ul>
                </nav>
             </section>
         </div>
    </section>
</main>
</@layout.main>
