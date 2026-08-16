pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KotlinGraphicsProject8"
include(":app")
include(":arcconcrotdownview")
include(":linebentsidesweepview")
include(":linesweepencloseleftview")
include(":squprightdownview")
include(":linedropbentrightview")
include(":bentlineincreasearcview")
include(":bentbiarcdownview")
include(":lineextendleftarcview")
include(":lineextenarccloseview")
