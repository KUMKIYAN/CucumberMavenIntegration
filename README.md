# CucumberMavenIntegration


mvn test -Dtest=TestRunner<br />
mvn test -Dtest=UITestRunner<br />
mvn test -Dcucumber.options="--tags @ui_navigation"<br />
mvn test -Dcucumber.options="--tags @service_navigation"<br />
mvn test -Dcucumber.options="--tags @all_scenarios"<br />
