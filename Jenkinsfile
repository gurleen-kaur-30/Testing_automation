pipeline {
    agent any
    tools {
        maven 'maven'
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
        stage('maven build') {
            steps {
                echo '> Building the maven application ...'
                sh 'cd Java-Calculator && cd calculator  && mvn clean install'
            }  
            post {
                success{
                    sh 'cd Java-Calculator && cd calculator  && mvn test'
                    echo "build successful"
                }
            }
        }

        stage('Jubula tests') {
            steps {
                echo 'Running Jubula tests'
                sh 'cd /home/gurleen/jubula_8.7.1.046/ite && ./testexec -project "Calculator" -version "1.0" -testsuite "Test Operations" -autconfig "Calculator@localhost"  -dbscheme "jdbc:h2:~/.jubula/database/embedded;MVCC=TRUE;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE" -dbuser sa -dbpw "" -resultdir "$WORKSPACE/Jubula" -resultname "reports"'
                echo "test successful"
            }
        }
    }
}