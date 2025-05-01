pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/rameezwangde/devops.git'
            }
        }

        stage('Deploy') {
            steps {
                script {
                     bat 'copy index.html C:\\xampp\\htdocs\\myweb\\index.html'
                     bat 'copy 1.html C:\\xampp\\htdocs\\myweb\\1.html'
                      bat 'copy 2.html C:\\xampp\\htdocs\\myweb\\2.html'
                }
            }
        }
    }
}
