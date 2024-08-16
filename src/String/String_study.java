package String;

public class String_study {

	public static void main(String[] args) {

		String s="Agricultural";
		String s1="agricultural";
		String a= new String ("Agricultural");
		String e="ENGINEERING";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(e.toLowerCase());
		System.out.println(s.equals(e));
		System.out.println(a.equals(s));
		System.out.println(a.equals(s));
		System.out.println(a.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(a));
		System.out.println("===============================");
		System.out.println(s.contains("A"));
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(10));
		System.out.println(s.endsWith("ral"));
		System.out.println(s.startsWith("Agri"));
		System.out.println("===============================");
		System.out.println(s.substring(4));//to get small sub part of a string
		System.out.println(s.substring(8, 12));//take one index extra
		System.out.println(s.concat( e ));
		System.out.println(s.indexOf("A"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));//to get last same char
		System.out.println(s.indexOf("u", 1));	
		System.out.println("===============================");
		String b="engineering";
		System.out.println(b.indexOf("n", 5));//to get similar char enter char first then index of its previous same char
		System.out.println(b.indexOf("g", 5));
		System.out.println(b.lastIndexOf("i", 9));
		System.out.println(s.lastIndexOf("u", 9));//to get similar index from last search index right side
		System.out.println(b.replace("r", "R"));
		System.out.println("===============================");
		
		/*String n=" Velocity Corporate Training Centre";
		System.out.println(n);
		System.out.println(n.split(" "));*/
		
		
		
	}

}
