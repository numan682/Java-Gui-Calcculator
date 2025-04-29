# 🧮 GUI Calculator By Numan

A simple Java-based GUI calculator built using **Java Swing**. This calculator performs basic arithmetic operations like addition, subtraction, multiplication, and division. The code uses unique and clean class/variable names to keep it original and beginner-friendly.

---

## 📸 Preview

![calculator screenshot](https://github.com/numan682/Java-Gui-Calcculator/blob/main/java-gui-calc.png?raw=true)

---

## 🚀 Features

- ✅ User-friendly interface
- ✅ Basic arithmetic: `+`, `-`, `*`, `/`
- ✅ Clear (`C`) and Result (`=`)
- ✅ Custom and readable code (no generic AI names)
- ✅ Written with plain Java (no extra libraries)

---

## 🛠 How It Works

This project uses Java Swing for GUI rendering. Below is a simple breakdown:

| Component | Description |
|----------|-------------|
| `JFrame` | Main window |
| `JTextField` | Shows input and result |
| `JButton` | Used for digits and operations |
| `GridLayout` | Arranges the calculator buttons in a 4x4 grid |
| `ActionListener` | Detects button clicks and handles logic |

### 🔄 Calculation Logic
- Numbers are stored in two variables: `num1` and `num2`.
- A `mathSign` string holds the selected operation.
- When `=` is clicked, the app calculates and displays the result.
- Pressing `C` resets everything.

---

## 💻 How to Run in VS Code

1. ✅ **Install Java JDK**: [Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
2. ✅ **Install VS Code Extensions**:
   - "Extension Pack for Java" by Microsoft
3. ✅ **Create File**:
   - Save the code in a file named `calc.java`
4. ✅ **Open Terminal in VS Code** and run:
   ```bash
   javac calc.java
   java calc
