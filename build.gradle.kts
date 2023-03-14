
buildscript {

    extra["minSdkVersion"] = 15
    extra["compileSdkVersion"] = 33
    extra["targetSdkVersion"] = 33

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("io.deepmedia.tools:publisher:0.6.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}