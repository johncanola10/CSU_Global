def list_multiplier(numbers):
    # Checks length of numbers and returns the first number if only one number is present
    if len(numbers) == 1:
        return numbers[0]
    # If there are multiple numbers, multiply the first number with the product of the rest of the list
    return numbers[0] * list_multiplier(numbers[1:])
# Main program
# Asks user for 5 numbers and stores them in a list
numbers_list = []
print("-------------------------------")
print("Enter 5 numbers:")
print("-------------------------------")

for i in range(5):
    num = float(input(f"Number {i + 1}: "))
    numbers_list.append(num)
# Calls the list_multiplier function to calculate the product of the numbers in the list
result = list_multiplier(numbers_list)
# Displays the result to the user
print("-----------------------------------------------")
print(f"The product of the numbers is: {result}")
print("-----------------------------------------------")