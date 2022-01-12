import java.io.*;
class str
{
public static void main(String args[])
{
char c[]={'a','b','c','d','e','g','h',};
String S1=new String(c);
System.out.println(S1);
S1=(new String(c,2,3));
System.out.println(S1);
}
}