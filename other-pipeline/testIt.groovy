def testMethod() {
    println( "hi there from groovy files");
}

def notifier(emailAddreses) {
  mail to: emailAddreses.toListString(),
  subject: "status of pipeline: ${currentBuild.fullDisplayName}",
  body: "${env.BUILD_URL} has result ${currentBuild.result}"
}

return this
