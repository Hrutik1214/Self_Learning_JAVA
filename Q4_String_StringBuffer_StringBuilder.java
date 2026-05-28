//Implement String , StringBuffer , StringBuilder
package Assignment1;

public class Q4_String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		String s="I am the King";
		
		System.out.println(".....string.....");
		System.out.println(s.concat(" of World"));
		
		System.out.println(".....String_Buffer.....");
		StringBuffer sb=new  StringBuffer( "This Area is my Empire ");
		
		System.out.println("append: "+ sb.append(s));
		System.out.println("replace: "+ sb.replace(5,9,"world"));
		System.out.println("insert: "+ sb.insert(5,"location "));
		System.out.println("delete: "+ sb.delete(5,14));
		System.out.println("reverse: "+ sb.reverse());
		
		System.out.println(".....String Builder.....");
		StringBuilder obj=new  StringBuilder( "This Area is my Empire ");
		
		System.out.println("append: "+ obj.append(s));
		System.out.println("replace: "+ obj.replace(5,9,"world"));
		System.out.println("insert: "+ obj.insert(5,"location "));
		System.out.println("delete: "+ obj.delete(5,14));
		System.out.println("reverse: "+ obj.reverse());
		

	}

}