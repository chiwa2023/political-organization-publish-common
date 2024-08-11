package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の5シートDto
 */
public class Sheet0805Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 合計金額 */
    @JacksonXmlProperty(localName = "KINGAKU_GK")
    private Long sumAmount = 0L;

    /** 項目リスト */
    @JacksonXmlProperty(localName = "ROW")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RowShito0805Dto> list = new ArrayList<>();

    /**
     * 合計金額を取得する
     *
     * @return 合計金額
     */
    public Long getSumAmount() {
        return sumAmount;
    }

    /**
     * 合計金額を設定する
     *
     * @param sumAmount 合計金額
     */
    public void setSumAmount(final Long sumAmount) {
        this.sumAmount = sumAmount;
    }

    /**
     * 項目リストを取得する
     *
     * @return 項目リスト
     */
    public List<RowShito0805Dto> getList() {
        return list;
    }

    /**
     * 項目リストを設定する
     *
     * @param list 項目リスト
     */
    public void setList(final List<RowShito0805Dto> list) {
        this.list = list;
    }

}
