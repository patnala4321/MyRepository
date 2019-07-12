package StringExamples;

/*StringBuffer()	creates an empty string buffer with the initial capacity of 16.
StringBuffer(String str)	creates a string buffer with the specified string.
StringBuffer(int capacity)	creates an empty string buffer with the specified capacity as length.*/

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		StringBuffer sb1=new StringBuffer("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello 
		
		StringBuffer sb2=new StringBuffer("Hello");  
		sb2.replace(1,2,"Java");  
		System.out.println(sb2);//prints HJavalo  
		
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo 
		
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.reverse();  
		System.out.println(sb4);//prints olleH  
		
		StringBuffer sb5=new StringBuffer();  
		System.out.println(sb5.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb5.capacity());//now 16  
		sb5.append("java is my favourite language");  
		System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		
		StringBuffer sb6=new StringBuffer();  
		
		System.out.println("**********************");
		System.out.println(sb6.capacity());//default 16  
		
		sb6.append("Hello");  
		System.out.println(sb6.capacity());//now 16  
		
		
		sb6.append("java is my favourite langua");  
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		sb6.ensureCapacity(10);//now no change  
		System.out.println(sb6.capacity());//now 34  
		
		
		sb6.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb6.capacity());//now 70  
		

	}

}
