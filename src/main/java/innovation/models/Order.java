package innovation.models;

public class Order {
    public String field;
    public String sort;

    public Order() {
    }

    public Order(String field, String sort) {
        this.field = field;
        this.sort = sort;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
