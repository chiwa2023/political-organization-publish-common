package mitei.mitei.common.publish_tool.usage.report.logic.validate.sheet0806;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import mitei.mitei.common.publish.party.usage.report.dto.v5.RowShito0806Dto;
import mitei.mitei.common.publish.party.usage.report.dto.v5.Sheet0806Dto;

class ValidateSheet0806LogicTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testCheck() {

        ValidateSheet0806Logic logic = new ValidateSheet0806Logic();
        
        Sheet0806Dto sheet0806Dto = new Sheet0806Dto();

        sheet0806Dto.setTotalLastYear(10000L);//前年まで残高

        RowShito0806Dto row1 = new RowShito0806Dto();
        row1.setAmount(111L);
        RowShito0806Dto row2 = new RowShito0806Dto();
        row2.setAmount(666L);

        sheet0806Dto.getKbn080601Dto().getList().add(row1);
        sheet0806Dto.getKbn080601Dto().getList().add(row2);


        RowShito0806Dto row3 = new RowShito0806Dto();
        row3.setAmount(333L);
        RowShito0806Dto row4 = new RowShito0806Dto();
        row4.setAmount(555L);
        sheet0806Dto.getKbn080602Dto().getList().add(row3);
        sheet0806Dto.getKbn080602Dto().getList().add(row4);

        RowShito0806Dto row5 = new RowShito0806Dto();
        row5.setAmount(222L);
        RowShito0806Dto row6 = new RowShito0806Dto();
        row6.setAmount(444L);
        sheet0806Dto.getKbn080603Dto().getList().add(row5);
        sheet0806Dto.getKbn080603Dto().getList().add(row6);
        
        Sheet0806Dto sheet0806DtoAnswwer = logic.calucrateRepair(sheet0806Dto);
        assertEquals(true, logic.check(sheet0806DtoAnswwer), "自動計算直後であればすべての値が正常");
        
        sheet0806DtoAnswwer.setTotalIncrease(9898L);
        assertEquals(false, logic.check(sheet0806DtoAnswwer), "増減値が異なることを検出");
        

        fail("Not yet implemented");
    }

    @Test
    void testCalucrateRepair() throws Exception {

        ValidateSheet0806Logic logic = new ValidateSheet0806Logic();

        Sheet0806Dto sheet0806Dto = new Sheet0806Dto();

        sheet0806Dto.setTotalLastYear(10000L);//前年まで残高

        RowShito0806Dto row1 = new RowShito0806Dto();
        row1.setAmount(111L);
        RowShito0806Dto row2 = new RowShito0806Dto();
        row2.setAmount(666L);

        sheet0806Dto.getKbn080601Dto().getList().add(row1);
        sheet0806Dto.getKbn080601Dto().getList().add(row2);


        RowShito0806Dto row3 = new RowShito0806Dto();
        row3.setAmount(333L);
        RowShito0806Dto row4 = new RowShito0806Dto();
        row4.setAmount(555L);
        sheet0806Dto.getKbn080602Dto().getList().add(row3);
        sheet0806Dto.getKbn080602Dto().getList().add(row4);

        RowShito0806Dto row5 = new RowShito0806Dto();
        row5.setAmount(222L);
        RowShito0806Dto row6 = new RowShito0806Dto();
        row6.setAmount(444L);
        sheet0806Dto.getKbn080603Dto().getList().add(row5);
        sheet0806Dto.getKbn080603Dto().getList().add(row6);
        
        Sheet0806Dto sheet0806DtoAnswwer = logic.calucrateRepair(sheet0806Dto);

        assertEquals(777L, sheet0806DtoAnswwer.getKbn080601Dto().getSubTotal(), "区分1計が修正されていること");
        assertEquals(888L, sheet0806DtoAnswwer.getKbn080602Dto().getSubTotal(), "区分2計が修正されていること");
        assertEquals(666L, sheet0806DtoAnswwer.getKbn080603Dto().getSubTotal(), "区分3計が修正されていること");

        
        assertEquals(1665L, sheet0806DtoAnswwer.getTotal(), "本年増加値が修正されていること");
        assertEquals(10999L, sheet0806DtoAnswwer.getTotalThisYear(), "本年残高が修正されていること");
        assertEquals(999L, sheet0806DtoAnswwer.getTotalIncrease(), "本年増減値が修正されていること");
        
    }

}
