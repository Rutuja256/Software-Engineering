
from flask import Flask, render_template, request

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def register():
    if request.method == "POST":
        name = request.form.get("name", "").strip()
        email = request.form.get("email", "").strip()
        phone = request.form.get("phone", "").strip()
        gender = request.form.get("gender", "")
        dob = request.form.get("dob", "")
        course = request.form.get("course", "")
        address = request.form.get("address", "").strip()

        # Basic server-side validation
        if not all([name, email, phone, gender, dob, course]):
            return render_template(
                "index.html",
                error="Please fill in all required fields."
            )

        if not phone.isdigit() or len(phone) != 10:
            return render_template(
                "index.html",
                error="Enter a valid 10-digit phone number."
            )

        return render_template(
            "index.html",
            student={
                "name": name,
                "email": email,
                "phone": phone,
                "gender": gender,
                "dob": dob,
                "course": course,
                "address": address
            }
        )

    return render_template("index.html")


if __name__ == "__main__":
    app.run(debug=True)
