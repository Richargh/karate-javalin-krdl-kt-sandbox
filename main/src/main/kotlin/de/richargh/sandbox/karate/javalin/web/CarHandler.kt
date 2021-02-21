package de.richargh.sandbox.karate.javalin.web

import de.richargh.sandbox.karate.javalin.domain.Model
import de.richargh.sandbox.karate.javalin.domain.Brand
import de.richargh.sandbox.karate.javalin.domain.Car
import de.richargh.sandbox.karate.javalin.domain.CarId
import io.javalin.http.Context

class CarHandler {

    fun all(ctx: Context) {
        println("All")
        listOf(
                Car(CarId("1"), Brand("Cyberdyne"), Model("101")),
                Car(CarId("2"), Brand("Dude"), Model("202")))
                .let(ctx::json)
    }
}