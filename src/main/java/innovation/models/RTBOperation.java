package innovation.models;

public class RTBOperation {
    public String action;

    public RTBDetails details;

    public RTBOperation() {
    }

    public RTBOperation(String action, RTBDetails details) {
        this.action = action;
        this.details = details;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RTBDetails getDetails() {
        return details;
    }

    public void setDetails(RTBDetails details) {
        this.details = details;
    }
}
