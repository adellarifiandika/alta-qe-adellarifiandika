$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Sales.feature");
formatter.feature({
  "line": 2,
  "name": "Sales flow",
  "description": "description Class",
  "id": "sales-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sales"
    }
  ]
});
formatter.before({
  "duration": 63459051700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User make a purchase with 2 item",
  "description": "",
  "id": "sales-flow;user-make-a-purchase-with-2-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User choice 2 products from the list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User return to page chart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User already on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User input \"Adella\" as userFirst and input \"Rifiandika\" as last and input \"123\" as zip",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User ensure the item total and tax",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User ensure the total price after sum with the tax",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Has Completed the Checkout Order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 12048327300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 15421380900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 470438300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 6394976400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceProduct()"
});
formatter.result({
  "duration": 5019661600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.openCart()"
});
formatter.result({
  "duration": 2378685300,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.verifyYourCartPage()"
});
formatter.result({
  "duration": 9408101300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adella",
      "offset": 12
    },
    {
      "val": "Rifiandika",
      "offset": 44
    },
    {
      "val": "123",
      "offset": 75
    }
  ],
  "location": "CheckOutSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 12622392100,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.verifyYourCartList()"
});
formatter.result({
  "duration": 2920235200,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.verifyTotalPrice()"
});
formatter.result({
  "duration": 2120704400,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.verifyCheckoutOrderPage()"
});
formatter.result({
  "duration": 4507851400,
  "status": "passed"
});
formatter.after({
  "duration": 7123065900,
  "status": "passed"
});
});