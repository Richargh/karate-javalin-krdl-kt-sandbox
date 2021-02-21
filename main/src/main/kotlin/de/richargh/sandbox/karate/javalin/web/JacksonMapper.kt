package de.richargh.sandbox.karate.javalin.web

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.richargh.sandbox.karate.javalin.domain.Primitive

fun mapper() = jacksonObjectMapper().apply {
    configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val module = SimpleModule()
    module.addSerializer(Primitive::class.java, PrimitiveSerializer())
    registerModule(module)
    registerModule(KotlinModule())
}