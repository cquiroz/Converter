organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-d47fc4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-075cf5",
  "org.scalablytyped" %%% "mime" % "2.0-ab85b3",
  "org.scalablytyped" %%% "std" % "0.0-unknown-73e5e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
