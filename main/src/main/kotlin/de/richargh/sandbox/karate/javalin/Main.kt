package de.richargh.sandbox.karate.javalin

import de.richargh.sandbox.karate.javalin.web.Server

fun main(){
    val server = Server(3001)
    server.start()
}