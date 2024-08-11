package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8その6行データDto
 */
public class RowShito0806Dto implements Serializable { // NOPMD

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 行番号 */
    @JacksonXmlProperty(localName = "ICHIREN_NO")
    private Integer rowNo;

    /** 発生日 */
    @JacksonXmlProperty(localName = "DT")
    private String accrualDate;

    /** 金額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long amount;

    /** 備考 */
    @JacksonXmlProperty(localName = "BIKOU")
    private String bikou;

    /**
     * 行番号を取得する
     *
     * @return 行番号
     */
    public Integer getRowNo() {
        return rowNo;
    }

    /**
     * 行番号を設定する
     *
     * @param rowNo 行番号
     */
    public void setRowNo(final Integer rowNo) {
        this.rowNo = rowNo;
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
     * 発生日を設定する
     *
     * @param accrualDate 発生日
     */
    public void setAccrualDate(final String accrualDate) {
        this.accrualDate = accrualDate;
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
     * 金額を設定する
     *
     * @param amount 金額
     */
    public void setAmount(final Long amount) {
        this.amount = amount;
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
     * 備考を設定する
     *
     * @param bikou 備考
     */
    public void setBikou(final String bikou) {
        this.bikou = bikou;
    }

}
