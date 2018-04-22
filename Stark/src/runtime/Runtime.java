package runtime;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;

public class Runtime {

    String intermediateFilePath;

    public static void main(String args[]) {
        Runtime runtime = new Runtime("data\\intermediate_code\\assignIC.txt");
    }

    public Runtime(String path) {
        intermediateFilePath = path;
        EvaluateProgram();
    }

    public void EvaluateProgram() {
        try {
            FileReader reader = new FileReader(intermediateFilePath);
            BufferedReader bufferReader = new BufferedReader(reader);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
