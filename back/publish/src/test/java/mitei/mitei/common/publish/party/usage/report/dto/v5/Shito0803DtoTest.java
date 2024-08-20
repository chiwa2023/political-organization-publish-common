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
 * Shito0803Dto単体テスト
 */
class Shito0803DtoTest {
    // CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception { // NOPMD

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0803_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        Shito0803Dto shito0 = new Shito0803Dto();
        String xml0 = xmlMapper.writeValueAsString(shito0);

        assertEquals(answer0, xml0, "データ入力なし時の比較");

        // 入力なし
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0803_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Shito0803Dto shito1 = new Shito0803Dto();

        shito1.getSheet0803Dto().setTotalShibuKoufuAll(10001L);
        shito1.getSheet0803Dto().setTotalShibuKoufuJutoKoufukin(10002L);
        shito1.getSheet0803Dto().setTotalShibuKoufuJutoMyFunds(10003L);
        shito1.getSheet0803Dto().setTotalShibuKoufuBikou("aaaa");
        shito1.getSheet0803Dto().setTotalJinkenhiAll(20001L);
        shito1.getSheet0803Dto().setTotalJinkenhiJutoKoufukin(20002L);
        shito1.getSheet0803Dto().setTotalJinkenhiJutoMyFunds(20003L);
        shito1.getSheet0803Dto().setTotalJinkenhiBikou("bbbb");
        shito1.getSheet0803Dto().setTotalKounetsuhiAll(30001L);
        shito1.getSheet0803Dto().setTotalKounetsuhiJutoKoufukin(30002L);
        shito1.getSheet0803Dto().setTotalKounetsuhiJutoMyFunds(30003L);
        shito1.getSheet0803Dto().setTotalKounetsuhiBikou("cccc");
        shito1.getSheet0803Dto().setTotalBihinAll(40001L);
        shito1.getSheet0803Dto().setTotalBihinJutoKoufukin(40002L);
        shito1.getSheet0803Dto().setTotalBihinJutoMyFunds(40003L);
        shito1.getSheet0803Dto().setTotalBihinBikou("dddd");
        shito1.getSheet0803Dto().setTotalJimushoAll(50001L);
        shito1.getSheet0803Dto().setTotalJimushoJutoKoufukin(50002L);
        shito1.getSheet0803Dto().setTotalJimushoJutoMyFunds(50003L);
        shito1.getSheet0803Dto().setTotalJimushoBikou("rrrr");
        shito1.getSheet0803Dto().setTotalKeihiAll(60001L);
        shito1.getSheet0803Dto().setTotalKeihiJutoKoufukin(60002L);
        shito1.getSheet0803Dto().setTotalKeihiJutoMyFunds(60003L);
        shito1.getSheet0803Dto().setTotalKeihiBikou("eeee");
        shito1.getSheet0803Dto().setTotalSoshikiAll(70001L);
        shito1.getSheet0803Dto().setTotalSoshikiJutoKoufukin(70002L);
        shito1.getSheet0803Dto().setTotalSoshikiutoMyFunds(70003L);
        shito1.getSheet0803Dto().setTotalSoshikiBikou("ffff");
        shito1.getSheet0803Dto().setTotalSenkyoAll(80001L);
        shito1.getSheet0803Dto().setTotalSenkyoJutoKoufukin(80002L);
        shito1.getSheet0803Dto().setTotalSenkyoJutoMyFunds(80003L);
        shito1.getSheet0803Dto().setTotalSenkyoBikou("gggg");
        shito1.getSheet0803Dto().setTotalAllJigyouAll(90001L);
        shito1.getSheet0803Dto().setTotalAllJigyouJutoKoufukin(90002L);
        shito1.getSheet0803Dto().setTotalAllJigyouJutoMyFunds(90003L);
        shito1.getSheet0803Dto().setTotalAllJigyouBikou("qqqq");
        shito1.getSheet0803Dto().setTotalKikanshiAll(100001L);
        shito1.getSheet0803Dto().setTotalKikanshiJutoKoufukin(100002L);
        shito1.getSheet0803Dto().setTotalKikanshiJutoMyFunds(100003L);
        shito1.getSheet0803Dto().setTotalKikanshiBikou("hhhh");
        shito1.getSheet0803Dto().setTotalSendenAll(110001L);
        shito1.getSheet0803Dto().setTotalSendenJutoKoufukin(110002L);
        shito1.getSheet0803Dto().setTotalSendenJutoMyFunds(110003L);
        shito1.getSheet0803Dto().setTotalSendenBikou("pppp");
        shito1.getSheet0803Dto().setTotalPartyAll(120001L);
        shito1.getSheet0803Dto().setTotalPartyJutoKoufukin(120002L);
        shito1.getSheet0803Dto().setTotalPartyJutoMyFunds(120003L);
        shito1.getSheet0803Dto().setTotalPartyBikou("iiii");
        shito1.getSheet0803Dto().setTotalSonotaJigyouAll(130001L);
        shito1.getSheet0803Dto().setTotalSonotaJigyouJutoKoufukin(130002L);
        shito1.getSheet0803Dto().setTotalSonotaJigyouJutoMyFunds(130003L);
        shito1.getSheet0803Dto().setTotalSonotaJigyouBikou("jjjj");
        shito1.getSheet0803Dto().setTotalChousaAll(140001L);
        shito1.getSheet0803Dto().setTotaChousaJutoKoufukin(140002L);
        shito1.getSheet0803Dto().setTotalChousaJutoMyFunds(140003L);
        shito1.getSheet0803Dto().setTotalChousaBikou("kkkk");
        shito1.getSheet0803Dto().setTotalKifuAll(150001L);
        shito1.getSheet0803Dto().setTotalKifuJutoKoufukin(150002L);
        shito1.getSheet0803Dto().setTotalKifuJutoMyFunds(150003L);
        shito1.getSheet0803Dto().setTotalKifuBikou("llll");
        shito1.getSheet0803Dto().setTotalSonotaKeihiAll(160001L);
        shito1.getSheet0803Dto().setTotalSonotaKeihiJutoKoufukin(160002L);
        shito1.getSheet0803Dto().setTotalSonotaKeihiJutoMyFunds(160003L);
        shito1.getSheet0803Dto().setTotalSonotaKeihiBikou("mmmm");
        shito1.getSheet0803Dto().setTotalAllActionAll(170001L);
        shito1.getSheet0803Dto().setTotalAllActionJutoKoufukin(170002L);
        shito1.getSheet0803Dto().setTotalAllActionJutoMyFunds(170003L);
        shito1.getSheet0803Dto().setTotalAllActionBikou("nnnn");
        shito1.getSheet0803Dto().setTotalAllAmountAll(180001L);
        shito1.getSheet0803Dto().setTotalAllAmountJutoKoufukin(180002L);
        shito1.getSheet0803Dto().setTotalAllAmountJutoMyFunds(180003L);
        shito1.getSheet0803Dto().setTotalAllAmountBikou("oooo");

        String xml1 = xmlMapper.writeValueAsString(shito1);

        assertEquals(answer1, xml1, "データ入力あり時の比較");
    }

}
