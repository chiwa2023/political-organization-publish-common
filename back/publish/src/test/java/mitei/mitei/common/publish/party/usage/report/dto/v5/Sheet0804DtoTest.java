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
 * Sheet0804単体テスト
 */
class Sheet0804DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        //何もセットしないとき
        Sheet0804Dto sheet0 = new Sheet0804Dto();
        
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/sheet_0804_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        // XML生成
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        assertEquals(answer0, xml0,"入力なしシート");

        //1行データあり
        RowShitoCoreDto row1 = new RowShitoCoreDto();

        row1.setRowNo(1);
        row1.setUsageItem("取引項目");
        row1.setAmountAll(10000L);
        row1.setAmountKoufukin(4000L);
        row1.setAmountMyFunds(6000L);
        row1.setAccrualDate("R4/12/21");
        row1.setPayeeName("取引先名称");
        row1.setAddress("取引先住所");
        row1.setBikou("備考");
        row1.setFlgCollectRecipt(1);

        Sheet0804Dto sheet1 = new Sheet0804Dto();

        sheet1.setHimoku("費目");
        sheet1.setSonotaAmount(500L);
        sheet1.setSonotaKoufukin("300");
        sheet1.setSonotaMyFunds("200");
        sheet1.setAmountAll(5000L);
        sheet1.setAmountAllKoufukin(3000L);
        sheet1.setAmountAllMyFunds(2000L);

        sheet1.getList().add(row1);
        // XML生成
        String xml1 = xmlMapper.writeValueAsString(sheet1);

        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/sheet_0804_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        assertEquals(answer1, xml1,"1行データが入ったシート");
    }

}
