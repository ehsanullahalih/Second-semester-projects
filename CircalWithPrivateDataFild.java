
package ninethchapter;


public class CircalWithPrivateDataFild {
    
    private double radius=1;
    private static int numberOfObjects=0;
    public CircalWithPrivateDataFild(){
        numberOfObjects++;
    }
    public CircalWithPrivateDataFild(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
    public double getRedius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius=(newRadius>=0)?newRadius:0;
    } 
    public static int detNumberOfObjects(){
        return numberOfObjects;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public static void main(String [] args){
       CircalWithPrivateDataFild obj=new CircalWithPrivateDataFild(0.5);
        System.out.println("The area of the circal of radius "+obj.getRedius()+" is "+obj.getArea());
        obj.setRadius(obj.getRedius()*1.1);
        System.out.println("The area of the circal of radius is "+obj.getRedius()+" is "+obj.getArea());
        System.out.println("The numbers of objects is "+CircalWithPrivateDataFild.detNumberOfObjects());
    }
}
