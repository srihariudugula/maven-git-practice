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
        stage('deploy'){
            steps{
                sshagent(['ssh-key-dev']){
                    sh 'scp -o StrictHostKeyChecking=no target/just-practice.war ec2-user@54.196.81.115:/home/ec2-user/apache-tomcat-9.0.117/webapps'
                }
            }
        }
    }
}
