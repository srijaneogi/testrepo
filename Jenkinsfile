pipeline {
    environment {
        script = 'scripttofile.sh'
    }
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World - Pipeine'
            }
        }
        stage('loop') {
            steps {
                echo 'run loop'
                println "${WORKSPACE}"
           
              
              
                script{
                    sh "ls ${WORKSPACE}/*"
                    ls ${WORKSPACE}/*
                    }
                    
                }
            }
        }
    }
}
def var(){
    env.WORKSPACE= pwd()
    def allmodules= readfile "var.txt"
}
