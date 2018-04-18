package mainPackage;


import compiler.antlrGenerated.MyStarkListener;
import compiler.antlrGenerated.StarkLexer;
import compiler.antlrGenerated.StarkParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class StarkMain {

	public static void main(String []st){


		org.antlr.v4.runtime.ANTLRInputStream input = null;
		try {
			input = new org.antlr.v4.runtime.ANTLRFileStream("D:\\starkinput.txt");
		} catch (IOException e) {
			System.out.println("Error: Could not find or load souce file ");
			return;
		}
		StarkLexer lexer = new StarkLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		System.out.println(tokens);
		StarkParser parser = new StarkParser(tokens);
		ParseTree tree = parser.program();

		//final TreeViewer view = new TreeViewer(null, tree);
		//view.open();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MyStarkListener(),tree);
		//String inter = new MyStarkListener().walk(tree);
		System.out.println("done");

	}
}
