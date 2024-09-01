package mitei.mitei.common.constants.blancesheet_report;

/**
 * 政治資金収支報告書収入様式区分定数
 */
public final class IncomeYoushikiKbnConstants { // NOPMD DataClass
    // CHECKSTYLE:OFF MagicNumber

    /** 様式7その3機関誌の発行 */
    public static final int YOUSHIKI_KBN_03 = 3;
    /** 様式7その4借入金 */
    public static final int YOUSHIKI_KBN_04 = 4;
    /** 様式7その5本部または支部からの交付金 */
    public static final int YOUSHIKI_KBN_05 = 5;
    /** 様式7その6その他の収入 */
    public static final int YOUSHIKI_KBN_06 = 6;
    /** 様式7その7寄付 */
    public static final int YOUSHIKI_KBN_07 = 7;
    /** 様式7その8寄付のうちあっせんによるもの */
    public static final int YOUSHIKI_KBN_08 = 8;
    /** 様式7その9政党匿名寄付 */
    public static final int YOUSHIKI_KBN_09 = 9;
    /** 様式7その10特定パーティ */
    public static final int YOUSHIKI_KBN_10 = 10;
    /** 様式7その11政治資金パーティ */
    public static final int YOUSHIKI_KBN_11 = 11;
    /** 様式7その12政治資金パーティのうちあっせんによるもの */
    public static final int YOUSHIKI_KBN_12 = 12;
    /** 支出共通枝区分 個人 */
    public static final int YOUSHIKI_SHUNYU_EDA_KBN_KOJIN = 1;
    /** 支出共通枝区分 法人その他の団体 */
    public static final int YOUSHIKI_SHUNYU_EDA_KBN_HOUJIN = 2;
    /** 支出共通枝区分 政治団体 */
    public static final int YOUSHIKI_SHUNYU_EDA_KBN_SEIJIDANTAI = 3;

    /** 様式7その3機関誌の発行 */
    public static final String YOUSHIKI_KBN_03_TEXT = "機関誌の発行";
    /** 様式7その4借入金 */
    public static final String YOUSHIKI_KBN_04_TEXT = "借入金";
    /** 様式7その5本部または支部からの交付金 */
    public static final String YOUSHIKI_KBN_05_TEXT = "本部／支部からの交付金";
    /** 様式7その6その他の収入 */
    public static final String YOUSHIKI_KBN_06_TEXT = "その他の収入";
    /** 様式7その7寄付 */
    public static final String YOUSHIKI_KBN_07_TEXT = "寄付";
    /** 様式7その8寄付のうちあっせんによるもの */
    public static final String YOUSHIKI_KBN_08_TEXT = "寄付のうちあっせん";
    /** 様式7その9政党匿名寄付 */
    public static final String YOUSHIKI_KBN_09_TEXT = "政党匿名寄付";
    /** 様式7その10特定パーティ */
    public static final String YOUSHIKI_KBN_10_TEXT = "特定パーティ";
    /** 様式7その11政治資金パーティ */
    public static final String YOUSHIKI_KBN_11_TEXT = "政治資金パーティ";
    /** 様式7その12政治資金パーティのうちあっせんによるもの */
    public static final String YOUSHIKI_KBN_12_TEXT = "政治資金パーティのうちあっせん";
    /** 支出共通枝区分 個人 */
    public static final String YOUSHIKI_SHUNYU_EDA_KBN_KOJIN_TEXT = "個人";
    /** 支出共通枝区分 法人その他の団体 */
    public static final String YOUSHIKI_SHUNYU_EDA_KBN_HOUJIN_TEXT = "法人その他の団体";
    /** 支出共通枝区分 政治団体 */
    public static final String YOUSHIKI_SHUNYU_EDA_KBN_SEIJIDANTAI_TEXT = "政治団体";

    /** コンストラクタ(インスタンス生成よけ) */
    private IncomeYoushikiKbnConstants() {

    }

    /**
     * 区分に紐づく表記を返却する
     *
     * @param kbn 区分値
     * @return 表示テキスト
     */
    public static String getText(final int kbn) {

        switch (kbn) {

            // 様式7その3機関誌の発行
            case YOUSHIKI_KBN_03:
                return YOUSHIKI_KBN_03_TEXT;

            // 様式7その4借入金
            case YOUSHIKI_KBN_04:
                return YOUSHIKI_KBN_04_TEXT;

            // 様式7その5本部または支部からの交付金
            case YOUSHIKI_KBN_05:
                return YOUSHIKI_KBN_05_TEXT;

            // 様式7その6その他の収入
            case YOUSHIKI_KBN_06:
                return YOUSHIKI_KBN_06_TEXT;

            // 様式7その7寄付
            case YOUSHIKI_KBN_07:
                return YOUSHIKI_KBN_07_TEXT;

            // 様式7その8寄付のうちあっせんによるもの
            case YOUSHIKI_KBN_08:
                return YOUSHIKI_KBN_08_TEXT;

            // 様式7その9政党匿名寄付
            case YOUSHIKI_KBN_09:
                return YOUSHIKI_KBN_09_TEXT;

            // 様式7その10特定パーティ
            case YOUSHIKI_KBN_10:
                return YOUSHIKI_KBN_10_TEXT;

            // 様式7その11政治資金パーティ
            case YOUSHIKI_KBN_11:
                return YOUSHIKI_KBN_11_TEXT;

            // 様式7その12政治資金パーティのうちあっせんによるもの
            case YOUSHIKI_KBN_12:
                return YOUSHIKI_KBN_12_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + kbn);
        }
    }

    /**
     * 区分に紐づく表記を返却する
     *
     * @param kbnEda 区分値
     * @return 表示テキスト
     */
    public static String getEdaText(final int kbnEda) {

        switch (kbnEda) {

            // 支出共通枝区分 個人
            case YOUSHIKI_SHUNYU_EDA_KBN_KOJIN:
                return YOUSHIKI_SHUNYU_EDA_KBN_KOJIN_TEXT;

            // 支出共通枝区分 法人その他の団体
            case YOUSHIKI_SHUNYU_EDA_KBN_HOUJIN:
                return YOUSHIKI_SHUNYU_EDA_KBN_HOUJIN_TEXT;

            // 支出共通枝区分 政治団体
            case YOUSHIKI_SHUNYU_EDA_KBN_SEIJIDANTAI:
                return YOUSHIKI_SHUNYU_EDA_KBN_SEIJIDANTAI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + kbnEda);
        }
    }

}
