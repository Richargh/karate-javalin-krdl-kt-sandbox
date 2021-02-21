package de.richargh.sandbox.karate.javalin.domain

interface Entity<T: Identifier<*>> {
    val id: T
}