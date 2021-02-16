pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
	bat "mvn clean install"
                bat "echo Building.."
            }
        }
        stage('Test') {
            steps {
	bat "mvn test"
                bat "echo Testing.."
            }
        }
        stage('Deploy') {
            steps {
	bat "mvn deploy"
                bat "echo Deploying...."
            }
        }
    }
}