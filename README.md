# OpenCart Test Automation

## Description

Web test automation project for the OpenCart website using Selenium WebDriver,
Cucumber, Java and the Page Object Model (POM).

The project was developed as part of a software testing training internship.

## Testing Process

The project started with the analysis of User Stories from the Backlog.
Test cases were designed and executed using Zephyr/Jira, and identified
defects were reported through bug tickets.

The selected test scenarios were then automated using Selenium WebDriver,
Cucumber and Java.

## Automated Tests

The project covers:

- Login
- Product search
- Add products to cart
- Remove products from cart
- Checkout
- Logout

## Automation Techniques

- Selenium WebDriver
- Java
- Cucumber / BDD
- Page Object Model (POM)
- PageFactory / @FindBy
- Cucumber Background
- Hooks (@Before / @After)
- Explicit Waits
- JUnit

## Project Structure

src
├── test
│   ├── java
│   │   ├── hooks
│   │   ├── page_factory
│   │   ├── runner
│   │   └── step_definitions
│   │
│   └── Resources
│       └── features

## Tools

- IntelliJ IDEA
- Maven
- Selenium WebDriver
- Cucumber
- JUnit
- Zephyr/Jira
- Microsoft Edge

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Install Maven dependencies
4. Configure the required test credentials
5. Run `TestRunner`

## Author

Saifeddine Maghrebi