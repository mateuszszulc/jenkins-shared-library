class JiraConstants {
    static final transitionReleaseProcessStart  = 61 //WaitingForPreprodInstallation
    static final transitionInstallationStart = 11; //In PRE-PROD INSTALLATION
    static final transitionInstallationFinished = 21; //READY FOR PRE-PROD TESTING
    static final transitionDeploymentStart = 51; //DEPLOYMENT IN PROGRESS
    static final transitionDeploymentFinished = 81; //READY FOR TESTING ON PROD
    static final transitionDeploymentTestsPassed = 101; // DEPLOYMENT DONE
    static final transitionDeploymentTestsFailed = 111; //INSTALLATION CANCELLED
}
