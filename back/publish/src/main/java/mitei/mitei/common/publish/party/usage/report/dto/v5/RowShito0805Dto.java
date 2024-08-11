package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8の5の行データDto
 */
public class RowShito0805Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 行番号 */
    @JacksonXmlProperty(localName = "ICHIREN_NO")
    private Integer rowNo;

    /** 支部名称 */
    @JacksonXmlProperty(localName = "SIBU_NM")
    private String sibuName;

    /** 金額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long amount;

    /** 発生日 */
    @JacksonXmlProperty(localName = "DT")
    private String accrualDate;

    /** 目的 */
    @JacksonXmlProperty(localName = "MOKUTEKI")
    private String purpose;

    /** 備考 */
    @JacksonXmlProperty(localName = "BIKOU")
    private String bikou;

    /** 行区分 */
    @JacksonXmlProperty(localName = "ROWKBN")
    private Integer rowKbn;

    /**
     * 行番号を取得する
     *
     * @return 行番号
     */
    public Integer getRowNo() {
        return rowNo;
    }

    /**
     * 行番号設定する
     *
     * @param rowNo 行番号
     */
    public void setRowNo(final Integer rowNo) {
        this.rowNo = rowNo;
    }

    /**
     * 支部名称を取得する
     *
     * @return 支部名称
     */
    public String getSibuName() {
        return sibuName;
    }

    /**
     * 支部名称設定する
     *
     * @param sibuName 支部名称
     */
    public void setSibuName(final String sibuName) {
        this.sibuName = sibuName;
    }

    /**
     * 金額を取得する
     *
     * @return 金額
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 金額設定する
     *
     * @param amount 金額
     */
    public void setAmount(final Long amount) {
        this.amount = amount;
    }

    /**
     * 発生日を取得する
     *
     * @return 発生日
     */
    public String getAccrualDate() {
        return accrualDate;
    }

    /**
     * 発生日設定する
     *
     * @param accrualDate 発生日
     */
    public void setAccrualDate(final String accrualDate) {
        this.accrualDate = accrualDate;
    }

    /**
     * 目的を取得する
     *
     * @return 目的
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 目的設定する
     *
     * @param purpose 目的
     */
    public void setPurpose(final String purpose) {
        this.purpose = purpose;
    }

    /**
     * 備考を取得する
     *
     * @return 備考
     */
    public String getBikou() {
        return bikou;
    }

    /**
     * 備考設定する
     *
     * @param bikou 備考
     */
    public void setBikou(final String bikou) {
        this.bikou = bikou;
    }

    /**
     * 行区分を取得する
     *
     * @return 行区分
     */
    public Integer getRowKbn() {
        return rowKbn;
    }

    /**
     * 行区分設定する
     *
     * @param rowKbn 行区分
     */
    public void setRowKbn(final Integer rowKbn) {
        this.rowKbn = rowKbn;
    }

}
