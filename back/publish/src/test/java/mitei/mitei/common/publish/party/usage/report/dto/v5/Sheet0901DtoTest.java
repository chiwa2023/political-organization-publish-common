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
 * Sheet0901Dto単体テスト
 */
class Sheet0901DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        //何もセットしないとき
        Sheet0901Dto sheet0 = new Sheet0901Dto();
        
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/sheet_0901_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        assertEquals(answer0, xml0,"入力なしシート");

        //1行データあり
        RowShito0901Dto row = new RowShito0901Dto();
        row.setRowNo(7);
        row.setItemName("備品・消耗品費");
        row.setDigest("aaaaa");
        row.setAmount(20000L);
        row.setAccrualDate("R4/12/1");
        row.setExplainText("相手が××だった");

        Sheet0901Dto sheet1 = new Sheet0901Dto();
        sheet1.getList().add(row);
   
        // XML生成
        String xml1 = xmlMapper.writeValueAsString(sheet1);
        
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/sheet_0901_list.txt");
        String answer1 = Files.readString(pathAnswer1);
        
        assertEquals(answer1, xml1,"入力ありシート");
    }

}
