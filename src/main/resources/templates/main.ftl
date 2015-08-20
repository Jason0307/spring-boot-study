<#import "layout/layout.ftl" as layout> 
<@layout.main>
<div class="htmleaf-container">
    <section class="container">
        <div class="row active-with-click">
            <#list users as user>
            <div class="col-md-4 col-sm-6 col-xs-12">
                <article class="material-card ${user.introduceBgColor} mc-active">
                    <h2>
                        <span>${user.nickname}</span>
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
</@layout.main>