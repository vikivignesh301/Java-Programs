package javapractice;

//array testing
public class arraytest1 {
	public static void main(String[] args) {
		
		int a[] = new int [3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//character array testing single quotes
		char jca[] = {'a','\n','b'};
		System.out.println(jca);
		
		//string testing double quotes
		String s1 = "javaclassvignesh";
		String s2 = "javaclassvignesh";
		String s3 = "testing string";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}