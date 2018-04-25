package runtime;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Runtime {

	String intermediateFilePath;
	Stack<Integer> intStack = new Stack<Integer>();
	Stack<Boolean> boolStack = new Stack<Boolean>();
	Map<String, Integer> intMap = new HashMap<String, Integer>();
	Map<String, Boolean> boolMap = new HashMap<String, Boolean>();
	// List<String> intList =new ArrayList<String>();
	// List<String> boolList =new ArrayList<String>();

	public static void main(String args[]) {
		Runtime runtime = new Runtime("data\\intermediate_code\\assignIC.txt");
	}

	public Runtime(String path) {
		intermediateFilePath = path;
		EvaluateProgram();
	}

	public void EvaluateProgram() {
		String line = null;
		try {
			FileReader reader = new FileReader(intermediateFilePath);
			BufferedReader bufferReader = new BufferedReader(reader);
			line = getNextInstruction(bufferReader,"");
			while (line != null) {
				if (line.startsWith("DECINT")) {
					String var = line.split(" ")[1];
					intMap.put(var, 0);
					line = getNextInstruction(bufferReader,"");
					// intList.add(var);
				} else if (line.startsWith("DECBOOL")) {
					String var = line.split(" ")[1];
					boolMap.put(line.split(" ")[1], false);
					// boolList.add(var);
				} else if (line.startsWith("STORE")) {
					String var = line.split(" ")[1];
					if (intMap.containsKey(var)) {
						intMap.put(line.split(" ")[1], intStack.pop());
					} else if (boolMap.containsKey(var)) {
						boolMap.put(line.split(" ")[1], boolStack.pop());
					}
					line =getNextInstruction(bufferReader,"");
				} else if (line.startsWith("PUSH")) {
					String str = line.split(" ")[1];
					if (checkInt(str)) {
						intStack.push(Integer.parseInt(str));
					} else {
						boolStack.push(Boolean.parseBoolean(str));
					}
					line = getNextInstruction(bufferReader,"");
				} else if (line.startsWith("DISPLAY")) {
					String str = line.split(" ")[1];
					if (intMap.containsKey(str)) {
						System.out.println(intStack.pop());

					} else if (boolMap.containsKey(str)) {
						System.out.println(boolStack.pop());
					}
					line = getNextInstruction(bufferReader,"");
				} else if (line.startsWith("LOAD")) {
					String str = line.split(" ")[1];
					if (intMap.containsKey(str)) {
						intStack.push(intMap.get(str));
					} else if (boolMap.containsKey(str)) {
						boolStack.push(boolMap.get(str));
					}
					line = getNextInstruction(bufferReader,"");
				} else if (line.startsWith("ADD")) {
					intStack.push(intStack.pop() + intStack.pop());
					line = getNextInstruction(bufferReader,"");
				} else if (line.startsWith("SUB")) {
					intStack.push(intStack.pop() - intStack.pop());
				} else if (line.startsWith("MUL")) {
					intStack.push(intStack.pop() * intStack.pop());
				} else if (line.startsWith("DIV")) {
					int x = intStack.pop();
					int y = intStack.pop();
					if (x > 0)
						intStack.push(y / x);
					else
						System.out.println("ERROR:Cannot Divide by zero");
				} else if (line.startsWith("EQ")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue == secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("NEQ")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue != secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("LT")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue < secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("LTE")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue <= secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("GT")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue > secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("LTE")) {
					int firstValue = intStack.pop();
					int secondValue = intStack.pop();
					boolean result = false;
					if (firstValue >= secondValue) {
						result = true;
					}
					boolStack.push(result);
				} else if (line.startsWith("AND")) {
				    if(boolStack.pop()&&boolStack.pop()) {
				        boolStack.push(true);
                    } else {
				        boolStack.push(false);
                    }
                } else if (line.startsWith("OR")) {
                    if(boolStack.pop() || boolStack.pop()) {
                        boolStack.push(true);
                    } else {
                        boolStack.push(false);
                    }
                } else if (line.startsWith("NOT")) {
                    if(!boolStack.pop()) {
                        boolStack.push(true);
                    } else {
                        boolStack.push(false);
                    }
                }

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	boolean checkInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	String getNextInstruction(BufferedReader bufferReader,String label) {
		String line = "";
		try {
			line = bufferReader.readLine();

			if (label == "") {
				return line;
			} else {

				while (!(line.startsWith(label))) {
					line = bufferReader.readLine();
				}
				return line;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return "";
	}
}
