<#import "layout/layout.ftl" as layout> 
<@layout.main>
<div class="wrapper">
    <div class="login-container">
        <h1>Welcome</h1>
        <form class="form" action="${request.getContextPath()}/user/login" method="POST">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <button type="submit" id="login-button">Login</button>
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