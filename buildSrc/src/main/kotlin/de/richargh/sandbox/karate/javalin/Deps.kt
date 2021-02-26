package de.richargh.sandbox.karate.javalin

object Deps {

    /** Main dependencies **/
    object Javalin { const val version = "3.13.3" }
    object Jackson { const val version = "2.12.1" }
    object Jte { const val version = "1.7.0" }
    object Slf4j { const val version = "1.7.30" }

    /** Test dependencies **/
    object Junit { const val version = "5.7.1" }
    object AssertJ { const val version = "3.19.0" }
    object Karate { const val version = "0.9.6" }
}