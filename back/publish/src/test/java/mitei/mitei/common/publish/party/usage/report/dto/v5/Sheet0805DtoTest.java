package mitei.mitei.common.publish.party.usage.report.dto.v5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.constants.GetCurrentResourcePath;

/**
 * Sheet0805Dto単体テスト
 */
class Sheet0805DtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Sheet0805Dto sheet0 = new Sheet0805Dto();
        sheet0.setSumAmount(3377L);

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/sheet_0805_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0, xml0, "行データなし");

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

        // XML生成
        String xml1 = xmlMapper.writeValueAsString(sheet1);

        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/sheet_0805_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        assertEquals(answer1, xml1, "行データあり");

    }

}
