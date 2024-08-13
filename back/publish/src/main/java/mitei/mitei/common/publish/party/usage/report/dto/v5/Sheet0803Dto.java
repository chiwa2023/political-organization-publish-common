package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 政党交付金使途報告書様式8の3
 */
public class Sheet0803Dto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 支部交付金全合計 */
    @JacksonXmlProperty(localName = "KOUFU0_GK")
    private Long totalShibuKoufuAll = 0L;

    /** 支部交付金合計充当交付金から */
    @JacksonXmlProperty(localName = "KOUFU1_GK")
    private Long totalShibuKoufuJutoKoufukin = 0L;

    /** 支部交付金合計充当政党基金から */
    @JacksonXmlProperty(localName = "KOUFU2_GK")
    private Long totalShibuKoufuJutoMyFunds = 0L;

    /** 支部交付金合計備考 */
    @JacksonXmlProperty(localName = "KOUFU_BIKOU")
    private String totalShibuKoufuBikou;

    /** 人件費全合計 */
    @JacksonXmlProperty(localName = "JINKENHI0_GK")
    private Long totalJinkenhiAll = 0L;

    /** 人件費合計充当交付金から */
    @JacksonXmlProperty(localName = "JINKENHI1_GK")
    private Long totalJinkenhiJutoKoufukin = 0L;

    /** 人件費合計充当政党基金から */
    @JacksonXmlProperty(localName = "JINKENHI2_GK")
    private Long totalJinkenhiJutoMyFunds = 0L;

    /** 人件費備考 */
    @JacksonXmlProperty(localName = "JINKENHI_BIKOU")
    private String totalJinkenhiBikou;

    /** 光熱費全合計 */
    @JacksonXmlProperty(localName = "KOUNETU0_GK")
    private Long totalKounetsuhiAll = 0L;

    /** 光熱費合計充当交付金から */
    @JacksonXmlProperty(localName = "KOUNETU1_GK")
    private Long totalKounetsuhiJutoKoufukin = 0L;

    /** 光熱費合計充当政党基金から */
    @JacksonXmlProperty(localName = "KOUNETU2_GK")
    private Long totalKounetsuhiJutoMyFunds = 0L;

    /** 光熱費備考 */
    @JacksonXmlProperty(localName = "KOUNETU_BIKOU")
    private String totalKounetsuhiBikou;

    /** 備品全合計 */
    @JacksonXmlProperty(localName = "BIHIN0_GK")
    private Long totalBihinAll = 0L;

    /** 備品合計充当交付金から */
    @JacksonXmlProperty(localName = "BIHIN1_GK")
    private Long totalBihinJutoKoufukin = 0L;

    /** 備品合計充当政党基金から */
    @JacksonXmlProperty(localName = "BIHIN2_GK")
    private Long totalBihinJutoMyFunds = 0L;

    /** 備品備考 */
    @JacksonXmlProperty(localName = "BIHIN_BIKOU")
    private String totalBihinBikou;

    /** 事務所全合計 */
    @JacksonXmlProperty(localName = "JIMUSYO0_GK")
    private Long totalJimushoAll = 0L;

    /** 事務所合計充当交付金から */
    @JacksonXmlProperty(localName = "JIMUSYO1_GK")
    private Long totalJimushoJutoKoufukin = 0L;

    /** 事務所合計充当政党基金から */
    @JacksonXmlProperty(localName = "JIMUSYO2_GK")
    private Long totalJimushoJutoMyFunds = 0L;

    /** 事務所備考 */
    @JacksonXmlProperty(localName = "JIMUSYO_BIKOU")
    private String totalJimushoBikou;

    /** 経費全合計 */
    @JacksonXmlProperty(localName = "KEIHI_SKEI0_GK")
    private Long totalKeihiAll = 0L;

    /** 経費合計充当交付金から */
    @JacksonXmlProperty(localName = "KEIHI_SKEI1_GK")
    private Long totalKeihiJutoKoufukin = 0L;

    /** 経費合計充当政党基金から */
    @JacksonXmlProperty(localName = "KEIHI_SKEI2_GK")
    private Long totalKeihiJutoMyFunds = 0L;

    /** 経費備考 */
    @JacksonXmlProperty(localName = "KEIHI_SKEI_BIKOU")
    private String totalKeihiBikou;

    /** 組織全合計 */
    @JacksonXmlProperty(localName = "SOSIKI0_GK")
    private Long totalSoshikiAll = 0L;

    /** 組織合計充当交付金から */
    @JacksonXmlProperty(localName = "SOSIKI1_GK")
    private Long totalSoshikiJutoKoufukin = 0L;

    /** 組織合計充当政党基金から */
    @JacksonXmlProperty(localName = "SOSIKI2_GK")
    private Long totalSoshikiutoMyFunds = 0L;

    /** 組織備考 */
    @JacksonXmlProperty(localName = "SOSIKI_BIKOU")
    private String totalSoshikiBikou;

    /** 選挙全合計 */
    @JacksonXmlProperty(localName = "SENKYO0_GK")
    private Long totalSenkyoAll = 0L;

    /** 選挙合計充当交付金から */
    @JacksonXmlProperty(localName = "SENKYO1_GK")
    private Long totalSenkyoJutoKoufukin = 0L;

    /** 選挙合計充当政党基金から */
    @JacksonXmlProperty(localName = "SENKYO2_GK")
    private Long totalSenkyoJutoMyFunds = 0L;

    /** 選挙備考 */
    @JacksonXmlProperty(localName = "SENKYO_BIKOU")
    private String totalSenkyoBikou;

    /** 事業全般全合計 */
    @JacksonXmlProperty(localName = "SONOTA_JIGYO0_GK")
    private Long totalAllJigyouAll = 0L;

    /** 事業全般合計充当交付金から */
    @JacksonXmlProperty(localName = "SONOTA_JIGYO1_GK")
    private Long totalAllJigyouJutoKoufukin = 0L;

    /** 事業全般合計充当政党基金から */
    @JacksonXmlProperty(localName = "SONOTA_JIGYO2_GK")
    private Long totalAllJigyouJutoMyFunds = 0L;

    /** 事業全般備考 */
    @JacksonXmlProperty(localName = "SONOTA_JIGYO_BIKOU")
    private String totalAllJigyouBikou;

    /** 機関誌発行全合計 */
    @JacksonXmlProperty(localName = "HAKKOU_JIGYO0_GK")
    private Long totalKikanshiAll = 0L;

    /** 機関誌発行合計充当交付金から */
    @JacksonXmlProperty(localName = "HAKKOU_JIGYO1_GK")
    private Long totalKikanshiJutoKoufukin = 0L;

    /** 機関誌発行合計充当政党基金から */
    @JacksonXmlProperty(localName = "HAKKOU_JIGYO2_GK")
    private Long totalKikanshiJutoMyFunds = 0L;

    /** 機関誌発行備考 */
    @JacksonXmlProperty(localName = "HAKKOU_JIGYO_BIKOU")
    private String totalKikanshiBikou;

    /** 宣伝全合計 */
    @JacksonXmlProperty(localName = "SENDEN0_GK")
    private Long totalSendenAll = 0L;

    /** 宣伝合計充当交付金から */
    @JacksonXmlProperty(localName = "SENDEN1_GK")
    private Long totalSendenJutoKoufukin = 0L;

    /** 宣伝金合計充当政党基金から */
    @JacksonXmlProperty(localName = "SENDEN2_GK")
    private Long totalSendenJutoMyFunds = 0L;

    /** 宣伝備考 */
    @JacksonXmlProperty(localName = "SENDEN_BIKOU")
    private String totalSendenBikou;

    /** パーティ全合計 */
    @JacksonXmlProperty(localName = "KAISAI0_GK")
    private Long totalPartyAll = 0L;

    /** パーティ合計充当交付金から */
    @JacksonXmlProperty(localName = "KAISAI1_GK")
    private Long totalPartyJutoKoufukin = 0L;

    /** パーティ合計充当政党基金から */
    @JacksonXmlProperty(localName = "KAISAI2_GK")
    private Long totalPartyJutoMyFunds = 0L;

    /** パーティ備考 */
    @JacksonXmlProperty(localName = "KAISAI_BIKOU")
    private String totalPartyBikou;

    /** その他事業全合計 */
    @JacksonXmlProperty(localName = "SONOTA0_GK")
    private Long totalSonotaJigyouAll = 0L;

    /** その他事業合計充当交付金から */
    @JacksonXmlProperty(localName = "SONOTA1_GK")
    private Long totalSonotaJigyouJutoKoufukin = 0L;

    /** その他事業合計充当政党基金から */
    @JacksonXmlProperty(localName = "SONOTA2_GK")
    private Long totalSonotaJigyouJutoMyFunds = 0L;

    /** その他事業備考 */
    @JacksonXmlProperty(localName = "SONOTA_BIKOU")
    private String totalSonotaJigyouBikou;

    /** 調査全合計 */
    @JacksonXmlProperty(localName = "CYOUSA0_GK")
    private Long totalChousaAll = 0L;

    /** 調査合計充当交付金から */
    @JacksonXmlProperty(localName = "CYOUSA1_GK")
    private Long totaChousaJutoKoufukin = 0L;

    /** 調査合計充当政党基金から */
    @JacksonXmlProperty(localName = "CYOUSA2_GK")
    private Long totalChousaJutoMyFunds = 0L;

    /** 調査備考 */
    @JacksonXmlProperty(localName = "CYOUSA_BIKOU")
    private String totalChousaBikou;

    /** 寄附全合計 */
    @JacksonXmlProperty(localName = "KIFU0_GK")
    private Long totalKifuAll = 0L;

    /** 寄附合計充当交付金から */
    @JacksonXmlProperty(localName = "KIFU1_GK")
    private Long totalKifuJutoKoufukin = 0L;

    /** 寄附合計充当政党基金から */
    @JacksonXmlProperty(localName = "KIFU2_GK")
    private Long totalKifuJutoMyFunds = 0L;

    /** 寄附備考 */
    @JacksonXmlProperty(localName = "KIFU_BIKOU")
    private String totalKifuBikou;

    /** その他経費全合計 */
    @JacksonXmlProperty(localName = "SONOTA_KEIHI0_GK")
    private Long totalSonotaKeihiAll = 0L;

    /** その他経費合計充当交付金から */
    @JacksonXmlProperty(localName = "SONOTA_KEIHI1_GK")
    private Long totalSonotaKeihiJutoKoufukin = 0L;

    /** その他経費合計充当政党基金から */
    @JacksonXmlProperty(localName = "SONOTA_KEIHI2_GK")
    private Long totalSonotaKeihiJutoMyFunds = 0L;

    /** その他経費備考 */
    @JacksonXmlProperty(localName = "SONOTA_KEIHI_BIKOU")
    private String totalSonotaKeihiBikou;

    /** 活動カテゴリ全合計 */
    @JacksonXmlProperty(localName = "KATUDOU_SKEI0_GK")
    private Long totalAllActionAll = 0L;

    /** 活動カテゴリ合計充当交付金から */
    @JacksonXmlProperty(localName = "KATUDOU_SKEI1_GK")
    private Long totalAllActionJutoKoufukin = 0L;

    /** 活動カテゴリ合計充当政党基金から */
    @JacksonXmlProperty(localName = "KATUDOU_SKEI2_GK")
    private Long totalAllActionJutoMyFunds = 0L;

    /** 活動カテゴリ備考 */
    @JacksonXmlProperty(localName = "KATUDOU_SKEI_BIKOU")
    private String totalAllActionBikou;

    /** 全合計全合計 */
    @JacksonXmlProperty(localName = "GKEI0_GK")
    private Long totalAllAmountAll = 0L;

    /** 全合計充当交付金から */
    @JacksonXmlProperty(localName = "GKEI1_GK")
    private Long totalAllAmountJutoKoufukin = 0L;

    /** 全合計合計充当政党基金から */
    @JacksonXmlProperty(localName = "GKEI2_GK")
    private Long totalAllAmountJutoMyFunds = 0L;

    /** 全合計備考 */
    @JacksonXmlProperty(localName = "GKEI_BIKOU")
    private String totalAllAmountBikou;

    /**
     * 支部交付金全合計を取得する
     *
     * @return 支部交付金全合計
     */
    public Long getTotalShibuKoufuAll() {
        return totalShibuKoufuAll;
    }

    /**
     * 支部交付金全合計を設定する
     *
     * @param totalShibuKoufuAll 支部交付金全合計
     */
    public void setTotalShibuKoufuAll(final Long totalShibuKoufuAll) {
        this.totalShibuKoufuAll = totalShibuKoufuAll;
    }

    /**
     * 支部交付金合計充当交付金からを取得する
     *
     * @return 支部交付金合計充当交付金から
     */
    public Long getTotalShibuKoufuJutoKoufukin() {
        return totalShibuKoufuJutoKoufukin;
    }

    /**
     * 支部交付金合計充当交付金からを設定する
     *
     * @param totalShibuKoufuJutoKoufukin 支部交付金合計充当交付金から
     */
    public void setTotalShibuKoufuJutoKoufukin(final Long totalShibuKoufuJutoKoufukin) {
        this.totalShibuKoufuJutoKoufukin = totalShibuKoufuJutoKoufukin;
    }

    /**
     * 支部交付金合計充当政党基金からを取得する
     *
     * @return 支部交付金合計充当政党基金から
     */
    public Long getTotalShibuKoufuJutoMyFunds() {
        return totalShibuKoufuJutoMyFunds;
    }

    /**
     * 支部交付金合計充当政党基金からを設定する
     *
     * @param totalShibuKoufuJutoMyFunds 支部交付金合計充当政党基金から
     */
    public void setTotalShibuKoufuJutoMyFunds(final Long totalShibuKoufuJutoMyFunds) {
        this.totalShibuKoufuJutoMyFunds = totalShibuKoufuJutoMyFunds;
    }

    /**
     * 支部交付金合計備考を取得する
     *
     * @return 支部交付金合計備考
     */
    public String getTotalShibuKoufuBikou() {
        return totalShibuKoufuBikou;
    }

    /**
     * 支部交付金合計備考を設定する
     *
     * @param totalShibuKoufuBikou 支部交付金合計備考
     */
    public void setTotalShibuKoufuBikou(final String totalShibuKoufuBikou) {
        this.totalShibuKoufuBikou = totalShibuKoufuBikou;
    }

    /**
     * 人件費全合計を取得する
     *
     * @return 人件費全合計
     */
    public Long getTotalJinkenhiAll() {
        return totalJinkenhiAll;
    }

    /**
     * 人件費全合計を設定する
     *
     * @param totalJinkenhiAll 人件費全合計
     */
    public void setTotalJinkenhiAll(final Long totalJinkenhiAll) {
        this.totalJinkenhiAll = totalJinkenhiAll;
    }

    /**
     * 人件費合計充当交付金からを取得する
     *
     * @return 人件費合計充当交付金から
     */
    public Long getTotalJinkenhiJutoKoufukin() {
        return totalJinkenhiJutoKoufukin;
    }

    /**
     * 人件費合計充当交付金からを設定する
     *
     * @param totalJinkenhiJutoKoufukin 人件費合計充当交付金から
     */
    public void setTotalJinkenhiJutoKoufukin(final Long totalJinkenhiJutoKoufukin) {
        this.totalJinkenhiJutoKoufukin = totalJinkenhiJutoKoufukin;
    }

    /**
     * 人件費合計充当政党基金からを取得する
     *
     * @return 人件費合計充当政党基金から
     */
    public Long getTotalJinkenhiJutoMyFunds() {
        return totalJinkenhiJutoMyFunds;
    }

    /**
     * 人件費合計充当政党基金からを設定する
     *
     * @param totalJinkenhiJutoMyFunds 人件費合計充当政党基金から
     */
    public void setTotalJinkenhiJutoMyFunds(final Long totalJinkenhiJutoMyFunds) {
        this.totalJinkenhiJutoMyFunds = totalJinkenhiJutoMyFunds;
    }

    /**
     * 人件費備考を取得する
     *
     * @return 人件費備考
     */
    public String getTotalJinkenhiBikou() {
        return totalJinkenhiBikou;
    }

    /**
     * 人件費備考を設定する
     *
     * @param totalJinkenhiBikou 人件費備考
     */
    public void setTotalJinkenhiBikou(final String totalJinkenhiBikou) {
        this.totalJinkenhiBikou = totalJinkenhiBikou;
    }

    /**
     * 光熱費全合計を取得する
     *
     * @return 光熱費全合計
     */
    public Long getTotalKounetsuhiAll() {
        return totalKounetsuhiAll;
    }

    /**
     * 光熱費全合計を設定する
     *
     * @param totalKounetsuhiAll 光熱費全合計
     */
    public void setTotalKounetsuhiAll(final Long totalKounetsuhiAll) {
        this.totalKounetsuhiAll = totalKounetsuhiAll;
    }

    /**
     * 光熱費合計充当交付金からを取得する
     *
     * @return 光熱費合計充当交付金から
     */
    public Long getTotalKounetsuhiJutoKoufukin() {
        return totalKounetsuhiJutoKoufukin;
    }

    /**
     * 光熱費合計充当交付金からを設定する
     *
     * @param totalKounetsuhiJutoKoufukin 光熱費合計充当交付金から
     */
    public void setTotalKounetsuhiJutoKoufukin(final Long totalKounetsuhiJutoKoufukin) {
        this.totalKounetsuhiJutoKoufukin = totalKounetsuhiJutoKoufukin;
    }

    /**
     * 光熱費合計充当政党基金からを取得する
     *
     * @return 光熱費合計充当政党基金から
     */
    public Long getTotalKounetsuhiJutoMyFunds() {
        return totalKounetsuhiJutoMyFunds;
    }

    /**
     * 光熱費合計充当政党基金からを設定する
     *
     * @param totalKounetsuhiJutoMyFunds 光熱費合計充当政党基金から
     */
    public void setTotalKounetsuhiJutoMyFunds(final Long totalKounetsuhiJutoMyFunds) {
        this.totalKounetsuhiJutoMyFunds = totalKounetsuhiJutoMyFunds;
    }

    /**
     * 光熱費備考を取得する
     *
     * @return 光熱費備考
     */
    public String getTotalKounetsuhiBikou() {
        return totalKounetsuhiBikou;
    }

    /**
     * 光熱費備考を設定する
     *
     * @param totalKounetsuhiBikou 光熱費備考
     */
    public void setTotalKounetsuhiBikou(final String totalKounetsuhiBikou) {
        this.totalKounetsuhiBikou = totalKounetsuhiBikou;
    }

    /**
     * 備品全合計を取得する
     *
     * @return 備品全合計
     */
    public Long getTotalBihinAll() {
        return totalBihinAll;
    }

    /**
     * 備品全合計を設定する
     *
     * @param totalBihinAll 備品全合計
     */
    public void setTotalBihinAll(final Long totalBihinAll) {
        this.totalBihinAll = totalBihinAll;
    }

    /**
     * 備品合計充当交付金からを取得する
     *
     * @return 備品合計充当交付金から
     */
    public Long getTotalBihinJutoKoufukin() {
        return totalBihinJutoKoufukin;
    }

    /**
     * 備品合計充当交付金からを設定する
     *
     * @param totalBihinJutoKoufukin 備品合計充当交付金から
     */
    public void setTotalBihinJutoKoufukin(final Long totalBihinJutoKoufukin) {
        this.totalBihinJutoKoufukin = totalBihinJutoKoufukin;
    }

    /**
     * 備品合計充当政党基金からを取得する
     *
     * @return 備品合計充当政党基金から
     */
    public Long getTotalBihinJutoMyFunds() {
        return totalBihinJutoMyFunds;
    }

    /**
     * 備品合計充当政党基金からを設定する
     *
     * @param totalBihinJutoMyFunds 備品合計充当政党基金から
     */
    public void setTotalBihinJutoMyFunds(final Long totalBihinJutoMyFunds) {
        this.totalBihinJutoMyFunds = totalBihinJutoMyFunds;
    }

    /**
     * 備品備考を取得する
     *
     * @return 備品備考
     */
    public String getTotalBihinBikou() {
        return totalBihinBikou;
    }

    /**
     * 備品備考を設定する
     *
     * @param totalBihinBikou 備品備考
     */
    public void setTotalBihinBikou(final String totalBihinBikou) {
        this.totalBihinBikou = totalBihinBikou;
    }

    /**
     * 事務所全合計を取得する
     *
     * @return 事務所全合計
     */
    public Long getTotalJimushoAll() {
        return totalJimushoAll;
    }

    /**
     * 事務所全合計を設定する
     *
     * @param totalJimushoAll 事務所全合計
     */
    public void setTotalJimushoAll(final Long totalJimushoAll) {
        this.totalJimushoAll = totalJimushoAll;
    }

    /**
     * 事務所合計充当交付金からを取得する
     *
     * @return 事務所合計充当交付金から
     */
    public Long getTotalJimushoJutoKoufukin() {
        return totalJimushoJutoKoufukin;
    }

    /**
     * 事務所合計充当交付金からを設定する
     *
     * @param totalJimushoJutoKoufukin 事務所合計充当交付金から
     */
    public void setTotalJimushoJutoKoufukin(final Long totalJimushoJutoKoufukin) {
        this.totalJimushoJutoKoufukin = totalJimushoJutoKoufukin;
    }

    /**
     * 事務所合計充当政党基金からを取得する
     *
     * @return 事務所合計充当政党基金から
     */
    public Long getTotalJimushoJutoMyFunds() {
        return totalJimushoJutoMyFunds;
    }

    /**
     * 事務所合計充当政党基金からを設定する
     *
     * @param totalJimushoJutoMyFunds 事務所合計充当政党基金から
     */
    public void setTotalJimushoJutoMyFunds(final Long totalJimushoJutoMyFunds) {
        this.totalJimushoJutoMyFunds = totalJimushoJutoMyFunds;
    }

    /**
     * 事務所備考を取得する
     *
     * @return 事務所備考
     */
    public String getTotalJimushoBikou() {
        return totalJimushoBikou;
    }

    /**
     * 事務所備考を設定する
     *
     * @param totalJimushoBikou 事務所備考
     */
    public void setTotalJimushoBikou(final String totalJimushoBikou) {
        this.totalJimushoBikou = totalJimushoBikou;
    }

    /**
     * 経費全合計を取得する
     *
     * @return 経費全合計
     */
    public Long getTotalKeihiAll() {
        return totalKeihiAll;
    }

    /**
     * 経費全合計を設定する
     *
     * @param totalKeihiAll 経費全合計
     */
    public void setTotalKeihiAll(final Long totalKeihiAll) {
        this.totalKeihiAll = totalKeihiAll;
    }

    /**
     * 経費合計充当交付金からを取得する
     *
     * @return 経費合計充当交付金から
     */
    public Long getTotalKeihiJutoKoufukin() {
        return totalKeihiJutoKoufukin;
    }

    /**
     * 経費合計充当交付金からを設定する
     *
     * @param totalKeihiJutoKoufukin 経費合計充当交付金から
     */
    public void setTotalKeihiJutoKoufukin(final Long totalKeihiJutoKoufukin) {
        this.totalKeihiJutoKoufukin = totalKeihiJutoKoufukin;
    }

    /**
     * 経費合計充当政党基金からを取得する
     *
     * @return 経費合計充当政党基金から
     */
    public Long getTotalKeihiJutoMyFunds() {
        return totalKeihiJutoMyFunds;
    }

    /**
     * 経費合計充当政党基金からを設定する
     *
     * @param totalKeihiJutoMyFunds 経費合計充当政党基金から
     */
    public void setTotalKeihiJutoMyFunds(final Long totalKeihiJutoMyFunds) {
        this.totalKeihiJutoMyFunds = totalKeihiJutoMyFunds;
    }

    /**
     * 経費備考を取得する
     *
     * @return 経費備考
     */
    public String getTotalKeihiBikou() {
        return totalKeihiBikou;
    }

    /**
     * 経費備考を設定する
     *
     * @param totalKeihiBikou 経費備考
     */
    public void setTotalKeihiBikou(final String totalKeihiBikou) {
        this.totalKeihiBikou = totalKeihiBikou;
    }

    /**
     * 組織全合計を取得する
     *
     * @return 組織全合計
     */
    public Long getTotalSoshikiAll() {
        return totalSoshikiAll;
    }

    /**
     * 組織全合計を設定する
     *
     * @param totalSoshikiAll 組織全合計
     */
    public void setTotalSoshikiAll(final Long totalSoshikiAll) {
        this.totalSoshikiAll = totalSoshikiAll;
    }

    /**
     * 組織合計充当交付金からを取得する
     *
     * @return 組織合計充当交付金から
     */
    public Long getTotalSoshikiJutoKoufukin() {
        return totalSoshikiJutoKoufukin;
    }

    /**
     * 組織合計充当交付金からを設定する
     *
     * @param totalSoshikiJutoKoufukin 組織合計充当交付金から
     */
    public void setTotalSoshikiJutoKoufukin(final Long totalSoshikiJutoKoufukin) {
        this.totalSoshikiJutoKoufukin = totalSoshikiJutoKoufukin;
    }

    /**
     * 組織合計充当政党基金からを取得する
     *
     * @return 組織合計充当政党基金から
     */
    public Long getTotalSoshikiutoMyFunds() {
        return totalSoshikiutoMyFunds;
    }

    /**
     * 組織合計充当政党基金からを設定する
     *
     * @param totalSoshikiutoMyFunds 組織合計充当政党基金から
     */
    public void setTotalSoshikiutoMyFunds(final Long totalSoshikiutoMyFunds) {
        this.totalSoshikiutoMyFunds = totalSoshikiutoMyFunds;
    }

    /**
     * 組織備考を取得する
     *
     * @return 組織備考
     */
    public String getTotalSoshikiBikou() {
        return totalSoshikiBikou;
    }

    /**
     * 組織備考を設定する
     *
     * @param totalSoshikiBikou 組織備考
     */
    public void setTotalSoshikiBikou(final String totalSoshikiBikou) {
        this.totalSoshikiBikou = totalSoshikiBikou;
    }

    /**
     * 選挙全合計を取得する
     *
     * @return 選挙全合計
     */
    public Long getTotalSenkyoAll() {
        return totalSenkyoAll;
    }

    /**
     * 選挙全合計を設定する
     *
     * @param totalSenkyoAll 選挙全合計
     */
    public void setTotalSenkyoAll(final Long totalSenkyoAll) {
        this.totalSenkyoAll = totalSenkyoAll;
    }

    /**
     * 選挙合計充当交付金からを取得する
     *
     * @return 選挙合計充当交付金から
     */
    public Long getTotalSenkyoJutoKoufukin() {
        return totalSenkyoJutoKoufukin;
    }

    /**
     * 選挙合計充当交付金からを設定する
     *
     * @param totalSenkyoJutoKoufukin 選挙合計充当交付金から
     */
    public void setTotalSenkyoJutoKoufukin(final Long totalSenkyoJutoKoufukin) {
        this.totalSenkyoJutoKoufukin = totalSenkyoJutoKoufukin;
    }

    /**
     * 選挙合計充当政党基金からを取得する
     *
     * @return 選挙合計充当政党基金から
     */
    public Long getTotalSenkyoJutoMyFunds() {
        return totalSenkyoJutoMyFunds;
    }

    /**
     * 選挙合計充当政党基金からを設定する
     *
     * @param totalSenkyoJutoMyFunds 選挙合計充当政党基金から
     */
    public void setTotalSenkyoJutoMyFunds(final Long totalSenkyoJutoMyFunds) {
        this.totalSenkyoJutoMyFunds = totalSenkyoJutoMyFunds;
    }

    /**
     * 選挙備考を取得する
     *
     * @return 選挙備考
     */
    public String getTotalSenkyoBikou() {
        return totalSenkyoBikou;
    }

    /**
     * 選挙備考を設定する
     *
     * @param totalSenkyoBikou 選挙備考
     */
    public void setTotalSenkyoBikou(final String totalSenkyoBikou) {
        this.totalSenkyoBikou = totalSenkyoBikou;
    }

    /**
     * 事業全般全合計を取得する
     *
     * @return 事業全般全合計
     */
    public Long getTotalAllJigyouAll() {
        return totalAllJigyouAll;
    }

    /**
     * 事業全般全合計を設定する
     *
     * @param totalAllJigyouAll 事業全般全合計
     */
    public void setTotalAllJigyouAll(final Long totalAllJigyouAll) {
        this.totalAllJigyouAll = totalAllJigyouAll;
    }

    /**
     * 事業全般合計充当交付金から を取得する
     *
     * @return 事業全般合計充当交付金から
     */
    public Long getTotalAllJigyouJutoKoufukin() {
        return totalAllJigyouJutoKoufukin;
    }

    /**
     * 事業全般合計充当交付金から を設定する
     *
     * @param totalAllJigyouJutoKoufukin 事業全般合計充当交付金から
     */
    public void setTotalAllJigyouJutoKoufukin(final Long totalAllJigyouJutoKoufukin) {
        this.totalAllJigyouJutoKoufukin = totalAllJigyouJutoKoufukin;
    }

    /**
     * 事業全般合計充当政党基金からを取得する
     *
     * @return 事業全般合計充当政党基金から
     */
    public Long getTotalAllJigyouJutoMyFunds() {
        return totalAllJigyouJutoMyFunds;
    }

    /**
     * 事業全般合計充当政党基金からを設定する
     *
     * @param totalAllJigyouJutoMyFunds 事業全般合計充当政党基金から
     */
    public void setTotalAllJigyouJutoMyFunds(final Long totalAllJigyouJutoMyFunds) {
        this.totalAllJigyouJutoMyFunds = totalAllJigyouJutoMyFunds;
    }

    /**
     * 事業全般備考を取得する
     *
     * @return 事業全般備考
     */
    public String getTotalAllJigyouBikou() {
        return totalAllJigyouBikou;
    }

    /**
     * 事業全般備考を設定する
     *
     * @param totalAllJigyouBikou 事業全般備考
     */
    public void setTotalAllJigyouBikou(final String totalAllJigyouBikou) {
        this.totalAllJigyouBikou = totalAllJigyouBikou;
    }

    /**
     * 機関誌発行全合計を取得する
     *
     * @return 機関誌発行全合計
     */
    public Long getTotalKikanshiAll() {
        return totalKikanshiAll;
    }

    /**
     * 機関誌発行全合計を設定する
     *
     * @param totalKikanshiAll 機関誌発行全合計
     */
    public void setTotalKikanshiAll(final Long totalKikanshiAll) {
        this.totalKikanshiAll = totalKikanshiAll;
    }

    /**
     * 機関誌発行合計充当交付金から を取得する
     *
     * @return 機関誌発行合計充当交付金から
     */
    public Long getTotalKikanshiJutoKoufukin() {
        return totalKikanshiJutoKoufukin;
    }

    /**
     * 機関誌発行合計充当交付金から を設定する
     *
     * @param totalKikanshiJutoKoufukin 機関誌発行合計充当交付金から
     */
    public void setTotalKikanshiJutoKoufukin(final Long totalKikanshiJutoKoufukin) {
        this.totalKikanshiJutoKoufukin = totalKikanshiJutoKoufukin;
    }

    /**
     * 機関誌発行合計充当政党基金からを取得する
     *
     * @return 機関誌発行合計充当政党基金から
     */
    public Long getTotalKikanshiJutoMyFunds() {
        return totalKikanshiJutoMyFunds;
    }

    /**
     * 機関誌発行合計充当政党基金からを設定する
     *
     * @param totalKikanshiJutoMyFunds 機関誌発行合計充当政党基金から
     */
    public void setTotalKikanshiJutoMyFunds(final Long totalKikanshiJutoMyFunds) {
        this.totalKikanshiJutoMyFunds = totalKikanshiJutoMyFunds;
    }

    /**
     * 機関誌発行備考を取得する
     *
     * @return 機関誌発行備考
     */
    public String getTotalKikanshiBikou() {
        return totalKikanshiBikou;
    }

    /**
     * 機関誌発行備考を設定する
     *
     * @param totalKikanshiBikou 機関誌発行備考
     */
    public void setTotalKikanshiBikou(final String totalKikanshiBikou) {
        this.totalKikanshiBikou = totalKikanshiBikou;
    }

    /**
     * 宣伝全合計 を取得する
     *
     * @return 宣伝全合計
     */
    public Long getTotalSendenAll() {
        return totalSendenAll;
    }

    /**
     * 宣伝全合計 からを設定する
     *
     * @param totalSendenAll 宣伝全合計
     */
    public void setTotalSendenAll(final Long totalSendenAll) {
        this.totalSendenAll = totalSendenAll;
    }

    /**
     * 宣伝合計充当交付金からを取得する
     *
     * @return 宣伝合計充当交付金から
     */
    public Long getTotalSendenJutoKoufukin() {
        return totalSendenJutoKoufukin;
    }

    /**
     * 宣伝合計充当交付金からを設定する
     *
     * @param totalSendenJutoKoufukin 宣伝合計充当交付金
     */
    public void setTotalSendenJutoKoufukin(final Long totalSendenJutoKoufukin) {
        this.totalSendenJutoKoufukin = totalSendenJutoKoufukin;
    }

    /**
     * 宣伝金合計充当政党基金からを取得する
     *
     * @return 宣伝金合計充当政党基金から
     */
    public Long getTotalSendenJutoMyFunds() {
        return totalSendenJutoMyFunds;
    }

    /**
     * 宣伝金合計充当政党基金からを設定する
     *
     * @param totalSendenJutoMyFunds 宣伝金合計充当政党基金から
     */
    public void setTotalSendenJutoMyFunds(final Long totalSendenJutoMyFunds) {
        this.totalSendenJutoMyFunds = totalSendenJutoMyFunds;
    }

    /**
     * 宣伝備考を取得する
     *
     * @return 宣伝備考
     */
    public String getTotalSendenBikou() {
        return totalSendenBikou;
    }

    /**
     * 宣伝備考を設定する
     *
     * @param totalSendenBikou 宣伝備考
     */
    public void setTotalSendenBikou(final String totalSendenBikou) {
        this.totalSendenBikou = totalSendenBikou;
    }

    /**
     * パーティ全合計を取得する
     *
     * @return パーティ全合計
     */
    public Long getTotalPartyAll() {
        return totalPartyAll;
    }

    /**
     * パーティ全合計を設定する
     *
     * @param totalPartyAll パーティ全合計
     */
    public void setTotalPartyAll(final Long totalPartyAll) {
        this.totalPartyAll = totalPartyAll;
    }

    /**
     * パーティ合計充当交付金からを取得する
     *
     * @return パーティ合計充当交付金から
     */
    public Long getTotalPartyJutoKoufukin() {
        return totalPartyJutoKoufukin;
    }

    /**
     * パーティ合計充当交付金からを設定する
     *
     * @param totalPartyJutoKoufukin パーティ合計充当交付金から
     */
    public void setTotalPartyJutoKoufukin(final Long totalPartyJutoKoufukin) {
        this.totalPartyJutoKoufukin = totalPartyJutoKoufukin;
    }

    /**
     * パーティ合計充当政党基金からを取得する
     *
     * @return パーティ合計充当政党基金から
     */
    public Long getTotalPartyJutoMyFunds() {
        return totalPartyJutoMyFunds;
    }

    /**
     * パーティ合計充当政党基金からを設定する
     *
     * @param totalPartyJutoMyFunds パーティ合計充当政党基金から
     */
    public void setTotalPartyJutoMyFunds(final Long totalPartyJutoMyFunds) {
        this.totalPartyJutoMyFunds = totalPartyJutoMyFunds;
    }

    /**
     * パーティ備考を取得する
     *
     * @return パーティ備考
     */
    public String getTotalPartyBikou() {
        return totalPartyBikou;
    }

    /**
     * パーティ備考を設定する
     *
     * @param totalPartyBikou パーティ備考
     */
    public void setTotalPartyBikou(final String totalPartyBikou) {
        this.totalPartyBikou = totalPartyBikou;
    }

    /**
     * その他事業全合計を取得する
     *
     * @return その他事業全合計
     */
    public Long getTotalSonotaJigyouAll() {
        return totalSonotaJigyouAll;
    }

    /**
     * その他事業全合計を設定する
     *
     * @param totalSonotaJigyouAll その他事業全合計
     */
    public void setTotalSonotaJigyouAll(final Long totalSonotaJigyouAll) {
        this.totalSonotaJigyouAll = totalSonotaJigyouAll;
    }

    /**
     * その他事業合計充当交付金からを取得する
     *
     * @return その他事業合計充当交付金から
     */
    public Long getTotalSonotaJigyouJutoKoufukin() {
        return totalSonotaJigyouJutoKoufukin;
    }

    /**
     * その他事業合計充当交付金からを設定する
     *
     * @param totalSonotaJigyouJutoKoufukin その他事業合計充当交付金から
     */
    public void setTotalSonotaJigyouJutoKoufukin(final Long totalSonotaJigyouJutoKoufukin) {
        this.totalSonotaJigyouJutoKoufukin = totalSonotaJigyouJutoKoufukin;
    }

    /**
     * その他事業合計充当政党基金からを取得する
     *
     * @return その他事業合計充当政党基金から
     */
    public Long getTotalSonotaJigyouJutoMyFunds() {
        return totalSonotaJigyouJutoMyFunds;
    }

    /**
     * その他事業合計充当政党基金からを設定する
     *
     * @param totalSonotaJigyouJutoMyFunds その他事業合計充当政党基金から
     */
    public void setTotalSonotaJigyouJutoMyFunds(final Long totalSonotaJigyouJutoMyFunds) {
        this.totalSonotaJigyouJutoMyFunds = totalSonotaJigyouJutoMyFunds;
    }

    /**
     * その他事業備考を取得する
     *
     * @return その他事業備考
     */
    public String getTotalSonotaJigyouBikou() {
        return totalSonotaJigyouBikou;
    }

    /**
     * その他事業備考を設定する
     *
     * @param totalSonotaJigyouBikou その他事業備考
     */
    public void setTotalSonotaJigyouBikou(final String totalSonotaJigyouBikou) {
        this.totalSonotaJigyouBikou = totalSonotaJigyouBikou;
    }

    /**
     * 調査全合計を取得する
     *
     * @return 調査全合計
     */
    public Long getTotalChousaAll() {
        return totalChousaAll;
    }

    /**
     * 調査全合計を設定する
     *
     * @param totalChousaAll 調査全合計
     */
    public void setTotalChousaAll(final Long totalChousaAll) {
        this.totalChousaAll = totalChousaAll;
    }

    /**
     * 調査合計充当交付金からを取得する
     *
     * @return 調査合計充当交付金から
     */
    public Long getTotaChousaJutoKoufukin() {
        return totaChousaJutoKoufukin;
    }

    /**
     * 調査合計充当交付金からを設定する
     *
     * @param totaChousaJutoKoufukin 調査合計充当交付金から
     */
    public void setTotaChousaJutoKoufukin(final Long totaChousaJutoKoufukin) {
        this.totaChousaJutoKoufukin = totaChousaJutoKoufukin;
    }

    /**
     * 調査合計充当政党基金からを取得する
     *
     * @return 調査合計充当政党基金から
     */
    public Long getTotalChousaJutoMyFunds() {
        return totalChousaJutoMyFunds;
    }

    /**
     * 調査合計充当政党基金からを設定する
     *
     * @param totalChousaJutoMyFunds 調査合計充当政党基金から
     */
    public void setTotalChousaJutoMyFunds(final Long totalChousaJutoMyFunds) {
        this.totalChousaJutoMyFunds = totalChousaJutoMyFunds;
    }

    /**
     * 調査備考を取得する
     *
     * @return 調査備考
     */
    public String getTotalChousaBikou() {
        return totalChousaBikou;
    }

    /**
     * 調査備考を設定する
     *
     * @param totalChousaBikou 調査備考
     */
    public void setTotalChousaBikou(final String totalChousaBikou) {
        this.totalChousaBikou = totalChousaBikou;
    }

    /**
     * 寄附全合計を取得する
     *
     * @return 寄附全合計
     */
    public Long getTotalKifuAll() {
        return totalKifuAll;
    }

    /**
     * 寄附全合計を設定する
     *
     * @param totalKifuAll 寄附全合計
     */
    public void setTotalKifuAll(final Long totalKifuAll) {
        this.totalKifuAll = totalKifuAll;
    }

    /**
     * 寄附合計充当交付金からを取得する
     *
     * @return 寄附合計充当交付金から
     */
    public Long getTotalKifuJutoKoufukin() {
        return totalKifuJutoKoufukin;
    }

    /**
     * 寄附合計充当交付金からを設定する
     *
     * @param totalKifuJutoKoufukin 寄附合計充当交付金から
     */
    public void setTotalKifuJutoKoufukin(final Long totalKifuJutoKoufukin) {
        this.totalKifuJutoKoufukin = totalKifuJutoKoufukin;
    }

    /**
     * 寄附合計充当政党基金からを取得する
     *
     * @return 寄附合計充当政党基金から
     */
    public Long getTotalKifuJutoMyFunds() {
        return totalKifuJutoMyFunds;
    }

    /**
     * 寄附合計充当政党基金からを設定する
     *
     * @param totalKifuJutoMyFunds 寄附合計充当政党基金から
     */
    public void setTotalKifuJutoMyFunds(final Long totalKifuJutoMyFunds) {
        this.totalKifuJutoMyFunds = totalKifuJutoMyFunds;
    }

    /**
     * 寄附備考を取得する
     *
     * @return 寄附備考
     */
    public String getTotalKifuBikou() {
        return totalKifuBikou;
    }

    /**
     * 寄附備考を設定する
     *
     * @param totalKifuBikou 寄附備考
     */
    public void setTotalKifuBikou(final String totalKifuBikou) {
        this.totalKifuBikou = totalKifuBikou;
    }

    /**
     * その他経費全合計を取得する
     *
     * @return その他経費全合計
     */
    public Long getTotalSonotaKeihiAll() {
        return totalSonotaKeihiAll;
    }

    /**
     * その他経費全合計を設定する
     *
     * @param totalSonotaKeihiAll その他経費全合計
     */
    public void setTotalSonotaKeihiAll(final Long totalSonotaKeihiAll) {
        this.totalSonotaKeihiAll = totalSonotaKeihiAll;
    }

    /**
     * その他経費合計充当交付金からを取得する
     *
     * @return その他経費合計充当交付金から
     */
    public Long getTotalSonotaKeihiJutoKoufukin() {
        return totalSonotaKeihiJutoKoufukin;
    }

    /**
     * その他経費合計充当交付金からを設定する
     *
     * @param totalSonotaKeihiJutoKoufukin その他経費合計充当交付金から
     */
    public void setTotalSonotaKeihiJutoKoufukin(final Long totalSonotaKeihiJutoKoufukin) {
        this.totalSonotaKeihiJutoKoufukin = totalSonotaKeihiJutoKoufukin;
    }

    /**
     * その他経費合計充当政党基金からを取得する
     *
     * @return その他経費合計充当政党基金から
     */
    public Long getTotalSonotaKeihiJutoMyFunds() {
        return totalSonotaKeihiJutoMyFunds;
    }

    /**
     * その他経費合計充当政党基金からを設定する
     *
     * @param totalSonotaKeihiJutoMyFunds その他経費合計充当政党基金から
     */
    public void setTotalSonotaKeihiJutoMyFunds(final Long totalSonotaKeihiJutoMyFunds) {
        this.totalSonotaKeihiJutoMyFunds = totalSonotaKeihiJutoMyFunds;
    }

    /**
     * その他経費備考を取得する
     *
     * @return その他経費備考
     */
    public String getTotalSonotaKeihiBikou() {
        return totalSonotaKeihiBikou;
    }

    /**
     * その他経費備考を設定する
     *
     * @param totalSonotaKeihiBikou その他経費備考
     */
    public void setTotalSonotaKeihiBikou(final String totalSonotaKeihiBikou) {
        this.totalSonotaKeihiBikou = totalSonotaKeihiBikou;
    }

    /**
     * 活動カテゴリ全合計を取得する
     *
     * @return 活動カテゴリ全合計
     */
    public Long getTotalAllActionAll() {
        return totalAllActionAll;
    }

    /**
     * 活動カテゴリ全合計を設定する
     *
     * @param totalAllActionAll 活動カテゴリ全合計
     */
    public void setTotalAllActionAll(final Long totalAllActionAll) {
        this.totalAllActionAll = totalAllActionAll;
    }

    /**
     * 活動カテゴリ合計充当交付金からを取得する
     *
     * @return 活動カテゴリ合計充当交付金から
     */
    public Long getTotalAllActionJutoKoufukin() {
        return totalAllActionJutoKoufukin;
    }

    /**
     * 活動カテゴリ合計充当交付金からを設定する
     *
     * @param totalAllActionJutoKoufukin 活動カテゴリ合計充当交付金から
     */
    public void setTotalAllActionJutoKoufukin(final Long totalAllActionJutoKoufukin) {
        this.totalAllActionJutoKoufukin = totalAllActionJutoKoufukin;
    }

    /**
     * 活動カテゴリ合計充当政党基金からを取得する
     *
     * @return 活動カテゴリ合計充当政党基金から
     */
    public Long getTotalAllActionJutoMyFunds() {
        return totalAllActionJutoMyFunds;
    }

    /**
     * 活動カテゴリ合計充当政党基金からを設定する
     *
     * @param totalAllActionJutoMyFunds 活動カテゴリ合計充当政党基金から
     */
    public void setTotalAllActionJutoMyFunds(final Long totalAllActionJutoMyFunds) {
        this.totalAllActionJutoMyFunds = totalAllActionJutoMyFunds;
    }

    /**
     * 活動カテゴリ備考を取得する
     *
     * @return 活動カテゴリ備考
     */
    public String getTotalAllActionBikou() {
        return totalAllActionBikou;
    }

    /**
     * 活動カテゴリ備考を設定する
     *
     * @param totalAllActionBikou 活動カテゴリ備考
     */
    public void setTotalAllActionBikou(final String totalAllActionBikou) {
        this.totalAllActionBikou = totalAllActionBikou;
    }

    /**
     * 全合計全合計を取得する
     *
     * @return 全合計全合計
     */
    public Long getTotalAllAmountAll() {
        return totalAllAmountAll;
    }

    /**
     * 全合計全合計を設定する
     *
     * @param totalAllAmountAll 全合計全合計
     */
    public void setTotalAllAmountAll(final Long totalAllAmountAll) {
        this.totalAllAmountAll = totalAllAmountAll;
    }

    /**
     * 全合計充当交付金からを取得する
     *
     * @return 全合計充当交付金から
     */
    public Long getTotalAllAmountJutoKoufukin() {
        return totalAllAmountJutoKoufukin;
    }

    /**
     * 全合計充当交付金からを設定する
     *
     * @param totalAllAmountJutoKoufukin 全合計充当交付金から
     */
    public void setTotalAllAmountJutoKoufukin(final Long totalAllAmountJutoKoufukin) {
        this.totalAllAmountJutoKoufukin = totalAllAmountJutoKoufukin;
    }

    /**
     * 全合計合計充当政党基金からを取得する
     *
     * @return 全合計合計充当政党基金から
     */
    public Long getTotalAllAmountJutoMyFunds() {
        return totalAllAmountJutoMyFunds;
    }

    /**
     * 全合計合計充当政党基金からを設定する
     *
     * @param totalAllAmountJutoMyFunds 全合計合計充当政党基金から
     */
    public void setTotalAllAmountJutoMyFunds(final Long totalAllAmountJutoMyFunds) {
        this.totalAllAmountJutoMyFunds = totalAllAmountJutoMyFunds;
    }

    /**
     * 全合計備考を取得する
     *
     * @return 全合計備考
     */
    public String getTotalAllAmountBikou() {
        return totalAllAmountBikou;
    }

    /**
     * 全合計備考を設定する
     *
     * @param totalAllAmountBikou 全合計備考
     */
    public void setTotalAllAmountBikou(final String totalAllAmountBikou) {
        this.totalAllAmountBikou = totalAllAmountBikou;
    }

}
