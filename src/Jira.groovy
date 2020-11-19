import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class Jira implements Serializable {
    def JIRA_SERVER = "https://jira.lumesse.top"

    def steps
    def JIRA_CREDENTIALS

    Jira(steps, JIRA_CREDENTIALS) {
        this.steps = steps;
        this.JIRA_CREDENTIALS = JIRA_CREDENTIALS;
        steps.log.info("dupa");
    }

    def post(jsonObject, endpoint) {
        def json = JsonOutput.toJson(jsonObject)
        steps.echo "Hello world $JIRA_SERVER"
        return new JsonSlurper().parseText('{"hello" : "world"}')
    }
}

