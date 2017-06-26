lazy val `polykind-tests` =
  project
    .in(file("."))
    .settings(commonSettings)

lazy val commonSettings =
  Seq(
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding",
      "UTF-8",
      "-Ykind-polymorphism"
    )
  )

inThisBuild(
  Seq(
    scalaOrganization := "org.typelevel",
    scalaVersion := "2.12.2-bin-typelevel-4"
  )
)
