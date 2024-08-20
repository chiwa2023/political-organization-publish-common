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
 * Sheet0807Dto単体テスト
 */
class Sheet0807DtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Sheet0807Dto sheet = new Sheet0807Dto();
        sheet.setCopyRecipt(6); //実際は0/1だがIntegerに設定したため適当な数値を入れる
        sheet.setAuditOption(2); //実際は0/1だがIntegerに設定したため適当な数値を入れる
        sheet.setAuditReport(3); //実際は0/1だがIntegerに設定したため適当な数値を入れる
        sheet.setShibuDocument(4); //実際は0/1だがIntegerに設定したため適当な数値を入れる
        sheet.setGoverningDocument(5); //実際は0/1だがIntegerに設定したため適当な数値を入れる
        sheet.setFlgConfirm(0);
        sheet.setAccuralDate("R5/11/30");
        
        // XML生成
        String xml = xmlMapper.writeValueAsString(sheet);
        
        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/sheet_0807_dto.txt");
        String answer = Files.readString(pathAnswer);
        
        assertEquals(answer, xml, "常にデータが入っている");
    }

}
