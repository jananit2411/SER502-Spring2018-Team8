package mainPackage;

public class StarkMain {
	public static void main(String[] args) {
		if (args.length > 1) {
			if (args[0].equals("-c") || args[0].equals("--compile")) {
				compiler.Compiler.getInstance(args[1], args[2]);
				return;
			} else if (args[0].equals("-e") || args[0].equals("--execute")) {
				runtime.Runtime.getInstance(args[1]);
				return;
			}
		}
		System.out
				.println("Usage: -c | --compile along with args for sourcepath and destpath");
		System.out
				.println("    or -e | --execute along with arg for intermediate code path");
		return;
	}
}