package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 支出行項目Dto
 */
public class RowShitoCoreDto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 行番号 */
    @JacksonXmlProperty(localName = "ICHIREN_NO")
    private Integer rowNo;

    /** 取引項目 */
    @JacksonXmlProperty(localName = "MOKUTEKI")
    private String usageItem;

    /** 総支出額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long amountAll;

    /** 政党交付金空の支出（充当） */
    @JacksonXmlProperty(localName = "KOUFU_JYUUTOU_GK")
    private Long amountKoufukin;

    /** 政党基金からの支出（充当） */
    @JacksonXmlProperty(localName = "KIKIN_JYUUTOU_GK")
    private Long amountMyFunds;

    /** 発生日 */
    @JacksonXmlProperty(localName = "DT")
    private String accrualDate;

    /** 取引相手名称 */
    @JacksonXmlProperty(localName = "NM")
    private String payeeName;

    /** 取引相手住所 */
    @JacksonXmlProperty(localName = "ADR")
    private String address;

    /** 備考 */
    @JacksonXmlProperty(localName = "BIKOU")
    private String bikou;

    /** 領収書を徴し難い区分 */
    @JacksonXmlProperty(localName = "RYOUSYU")
    private Integer flgCollectRecipt;

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
     * 取引項目を取得する
     *
     * @return 取引項目
     */
    public String getUsageItem() {
        return usageItem;
    }

    /**
     * 取引項目を設定する
     *
     * @param usageItem 取引項目
     */
    public void setUsageItem(final String usageItem) {
        this.usageItem = usageItem;
    }

    /**
     * 総支出額を取得する
     *
     * @return 総支出額
     */
    public Long getAmountAll() {
        return amountAll;
    }

    /**
     * 総支出額を設定する
     *
     * @param amountAll 総支出額
     */
    public void setAmountAll(final Long amountAll) {
        this.amountAll = amountAll;
    }

    /**
     * 政党交付金空の支出（充当）を取得する
     *
     * @return 政党交付金空の支出（充当）
     */
    public Long getAmountKoufukin() {
        return amountKoufukin;
    }

    /**
     * 政党交付金空の支出（充当）を設定する
     *
     * @param amountKoufukin 政党交付金空の支出（充当）
     */
    public void setAmountKoufukin(final Long amountKoufukin) {
        this.amountKoufukin = amountKoufukin;
    }

    /**
     * 政党基金からの支出（充当）を取得する
     *
     * @return 政党基金からの支出（充当）
     */
    public Long getAmountMyFunds() {
        return amountMyFunds;
    }

    /**
     * 政党基金からの支出（充当）を設定する
     *
     * @param amountMyFunds 政党基金からの支出（充当）
     */
    public void setAmountMyFunds(final Long amountMyFunds) {
        this.amountMyFunds = amountMyFunds;
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
     * 取引相手名称 を取得する
     *
     * @return 取引相手名称
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * 取引相手名称 を設定する
     *
     * @param payeeName 取引相手名称
     */
    public void setPayeeName(final String payeeName) {
        this.payeeName = payeeName;
    }

    /**
     * 取引相手住所を取得する
     *
     * @return 取引相手住所
     */
    public String getAddress() {
        return address;
    }

    /**
     * 取引相手住所を設定する
     *
     * @param address 取引相手住所
     */
    public void setAddress(final String address) {
        this.address = address;
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

    /**
     * 領収書を徴し難い区分を取得する
     *
     * @return 領収書を徴し難い区分
     */
    public Integer getFlgCollectRecipt() {
        return flgCollectRecipt;
    }

    /**
     * 領収書を徴し難い区分を設定する
     *
     * @param flgCollectRecipt 領収書を徴し難い区分
     */
    public void setFlgCollectRecipt(final Integer flgCollectRecipt) {
        this.flgCollectRecipt = flgCollectRecipt;
    }

}
