# core jave practice code

⚠️ **Note:** The complete source code is available in other branches of this repository.  
Please checkout the required branch
  
from fastapi import FastAPI
import sqlite3

app = FastAPI()

# ----------------------------
# Database Helper
# ----------------------------
def get_connection():
    return sqlite3.connect("student.db")

# Create table at startup
def create_table():
    con = get_connection()
    cur = con.cursor()
    cur.execute("""
        CREATE TABLE IF NOT EXISTS student (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT,
            age INTEGER
        )
    """)
    con.commit()
    con.close()

create_table()


# ----------------------------
# API Endpoints
# ----------------------------

@app.get("/")
def home():
    return {"message": "Student API is running!"}


# Create student
@app.post("/students")
def add_student(name: str, age: int):
    con = get_connection()
    cur = con.cursor()
    cur.execute("INSERT INTO student (name, age) VALUES (?, ?)", (name, age))
    con.commit()
    con.close()
    return {"message": "Student added successfully!"}


# Get all students
@app.get("/students")
def get_students():
    con = get_connection()
    cur = con.cursor()
    cur.execute("SELECT * FROM student")
    rows = cur.fetchall()
    con.close()
    return {"students": rows}


# Update student age
@app.put("/students/{student_id}")
def update_age(student_id: int, age: int):
    con = get_connection()
    cur = con.cursor()
    cur.execute("UPDATE student SET age = ? WHERE id = ?", (age, student_id))
    con.commit()
    con.close()
    return {"message": "Student age updated!"}


# Delete student
@app.delete("/students/{student_id}")
def delete_student(student_id: int):
    con = get_connection()
    cur = con.cursor()
    cur.execute("DELETE FROM student WHERE id = ?", (student_id,))
    con.commit()
    con.close()
    return {"message": "Student deleted!"}
