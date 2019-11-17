plugins {
    java
    id("com.github.johnrengelman.shadow") version ("5.2.0")
}

group = "com.neelkamath.euphonia"

repositories { mavenCentral() }

dependencies {
    val retrofitVersion = "2.6.2"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
}

configure<JavaPluginConvention> { sourceCompatibility = JavaVersion.VERSION_1_8 }