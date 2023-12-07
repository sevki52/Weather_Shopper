$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/moisturizers.feature");
formatter.feature({
  "name": "Selection",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Selection of protection",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "WeatherShopper.Steps_Definitions.MoisturizersStepsDef.user_is_on_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user checks the temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherShopper.Steps_Definitions.MoisturizersStepsDef.the_user_checks_the_temperature()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the products in the moisturizers or sunscreens product page according to the temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherShopper.Steps_Definitions.MoisturizersStepsDef.the_user_selects_the_products_in_the_moisturizers_or_sunscreens_product_page_according_to_the_temperature()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[contains(text(),\u0027emmanuel aloe vera beauty gel\u0027)]/ancestor::div[@class\u003d\u0027container\u0027]\"}\n  (Session info: chrome\u003d120.0.6099.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AYSUNs-MBP.fritz.box\u0027, ip: \u0027fd00:0:0:0:1cd9:9494:cd61:df8d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 120.0.6099.62, chrome: {chromedriverVersion: 120.0.6099.71 (9729082fe617..., userDataDir: /var/folders/nr/y4b6kgxs4ks...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:65224}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: dda85cec477e755f72517ea43010ff94\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(text(),\u0027emmanuel aloe vera beauty gel\u0027)]/ancestor::div[@class\u003d\u0027container\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat WeatherShopper.Pages.ProductPage.selectMoisturizer(ProductPage.java:53)\n\tat WeatherShopper.Steps_Definitions.MoisturizersStepsDef.the_user_selects_the_products_in_the_moisturizers_or_sunscreens_product_page_according_to_the_temperature(MoisturizersStepsDef.java:51)\n\tat ✽.the user selects the products in the moisturizers or sunscreens product page according to the temperature(file:///Users/aysunoksuz/Downloads/Weather_Shopper/src/test/resources/Features/moisturizers.feature:7)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});