
package ninethchapter;


public class NinethChapter {

    
    
    public static void main(String[] args) {
        
        
        CircalWSM circal=new CircalWSM();
        System.out.println("The area of the circale of radius "+circal.radius+" is "+circal.getArea());
        
        CircalWSM circal1=new CircalWSM(25);
        System.out.println("The area of the circal of radius "+circal1.radius+" is "+circal1.getArea());
        
        CircalWSM circal2=new CircalWSM(125);
        System.out.println("The area of the circal of radius "+circal2.radius+" is "+circal2.getArea());
        
        circal2.radius=100;
        System.out.println("The area of circal "+circal2.radius+" is "+circal2.getArea());
        
        
        
        
        
        
    }
}
    class Circal{
        double radius;
        Circal(){
            radius=1;
        
    }
       Circal(double newRadius){
           radius=newRadius;
           
       }
       double getArea(){
           return radius*radius*Math.PI;
       }
       
       
       double getParameter(){
           return 2*radius*Math.PI;
       }
       void setRadius(double newRadius){
           radius=newRadius;
       }
      
       
       
       
    }


