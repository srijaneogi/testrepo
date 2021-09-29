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
                    rc = bat returnStatus:true, script: "$wrkspc\\$script"
                    println "$rc"
                    println rc
                    url = readFile(file: 'var2.txt')
                    println "$url"
                    url.each(){
                        println url
                    }
             
                    for (int i = 0; i < url.size(); ++i) {
                        echo "Testing the ${url[i]} element"
                    }
                    
                }
            }
        }
    }
}
def var(){
    env.WORKSPACE= pwd()
    def allmodules= readfile "var2.txt"
}
