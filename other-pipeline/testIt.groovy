def testMethod() {
    println( "hi there from groovy files");
}

def notifier() {
   mail to: 'robert.gants@solers.com',
   subject: "status of pipeline: ${currentBuild.fullDisplayName}",
   body: "${env.BUILD_URL} has result ${currentBuild.result}"
}


return this
