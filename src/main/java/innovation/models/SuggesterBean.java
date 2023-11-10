package innovation.models;

import java.util.List;

public class SuggesterBean {

    private String text;

    private List<Options> options;

    public SuggesterBean() {
    }

    public SuggesterBean(String text, List<Options> options) {
        this.text = text;
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }
}
