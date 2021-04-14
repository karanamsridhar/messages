pipeline {
	agent any 
    tools {
        maven 'Maven-3.6.3'
    }	
	stages{
		stage("build"){
			steps{
					echo "Building the application ...."
					sh "mvn clean compile"
			}
		}
		stage("test"){
			when {
				expression{
					BRANCH_NAME == "master"
				}
			}
			steps{
				echo "Testing the application ...."
				sh "mvn test"
			}
		}
		stage("deploy"){
			steps{
				echo "Deploying the application ...."
				sh "mvn package"
			}
		}
	}
	post{
		always {
			echo "Always message from post"
		}
		success{
			echo "Success message from post"
		}
		failure{
			echo "Failure message from post"
		}
	}
}