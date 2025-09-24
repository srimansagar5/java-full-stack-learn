🚀 Java Project Setup with IntelliJ IDEA
Welcome! This guide will help you set up IntelliJ IDEA Community Edition and run your first Java program 🎉

🛠️ What You Need
    Windows 10/11
    Internet connection
    JDK 17 (or higher)

🔽 Install IntelliJ IDEA
    Download 👉 IntelliJ IDEA Community Edition
    Run the .exe → Click Yes
    Installation wizard steps:
        Destination Folder → Default is fine
        Options to enable ✅
            Create Desktop Shortcut
            Update PATH variable (restart needed)
            Add "Open Folder as Project"
            File Associations: .java, .gradle, .groovy, .pom
    Click Install → Reboot (if required)

⚙️ First Launch Setup
    Accept License Agreement
    Skip data sharing
    Skip import settings (e.g., from VS Code)
    Click New Project (+)

📦 Create Your First Project
    Language → Java
    Project Name → FirstJava
    Location → Choose your folder (default is ~/IdeaProjects)
    Build System → IntelliJ (default), Maven, or Gradle
    JDK → Select JDK 17 (download if missing)
    Hit Create ✅

👨‍💻 Hello World!
    Inside FirstJava/src create a file HelloWorld.java:

    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, Vidya’s Java Journey! 🚀");
        }
    }


▶️ Run → You should see:
    Hello, Vidya’s Java Journey! 🚀

📌 Done!
    You now have:
        IntelliJ IDEA installed
        Java project created
        First program running 🎉

Next step → Start exploring OOP basics (Classes, Objects, Inheritance).

Happy coding ✨

# Week 1 Day 2

## Variables

* **Common variables**: `String`, `int`, `double`, `boolean`
* **Primitive data types**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
* **Non-Primitive data types**: `String`, `Array`, and `Classes`

## Type Casting

* **Widening Casting (implicit)**: converting smaller type → larger type size
* **Narrowing Casting (explicit)**: converting larger type → smaller type size

## Conditional Statements

* `if`, `if-else`, `if-else-if`
* `switch`

## Loops

* `for` loop
* `while` loop

## Examples for Practice

1. Display student details using different data types.
2. Display even and odd numbers using a `for` loop and `if-else` condition.
3. Display weekdays using a `switch` case.


# Week 1 Day 3 – Classes & Objects

## Topics Covered
- **Fields (Attributes/Instance Variables)**  
  Variables declared inside a class that hold object data.

- **Constructor**  
  Special method used to initialize objects when created using `new`.

- **Static Methods**  
  Belong to the class, not to individual objects. Called using the class name.

- **Public Methods**  
  Define the behavior of the class. Invoked by objects.

- **Using `this` Keyword**  
  Refers to the current object. Useful when parameter names and field names overlap.

- **Creating Multiple Objects with Different Arguments**  
  Demonstrates how different objects can have their own state and behavior.

---

## Examples & Practice

### 1. **Calculator**
- Fields: `value1`, `value2`
- Methods: `add()`, `subtract()`, `multiply()`, `divide()`
- Practice: Create different calculator objects and test all operations.

### 2. **Bank Account**
- Fields: `accountNumber`, `balance`
- Methods: `deposit()`, `withdraw()`
- Practice: Deposit and withdraw from the account, print updated balance.

### 3. **Employee**
- Fields: `id`, `name`, `basicSalary`
- Methods: `calculateAnnualSalary()`
- Practice: Display employee details with calculated annual salary.

### 4. **Student**
- Fields: `name`, `age`, `grade`
- Methods: `displayDetails()`
- Practice: Create multiple student objects and display their details.

### 5. **Car**
- Fields: `brand`, `model`, `year`
- Methods: `start()`
- Practice: Create multiple car objects and call the `start()` method.

---

## Mini Challenges
1. Create 3 student objects with different details and display them.
2. Create a bank account object, deposit money twice, withdraw once, and print final balance.
3. Add 2 employees and compare who has the higher annual salary.
4. Create 2 cars and call the `start()` method for each.
5. Use the Calculator to divide numbers and handle division by zero safely.

---

## Learning Outcomes
- Understand **class structure** in Java.
- Differentiate between **fields, constructors, and methods**.
- Learn to use the **`this` keyword**.
- Gain confidence in creating and manipulating multiple objects.  

