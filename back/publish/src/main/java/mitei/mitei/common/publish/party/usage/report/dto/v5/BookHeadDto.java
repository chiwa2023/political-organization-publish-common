package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書全Xmlのヘッダ
 */
public class BookHeadDto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** バージョン番号 */
    @JacksonXmlProperty(localName = "VERSION")
    private String version;

    /** アプリ名称 */
    @JacksonXmlProperty(localName = "APP")
    private String apliName;

    /** アプリフラグ */
    @JacksonXmlProperty(localName = "APP_FLG")
    private String flgApli;

    /** 本部フラグ */
    @JacksonXmlProperty(localName = "HONBU_FLG")
    private String flgHonbu;

    /**
     * バージョン番号を取得する
     *
     * @return バージョン番号
     */
    public String getVersion() {
        return version;
    }

    /**
     * バージョン番号を設定する
     *
     * @param version バージョン番号
     */
    public void setVersion(final String version) {
        this.version = version;
    }

    /**
     * アプリ名称を取得する
     *
     * @return アプリ名称
     */
    public String getApliName() {
        return apliName;
    }

    /**
     * アプリ名称を設定する
     *
     * @param apliName アプリ名称
     */
    public void setApliName(final String apliName) {
        this.apliName = apliName;
    }

    /**
     * アプリフラグを取得する
     *
     * @return アプリフラグ
     */
    public String getFlgApli() {
        return flgApli;
    }

    /**
     * アプリフラグを設定する
     *
     * @param flgApli アプリフラグ
     */
    public void setFlgApli(final String flgApli) {
        this.flgApli = flgApli;
    }

    /**
     * 本部フラグを取得する
     *
     * @return 本部フラグ
     */
    public String getFlgHonbu() {
        return flgHonbu;
    }

    /**
     * 本部フラグを設定する
     *
     * @param flgHonbu 本部フラグ
     */
    public void setFlgHonbu(final String flgHonbu) {
        this.flgHonbu = flgHonbu;
    }

}
