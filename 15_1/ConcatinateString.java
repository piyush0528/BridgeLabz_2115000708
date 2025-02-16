import java.io.*;

public class ConcatinateString{
public static void main(String args[]){
String[] arr = {"my"," ","name","","is","Piyush"};

StringBuffer stringbuffer = new StringBuffer();

for(String str : arr){

stringbuffer.append(str);

}

String concatinated = stringbuffer.toString();
System.out.println("the final string is" +concatinated);

}
}
