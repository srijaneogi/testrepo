pipeline {
    environment {
        script = 'scripttofile.sh'
        wrkspc = "${WORKSPACE}"
    }
    agent any
    stages {
        stage(checkout scm) {
            steps{
                script{
                    checkout scm
                }
            }
        }
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
                    sh returnstatus:true script: "sh ${WORKSPACE}/$script"
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
