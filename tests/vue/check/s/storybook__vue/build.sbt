organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-726bf6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-fb5edc",
  "org.scalablytyped" %%% "vue" % "2.5.13-efc7f2",
  "org.scalablytyped" %%% "webpack-env" % "1.13-833c29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
