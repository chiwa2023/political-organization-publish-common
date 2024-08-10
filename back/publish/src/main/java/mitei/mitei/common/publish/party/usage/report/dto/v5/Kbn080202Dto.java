package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式番号8の2の区分1
 */
public class Kbn080202Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 合計金額 */
    @JacksonXmlProperty(localName = "KINGAKU_GK")
    private Long totalAmount = 0L;

    /** 行リスト */
    @JacksonXmlProperty(localName = "ROW")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RowShito0802Dto> list = new ArrayList<>();

    /**
     * 合計金額を取得する
     *
     * @return 合計金額
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * 合計金額を設定する
     *
     * @param totalAmount 合計金額
     */
    public void setTotalAmount(final Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 行リストを取得する
     *
     * @return 行リスト
     */
    public List<RowShito0802Dto> getList() {
        return list;
    }

    /**
     * 行リストを設定する
     *
     * @param list 行リスト
     */
    public void setList(final List<RowShito0802Dto> list) {
        this.list = list;
    }

}
