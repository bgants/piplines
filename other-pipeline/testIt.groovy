def testMethod(emailAddresses) {
    println( "hi there from groovy files");
    println(emailAddresses.toListString());
}

def notifier(emailAddresses) {
  mail to: emailAddresses.toListString(),
  subject: "status of pipeline: ${currentBuild.fullDisplayName}",
  body: "${env.BUILD_URL} has result ${currentBuild.result}"
}

return this
