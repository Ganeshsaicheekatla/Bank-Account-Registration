**Bank Account Registration System**


This project is a Spring Boot application that simulates a bank account registration system, enabling users to create and manage multiple types of accounts (Savings and Current) while maintaining a list of accounts associated with a user. It demonstrates the implementation of Spring concepts like dependency injection, bean management, annotations, and scopes.

**Key Features:**

User Management: Allows users to register their details and manage their accounts.

Account Management: Supports two types of accounts – Savings and Current. Each account can be initialized with an opening balance, and subsequent balances can be added.

Dependency Injection: Leveraged Spring's dependency injection to manage beans, including User, SavingsAccount, and CurrentAccount.

Component Scanning and Annotations: Utilized @Component, @Scope, @PostConstruct, and @PreDestroy annotations for lifecycle management and prototype or singleton scoping.

Console-based User Interaction: User input is handled using a scanner to create and manage accounts dynamically.

**Entity Details:**

Savings Account: Holds and manages user savings with balance addition functionality.

Current Account: Manages user current accounts with similar functionality.

User Object: Maintains user details and associated accounts list.

**Technical Highlights**

Spring Boot Framework: Simplifies application setup and execution with @SpringBootApplication.

Java-based Configuration: Managed beans and their lifecycle using Java annotations and Spring's application context.

List Management: Dynamic list for storing and retrieving user accounts.

Lifecycle Hooks: Implemented lifecycle methods (@PostConstruct, @PreDestroy) for beans.

**Scope Management:**

Singleton for User (@Scope("singleton")).

Prototype for Accounts (@Scope("prototype")).


![image](https://github.com/user-attachments/assets/3436f18c-4efd-4dad-a055-c282354e028f)
