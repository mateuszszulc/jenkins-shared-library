import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class Jira implements Serializable {
    def JIRA_SERVER = "https://jira.lumesse.top"

    def steps
    def JIRA_CREDENTIALS

    Jira(steps, JIRA_CREDENTIALS) {
        this.steps = steps;
        this.JIRA_CREDENTIALS = JIRA_CREDENTIALS;
    }

    def test() {
        steps.echo "${JiraConstants.transitionDeploymentFinished}";
    }
}