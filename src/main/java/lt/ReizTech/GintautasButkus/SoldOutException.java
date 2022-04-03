package lt.ReizTech.GintautasButkus;

public class SoldOutException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SoldOutException(String text) {
		super(text);
	}
}
