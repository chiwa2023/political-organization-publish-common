package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書8様式その2
 */
public class Shito0802Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8の2シート */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Sheet0802Dto sheet0802Dto = new Sheet0802Dto();

    /**
     * 様式8の2シートを取得する
     *
     * @return 様式8の2シート
     */
    public Sheet0802Dto getSheet0802Dto() {
        return sheet0802Dto;
    }

    /**
     * 様式8の2シートを設定する
     *
     * @param sheet0802Dto 様式8の2シート
     */
    public void setSheet0802Dto(final Sheet0802Dto sheet0802Dto) {
        this.sheet0802Dto = sheet0802Dto;
    }

}
