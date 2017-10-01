/*First I am declaring a string
//I use lenght() function to get length of string
//The I use for loop for reversing string
//The special function charAt() for working with each character in a string
*/ 
import java.io.*;
class Str
{
public static void main(String arg[])
{
String s="hello";
System.out.println("the reversed string");
int a=s.length();
for(int i=a-1;i>=0;i--)
{
System.out.print(s.charAt(i));
}
}
}