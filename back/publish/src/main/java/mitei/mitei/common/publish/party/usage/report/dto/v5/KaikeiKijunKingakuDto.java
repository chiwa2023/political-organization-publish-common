package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 会計における支出基準設定シート(隠しシート?)
 */
public class KaikeiKijunKingakuDto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 金額 */
    @JacksonXmlProperty(localName = "KINGAKU")
    private Long amount;

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

}
