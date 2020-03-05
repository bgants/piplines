def modules = [:]
def emailAddreses = ['robert.gants@solers.com'] 
pipeline {
    agent any

    stages {
        stage('Load other file') {
            steps {
               script {
                   modules.testIt = load 'other-pipeline/testIt.groovy'
               }
            }
        }
        stage('Validate Git') {
            steps {
                sh 'ls -al'
                script {
                    modules.testIt.testMethod()
                    modules.testIt.notifier(emailAddreses,${env.BUILD_URL},${currentBuild.result)
                }
            }
        }
    }
}
