package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 区分06(備品支出)Dto
 */
public class Kbn080406Dto implements Serializable{ // NOPMD DataClass
    
    /** serialId */
    private static final long serialVersionUID = 1L;

    /** シートリスト */
    @JacksonXmlProperty(localName = "SHEET")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Sheet0804Dto> list = new ArrayList<>();

    /**
     * シートリスストを取得する
     *
     * @return シートリススト
     */
    public List<Sheet0804Dto> getList() {
        return list;
    }

    /**
     * シートリスストを設定する
     *
     * @param list シートリススト
     */
    public void setList(final List<Sheet0804Dto> list) {
        this.list = list;
    }

}
