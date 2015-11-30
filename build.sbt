name := """psmod1"""

organization := """com.escalesoft"""

version := "0.0.3-SNAPSHOT"

// disablePlugins(PlayLayoutPlugin) activates standard SBT Maven layout as documented at: 
// https://playframework.com/documentation/2.4.x/Anatomy
lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayLayoutPlugin)

scalaVersion := "2.11.7"

// Provides support for Maven style project sources organisation (src/main/scala src/main/java src/main/resources ...)
//scalaSource in Compile := baseDirectory.value / "src"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
