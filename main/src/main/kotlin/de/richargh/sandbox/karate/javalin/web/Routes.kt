package de.richargh.sandbox.karate.javalin.web

import io.javalin.Javalin

fun Javalin.addRoutes() {
    val homeHandler = HomeHandler()
    val carHandler = CarHandler()
    val kebabHandler = KebabHandler()

    get(Path.Home.index, homeHandler::index)
    get(Path.Car.all, carHandler::all)
    get(Path.Kebab.index, kebabHandler::index)
    get(Path.Kebab.more, kebabHandler::more)
}