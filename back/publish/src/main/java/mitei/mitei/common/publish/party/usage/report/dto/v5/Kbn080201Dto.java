package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 様式番号8の2の区分1 XML生成のためにリストのgetter,setterをアクセス可能にしているが、リストの要素を変更しないこと.
 * 1)要素の削除は業務上の要請により不可 2)発生日は常に空文字(設定することに意味がない) 3)行番号変更不可(多分) 4)項目名称不可(多分)
 * ・・・のように金額だけが変更可能
 */
public class Kbn080201Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 行リスト */
    @JacksonXmlProperty(localName = "ROW")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RowShito0802Dto> list = new ArrayList<>();

    /**
     * 行リストを取得する
     *
     * @return 行リスト
     */
    public List<RowShito0802Dto> getList() {
        return list;
    }

    /**
     * 行リストを設定する
     *
     * @param list 行リスト
     */
    public void setList(final List<RowShito0802Dto> list) {
        this.list = list;
    }

}
