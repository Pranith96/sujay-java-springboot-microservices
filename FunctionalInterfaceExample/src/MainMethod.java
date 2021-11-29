public class MainMethod {

	public static void main(String[] args) {

		AdditionalImpl additionalImpl = new AdditionalImpl();
		additionalImpl.add();

		Addition additional = new AdditionalImpl();
		additional.add();
		
		Addition addData = () -> System.out.println("Hi Add");
		addData.add();
	}

}
