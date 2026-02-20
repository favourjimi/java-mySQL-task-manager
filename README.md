<h1 align="center">Task Manager App</h1>

<p align="center">
A console-based task management system built using Java and MySQL.
</p>

<hr>

<h2> Overview</h2>
<p>
The Task Manager App is a backend console application that allows users to perform
CRUD (Create, Read, Update, Delete) operations on tasks stored in a MySQL database.
It demonstrates database connectivity using JDBC and follows a structured layered architecture.
</p>

<hr>

<h2> Features</h2>
<ul>
  <li>Add new tasks</li>
  <li>View all tasks</li>
  <li>Update task status</li>
  <li>Delete tasks</li>
  <li>Persistent storage using MySQL</li>
  <li>Layered architecture (Model → DAO → Main)</li>
</ul>

<hr>

<h2>🛠 Tech Stack</h2>
<ul>
  <li><strong>Java (JDK 17+)</strong></li>
  <li><strong>MySQL</strong></li>
  <li><strong>JDBC</strong></li>
  <li><strong>Maven</strong></li>
  <li><strong>MySQL Workbench</strong></li>
</ul>

<hr>

<h2> Project Structure</h2>

<pre>
src/main/java
 ├── model
 │    └── Task.java
 ├── dao
 │    ├── DatabaseConnection.java
 │    └── TaskDAO.java
 └── Main.java
</pre>

<hr>

<h2>🗄 Database Schema</h2>

<pre>
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status ENUM('PENDING', 'COMPLETED') DEFAULT 'PENDING',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
</pre>

<hr>

<h2>▶ How To Run</h2>

<ol>
  <li>Install MySQL and create a database named <strong>task_manager</strong>.</li>
  <li>Update database credentials inside <code>DatabaseConnection.java</code>.</li>
  <li>Open the project in NetBeans or any Java IDE.</li>
  <li>Run the <code>Main.java</code> file.</li>
  <li>Use the console menu to manage tasks.</li>
</ol>

<hr>

<h2> Sample Output</h2>
<p>
  <img width="733" height="1027" alt="image" src="https://github.com/user-attachments/assets/060e7c58-4746-470f-afa1-de2246774d4e" />
screenshots of console output 
  <img width="2980" height="1285" alt="image" src="https://github.com/user-attachments/assets/f4bc5e47-6cd2-422d-8d00-9cf48d30d1fb" />
screenshots of database table here.</p>

<hr>

<h2> Author</h2>
<p>
Favour Adejimi<br>
Software Engineering Student<br>
Backend Development Enthusiast
</p>
