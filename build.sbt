ThisBuild / organization := "com.guizmaii"
ThisBuild / scalaVersion := "2.12.10"
ThisBuild / scalafmtCheck := true
ThisBuild / scalafmtSbtCheck := true

lazy val root =
    Project(id = "confluent_formation", base = file("."))
      .aggregate(`kafka_confluent_for_devs`)
      .dependsOn(`kafka_confluent_for_devs`)


lazy val `kafka_confluent_for_devs` =
    project
      .settings(
          libraryDependencies ++= Seq()
      )