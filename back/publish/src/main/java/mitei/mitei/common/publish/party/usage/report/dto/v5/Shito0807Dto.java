package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式8の7Dto
 */
public class Shito0807Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8の7シート */
    @JacksonXmlProperty(localName = "SHEET")
    private Sheet0807Dto sheet0807Dto = new Sheet0807Dto();

    /**
     * 様式8の7シートを取得する
     *
     * @return 様式8の7シート
     */
    public Sheet0807Dto getSheet0807Dto() {
        return sheet0807Dto;
    }

    /**
     * 様式8の7シートを設定する
     *
     * @param sheet0807Dto 様式8の7シート
     */
    public void setSheet0807Dto(final Sheet0807Dto sheet0807Dto) {
        this.sheet0807Dto = sheet0807Dto;
    }

}
