# CucumberMavenIntegration


mvn test -Dtest=TestRunner<br />
mvn test -Dtest=UITestRunner<br />
mvn test -Dcucumber.options="--tags @ui_navigation"<br />
mvn test -Dcucumber.options="--tags @service_navigation"<br />
mvn test -Dcucumber.options="--tags @all_scenarios"<br />


Given Task:

Cucumber environment with Gherkin support (any programming language can be used).

 For given URL (https://developer.here.com/documentation) validate all internal links on the page if accessible.
· page is rendered and status is 2xx

 As developer.here.com uses AngularJS for frontend, verify if on page Angular was initialised
Follow below steps-

Load https://developer.here.com/documentation and check if page loads properly and angular is initialized Find all links on page that are internal to documentation site (/documentation). Ignore anything that points outside https://developer.here.com/documentation) – external links or links in header/footer that are not related to documentation For each link check if page loads and angular is initialized Fail test if page doesn’t load or angular is not initialized

Solution

The above task can be completed in two ways.

one is by through using service
second one is by using ui.
clone the project : git clone git@github.com:KUMKIYAN/dev-here.git

import this maven project into eclipse / intellij

to run through services give CucumberOptions as -> tags = {"@service_navigation"}) in the file "src/main/java/runner/MainRunner.java"

to run through ui give CucumberOptions as -> tags = {"@service_navigation"}) in the file "src/main/java/runner/MainRunner.java"

to run through both services and ui give CucumberOptions as -> tags = {"@all_scenarios"}) in the file "src/main/java/runner/TestRunner.java"

Once test runs we can see target folder generated.

open the "target/cucumber-reports/index.html" in a browser to see cucumber report.
