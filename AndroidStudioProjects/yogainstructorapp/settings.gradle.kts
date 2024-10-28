pluginManagement {
    repositories {
        google() // Add Google repository here
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositories {
        google() // Ensure this is here
        mavenCentral()
    }
}

rootProject.name = "YogaInstructorApp"
include(":app")