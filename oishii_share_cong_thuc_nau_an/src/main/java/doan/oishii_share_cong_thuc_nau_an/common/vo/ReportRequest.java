package doan.oishii_share_cong_thuc_nau_an.common.vo;

import lombok.Data;

@Data
public class ReportRequest {
    private String mien;
    private String from_date;
    private String to_date;
    private Integer from_star;
    private Integer to_star;
}
