pipeline {
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
                script{
                    def allmodules = ['url1:branch1', 'url2:branch2']
                    for (int i = 0; i < allmodules.size(); ++i) {
                        echo "Testing the ${allmodules[i]} element"
                    }
                    
                }
            }
        }
    }
}
