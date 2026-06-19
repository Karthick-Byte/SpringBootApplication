
// //case1: valid
// @FunctionalInterface
// interface P{
//     public void m1();
    
// }
// @FunctionalInterface
// interface C extends P {
// }


// //case2: valid
// @FunctionalInterface
// interface P{
//     public void m1();
    
// }
// @FunctionalInterface
// interface C extends P {
//     public void m1();
// }


// //case3: Invalid
// @FunctionalInterface
// interface P{
//     public void m1(); // Unexpected @FunctionalInterface annotation    
// }
// @FunctionalInterface
// interface C extends P {
//     public void m2();
// }


// //case4: valid
// @FunctionalInterface
// interface P{
//     public void m1();
    
// }
// interface C extends P {
//     public void m2();
// }



//Implementation
//Without Lambda
// interface Interf{
//     public void m1();
    
// }
// class Demo implements Interf
// {
//     public void m1()
//     {
//         System.out.println("Interface Implemented");
//     }
// }

// public class FuncInterface {
//     public static void main(String args[])
//     {
//         Interf i = new Demo();
//         i.m1();
//     }
        
// }


//With lambda

interface Interf{
    public void m1();   
}

public class FuncInterface {
    public static void main(String args[])
    {
        Interf i = ()->System.out.println("Interface implemented with lambda");
        i.m1();
    }
        
}

