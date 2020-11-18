@groovy.transform.Field
def CREATE_RM_ENDPOINT = "/rest/api/2/issue";

def info(message) {
    echo "INFO: ${message} ${CREATE_RM_ENDPOINT}"
}

def warning(message) {
    echo "WARNING: ${message}"
}
