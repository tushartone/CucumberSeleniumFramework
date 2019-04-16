$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Tagging.feature");
formatter.feature({
  "line": 2,
  "name": "Frre CRM application Testing",
  "description": "",
  "id": "frre-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Login with invalid username and password",
  "description": "",
  "id": "frre-crm-application-testing;login-with-invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "This is invalid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_invalid_login_test()"
});
formatter.result({
  "duration": 391855066,
  "status": "passed"
});
});