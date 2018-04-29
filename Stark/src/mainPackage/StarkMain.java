package mainPackage;

import java.io.File;

public class StarkMain {
	public static void main(String[] args) {
		
		if (args.length > 1) {
			String srcPath=args[1];
			String desPath;
			if (args[0].equals("-c") || args[0].equals("--compile")) {
				String fileName = srcPath.substring(0, srcPath.lastIndexOf('.'))+ ".iark";
				File desFile = new File(fileName);;
				desPath=desFile.toString();
				System.out.println("Intermediate Code File Path: "+desPath);
				compiler.Compiler.getInstance(srcPath, desPath).compile();
				return;
			} else if (args[0].equals("-e") || args[0].equals("--execute")) {
				runtime.Runtime.getInstance(args[1]).evaluateProgram();
				return;
			}
		}
		System.out
				.println("Usage: -c | --compile along with args for sourcepath and destpath");
		System.out
				.println(" or -e | --execute along with arg for intermediate code path");
		return;
	}
}