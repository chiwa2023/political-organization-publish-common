package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * XMl全体にどこの区分にデータが入っているかを表すテキスト
 */
public class SitoUmuFlgDto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** データ存在の有無一覧テキスト */
    @JacksonXmlProperty(localName = "SITO_UMU")
    private String umuStatusText;

    /**
     * データ存在の有無一覧テキストを取得する
     *
     * @return データ存在の有無一覧テキスト
     */
    public String getUmuStatusText() {
        return umuStatusText;
    }

    /**
     * データ存在の有無一覧テキストを設定する
     *
     * @param umuStatusText データ存在の有無一覧テキスト
     */
    public void setUmuStatusText(final String umuStatusText) {
        this.umuStatusText = umuStatusText;
    }

}
