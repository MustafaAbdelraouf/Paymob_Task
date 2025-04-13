# E2E Magento Automation

This project is an end-to-end (E2E) automation testing suite for the Magento website. The tests are written using Java, Selenium WebDriver, and TestNG to automate the following tasks:

- Register a new user on the Magento platform.
- Login with the registered user.
- Add two products to the compare list.
- Open the compare list and verify the added products.



## Features
- Register a new user on Magento.
- Login to the platform using the newly created credentials.
- Add two products to the compare list.
- Open and verify the compare list

---

## Technologies Used
- **Java**: Core programming language.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: Test execution framework.
- **Maven**: Dependency management.
- **Page Object Model**: (POM): For better code maintainability and reusability.

---

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or above.
- **Maven**: Installed and configured.
- **IntelliJ IDEA** or any IDE with Maven support.
- A browser (e.g., Chrome) and its corresponding WebDriver.

---

## Installation and Setup
1. Clone this repository:
   ```bash
   git clone https://github.com/MustafaAbdelraouf/Paymob_Task.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Paymob_Task
   ```
3. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```
4. Update the `config.properties` file in the `resources` folder:
    - Set the `baseURL` to the Magento website URL.
    - Provide the browser name and WebDriver path.

---

## Running Tests
1. **Using Maven**:
   Execute the following command to run all test scenarios:
   ```bash
   mvn test
   ```
2. **Using IntelliJ IDEA**:
    - Open the project in IntelliJ.
    - Navigate to the test class (Magento_Test) in the Magento folder.
    - Run the test using the green play button.

---

## Project Structure
- **src/main/java**: Contains the reusable pages and base setup.
    - `Pages`: Page Object Models for RegisterPage and LoginPage and    HomePage
    - `Base`: Base test setup for browser and WebDriver.
- **src/test/java**: Contains test cases and step definitions.
    - `Tests`: Core test scenarios like registration, login, and adding products to compare list.


- **resources**: Configuration files and property settings.

---

## Key Test Scenarios
### Registration Test:
- Open the Magento login page.
- Navigate to the registration page.
- Create a new user with valid details.
- Verify the user is successfully registered.

### Login Tests:
- Login with the newly created credentials.
- Verify successful login by checking if the homepage is loaded.

### Product Comparison:
- Navigate to the product selection page.
- Add two products to the compare list.
- Open the compare list and verify the two products are present.
---

## Known Issues
- Hardcoded data like usernames and passwords.
- Usage of `Thread.sleep()`, which can be replaced with explicit waits for better reliability.

---

## Future Improvements
- Use a data-driven approach to test with multiple sets of inputs.
- Replace `Thread.sleep()` with Selenium explicit waits.
- Enhance the framework to include parallel test execution.

---

## Author
**Mustafa Abdelraouf**

For any queries, feel free to reach out through GitHub.

---
