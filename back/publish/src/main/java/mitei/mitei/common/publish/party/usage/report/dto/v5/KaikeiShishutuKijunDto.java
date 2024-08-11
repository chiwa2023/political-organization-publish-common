package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 会計における支出基準設定
 */
public class KaikeiShishutuKijunDto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 会計支出基準シート */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private KaikeiKijunKingakuDto kaikeiKijunKingakuDto = new KaikeiKijunKingakuDto();

    /**
     * 会計支出基準シートを取得する
     *
     * @return 会計支出基準シート
     */
    public KaikeiKijunKingakuDto getKaikeiKijunKingakuDto() {
        return kaikeiKijunKingakuDto;
    }

    /**
     * 会計支出基準シートを設定する
     *
     * @param kaikeiKijunKingakuDto 会計支出基準シート
     */
    public void setKaikeiKijunKingakuDto(final KaikeiKijunKingakuDto kaikeiKijunKingakuDto) {
        this.kaikeiKijunKingakuDto = kaikeiKijunKingakuDto;
    }

}
