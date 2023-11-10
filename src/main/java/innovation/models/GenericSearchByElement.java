package innovation.models;

public class GenericSearchByElement {
    private String title;

    private String alias;

    public GenericSearchByElement() {
    }

    public GenericSearchByElement(String title, String alias) {
        this.title = title;
        this.alias = alias;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
