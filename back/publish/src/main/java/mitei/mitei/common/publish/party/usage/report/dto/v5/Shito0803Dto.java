package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の3 項目別金額の内訳
 */
public class Shito0803Dto implements Serializable{

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式8の3シート */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Sheet0803Dto sheet0803Dto = new Sheet0803Dto();

    /**
     * 様式8の3シートを取得する
     *
     * @return 様式8の3シート
     */
    public Sheet0803Dto getSheet0803Dto() {
        return sheet0803Dto;
    }

    /**
     * 様式8の3シートを設定する
     *
     * @param sheet0803Dto 様式8の3シート
     */
    public void setSheet0803Dto(final Sheet0803Dto sheet0803Dto) {
        this.sheet0803Dto = sheet0803Dto;
    }

}
