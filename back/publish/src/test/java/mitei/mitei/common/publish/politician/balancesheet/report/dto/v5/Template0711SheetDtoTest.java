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
 * Template0711SheetDto単体テスト
 */
class Template0711SheetDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Template0711SheetDto sheet0 = new Template0711SheetDto();
        sheet0.setPageTotal(30000L);
        sheet0.setPartyName("パーティ名称");
        sheet0.setSortNo("9");
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/template_0711_none.txt");
        String answer0 = Files.readString(pathAnswer0);
        assertThat(xml0).isEqualTo(answer0);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/template_0711_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Template0711SheetDto sheet1 = new Template0711SheetDto();
        sheet1.setPageTotal(30000L);
        sheet1.setPartyName("パーティ名称");
        sheet1.setSortNo("9");

        //すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row070711DonateDto row0 = new Row070711DonateDto();

        ///** 連番 */
        row0.setIchirenNo(1);
        ///** 寄付者の名前 */
        row0.setKifusha("寄付者名称");
        ///** 金額 */
        row0.setKingaku(30000L);
        ///** 発生日 */
        row0.setDate("R4/2/2");
        ///** 住所 */
        row0.setJusho("住所");
        ///** 職業 */
        row0.setShokugyou("職業");
        ///** 備考 */
        row0.setBiko("備考");
        ///** 通し番号 */
        row0.setTohshibangou(1);
        ///** 税額控除フラグ */
        row0.setFlgZeigakuKohjo(Short.valueOf("0"));
        ///** 行区分 */
        row0.setGyoukubun(Short.valueOf("8"));

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertThat(xml1).isEqualTo(answer1);
        
    }

}
