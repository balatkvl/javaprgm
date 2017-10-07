/*Finding number of 2's between given range*/
import java.io.*;
class Tows
{
static int count=0;
public static void main(String args[])throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter m&n");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
for(int i=m;i<=n;i++)
{
if(i%10==2||i/10==2)
{
count++;
System.out.println(i);
}
}
System.out.println("number of 2s is"+count);
}
}

