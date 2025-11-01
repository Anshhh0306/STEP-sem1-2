System.out.print("Enter a number (0 or negative to stop): ");
number = scanner.nextDouble();
if (number <= 0) {
break;
}
total += number;
}