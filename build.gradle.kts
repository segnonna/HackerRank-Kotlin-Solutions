plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    mavenCentral()
}

dependencies {
    // for writing tests "testCompile" would suffice, but extensions are
    // defined in the project's "main.hos.houns.main" folder, so we need "compile"
    /*implementation ("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testImplementation ("org.junit.jupiter:junit-jupiter-params:5.6.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.6.2")*/

    testImplementation ("junit:junit:4.12")
    /*testImplementation ("org.junit.jupiter:junit-jupiter-migrationsupport:5.6.2")
    testRuntimeOnly ("org.junit.vintage:junit-vintage-engine:5.6.2")

    testImplementation("org.assertj:assertj-core:3.10.0")
    testImplementation("org.mockito:mockito-core:2.19.1")
    testImplementation("org.junit-pioneer:junit-pioneer:0.1.2")
    testImplementation("org.mockito:mockito-junit-jupiter:2.19.1")*/
}

/*test {
    useJUnitPlatform {
       // excludeTags 'database'
    }
//    systemProperties = [
//            'junit.jupiter.conditions.deactivate': '*'
//    ]
    testLogging {
        //events "passed", "skipped", "failed"
    }
}*/