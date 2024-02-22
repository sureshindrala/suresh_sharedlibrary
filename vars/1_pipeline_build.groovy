import com.suresh.build.Calculator
Calculator calculator = new Calculator(this)
pipeline {
    agent any
    stages {
        stage ('Additions') {
            steps {
                script {
                    echo "Printing sum of 2 numbers"
                    println calculator.add(3,7)
                }
            }
        }
        stage('Nothing') {
            steps {
                echo "printing text not from the groovy"
            }

        }
    }
}