package Package1.Command.Demo2;

import java.util.Stack;
import java.util.regex.Pattern;

public class Document {
    Stack<String> lines = new Stack<>();



    void write(String text){
        lines.push(text);
    }

    void eraserLast(){
        if (!lines.isEmpty()){
            lines.pop();
        }

    }

    void readDocument(){
        for (String line: lines) {
            System.out.println(line);
        }
    }
}
