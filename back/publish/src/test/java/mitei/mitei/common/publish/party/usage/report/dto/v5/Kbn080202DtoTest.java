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
 * Kbn080202Dto単体テスト
 */
class Kbn080202DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/kbn_080202_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        Kbn080202Dto kbn0 = new Kbn080202Dto();

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(kbn0);

        assertEquals(answer0, xml0, "データ入力なし時の比較");

        Kbn080202Dto kbn1 = new Kbn080202Dto();
        kbn1.setTotalAmount(200000L);

        RowShito0802Dto row0 = new RowShito0802Dto();
        row0.setRowNo(3);
        row0.setItemName("項目名称");
        row0.setAccrualDate("R4/12/1");
        row0.setAmount(65432L);
        kbn1.getList().add(row0);

        // 入力あり
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/kbn_080202_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        // XML生成
        String xml1 = xmlMapper.writeValueAsString(kbn1);

        assertEquals(answer1, xml1, "データ入力なし時の比較");
    }

}
