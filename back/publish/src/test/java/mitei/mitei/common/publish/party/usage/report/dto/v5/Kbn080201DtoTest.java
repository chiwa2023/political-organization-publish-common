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
 * Kbn080201Dto単体テスト
 */
class Kbn080201DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

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

        // XML生成
        String xml = xmlMapper.writeValueAsString(Kbn080201Dto);

        // 入力なし
        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/kbn_080201_dto.txt");
        String answer = Files.readString(pathAnswer);

        assertEquals(answer, xml, "データ入力なし時の比較");
    }

}
