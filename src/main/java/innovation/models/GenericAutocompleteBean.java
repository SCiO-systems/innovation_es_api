package innovation.models;

public class GenericAutocompleteBean {

    private String autocomplete;

    private String alias;

    private String field;

    public GenericAutocompleteBean() {
    }

    public GenericAutocompleteBean(String autocomplete, String alias, String field) {
        this.autocomplete = autocomplete;
        this.alias = alias;
        this.field = field;
    }

    public String getAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
