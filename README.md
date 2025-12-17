# Simple Banking System (Java)

## Overview
A command-line banking system implemented in Java.  
Users can create accounts, deposit and withdraw money, check balances, and view transaction history.  
The project demonstrates **object-oriented programming**, **data persistence using serialization**, and a simple **CLI interface**.

## Features
- Create accounts with unique account numbers
- Deposit and withdraw funds with validation
- View account balance
- Track transaction history
- Save and load bank data persistently (`bank-data.ser` file)

## Technologies
- Java 8+
- Serialization for saving/loading account data
- Command-line interface

## How to Run
1. Make sure you have **Java installed** on your system (JDK 8+).  
2. Open a terminal/command prompt and navigate to the **project root folder** (the folder that contains `src/`).  
3. Compile all Java files:
   ```bash
   javac -d bin src/bank/*.java
