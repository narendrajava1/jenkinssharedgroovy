def call (  def mvnHome,def goal,def pom){
   sh '"${mvnHome}" -Dmaven.test.failure.ignore clean package'
  
}
