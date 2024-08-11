package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8その6Dto
 */
public class Shito0806Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** シートリスト */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Sheet0806Dto> list = new ArrayList<>();

    /**
     * シートリストを取得する
     *
     * @return シートリスト
     */
    public List<Sheet0806Dto> getList() {
        return list;
    }

    /**
     * シートリストを設定する
     *
     * @param list シートリスト
     */
    public void setList(final List<Sheet0806Dto> list) {
        this.list = list;
    }

}
