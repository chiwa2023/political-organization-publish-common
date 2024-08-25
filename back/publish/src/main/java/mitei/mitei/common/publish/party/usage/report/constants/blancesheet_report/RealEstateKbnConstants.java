package mitei.mitei.common.publish.party.usage.report.constants.blancesheet_report;

/**
 * 政治資金収支報告書不動産定数
 */
public final class RealEstateKbnConstants {

    /** 土地の区分値 */
    public static final int KBN_LAND = 1;

    /** 建物の区分値 */
    public static final int KBN_BUILDING = 2;

    /** 地上権または借地権の区分値 */
    public static final int KBN_SURFACE_RIGHTS = 3;

    /** 土地の表示値 */
    public static final String KBN_LAND_TEXT = "土地";

    /** 建物の表示値 */
    public static final String KBN_BUILDING_TEXT = "建物";

    /** 地上権または借地権の表示値 */
    public static final String KBN_SURFACE_RIGHTS_TEXT = "借地権(地上権)";

    /** コンストラクタ */
    private RealEstateKbnConstants() {
        
    }
    
    /**
     * 区分に紐づく表記を返却する
     *
     * @param kbn 区分値
     * @return 表示テキスト
     */
    public static String getText(final int kbn) {

        switch (kbn) {
            case KBN_LAND:

                return KBN_LAND_TEXT;

            case KBN_BUILDING:

                return KBN_BUILDING_TEXT;

            case KBN_SURFACE_RIGHTS:

                return KBN_SURFACE_RIGHTS_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + kbn);
        }
    }
}
