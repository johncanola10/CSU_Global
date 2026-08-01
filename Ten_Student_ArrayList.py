# Create arraylist function
def ArrayList():
    # Empty list to store student names
    student_list = []
    # Loop to get student names from user input
    while True:
        # Asks user for student name
        name = input("Enter student name (or 'done' to finish): ")
        # Check if user is done entering names
        if name.lower() == 'done':
            break
        # Adds student name to the list
        student_list.append(name)
    # Returns the list of student names
    return student_list