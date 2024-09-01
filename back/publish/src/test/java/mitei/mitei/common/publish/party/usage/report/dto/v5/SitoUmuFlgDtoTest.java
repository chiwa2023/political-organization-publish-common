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
 * SitoUmuFlgDto単体テスト
 */
class SitoUmuFlgDtoTest {

    @Test
    void testConvertXml() throws Exception {
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_umu_flg.txt");
        String answer0 = Files.readString(pathAnswer0);

        //ここでは入力された値がそのまま出ることしかチェックしない。実際には全体を統括する
        //AllBookを解析して有無テキストを作成するValidateLogicを作成する必要があり、詳細なテストはそちらに譲る
        SitoUmuFlgDto sitoUmuFlgDto = new SitoUmuFlgDto();
        sitoUmuFlgDto.setUmuStatusText("111100000000001100");
        
        // XML生成
        String xml0 = xmlMapper.writeValueAsString(sitoUmuFlgDto);

        assertEquals(answer0, xml0, "データ入力なし時の比較");
    }

}
