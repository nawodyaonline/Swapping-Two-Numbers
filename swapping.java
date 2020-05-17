public class swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.printf("Now A = %d and B = %d \n", a, b);
        a = a + b; //30
        b = a - b; //b=10 
        a = a - b; //a=10 //b = 10; a = 30
        System.out.printf("Now A = %d and B = %d \n\n",a , b);

        //This method could apply for 3bit numbers then we can do things using only 3 bits
        System.out.println("This is Method can use for maximum 3 bit numbers");
        int x = 5; //1 0 1
        int y = 4; // 1 0 0
        System.out.printf("Now X = %d and Y = %d \n", x, y);
        x = x ^ y; // 1 0 1 XOR 1 0 0 = 0 0 1
        y = x ^ y; // 0 0 1 XOR 1 0 1 = 1 0 1 > 5
        x = x ^ y; // 0 0 1 XOR 1 0 1 = 1 0 0 > 4
        System.out.printf("Now X = %d and Y = %d \n\n", x, y);

        System.out.println("very short method to swap the values");
        int j = 5;
        int i = 6;
        System.out.printf("Now J = %d and I = %d \n", j, i);
        i = j + i - (j=i);
        System.out.printf("Now J = %d and I = %d \n\n", j, i);



    }
}