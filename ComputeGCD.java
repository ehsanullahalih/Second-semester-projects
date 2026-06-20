
package sevenexercis;


class A{
    A(int x){
        System.out.println("1- argument super class constroctor "+x);
    }
}
class B extends A{
    
    B(){
     super(70);   
    }
    B(int x){
        super(x);
    }
    B(int x,int y){
        super(y);
    }
}

public class ComputeGCD {
      public static void main(String [] args){

      B obj=new B(3,76);
    }
    



}
