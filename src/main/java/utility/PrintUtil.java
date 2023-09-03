package utility;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class PrintUtil {
	public static PrintStream printStream = 
			new PrintStream(System.out, true, UTF_8);
}
