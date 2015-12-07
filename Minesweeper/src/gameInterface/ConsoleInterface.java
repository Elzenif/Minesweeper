package gameInterface;

public class ConsoleInterface extends AbstractInterface {

	@Override
	public ConsoleReader getReader() {
		return (ConsoleReader) reader;
	}

	private void setConsoleReader() {
		reader = new ConsoleReader();
	}

	public ConsoleInterface() {
		super();
		setConsoleReader();
	}

}
