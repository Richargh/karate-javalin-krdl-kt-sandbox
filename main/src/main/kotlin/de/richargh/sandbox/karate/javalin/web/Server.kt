package de.richargh.sandbox.karate.javalin.web

import de.richargh.sandbox.karate.javalin.web.configureJavalin

class Server(
        val port: Int) {

    private val app = configureJavalin()

    fun start() {
        app.start(port)
    }

    fun stop() {
        app.stop()
    }
}