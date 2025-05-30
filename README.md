

# 🧪 Web Automation POC

A Proof of Concept (POC) for end-to-end **web automation testing** using **Selenium**, **Cucumber BDD**, **TestNG**, and the **Page Object Model (POM)**. This project simulates a real-world e-commerce flow — validating the *Add to Cart* functionality — and is structured to be readable, reusable, and scalable.

🔗 **GitHub Repository:** [web-automation-poc](https://github.com/vidyav7284/web-automation-poc)

---

## 📸 Project Execution Report

![Demo Screenshot](https://github.com/user-attachments/assets/58a45044-2c70-4f48-a988-357bb421d26c)


## 🎥 Automation Flow (GIF)

![Automation Flow](https://github.com/user-attachments/assets/250ffd14-ab1e-4f3c-9da2-8420b32349cf)



---

## 🚀 Features

✅ Automates an end-to-end **Amazon Add to Cart** user journey
✅ Built using **Page Object Model (POM)** for better code organization
✅ Uses **Cucumber** to define test scenarios in plain English (Gherkin)
✅ Uses **TestNG** for test execution and reporting
✅ **Reusable components** and modular test steps
✅ Includes **assertions** and validations for robustness
✅ Can be easily integrated into **CI/CD** pipelines
✅ Simple to set up and run using **Maven**
✅ Structured for **cross-browser** compatibility (Selenium Grid ready)
✅ Clean code and naming conventions for readability

---

## 🔧 Technologies Used

| Tool/Library     | Purpose                       |
| ---------------- | ----------------------------- |
| **Java**         | Programming Language          |
| **Selenium**     | Web Automation Framework      |
| **Cucumber BDD** | Behavior Driven Testing       |
| **TestNG**       | Test Framework                |
| **Maven**        | Dependency & Build Management |
| **Eclipse IDE**  | Development Environment       |
| **Gherkin**      | Feature File Language         |

---

🗂️ Project Structure
<pre> web-automation-bdd-poc/ ├── src/ │ ├── main/java/ │ │ ├── drivermanager/ │ │ │ └── DriverFactory.java │ │ ├── pages/ │ │ │ ├── AddItemPage.java │ │ │ └── BasePage.java │ │ ├── utility/ │ │ │ └── ReadProp.java │ │ └── PageFactoryManager.java │ │ ├── test/java/ │ │ ├── addcardfeature/ │ │ │ ├── AddItemToCardRunner.java │ │ │ ├── AddItemToCardSteps.java │ │ │ └── AppHooks.java │ ├── src/test/resources/ │ ├── addcardfeature/ │ │ └── AddItemToCard.feature │ ├── config.properties ├── pom.xml └── README.md </pre>
---

## 📋  Feature File

```gherkin
Feature: Add to Cart Functionality

  Scenario: Validate adding an item to the cart from start to end
    Given the user is on the home page
    When the user selects "Kindle Store" from the category
    And clicks on the search icon
    And selects the checkbox for KindleUnlimitedEligible
    And sorts the results by "Best Sellers"
    Then the user adds the first item to the cart
    And verifies the item is added successfully
```

---

## 🧪 How to Run Locally

### 1. Clone the repository

```bash
git clone https://github.com/vidyav7284/web-automation-poc.git
```

### 2. Import into Eclipse

* Open Eclipse.
* File → Import → Existing Maven Project → Select folder.

### 3. Install dependencies

Maven will automatically resolve dependencies from `pom.xml`.

### 4. Execute Tests

* Run the `TestNG` suite or a specific runner class.
* You can also run via command line:

```bash
mvn test
```

---

## ✅ Best Practices Followed

* ✅ Page Object Model (POM)
* ✅ Layered architecture (Test → Steps → Pages)
* ✅ Reusable selectors and methods
* ✅ Descriptive method and class names
* ✅ Gherkin language for human-readable tests

---

## 📎 Resources

* [Selenium Documentation](https://www.selenium.dev/documentation/)
* [Cucumber Docs](https://cucumber.io/docs/)
* [TestNG Docs](https://testng.org/doc/)
* [Maven Guide](https://maven.apache.org/guides/index.html)

---

## 📄 License

This project is licensed under the [Apache 2.0 License](LICENSE).

---

## 👤 Author

**Vidya Vanjare**  
📧 v.vanjare@gmail.com
📎 [LinkedIn](https://www.linkedin.com/in/vidya-vanjare)  
