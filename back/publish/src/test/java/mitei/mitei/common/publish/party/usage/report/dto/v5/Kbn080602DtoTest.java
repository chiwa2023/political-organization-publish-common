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
 * Kbn080602Dto単体テスト
 */
class Kbn080602DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/kbn_0800602_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        Kbn080602Dto kbn0 = new Kbn080602Dto();
        kbn0.setSubTotal(765765L);
        kbn0.setSubTotalBikou("果実備考");

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(kbn0);

        assertEquals(answer0, xml0, "データ入力なし時の比較");

        // 入力あり
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/kbn_0800602_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Kbn080602Dto kbn1 = new Kbn080602Dto();
        kbn1.setSubTotal(654654L);
        kbn1.setSubTotalBikou("果実特別備考");

        RowShito0806Dto row = new RowShito0806Dto();
        row.setRowNo(22);
        row.setAccrualDate("R4/9/19");
        row.setAmount(997755L);
        row.setBikou("備品");

        kbn1.getList().add(row);

        String xml1 = xmlMapper.writeValueAsString(kbn1);

        assertEquals(answer1, xml1, "データ入力あり時の比較");

    }

}
