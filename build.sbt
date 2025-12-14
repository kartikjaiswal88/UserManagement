import play.sbt.PlayImport._

name         := "UserManagement"
organization := "kartikjaiswal88"
version      := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

TwirlKeys.templateImports ++= Seq(
  "com.kartikjaiswal88.controllers.routes"
)


scalaVersion := "3.3.5"   // Scala 3 LTS line that Play 2.9/3.0 support

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.2" % Test
)
