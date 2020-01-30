def call (  def mvnHome,def goal,def pom){
   sh "${mvnHome}" "${goal} "${pom}
  )
}
