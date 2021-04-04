
public class Main {

		public static void main(String[] args) {
			
			Phone iphone = new Phone(); 
			
			iphone.printPhone("iphone", "black", "1.0");
			iphone.printResistance("waterproof");
			iphone.printCamera("digital camera");
			iphone.printBluetooth("has bluetooth function");
			
			System.out.println();
			

			Phone samsung = new Phone(); 
			
			samsung.printPhone("samsung", "pink", "1.0");
			samsung.printResistance("waterproof");
			samsung.printCamera("digital camera");
			samsung.printBluetooth("has bluetooth function");
			
			System.out.println();
			

			

		}

	}