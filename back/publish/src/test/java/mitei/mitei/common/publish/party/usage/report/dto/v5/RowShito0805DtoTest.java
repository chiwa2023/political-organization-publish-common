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
 * RowShito0805Dto単体テスト
 */
class RowShito0805DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/row_shito_0805.txt");
        String answer = Files.readString(pathAnswer);

        RowShito0805Dto row = new RowShito0805Dto();
        row.setRowNo(1);
        row.setSibuName("支部名称");
        row.setAmount(23456L);
        row.setAccrualDate("R3/11/13");
        row.setPurpose("事務所費");
        row.setBikou("備考");
        row.setRowKbn(100);

        // XML生成
        String xml = xmlMapper.writeValueAsString(row);

        assertEquals(answer, xml, "すべてのカラムに異なる値を入れた場合");
    }

}
