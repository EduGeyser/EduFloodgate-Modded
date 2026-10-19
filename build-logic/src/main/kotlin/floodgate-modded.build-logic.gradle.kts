repositories {
    mavenLocal() // lets locally published edu core builds win during development
    // EduFloodgate core and api artifacts (see the EduFloodgate repo's
    // edu-core-repackage branch; published to this repo's maven-repo branch)
    maven("https://raw.githubusercontent.com/EduGeyser/EduFloodgate-Modded/maven-repo/") {
        content {
            includeGroup("org.geysermc.floodgate")
        }
    }
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.neoforged.net/releases")
    maven("https://repo.opencollab.dev/main/")
    maven("https://jitpack.io") {
        content {
            includeGroupByRegex("com.github.*")
        }
    }
    maven("https://central.sonatype.com/repository/maven-snapshots/")
}
