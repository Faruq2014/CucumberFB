$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tag.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# tag befor feature will run whole class"
    }
  ],
  "line": 3,
  "name": "Testing cucumber functionality",
  "description": "I want to use this template for my feature file",
  "id": "testing-cucumber-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@system"
    }
  ]
});
formatter.before({
  "duration": 4380066700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Testing yahoo hook",
  "description": "",
  "id": "testing-cucumber-functionality;testing-yahoo-hook",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "open yahoo on chrom",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "click on signup button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "signup page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "TagTest.open_yahoo_on_chrom()"
});
formatter.result({
  "duration": 18533956600,
  "status": "passed"
});
formatter.match({
  "location": "TagTest.click_on_signup_button()"
});
formatter.result({
  "duration": 367949900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027uh-signin\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.117)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-INQUNRP\u0027, ip: \u0027192.168.181.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Faruq\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 79.0.3945.117, webStorageEnabled: true}\nSession ID: 82d91a26f7d966c5a74b13a05c9d08df\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027uh-signin\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.FB.CucumberFB.StepDefination.TagTest.click_on_signup_button(TagTest.java:58)\r\n\tat ✽.When click on signup button(tag.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TagTest.signup_page_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 700976800,
  "status": "passed"
});
formatter.before({
  "duration": 3564967800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Testing google hook",
  "description": "",
  "id": "testing-cucumber-functionality;testing-google-hook",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@regressional"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "open google and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "enter cucumber tag on search button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "should land on serch page",
  "keyword": "Then "
});
formatter.match({
  "location": "TagTest.open_google_and_start_application()"
});
formatter.result({
  "duration": 11095992500,
  "status": "passed"
});
formatter.match({
  "location": "TagTest.enter_cucumber_tag_on_search_button()"
});
formatter.result({
  "duration": 5800896400,
  "status": "passed"
});
formatter.match({
  "location": "TagTest.should_land_on_serch_page()"
});
formatter.result({
  "duration": 821882700,
  "status": "passed"
});
formatter.after({
  "duration": 1211523300,
  "status": "passed"
});
formatter.before({
  "duration": 3231699000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Testing ebay hook   #amazon",
  "description": "",
  "id": "testing-cucumber-functionality;testing-ebay-hook---#amazon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@functional"
    },
    {
      "line": 21,
      "name": "@regressional"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "open amazon application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "click on todays deal",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "should land on serch todays page.",
  "keyword": "Then "
});
formatter.match({
  "location": "TagTest.open_amazon_application()"
});
formatter.result({
  "duration": 27518885900,
  "status": "passed"
});
formatter.match({
  "location": "TagTest.click_on_todays_deal()"
});
formatter.result({
  "duration": 4073782100,
  "status": "passed"
});
formatter.match({
  "location": "TagTest.should_land_on_serch_todays_page()"
});
formatter.result({
  "duration": 790822800,
  "status": "passed"
});
formatter.after({
  "duration": 816448800,
  "status": "passed"
});
});