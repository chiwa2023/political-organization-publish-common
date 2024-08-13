package mitei.mitei.common.publish.party.usage.report.logic;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mitei.mitei.common.publish.party.usage.report.dto.v5.Kbn080201Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Sheet0806Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Shito0803Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Shito0806Dto;

/**
 * CreateShito0802Kbn01WrapperLogic単体テスト
 */
class CreateShito0802Kbn01WrapperLogicTest {
    // CHECKSTYLE:OFF

    @Test
    void testGetDto() throws Exception {

        CreateShito0802Kbn01WrapperLogic logic = new CreateShito0802Kbn01WrapperLogic();

        Kbn080201Dto kbn080201Dto = logic.getDto(); // NOPMD

        assertEquals(10, kbn080201Dto.getList().size(), "様式8その2区分1は10行分のリストで構成されている"); // NOPMD
        assertEquals("　政党交付金（支部政党交付金）支出充当額総額　----------------------------------④",
                kbn080201Dto.getList().get(3).getItemName(), "様式8その2区分1は項目4の項目名は固定値"); // NOPMD
    }

    @Test
    void testCheck() throws Exception {

        // TODO対応のため、テストのほとんどは省略する

        CreateShito0802Kbn01WrapperLogic logic = new CreateShito0802Kbn01WrapperLogic();

        Shito0803Dto shito0803Dto = new Shito0803Dto();
        shito0803Dto.getSheet0803Dto().setTotalAllAmountAll(370000L);
        shito0803Dto.getSheet0803Dto().setTotalAllAmountJutoKoufukin(320000L);
        shito0803Dto.getSheet0803Dto().setTotalAllAmountJutoMyFunds(50000L);

        Shito0806Dto shito0806Dto = new Shito0806Dto();

        Sheet0806Dto sheet1 = new Sheet0806Dto();
        sheet1.setTotalLastYear(600000L);// 前年
        sheet1.setTotalThisYear(2222L);
        sheet1.getKbn080602Dto().setSubTotal(1212L);

        Sheet0806Dto sheet2 = new Sheet0806Dto();
        sheet2.setTotalLastYear(400000L);// 前年
        sheet2.setTotalThisYear(3333L);
        sheet2.getKbn080602Dto().setSubTotal(2323L);

        shito0806Dto.getList().add(sheet1);
        shito0806Dto.getList().add(sheet2);

        logic.getDto().getList().get(0).setAmount(320000L); // NOPMD
        logic.getDto().getList().get(1).setAmount(1000000L); // NOPMD
        logic.getDto().getList().get(2).setAmount(370000L); // NOPMD
        logic.getDto().getList().get(3).setAmount(320000L); // NOPMD
        logic.getDto().getList().get(4).setAmount(50000L); // NOPMD
        logic.getDto().getList().get(5).setAmount(3633L); // NOPMD
        logic.getDto().getList().get(6).setAmount(5555L); // NOPMD
        logic.getDto().getList().get(7).setAmount(3535L); // NOPMD
        logic.getDto().getList().get(8).setAmount(951922L); // NOPMD
        logic.getDto().getList().get(9).setAmount(950000L); // NOPMD

        assertTrue("すべての値が計算通りである",logic.check(shito0803Dto, shito0806Dto, 3633L));
    }

    @Test
    void testCalucrateRepair() throws Exception {

        CreateShito0802Kbn01WrapperLogic logic = new CreateShito0802Kbn01WrapperLogic();

        Shito0803Dto shito0803Dto = new Shito0803Dto();
        shito0803Dto.getSheet0803Dto().setTotalAllAmountAll(370000L);
        shito0803Dto.getSheet0803Dto().setTotalAllAmountJutoKoufukin(320000L);
        shito0803Dto.getSheet0803Dto().setTotalAllAmountJutoMyFunds(50000L);

        Shito0806Dto shito0806Dto = new Shito0806Dto();

        Sheet0806Dto sheet1 = new Sheet0806Dto();
        sheet1.setTotalLastYear(600000L);// 前年
        sheet1.setTotalThisYear(2222L);
        sheet1.getKbn080602Dto().setSubTotal(1212L);

        Sheet0806Dto sheet2 = new Sheet0806Dto();
        sheet2.setTotalLastYear(400000L);// 前年
        sheet2.setTotalThisYear(3333L);
        sheet2.getKbn080602Dto().setSubTotal(2323L);

        shito0806Dto.getList().add(sheet1);
        shito0806Dto.getList().add(sheet2);

        Kbn080201Dto kbn080201Dto = logic.calucrateRepair(shito0803Dto, shito0806Dto, 3633L);

        assertEquals(320000L, kbn080201Dto.getList().get(0).getAmount(), "政党交付金（支部政党交付金）の総額①");
        assertEquals(1000000L, kbn080201Dto.getList().get(1).getAmount(), "前年末政党基金（支部基金）残高②");
        assertEquals(370000L, kbn080201Dto.getList().get(2).getAmount(), "政党交付金（支部政党交付金）による支出総額（④＋⑤）=③");
        assertEquals(320000L, kbn080201Dto.getList().get(3).getAmount(), "政党交付金（支部政党交付金）支出充当額総額④");
        assertEquals(50000L, kbn080201Dto.getList().get(4).getAmount(), "政党基金（支部基金）支出充当額総額⑤");
        assertEquals(3633L, kbn080201Dto.getList().get(5).getAmount(), "政党基金（支部基金）の積立に充てるために取り崩した政党基金（支部基金）の額⑥");
        assertEquals(5555L, kbn080201Dto.getList().get(6).getAmount(), "政党基金（支部基金）積立総額（果実を含む。）⑦");
        assertEquals(3535L, kbn080201Dto.getList().get(7).getAmount(), "政党基金（支部基金）の運用により収受した果実の総額");
        assertEquals(951922L, kbn080201Dto.getList().get(8).getAmount(), "本年末等政党基金（支部基金）残高（②－⑤－⑥＋⑦）");
        assertEquals(950000L, kbn080201Dto.getList().get(9).getAmount(), "（備　　　　　考）①－③＋②－⑧");

    }

}
