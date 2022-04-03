package lt.ReizTech.GintautasButkus;

public class NotEnoughChangeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughChangeException(String text) {
		super(text);
	}
}