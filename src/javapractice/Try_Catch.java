package javapractice;

public class Try_Catch {

	public static void main(String[] args) throws Exception {

		int i = 10;

		try {
			System.out.println(i / 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Exception Handled");
		}
	}
}