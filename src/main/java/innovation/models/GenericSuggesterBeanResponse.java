package innovation.models;


import java.util.List;

public class GenericSuggesterBeanResponse {

    List<SuggesterBean> suggestions;

    private int total;

    public GenericSuggesterBeanResponse() {
    }

    public GenericSuggesterBeanResponse(List<SuggesterBean> suggestions, int total) {
        this.suggestions = suggestions;
        this.total = total;
    }

    public List<SuggesterBean> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<SuggesterBean> suggestions) {
        this.suggestions = suggestions;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
