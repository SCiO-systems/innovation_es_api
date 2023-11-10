package innovation.models;

public class ValueDocCountModel {
    private String value;

    private int doc_count;

    public ValueDocCountModel() {
    }

    public ValueDocCountModel(String value, int doc_count) {
        this.value = value;
        this.doc_count = doc_count;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(int doc_count) {
        this.doc_count = doc_count;
    }
}
