package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8の7添付書類報告兼宣誓書
 */
public class Sheet0807Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 添付書類：領収書の写し */
    @JacksonXmlProperty(localName = "TENPU1")
    private Integer copyRecipt = 0;

    /** 添付書類：監査意見書 */
    @JacksonXmlProperty(localName = "TENPU2")
    private Integer auditOption = 0;

    /** 添付書類：本部のみ監査報告書 */
    @JacksonXmlProperty(localName = "TENPU3")
    private Integer auditReport = 0;

    /** 添付書類：本部が支部から受け取りした支部報告書、監査意見書 */
    @JacksonXmlProperty(localName = "TENPU4")
    private Integer shibuDocument = 0;

    /** 添付書類：統括文書または支部総括文書 */
    @JacksonXmlProperty(localName = "TENPU5")
    private Integer governingDocument = 0;

    /** 相違がないか確認 */
    @JacksonXmlProperty(localName = "KAKUNIN1")
    private Integer flgConfirm = 0;

    /** 宣誓日 */
    @JacksonXmlProperty(localName = "DT")
    private String accuralDate = "";

    /**
     * 領収書の写しを取得する
     *
     * @return 領収書の写し
     */
    public Integer getCopyRecipt() {
        return copyRecipt;
    }

    /**
     * 領収書の写しを設定する
     *
     * @param copyRecipt 領収書の写し
     */
    public void setCopyRecipt(final Integer copyRecipt) {
        this.copyRecipt = copyRecipt;
    }

    /**
     * 監査意見書を取得する
     *
     * @return 監査意見書
     */
    public Integer getAuditOption() {
        return auditOption;
    }

    /**
     * 監査意見書を設定する
     *
     * @param auditOption 監査意見書
     */
    public void setAuditOption(final Integer auditOption) {
        this.auditOption = auditOption;
    }

    /**
     * 本部のみ監査報告書を取得する
     *
     * @return 本部のみ監査報告書
     */
    public Integer getAuditReport() {
        return auditReport;
    }

    /**
     * 本部のみ監査報告書を設定する
     *
     * @param auditReport 本部のみ監査報告書
     */
    public void setAuditReport(final Integer auditReport) {
        this.auditReport = auditReport;
    }

    /**
     * 本部が支部から受け取りした支部報告書、監査意見書を取得する
     *
     * @return 本部が支部から受け取りした支部報告書、監査意見書
     */
    public Integer getShibuDocument() {
        return shibuDocument;
    }

    /**
     * 本部が支部から受け取りした支部報告書、監査意見書を設定する
     *
     * @param shibuDocument 本部が支部から受け取りした支部報告書、監査意見書
     */
    public void setShibuDocument(final Integer shibuDocument) {
        this.shibuDocument = shibuDocument;
    }

    /**
     * 統括文書または支部総括文書を取得する
     *
     * @return 統括文書または支部総括文書
     */
    public Integer getGoverningDocument() {
        return governingDocument;
    }

    /**
     * 統括文書または支部総括文書を設定する
     *
     * @param governingDocument 統括文書または支部総括文書
     */
    public void setGoverningDocument(final Integer governingDocument) {
        this.governingDocument = governingDocument;
    }

    /**
     * 相違がないか確認を取得する
     *
     * @return 相違がないか確認
     */
    public Integer getFlgConfirm() {
        return flgConfirm;
    }

    /**
     * 相違がないか確認を設定する
     *
     * @param flgConfirm 相違がないか確認
     */
    public void setFlgConfirm(final Integer flgConfirm) {
        this.flgConfirm = flgConfirm;
    }

    /**
     * 宣誓日を取得する
     *
     * @return 宣誓日
     */
    public String getAccuralDate() {
        return accuralDate;
    }

    /**
     * 宣誓日を設定する
     *
     * @param accuralDate 宣誓日
     */
    public void setAccuralDate(final String accuralDate) {
        this.accuralDate = accuralDate;
    }

}
