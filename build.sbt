name := """glowing-bear"""

scalaVersion := "2.11.5" // or "2.10.4"

publishTo := Some(Resolver.file("file",  new File( Path.userHome.absolutePath + "/tmp/glowing-bear/releases" )) )

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "com.typesafe.play" %% "play-slick" % "0.8.1"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)

