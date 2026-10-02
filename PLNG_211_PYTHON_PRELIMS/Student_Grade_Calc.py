


def get_numeric_score(prompt):
    """Read and validate a numeric score between 0 and 100."""
    while True:
        try:
            value = float(input(prompt))
            if 0 <= value <= 100:
                return value
            print("Score must be between 0 and 100.")
        except ValueError:
            print("Invalid input. Please enter a numeric value.")


def get_grade(average):
    """Return the letter grade based on the average score."""
    if average >= 90:
        return "A"
    elif average >= 80:
        return "B"
    elif average >= 75:
        return "C"
    else:
        return "F"


def get_grade_message(grade):
    """Return the explanation for the grade range."""
    if grade == "A":
        return "because the average is between 90 and 100"
    elif grade == "B":
        return "because the average is between 80 and 89"
    elif grade == "C":
        return "because the average is between 75 and 79"
    return "because the average is below 75"


def main():
    while True:
        print("\nSTUDENT GRADE CALCULATOR")
        java_score = get_numeric_score("Enter Java Programming score: ")
        c_score = get_numeric_score("Enter C Programming score: ")
        database_score = get_numeric_score("Enter Database Handling score: ")

        average = (java_score + c_score + database_score) / 3

        print(f"Average: {average:.2f}")

        grade = get_grade(average)
        print(f"Grade: {grade} {get_grade_message(grade)}")

        while True:
            choice = input("Do you want to continue? (YES/NO): ").strip().upper()
            if choice == "YES":
                break
            elif choice == "NO":
                print("Program terminated. Thank you!")
                return
            else:
                print("Invalid input. Please enter YES or NO.")


if __name__ == "__main__":
    main()
