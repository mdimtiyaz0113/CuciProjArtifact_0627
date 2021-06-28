$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "I want to use this template for my feature file",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To validate login to amazon website as Authenticated User",
  "description": "",
  "id": "login-feature;to-validate-login-to-amazon-website-as-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Amazon HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters valid id and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user logs in successfully and get a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "TestloginStepDef.user_is_on_Amazon_HomePage()"
});
formatter.result({
  "duration": 14102737300,
  "status": "passed"
});
formatter.match({
  "location": "TestloginStepDef.user_navigates_to_Login_Page()"
});
formatter.result({
  "duration": 6313557700,
  "status": "passed"
});
formatter.match({
  "location": "TestloginStepDef.user_enters_valid_id_and_password()"
});
formatter.result({
  "duration": 8253304500,
  "status": "passed"
});
formatter.match({
  "location": "TestloginStepDef.user_logs_in_successfully_and_get_a_success_message()"
});
formatter.result({
  "duration": 31228100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Amazon Sign In]\u003e but was:\u003c[My Title]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat CucStepDef.TestloginStepDef.user_logs_in_successfully_and_get_a_success_message(TestloginStepDef.java:57)\r\n\tat ✽.Then user logs in successfully and get a success message(Testlogin.feature:8)\r\n",
  "status": "failed"
});
});