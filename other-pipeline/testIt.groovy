def testMethod() {
    println( "hi there from groovy files");
}

def notifier(emailAddreses) {
  mail to: emailAddreses,
  subject: "status of pipeline: ${currentBuild.fullDisplayName}",
  body: "${env.BUILD_URL} has result ${currentBuild.result}"
}

return this
