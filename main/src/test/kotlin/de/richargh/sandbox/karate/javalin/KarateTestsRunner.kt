package de.richargh.sandbox.karate.javalin

import com.intuit.karate.junit5.Karate
import de.richargh.sandbox.karate.javalin.web.Server
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach

internal class KarateTestsRunner {

    @BeforeEach
    fun beforeEach(){
        app.start()
    }

    @AfterEach
    fun afterEach(){
        app.stop()
    }

    @Karate.Test
    fun testAll(): Karate {
        return Karate.run().relativeTo(javaClass)
    }

    companion object {

        private lateinit var app: Server

        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            app = Server(3000)
        }
    }
}