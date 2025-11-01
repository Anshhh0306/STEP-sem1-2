System.out.println("Please enter a natural number (greater than 0).");
} else {
long factorial = 1;
int i = 1;
while (i <= n) {
factorial *= i;
i++;
}
System.out.println("Factorial of " + n + " is: " + factorial);
}