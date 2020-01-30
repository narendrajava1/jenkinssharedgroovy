@Library('jenkinssharedgroovy') _
node(label: 'master') {
    //Variables
    def gitURL='https://github.com/narendrajava1/easy-notes.git'
    def repoBranch='master'
    def mvnHome = "MAVEN_HOME"
    def pom = "pom.xml"
    def goal = "clean"
    
    stage('Git-Checkout'){
        gitClone "${gitURL}","${repoBranch}"
        
    }
    //MVN Build
    stage('Maven Build and Push to Artifactory'){
        mavenBuild "${mvnHome}", "${goal}"
    }
}
