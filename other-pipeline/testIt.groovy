def testMethod() {
    println( "hi there from groovy files");
}

def notifier(emailAddreses) {
   println("mail to: ${emailAddreses},");
   println("subject: \"status of pipeline: ${currentBuild.fullDisplayName}\",");
   println("body: \"${env.BUILD_URL} has result ${currentBuild.result}\" ");
}


return this
