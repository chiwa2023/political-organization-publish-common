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
 * AllSheetKbn071103Dto
 */
class AllSheetKbn071103DtoTest {
// CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllSheetKbn071103Dto allSheetKbn071103Dto = new AllSheetKbn071103Dto();

        Sheet071103ConsiderationPartyPoliticOrgDto sheet1 = new Sheet071103ConsiderationPartyPoliticOrgDto();
        sheet1.setPageTotal(30000L);
        sheet1.setPartyName("パーティ名称");
        sheet1.setSortNo("9");

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row070711DonateDto row0 = new Row070711DonateDto();

        /// ** 連番 */
        row0.setIchirenNo(1);
        /// ** 寄付者の名前 */
        row0.setKifusha("寄付者名称");
        /// ** 金額 */
        row0.setKingaku(30000L);
        /// ** 発生日 */
        row0.setDate("R4/2/2");
        /// ** 住所 */
        row0.setJusho("住所");
        /// ** 職業 */
        row0.setShokugyou("職業");
        /// ** 備考 */
        row0.setBiko("備考");
        /// ** 通し番号 */
        row0.setTohshibangou(1);
        /// ** 税額控除フラグ */
        row0.setFlgZeigakuKohjo(Short.valueOf("0"));
        /// ** 行区分 */
        row0.setGyoukubun(Short.valueOf("8"));

        sheet1.getList().add(row0);

        allSheetKbn071103Dto.getList().add(sheet1);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allSheetKbn071103Dto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/kbn_071103_list.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertThat(xml0).isEqualTo(answer0);
    }

}
