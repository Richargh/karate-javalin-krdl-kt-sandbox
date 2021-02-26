@import de.richargh.sandbox.karate.javalin.web.Path
@param String name

<html>
<head></head>
<body>
    <h1>More Kebab</h1>
    <p>Hello ${name}!</p>
    <a href="${Path.Kebab.INSTANCE.getIndex()}" id="less">Less Kebab</a>
</body>
</html>