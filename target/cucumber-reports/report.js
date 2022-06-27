$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/carvana.feature");
formatter.feature({
  "name": "Carvana Functionalities",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Validate CAR FINDER menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://www.carvana.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"CAR FINDER\" menu item",
  "keyword": "When "
});
formatter.match({
  "location": "CarvanaSteps.userClicksOnMenuItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to \"https://www.carvana.com/help-me-search/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CarvanaSteps.userShouldBeNavigatedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"WHAT CAR SHOULD I GET?\" text",
  "keyword": "And "
});
formatter.match({
  "location": "CarvanaSteps.userShouldSeeText(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: An invalid or illegal selector was specified\n  (Session info: chrome\u003d102.0.5005.115)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-5SV0R4LA\u0027, ip: \u0027192.168.165.88\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\datab\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60050}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 11e2e16b04e33403b9728f625ec030c6\n*** Element info: {Using\u003dcss selector, value\u003d//h1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat steps.CarvanaSteps.userShouldSeeText(CarvanaSteps.java:59)\r\n\tat ✽.user should see \"WHAT CAR SHOULD I GET?\" text(src/test/resources/features/carvana.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should see \"Car Finder can help! Answer a few quick questions to find the right car for you.\" text",
  "keyword": "And "
});
formatter.match({
  "location": "CarvanaSteps.userShouldSeeText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see \"TRY CAR FINDER\" link",
  "keyword": "And "
});
formatter.match({
  "location": "CarvanaSteps.userShouldSeeLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on \"TRY CAR FINDER\" link",
  "keyword": "When "
});
formatter.match({
  "location": "CarvanaSteps.userClicksOnLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be navigated to \"https://www.carvana.com/help-me-search/qa\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CarvanaSteps.userShouldBeNavigatedTo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see \"WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?\" text",
  "keyword": "And "
});
formatter.match({
  "location": "CarvanaSteps.userShouldSeeText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see \"Select up to 4 in order of importance\" text",
  "keyword": "And "
});
formatter.match({
  "location": "CarvanaSteps.userShouldSeeText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});