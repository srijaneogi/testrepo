pipeline {
    environment {
        script= 'batscript.bat'
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
                    rc = bat returnstatus:true, script: "${WORKSPACE}\\$script"
                    println "$rc"
                    println rc
                    url= readfile "var2.txt"
                    echo $url
                }
            }
        }
    }
}
def var(){
    env.WORKSPACE= pwd()
    def allmodules= readfile "var2.txt"
}
