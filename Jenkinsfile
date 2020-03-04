pipeline {
    agent any

    stages {
        stage('Load other file') {
            steps {
               load 'other-pipeline/testIt.groovy'
            }
        }
        stage('Validate Git') {
            steps {
                sh 'ls -al'
                testIt.field				
				echo "this is defined --> ${productionServer} in another Jenkinsfile"
            }
        }
    }

}
