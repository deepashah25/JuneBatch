package MapAssign;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectDemo {
public static void main(String[] args) {
	Map<Corse,Integer> hm=new HashMap<>();
	hm.put(new Corse(1,"Java"),50000);
	hm.put(new Corse(1,"Java"),40000);
	hm.put(new Corse(2,"Angular"),40000);
	hm.put(new Corse(3,"Python"),10000);
	
	System.out.println(hm);
}
}
