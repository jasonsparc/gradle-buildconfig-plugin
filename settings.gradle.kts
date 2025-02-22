apply(from = "gradle/shared.settings.gradle.kts")

rootProject.name = "gradle-buildconfig-plugin"

includeBuild("plugin")
include(
    "demo-project:generic",
    "demo-project:groovy",
    "demo-project:kts",
    "demo-project:kts-android",
    "demo-project:kts-js",
    "demo-project:kts-multiplatform",
)
