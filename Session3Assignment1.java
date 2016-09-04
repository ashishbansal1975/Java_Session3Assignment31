class Test
{
      static
      {
        print(10);
       }

       static void print (int x) 
       {
          System.out.println (x);
        System.exit(0);
       }
}

/*
ANS :  It will compile and run printing out "10"

This will run, print a message and terminate gracefully.
The runtime system needs to load the class before it can look
for the main method. So the static initializer will run first
and print "10". Immediately after that System.exit(0) will be called
terminating the program before an error can be thrown. 

*/