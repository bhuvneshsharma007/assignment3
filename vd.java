import java.util.*;
class vechile
{
String regno;
int modelno;
vechile(String r,int m)
{
regno=r;
modelno=m;
}
void display()
{
System.out.println("Reg	no"+regno);
System.out.println("Model no"+modelno);
} 	
}
class twowheeler extends vechile
{
int noofwheels;
twowheeler(String r,int m,int n)
{
super(r,m);
noofwheels=n;
}
void display()
{
System.out.println("No of Wheels"+noofwheels);
super.display();
}
}
class fourwheeler extends vechile
{
int nowheels;
fourwheeler(String r,int n,int m)
{
super(r,m);
nowheels=n;
}
void display()
{
System.out.println("no of wheels "+nowheels);
super.display();
}
}
class vd{
public static void main(String[] x)
{
twowheeler ob1=new twowheeler("hp24b 1121",1998,2);
fourwheeler ob2=new fourwheeler("hp 12f 0046",2004,4);
ob1.display();
ob2.display();
}
}

