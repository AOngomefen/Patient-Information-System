# 🏥 MedRecord Core — Patient Information System

> *A structured, object-oriented Java application for managing patient records and medical procedure data.*

---

## 📋 Overview

**MedRecord Core** is a Java-based Patient Information Management System built around clean object-oriented design principles. The system models real-world healthcare data — patients and their associated medical procedures — using encapsulated classes, multi-parameter constructors, and formatted output pipelines.

Designed as a demonstration of foundational OOP architecture in Java, this project showcases how scalable, maintainable software systems are structured from the ground up.

---

## ✨ Features

- 🧑‍⚕️ **Patient Record Management** — Store and retrieve full patient profiles including name, address, phone, and emergency contact
- 🩺 **Procedure Tracking** — Log medical procedures with date, practitioner, and charge data
- 💰 **Automated Charge Aggregation** — Dynamically compute total procedure costs using parsed charge data
- 🔒 **Full Encapsulation** — All fields are private with dedicated getters and setters
- 📄 **Formatted Output** — Clean, readable `toString()` representations for all entities
- 🧪 **Comprehensive Test Cases** — 4 structured test cases covering edge cases, empty inputs, and full data flows

---

## 🗂️ Project Structure

```
MedRecord-Core/
├── src/
│   ├── Patient.java       # Patient entity class with 10-field constructor
│   ├── Procedure.java     # Procedure entity class with charge tracking
│   └── Demo.java          # Main driver — instantiates objects & runs output
├── docs/
│   └── Assignment2_Documentation.pdf  # UML diagram, pseudocode & test plan
└── README.md
```

---

## 🧱 Architecture

### `Patient.java`
Models a hospital patient with full personal and emergency contact information.

| Field | Type | Description |
|---|---|---|
| `fName`, `mName`, `lName` | `String` | Full name |
| `street`, `city`, `state`, `zip` | `String` | Mailing address |
| `phone` | `String` | Primary contact number |
| `emergencyName`, `emergencyPhone` | `String` | Emergency contact |

### `Procedure.java`
Models a medical procedure associated with a patient visit.

| Field | Type | Description |
|---|---|---|
| `procedureName` | `String` | Name of the procedure |
| `procedureDate` | `String` | Date performed |
| `practitioner` | `String` | Attending physician |
| `charges` | `String` | Procedure cost (parseable to `double`) |

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or terminal

### Run Locally

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/medrecord-core.git
cd medrecord-core

# Compile
javac src/*.java -d out/

# Run
java -cp out/ Demo
```

---

## 🖥️ Sample Output

```
----------------------------------------------------------------------------------------------------
Welcome to the Patient Information System!
----------------------------------------------------------------------------------------------------

Patient Name: Marcus J Williams
Address: 456 Elm Street, Houston, TX 77001
Phone: 713-555-2847
Emergency Contact: Diane Williams
Emergency Phone: 713-555-9931

Procedure Name: X-Ray
Procedure Date: 04/27/2026
Practitioner: Dr. Smith
Charges: 250.00

Procedure Name: Blood Test
Procedure Date: 04/27/2026
Practitioner: Dr. Jones
Charges: 150.00

Procedure Name: MRI
Procedure Date: 04/27/2026
Practitioner: Dr. Lee
Charges: 1200.00

Total Charges: $1,600.00
```

---

## 🧪 Test Plan Summary

| Case | Input | Expected Output | Status |
|---|---|---|---|
| Case 1 | Empty string patient | No crash, empty fields | ✅ Pass |
| Case 2 | `toString()` on Patient & Procedure | Formatted string output | ✅ Pass |
| Case 3 | 3 Procedures + `getCharges()` | Total = `$1,600.00` | ✅ Pass |
| Case 4 | Setters with empty strings | All fields reset to `""` | ✅ Pass |

---

## 📐 UML Design

Designed following standard UML class diagram conventions with:
- **Private fields** (denoted `-`)
- **Public constructors, getters, setters, and helper methods** (denoted `+`)
- Clear separation between `Patient` and `Procedure` entities

See `/docs/Assignment2_Documentation.pdf` for the full diagram.

---

## 💡 Lessons Learned

- The critical role of **`this.`** in constructor field assignment
- How **encapsulation** via getters and setters protects object integrity
- How **object modeling** simplifies real-world data representation
- Java's **`printf` formatting** for currency output (`%,.2f`)

---

## 👩‍💻 Author

**Andrea Ongomefen**
CMSC203 — CRN 31776 | Prof. Tanveer
© 2026 — Built with Java ☕

---

> *"Building objects can simplify data recording — and the process behind making a class."*
