$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/DealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Deal data Creation",
  "description": "",
  "id": "free-crm-deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FreeCRM create a new deal scenarion",
  "description": "",
  "id": "free-crm-deal-data-creation;freecrm-create-a-new-deal-scenarion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "users is allready on FreeCRM login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "tushartone",
        "Tush@1993"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on new deal button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commision"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal4",
        "200",
        "50",
        "40"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "300",
        "60",
        "30"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "600",
        "70",
        "20"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "DealStepWithMapDefination.users_is_allready_on_freecrm_login_page()"
});
formatter.result({
  "duration": 16247956582,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.title_of_login_page_is_freecrm()"
});
formatter.result({
  "duration": 10253421,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 235907910,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8241641385,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 13922336,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 696167283,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_click_on_new_deal_button()"
});
formatter.result({
  "duration": 2484149811,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 10836980216,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefination.close_the_browser()"
});
formatter.result({
  "duration": 705472378,
  "status": "passed"
});
});