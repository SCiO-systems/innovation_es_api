package innovation.models;

public class BaseResponse {
    private String code;

    private Object response;

    public BaseResponse() {
    }

    public BaseResponse(String code, Object response) {
        this.code = code;
        this.response = response;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
