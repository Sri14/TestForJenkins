$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/HomeMac/Documents/workspace/CucumberMaven/src/main/java/webRoster/Feature/Home.feature");
formatter.feature({
  "line": 1,
  "name": "WebRoster basic navigation",
  "description": "",
  "id": "webroster-basic-navigation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "fill in get in touch form",
  "description": "",
  "id": "webroster-basic-navigation;fill-in-get-in-touch-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Sri"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on WebRoster homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on contact tab",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I fill in \"\u003cName\u003e\" and \"\u003cPhone\u003e\" and \"\u003cEmail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I fill in address and tick required boxes",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I close the Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "webroster-basic-navigation;fill-in-get-in-touch-form;",
  "rows": [
    {
      "cells": [
        "Name",
        "Phone",
        "Email"
      ],
      "line": 29,
      "id": "webroster-basic-navigation;fill-in-get-in-touch-form;;1"
    },
    {
      "cells": [
        "Sri",
        "1234",
        "test@123.com"
      ],
      "line": 30,
      "id": "webroster-basic-navigation;fill-in-get-in-touch-form;;2"
    },
    {
      "cells": [
        "TOM",
        "0000",
        "test@567.com"
      ],
      "line": 31,
      "id": "webroster-basic-navigation;fill-in-get-in-touch-form;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "fill in get in touch form",
  "description": "",
  "id": "webroster-basic-navigation;fill-in-get-in-touch-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Sri"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on WebRoster homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on contact tab",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I fill in \"Sri\" and \"1234\" and \"test@123.com\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I fill in address and tick required boxes",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_am_on_WebRoster_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_click_on_contact_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sri",
      "offset": 11
    },
    {
      "val": "1234",
      "offset": 21
    },
    {
      "val": "test@123.com",
      "offset": 32
    }
  ],
  "location": "InvoiceAndPayrollStepDef.i_fill_in_and_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_fill_in_address_and_tick_required_boxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "fill in get in touch form",
  "description": "",
  "id": "webroster-basic-navigation;fill-in-get-in-touch-form;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Sri"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on WebRoster homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on contact tab",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I fill in \"TOM\" and \"0000\" and \"test@567.com\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I fill in address and tick required boxes",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_am_on_WebRoster_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_click_on_contact_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 11
    },
    {
      "val": "0000",
      "offset": 21
    },
    {
      "val": "test@567.com",
      "offset": 32
    }
  ],
  "location": "InvoiceAndPayrollStepDef.i_fill_in_and_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_fill_in_address_and_tick_required_boxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceAndPayrollStepDef.i_close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
});