package innovation.models;

public class SdgTargetUI {
    private String sdg_short_name;

    private String sdg_full_name;

    private String sdg_target;

    private String sdg_target_code;

    private String sdg_unsd_code;

    public SdgTargetUI() {
    }

    public SdgTargetUI(String sdg_short_name, String sdg_full_name, String sdg_target, String sdg_target_code, String sdg_unsd_code) {
        this.sdg_short_name = sdg_short_name;
        this.sdg_full_name = sdg_full_name;
        this.sdg_target = sdg_target;
        this.sdg_target_code = sdg_target_code;
        this.sdg_unsd_code = sdg_unsd_code;
    }

    public String getSdg_short_name() {
        return sdg_short_name;
    }

    public void setSdg_short_name(String sdg_short_name) {
        this.sdg_short_name = sdg_short_name;
    }

    public String getSdg_full_name() {
        return sdg_full_name;
    }

    public void setSdg_full_name(String sdg_full_name) {
        this.sdg_full_name = sdg_full_name;
    }

    public String getSdg_target() {
        return sdg_target;
    }

    public void setSdg_target(String sdg_target) {
        this.sdg_target = sdg_target;
    }

    public String getSdg_target_code() {
        return sdg_target_code;
    }

    public void setSdg_target_code(String sdg_target_code) {
        this.sdg_target_code = sdg_target_code;
    }

    public String getSdg_unsd_code() {
        return sdg_unsd_code;
    }

    public void setSdg_unsd_code(String sdg_unsd_code) {
        this.sdg_unsd_code = sdg_unsd_code;
    }
}
