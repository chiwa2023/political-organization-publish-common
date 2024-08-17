package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8その6シートDto
 */
public class Sheet0806Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 基金名称 */
    @JacksonXmlProperty(localName = "KIKIN_NM")
    private String fundsName = "";

    /** 全年まで残合計 */
    @JacksonXmlProperty(localName = "ZENNEN_ZAN_GK")
    private Long totalLastYear = 0L;

    /** 基金目的 */
    @JacksonXmlProperty(localName = "MOKUTEKI")
    private String fundsPurpose = "";

    /** 本年合計 */
    @JacksonXmlProperty(localName = "GOUKEI_GK")
    private Long total = 0L;

    /** 本年合計備考 */
    @JacksonXmlProperty(localName = "GOUKEI_BIKOU")
    private String totalBikou = "";

    /** 本年残合計 */
    @JacksonXmlProperty(localName = "HONNEN_ZAN_GK")
    private Long totalThisYear = 0L;

    /** 本年残合計備考 */
    @JacksonXmlProperty(localName = "HONNEN_ZAN_BIKOU")
    private String totalThisYearBikou = "";

    /** 増減合計 */
    @JacksonXmlProperty(localName = "ZOUGEN_GK")
    private Long totalIncrease = 0L;

    /** 増減合計備考 */
    @JacksonXmlProperty(localName = "ZOUGEN_BIKOU")
    private String totalIncreaseBikou = "";

    /** 区分1(積み立て) */
    @JacksonXmlProperty(localName = "KUBUN1")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080601Dto kbn080601Dto = new Kbn080601Dto();

    /** 区分2(果実) */
    @JacksonXmlProperty(localName = "KUBUN2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080602Dto kbn080602Dto = new Kbn080602Dto();

    /** 区分3(取り崩し) */
    @JacksonXmlProperty(localName = "KUBUN3")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080603Dto kbn080603Dto = new Kbn080603Dto();

    /**
     * 基金名称を取得する
     *
     * @return 基金名称
     */
    public String getFundsName() {
        return fundsName;
    }

    /**
     * 基金名称を設定する
     *
     * @param fundsName 基金名称
     */
    public void setFundsName(final String fundsName) {
        this.fundsName = fundsName;
    }

    /**
     * 全年まで残合計を取得する
     *
     * @return 全年まで残合計
     */
    public Long getTotalLastYear() {
        return totalLastYear;
    }

    /**
     * 全年まで残合計を設定する
     *
     * @param totalLastYear 全年まで残合計
     */
    public void setTotalLastYear(final Long totalLastYear) {
        this.totalLastYear = totalLastYear;
    }

    /**
     * 基金目的を取得する
     *
     * @return 基金目的
     */
    public String getFundsPurpose() {
        return fundsPurpose;
    }

    /**
     * 基金目的を設定する
     *
     * @param fundsPurpose 基金目的
     */
    public void setFundsPurpose(final String fundsPurpose) {
        this.fundsPurpose = fundsPurpose;
    }

    /**
     * 本年合計を取得する
     *
     * @return 本年合計
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 本年合計を設定する
     *
     * @param total 本年合計
     */
    public void setTotal(final Long total) {
        this.total = total;
    }

    /**
     * 本年合計備考を取得する
     *
     * @return 本年合計備考
     */
    public String getTotalBikou() {
        return totalBikou;
    }

    /**
     * 本年合計備考を設定する
     *
     * @param totalBikou 本年合計備考
     */
    public void setTotalBikou(final String totalBikou) {
        this.totalBikou = totalBikou;
    }

    /**
     * 本年残合計を取得する
     *
     * @return 本年残合計
     */
    public Long getTotalThisYear() {
        return totalThisYear;
    }

    /**
     * 本年残合計を設定する
     *
     * @param totalThisYear 本年残合計
     */
    public void setTotalThisYear(final Long totalThisYear) {
        this.totalThisYear = totalThisYear;
    }

    /**
     * 本年残合計備考を取得する
     *
     * @return 本年残合計備考
     */
    public String getTotalThisYearBikou() {
        return totalThisYearBikou;
    }

    /**
     * 本年残合計備考を設定する
     *
     * @param totalThisYearBikou 本年残合計備考
     */
    public void setTotalThisYearBikou(final String totalThisYearBikou) {
        this.totalThisYearBikou = totalThisYearBikou;
    }

    /**
     * 増減合計を取得する
     *
     * @return 増減合計
     */
    public Long getTotalIncrease() {
        return totalIncrease;
    }

    /**
     * 増減合計を設定する
     *
     * @param totalIncrease 増減合計
     */
    public void setTotalIncrease(final Long totalIncrease) {
        this.totalIncrease = totalIncrease;
    }

    /**
     * 増減合計備考を取得する
     *
     * @return 増減合計備考
     */
    public String getTotalIncreaseBikou() {
        return totalIncreaseBikou;
    }

    /**
     * 増減合計備考を設定する
     *
     * @param totalIncreaseBikou 増減合計備考
     */
    public void setTotalIncreaseBikou(final String totalIncreaseBikou) {
        this.totalIncreaseBikou = totalIncreaseBikou;
    }

    /**
     * 区分1(積み立て)を取得する
     *
     * @return 区分1(積み立て)
     */
    public Kbn080601Dto getKbn080601Dto() {
        return kbn080601Dto;
    }

    /**
     * 区分1(積み立て)を設定する
     *
     * @param kbn080601Dto 区分1(積み立て)
     */
    public void setKbn080601Dto(final Kbn080601Dto kbn080601Dto) {
        this.kbn080601Dto = kbn080601Dto;
    }

    /**
     * 区分2(果実)を取得する
     *
     * @return 区分2(果実)
     */
    public Kbn080602Dto getKbn080602Dto() {
        return kbn080602Dto;
    }

    /**
     * 区分2(果実)を設定する
     *
     * @param kbn080602Dto 区分2(果実)
     */
    public void setKbn080602Dto(final Kbn080602Dto kbn080602Dto) {
        this.kbn080602Dto = kbn080602Dto;
    }

    /**
     * 区分3(取り崩し)を取得する
     *
     * @return 区分3(取り崩し)
     */
    public Kbn080603Dto getKbn080603Dto() {
        return kbn080603Dto;
    }

    /**
     * 区分3(取り崩し)を設定する
     *
     * @param kbn080603Dto 区分3(取り崩し)
     */
    public void setKbn080603Dto(final Kbn080603Dto kbn080603Dto) {
        this.kbn080603Dto = kbn080603Dto;
    }

}
