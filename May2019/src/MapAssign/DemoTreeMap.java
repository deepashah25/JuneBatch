package MapAssign;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Comparator;;

public class DemoTreeMap {
public static void main(String[] args) {
	
Comparator<StringBuffer> c=new Comparator<StringBuffer>()
{
	public int compare(StringBuffer s1,StringBuffer s2)
	{
		String a1=s1.toString();
		String a2=s2.toString();
		return a1.compareTo(a2);
	}
};



TreeMap<StringBuffer,Integer> tm=new TreeMap<>(c);
tm.put(new StringBuffer("Deepa"), 100000);
tm.put(new StringBuffer("Diya"), 100000);
tm.put(new StringBuffer("Dipti"), 100000);
tm.put(new StringBuffer("Darshan"), 100000);
System.out.println(tm);
	
}
}
