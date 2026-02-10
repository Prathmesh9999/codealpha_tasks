# 📈 Stock Trading Platform

## 📌 Project Overview

The **Stock Trading Platform** is a console-based Java simulation of a stock market environment.

It allows users to buy and sell stocks, track holdings, and monitor portfolio performance with simulated market price fluctuations.

---

## 🚀 Features

* 📊 Market data display
* 💹 Buy stocks
* 💱 Sell stocks
* 📁 Portfolio tracking
* 🧾 Transaction history
* 📈 Portfolio valuation
* 💾 Optional file persistence

---

## 🧱 Tech Stack

* Core Java
* OOP Design
* Collections Framework
* File I/O
* Java Time API

---

## 📁 Project Structure

```
com
├── app        → Main trading console
├── bean       → Entities (Stock, Holding, User)
├── service    → Trading logic
├── data       → Market & user storage
└── util       → File utilities
```

---

## 🏗️ System Design

### Entities

* Stock
* User
* Holding
* Transaction

### Enum

* TransactionType (BUY / SELL)

### Services

* MarketService → Market data & price updates
* TradingService → Buy / Sell operations
* PortfolioService → Performance tracking

---

## 📊 Market Simulation

Stock prices fluctuate dynamically using randomized updates to simulate real market behavior.

---

## 💼 Portfolio Tracking

System calculates:

* Holdings per stock
* Average buy price
* Current valuation
* Total portfolio worth

---

## ▶️ How to Compile & Run (Windows CMD)

From project root:

```
javac -d out com\app\*.java com\bean\*.java com\service\*.java com\data\*.java com\util\*.java
java -cp out com.app.TradingApp
```

---

## 🧪 Sample Workflow

1. View market data
2. Buy stocks
3. Prices fluctuate
4. Sell stocks
5. Track portfolio value

---

## 📚 OOP Concepts Used

* Encapsulation
* Composition
* Layered architecture
* Enum modeling
* Serialization

---

## 🔮 Future Enhancements

* Wallet balance integration
* Profit / Loss analytics
* Graph performance charts
* JDBC database storage
* REST API version
