pipeline {
    agent any

    stages {
        stage('Load other file') {
            steps {
               load 'other-pipeline/Jenkinsfile  
            }
        }
        stage('Validate Git') {
            steps {
                sh 'ls -al'
				echo ${productionServer}
            }
        }
    }

}
