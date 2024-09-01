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
 * Sheet071402EquipmentCostsDto単体テスト
 */
class Sheet071402EquipmentCostsDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Sheet071402EquipmentCostsDto sheet0 = new Sheet071402EquipmentCostsDto();
        sheet0.setPageTotal(30000L);
        sheet0.setSonotaTotal("");
        
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071402_none.txt");
        String answer0 = Files.readString(pathAnswer0);
        assertThat(xml0).isEqualTo(answer0);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071402_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Sheet071402EquipmentCostsDto sheet1 = new Sheet071402EquipmentCostsDto();
        sheet1.setPageTotal(30000L);
        sheet1.setSonotaTotal("");

        Row071415OrdinaryExpensesDto row0 = new Row071415OrdinaryExpensesDto();
        /// ** 連番 */
        row0.setIchirenNo(1);
        /// ** 支出の目的 */
        row0.setMokuteki("目的");
        /// ** 金額 */
        row0.setKingaku(30000L);
        /// ** 発生日 */
        row0.setAccrualDate("R4/12/1");
        /// ** 支出の相手先名称 */
        row0.setName("支出の相手先名称");
        /// ** 支出の相手先住所 */
        row0.setJusho("東京都千代田区");
        /// ** 備考 */
        row0.setBikou("備考");
        /// ** 領収書を徴しがたかったフラグ */
        row0.setFlgRyoushuusho(0);
        /// ** 交付金に係る支出フラグ */
        row0.setFlgKouufukin(1);

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertThat(xml1).isEqualTo(answer1);
        
    }

}
