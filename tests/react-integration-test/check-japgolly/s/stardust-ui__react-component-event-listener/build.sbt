organization := "org.scalablytyped"
name := "stardust-ui__react-component-event-listener"
version := "0.38.0-577cca"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5" withDottyCompat scalaVersion.value,
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "react" % "16.9.2-7cfa8e",
  "org.scalablytyped" %%% "std" % "0.0-unknown-c232ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
