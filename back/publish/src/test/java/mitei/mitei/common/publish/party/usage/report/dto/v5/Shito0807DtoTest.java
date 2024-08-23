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
 * Shito0807Dto単体テスト
 */
class Shito0807DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 常に入力
        Shito0807Dto shito0807Dto = new Shito0807Dto();

        Sheet0807Dto sheet = new Sheet0807Dto();
        sheet.setCopyRecipt(0);
        sheet.setAuditOption(1);
        sheet.setAuditReport(0);
        sheet.setShibuDocument(0);
        sheet.setGoverningDocument(0);
        sheet.setFlgConfirm(1);
        sheet.setAccrualDate("R5/11/30");

        shito0807Dto.setSheet0807Dto(sheet);

        // XML生成
        String xml = xmlMapper.writeValueAsString(shito0807Dto);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0807_dto.txt");
        String answer = Files.readString(pathAnswer);

        assertEquals(answer, xml, "入力ありデータ");
    }

}
