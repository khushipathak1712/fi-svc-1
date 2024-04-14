# Financial Insights Service (Fi-Svc-1)

The Financial Insights Service (Fi-Svc-1) is a web application that allows users to input their financial transactions and get insights into their spending habits. It provides a simple UI for inputting transactions and viewing insights.

## Features

- Transaction Input Screen: Allows users to input transaction details such as date, amount, category, and description.
- Insights Screen: Displays basic insights, such as total spending per category.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Thymeleaf (for server-side HTML rendering)
- HTML/CSS (for frontend)
- Gradle (for dependency management)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Gradle installed

### Installation

1. Clone the repository:
   git clone https:https://github.com/khushipathak1712/fi-svc-1.git

   
2. Navigate to the project directory:


3. Build the project using Gradle:


4. Run the application:


The application will be accessible at `http://localhost:8080`.

### Usage

1. Transaction Input Screen:
   - Access the transaction input form by visiting `http://localhost:8080/transactionForm`.
   - Enter the transaction details (date, amount, category, description) and submit the form.

2. Insights Screen:
   - View insights by visiting `http://localhost:8080/insights`.
   - Insights will display total spending per category based on the stored transactions.

## Database Schema

The application uses an H2 in-memory database. The schema is automatically generated based on the `Transaction` entity.

## Folder Structure

financial-insights-service/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── yourcompany/
│ │ │ └── financialinsights/
│ │ │ ├── controller/
│ │ │ │ └── TransactionController.java
│ │ │ ├── model/
│ │ │ │ └── Transaction.java
│ │ │ ├── repository/
│ │ │ │ └── TransactionRepository.java
│ │ │ ├── service/
│ │ │ │ └── TransactionService.java
│ │ │ └── Application.java
│ │ │
│ │ └── resources/
│ │ ├── static/
│ │ │ └── css/
│ │ │ └── styles.css
│ │ ├── templates/
│ │ │ ├── insights.html
│ │ │ └── transactionForm.html
│ │ └── application.properties
│ │
│ └── test/
│ └── java/
