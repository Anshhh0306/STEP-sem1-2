System.out.println("Multiples of " + number + " below 100 are:");
for (int i = 100; i >= 1; i--) {
if (i % number == 0) {
System.out.println(i);
}
}