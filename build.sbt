/** Copyright (C) 2017 Project-EBDO
  *
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  */

// Project Settings
name := "FeatureEngine"
version := "0.1"

// Scala version to use
scalaVersion := "2.11.8"

// Configuration for tests to run with Spark
fork in Test := true
parallelExecution in Test := false
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")

// Explicitly get scala version and don't show warnings
// https://mvnrepository.com/artifact/org.scala-lang/scala-library
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

// Spark provided dependencies
// https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.11
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.11
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided"

// solving spark-jackson dependency issue
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"

// Test dependencies
// https://mvnrepository.com/artifact/org.scalatest/scalatest_2.11
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.4" % "test"
// https://mvnrepository.com/artifact/com.holdenkarau/spark-testing-base_2.11
libraryDependencies += "com.holdenkarau" % "spark-testing-base_2.11" % "2.2.0_0.7.4" % "test"


// Project dependencies
// https://mvnrepository.com/artifact/com.github.scopt/scopt_2.11
libraryDependencies += "com.github.scopt" % "scopt_2.11" % "3.7.0"
// https://mvnrepository.com/artifact/org.json4s/json4s-jackson_2.11
libraryDependencies += "org.json4s" % "json4s-jackson_2.11" % "3.5.3"
