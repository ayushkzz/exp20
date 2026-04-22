pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t demo-app .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker stop demo-container || exit 0'
                bat 'docker rm demo-container || exit 0'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8099:8080 --name demo-container demo-app'
            }
        }
    }
}