package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * 様式17その3 機関誌とその他の事業の収入の列項目Dto
 */
public class Row070900AnonymousInPoliticalPartyDto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 連番 */
    @JacksonXmlProperty(localName = "ICHIREN_NO")
    private Integer ichirenNo;

    /** 場所 */
    @JacksonXmlProperty(localName = "BASYO")
    private String basho;

    /** 金額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long kingaku;

    /** 発生日 */
    @JacksonXmlProperty(localName = "DT")
    private String accrualDate;

    /** 備考 */
    @JacksonXmlProperty(localName = "BIKOU")
    private String biko;

    /**
     * 連番を取得する
     *
     * @return 連番
     */
    public Integer getIchirenNo() {
        return ichirenNo;
    }

    /**
     * 連番を設定する
     *
     * @param ichirenNo 連番
     */
    public void setIchirenNo(final Integer ichirenNo) {
        this.ichirenNo = ichirenNo;
    }

    /**
     * 金額を取得する
     *
     * @return 金額
     */
    public Long getKingaku() {
        return kingaku;
    }

    /**
     * 金額を設定する
     *
     * @param kingaku 金額
     */
    public void setKingaku(final Long kingaku) {
        this.kingaku = kingaku;
    }

    /**
     * 備考を取得する
     *
     * @return 備考
     */
    public String getBiko() {
        return biko;
    }

    /**
     * 備考を設定する
     *
     * @param biko 備考
     */
    public void setBiko(final String biko) {
        this.biko = biko;
    }

    /**
     * 場所を取得する
     *
     * @return 場所
     */
    public String getBasho() {
        return basho;
    }

    /**
     * 場所を設定する
     *
     * @param basho 場所
     */
    public void setBasho(final String basho) {
        this.basho = basho;
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

}
