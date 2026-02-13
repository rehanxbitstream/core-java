public class Triangle{
  
private int borderWidth = 0;
private String color = null;
private int base = 0;
private int height = 0;

public void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}

public void setColor(String color){
this.color=color;
}

public void setHeight(int height){
this.height=height;
}

public void setbase(int base){
this.base=base;
}

public int getBorderWidth(){
return borderWidth;
}

public String getColor(){
return color;
}

public int getHeight(){
return height;
}

public int getBase(){
return base;
}
public double area(){
return 0.5*base*height;
}

public static void main(String[] args){
  
Triangle t=new Triangle();
t.setBorderWidth(34);
t.setColor("Green");
t.setHeight(2+3);
t.setbase(7);
double area=t.area();
System.out.println("Area of triangle="+area);

}
}
