package Lab1.Challenge2;

public class  Main{
        public static StringBuilder String_compute(int number) {
            StringBuilder output = new StringBuilder();
            if (number % 3 == 0) {
                output.append("Foo");
            }
            if (number % 5 == 0) {
                output.append("Bar");
            }
            if (number % 7 == 0) {
                output.append("Qix");
            }
            String num = String.valueOf(number);
            for (int i = 0; i < num.length(); i++) {
                if (Character.digit(num.charAt(i),10) == 3) {
                    output.append("Foo");
                } else if (Character.digit(num.charAt(i),10) == 5) {
                    output.append("Bar");
                } else if (Character.digit(num.charAt(i),10) == 7) {
                    output.append("Qix");
                }
            }
            if (output.length() == 0) {
                output.append(number);
            }
            return output;
        }

        public static void String_compute2(int number) {
            StringBuilder output = new StringBuilder();
            StringBuilder output1 = new StringBuilder();
            boolean enteredIfs = false;
            if (number % 3 == 0) {
                output.append("Foo");
                enteredIfs = true;
            }
            if (number % 5 == 0) {
                output.append("Bar");
                enteredIfs = true;
            }
            if (number % 7 == 0) {
                output.append("Qix");
                enteredIfs = true;
            }
            String num = String.valueOf(number);
            for (int i = 0; i < num.length(); i++) {
                if (enteredIfs) {
                    if (Character.digit(num.charAt(i), 10) == 3) {
                        output.append("Foo");
                    } else if (Character.digit(num.charAt(i), 10) == 5) {
                        output.append("Bar");
                    } else if (Character.digit(num.charAt(i), 10) == 7) {
                        output.append("Qix");
                    } else if (Character.digit(num.charAt(i), 10) == 0) {
                        output.append("*");
                    }
                } else {
                    if (Character.digit(num.charAt(i),10) == 0)
                    {
                        output.append("*");
                    } else {
                        output.append(Character.digit(num.charAt(i), 10));
                    }

                }

            }
            if (output.length() == 0) {
                output.append(number);
            }
            System.out.println(output);
        }
        public static void main(String[] args) {
            String_compute2(101);
            String_compute2(303);
            String_compute2(105);
            String_compute2(10101);
    }
}
