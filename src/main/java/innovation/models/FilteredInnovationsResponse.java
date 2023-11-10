package innovation.models;

import java.util.List;

public class FilteredInnovationsResponse {
    private List<InnovationMainRootUpdated> documents;

    private List<AggregationModel> aggregations;

    private int total;

    public FilteredInnovationsResponse() {
    }

    public FilteredInnovationsResponse(List<InnovationMainRootUpdated> documents, List<AggregationModel> aggregations, int total) {
        this.documents = documents;
        this.aggregations = aggregations;
        this.total = total;
    }

    public List<InnovationMainRootUpdated> getDocuments() {
        return documents;
    }

    public void setDocuments(List<InnovationMainRootUpdated> documents) {
        this.documents = documents;
    }

    public List<AggregationModel> getAggregations() {
        return aggregations;
    }

    public void setAggregations(List<AggregationModel> aggregations) {
        this.aggregations = aggregations;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
