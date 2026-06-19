// class MyRunnable implements Runnable
// {
//     public void run()
//     {
//         for(int i=0; i<10; i++)
//         {
//             System.out.println("Child thread");
//         }
//     }
// }


// public class ThreadProg {
//     public static void main(String args[])
//     {
//         MyRunnable obj = new MyRunnable();
//         Thread threadObj = new Thread(obj);
//         threadObj.start();

//         for(int i=0; i<10; i++)
//         {
//             System.out.println("Main Thread");
//         }
//     }
// }




public class ThreadProg {
    public static void main(String args[])
    {
        Runnable r = () ->{
                for(int i=0; i<10; i++)
                {
                    System.out.println("CHild thread");
                }
        };

        Thread obj = new Thread(r);
        obj.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MAin thread");
        }

    }
}