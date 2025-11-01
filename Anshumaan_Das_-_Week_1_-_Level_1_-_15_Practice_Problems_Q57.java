System.out.println("Please enter a natural number (greater than 0).");
} else {
long factorial = 1;
for (int i = 1; i <= n; i++) {
factorial *= i;
}
System.out.println("Factorial of " + n + " is: " + factorial);
}