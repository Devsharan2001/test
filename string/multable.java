import java.util.calendar;
class cale
{
public static void main(String args[])
{
String month[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
Calendar c=Calendar.getInstance();
System.out.println("date:");
System.out.println(month[c.get(Calendar.MONTH)]);
System.out.println(""+c.get(Calendar.DATE)+"");
System.out.println(c.get(Calendar.YEAR));
System.out.println("time");
System.out.println(c.get(Calendar.HOUR)+":");
System.out.println(c.get(Calendar.MINUTE)+":");
System.out.println(c.get(Calendar.SECOND));
c.set(Calendar.HOUR,10);
c.set(Calendar.MINUTE,28);
c.set9Calendar.SECOND,15);
System.out.println("UPDATED TIME");
System.out.println(c.get(Calendar.HOUR)+":");
System.out.println(c.get(Calendar.MINUTE)+":");
System.out.println(c.get(Calendar.SECOND));
}
}