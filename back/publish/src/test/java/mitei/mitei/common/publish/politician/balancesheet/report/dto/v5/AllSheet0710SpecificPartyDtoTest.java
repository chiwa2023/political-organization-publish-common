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
 * AllSheet0710SpecificPartyDto単体テスト
 */
class AllSheet0710SpecificPartyDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllSheet0710SpecificPartyDto allSheet0710SpecificPartyDto = new AllSheet0710SpecificPartyDto();

        Sheet071000SpecificPartyDto sheet1 = new Sheet071000SpecificPartyDto();
        sheet1.setPageTotal(30000L);

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071000SpecificPartyDto row0 = new Row071000SpecificPartyDto();

        /// ** 連番 */
        row0.setIchirenNo(1);
        /// ** パーティ名称 */
        row0.setPartyName("パーティ名称");
        /// ** 金額 */
        row0.setKingaku(30000L);
        /// ** 支払い数 */
        row0.setShiharaisu(3);
        /// ** 開催日 */
        row0.setAccrualDate("R4/2/2");
        /// ** 開催場所 */
        row0.setKaisaiBasho("開催場所");
        /// ** 備考 */
        row0.setBikou("備考");

        sheet1.getList().add(row0);

        allSheet0710SpecificPartyDto.setSheet071000SpecificPartyDto(sheet1);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allSheet0710SpecificPartyDto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/all_sheet_0710.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertThat(xml0).isEqualTo(answer0);

    }

}
