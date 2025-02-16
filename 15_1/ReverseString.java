import java.io.*;
public class ReverseString{
public static void main(String args[]){
String input = "Piyush";
StringBuilder stringbuilder = new StringBuilder();
stringbuilder.append(input);
stringbuilder.reverse();
String reversedstring = stringbuilder.toString();
System.out.println("reversed string: "+reversedstring);
}
}
