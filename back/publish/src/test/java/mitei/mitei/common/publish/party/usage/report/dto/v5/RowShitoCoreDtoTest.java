package mitei.mitei.common.publish.party.usage.report.dto.v5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.publish.party.usage.report.constants.GetCurrentResourcePath;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * RowShitoCore単体テスト
 */
class RowShitoCoreDtoTest {

    @Test
    void testConvertXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/row_shito_core.txt");
        String answer = Files.readString(pathAnswer); // SUPPRESS CHECKSTYLE MethodArgumentCouldBeFinal

        RowShitoCoreDto row0 = new RowShitoCoreDto();

        // 行番号
        row0.setRowNo(1);
        // 取引項目
        row0.setUsageItem("取引項目");
        // 総支出額
        row0.setAmountAll("10000");
        // 政党交付金空の支出（充当）
        row0.setAmountKoufukin("4000");
        // 政党基金からの支出（充当）
        row0.setAmountMyFunds("6000");
        // 発生日
        row0.setAccrualDate("R4/12/21");
        // 取引相手名称
        row0.setPayeeName("取引先名称");
        // 取引相手住所
        row0.setAddress("取引先住所");
        // 備考
        row0.setBikou("備考");
        // 領収書を徴し難いかどうかのフラグ
        row0.setFlgCollectRecipt("1");

        // XML生成
        String xml = xmlMapper.writeValueAsString(row0);

        assertEquals(answer, xml, "すべてのカラムに異なる値をい入れた場合");
    }

}
