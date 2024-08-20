package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.publish.party.usage.report.constants.GetCurrentResourcePath;

/**
 * Sheet071900RealEstateDto単体テスト
 */
class Sheet071900RealEstateDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Sheet071900RealEstateDto sheet0 = new Sheet071900RealEstateDto();
        sheet0.setKbnRealEstitate(0);
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071900_none.txt");
        String answer0 = Files.readString(pathAnswer0);
        assertThat(xml0).isEqualTo(answer0);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071900_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Sheet071900RealEstateDto sheet1 = new Sheet071900RealEstateDto();
        sheet1.setKbnRealEstitate(0);

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071900CurrentStatusOfRealEstateUseDto row0 = new Row071900CurrentStatusOfRealEstateUseDto();
        /// ** 連番 */
        row0.setIchirenNo(1);
        /// ** 摘要 */
        row0.setTekiyou("摘要");
        /// ** 用途 */
        row0.setYouto("用途");
        /// ** 使用者と代表者との関係 */
        row0.setKankeiShiyousha("使用者との関係");
        /// ** 使用の用途 */
        row0.setShiyouYouto("使用の用途");
        /// ** 使用面積 */
        row0.setShiyouMenseki("123.45");
        /// ** 使用価格 */
        row0.setShiyouKakaku(4444L);

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertThat(xml1).isEqualTo(answer1);
    }

}
