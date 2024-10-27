# JAVA: TP1
## Introduction
This project presents solutions for TP in Java, focusing on arrays and string manipulation.

## Exercise 1: Managing Student Grades
- **Sort and display grades**: Grades are input into an array, sorted with `Arrays.sort()`, and then displayed.
- **Calculate average**: The average is computed by summing the grades with a loop and dividing by the number of students usig the method lenght.
- **Max and min grades**: After sorting (with built in function), the first and last grades in the array represent the min and max values.
- **Search for a specific grade**: The program counts the number of students who received a user specified grade by iterating through the array and comparing each element.
I have tried to create the functions of the menu in a separate class using static methods to be able to call them without initializing the class.
## Exercise 2: Conjugation of a First-Group Verb
The program checks if a verb ends with "er," removes the suffix to show its present tense conjugation, and adds the appropriate endings along with the pronouns.
The pronouns and suffix are stored in a 2D array matrix accessed via a loop.
## Exercise 3: String Operations
Represent an interactive menu allows:
- **Input a string**: The user inputs a string that is stored in a variable.
- **Display the string**: Displays the stored string if available.
- **Reverse the string**: Uses `StringBuilder` to reverse the string.
- **Count words**: Counts words by splitting the string by spaces, transforming it into an array, and using the length method.

## Exercise 4: Counting Letter Occurrences
The program reads a string, ignores case and spaces, then counts and displays the occurrences of each letter in the alphabet found in the string. It does this by transforming the string into an array, sorting it, and looping through it to count occurrences. If an element is the same as the next, it increments the count, if not, it displays the count and resets it to zero to start counting the next letter.
