package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式9(の1)
 */
public class Shito0901Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式9シート */
    @JacksonXmlProperty(localName = "SHEET")
    private Sheet0901Dto sheet0901Dto = new Sheet0901Dto();

    /**
     * 様式9シートを取得する
     *
     * @return 様式9シート
     */
    public Sheet0901Dto getSheet0901Dto() {
        return sheet0901Dto;
    }

    /**
     * 様式9シートを設定する
     *
     * @param sheet0901Dto 様式9シート
     */
    public void setSheet0901Dto(final Sheet0901Dto sheet0901Dto) {
        this.sheet0901Dto = sheet0901Dto;
    }

}
