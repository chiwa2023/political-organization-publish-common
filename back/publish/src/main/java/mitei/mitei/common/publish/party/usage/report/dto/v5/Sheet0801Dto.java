package mitei.mitei.common.publish.party.usage.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 使途報告書様式8の1表紙シート
 */
public class Sheet0801Dto implements Serializable { // NOPMD

    /** serialId */
    private static final long serialVersionUID = 1L;

    /** 報告年度 */
    @JacksonXmlProperty(localName = "NENDO")
    private Integer nendo;

    /** 政党名称 */
    @JacksonXmlProperty(localName = "SEITOU_SK_NM")
    private String partyName;

    /** 政党名称かな */
    @JacksonXmlProperty(localName = "SEITOU_KANA")
    private String partyNameKana;

    /** 主たる事務所住所 */
    @JacksonXmlProperty(localName = "JIMU_ADR")
    private String officeAddress;

    /** 代表者姓名 */
    @JacksonXmlProperty(localName = "DAI_NM")
    private String delegateName;

    /** 会計責任者姓名 */
    @JacksonXmlProperty(localName = "KAI_NM")
    private String accountManagerName;

    /** 担当者1姓名 */
    @JacksonXmlProperty(localName = "TANTOU1_NM")
    private String worker1Name;

    /** 担当者1電話番号 */
    @JacksonXmlProperty(localName = "TANTOU1_TEL")
    private String worker1Tel;

    /** 担当者2姓名 */
    @JacksonXmlProperty(localName = "TANTOU2_NM")
    private String worker2Name;

    /** 担当者2電話番号 */
    @JacksonXmlProperty(localName = "TANTOU2_TEL")
    private String worker2Tel;

    /** 支部区分 */
    @JacksonXmlProperty(localName = "SIBU_KBN")
    private Integer shibuKbn;

    /** 解散区分 */
    @JacksonXmlProperty(localName = "KAISAN_KBN")
    private Integer kaisanKbn;

    /** 解散報告日 */
    @JacksonXmlProperty(localName = "KAISAN_DT")
    private String kaisanDate;

    /** 整理番号 */
    @JacksonXmlProperty(localName = "SEIRI_NO")
    private String seiriNo;

    /** 受付番号 */
    @JacksonXmlProperty(localName = "UKETUKE_NO")
    private String uketsukeNo;

    /**
     * 報告年度を取得する
     *
     * @return 報告年度
     */
    public Integer getNendo() {
        return nendo;
    }

    /**
     * 報告年度を設定する
     *
     * @param nendo 報告年度
     */
    public void setNendo(final Integer nendo) {
        this.nendo = nendo;
    }

    /**
     * 政党名称を取得する
     *
     * @return 政党名称
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * 政党名称を設定する
     *
     * @param partyName 政党名称
     */
    public void setPartyName(final String partyName) {
        this.partyName = partyName;
    }

    /**
     * 政党名称かなを取得する
     *
     * @return 政党名称かな
     */
    public String getPartyNameKana() {
        return partyNameKana;
    }

    /**
     * 政党名称かなを設定する
     *
     * @param partyNameKana 政党名称かな
     */
    public void setPartyNameKana(final String partyNameKana) {
        this.partyNameKana = partyNameKana;
    }

    /**
     * 主たる事務所住所を取得する
     *
     * @return 主たる事務所住所
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 主たる事務所住所を設定する
     *
     * @param officeAddress 主たる事務所住所
     */
    public void setOfficeAddress(final String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * 代表者姓名を取得する
     *
     * @return 代表者姓名
     */
    public String getDelegateName() {
        return delegateName;
    }

    /**
     * 代表者姓名を設定する
     *
     * @param delegateName 代表者姓名
     */
    public void setDelegateName(final String delegateName) {
        this.delegateName = delegateName;
    }

    /**
     * 会計責任者姓名を取得する
     *
     * @return 会計責任者姓名
     */
    public String getAccountManagerName() {
        return accountManagerName;
    }

    /**
     * 会計責任者姓名を設定する
     *
     * @param accountManagerName 会計責任者姓名
     */
    public void setAccountManagerName(final String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    /**
     * 担当者1姓名を取得する
     *
     * @return 担当者1姓名
     */
    public String getWorker1Name() {
        return worker1Name;
    }

    /**
     * 担当者1姓名を設定する
     *
     * @param worker1Name 担当者1姓名
     */
    public void setWorker1Name(final String worker1Name) {
        this.worker1Name = worker1Name;
    }

    /**
     * 担当者1電話番号を取得する
     *
     * @return 担当者1電話番号
     */
    public String getWorker1Tel() {
        return worker1Tel;
    }

    /**
     * 担当者1電話番号を設定する
     *
     * @param worker1Tel 担当者1電話番号
     */
    public void setWorker1Tel(final String worker1Tel) {
        this.worker1Tel = worker1Tel;
    }

    /**
     * 担当者2姓名 を取得する
     *
     * @return 担当者2姓名
     */
    public String getWorker2Name() {
        return worker2Name;
    }

    /**
     * 担当者2姓名 を設定する
     *
     * @param worker2Name 担当者2姓名
     */
    public void setWorker2Name(final String worker2Name) {
        this.worker2Name = worker2Name;
    }

    /**
     * 担当者2電話番号を取得する
     *
     * @return 担当者2電話番号
     */
    public String getWorker2Tel() {
        return worker2Tel;
    }

    /**
     * 担当者2電話番号を設定する
     *
     * @param worker2Tel 担当者2電話番号
     */
    public void setWorker2Tel(final String worker2Tel) {
        this.worker2Tel = worker2Tel;
    }

    /**
     * 支部区分を取得する
     *
     * @return 支部区分
     */
    public Integer getShibuKbn() {
        return shibuKbn;
    }

    /**
     * 支部区分を設定する
     *
     * @param shibuKbn 支部区分
     */
    public void setShibuKbn(final Integer shibuKbn) {
        this.shibuKbn = shibuKbn;
    }

    /**
     * 解散区分を取得する
     *
     * @return 解散区分
     */
    public Integer getKaisanKbn() {
        return kaisanKbn;
    }

    /**
     * 解散区分を設定する
     *
     * @param kaisanKbn 解散区分
     */
    public void setKaisanKbn(final Integer kaisanKbn) {
        this.kaisanKbn = kaisanKbn;
    }

    /**
     * 解散報告日を取得する
     *
     * @return 解散報告日
     */
    public String getKaisanDate() {
        return kaisanDate;
    }

    /**
     * 解散報告日を設定する
     *
     * @param kaisanDate 解散報告日
     */
    public void setKaisanDate(final String kaisanDate) {
        this.kaisanDate = kaisanDate;
    }

    /**
     * 整理番号を取得する
     *
     * @return 整理番号
     */
    public String getSeiriNo() {
        return seiriNo;
    }

    /**
     * 整理番号を設定する
     *
     * @param seiriNo 整理番号
     */
    public void setSeiriNo(final String seiriNo) {
        this.seiriNo = seiriNo;
    }

    /**
     * 受付番号を取得する
     *
     * @return 受付番号
     */
    public String getUketsukeNo() {
        return uketsukeNo;
    }

    /**
     * 受付番号を設定する
     *
     * @param uketsukeNo 受付番号
     */
    public void setUketsukeNo(final String uketsukeNo) {
        this.uketsukeNo = uketsukeNo;
    }

}
