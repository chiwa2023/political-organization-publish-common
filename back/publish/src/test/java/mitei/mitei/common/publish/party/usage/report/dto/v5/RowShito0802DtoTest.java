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
 * 様式08の2の行Dto
 */
class RowShito0802DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/row_shito_0802.txt");
        String answer = Files.readString(pathAnswer); // SUPPRESS CHECKSTYLE MethodArgumentCouldBeFinal
        
        RowShito0802Dto row0 = new RowShito0802Dto();
        row0.setRowNo(3);
        row0.setItemName("項目名称");
        row0.setAccrualDate("R4/12/1");
        row0.setAmount(65432L);
        
        // XML生成
        String xml = xmlMapper.writeValueAsString(row0);

        assertEquals(answer, xml, "すべてのカラムに異なる値を入れた場合");
    }

}
