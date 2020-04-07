pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    options {
        skipDefaultCheckout(true)
    }
 
    stages {
        stage('Checkout SCM') {
            steps {
                echo '> Checking out the source control ...'
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'cd Java-Calculator && cd  && mvn clean install' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
        // stage('maven build') {
        //     steps {
        //         echo '> Building the maven application ...'
        //         sh 'cd Java-Calculator && cd  && mvn clean install'
        //     }  
        //     post {
        //         success{
        //             echo "build successful"
        //         }
        //     }
        // }
    }
}