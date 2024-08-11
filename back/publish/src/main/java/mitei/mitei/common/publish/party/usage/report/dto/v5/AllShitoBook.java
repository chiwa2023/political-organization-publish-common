package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 政党交付金使途報告書全Dto
 */
@JacksonXmlRootElement(localName = "BOOK")
public class AllShitoBook implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    // <HEAD>
    /** ドキュメントヘッダ */
    @JacksonXmlProperty(localName = "HEAD")
    private BookHeadDto bookHeadDto = new BookHeadDto();

    // <SITO_FLG>
    /** 編集有無フラグ */
    @JacksonXmlProperty(localName = "SITO_FLG")
    private SitoUmuFlgDto sitoUmuFlgDto = new SitoUmuFlgDto();

    // <SITO08_01>
    /** 様式8その1 */
    @JacksonXmlProperty(localName = "SITO08_01")
    private Shito0801Dto shito0801Dto = new Shito0801Dto();

    // <SITO08_02>
    /** 様式8その2 */
    @JacksonXmlProperty(localName = "SITO08_02")
    private Shito0802Dto shito0802Dto = new Shito0802Dto();

    // <SITO08_03>
    /** 様式8その3 */
    @JacksonXmlProperty(localName = "SITO08_03")
    private Shito0803Dto shito0803Dto = new Shito0803Dto();

    // <SITO08_04>
    /** 様式8その4 */
    @JacksonXmlProperty(localName = "SITO08_04")
    private Shito0804Dto shito0804Dto = new Shito0804Dto();

    // <SITO08_05>
    /** 様式8その5 */
    @JacksonXmlProperty(localName = "SITO08_05")
    private Shito0805Dto shito0805Dto = new Shito0805Dto();

    // <SITO08_06>
    /** 様式8その6 */
    @JacksonXmlProperty(localName = "SITO08_06")
    private Shito0806Dto shito0806Dto = new Shito0806Dto();

    // <SITO08_07>
    /** 様式8その7 */
    @JacksonXmlProperty(localName = "SITO08_07")
    private Shito0807Dto shito0807Dto = new Shito0807Dto();

    // <SITO09>
    /** 様式9(その1) */
    @JacksonXmlProperty(localName = "SITO09")
    private Shito0901Dto shito0901Dto = new Shito0901Dto();

    // <SITO09_02>
    /** 様式9その2 */
    @JacksonXmlProperty(localName = "SITO09_02")
    private Shito0902Dto shito0902Dto = new Shito0902Dto();

    // <KAIKEI_SHISYUTU_KIJYUN>
    /** 会計支出基準 */
    @JacksonXmlProperty(localName = "KAIKEI_SHISYUTU_KIJYUN")
    private KaikeiShishutuKijunDto kaikeiShishutuKijunDto = new KaikeiShishutuKijunDto();

    /**
     * ドキュメントヘッダを取得する
     *
     * @return ドキュメントヘッダ
     */
    public BookHeadDto getBookHeadDto() {
        return bookHeadDto;
    }

    /**
     * ドキュメントヘッダを設定する
     *
     * @param bookHeadDto ドキュメントヘッダ
     */
    public void setBookHeadDto(final BookHeadDto bookHeadDto) {
        this.bookHeadDto = bookHeadDto;
    }

    /**
     * 編集有無フラグを取得する
     *
     * @return 編集有無フラグ
     */
    public SitoUmuFlgDto getSitoUmuFlgDto() {
        return sitoUmuFlgDto;
    }

    /**
     * 編集有無フラグを設定する
     *
     * @param sitoUmuFlgDto 編集有無フラグ
     */
    public void setSitoUmuFlgDto(final SitoUmuFlgDto sitoUmuFlgDto) {
        this.sitoUmuFlgDto = sitoUmuFlgDto;
    }

    /**
     * 様式8その1を取得する
     *
     * @return 様式8その1
     */
    public Shito0801Dto getShito0801Dto() {
        return shito0801Dto;
    }

    /**
     * 様式8その1を設定する
     *
     * @param shito0801Dto 様式8その1
     */
    public void setShito0801Dto(final Shito0801Dto shito0801Dto) {
        this.shito0801Dto = shito0801Dto;
    }

    /**
     * 様式8その2を取得する
     *
     * @return 様式8その2
     */
    public Shito0802Dto getShito0802Dto() {
        return shito0802Dto;
    }

    /**
     * 様式8その2を設定する
     *
     * @param shito0802Dto 様式8その2
     */
    public void setShito0802Dto(final Shito0802Dto shito0802Dto) {
        this.shito0802Dto = shito0802Dto;
    }

    /**
     * 様式8その3を取得する
     *
     * @return 様式8その3
     */
    public Shito0803Dto getShito0803Dto() {
        return shito0803Dto;
    }

    /**
     * 様式8その3を設定する
     *
     * @param shito0803Dto 様式8その3
     */
    public void setShito0803Dto(final Shito0803Dto shito0803Dto) {
        this.shito0803Dto = shito0803Dto;
    }

    /**
     * 様式8その4を取得する
     *
     * @return 様式8その4
     */
    public Shito0804Dto getShito0804Dto() {
        return shito0804Dto;
    }

    /**
     * 様式8その4を設定する
     *
     * @param shito0804Dto 様式8その4
     */
    public void setShito0804Dto(final Shito0804Dto shito0804Dto) {
        this.shito0804Dto = shito0804Dto;
    }

    /**
     * 様式8その5を取得する
     *
     * @return 様式8その5
     */
    public Shito0805Dto getShito0805Dto() {
        return shito0805Dto;
    }

    /**
     * 様式8その5を設定する
     *
     * @param shito0805Dto 様式8その5
     */
    public void setShito0805Dto(final Shito0805Dto shito0805Dto) {
        this.shito0805Dto = shito0805Dto;
    }

    /**
     * 様式8その6を取得する
     *
     * @return 様式8その6
     */
    public Shito0806Dto getShito0806Dto() {
        return shito0806Dto;
    }

    /**
     * 様式8その6を設定する
     *
     * @param shito0806Dto 様式8その6
     */
    public void setShito0806Dto(final Shito0806Dto shito0806Dto) {
        this.shito0806Dto = shito0806Dto;
    }

    /**
     * 様式8その7を取得する
     *
     * @return 様式8その7
     */
    public Shito0807Dto getShito0807Dto() {
        return shito0807Dto;
    }

    /**
     * 様式8その7を設定する
     *
     * @param shito0807Dto 様式8その7
     */
    public void setShito0807Dto(final Shito0807Dto shito0807Dto) {
        this.shito0807Dto = shito0807Dto;
    }

    /**
     * 様式9を取得する
     *
     * @return 様式9
     */
    public Shito0901Dto getShito0901Dto() {
        return shito0901Dto;
    }

    /**
     * 様式9を設定する
     *
     * @param shito0901Dto 様式9
     */
    public void setShito0901Dto(final Shito0901Dto shito0901Dto) {
        this.shito0901Dto = shito0901Dto;
    }

    /**
     * 様式9その2を取得する
     *
     * @return 様式9その2
     */
    public Shito0902Dto getShito0902Dto() {
        return shito0902Dto;
    }

    /**
     * 様式9その2を設定する
     *
     * @param shito0902Dto 様式9その2
     */
    public void setShito0902Dto(final Shito0902Dto shito0902Dto) {
        this.shito0902Dto = shito0902Dto;
    }

    /**
     * 会計支出基準を取得する
     *
     * @return 会計支出基準
     */
    public KaikeiShishutuKijunDto getKaikeiShishutuKijunDto() {
        return kaikeiShishutuKijunDto;
    }

    /**
     * 会計支出基準を設定する
     *
     * @param kaikeiShishutuKijunDto 会計支出基準
     */
    public void setKaikeiShishutuKijunDto(final KaikeiShishutuKijunDto kaikeiShishutuKijunDto) {
        this.kaikeiShishutuKijunDto = kaikeiShishutuKijunDto;
    }
}
