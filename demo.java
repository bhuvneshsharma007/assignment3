import java.util.*;
class Student{
private String name;
Student(){
name="bhuvnesh";
}	
public void setName(String x){
name=x;
}
public String getName(){
return name;
   }
}
public class demo{

public static void main(String[] x)
{
Student s=new Student();
System.out.println(s.getName());
   }
}

