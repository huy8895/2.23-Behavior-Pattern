package Package1.Command.Demo2;

public class DocumentEditorCommand implements Command {
    private Document document;
    private String text;

    public DocumentEditorCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void undo() {
        document.eraserLast();

    }

    @Override
    public void redo() {
        document.write(text);
    }
}
