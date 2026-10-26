
import tkinter as tk
from tkinter import messagebox

# Function to check login details
def login():
    username = username_entry.get()
    password = password_entry.get()

    if username == "admin" and password == "1234":
        messagebox.showinfo("Success", "Login Successful!")
    else:
        messagebox.showerror("Error", "Invalid username or password")

# Create main window
root = tk.Tk()
root.title("Login Page")
root.geometry("400x300")
root.resizable(False, False)
root.configure(bg="#eaf2f8")

# Heading
heading = tk.Label(
    root,
    text="Login Page",
    font=("Arial", 22, "bold"),
    bg="#eaf2f8",
    fg="#1a5276"
)
heading.pack(pady=20)

# Username label and entry
username_label = tk.Label(
    root, text="Username:",
    font=("Arial", 12),
    bg="#eaf2f8"
)
username_label.pack()

username_entry = tk.Entry(root, font=("Arial", 12))
username_entry.pack(pady=5)

# Password label and entry
password_label = tk.Label(
    root, text="Password:",
    font=("Arial", 12),
    bg="#eaf2f8"
)
password_label.pack()

password_entry = tk.Entry(root, show="*", font=("Arial", 12))
password_entry.pack(pady=5)

# Login button
login_button = tk.Button(
    root,
    text="Login",
    font=("Arial", 12, "bold"),
    bg="#2874a6",
    fg="white",
    command=login
)
login_button.pack(pady=15)

# Run application
root.mainloop()
