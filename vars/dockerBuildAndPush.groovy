def call(def registry,def imageName){
// This step should not normally be used in your script. Consult the inline help for details.
//withDockerRegistry(url: 'https://hub.docker.com/') {
    sh "ls"
    sh label: '', script: "docker-compose up"
    
 //   }
  
}
