pipeline {
    stages {
        stage('Example Build') {
            steps {
                step{
                     git branch: 'master', url: "https://github.com/KUMKIYAN/CucumberMavenIntegration.git"
                }
                step{
                     mvn test
                }
            }
        }
        stage('Example Test') {
            steps {
                step{
                    echo 'Hello, JDK'
                }
            }
        }
    }
}
