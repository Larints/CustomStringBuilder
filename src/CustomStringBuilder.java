import java.util.Stack;

public class CustomStringBuilder {

    private final StringBuilder stringBuilder;

    private final Stack<String> undoStack;

    public CustomStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.undoStack = new Stack<>();
        undoStack.push("");
    }

    public CustomStringBuilder(String initString) {
        this.stringBuilder = new StringBuilder();
        stringBuilder.append(initString);
        undoStack = new Stack<>();
        undoStack.push("");
    }

    public void append(String string) {
        undoStack.push(stringBuilder.toString());
        stringBuilder.append(string);
    }

    public void undo() {
        if (stringBuilder.isEmpty()) return;
        stringBuilder.setLength(0);
        stringBuilder.append(undoStack.pop());
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }


    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
