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
 * BookHeadDto単体テスト
 */
class BookHeadDtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/book_header.txt");
        String answer0 = Files.readString(pathAnswer0);

        // ほぼ固定値なのでテストは１種類でOK(フラグがIntegerになるかどうか)
        BookHeadDto head = new BookHeadDto();
        head.setVersion("20191220");
        head.setApliName("使途等報告書作成ソフト");
        head.setFlgApli("0");
        head.setFlgHonbu("0");

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(head);

        assertEquals(answer0, xml0, "標準的なヘッダ出力");

    }

}
