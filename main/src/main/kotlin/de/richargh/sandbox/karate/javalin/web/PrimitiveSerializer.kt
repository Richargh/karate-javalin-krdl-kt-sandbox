package de.richargh.sandbox.karate.javalin.web

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import de.richargh.sandbox.karate.javalin.domain.Primitive
import java.io.IOException

class PrimitiveSerializer constructor(t: Class<Primitive<*>>? = null):
        StdSerializer<Primitive<*>>(t) {

    @Throws(IOException::class, JsonProcessingException::class)
    override fun serialize(value: Primitive<*>,
                           jgen: JsonGenerator,
                           provider: SerializerProvider) {
        jgen.writeString(value.rawValue.toString())
    }
}