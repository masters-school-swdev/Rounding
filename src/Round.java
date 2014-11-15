/**
 * Program to round numbers to the nearest integer
 * @author user
 *
 */
public class Round {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (0 == args.length) usage();
		
		// capture argument from command line as a variable,
		// of reference type String, named sValue
		String sValue = args[0];
		
		// because Java is a strongly typed language in order
		// to convert one type to another (a String to a float)
		// we must `cast` the value to the new type
		float asFloat = Float.parseFloat( sValue );
		
		// call Log.info method to print the value
		Log.info("%.1f", asFloat);
	}

	/**
	 * Print program usage statement and exit
	 */
	private static void usage()
	{
		System.err.println("Main [value]");
		System.err.println("value - a value to be rounded, e.g. 5.8");
		System.exit(1);
	}
	
	/**
	 * Simple logging mechanism
	 */
	static class Log 
	{
		/**
		 * Print a message
		 * @param msg
		 */
		public static void info( String msg )
		{
			System.out.println("INFO: " + msg );
		}
		/**
		 * Print a formatted message
		 * @param format
		 * @param args
		 */
		public static void info( String format, Object...args)
		{
			info(String.format(format, args));
		}
		/**
		 * Print an error to the console
		 * @param err
		 */
		public static void error( String err )
		{
			System.err.println("ERROR: " + err);
		}
	}

}
