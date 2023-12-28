
# Odd Number Sum

This Java program calculates the sum of odd numbers within a given range.

### Functionality

The program consists of the following methods:

1. **`isOdd(int number)`**:
    - Determines whether a given number is odd.
    - Returns `true` if the number is odd and greater than or equal to zero, otherwise returns `false`.

2. **`sumOdd(int start, int end)`**:
    - Computes the sum of all odd numbers within the range defined by `start` and `end` (inclusive).
    - Uses the `isOdd` method to identify odd numbers and adds them to the total sum.

### Usage

To test the program's functionality, modify the `main` method in the `Main` class:
```java
public static void main(String[] args) {
    // Adjust the range as needed
    System.out.println(sumOdd(1, 100));
}
```

### How to Run

To execute the program:

1. Compile the Java file using a Java compiler.
2. Run the compiled class file (`Main.class`).

Example:
```bash
javac Main.java
java Main
```

### Example Output

For the provided code snippet in the `main` method (`sumOdd(1, 100)`), the output will display the sum of odd numbers between 1 and 100.