class rectangle
{
 int l,b; 
  void setval(int x,int y) 
{ 
   l=x; 
   b=y; 
} 
 int area() 
{ 
 return (l*b); 
} 
}; 
class CalculateAreaofRectangle 
{ 
  public static void main (String args[]) 
{ 
 rectangle Rect = new rectangle(); 
rectangle.setval (50,8); 
System.out.println("Area of Rectangle is : "+rectangle.area()); 
} 
}; 
