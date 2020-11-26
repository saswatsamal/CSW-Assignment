# Assignment on Number

Q1. Write a program to create an output file containing a customized loan
amortization table. Your program will prompt the user to enter the
amount borrowed(the principal ), the annual interest rate, and the number of payments ( n ). To calculate the monthly payment, it will use the
formula

payment = ip / [1 − (1 + i)−n]

his payment must be rounded to the nearest cent. After the payment has
been rounded to the nearest cent, the program will write to the output
file n lines showing how the debt is paid off. Each month part of the
payment is the monthly interest on the principal balance, and the rest is
applied to the principal. Because the payment and each month’s interest
are rounded, the final payment will be a bit different and must be calculated as the sum of the final interest payment and the final principal
balance. Here is a sample table for a Rs.1000 loan borrowed at a 9%
annual interest rate and paid back over 6 months.

Q2. Newton’s method is one of the better choice for find the root, usually converges to a solution even faster than the bisection method, if it converges at
all. Newton’s method starts with an initial guess for a root, x0 , and then
generates successive approximate roots x1, x2, ..., xj , xj+1, ...,using the iterative formula where f'(x) is the derivative of function f evaluated at x = xj . The
formula generates a new guess, xj+1, from a previous one, xj . Sometimes Newton’s method will fail to converge to a root. In this case, the program should terminate after many trials, perhaps 100.
Write a program that uses Newton’s method to approximate the nth root of a number to six decimal places. If x^n = c, then x^n−c = 0. Finding a root of the second equation will give you c^(-1/n). Test your program on √2,7^(-1/3), -1^(-1/3). Your program could use c/2 as its initial guess.

Q3.  Create a program that reads an unspecified number of integer arguments from the command line and adds them together. For example, suppose that you enter the following:
java Adder 1 3 2 10
The program should display 16 and then exit. The program should display an error message if the user enters only one argument.

Q4. Create a program that is similar to the previous one but has the following differences:

Instead of reading integer arguments, it reads floating-point arguments.
It displays the sum of the arguments, using exactly two digits to the right
of the decimal point.
For example, suppose that you enter the following:
java FPAdder 1 1e2 3.0 4.754

The program would display 108.75. Depending on your locale, the decimal
point might be a comma (,) instead of a period (.).

Q5. Write a java program which read number from user and check is this number is palindrome number or not.

Q6. prints a table of Fahrenheit temperatures and the corresponding Celsius temperatures, rounded up-to two digits after decimal point.

Q7. Write a program to find a palindromic number. A palindromic number is a number if the sum of the number and reverse of that number is palindrome number

Example: input 72
rev 27
sum 99 is a palindrome.
input 142
rev 241
sum 383 palindrome

Note: your program take any number and find its palindromic number