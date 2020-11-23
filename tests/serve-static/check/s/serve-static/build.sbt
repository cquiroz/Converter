organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-15fc76"
scalaVersion := "3.0.0-M2-bin-20201116-9c850e3-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-60eca4",
  "org.scalablytyped" %%% "mime" % "2.0-b2ba45",
  "org.scalablytyped" %%% "std" % "0.0-unknown-9915f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
