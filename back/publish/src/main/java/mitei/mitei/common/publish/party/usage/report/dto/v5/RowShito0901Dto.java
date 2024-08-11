package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式9
 */
public class RowShito0901Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 行番号 */
    @JacksonXmlProperty(localName = "ICHIREN_NO")
    private Integer rowNo;

    /** 項目 */
    @JacksonXmlProperty(localName = "KOMOKU")
    private String itemName;

    /** 摘要 */
    @JacksonXmlProperty(localName = "TEKIYOU")
    private String digest;

    /** 金額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long amount;

    /** 発生日 */
    @JacksonXmlProperty(localName = "DT")
    private String accralDate;

    /** 領収書が徴しがたかった事情 */
    @JacksonXmlProperty(localName = "JIJYOU")
    private String explain;

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
     * 項目を取得する
     *
     * @return 項目
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 項目を設定する
     *
     * @param itemName 項目
     */
    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    /**
     * 摘要を取得する
     *
     * @return 摘要
     */
    public String getDigest() {
        return digest;
    }

    /**
     * 摘要を設定する
     *
     * @param digest 摘要
     */
    public void setDigest(final String digest) {
        this.digest = digest;
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
     * 発生日を取得する
     *
     * @return 発生日
     */
    public String getAccralDate() {
        return accralDate;
    }

    /**
     * 発生日を設定する
     *
     * @param accralDate 発生日
     */
    public void setAccralDate(final String accralDate) {
        this.accralDate = accralDate;
    }

    /**
     * 領収書を徴しがたかった事情を取得する
     *
     * @return 領収書を徴しがたかった事情
     */
    public String getExplain() {
        return explain;
    }

    /**
     * 領収書を徴しがたかった事情を設定する
     *
     * @param explain 領収書を徴しがたかった事情
     */
    public void setExplain(final String explain) {
        this.explain = explain;
    }

}
