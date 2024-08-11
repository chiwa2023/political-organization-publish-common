package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8その6区分2(果実)
 */
public class Kbn080602Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 金額小計 */
    @JacksonXmlProperty(localName = "SYOUKEI_GK")
    private Long subTotal;

    /** 小計備考 */
    @JacksonXmlProperty(localName = "SYOUKEI_BIKOU")
    private String subTotalBikou;

    /** 行リスト */
    @JacksonXmlProperty(localName = "ROW")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RowShito0806Dto> list = new ArrayList<>();

    /**
     * 金額小計を取得する
     *
     * @return 金額小計
     */
    public Long getSubTotal() {
        return subTotal;
    }

    /**
     * 金額小計を設定する
     *
     * @param subTotal 金額小計
     */
    public void setSubTotal(final Long subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * 小計備考を取得する
     *
     * @return 小計備考
     */
    public String getSubTotalBikou() {
        return subTotalBikou;
    }

    /**
     * 小計備考を設定する
     *
     * @param subTotalBikou 小計備考
     */
    public void setSubTotalBikou(final String subTotalBikou) {
        this.subTotalBikou = subTotalBikou;
    }

    /**
     * 行リストを取得する
     *
     * @return 行リスト
     */
    public List<RowShito0806Dto> getList() {
        return list;
    }

    /**
     * 行リストを設定する
     *
     * @param list 行リスト
     */
    public void setList(final List<RowShito0806Dto> list) {
        this.list = list;
    }

}
