package day5.MultilevelInherit.Texteditor;

public class Wordpad extends Notepad{
	private boolean isBold;

    public Wordpad() {
        super();
        this.isBold = false;
    }
//word pad
    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}
