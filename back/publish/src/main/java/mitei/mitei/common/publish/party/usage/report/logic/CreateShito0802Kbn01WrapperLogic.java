package mitei.mitei.common.publish.party.usage.report.logic;

import java.util.List;

import mitei.mitei.common.constants.party.usage.ConstantsKbn080201Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080201Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.RowShito0802Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Sheet0806Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Shito0803Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Shito0806Dto;

/**
 * 様式08の2の区分1を安全に扱うためのラッパLogic
 */
public class CreateShito0802Kbn01WrapperLogic {

    /** カプセル化した様式08の2の区分1 */
    private final Kbn080201Dto kbn080201Dto = new Kbn080201Dto();

    /** 1項目目の計算値(政党交付金（支部政党交付金）の総額) */
    private Long value1 = 0L;
    /** 2項目目の計算値(前年末政党基金（支部基金）残高) */
    private Long value2 = 0L;
    /** 3項目目の計算値(政党交付金（支部政党交付金）による支出総額（④＋⑤）) */
    private Long value3 = 0L;
    /** 4項目目の計算値(政党交付金（支部政党交付金）支出充当額総額) */
    private Long value4 = 0L;
    /** 5項目目の計算値(政党基金（支部基金）支出充当額総額) */
    private Long value5 = 0L;
    /** 6項目目の計算値(政党基金（支部基金）の積立に充てるために取り崩した政党基金（支部基金）の額) */
    private Long value6 = 0L;
    /** 7項目目の計算値(政党基金（支部基金）積立総額（果実を含む。）) */
    private Long value7 = 0L;
    /** 8項目目の計算値(政党基金（支部基金）の運用により収受した果実の総額) */
    private Long value8 = 0L;
    /** 9項目目の計算値(本年末等政党基金（支部基金）残高) */
    private Long value9 = 0L;
    /** 10項目目の計算値(備考) */
    private Long value10 = 0L;

    /**
     * コンストラクタ
     */
    public CreateShito0802Kbn01WrapperLogic() {
        List<RowShito0802Dto> list = kbn080201Dto.getList();
        list.add(this.createDto(ConstantsKbn080201Dto.POS01, ConstantsKbn080201Dto.ITEM_NAME1));
        list.add(this.createDto(ConstantsKbn080201Dto.POS02, ConstantsKbn080201Dto.ITEM_NAME2));
        list.add(this.createDto(ConstantsKbn080201Dto.POS03, ConstantsKbn080201Dto.ITEM_NAME3));
        list.add(this.createDto(ConstantsKbn080201Dto.POS04, ConstantsKbn080201Dto.ITEM_NAME4));
        list.add(this.createDto(ConstantsKbn080201Dto.POS05, ConstantsKbn080201Dto.ITEM_NAME5));
        list.add(this.createDto(ConstantsKbn080201Dto.POS06, ConstantsKbn080201Dto.ITEM_NAME6));
        list.add(this.createDto(ConstantsKbn080201Dto.POS07, ConstantsKbn080201Dto.ITEM_NAME7));
        list.add(this.createDto(ConstantsKbn080201Dto.POS08, ConstantsKbn080201Dto.ITEM_NAME8));
        list.add(this.createDto(ConstantsKbn080201Dto.POS09, ConstantsKbn080201Dto.ITEM_NAME9));
        list.add(this.createDto(ConstantsKbn080201Dto.POS10, ConstantsKbn080201Dto.ITEM_NAME10));
    }

    /**
     * 値のチェックを行う
     *
     * @param shito0803Dto  様式8その3
     * @param shito0806Dto  様式8その6
     * @param accumulateByFunds6 手入力である基金を取り崩して果実に組み入れた金額
     * @return すべて計算どおりであればtrue
     */
    public boolean check(final Shito0803Dto shito0803Dto, final Shito0806Dto shito0806Dto, // SUPPRESS CHECKSTYLE NOPMD
            final Long accumulateByFunds6) {
       
        // TODO boolean値でなく例外を出すほうが望ましければ修正する
        
        value6 = accumulateByFunds6;

        this.calucrate(shito0803Dto, shito0806Dto);

        List<RowShito0802Dto> list = kbn080201Dto.getList();

        boolean isCorrect = true;

        // 01
        if (!value1.equals(list.get(ConstantsKbn080201Dto.POS01 - 1).getAmount())) {
            isCorrect = false;
        }
        // 02
        if (!value2.equals(list.get(ConstantsKbn080201Dto.POS02 - 1).getAmount())) {
            isCorrect = false;
        }
        // 03
        if (!value3.equals(list.get(ConstantsKbn080201Dto.POS03 - 1).getAmount())) {
            isCorrect = false;
        }
        // 04
        if (!value4.equals(list.get(ConstantsKbn080201Dto.POS04 - 1).getAmount())) {
            isCorrect = false;
        }
        // 05
        if (!value5.equals(list.get(ConstantsKbn080201Dto.POS05 - 1).getAmount())) {
            isCorrect = false;
        }
        // 06
        if (!value6.equals(list.get(ConstantsKbn080201Dto.POS06 - 1).getAmount())) {
            isCorrect = false;
        }
        // 07
        if (!value7.equals(list.get(ConstantsKbn080201Dto.POS07 - 1).getAmount())) {
            isCorrect = false;
        }
        // 08
        if (!value8.equals(list.get(ConstantsKbn080201Dto.POS08 - 1).getAmount())) {
            isCorrect = false;
        }
        // 09
        if (!value9.equals(list.get(ConstantsKbn080201Dto.POS09 - 1).getAmount())) {
            isCorrect = false;
        }
        // 10
        if (!value10.equals(list.get(ConstantsKbn080201Dto.POS10 - 1).getAmount())) {
            isCorrect = false;
        }

        return isCorrect;
    }

    /**
     * 現在の値を取得する
     *
     * @return 様式08の2の区分1
     */
    public Kbn080201Dto getDto() {

        return kbn080201Dto;
    }

    /**
     * 妥当計算を行ったのち、計算した値で更新する
     *
     * @param shito0803Dto  様式8その3
     * @param shito0806Dto  様式8その6
     * @param accumulateByFunds6 手入力である基金を取り崩して果実に組み入れた金額
     * @return 様式8その2
     */
    public Kbn080201Dto calucrateRepair(final Shito0803Dto shito0803Dto, final Shito0806Dto shito0806Dto,
            final Long accumulateByFunds6) {

        value6 = accumulateByFunds6;

        this.calucrate(shito0803Dto, shito0806Dto);

        List<RowShito0802Dto> list = kbn080201Dto.getList();
        // 01
        list.get(ConstantsKbn080201Dto.POS01 - 1).setAmount(value1);
        // 02
        list.get(ConstantsKbn080201Dto.POS02 - 1).setAmount(value2);
        // 03
        list.get(ConstantsKbn080201Dto.POS03 - 1).setAmount(value3);
        // 04
        list.get(ConstantsKbn080201Dto.POS04 - 1).setAmount(value4);
        // 05
        list.get(ConstantsKbn080201Dto.POS05 - 1).setAmount(value5);
        // 06 直接入力
        list.get(ConstantsKbn080201Dto.POS06 - 1).setAmount(value6);
        // 07
        list.get(ConstantsKbn080201Dto.POS07 - 1).setAmount(value7);
        // 08
        list.get(ConstantsKbn080201Dto.POS08 - 1).setAmount(value8);
        // 09
        list.get(ConstantsKbn080201Dto.POS09 - 1).setAmount(value9);
        // 10
        list.get(ConstantsKbn080201Dto.POS10 - 1).setAmount(value10);

        return kbn080201Dto;
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

    private boolean calucrate(final Shito0803Dto shito0803Dto, final Shito0806Dto shito0806Dto) {

        value1 = shito0803Dto.getSheet0803Dto().getTotalAllAmountJutoKoufukin();
        value2 = 0L;
        value3 = shito0803Dto.getSheet0803Dto().getTotalAllAmountAll();
        value4 = shito0803Dto.getSheet0803Dto().getTotalAllAmountJutoKoufukin();
        value5 = shito0803Dto.getSheet0803Dto().getTotalAllAmountJutoMyFunds();
        value7 = 0L;
        value8 = 0L;

        // 複数基金を集計する
        for (Sheet0806Dto sheet : shito0806Dto.getList()) {
            value2 = value2 + sheet.getTotalLastYear();
            value7 = value7 + sheet.getTotalThisYear();
            value8 = value8 + sheet.getKbn080602Dto().getSubTotal();
        }

        value9 = value2 - value5 - value6 + value7;
        value10 = value1 - value3 + value2;

        return true;
    }
}
