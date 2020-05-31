//Answer for 4 task: Yes;
public class Exceptions {
	void lengthOfString(String value) {
		 System.out.println(value.length());
	}
	public static void main(String[] args) throws Exception {
		try {
			Exceptions newException=new Exceptions();
			newException.lengthOfString(null);
		} catch (NullPointerException e) {
		e.printStackTrace(System.out);
		e.fillInStackTrace();
		throw new Exception(e);
		}	

	}

}
