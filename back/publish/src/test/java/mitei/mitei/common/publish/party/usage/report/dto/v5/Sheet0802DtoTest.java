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
import mitei.mitei.common.publish.party.usage.report.logic.CreateShito0802Kbn01WrapperLogic;

/**
 * Sheet0802Dto単体テスト
 */
class Sheet0802DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 常に区分1,2データが存在する(2のデータが存在しないケースはKbn0802Dtoのテストで実施済)
        Sheet0802Dto sheet = new Sheet0802Dto();

        // 区分1
        CreateShito0802Kbn01WrapperLogic createShito0802Kbn01WrapperLogic = new CreateShito0802Kbn01WrapperLogic();

        Kbn080201Dto Kbn080201Dto = createShito0802Kbn01WrapperLogic.getFinalDto();

        // 他のDtoをテストに介在させないためにここでは特別にしているが、業務的にはきわめて望ましくない触り方
        Kbn080201Dto.getList().get(0).setAmount(12345L); // NOPMD
        Kbn080201Dto.getList().get(1).setAmount(23456L); // NOPMD
        Kbn080201Dto.getList().get(2).setAmount(34567L); // NOPMD
        Kbn080201Dto.getList().get(3).setAmount(45678L); // NOPMD
        Kbn080201Dto.getList().get(4).setAmount(56789L); // NOPMD
        Kbn080201Dto.getList().get(5).setAmount(67890L); // NOPMD
        Kbn080201Dto.getList().get(6).setAmount(78901L); // NOPMD
        Kbn080201Dto.getList().get(7).setAmount(89012L); // NOPMD
        Kbn080201Dto.getList().get(8).setAmount(90123L); // NOPMD
        Kbn080201Dto.getList().get(9).setAmount(65432L); // NOPMD

        sheet.setKbn080201Dto(Kbn080201Dto);

        Kbn080202Dto kbn080202Dto = new Kbn080202Dto();
        kbn080202Dto.setTotalAmount(200000L);

        RowShito0802Dto row0 = new RowShito0802Dto();
        row0.setRowNo(3);
        row0.setItemName("項目名称");
        row0.setAccrualDate("R4/12/1");
        row0.setAmount(65432L);
        kbn080202Dto.getList().add(row0);

        sheet.setKbn080202Dto(kbn080202Dto);

        // XML生成
        String xml = xmlMapper.writeValueAsString(sheet);

        // 入力なし
        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/seet_080201_dto.txt");
        String answer = Files.readString(pathAnswer);

        assertEquals(answer, xml, "データ入力なし時の比較");
    }

}
