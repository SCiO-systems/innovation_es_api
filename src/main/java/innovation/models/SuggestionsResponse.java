package innovation.models;

import java.util.List;

public class SuggestionsResponse {

    private List<Object> suggestions;

    public SuggestionsResponse() {
    }

    public SuggestionsResponse(List<Object> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Object> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Object> suggestions) {
        this.suggestions = suggestions;
    }
}
