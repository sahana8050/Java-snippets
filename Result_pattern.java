public class Result_pattern {

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static double average(int total, int subjects) {
        return (double) total / subjects;
    }

    public static void main(String[] args) {  

        String name = "John";
        int[] marks = {80, 90, 85, 70, 95};

        int total = 0;

        System.out.println("Student: " + name);

        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
            total += mark;
        }

        double avg = average(total, marks.length);

        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Factorial = " + factorial(marks.length));

        System.out.println("\nPattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}