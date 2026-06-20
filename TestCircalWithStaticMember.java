
package ninethchapter;

public class TestCircalWithStaticMember{
    
  
    
    
}
    class CircalWSM {
    
    double radius;
    
    static int numberOfObject=0;
    
    CircalWSM(){
        radius = 1;
        numberOfObject++;
        
    }
    CircalWSM(double newRadius){
        radius=newRadius;
    }
    static int getNumberOfObject(){
        return numberOfObject;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    
}

