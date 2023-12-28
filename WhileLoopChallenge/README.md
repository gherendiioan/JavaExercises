
# While Loop Challenge in Java

This Java program demonstrates the use of a while loop to find and count even numbers within a specified range.

## Challenge Description

The challenge involves iterating through numbers from a starting point (`loopIterator`) up to a finish point (`finishNumber`). The program identifies even numbers, counts occurrences, and stops when it finds five even numbers.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system

### Running the Program

1. Clone or download the Java file (`Main.java`).
2. Open a terminal or command prompt.
3. Navigate to the directory containing `Main.java`.
4. Compile the program:
   ```
   javac Main.java
   ```
5. Run the program:
   ```
   java Main
   ```

## Code Overview

### Main.java

The program defines a `Main` class containing the `main` method where the while loop and logic for finding even numbers are implemented.

- `loopIterator`: Starting number for the loop.
- `finishNumber`: End number for the loop.
- `evenCount`: Counter for even numbers found.
- `oddCount`: Counter for odd numbers found.

The `while` loop runs until `loopIterator` reaches `finishNumber`. Inside the loop:

- `loopIterator` is incremented.
- If the number is even (`isEvenNumber` method returns `true`), it's printed and `evenCount` is incremented. If five even numbers are found, the loop breaks.
- If the number is odd, `oddCount` is incremented.

Finally, the program prints the total count of even and odd numbers found.

## Customization

- Adjust `loopIterator` and `finishNumber` values to test different number ranges.
- Modify the condition inside `isEvenNumber` method for custom even number identification.

## Methodology

This program uses a while loop to iterate through numbers, a method `isEvenNumber` to check for evenness, and counters to keep track of even and odd numbers found.

---

