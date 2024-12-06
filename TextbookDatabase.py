import sqlite3
import os

# Delete the existing database file if it exists (allows for test runs)
db_path = "textbooks.db"
if os.path.exists(db_path):
    os.remove(db_path)


def main():
    # Connect to the textbooks database (creates it if it doesn't exist)
    conn = sqlite3.connect("textbooks.db")
    cur = conn.cursor()

    # Create the book table
    cur.execute(''' 
        CREATE TABLE IF NOT EXISTS book (
            isbn TEXT PRIMARY KEY NOT NULL,
            publisher_id TEXT,
            author_id TEXT,
            title TEXT,
            print_date TEXT,
            price REAL
        )
    ''')

    # Create the publisher table
    cur.execute('''
        CREATE TABLE IF NOT EXISTS publisher (
            publisher_id TEXT PRIMARY KEY NOT NULL,
            pub_name TEXT,
            pub_city TEXT,
            pub_state TEXT,
            pub_zip TEXT
        )
    ''')

    # Create the author table
    cur.execute('''
        CREATE TABLE IF NOT EXISTS author (
            author_id TEXT PRIMARY KEY NOT NULL,
            first_name TEXT,
            last_name TEXT,
            author_address TEXT,
            author_city TEXT,
            author_state TEXT,
            author_zip TEXT
        )
    ''')

    # Insert rows into the book table
    books = [
        ('9780135929032', 'P001', 'A001', 'Python Fifth Edition', '2020', 103.45),
        ('9780135957059', 'P002', 'A002', 'Data Science Handbook', '2019', 89.99),
        ('9780135974446', 'P003', 'A003', 'Intro to Machine Learning', '2021', 120.75)
    ]
    cur.executemany(
        'INSERT INTO book (isbn, publisher_id, author_id, title, print_date, price) VALUES (?, ?, ?, ?, ?, ?)', books)

    # Insert rows into the publisher table
    publishers = [
        ('P001', 'Pearson', 'New York', 'NY', '10001'),
        ('P002', 'O’Reilly', 'San Francisco', 'CA', '94103'),
        ('P003', 'Packt', 'Birmingham', 'UK', 'B3 3AG')
    ]
    cur.executemany(
        'INSERT INTO publisher (publisher_id, pub_name, pub_city, pub_state, pub_zip) VALUES (?, ?, ?, ?, ?)',
        publishers)

    # Insert rows into the author table
    authors = [
        ('A001', 'Tony', 'Gaddis', '123 Python St', 'Dallas', 'TX', '75201'),
        ('A002', 'Jake', 'VanderPlas', '456 Data Rd', 'Austin', 'TX', '73301'),
        ('A003', 'Andreas', 'Muller', '789 ML Ave', 'Seattle', 'WA', '98101')
    ]
    cur.executemany(
        'INSERT INTO author (author_id, first_name, last_name, author_address, author_city, author_state, author_zip) '
        'VALUES (?, ?, ?, ?, ?, ?, ?)',
        authors)

    # Fetch and print all records from the book table and format nicely
    print("Book Table:")
    print(f"{'ISBN':<15} {'Publisher ID':<12} {'Author ID':<10} {'Title':<25} {'Date':<10} {'Price':<10}")
    print("-" * 80)
    for row in cur.execute("SELECT * FROM book"):
        print(f"{row[0]:<15} {row[1]:<12} {row[2]:<10} {row[3]:<25} {row[4]:<10} ${row[5]:<10.2f}")

    # Fetch and print all records from the publisher table and format nicely
    print("\nPublisher Table:")
    print(f"{'Publisher ID':<12} {'Name':<15} {'City':<15} {'State':<10} {'ZIP':<10}")
    print("-" * 60)
    for row in cur.execute("SELECT * FROM publisher"):
        print(f"{row[0]:<12} {row[1]:<15} {row[2]:<15} {row[3]:<10} {row[4]:<10}")

    # Fetch and print all records from the author table and format nicely
    print("\nAuthor Table:")
    print(
        f"{'Author ID':<10} {'First Name':<12} {'Last Name':<12} {'Address':<20} {'City':<15} {'State':<10}"
        f" {'ZIP':<10}")
    print("-" * 90)
    for row in cur.execute("SELECT * FROM author"):
        print(f"{row[0]:<10} {row[1]:<12} {row[2]:<12} {row[3]:<20} {row[4]:<15} {row[5]:<10} {row[6]:<10}")

    # Commit the changes and close the connection
    conn.commit()
    cur.close()
    conn.close()


if __name__ == "__main__":
    main()
