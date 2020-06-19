package furryfriends;
interface Friend {
 protected String getName(); // h1
}
class Cat implements Friend {
 String getName() { // h2
 return "Kitty";
 }
}
public class Dog implements Friend {
 String getName() throws RuntimeException { // h3
 return "Doggy";
 }
 public static void main(String[] adoption) {
 Friend friend = new Dog(); // h4
 System.out.print(((Cat)friend).getName()); // h5
 System.out.print(((Dog)null).getName()); // h6
 }
}