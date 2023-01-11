// Scoping basically means where we can access our variables.

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name ="Ananya";
        //Block Scope
        {
//            int a = 25; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; //reassign the original reference variable to some other value
            System.out.println(a);
            int c =99; // value initialised in this block, will remain in block
            name = "Sweta";
            System.out.println(name);
        }
        int c = 90;
        System.out.println(name);
        System.out.println(a);
//        System.out.println(c); //can not use outside the block

        //Scoping in for loops
        for(int i = 0; i<4; i++){
            System.out.println(i);
            int num = 90;
//           int a = 70;
             a = 50;
        }
//        System.out.println(i);
        }
        static void random(int marks) {
            int num = 40;
            System.out.println(num);
            System.out.println(marks);
        }
    }

//Anything that is initialised outside the block (9-16) can be used/update inside the block
//but anything that is initialised inside the block can not be used outside
//Anything that is initialised outside the block can not initialise again inside the block
//but anything that is initialised inside the block can definitely initialise again outside the block

// Same for the loops