# Weather_Shopper
This repository holds the test cases for the different  features offered by beyonnex. 
The framework chosen to implement this automated testing is Cucumber and using Java as the underlying implementation language. 
The below section gives a brief overview on how Cucumber is used in this testing.

Sample Scenario from Feature file

Scenario: Selection of different types of product
    Given User is on the dashboard

🔷🔶🔷 Guidance 🔷🔶🔷

This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation is needed.
It is created based on POM design model. 
Dependencies that used in the projects are as follows; Selenium Webdriver, Cucumber, Cucumber-junit,Bonigarcia Webdrivermanager
 
 🔷🔶🔷 Credentials 🔷🔶🔷 
 
Credentials are provided in configuration.properties file



🔷🔶🔷  Maven commands to run the test🔷🔶🔷

mvn compile: it will just compile the code of your application and tell you if there are errors

mvn test: it will compile the code of your application and your tests. 
It will then run your tests and let you know if some fails

mvn install: it will do everything mvn test does and then if everything looks 
file it will install the library or the application into your local maven repository 
In this way you could use this library from other projects you want to build on the same machine

mvn package - creates the jar


🔷🔶🔷 Running Tests 🔷🔶🔷

🔸 From IDE - Intellij:

Right-Click on the feature files(s) gives several options to run.Even there is debugging option to see the changes.

🔹 From Terminal on Intellij

Type "mvn test" on the terminal line and hit enter. 

🔹 From Command Line:

Apache maven should be successfully installed to run this command.
Type  same command as "mvn test" on the terminal line and hit enter. 


 🔷🔶🔷 Test Reports 🔷🔶🔷 
 
🔹 Cucumber HTML Plugin Reports target -> cucumber-html-reports > index.html (Right Click and Open in any Browser )

🔹 When you run the project from Maven verify, Cucumber will create automatically online report link.



🔷🔶🔷 Software Tester🔷🔶🔷 
        Sevki Öksüz
