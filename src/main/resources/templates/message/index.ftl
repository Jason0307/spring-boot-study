<#import "../layout/layout.ftl" as layout> 
<#assign ctx=request.getContextPath()>
<@layout.main>
<main>
    <section class="content">
        <div class="wrap user-center clearfix">
            <nav class="sub-nav">
                <ul class="breadcrumbs">
                    <li><a href="${ctx}/main">首页</a></li>
                    <li>个人中心</li>
                </ul>            
            </nav>
            <section class="user-center-main">
                <h2>我的消息<span>(2)</span></h2>
                <ul class="user-center-msg-list">
                    <li>您关注的文档 <a href="/hc/kb/article/4454/">《红杏服务大规模故障》</a> 已经更新了 <time>（2015-08-23 20:19）</time></li>
                    <li>
                        <span class="author">htmlgit</span> 在您关注的文档 <a href="/hc/kb/article/4454/">《红杏服务大规模故障》</a> 发表了新的回复 <time>（2015-08-23 10:56）</time>
                    </li>
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