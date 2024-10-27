package ExceptionHandling;

public class HandleMuplipleException {

	public static void main(String[] args) {


		try {
			String s = "1bc123";
			int n = Integer.parseInt(s);
		}
//		catch(ArithmeticException e) {
//			System.out.println("caught");
//		}
//		
//		catch(NullPointerException e ) {
//		System.out.println("NPE caught");
//		}
////		catch(NumberFormatException e) {
////			System.out.println("NFE");
////		}
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
		
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
		//below code won't run at all because every exception handled above only that'y getting erro
//		catch(ArithmeticException e) {
//			System.out.println("caught");
//		}
//		
//		catch(NullPointerException e ) {
//		System.out.println("NPE caught");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("NFE");
//		}
		
//not recommended understanding purpose
		catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			System.out.println("caught in bunch");
		}


	}

}
