organization := "org.scalablytyped"
name := "with-theme"
version := "0.0-unknown-005615"
scalaVersion := "3.0.0-M2-bin-20201116-9c850e3-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-80257d",
  "org.scalablytyped" %%% "std" % "0.0-unknown-0cbab1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
