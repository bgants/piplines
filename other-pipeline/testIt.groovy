def testMethod(emailAddresses) {
    println( "hi there from groovy files");
    println(emailAddresses.join(","));
}

def notifier(emailAddresses) {
  mail to: emailAddresses.join(","),
  subject: "status of pipeline: ${currentBuild.fullDisplayName}",
  body: "${env.BUILD_URL} has result ${currentBuild.result}"
}

return this
