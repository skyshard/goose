val Slf4jApi = "org.slf4j" % "slf4j-api" % "1.6.6"
val Slf4jLog4j12 = "org.slf4j" % "slf4j-log4j12" % "1.6.6"
val Jsoup = "org.jsoup" % "jsoup" % "1.7.2"
val CommonsIo = "commons-io" % "commons-io" % "2.0.1"
val Httpclient = "org.apache.httpcomponents" % "httpclient" % "4.2.4"
val CommonsLang = "commons-lang" % "commons-lang" % "2.6"
val Juniversalchardet = "com.googlecode.juniversalchardet" % "juniversalchardet" % "1.0.3"

lazy val commonSettings = Seq(
  name := "goose-fork",
  version := "2.1.23-SNAPSHOT",
  scalaVersion in ThisBuild := "2.11.8"
)

lazy val goose = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(Slf4jApi, Slf4jLog4j12, Jsoup, CommonsIo, Httpclient, CommonsLang, Juniversalchardet),
    resolvers += "Sonatype Release" at "http://oss.sonatype.org/content/repositories/releases"
  )
