pipeline {
    agent any
    tools {
       maven 'Maven3.9.15' 
    }
    stages {
        stage('getCode') {
            steps {
                git branch: 'sit', 
                    url: 'https://github.com/srihariudugula/maven-git-practice.git'
            }
        }
        stage('Build'){
            steps {
                sh "mvn clean package"
            }
        }
        stage('Sonar Analysis'){
            steps{
                withSonarQubeEnv('sonarqube-10.6'){
                    sh "mvn sonar:sonar"
                }  
            }
        }
    }
}
