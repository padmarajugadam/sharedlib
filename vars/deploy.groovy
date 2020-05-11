#!/usr/bin/env groovy

 call(body) {
    echo "Start Deploy"

    new Deployer(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
