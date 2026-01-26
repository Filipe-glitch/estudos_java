package collections;
import java.util.ArrayList; 
import java.util.Iterator; 
public class Newiterators {

	public static void main(String[] args) {
		ArrayList<String>lista= new ArrayList<String>();
		 
		lista.add("Maca"); 
		lista.add("Manga"); 
		lista.add("Abacate"); 
		lista.add("Laranja"); 
		lista.add("Pessego"); 
		System.out.println("Os elementos: ");
		for (String s: lista) { 
			System.out.println(s); 
			} 
			Iterator<String> i = lista.iterator(); 
			String str = ""; 
			while (i.hasNext()) { 
			str = (String) i.next(); 
			if (str.equals("Laranja")) { 
			i.remove(); 
			System.out.println("Laranja removida"); 
			break; 
			} 
			} 
			System.out.println("Os elementos: ");
			for (String s: lista) { 
				System.out.println(s);  
		} 
	}
}
