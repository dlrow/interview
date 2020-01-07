package string;

public class EqualQual {
	public static void main(String[] args) {
		Object obj = "A";
		String s1="A";
		String s2=new String("A");
		String s3=new String("A");
		
		String s4="A";
		System.out.println("quotes==quotes "+ (s1==s4));
		System.out.println("quotes === new "+(s1==s2));
		System.out.println("new === new "+(s3==s2));
		System.out.println("obj === new "+(obj==s2));
		System.out.println("obj === quotes "+(obj==s4));
		
	}

}
