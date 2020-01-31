def call (def goal){
	//sh 'mvn "${goal}"'
 sh label: '', script: 'mvn compile'
  
}
