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
 * RowShito0901Dto単体テスト
 */
class RowShito0901DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/row_shito_0901.txt");
        String answer = Files.readString(pathAnswer);

        RowShito0901Dto row = new RowShito0901Dto();

        row.setRowNo(7);
        row.setItemName("備品・消耗品費");
        row.setDigest("aaaaa");
        row.setAmount(20000L);
        row.setAccrualDate("R4/12/1");
        row.setExplainText("相手が××だった");

        // XML生成
        String xml = xmlMapper.writeValueAsString(row);

        assertEquals(answer, xml, "すべてのカラムに異なる値を入れた場合");
    }

}
