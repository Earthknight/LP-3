/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Main {
    static int n1=0,n2=1,n3;
    static int r1=0,r2=1,r3;
   static void iterative(int count){
        
        for(int i = 2 ; i< count;i++){
            n3 = n2 + n1;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
    static void recursivefb(int count){
        if(count >0){
            r3 = r1 + r2;
            r1 = r2;
            r2 = r3;
            System.out.print(" "+r3 );
            recursivefb(count-1);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print("Iterative\n");
        System.out.print(n1+" "+ n2);
        iterative(count);
        System.out.print("\nRecursive\n");
        System.out.print(r1+" "+ r2);
        recursivefb(count-2);
    }
    
}
