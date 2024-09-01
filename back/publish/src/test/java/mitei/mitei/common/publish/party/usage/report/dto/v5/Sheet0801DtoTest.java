package mitei.mitei.common.publish.party.usage.report.dto.v5;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.constants.GetCurrentResourcePath;

/**
 * Sheet0801Dto単体テスト
 */
class Sheet0801DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし(政党名まで未入力はあり得ないが、常に空になる項目があるためテストとして)
        Sheet0801Dto sheet0 = new Sheet0801Dto();

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/sheet_0801_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        assertEquals(answer0, xml0, "入力なしシート");

        // 入力あり
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/sheet_0801_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Sheet0801Dto sheet1 = new Sheet0801Dto();
        sheet1.setNendo(2022);
        sheet1.setPartyName("政党名称");
        sheet1.setPartyNameKana("政党名称かな");
        sheet1.setOfficeAddress("主たる事務所住所");
        sheet1.setDelegateName("代表者姓名");
        sheet1.setAccountManagerName("会計責任者姓名");
        sheet1.setWorker1Name("担当者1姓名");
        sheet1.setWorker1Tel("012-3456-xxxx");
        sheet1.setWorker2Name("担当者2姓名");
        sheet1.setWorker2Tel("098-7654-xxxx");
        sheet1.setShibuKbn(2);
        sheet1.setKaisanKbn(1);
        sheet1.setKaisanDate("R4/12/31");
        sheet1.setSeiriNo("445566");
        sheet1.setUketsukeNo("556677");

        // XML生成
        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertEquals(answer1, xml1, "入力ありシート");
    }

}
