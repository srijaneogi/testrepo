pipeline {
    environment {
        script = 'scripttofile.sh'
        wrkspc = ${WORKSPACE}
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
                script {
                    sh "ls $wrkspc"
                    ls $wrkspc
                }
            }
        }
    }
}
def var(){
    env.WORKSPACE= pwd()
    def allmodules= readfile "var.txt"
}
