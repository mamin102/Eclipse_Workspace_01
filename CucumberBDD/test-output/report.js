$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/moamin/eclipse-workspace/CucumberBDD/src/test/java/com/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Facebook with currect credential",
  "description": "",
  "id": "facebook-login;login-to-facebook-with-currect-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters currect UserName and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 5417999400,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLogin.title_of_login_page_is_Facebook()"
});
formatter.result({
  "duration": 17012385,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cFacebook []\u003e but was:\u003cFacebook [- Log In or Sign Up]\u003e\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\n\tat com.Step_Def.FacebookLogin.title_of_login_page_is_Facebook(FacebookLogin.java:29)\n\tat ✽.When title of login page is Facebook(/Users/moamin/eclipse-workspace/CucumberBDD/src/test/java/com/Feature/login.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "FacebookLogin.user_enters_currect_UserName_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FacebookLogin.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
});