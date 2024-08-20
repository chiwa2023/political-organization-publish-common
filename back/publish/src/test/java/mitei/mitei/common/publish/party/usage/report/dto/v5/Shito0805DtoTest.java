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
 * Shito0805Dto単体テスト
 */
class Shito0805DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // データなし
        Shito0805Dto shito0 = new Shito0805Dto();
        Sheet0805Dto sheet0 = new Sheet0805Dto();
        sheet0.setSumAmount(3377L);
        shito0.setSheet0805Dto(sheet0);

        // XML出力
        String xml0 = xmlMapper.writeValueAsString(shito0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0805_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0, xml0, "データ入力なし時の比較");

        // データあり
        Shito0805Dto shito1 = new Shito0805Dto();

        Sheet0805Dto sheet1 = new Sheet0805Dto();
        sheet1.setSumAmount(242424L);

        RowShito0805Dto row = new RowShito0805Dto();
        row.setRowNo(1);
        row.setSibuName("支部名称");
        row.setAmount(23456L);
        row.setAccrualDate("R3/11/13");
        row.setPurpose("事務所費");
        row.setBikou("備考");
        row.setRowKbn(100);

        sheet1.getList().add(row);

        shito1.setSheet0805Dto(sheet1);

        // XML出力
        String xml1 = xmlMapper.writeValueAsString(shito1);

        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0805_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        assertEquals(answer1, xml1, "データ入力なし時の比較");
    }

}
