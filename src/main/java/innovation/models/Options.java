package innovation.models;

public class Options {
    private String text;

    private String score;

    public Options() {
    }

    public Options(String text, String score) {
        this.text = text;
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
