def testMethod() {
    println( "hi there from groovy files");
}

def notifier(emailAddreses,buildUrl,buildResult) {
  mail to: 'robert.gants@solers.com, kaleigh.rosenburg@solers.com',
  subject: "status of pipeline: ${currentBuild.fullDisplayName}",
  body: "${buildUrl} has result ${buildResult}"
}

return this
