package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の1表紙
 */
public class Shito0801Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8の3シート */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Sheet0801Dto sheet0801Dto = new Sheet0801Dto();

    /**
     * 様式8の3シートを取得する
     *
     * @return 様式8の3シート
     */
    public Sheet0801Dto getSheet0801Dto() {
        return sheet0801Dto;
    }

    /**
     * 様式8の3シートを設定する
     *
     * @param sheet0801Dto 様式8の3シート
     */
    public void setSheet0801Dto(final Sheet0801Dto sheet0801Dto) {
        this.sheet0801Dto = sheet0801Dto;
    }

}
