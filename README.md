# 🚆 Train Consist Management App

<p align="center">
<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/OOP-Java-blue?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Search-Linear%20Search-success?style=for-the-badge"/>
</p>

<h1 align="center">🚄 Train Consist Management App</h1>

<p align="center">
A simple Java application for managing train consist data and searching bogie IDs using the Linear Search algorithm.
Designed as an educational project to demonstrate Java fundamentals, arrays, user input, methods and searching techniques.
</p>

---

## 📖 About

This project simulates a small train consist management system.

Users enter the number of bogies, provide each bogie ID, and search for a specific bogie. The application uses the **Linear Search algorithm** to determine whether the requested bogie exists.

The project demonstrates:

- Java programming
- Arrays
- Methods
- Scanner input
- Linear Search
- Time complexity analysis

---

## ✨ Features

- 🚆 Store train bogie IDs
- 🔍 Linear Search implementation
- 💻 Console based interface
- ⚡ Early termination when match is found
- 📚 Beginner friendly code

---

## 🏗 Workflow

```text
Start
  │
Enter Number of Bogies
  │
Store Bogie IDs
  │
Enter Search ID
  │
Linear Search
  │
Found ? ── Yes → Display Found
   │
   No
   ▼
Display Not Found
```

---

## 📂 Project Structure

```text
Train-Consist-Management-App/
│
├── App/
│   └── src/
│       └── TrainConsistManagementApp.java
└── README.md
```

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Core language |
| Scanner | User Input |
| Arrays | Store bogie IDs |
| Linear Search | Search algorithm |

---

## 🧠 Algorithm

```java
for each bogie
    if bogie.equals(searchKey)
        return true;
return false;
```

**Time Complexity:** O(n)

**Space Complexity:** O(1)

---

## ▶️ Run

```bash
javac TrainConsistManagementApp.java
java TrainConsistManagementApp
```

Example:

```text
Enter number of bogies: 4
B1
B2
B3
B4

Search: B3

Bogie ID found in the consist.
```

---

## 📌 Learning Outcomes

- Java syntax
- Methods
- Arrays
- Searching algorithms
- Console applications

---

## 🚀 Future Improvements

- GUI using JavaFX/Swing
- Database integration
- Sorting algorithms
- Coach management
- Train scheduling
- CRUD operations

---

## 👨‍💻 Author

**Madeshwaran**

🎓 B.Tech Artificial Intelligence

🏫 SRM Institute of Science and Technology

🌐 https://madesh2247.github.io/portfolio-website/

💻 https://github.com/Madesh2247

---

## ⭐ Support

If you like this project:

⭐ Star this repository

🍴 Fork it

💡 Suggest improvements

🐞 Report issues

---

<p align="center">
Made with ❤️ by <strong>Madeshwaran</strong>
</p>
