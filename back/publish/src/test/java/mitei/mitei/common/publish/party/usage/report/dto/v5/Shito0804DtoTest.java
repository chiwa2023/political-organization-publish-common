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
 * Shito0804Dto単体テスト
 */
class Shito0804DtoTest {
    //CHECKSTYLE:OFF

    @Test
    void testConvertXml() throws Exception { // NOPMD

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // 入力なし
        Shito0804Dto shito0 = new Shito0804Dto();
        shito0.getKbn080401Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080402Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080403Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080404Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080405Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080406Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080407Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080408Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080409Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080410Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080411Dto().getList().add(new Sheet0804Dto());
        shito0.getKbn080412Dto().getList().add(new Sheet0804Dto());

        String xml0 = xmlMapper.writeValueAsString(shito0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0804_dto_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0, xml0, "データ入力なし時の比較");

        // 入力あり
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/party_usage/shito_0804_dto_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        // 1行データあり
        RowShitoCoreDto row1 = new RowShitoCoreDto();
        row1.setRowNo(1);
        row1.setUsageItem("取引項目");
        row1.setAmountAll("10000");
        row1.setAmountKoufukin("4000");
        row1.setAmountMyFunds("6000");
        row1.setAccrualDate("R4/12/21");
        row1.setPayeeName("取引先名称");
        row1.setAddress("取引先住所");
        row1.setBikou("備考");
        row1.setFlgCollectRecipt("1");

        Sheet0804Dto sheet1 = new Sheet0804Dto();

        sheet1.setHimoku("費目");
        sheet1.setSonotaAmount(500L);
        sheet1.setSonotaKofukin("300");
        sheet1.setSonotaMyFunds("200");
        sheet1.setAmountAll(5000L);
        sheet1.setAmountAllKoufukin(3000L);
        sheet1.setAmountAllMyFunds(2000L);

        sheet1.getList().add(row1);

        Shito0804Dto shito1 = new Shito0804Dto();
        shito1.getKbn080401Dto().getList().add(sheet1);
        shito1.getKbn080401Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080402Dto().getList().add(sheet1);
        shito1.getKbn080402Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080403Dto().getList().add(sheet1);
        shito1.getKbn080403Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080404Dto().getList().add(sheet1);
        shito1.getKbn080404Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080405Dto().getList().add(sheet1);
        shito1.getKbn080405Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080406Dto().getList().add(sheet1);
        shito1.getKbn080406Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080407Dto().getList().add(sheet1);
        shito1.getKbn080407Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080408Dto().getList().add(sheet1);
        shito1.getKbn080408Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080409Dto().getList().add(sheet1);
        shito1.getKbn080409Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080410Dto().getList().add(sheet1);
        shito1.getKbn080410Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080411Dto().getList().add(sheet1);
        shito1.getKbn080411Dto().getList().add(new Sheet0804Dto());
        shito1.getKbn080412Dto().getList().add(sheet1);
        shito1.getKbn080412Dto().getList().add(new Sheet0804Dto());

        String xml1 = xmlMapper.writeValueAsString(shito1);

        assertEquals(answer1, xml1, "データ入力あり時の比較");
    }

}
