package de.richargh.sandbox.karate.javalin.web

import io.javalin.http.Context

class KebabHandler {
    fun index(ctx: Context) {
        ctx.render("kebab.jte", mapOf(
                "name" to "MegaKebab"))
    }

    fun more(ctx: Context){
        ctx.render("morekebab.jte", mapOf(
                "name" to "SuperKebab"))
    }
}