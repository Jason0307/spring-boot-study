<#import "layout/layout.ftl" as layout> 
<@layout.main>
<div class="wrapper">
    <div class="login-container">
        <h1>欢迎来到单身狗协会</h1>
        <form class="form" action="${request.getContextPath()}/user/login" method="POST">
        <input type="text" name="username" placeholder="名前">
        <input type="password" name="password" placeholder="密文">
        <button type="submit" id="login-button">登录</button>
        </form>
    </div>
    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
</div>
</@layout.main>