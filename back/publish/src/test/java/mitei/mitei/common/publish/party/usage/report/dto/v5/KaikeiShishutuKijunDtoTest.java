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
 * KaikeiShishutuKijunDto単体テスト
 */
class KaikeiShishutuKijunDtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        KaikeiShishutuKijunDto kijunDto = new KaikeiShishutuKijunDto();
        
        KaikeiKijunKingakuDto kijunKingakuDto = new KaikeiKijunKingakuDto();
        kijunKingakuDto.setAmount(50000L);

        kijunDto.setKaikeiKijunKingakuDto(kijunKingakuDto);
        
        // XML生成
        String xml = xmlMapper.writeValueAsString(kijunDto);

        // 入力なし
        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/kaikei_shishutu_kijun_dto.txt");
        String answer = Files.readString(pathAnswer);

        assertEquals(answer, xml, "常に金額入力");
    }

}
