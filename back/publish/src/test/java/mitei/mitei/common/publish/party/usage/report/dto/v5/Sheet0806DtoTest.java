package mitei.mitei.common.publish.party.usage.report.dto.v5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.publish.party.usage.report.constants.GetCurrentResourcePath;

/**
 * Sheet0806Dto単体テスト
 */
class Sheet0806DtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Sheet0806Dto sheet = new Sheet0806Dto();
        sheet.setFundsName("極悪同盟専用");
        sheet.setTotalLastYear(99999999L);
        sheet.setFundsPuropose("強烈な裏金買収");
        sheet.setTotal(1111L);
        sheet.setTotalBikou("合計備考");
        sheet.setTotalThisYear(91919191919L);
        sheet.setTotalThisYearBikou("本年残備考");
        sheet.setTotalIncrease(334L);
        sheet.setTotalIncreaseBikou("増減備考");

        RowShito0806Dto row = new RowShito0806Dto();
        row.setRowNo(22);
        row.setAccrualDate("R4/9/19");
        row.setAmount(997755L);
        row.setBikou("備品");

        Kbn080601Dto kbn1 = new Kbn080601Dto();
        kbn1.setSubTotal(654654L);
        kbn1.setSubTotalBikou("積み立て特別備考");
        kbn1.getList().add(row);

        Kbn080602Dto kbn2 = new Kbn080602Dto();
        kbn2.setSubTotal(654654L);
        kbn2.setSubTotalBikou("果実特別備考");
        kbn2.getList().add(row);

        Kbn080603Dto kbn3 = new Kbn080603Dto();
        kbn3.setSubTotal(654654L);
        kbn3.setSubTotalBikou("取り崩し特別備考");
        kbn3.getList().add(row);

        sheet.setKbn080601Dto(kbn1);
        sheet.setKbn080602Dto(kbn2);
        sheet.setKbn080603Dto(kbn3);

        // XML生成
        String xml = xmlMapper.writeValueAsString(sheet);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/sheet_0806_dto.txt");
        String answer = Files.readString(pathAnswer);

        assertEquals(answer, xml, "行データなし");
    }

}
