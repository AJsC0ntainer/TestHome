public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("--------------------");

        try {
            int result = 10 /0;
        } catch (Exception e) 
        {
            System.out.println("An error occurred");
        }
        System.out.println("--------------------");

        int num = 100;

        double doubleNum = num;

        System.out.println(doubleNum);
        System.out.println(num);

        System.out.println("--------------------");

        double doubleValue = 9.78;
        int inValue = (int) doubleValue;

        System.out.println(doubleValue);
        System.out.println(inValue);

        System.out.println("--------------------");

        String str = "123";

        int num2 = Integer.parseInt(str);

        //int result = num2 + 1;

        System.out.println(num2 + 10);

        System.out.println("--------------------");

        String str2 = "45.67";

        double d = Double.parseDouble(str2);
        
        System.out.println(d + 10.8);

        System.out.println("--------------------");

        String str3 = "12.34";

        float f = Float.parseFloat(str3);

        System.out.println(f + 1.2);

        System.out.println("--------------------");

        String strTrue = "true";

        String strFalse = "false";

        boolean b1 = Boolean.parseBoolean(strTrue);
        boolean b2 = Boolean.parseBoolean(strFalse);    

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("--------------------");

        String str4 = "Hello";

        char c = str4.charAt(1);

        System.out.println(c);

        System.out.println("--------------------");

        int number = 456;

        String num3 = Integer.toString(number) + " is a string";

        String num4 = String.valueOf(number) + " is a string"; 

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------");

        Integer o
    }    
}