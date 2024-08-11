package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の5
 */
public class Shito0805Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8の5シート */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Sheet0805Dto sheet0805Dto = new Sheet0805Dto();

    /**
     * 様式8の5シートを取得する
     *
     * @return 様式8の5シート
     */
    public Sheet0805Dto getSheet0805Dto() {
        return sheet0805Dto;
    }

    /**
     * 様式8の5シートを設定する
     *
     * @param sheet0805Dto 様式8の5シート
     */
    public void setSheet0805Dto(final Sheet0805Dto sheet0805Dto) {
        this.sheet0805Dto = sheet0805Dto;
    }

}
