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
 * Shito0902Dto単体テスト
 */
class Shito0902DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        //入力なし(空の1シートが最低限入る)
        Shito0902Dto shito0 = new Shito0902Dto();
        shito0.getList().add(new Sheet0902Dto());
        
        // XML生成
        String xml0 = xmlMapper.writeValueAsString(shito0);
        
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/shito_0902_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0, xml0,"入力なしシート");

        Shito0902Dto shito1 = new Shito0902Dto();
        Sheet0902Dto sheet1 = new Sheet0902Dto();
        sheet1.setItemName("事務所費");
        sheet1.setDigest("適当な摘要");
        sheet1.setDantaiName("ちゃらんぽらん政治団体");
        
        shito1.getList().add(sheet1);
        
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0902_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        // XML生成
        String xml1 = xmlMapper.writeValueAsString(shito1);

        assertEquals(answer1, xml1, "入力なしシート");
    }

}
