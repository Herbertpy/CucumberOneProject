$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Automating the Functionalities of Adactin",
  "description": "Given \n\n-\u003e Some precondition Step\nWhen\n\n-\u003e Some Key Actions\nThen\n\n-\u003e To Verify or Validate Something\nAnd\n\n-\u003e Used to add condition in a feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01: Login page Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityOne"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User verifying the login page using assert",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_verifying_the_login_page_using_assert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User the give valid username and password using DataTable without header one-D, and click on the login button",
  "rows": [
    {
      "cells": [
        "Herbert8489"
      ]
    },
    {
      "cells": [
        "Sam8489752875"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_the_give_valid_username_and_password_using_DataTable_without_header_one_D_and_click_on_the_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify whether the search hotel page is appeard or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_whether_the_search_hotel_page_is_appeard_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});