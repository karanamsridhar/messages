pipeline {
	agent any 
	stages{
		stage("build"){
			steps{
				echo "Building the application ...."
				sh 'mvn clean compile'
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
			}
		}
		stage("deploy"){
			steps{
				echo "Deploying the application ...."
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