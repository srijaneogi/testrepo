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
                sh "chmod +x $script"
                sh "./$script"
                script{
                    def url= readfile "var.txt"
                    echo $url
                    for (int i = 0; i < url.size(); ++i) {
                        echo "Testing the ${allmodules[i]} element"
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
