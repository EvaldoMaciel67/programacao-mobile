Expressions, Statements, and Blocks
Now that you understand variables and operators, it's time to learn about expressions, statements, and blocks. Operators may be used in building expressions, which compute values; expressions are the core components of statements; statements may be grouped into blocks.

Expressions
An expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value. You've already seen examples of expressions, illustrated in bold below:

int cadence = 0;
anArray[0] = 100;
System.out.println("Element 1 at index 0: " + anArray[0]);

int result = 1 + 2; // result is now 3
if (value1 == value2) 
    System.out.println("value1 == value2");
The data type of the value returned by an expression depends on the elements used in the expression. The expression cadence = 0 returns an int because the assignment operator returns a value of the same data type as its left-hand operand; in this case, cadence is an int. As you can see from the other expressions, an expression can return other types of values as well, such as boolean or String.

The Java programming language allows you to construct compound expressions from various smaller expressions as long as the data type required by one part of the expression matches the data type of the other. Here's an example of a compound expression:

 
1 * 2 * 3
In this particular example, the order in which the expression is evaluated is unimportant because the result of multiplication is independent of order; the outcome is always the same, no matter in which order you apply the multiplications. However, this is not true of all expressions. For example, the following expression gives different results, depending on whether you perform the addition or the division operation first:

x + y / 100    // ambiguous
You can specify exactly how an expression will be evaluated using balanced parenthesis: ( and ). For example, to make the previous expression unambiguous, you could write the following:

 
(x + y) / 100  // unambiguous, recommended
If you don't explicitly indicate the order for the operations to be performed, the order is determined by the precedence assigned to the operators in use within the expression. Operators that have a higher precedence get evaluated first. For example, the division operator has a higher precedence than does the addition operator. Therefore, the following two statements are equivalent:

x + y / 100 


x + (y / 100) // unambiguous, recommended
When writing compound expressions, be explicit and indicate with parentheses which operators should be evaluated first. This practice makes code easier to read and to maintain.

Statements
Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of execution. The following types of expressions can be made into a statement by terminating the expression with a semicolon (;).

Assignment expressions
Any use of ++ or --
Method invocations
Object creation expressions
Such statements are called expression statements. Here are some examples of expression statements.

// assignment statement
aValue = 8933.234;
// increment statement
aValue++;
// method invocation statement
System.out.println("Hello World!");
// object creation statement
Bicycle myBike = new Bicycle();
In addition to expression statements, there are two other kinds of statements: declaration statements and control flow statements. A declaration statement declares a variable. You've seen many examples of declaration statements already:

// declaration statement
double aValue = 8933.234;
Finally, control flow statements regulate the order in which statements get executed. You'll learn about control flow statements in the next section, Control Flow Statements

Blocks
A block is a group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed. The following example, BlockDemo, illustrates the use of blocks:

class BlockDemo {
     public static void main(String[] args) {
          boolean condition = true;
          if (condition) { // begin block 1
               System.out.println("Condition is true.");
          } // end block one
          else { // begin block 2
               System.out.println("Condition is false.");
          } // end block 2
     }
}


Questions and Exercises: Expressions, Statements, and Blocks
Questions
Operators may be used in building ___, which compute values.
Expressions are the core components of ___.
Statements may be grouped into ___.
The following code snippet is an example of a ___ expression.
 1 * 2 * 3
Statements are roughly equivalent to sentences in natural languages, but instead of ending with a period, a statement ends with a ___.
A block is a group of zero or more statements between balanced ___ and can be used anywhere a single statement is allowed.
Exercises
Identify the following kinds of expression statements:

aValue = 8933.234;
aValue++;
System.out.println("Hello World!");
Bicycle myBike = new Bicycle();
Check your answers