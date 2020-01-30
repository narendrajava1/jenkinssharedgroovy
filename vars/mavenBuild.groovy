def call (  def mvnHome,def goal,def pom){
   rtMavenRun (
      tool: "${mvnHome}",
      pom: "${pom}",
      goals: "${goal}",
      opts: '-Xms1024m -Xmx4096m'
  )
}
