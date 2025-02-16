import java.io.*;
import java.util.*;

public class RemoveDuplicate{
public static void main(String args[]) throws IOException{
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string: ");
String input = b.readLine();
StringBuilder stringbuilder = new StringBuilder();
HashSet<Character> hash = new HashSet<>();
for(char ch : input.toCharArray()){
if(!hash.contains(ch)){
hash.add(ch);
stringbuilder.append(ch);
}
}
String removeDuplicate = stringbuilder.toString();
System.out.println("the new string is: "+removeDuplicate);

}
}
