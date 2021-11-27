package day3_variable;

public class PrimitiveDataTypeWholeNumbwr {

	public static void main(String[] args) {
		// byte, short, int, long
		
		byte day = 7;
		byte month = 8;
		short page = 254;
		int distance = 268;
		long phoneNumber = 703_345_6789l;
		
		long ssn = 945_67_8909;
		
		System.out.println(phoneNumber);

		System.out.println(ssn);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//-128 ~ 127
		int page2 = 254;
		System.out.println(page2);
		
		byte page3 = (byte)254;
		System.out.println(page3);
		
		long phone2 = 7031278698L;
		System.out.println(phone2);
		
		int phone3 = (int)7031278698L;
		System.out.println(phone3);
		
		int numberOfStudent = 60;
		System.out.println(numberOfStudent);
		
		//you can add your comment here
		
		/*Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

*/
		byte valueA = 50;
		short valueB = valueA;
		long valueC = valueA;
		System.out.println(valueA);
		
		long valueL = 30;
		int valueI = (int)valueL;
		System.out.println(valueI);
		
		float taxRate = 0.3f;
		double price = 9.99;
		double balance = 100.35;
		
		int priceInt =(int)price;
		System.out.println(price); //9.99
		System.out.println(priceInt);
		
		System.out.println("Value of variable price is "+ price); //9.99
		System.out.println("Value of variable priceInt is "+priceInt);
		
		
		
		String emailAddress = "praew_wooo@hotmail.com";
		String firstName = "natprapat";
		String lastName = "kaewthong";
		long mobilePhoneNumber = 571_123_456L;
		String passWord = "Kaew123456";
		
		System.out.println("Email "+emailAddress);
		System.out.println("Firstname "+firstName);
		System.out.println("Lastname "+lastName);
		System.out.println("Phone number "+mobilePhoneNumber);
		System.out.println("Password "+passWord);
		
		
		
		
		
		
		
 

		
		
		
		
		
		
	}

}
