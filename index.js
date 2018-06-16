const {Builder, By, Key, until} = require('selenium-webdriver');

(async function example() {
  let driver = await new Builder().forBrowser('safari').build();
  try {
    await driver.get('http://www.google.com.vn');

    await driver.findElement(By.name('q')).sendKeys('webdriver');
    await driver.wait(until.titleIs('Google'), 1000);
    await console.log("Hello world!!");
  } finally {
    await console.log("success!!!!");
    await driver.sleep(2000);
    await driver.quit();
  }
})();