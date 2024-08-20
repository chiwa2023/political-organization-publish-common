package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式7の15の2区分のシートリストデータDto
 */
public class AllSheetKbn071502Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 様式7の15の2 */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Sheet071502ElectionRelatedExpensesDto> list = new ArrayList<>();

    /**
     * 様式7の15の2を取得する
     *
     * @return 様式7の15の2
     */
    public List<Sheet071502ElectionRelatedExpensesDto> getList() {
        return list;
    }

    /**
     * 様式7の15の2を設定する
     *
     * @param list 様式7の15の2
     */
    public void setList(final List<Sheet071502ElectionRelatedExpensesDto> list) {
        this.list = list;
    }

}
