plugins {
    id("java")
}

repositories {
    mavenCentral() 
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.apache.tomcat.embed:tomcat-embed-core:8.5.4")
    implementation("org.apache.tomcat.embed:tomcat-embed-core:8.5.4")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
