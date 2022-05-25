package code._4_student_effort;

public class Challenge_1 {
    static void run() {

        for (int x = 1; x < 101; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (x % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    if (x % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        if(x % 7 == 0) {
                            System.out.println("Rizz");
                        } else {
                            if(x % 11 == 0) {
                                System.out.println("Jazz");
                            } else {
                                System.out.println(x);
                            }
                        }
                    }
                }
            }
        }
    }
}
