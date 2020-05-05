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
                    sh 'cd Java-Calculator && cd calculator  && mvn site'
                    echo "build successful"
                }
            }
        }

        stage('Jubula tests') {
            steps {
               wrap([$class: 'Xvfb', autoDisplayName: true, additionalOptions: '', assignedLabels: '', displayNameOffset: 0, installationName: 'default xvfb', screen: '']) {
                     echo 'Running Jubula tests'
                     sh 'cd /home/gurleen/jubula_8.7.1.046/ite && chmod 777 * && ./testexec -project "Calculator" -version "1.0" -testsuite "Test Operations" -autconfig "Calculator@localhost" -datadir "/home/gurleen/.jubula/database"  -dburl "jdbc:h2:/home/gurleen/.jubula/database/embedded;MVCC=TRUE;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE" -dbuser sa -dbpw "" -resultdir "$WORKSPACE/Jubula" -resultname "reports"'
                     echo "test successful"
                }
               
            }
        }
    }
}
