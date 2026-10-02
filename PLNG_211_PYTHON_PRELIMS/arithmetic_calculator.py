# Arithmetic Operations Calculator
# This program displays a menu of arithmetic operations and repeats until the user chooses to stop.


def read_number(prompt):
    """Read and validate a numeric value."""
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a numeric value.")


def display_menu():
    """Show the arithmetic operation menu."""
    print("\nARITHMETIC CALCULATOR")
    print("1. Addition          2. Subtraction       3. Multiplication")
    print("4. Division          5. Modulus           6. Increment")
    print("7. Decrement")


def main():
    while True:
        display_menu()
        try:
            option = int(input("Select an arithmetic operation: "))
        except ValueError:
            print("Invalid menu option. Please select a number from 1 to 7.")
            continue

        if option == 1:
            x = read_number("Enter the value of x: ")
            y = read_number("Enter the value of y: ")
            result = x + y
            print(f"\nVariable Values: x = {x}, y = {y}")
            print(f"Addition: x + y = {result}")

        elif option == 2:
            x = read_number("Enter the value of x: ")
            y = read_number("Enter the value of y: ")
            result = x - y
            print(f"\nVariable Values: x = {x}, y = {y}")
            print(f"Subtraction: x - y = {result}")

        elif option == 3:
            x = read_number("Enter the value of x: ")
            y = read_number("Enter the value of y: ")
            result = x * y
            print(f"\nVariable Values: x = {x}, y = {y}")
            print(f"Multiplication: x * y = {result}")

        elif option == 4:
            x = read_number("Enter the value of x: ")
            y = read_number("Enter the value of y: ")
            if y == 0:
                print("Error: Division by zero is not allowed.")
            else:
                result = x / y
                print(f"\nVariable Values: x = {x}, y = {y}")
                print(f"Division: x / y = {result}")

        elif option == 5:
            x = read_number("Enter the value of x: ")
            y = read_number("Enter the value of y: ")
            if y == 0:
                print("Error: Modulus by zero is not allowed.")
            else:
                result = x % y
                print(f"\nVariable Values: x = {x}, y = {y}")
                print(f"Modulus: x % y = {result}")

        elif option == 6:
            x = read_number("Enter the value of x: ")
            x += 1
            print(f"\nVariable Values: x = {x - 1}")
            print(f"Increment: x + 1 = {x}")

        elif option == 7:
            x = read_number("Enter the value of x: ")
            x -= 1
            print(f"\nVariable Values: x = {x + 1}")
            print(f"Decrement: x - 1 = {x}")

        else:
            print("Invalid menu option. Please select a number from 1 to 7.")
            continue

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
