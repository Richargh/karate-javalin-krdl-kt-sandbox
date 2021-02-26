@import de.richargh.sandbox.karate.javalin.web.Path
@param String name

<html>
<head></head>
<body>
    <h1>Kebab</h1>
    <p>Hello ${name}!</p>
    <a href="${Path.Kebab.INSTANCE.getMore()}" id="more">More Kebab</a>
</body>
</html>