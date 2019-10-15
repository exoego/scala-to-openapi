import sbt._

object MyDependencies {
  val core = Seq(
    "org.scalameta" %% "scalameta" % "4.2.3",
    "io.swagger.core.v3" % "swagger-models" % "2.0.10",
    "org.scalatest" %% "scalatest" % "3.0.8" % "test"
  )
}
