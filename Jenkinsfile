@Library('jenkinssharedgroovy') _
node(label: 'master') {
    //Variables
    def gitURL='https://github.com/narendrajava1/easy-notes.git'
    def repoBranch='master'
    mvnHome = tool 'maven'
    def pom = "pom.xml"
    def goal = "clean install"
    
    stage('Git-Checkout'){
        gitClone "${gitURL}","${repoBranch}"
        
    }
    //MVN Build
    stage('Maven Build and Push to Artifactory'){
        sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
    }
}
