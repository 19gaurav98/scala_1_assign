name := "Flag_assignment"

version := "0.1"

scalaVersion := "2.13.5"
lazy val root = project.in(file(".")).aggregate(cli, flags)

lazy val cli = project.in(file("cli"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
    maintainer := "gaurav.guptae@knoldus.com",
  ).dependsOn(flags)
  .aggregate(flags)
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(UniversalPlugin)


lazy val flags = project.in(file("flags"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test


  )