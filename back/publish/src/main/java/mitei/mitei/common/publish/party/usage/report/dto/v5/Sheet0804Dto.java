package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 様式8の４シート
 */
@JacksonXmlRootElement(localName = "SHEET")
public class Sheet0804Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 費目 */
    @JacksonXmlProperty(localName = "HIMOKU")
    private String himoku = "";

    /** その他合計金額 */
    @JacksonXmlProperty(localName = "KINGAKU_SONOTA_GK")
    private Long sonotaAmount = 0L;

    /** その他交付金合計 */
    @JacksonXmlProperty(localName = "KOUFU_SONOTA_GK")
    private String sonotaKoufukin;

    /** その他政党基金合計 */
    @JacksonXmlProperty(localName = "KIKIN_SONOTA_GK")
    private String sonotaMyFunds;

    /** 全金額合計 */
    @JacksonXmlProperty(localName = "KINGAKU_KINGAKU_GK")
    private Long amountAll = 0L;

    /** 交付金金額合計 */
    @JacksonXmlProperty(localName = "KOUFU_KINGAKU_GK")
    private Long amountAllKoufukin = 0L;

    /** 政党基金合計 */
    @JacksonXmlProperty(localName = "KIKIN_KINGAKU_GK")
    private Long amountAllMyFunds = 0L;

    /** 項目リスト */
    @JacksonXmlProperty(localName = "ROW")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RowShitoCoreDto> list = new ArrayList<>();

    /**
     * 費目を取得する
     *
     * @return 費目
     */
    public String getHimoku() {
        return himoku;
    }

    /**
     * 費目を設定する
     *
     * @param himoku 費目
     */
    public void setHimoku(final String himoku) {
        this.himoku = himoku;
    }

    /**
     * その他合計金額を取得する
     *
     * @return その他合計金額
     */
    public Long getSonotaAmount() {
        return sonotaAmount;
    }

    /**
     * その他合計金額を設定する
     *
     * @param sonotaAmount その他合計金額
     */
    public void setSonotaAmount(final Long sonotaAmount) {
        this.sonotaAmount = sonotaAmount;
    }

    /**
     * その他交付金合計を取得する
     *
     * @return その他交付金合計
     */
    public String getSonotaKoufukin() {
        return sonotaKoufukin;
    }

    /**
     * その他交付金合計を設定する
     *
     * @param sonotaKoufukin その他交付金合計
     */
    public void setSonotaKoufukin(final String sonotaKoufukin) {
        this.sonotaKoufukin = sonotaKoufukin;
    }

    /**
     * その他政党基金合計を取得する
     *
     * @return その他政党基金合計
     */
    public String getSonotaMyFunds() {
        return sonotaMyFunds;
    }

    /**
     * その他政党基金合計を設定する
     *
     * @param sonotaMyFunds その他政党基金合計
     */
    public void setSonotaMyFunds(final String sonotaMyFunds) {
        this.sonotaMyFunds = sonotaMyFunds;
    }

    /**
     * 全金額合計を取得する
     *
     * @return 全金額合計
     */
    public Long getAmountAll() {
        return amountAll;
    }

    /**
     * 全金額合計を設定する
     *
     * @param amountAll 全金額合計
     */
    public void setAmountAll(final Long amountAll) {
        this.amountAll = amountAll;
    }

    /**
     * 交付金金額合計を取得する
     *
     * @return 交付金金額合計
     */
    public Long getAmountAllKoufukin() {
        return amountAllKoufukin;
    }

    /**
     * 交付金金額合計を設定する
     *
     * @param amountAllKoufukin 交付金金額合計
     */
    public void setAmountAllKoufukin(final Long amountAllKoufukin) {
        this.amountAllKoufukin = amountAllKoufukin;
    }

    /**
     * 政党基金合計を取得する
     *
     * @return 政党基金合計
     */
    public Long getAmountAllMyFunds() {
        return amountAllMyFunds;
    }

    /**
     * 政党基金合計を設定する
     *
     * @param amountAllMyFunds 政党基金合計
     */
    public void setAmountAllMyFunds(final Long amountAllMyFunds) {
        this.amountAllMyFunds = amountAllMyFunds;
    }

    /**
     * 項目リストを取得する
     *
     * @return 項目リスト
     */
    public List<RowShitoCoreDto> getList() {
        return list;
    }

    /**
     * 項目リストを設定する
     *
     * @param list 項目リスト
     */
    public void setList(final List<RowShitoCoreDto> list) {
        this.list = list;
    }

}
