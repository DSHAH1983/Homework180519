$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Feature/register.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "In order to register on www.demo.nopcommerce.com\r\nAs a user\r\nI want to register successfully using all fields",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "duration": 8557508740,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User clicks on registration page user should see registration form",
  "description": "",
  "id": ";user-clicks-on-registration-page-user-should-see-registration-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters all details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnRegisterPage()"
});
formatter.result({
  "duration": 1396650038,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEntersAllDetails()"
});
formatter.result({
  "duration": 1332562231,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegisterButton()"
});
formatter.result({
  "duration": 1506801571,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeRegisterSuccessfully()"
});
formatter.result({
  "duration": 37070776,
  "status": "passed"
});
formatter.after({
  "duration": 722672613,
  "status": "passed"
});
formatter.uri("src/test/Resources/Feature/verifycurrency.feature");
formatter.feature({
  "line": 2,
  "name": "User should be able to verify currency",
  "description": "",
  "id": "user-should-be-able-to-verify-currency",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 5988772154,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to verify default currency as US Dollar",
  "description": "",
  "id": "user-should-be-able-to-verify-currency;user-should-be-able-to-verify-default-currency-as-us-dollar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user should be able to see the default currency selected as US Dollar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to verify the price displayed in US Dollar",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 46104779,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToSeeTheDefaultCurrencySelectedAsUSDollar()"
});
formatter.result({
  "duration": 31075887,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToVerifyThePriceDisplayedInUSDollar()"
});
formatter.result({
  "duration": 124684923,
  "status": "passed"
});
formatter.after({
  "duration": 746577457,
  "status": "passed"
});
formatter.before({
  "duration": 6041576283,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to verify Euro currency",
  "description": "",
  "id": "user-should-be-able-to-verify-currency;user-should-be-able-to-verify-euro-currency",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user clicks on US Dollar",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user selects Euro",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should be able to verify the price displayed in Euro",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnUSDollar()"
});
formatter.result({
  "duration": 129857942,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsEuro()"
});
formatter.result({
  "duration": 1038406212,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToVerifyThePriceDisplayedInEuro()"
});
formatter.result({
  "duration": 142236899,
  "status": "passed"
});
formatter.after({
  "duration": 753617543,
  "status": "passed"
});
});