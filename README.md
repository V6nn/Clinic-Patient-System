# Clinic Patient Information System

## Project Overview

The **Clinic Patient Information System** is a Java-based application to manage patient information and consultations.  
It uses **SQLite** as the database and follows a **layered architecture** for better maintainability and teamwork.

---

## Project Structure & Folder Purpose

| Folder / File | Purpose | Notes |
|---------------|---------|-------|
| **Database**  | Handles database connection and table creation | `DatabaseConnection.java` connects to `clinic.db`; `DatabaseSetup.java` creates tables like `patients` and `visits` |
| **Model**     | Represents data in Java objects | `Patient.java` defines patient fields; `Visit.java` defines visit fields |
| **DAO**       | Performs CRUD operations (Create, Read, Update, Delete) | `PatientDAO.java` adds, edits, searches patients; `VisitDAO.java` manages visit records |
| **UI / Main** | Handles user interaction | `Main.java` is the entry point; menus and inputs can be handled in `ConsoleUI.java` |

---

## Data Flow

1. **User Input (UI):** User interacts with the system through console menus (or GUI later).  
2. **Model:** Input data is converted into Java objects (e.g., `Patient`).  
3. **DAO Layer:** The DAO class receives the object and performs database operations.  
4. **Database:** Data is saved or retrieved from `clinic.db`.  
5. **UI Layer:** Data retrieved from the database is displayed back to the user.

---

## Core Features

- Add a patient  
- Edit patient information  
- View patient information  
- Add visit/consultation record (optional)  
- Search for a patient  
- Print reports (optional)

---

## Flowchart - Data Flow
`User → UI → Patient object → PatientDAO → Database → UI`
