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
 * RowShito0806Dto単体テスト
 */
class RowShito0806DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/row_shito_0806.txt");
        String answer = Files.readString(pathAnswer);

        RowShito0806Dto row = new RowShito0806Dto();
        row.setRowNo(22);
        row.setAccrualDate("R4/9/19");
        row.setAmount(997755L);
        row.setBikou("備品");

        // XML生成
        String xml = xmlMapper.writeValueAsString(row);

        assertEquals(answer, xml, "すべてのカラムに異なる値を入れた場合");

    }

}
