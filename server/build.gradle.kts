plugins {
    java
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("com.linecorp.armeria:armeria-bom:1.31.3"))
    implementation("com.linecorp.armeria:armeria")
    implementation("com.linecorp.armeria:armeria-logback")

    runtimeOnly("ch.qos.logback:logback-classic:1.5.17")
    runtimeOnly("org.slf4j:log4j-over-slf4j:2.0.16")
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-parameters")
}

tasks.register<JavaExec>("start") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.gradle.develocity.assignment.MyServer")
}
