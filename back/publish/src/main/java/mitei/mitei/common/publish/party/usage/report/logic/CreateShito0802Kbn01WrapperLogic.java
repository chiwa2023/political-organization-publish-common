package mitei.mitei.common.publish.party.usage.report.logic;

import java.util.List;

import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080201Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.RowShito0802Dto;

/**
 * 様式08の2の区分1を安全に扱うためのラッパLogic
 */
public class CreateShito0802Kbn01WrapperLogic {

    /** カプセル化した様式08の2の区分1 */
    private final Kbn080201Dto kbn080201Dto = new Kbn080201Dto();

    /** 1行目の項目名称 */
    private static final String ITEM_NAME1 = "政党交付金（支部政党交付金）の総額　--------------------------------------------①";
    /** 2行目の項目名称 */
    private static final String ITEM_NAME2 = "前年末政党基金（支部基金）残高　------------------------------------------------②";
    /** 3行目の項目名称 */
    private static final String ITEM_NAME3 = "政党交付金（支部政党交付金）による支出総額（④＋⑤）　--------------------------③";
    /** 4行目の項目名称 */
    private static final String ITEM_NAME4 = "　政党交付金（支部政党交付金）支出充当額総額　----------------------------------④";//段下げのため最初の空白はわざとつけている
    /** 5行目の項目名称 */
    private static final String ITEM_NAME5 = "　政党基金（支部基金）支出充当額総額　------------------------------------------⑤";//段下げのため最初の空白はわざとつけている
    /** 6行目の項目名称 */
    private static final String ITEM_NAME6 = "政党基金（支部基金）の積立に充てるために取り崩した政党基金（支部基金）の額　----⑥";
    /** 7行目の項目名称 */
    private static final String ITEM_NAME7 = "政党基金（支部基金）積立総額（果実を含む。）　----------------------------------⑦";
    /** 8行目の項目名称 */
    private static final String ITEM_NAME8 = "　政党基金（支部基金）の運用により収受した果実の総額　";//段下げのため最初の空白はわざとつけている
    /** 9行目の項目名称 */
    private static final String ITEM_NAME9 = "本年末等政党基金（支部基金）残高（②－⑤－⑥＋⑦）　----------------------------⑧";
    /** 10行目の項目名称 */
    private static final String ITEM_NAME10 = "　　（備　　　　　考）　　　　　　　　　　　　　　　　　　　　　　　①－③＋②－⑧";

    /** 1行目の行番号 */
    private static final int POS01 = 1;
    /** 2行目の行番号 */
    private static final int POS02 = 2;
    /** 3行目の行番号 */
    private static final int POS03 = 3;
    /** 4行目の行番号 */
    private static final int POS04 = 4;
    /** 5行目の行番号 */
    private static final int POS05 = 5;
    /** 6行目の行番号 */
    private static final int POS06 = 6;
    /** 7行目の行番号 */
    private static final int POS07 = 7;
    /** 8行目の行番号 */
    private static final int POS08 = 8;
    /** 9行目の行番号 */
    private static final int POS09 = 9;
    /** 10行目の行番号 */
    private static final int POS10 = 10;
    
    /**
     * コンストラクタ
     */
    public CreateShito0802Kbn01WrapperLogic() {
        List<RowShito0802Dto> list = kbn080201Dto.getList();
        list.add(this.createDto(POS01, ITEM_NAME1));
        list.add(this.createDto(POS02, ITEM_NAME2));
        list.add(this.createDto(POS03, ITEM_NAME3));
        list.add(this.createDto(POS04, ITEM_NAME4));
        list.add(this.createDto(POS05, ITEM_NAME5));
        list.add(this.createDto(POS06, ITEM_NAME6));
        list.add(this.createDto(POS07, ITEM_NAME7));
        list.add(this.createDto(POS08, ITEM_NAME8));
        list.add(this.createDto(POS09, ITEM_NAME9));
        list.add(this.createDto(POS10, ITEM_NAME10));
    }

    
    /**
     * 計算後の最終値を取得する
     *
     * @return 様式08の2の区分1
     */
    public Kbn080201Dto getFinalDto() {
        return kbn080201Dto;
    }

    
    public void calculate() {

        // TODO 様式8の6を作成次第修正する
        
        
        // 取り込み終わった時点で内部計算
        // "政党交付金（支部政党交付金）による支出総額（④＋⑤） --------------------------③";

        // " （備 考） ①－③＋②－⑧";

    }

    private RowShito0802Dto createDto(final int rowNo, final String itemName) {
        RowShito0802Dto dto = new RowShito0802Dto();

        dto.setRowNo(rowNo);
        dto.setItemName(itemName);

        // 初期値セットを明示
        dto.setAccrualDate("");
        dto.setAmount(0L);
        
        return dto;
    }

}
