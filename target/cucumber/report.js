$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Background.feature");
formatter.feature({
  "line": 2,
  "name": "Set Background Color of techfios page",
  "description": "",
  "id": "set-background-color-of-techfios-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2898001700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "SkyBlue Background",
  "description": "",
  "id": "set-background-color-of-techfios-page;skyblue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the \"Set SkyBlue Background\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to skyblue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinitions.set_skyblue_background_button_exists()"
});
formatter.result({
  "duration": 3179816900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 16
    }
  ],
  "location": "BackgroundColorStepDefinitions.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 3071732200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinitions.the_background_color_will_change_to_skyblue()"
});
formatter.result({
  "duration": 38211900,
  "status": "passed"
});
formatter.after({
  "duration": 670196000,
  "status": "passed"
});
formatter.before({
  "duration": 1996647500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "White Background",
  "description": "",
  "id": "set-background-color-of-techfios-page;white-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the \"Set White Background\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinitions.set_white_background_button_exists()"
});
formatter.result({
  "duration": 3039274600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 16
    }
  ],
  "location": "BackgroundColorStepDefinitions.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 3072715700,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinitions.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 106552400,
  "status": "passed"
});
formatter.after({
  "duration": 680877200,
  "status": "passed"
});
});