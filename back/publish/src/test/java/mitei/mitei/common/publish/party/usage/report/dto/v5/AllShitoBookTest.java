package mitei.mitei.common.publish.party.usage.report.dto.v5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mitei.mitei.common.publish.party.usage.report.constants.GetCurrentResourcePath;

/**
 * AllShitoBook単体テスト
 */
class AllShitoBookTest {
    // CHECKSTYLE:OFF

    @Test
    void testRead() throws Exception {

        // 最低限データ
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/SITO_LEAST.xml");
        String readText = Files.readString(pathAnswer, Charset.forName("windows-31j"));

        AllShitoBook allShitoBook = xmlMapper.readValue(readText, new TypeReference<>() {
        });

        // <HEAD>
        assertEquals("20191220", allShitoBook.getBookHeadDto().getVersion(), "バージョン");
        assertEquals("使途等報告書作成ソフト", allShitoBook.getBookHeadDto().getApliName(), "アプリ名称");
        assertEquals("0", allShitoBook.getBookHeadDto().getFlgApli(), "アプリフラグ");
        assertEquals("0", allShitoBook.getBookHeadDto().getFlgHonbu(), "本部ラグ");

        // <SITO_FLG>
        assertEquals(18, allShitoBook.getSitoUmuFlgDto().getUmuStatusText().length(), "フラグ文字列文字数");

        // <SITO08_01>
        assertEquals("代表者", allShitoBook.getShito0801Dto().getSheet0801Dto().getDelegateName(), "様式8その1代表者名");

        // <SITO08_02>
        assertEquals(10, allShitoBook.getShito0802Dto().getSheet0802Dto().getKbn080201Dto().getList().size(),
                "様式8その2区分1は10行分のリストで構成されている");
        assertEquals("　政党交付金（支部政党交付金）支出充当額総額　----------------------------------④",
                allShitoBook.getShito0802Dto().getSheet0802Dto().getKbn080201Dto().getList().get(3).getItemName(),
                "様式8その2区分1は項目4の項目名は固定値");
        assertEquals(0L, allShitoBook.getShito0802Dto().getSheet0802Dto().getKbn080202Dto().getList().size(),
                "様式8その2区分0の合計金額は0");

        // <SITO08_03>
        assertEquals(0L, allShitoBook.getShito0803Dto().getSheet0803Dto().getTotalAllActionAll(), "様式8その3支部交付金合計金額は0");

        // <SITO08_04>
        // 01
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080401Dto().getList().get(0).getAmountAll(),
                "様式8その4区分1の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080401Dto().getList().get(0).getList().size(),
                "様式8その4区分1の明細リストはありません");
        // 02
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080402Dto().getList().get(0).getAmountAll(),
                "様式8その4区分2の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080402Dto().getList().get(0).getList().size(),
                "様式8その4区分2の明細リストはありません");
        // 03
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080403Dto().getList().get(0).getAmountAll(),
                "様式8その4区分3の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080403Dto().getList().get(0).getList().size(),
                "様式8その4区分3の明細リストはありません");
        // 04
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080404Dto().getList().get(0).getAmountAll(),
                "様式8その4区分4の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080404Dto().getList().get(0).getList().size(),
                "様式8その4区分4の明細リストはありません");
        // 05
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080405Dto().getList().get(0).getAmountAll(),
                "様式8その4区分5の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080405Dto().getList().get(0).getList().size(),
                "様式8その4区分5の明細リストはありません");
        // 06
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080406Dto().getList().get(0).getAmountAll(),
                "様式8その4区分6の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080406Dto().getList().get(0).getList().size(),
                "様式8その4区分6の明細リストはありません");
        // 07
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080407Dto().getList().get(0).getAmountAll(),
                "様式8その4区分7の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080407Dto().getList().get(0).getList().size(),
                "様式8その4区分7の明細リストはありません");
        // 08
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080408Dto().getList().get(0).getAmountAll(),
                "様式8その4区分8の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080408Dto().getList().get(0).getList().size(),
                "様式8その4区分8の明細リストはありません");
        // 09
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080409Dto().getList().get(0).getAmountAll(),
                "様式8その4区分9の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080409Dto().getList().get(0).getList().size(),
                "様式8その4区分9の明細リストはありません");
        // 10
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080410Dto().getList().get(0).getAmountAll(),
                "様式8その4区分10の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080410Dto().getList().get(0).getList().size(),
                "様式8その4区分10の明細リストはありません");
        // 11
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080411Dto().getList().get(0).getAmountAll(),
                "様式8その4区分11の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080411Dto().getList().get(0).getList().size(),
                "様式8その4区分11の明細リストはありません");
        // 12
        assertEquals(0L, allShitoBook.getShito0804Dto().getKbn080412Dto().getList().get(0).getAmountAll(),
                "様式8その4区分12の合計金額は0");
        assertEquals(0, allShitoBook.getShito0804Dto().getKbn080412Dto().getList().get(0).getList().size(),
                "様式8その4区分12の明細リストはありません");

        // <SITO08_05>
        // 01
        assertEquals(0L, allShitoBook.getShito0805Dto().getSheet0805Dto().getSumAmount(), "様式8その5支部交付金合計金額は0");
        assertEquals(0, allShitoBook.getShito0805Dto().getSheet0805Dto().getList().size(), "様式8その5内訳のリストは持っていません");

        // <SITO08_06>
        assertEquals(0L, allShitoBook.getShito0806Dto().getList().get(0).getTotalIncrease(), "様式8その6基金増減額は0");

        // <SITO08_07>
        assertEquals(1, allShitoBook.getShito0807Dto().getSheet0807Dto().getAuditOption(), "様式8その7監査意見書を添付");

        // <SITO09>
        assertEquals(0, allShitoBook.getShito0901Dto().getSheet0901Dto().getList().size(), "様式9にデータなし");

        // <SITO09_02>
        assertEquals("", allShitoBook.getShito0902Dto().getList().get(0).getDantaiName(), "様式9その2団体名は空文字");

        // <KAIKEI_SHISYUTU_KIJYUN>
        assertEquals(50000, allShitoBook.getKaikeiShishutuKijunDto().getKaikeiKijunKingakuDto().getAmount(),
                "支出基準は50000円");

    }

    @Test
    void testReadWrite() throws Exception {

        // ある程度データが入ったXMLを読み込み
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(Include.ALWAYS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathRead = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/party_usage/SITO.xml");
        String readText =Files.readString(pathRead, Charset.forName("windows-31j"));

        AllShitoBook allShitoBook = xmlMapper.readValue(readText, new TypeReference<>() {
        });

        // 読んだデータを使ってデータ吐き出し
        Path pathWriter = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "evidence/REWRITE_SITO.xml");
        String writeText = xmlMapper.writeValueAsString(allShitoBook);
        Files.writeString(pathWriter,writeText );
        
        Files.writeString(Paths.get("c:/temp/SITO.xml"),readText.replaceAll("\t", "  "));

        //テストに比較が必要なので無理やり比較
        assertEquals("<?xml version=\"1.0\" encoding=\"Shift_JIS\"?>"+"\r\n"+writeText, readText.replaceAll("\t", "  "),"");
        
        // NOTE:吐き出したデータは再度公式ソフトウェアで読み込みできました(こっちが大事)
    }
}
