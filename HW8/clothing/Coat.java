package clothing;

public class Coat {
	public Long zipper() throws Exception {
		try {
			String checkZipper = (String) new Object();
		} catch (Exception e) {
			throw RuntimeException("Broken!");
			//new keyword ü eklenemli
		}
		return null;
	}

	public static void main(String... warmth) {
		try {
			new Coat().zipper();
			System.out.print("Finished!");
		} catch (Throwable t) {
		}
	}
}