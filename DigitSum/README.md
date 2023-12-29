# Sum of Digits in a Number

This Java program calculates the sum of the digits of a given number entered by the user through the console.

### Instructions:
1. **Compilation**: Compile the `Main.java` file using `javac Main.java`.
2. **Execution**: Run the compiled program using `java Main`.
3. **Input**: Enter a number when prompted in the console.
4. **Output**: The program will display the sum of the digits in the entered number.

### Code Overview:
- The `Main` class contains the `main` method where the program execution starts.
- Upon execution, the user is prompted to enter a number.
- The `sumDigits` method calculates the sum of the digits in the provided number.
- It performs digit extraction using the modulus (`%`) operator and digit truncation using the division (`/`) operator.
- Negative numbers are considered invalid, and an error message is displayed. The sum for negative numbers is returned as `-1`.
- The sum of the digits is displayed as the output.

### Example:
```
Please enter a number: 12345
The sum of the digits in number 12345 is 15
```

### Note:
- Ensure to input integers only.
- Negative numbers are considered invalid input and will return a sum of `-1`.

Feel free to explore the code and modify it as needed!

---