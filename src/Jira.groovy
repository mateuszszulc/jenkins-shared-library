import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class Jira implements Serializable {
    def JIRA_SERVER = "https://jira.lumesse.top"
    def steps

    Jira(steps, JIRA_CREDENTIALS) {
        this.steps = steps;
    }

    def await() {
        def i = 0;
        def retryDelay = 15;

        steps.withCredentials([steps.usernameColonPassword(credentialsId: 'mateusz', variable: 'JIRA_CREDENTIALSS')]) {

            steps.retry(8) { // 2 minutes
                steps.echo "Password injected is: ${steps.JIRA_CREDENTIALSS}"
                steps.sleep(retryDelay);

                if (i < 5) {
                    i++
                    steps.echo "Issue status ID: $i"
                    steps.error("Wrong status $i");
                } else {
                    steps.echo "Ticket is READY for PROD deployment ($i)"
                }
            }
        }
    }

    def test() {
        steps.echo "${JiraConstants.transitionDeploymentFinished}";
    }
}