def call (  def mvnHome,def goal,def pom){
   sh '"$MVN_HOME/bin/mvn" "${goal}" "${pom}"'
  
}
