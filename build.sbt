import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "ScalaStudy"

scalaVersion :="2.10.2"

version :="1.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

jacoco.settings