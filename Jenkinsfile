pipeline {
    agent any

    stages {
        stage('Load other file') {
            steps {
               script {
                   myGroovyClass = load 'other-pipeline/testIt.groovy'
               }
            }
        }
        stage('Validate Git') {
            steps {
                sh 'ls -al'
                myGrrovyClass.myTestFunc()				
				echo "this is defined --> ${productionServer} in another Jenkinsfile"
            }
        }
    }

}
