package mitei.mitei.common.publish_tool.usage.report.logic.validate.sheet0806;

import java.util.List;

import org.springframework.stereotype.Component;

import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080601Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080602Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080603Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.RowShito0806Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Sheet0806Dto;

/**
 * 様式8その6妥当性算出
 */
@Component
public class ValidateSheet0806Logic {

    /**
     * 様式8その6のシート(一つの基金)が正常の値かどうかを確認する
     *
     * @param sheet0806Dto 様式8その6のシート
     * @return 正常な値が入っていればtrue
     */
    public boolean check(final Sheet0806Dto sheet0806Dto) {

        boolean isCorrect = true;

        Kbn080601Dto kbn080601Dto = sheet0806Dto.getKbn080601Dto();
        if (!kbn080601Dto.getSubTotal().equals(this.sumRow(kbn080601Dto.getList()))) {
            isCorrect = false;
        }

        Kbn080602Dto kbn080602Dto = sheet0806Dto.getKbn080602Dto();
        if (!kbn080602Dto.getSubTotal().equals(this.sumRow(kbn080602Dto.getList()))) {
            isCorrect = false;
        }

        Kbn080603Dto kbn080603Dto = sheet0806Dto.getKbn080603Dto();
        if (!kbn080603Dto.getSubTotal().equals(this.sumRow(kbn080603Dto.getList()))) {
            isCorrect = false;
        }

        // 本年増加分
        Long total1 = sheet0806Dto.getTotal();
        if (!total1.equals(this.sumAdd(sheet0806Dto))) {
            isCorrect = false;
        }

        // 本年最終値
        Long total2 = sheet0806Dto.getTotalThisYear();
        if (!total2.equals(this.sumRest(sheet0806Dto))) {
            isCorrect = false;
        }

        // 本年増減
        Long total3 = sheet0806Dto.getTotalIncrease();
        if (!total3.equals(this.sumRange(sheet0806Dto))) {
            isCorrect = false;
        }

        return isCorrect;
    }

    /**
     * 仕分け詳細に合わせて合計を算出する
     *
     * @param sheet0806Dto 様式8その6のシート
     * @return 計算後の様式8その6のシート
     */
    public Sheet0806Dto calucrateRepair(final Sheet0806Dto sheet0806Dto) {

        // 積み立て合計を算出
        Kbn080601Dto kbn080601Dto = sheet0806Dto.getKbn080601Dto();
        kbn080601Dto.setSubTotal(this.sumRow(kbn080601Dto.getList()));

        // 果実合計を算出
        Kbn080602Dto kbn080602Dto = sheet0806Dto.getKbn080602Dto();
        kbn080602Dto.setSubTotal(this.sumRow(kbn080602Dto.getList()));

        // 取り崩しを算出
        Kbn080603Dto kbn080603Dto = sheet0806Dto.getKbn080603Dto();
        kbn080603Dto.setSubTotal(this.sumRow(kbn080603Dto.getList()));

        sheet0806Dto.setTotal(this.sumAdd(sheet0806Dto));

        sheet0806Dto.setTotalThisYear(this.sumRest(sheet0806Dto));

        sheet0806Dto.setTotalIncrease(this.sumRange(sheet0806Dto));

        return sheet0806Dto;
    }

    private Long sumRow(final List<RowShito0806Dto> list) {

        long sum = 0L;

        // 単に合計する
        for (RowShito0806Dto dto : list) {
            sum = sum + dto.getAmount();
        }

        return sum;
    }

    private Long sumAdd(final Sheet0806Dto sheet0806Dto) {

        return sheet0806Dto.getKbn080601Dto().getSubTotal() + sheet0806Dto.getKbn080602Dto().getSubTotal();
    }

    private Long sumRest(final Sheet0806Dto sheet0806Dto) {
        return sheet0806Dto.getTotalLastYear() + sheet0806Dto.getTotal() - sheet0806Dto.getKbn080603Dto().getSubTotal();
    }

    private Long sumRange(final Sheet0806Dto sheet0806Dto) {
        return sheet0806Dto.getTotalThisYear() - sheet0806Dto.getTotalLastYear();
    }

}
