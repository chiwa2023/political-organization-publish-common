package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の４(支出明細?)
 */
public class Shito0804Dto implements Serializable { // NOPMD DataClass

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 区分01(支部政党交付金) */
    @JacksonXmlProperty(localName = "KUBUN01")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080401Dto kbn080401Dto = new Kbn080401Dto();

    /** 区分02(備品) */
    @JacksonXmlProperty(localName = "KUBUN02")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080402Dto kbn080402Dto = new Kbn080402Dto();

    /** 区分03(事務所) */
    @JacksonXmlProperty(localName = "KUBUN03")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080403Dto kbn080403Dto = new Kbn080403Dto();

    /** 区分04(組織) */
    @JacksonXmlProperty(localName = "KUBUN04")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080404Dto kbn080404Dto = new Kbn080404Dto();

    /** 区分05(選挙) */
    @JacksonXmlProperty(localName = "KUBUN05")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080405Dto kbn080405Dto = new Kbn080405Dto();

    /** 区分06(機関誌) */
    @JacksonXmlProperty(localName = "KUBUN06")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080406Dto kbn080406Dto = new Kbn080406Dto();

    /** 区分07(宣伝) */
    @JacksonXmlProperty(localName = "KUBUN07")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080407Dto kbn080407Dto = new Kbn080407Dto();

    /** 区分08(パーティ) */
    @JacksonXmlProperty(localName = "KUBUN08")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080408Dto kbn080408Dto = new Kbn080408Dto();

    /** 区分09(その他事業) */
    @JacksonXmlProperty(localName = "KUBUN09")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080409Dto kbn080409Dto = new Kbn080409Dto();

    /** 区分10(調査) */
    @JacksonXmlProperty(localName = "KUBUN10")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080410Dto kbn080410Dto = new Kbn080410Dto();

    /** 区分11(寄附) */
    @JacksonXmlProperty(localName = "KUBUN11")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080411Dto kbn080411Dto = new Kbn080411Dto();

    /** 区分12(その他経費) */
    @JacksonXmlProperty(localName = "KUBUN12")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Kbn080412Dto kbn080412Dto = new Kbn080412Dto();

    /**
     * 区分01(支部政党交付金)を取得する
     *
     * @return 区分01(支部政党交付金)
     */
    public Kbn080401Dto getKbn080401Dto() {
        return kbn080401Dto;
    }

    /**
     * 区分01(支部政党交付金)を設定する
     *
     * @param kbn080401Dto 区分01(支部政党交付金)
     */
    public void setKbn080401Dto(final Kbn080401Dto kbn080401Dto) {
        this.kbn080401Dto = kbn080401Dto;
    }

    /**
     * 区分02(備品)を取得する
     *
     * @return 区分02(備品)
     */
    public Kbn080402Dto getKbn080402Dto() {
        return kbn080402Dto;
    }

    /**
     * 区分02(備品)を設定する
     *
     * @param kbn080402Dto 区分02(備品)
     */
    public void setKbn080402Dto(final Kbn080402Dto kbn080402Dto) {
        this.kbn080402Dto = kbn080402Dto;
    }

    /**
     * 区分03(事務所)を取得する
     *
     * @return 区分03(事務所)
     */
    public Kbn080403Dto getKbn080403Dto() {
        return kbn080403Dto;
    }

    /**
     * 区分03(事務所)を設定する
     *
     * @param kbn080403Dto 区分03(事務所)
     */
    public void setKbn080403Dto(final Kbn080403Dto kbn080403Dto) {
        this.kbn080403Dto = kbn080403Dto;
    }

    /**
     * 区分04(組織)を取得する
     *
     * @return 区分04(組織)
     */
    public Kbn080404Dto getKbn080404Dto() {
        return kbn080404Dto;
    }

    /**
     * 区分04(組織)を設定する
     *
     * @param kbn080404Dto 区分04(組織)
     */
    public void setKbn080404Dto(final Kbn080404Dto kbn080404Dto) {
        this.kbn080404Dto = kbn080404Dto;
    }

    /**
     * 区分05(選挙)を取得する
     *
     * @return 区分05(選挙)
     */
    public Kbn080405Dto getKbn080405Dto() {
        return kbn080405Dto;
    }

    /**
     * 区分05(選挙)を設定する
     *
     * @param kbn080405Dto 区分05(選挙)
     */
    public void setKbn080405Dto(final Kbn080405Dto kbn080405Dto) {
        this.kbn080405Dto = kbn080405Dto;
    }

    /**
     * 区分06(機関誌)を取得する
     *
     * @return 区分06(機関誌)
     */
    public Kbn080406Dto getKbn080406Dto() {
        return kbn080406Dto;
    }

    /**
     * 区分06(機関誌)を設定する
     *
     * @param kbn080406Dto 区分06(機関誌)
     */
    public void setKbn080406Dto(final Kbn080406Dto kbn080406Dto) {
        this.kbn080406Dto = kbn080406Dto;
    }

    /**
     * 区分07(宣伝)を取得する
     *
     * @return 区分07(宣伝)
     */
    public Kbn080407Dto getKbn080407Dto() {
        return kbn080407Dto;
    }

    /**
     * 区分07(宣伝)を設定する
     *
     * @param kbn080407Dto 区分07(宣伝)
     */
    public void setKbn080407Dto(final Kbn080407Dto kbn080407Dto) {
        this.kbn080407Dto = kbn080407Dto;
    }

    /**
     * 区分08(パーティ)を取得する
     *
     * @return 区分08(パーティ)
     */
    public Kbn080408Dto getKbn080408Dto() {
        return kbn080408Dto;
    }

    /**
     * 区分08(パーティ)を設定する
     *
     * @param kbn080408Dto 区分08(パーティ)
     */
    public void setKbn080408Dto(final Kbn080408Dto kbn080408Dto) {
        this.kbn080408Dto = kbn080408Dto;
    }

    /**
     * 区分09(その他事業)を取得する
     *
     * @return 区分09(その他事業)
     */
    public Kbn080409Dto getKbn080409Dto() {
        return kbn080409Dto;
    }

    /**
     * 区分09(その他事業)を設定する
     *
     * @param kbn080409Dto 区分09(その他事業)
     */
    public void setKbn080409Dto(final Kbn080409Dto kbn080409Dto) {
        this.kbn080409Dto = kbn080409Dto;
    }

    /**
     * 区分10(調査)を取得する
     *
     * @return 区分10(調査)
     */
    public Kbn080410Dto getKbn080410Dto() {
        return kbn080410Dto;
    }

    /**
     * 区分10(調査)を設定する
     *
     * @param kbn080410Dto 区分10(調査)
     */
    public void setKbn080410Dto(final Kbn080410Dto kbn080410Dto) {
        this.kbn080410Dto = kbn080410Dto;
    }

    /**
     * 区分11(寄附)を取得する
     *
     * @return 区分11(寄附)
     */
    public Kbn080411Dto getKbn080411Dto() {
        return kbn080411Dto;
    }

    /**
     * 区分11(寄附)を設定する
     *
     * @param kbn080411Dto 区分11(寄附)
     */
    public void setKbn080411Dto(final Kbn080411Dto kbn080411Dto) {
        this.kbn080411Dto = kbn080411Dto;
    }

    /**
     * 区分12(その他経費)を取得する
     *
     * @return 区分12(その他経費)
     */
    public Kbn080412Dto getKbn080412Dto() {
        return kbn080412Dto;
    }

    /**
     * 区分12(その他経費)を設定する
     *
     * @param kbn080412Dto 区分12(その他経費)
     */
    public void setKbn080412Dto(final Kbn080412Dto kbn080412Dto) {
        this.kbn080412Dto = kbn080412Dto;
    }

}
