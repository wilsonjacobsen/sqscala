organization := "com.github.yoskhdia"

licenses +=("MIT", url("http://opensource.org/licenses/MIT"))

name := "sqscala"

version := "1.0.5"

scalaVersion := "2.11.7"

scalacOptions in GlobalScope in Compile := Seq(
  "-unchecked", "-deprecation", "-feature",
  "-Xlint",
  "-Xfatal-warnings",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen"
)
scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

val specs2Version = "3.6.+"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-sqs" % "1.10.+",
  "com.typesafe" % "config" % "1.3.+",
  "org.specs2" %% "specs2-core" % specs2Version % "test",
  "org.specs2" %% "specs2-mock" % specs2Version % "test",
  "org.elasticmq" %% "elasticmq-rest-sqs" % "0.8.+" % "test"
)
