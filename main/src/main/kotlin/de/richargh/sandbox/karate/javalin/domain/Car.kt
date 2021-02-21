package de.richargh.sandbox.karate.javalin.domain

class Car(
        override val id: CarId,
        val brand: Brand,
        val model: Model): Entity<CarId>