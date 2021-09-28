pipeline {
    environment {
        script = 'scripttofile.sh'
        wrkspc = "${WORKSPACE}"
    }
    agent any
    stages {
        stage('checkout scm') {
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
                    rc = bat returnstatus:true script: "dir C:\\Users\\shant\\.jenkins\\workspace\\pipeline2withgit"
                    println $rc
                }
            }
        }
    }
}
def var(){
    env.WORKSPACE= pwd()
    def allmodules= readfile "var.txt"
}
