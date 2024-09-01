package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.constants.GetCurrentResourcePath;

/**
 * Sheet072000OathDto単体テスト
 */
class Sheet072000OathDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 一種類のみ
        Sheet072000OathDto sheet0 = new Sheet072000OathDto();
        /// ** 領収書の写しの有無 */
        sheet0.setFlgReciptCopy(0);
        /// ** 監査意見書の有無 */
        sheet0.setFlgKansaIkensho(0);
        /// ** 政治資金監査報告書 */
        sheet0.setFlgSeijishikinHohkokusho(1);
        /// ** 宣誓日 */
        sheet0.setDateOath("R4/12/1");
        /// ** 政治団体名称 */
        sheet0.setDantaiName20("団体名称");
        /// ** 会計責任者姓名の姓 */
        sheet0.setKaikeiSekininshaNameLast("会計責任者の姓");
        /// ** 会計責任者姓名の名 */
        sheet0.setKaikeiSekininshaNameFirst("会計責任者の名");
        /// ** 代表者姓名の姓 */
        sheet0.setDaihyoushaKaisanNameLast("解散時代表者の姓");
        /// ** 代表者姓名の名 */
        sheet0.setDaihyoushaKaisanNameFirst("解散時代表者の名");

        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_072000_base.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertThat(xml0).isEqualTo(answer0);

    }

}
