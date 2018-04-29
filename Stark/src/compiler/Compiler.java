package compiler;

import compiler.antlrGenerated.StarkLexer;
import compiler.antlrGenerated.StarkParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Compiler{
	

    String srcPath= null;
	String destPath = null;
	static Compiler compile;
	
	private Compiler(String src, String des) {
		srcPath = src;
		destPath= des;
	}
	
	public static Compiler getInstance(String src,String des) {
		if (compile == null) {
			compile = new Compiler(src,des);
		}
		return compile;
	}
	
	public void compile() {
	    org.antlr.v4.runtime.ANTLRInputStream input = null;
		try {
			input = new org.antlr.v4.runtime.ANTLRFileStream(srcPath);
		} catch (IOException e) {
			System.out.println("Error: Could not find or load source file");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		StarkLexer lexer = new StarkLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		StarkParser parser = new StarkParser(tokens);
		ParseTree tree = parser.program();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MyStarkListener(destPath),tree);
	}
	

	public static void main(String args[]){
		
		String	srcPath ="data\\stark_programs\\assign.txt";
		String  destPath ="data\\intermediate_code\\assignIC.txt";
		Compiler.getInstance(srcPath,destPath).compile();
			}
}
