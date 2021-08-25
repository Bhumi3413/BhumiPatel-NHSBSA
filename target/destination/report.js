$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/walesTestTicketAgeUnder16.feature");
formatter.feature({
  "line": 3,
  "name": "To get free NHS treatment in Wales",
  "description": "",
  "id": "to-get-free-nhs-treatment-in-wales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@AgeUnder16"
    }
  ]
});
formatter.before({
  "duration": 6665606100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To verify person age 16 or under 16 get free treatment from NHS",
  "description": "",
  "id": "to-get-free-nhs-treatment-in-wales;to-verify-person-age-16-or-under-16-get-free-treatment-from-nhs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User on NHS cost checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User select country wales",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on next",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User type date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on next",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be able to see free treatment message from NHS",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_on_NHS_cost_checker_tool()"
});
formatter.result({
  "duration": 100149000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_start_button()"
});
formatter.result({
  "duration": 520782000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_select_country_wales()"
});
formatter.result({
  "duration": 253274800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_on_next()"
});
formatter.result({
  "duration": 207281600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_type_date_of_birth()"
});
formatter.result({
  "duration": 113822100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_next()"
});
formatter.result({
  "duration": 216094400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_see_free_treatment_message_from_NHS()"
});
formatter.result({
  "duration": 34482800,
  "status": "passed"
});
formatter.after({
  "duration": 17700,
  "status": "passed"
});
});