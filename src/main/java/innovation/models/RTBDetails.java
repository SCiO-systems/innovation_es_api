package innovation.models;

import java.util.List;

public class RTBDetails {
    private List<KeyValueModel> filter;

    private int from;

    private int size;

    public Order order;

    public RTBDetails() {
    }

    public RTBDetails(List<KeyValueModel> filter, int from, int size, Order order) {
        this.filter = filter;
        this.from = from;
        this.size = size;
        this.order = order;
    }

    public List<KeyValueModel> getFilter() {
        return filter;
    }

    public void setFilter(List<KeyValueModel> filter) {
        this.filter = filter;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
