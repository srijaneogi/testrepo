def call(name){
    node {
        def mvnHome
        stage('Preparation') { 
            echo "${name} hello from shared lib 1"
        }
    }
}
