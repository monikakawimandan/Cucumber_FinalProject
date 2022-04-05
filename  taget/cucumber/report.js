$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/monik/eclipse-workspace/Cucumber_FinalProject/Cucumber_FinalProject/src/test/resources/skyblueBackground.feature");
formatter.feature({
  "name": "The background color changes to sky blue",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SkyBlueBackground"
    }
  ]
});
formatter.scenario({
  "name": "User Is trying to change the backgroung color to blue",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SkyBlueBackground"
    }
  ]
});
formatter.step({
  "name": "\"Set SkyBlue Backgroungd\" button exists",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on the \"Set SkyBlue Backgroungd\" button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});