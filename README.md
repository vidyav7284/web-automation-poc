# Web Automation BDD POC using Selenium + Cucumber + TestNG

This project demonstrates BDD automation using:
- Cucumber (Gherkin syntax)
- Selenium WebDriver
- TestNG
- Java + Maven

---

## 📌 Feature: Add to Cart Functionality

```gherkin
Scenario: Validate adding an item to the cart from start to end
    Given the user is on the home page
    When the user selects "Kindle Store" from the category
    And clicks on the search icon
    And selects the checkbox for KindleUnlimitedEligible
    And sorts the results by "Best Sellers"
    And clicks on the first book in the results
    And clicks on the addCart button
    Then the book should be added to the cart
```

---

## ▶️ Run the Tests

Use the following command in the terminal:

```bash
mvn test
```

---

## 📁 Project Name

`web-automation-poc`


---
## 📊 Test Report

![Test Report Screenshot](media/report.png)

## 🎥 Demo Video

[▶️ Click here to watch the demo video](media/demo.mp4)
## 📝 License

Copyright [2024] [Vidya]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
