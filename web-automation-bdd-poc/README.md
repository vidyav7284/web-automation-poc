# Web Automation BDD POC using Selenium + Cucumber + TestNG

This project demonstrates BDD automation using:
- Cucumber (Gherkin syntax)
- Selenium WebDriver
- TestNG
- Java + Maven

## Feature: Add to Cart Functionality
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

## Run with:
```bash
mvn test
```
"# web-automation-poc" 
