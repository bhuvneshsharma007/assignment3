 abstract class Demo{
public void eat(){
System.out.println("I am Eating");
}
public void drink(){
System.out.println("I am Drinking");
}
abstract public void display();
}
class Dog extends Demo{
public void display(){
System.out.println("I am Dog");
}
}
class Cat extends Demo{
public void display(){
System.out.println("I am Cat");
}
}
public class amnal{
public static void main(String[] x){
Dog d=new Dog();
Cat c=new Cat();
d.display();
c.eat();
d.drink();
}
}
