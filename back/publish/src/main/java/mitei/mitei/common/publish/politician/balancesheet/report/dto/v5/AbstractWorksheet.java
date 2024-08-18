package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * ワークシートで出力するときの最低限のフィールドを設定
 */
@JacksonXmlRootElement(localName = "SHEET")
public class AbstractWorksheet { // NOPMD DataClass

    /** シートの合計 */
    @JacksonXmlProperty(localName = "KINGAKU_GK")
    private Long pageTotal = 0L;

    /**
     * ページ計金額を取得する
     *
     * @return ページ計金額
     */
    public Long getPageTotal() {
        return pageTotal;
    }

    /**
     * ページ計金額を設定する
     *
     * @param pageTotal ページ計金額
     */
    public void setPageTotal(final Long pageTotal) {
        this.pageTotal = pageTotal;
    }

}
