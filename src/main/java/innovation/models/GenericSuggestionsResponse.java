package innovation.models;

import java.util.List;

public class GenericSuggestionsResponse {

    List<Object> suggestions;

    private int total;

    public GenericSuggestionsResponse() {
    }

    public GenericSuggestionsResponse(List<Object> suggestions, int total) {
        this.suggestions = suggestions;
        this.total = total;
    }

    public List<Object> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Object> suggestions) {
        this.suggestions = suggestions;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
