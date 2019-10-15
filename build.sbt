
name := "scala-to-openapi"

version := "0.1.0"

scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .aggregate(core, plugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(MySettings.nonPublishingSetting)
  .settings(
    name := "scala-js-nodejs"
  )

lazy val core = (project in file("./core"))
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scala-js-nodejs-core",
    libraryDependencies ++= MyDependencies.core
  )

lazy val plugin = (project in file("./plugin"))
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "sbt-scala-to-openapi"
  )
