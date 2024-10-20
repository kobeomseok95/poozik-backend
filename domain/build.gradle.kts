dependencies {
    implementation("org.springframework:spring-context")
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
