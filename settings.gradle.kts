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
include(":uprectarcencloseview")
include(":bentuparcjoinview")
include(":linebentquartarcview")
include(":linetouchsemiarcview")
include(":catchbentlinearcview")
include(":lineuparcleftview")
include(":lineenclosesidearcview")
include(":linebentrotarcview")
include(":steparchalfleftview")
include(":rightenclosearcrightview")
include(":arcsideellipmoveview")
include(":downlinerotarcview")
include(":linebentarcjoinview")
include(":lineopenbentrightview")
include(":linemovesweepupview")
include(":lineopenarcrightview")
include(":midbentlinearcview")
include(":semiarccompletehalfview")
include(":trienclosecircledownview")
include(":halfarcdownrotview")
include(":linebiconcarcview")
include(":bowarrowdownleftview")
include(":uplinearcrightview")
include(":halfarcmidjoinview")
include(":rotlinehalfarcview")
include(":linebentarcdownview")
include(":arclineextendrotview")
include(":biarchalfmoveview")
include(":lineextendarcrotview")
include(":lineexpanddividerightview")
include(":bicircledropaltview")
include(":semiarcrotupview")
include(":biendarcdownview")
include(":linesweepperpupview")
include(":linesweepjoinarcview")
