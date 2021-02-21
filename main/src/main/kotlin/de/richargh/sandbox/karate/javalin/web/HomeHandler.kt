package de.richargh.sandbox.karate.javalin.web

import io.javalin.http.Context

class HomeHandler {

    fun index(ctx: Context) {
        """
            <!DOCTYPE html>
            <html>
            <head>
            </head>
            <body>
            <h1>Home</h1>
            </body>
            </html>
        """.trimIndent().let(ctx::html)
    }
}
