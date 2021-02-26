import de.richargh.sandbox.karate.javalin.Deps

plugins {
    kotlin("jvm")
    id("java")

    id("java-test-fixtures")
}


dependencies {
    /** Language dependencies **/
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /** Main dependencies **/
    implementation("io.javalin:javalin:${Deps.Javalin.version}")
    implementation("com.fasterxml.jackson.core:jackson-core:${Deps.Jackson.version}")
    implementation("com.fasterxml.jackson.core:jackson-databind:${Deps.Jackson.version}")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:${Deps.Jackson.version}")
    implementation("gg.jte:jte:${Deps.Jte.version}")
    implementation("org.slf4j:slf4j-simple:${Deps.Slf4j.version}")

    /** Test dependencies **/
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${Deps.Junit.version}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Deps.Junit.version}")
    testImplementation("org.assertj:assertj-core:${Deps.AssertJ.version}")
    testImplementation("com.intuit.karate:karate-junit5:${Deps.Karate.version}")
    testImplementation("com.intuit.karate:karate-apache:${Deps.Karate.version}")

    /** Test fixtures **/
    testFixturesApi("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
    testFixturesApi("org.junit.jupiter:junit-jupiter-params:${Deps.Junit.version}")
}

sourceSets {
    test {
        resources {
            srcDir(file("src/test/kotlin"))
            exclude("**/*.kt")
        }
    }
}