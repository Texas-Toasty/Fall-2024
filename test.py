import sqlite3
import os

# Delete the existing database file if it exists
db_path = "names.db"
if os.path.exists(db_path):
    os.remove(db_path)

# Connect to the database (creates it if it doesn't exist)
conn = sqlite3.connect(db_path)
cur = conn.cursor()

# First table
cur.execute('''
    CREATE TABLE IF NOT EXISTS people (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        first_name TEXT,
        last_name TEXT
    )
''')

# List of names to insert
names_list = [
    ("Reggie", "White"),
    ("Ronnie", "Grey"),
    ("Isaac", "Newton"),
    ("Roger", "Daniel"),
    ("William", "Franklin")
]

# Insert names into the table
cur.executemany('''INSERT INTO people (first_name, last_name) VALUES (?, ?)''', names_list)

for row in cur.execute("SELECT * FROM people"):
    print(row)

print("-------------------")

cur.execute("SELECT * FROM people WHERE last_name=:c", {"c": "Daniel"})
name_search = cur.fetchall()
print(name_search)

# Second table
cur.execute('''
    CREATE TABLE IF NOT EXISTS details (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        age INT,
        profession TEXT
    )
''')

age_profession = [
    ("35", "Plumber"),
    ("32", "Electrician"),
    ("54", "Programmer"),
    ("22", "CEO"),
    ("40", "Maintenance")
]

cur.executemany("INSERT INTO details (age, profession) VALUES (?, ?)", age_profession)

print("-------------------")

for row in cur.execute("SELECT * FROM details"):
    print(row)

print("-------------------")

cur.execute("SELECT * FROM details WHERE age=:c", {"c": "22"})
job_search = cur.fetchall()
print(job_search)

print("-------------------")

for i in job_search:
    var = [name_search[4][0] if value == name_search[0][2] else value for value in i]
    print(var)

conn.commit()

# Close the cursor and the connection
cur.close()
conn.close()
