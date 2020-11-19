import groovy.json.JsonOutput
import groovy.json.JsonSlurper

@groovy.transform.Field
def CREATE_RM_ENDPOINT = "/rest/api/2/issue";

def info(message) {
    echo "INFO: ${message} ${CREATE_RM_ENDPOINT}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

class Jira implements Serializable {
    def JIRA_SERVER = "https://jira.lumesse.top"

    def steps
    def JIRA_CREDENTIALS

    Jira(steps, JIRA_CREDENTIALS) {
        this.steps = steps;
        this.JIRA_CREDENTIALS = JIRA_CREDENTIALS;
    }

    def post(jsonObject, endpoint) {
        def json = JsonOutput.toJson(jsonObject)
        steps.echo "Hello world $JIRA_SERVER"
        return new JsonSlurper().parseText('{"hello" : "world"}')
    }
}
