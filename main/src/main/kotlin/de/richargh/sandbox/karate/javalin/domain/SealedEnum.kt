package de.richargh.sandbox.karate.javalin.domain

abstract class SealedEnum {

    override fun toString() = javaClass.simpleName
}