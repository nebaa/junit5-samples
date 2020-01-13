pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
	mvn clean install
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
	mvn test
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
	mvn deploy
                echo 'Deploying....'
            }
        }
    }
}