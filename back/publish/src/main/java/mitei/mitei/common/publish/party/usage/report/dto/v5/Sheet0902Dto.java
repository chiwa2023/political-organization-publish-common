package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式9の2の行Dto
 */
public class Sheet0902Dto implements Serializable { // NOPMD

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 項目 */
    @JacksonXmlProperty(localName = "KOMOKU")
    private String itemName;

    /** 摘要 */
    @JacksonXmlProperty(localName = "TEKIYO")
    private String digest;

    /** 団体名称 */
    @JacksonXmlProperty(localName = "DANTAI_NM")
    private String dantaiName;

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
     * 政治団体名称を取得する
     *
     * @return 政治団体名称
     */
    public String getDantaiName() {
        return dantaiName;
    }

    /**
     * 政治団体名称を設定する
     *
     * @param dantaiName 政治団体名称
     */
    public void setDantaiName(final String dantaiName) {
        this.dantaiName = dantaiName;
    }

}
