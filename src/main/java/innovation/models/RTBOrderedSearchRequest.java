package innovation.models;

public class RTBOrderedSearchRequest {
    public String keyword;
    public RTBOperation operation;

    public RTBOrderedSearchRequest() {
    }

    public RTBOrderedSearchRequest(String keyword, RTBOperation operation) {
        this.keyword = keyword;
        this.operation = operation;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public RTBOperation getOperation() {
        return operation;
    }

    public void setOperation(RTBOperation operation) {
        this.operation = operation;
    }
}
