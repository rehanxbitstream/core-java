public class Circle{
private int borderWidth=0;
private String color=null;
private double radius=0;

public void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}

public void setColor(String color){
this.color=color;
}

public void setRadius(double radius){
this.radius=radius;
}

public int getBorderWidth(){
return borderWidth;
}

public String getColor(){
return color;
}

public double getRadius(){
return radius;
}

public double area(){
return Math.PI*Math.pow(radius,2);
}
public double circumference(){
return 2*Math.PI*radius;
}

public static void  main(String[] args){

Circle cr=new Circle();
cr.setBorderWidth(34);
cr.setColor("Blue");
cr.setRadius(4.32);
double ar=cr.area();
System.out.println("Area of Circle="+ar);
double ci=cr.circumference();
System.out.println("Circumference of Circle="+ci); 
}

}