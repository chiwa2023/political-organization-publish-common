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
 * Shito0801Dto単体テスト
 */
class Shito0801DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Shito0801Dto shito0 = new Shito0801Dto();

        shito0.getSheet0801Dto().setNendo(2022);
        shito0.getSheet0801Dto().setPartyName("政党名称");
        shito0.getSheet0801Dto().setPartyNameKana("政党名称かな");
        shito0.getSheet0801Dto().setOfficeAddress("主たる事務所住所");
        shito0.getSheet0801Dto().setDelegateName("代表者姓名");
        shito0.getSheet0801Dto().setAccountManagerName("会計責任者姓名");
        shito0.getSheet0801Dto().setWorker1Name("担当者1姓名");
        shito0.getSheet0801Dto().setWorker1Tel("012-3456-xxxx");
        shito0.getSheet0801Dto().setWorker2Name("担当者2姓名");
        shito0.getSheet0801Dto().setWorker2Tel("098-7654-xxxx");
        shito0.getSheet0801Dto().setShibuKbn(2);
        shito0.getSheet0801Dto().setKaisanKbn(1);
        shito0.getSheet0801Dto().setKaisanDate("R4/12/31");
        shito0.getSheet0801Dto().setSeiriNo("445566");
        shito0.getSheet0801Dto().setUketsukeNo("556677");

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(shito0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0801_dto.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0, xml0, "1行データが入ったシート");
    }

}
