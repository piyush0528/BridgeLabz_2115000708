import java.io.*;


public class StringConcatenationPerformance {
public static void main(String[] args) {
int iterations = 1000000;
String str = "hello";
long startTime = System.nanoTime();
StringBuffer stringBuffer = new StringBuffer();
for (int i = 0; i < iterations; i++) {
stringBuffer.append(str);
}
long endTime = System.nanoTime();
long stringBufferTime = endTime - startTime;
System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");
startTime = System.nanoTime();
StringBuilder stringBuilder = new StringBuilder();
 for (int i = 0; i < iterations; i++) {
 stringBuilder.append(str);
 }
 endTime = System.nanoTime();
 long stringBuilderTime = endTime - startTime;
 System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");
 if (stringBufferTime < stringBuilderTime) {
 System.out.println("StringBuffer is faster.");
} else if (stringBufferTime > stringBuilderTime) {
System.out.println("StringBuilder is faster.");
} else {
System.out.println("Both StringBuffer and StringBuilder took the same time.");
}
}
}
