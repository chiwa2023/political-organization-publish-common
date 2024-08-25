package mitei.mitei.common.publish.party.usage.report.constants.blancesheet_report;

/**
 * 政治資金収支報告書資産資産定数
 */
public final class AssetKbnConstants {
    
    /** 土地の区分値(公式) */
    public static final String KBN_LAND = "ア";
    /** 土地の表示値 */
    public static final String KBN_LAND_TEXT = "土地";
    /** 土地の数値区分値 */
    public static final int KBN_LAND_INT = 1;

    
    /** 建物の区分値(公式) */
    public static final String KBN_BUILDING = "イ";
    /** 建物の表示値 */
    public static final String KBN_BUILDING_TEXT = "建物";
    /** 建物の数値区分値 */
    public static final int KBN_BUILDING_INT = 2;
    
    /** 地上権または借地権の区分値(公式) */
    public static final String KBN_SURFACE = "ウ";
    /** 地上権または借地権の表示値 */
    public static final String KBN_SURFACE_TEXT = "地上権または借地権";
    /** 地上権または借地権の数値区分値 */
    public static final int KBN_SURFACE_INT = 3;
    
    /** 取得価額が100万円を超える動産の区分値(公式) */
    public static final String KBN_MOVING = "エ";
    /** 取得価額が100万円を超える動産の表示値 */
    public static final String KBN_MOVING_TEXT = "取得価額が100万円を超える動産";
    /** 取得価額が100万円を超える動産の数値区分値 */
    public static final int KBN_MOVING_INT = 4;
    
    /** 普通または当座でない預金(貯金)の区分値(公式) */
    public static final String KBN_SAVING = "オ";
    /** 普通または当座でない預金(貯金)の表示値 */
    public static final String KBN_SAVING_TEXT = "普通または当座でない預金(貯金)";
    /** 普通または当座でない預金(貯金)の数値区分値 */
    public static final int KBN_SAVING_INT = 5;
    
    /** 金銭信託の区分値(公式) */
    public static final String KBN_TRUST = "カ";
    /** 金銭信託の表示値 */
    public static final String KBN_TRUST_TEXT = "金銭信託";
    /** 金銭信託の数値区分値 */
    public static final int KBN_TRUST_INT = 6;
    
    /** 有価証券の区分値(公式) */
    public static final String KBN_SECURITIES = "キ";
    /** 有価証券の表示値 */
    public static final String KBN_SECURITIES_TEXT = "有価証券";
    /** 有価証券の数値区分値 */
    public static final int KBN_SECURITIES_INT = 7;
    
    /** 出資による権利の区分値(公式) */
    public static final String KBN_INVETMENT = "ク";
    /** 出資による権利の表示値 */
    public static final String KBN_INVETMENT_TEXT = "出資による権利";
    /** 出資による権利の数値区分値 */
    public static final int KBN_INVETMENT_INT = 8;
    
    /** 相手先ごとに残高100万円を超える貸付の区分値(公式) */
    public static final String KBN_LOAN = "ケ";
    /** 相手先ごとに残高100万円を超える貸付の表示値 */
    public static final String KBN_LOAN_TEXT = "相手先ごとに残高100万円を超える貸付";
    /** 相手先ごとに残高100万円を超える貸付の数値区分値 */
    public static final int KBN_LOAN_INT = 9;
    
    /** 100万円を超える敷金の区分値(公式) */
    public static final String KBN_DEPOSIT = "コ";
    /** 100万円を超える敷金の表示値 */
    public static final String KBN_DEPOSIT_TEXT = "100万円を超える敷金";
    /** 100万円を超える敷金の数値区分値 */
    public static final int KBN_DEPOSIT_INT = 10;
    
    /** 100万円を超える施設利用の権利の区分値(公式) */
    public static final String KBN_FACILITY = "サ";
    /** 100万円を超える施設利用の権利の表示値 */
    public static final String KBN_FACILITY_TEXT = "100万円を超える施設利用の権利";
    /** 100万円を超える施設利用の権利の数値区分値 */
    public static final int KBN_FACILITY_INT = 11;
    
    /** 相手先ごとに100万円を超える借入金の区分値(公式) */
    public static final String KBN_BORROWING = "シ";
    /** 相手先ごとに100万円を超える借入金の表示値 */
    public static final String KBN_BORROWING_TEXT = "相手先ごとに100万円を超える借入金";
    /** 相手先ごとに100万円を超える借入金の数値区分値 */
    public static final int KBN_BORROWING_INT = 12;

    /** コンストラクタ */
    private AssetKbnConstants() {
        
    }
    
    /**
     * 表示テキストを取得する
     *
     * @param kbn 区分値(数値)
     * @return 表示テキスト
     */
    public static String getText(final int kbn) {
        
        switch (kbn) {

            case KBN_LAND_INT:
                return KBN_LAND_TEXT;
                
            case KBN_BUILDING_INT:
                return KBN_BUILDING_TEXT;
                
            case KBN_SURFACE_INT:
                return KBN_SURFACE_TEXT;
                
            case KBN_MOVING_INT:
                return KBN_MOVING_TEXT;
                
            case KBN_SAVING_INT:
                return KBN_SAVING_TEXT;
                
            case KBN_TRUST_INT:
                return KBN_TRUST_TEXT;
                
            case KBN_SECURITIES_INT:
                return KBN_SECURITIES_TEXT;
                
            case KBN_INVETMENT_INT:
                return KBN_INVETMENT_TEXT;
                
            case KBN_LOAN_INT:
                return KBN_LOAN_TEXT;
                
            case KBN_DEPOSIT_INT:
                return KBN_DEPOSIT_TEXT;
                
            case KBN_FACILITY_INT:
                return KBN_FACILITY_TEXT;
                
            case KBN_BORROWING_INT:
                return KBN_BORROWING_TEXT;
                
            default:
                throw new IllegalArgumentException("Unexpected value: " + kbn);
        }
        
        
    }
    
}
