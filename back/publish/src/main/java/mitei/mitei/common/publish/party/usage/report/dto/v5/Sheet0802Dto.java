package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8の2シート
 */
public class Sheet0802Dto implements Serializable { // NOPMD

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8その2区分1 */
    @JacksonXmlProperty(localName = "KUBUN1")
    private Kbn080201Dto kbn080201Dto = new Kbn080201Dto();

    /** 様式8その2区分2 */
    @JacksonXmlProperty(localName = "KUBUN2")
    private Kbn080202Dto kbn080202Dto = new Kbn080202Dto();

    /**
     * 様式8その2区分1を取得する
     *
     * @return 様式8その2区分1
     */
    public Kbn080201Dto getKbn080201Dto() {
        return kbn080201Dto;
    }

    /**
     * 様式8その2区分1を設定する
     *
     * @param kbn080201Dto 様式8その2区分1
     */
    public void setKbn080201Dto(final Kbn080201Dto kbn080201Dto) {
        this.kbn080201Dto = kbn080201Dto;
    }

    /**
     * 様式8その2区分2を取得する
     *
     * @return 様式8その2区分2
     */
    public Kbn080202Dto getKbn080202Dto() {
        return kbn080202Dto;
    }

    /**
     * 様式8その2区分2を設定する
     *
     * @param kbn080202Dto 様式8その2区分2
     */
    public void setKbn080202Dto(final Kbn080202Dto kbn080202Dto) {
        this.kbn080202Dto = kbn080202Dto;
    }

}
