package de.richargh.sandbox.karate.javalin.web

import io.javalin.Javalin
import io.javalin.plugin.json.JavalinJackson

fun configureJavalin(): Javalin {
    JavalinJackson.configure(mapper())

    val app = Javalin.create { }

    app.addRoutes()

    return app
}