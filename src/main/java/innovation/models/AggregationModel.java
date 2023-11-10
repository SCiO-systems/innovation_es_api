package innovation.models;

import java.util.List;

public class AggregationModel {
    private String key;

    private List<ValueDocCountModel> value_doc_count;

    public AggregationModel() {
    }

    public AggregationModel(String key, List<ValueDocCountModel> value_doc_count) {
        this.key = key;
        this.value_doc_count = value_doc_count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<ValueDocCountModel> getValue_doc_count() {
        return value_doc_count;
    }

    public void setValue_doc_count(List<ValueDocCountModel> value_doc_count) {
        this.value_doc_count = value_doc_count;
    }
}
