package mitei.mitei.common.constants.blancesheet_report;

/**
 * 政治資金収支報告書支出様式区分定数
 */
public final class OutcomeYoushikiKbnConstants { // NOPMD DataClass
    // CHECKSTYLE:OFF MagicNumber

    /** 様式その14 */
    public static final int YOUSHIKI_KBN_14 = 14;
    /** 様式その15 */
    public static final int YOUSHIKI_KBN_15 = 15;
    /** 様式その14枝区分 光熱費 */
    public static final int YOUSHIKI_EDA14_KBN_KOUNETSUHI = 2;
    /** 様式その14枝区分 備品・消耗品費 */
    public static final int YOUSHIKI_EDA14_KBN_SHOUMOUHINHI = 3;
    /** 様式その14枝区分 事務所費 */
    public static final int YOUSHIKI_EDA14_KBN_JIMUSHOHI = 4;
    /** 様式その15枝区分 組織活動費 */
    public static final int YOUSHIKI_EDA15_KBN_SOSHIKIKATSUDOUHI = 1;
    /** 様式その15枝区分 選挙活動費 */
    public static final int YOUSHIKI_EDA15_KBN_SENKYOKATSUDOUHI = 2;
    /** 様式その15枝区分 機関誌発行事業費 */
    public static final int YOUSHIKI_EDA15_KBN_KIKANSHIHAKKOUHI = 3;
    /** 様式その15枝区分 宣伝事業費 */
    public static final int YOUSHIKI_EDA15_KBN_SENDENKOUKOKUHI = 4;
    /** 様式その15枝区分 政治資金パーティ開催事業費 */
    public static final int YOUSHIKI_EDA15_KBN_PARTYKAISAIHI = 5;
    /** 様式その15枝区分 その他の事業費 */
    public static final int YOUSHIKI_EDA15_KBN_SONOTAJIGYOU = 6;
    /** 様式その15枝区分 調査研究費 */
    public static final int YOUSHIKI_EDA15_KBN_CHOUSAKENKYUHI = 7;
    /** 様式その15枝区分 寄付交付金 */
    public static final int YOUSHIKI_EDA15_KBN_KIFUKOUFUKIN = 8;
    /** 様式その15枝区分 その他の経費 */
    public static final int YOUSHIKI_EDA15_KBN_SONOTAKEIHI = 9;

    /** 様式その14 */
    public static final String YOUSHIKI_KBN_14_TEXT = "その14経常経費の内訳";
    /** 様式その15 */
    public static final String YOUSHIKI_KBN_15_TEXT = "その15政治活動費";
    /** 様式その14枝区分 光熱費 */
    public static final String YOUSHIKI_EDA14_KBN_KOUNETSUHI_TEXT = "光熱水費";
    /** 様式その14枝区分 備品・消耗品費 */
    public static final String YOUSHIKI_EDA14_KBN_SHOUMOUHINHI_TEXT = "備品・消耗品費";
    /** 様式その14枝区分 事務所費 */
    public static final String YOUSHIKI_EDA14_KBN_JIMUSHOHI_TEXT = "事務所費";
    /** 様式その15枝区分 組織活動費 */
    public static final String YOUSHIKI_EDA15_KBN_SOSHIKIKATSUDOUHI_TEXT = "組織活動費";
    /** 様式その15枝区分 選挙活動費 */
    public static final String YOUSHIKI_EDA15_KBN_SENKYOKATSUDOUHI_TEXT = "選挙関係費";
    /** 様式その15枝区分 機関誌発行事業費 */
    public static final String YOUSHIKI_EDA15_KBN_KIKANSHIHAKKOUHI_TEXT = "機関紙発行事業費";
    /** 様式その15枝区分 宣伝事業費 */
    public static final String YOUSHIKI_EDA15_KBN_SENDENKOUKOKUHI_TEXT = "宣伝事業費";
    /** 様式その15枝区分 政治資金パーティ開催事業費 */
    public static final String YOUSHIKI_EDA15_KBN_PARTYKAISAIHI_TEXT = "政治資金パーティ開催事業費";
    /** 様式その15枝区分 その他の事業費 */
    public static final String YOUSHIKI_EDA15_KBN_SONOTAJIGYOU_TEXT = "その他の事業費";
    /** 様式その15枝区分 調査研究費 */
    public static final String YOUSHIKI_EDA15_KBN_CHOUSAKENKYUHI_TEXT = "調査研究費";
    /** 様式その15枝区分 寄付交付金 */
    public static final String YOUSHIKI_EDA15_KBN_KIFUKOUFUKIN_TEXT = "寄付交付金";
    /** 様式その15枝区分 その他の経費 */
    public static final String YOUSHIKI_EDA15_KBN_SONOTAKEIHI_TEXT = "その他の経費";

    /** コンストラクタ(インスタンス生成よけ) */
    private OutcomeYoushikiKbnConstants() {

    }

    /**
     * 区分に紐づく表記を返却する
     *
     * @param kbn 区分値
     * @return 表示テキスト
     */
    public static String getText(final int kbn) {

        switch (kbn) {
            case YOUSHIKI_KBN_14:

                return YOUSHIKI_KBN_14_TEXT;

            case YOUSHIKI_KBN_15:

                return YOUSHIKI_KBN_15_TEXT;

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
    public static String getEda14Text(final int kbnEda) {

        switch (kbnEda) {
            // 様式その14枝区分 光熱費 */
            case YOUSHIKI_EDA14_KBN_KOUNETSUHI:
                return YOUSHIKI_EDA14_KBN_KOUNETSUHI_TEXT;

            // 様式その14枝区分 備品・消耗品費
            case YOUSHIKI_EDA14_KBN_SHOUMOUHINHI:
                return YOUSHIKI_EDA14_KBN_SHOUMOUHINHI_TEXT;

            // 様式その14枝区分 事務所費
            case YOUSHIKI_EDA14_KBN_JIMUSHOHI:
                return YOUSHIKI_EDA14_KBN_JIMUSHOHI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + kbnEda);
        }
    }

    /**
     * 区分に紐づく表記を返却する
     *
     * @param kbnEda 区分値
     * @return 表示テキスト
     */
    public static String getEda15Text(final int kbnEda) {

        switch (kbnEda) {

            // 様式その15枝区分 組織活動費
            case YOUSHIKI_EDA15_KBN_SOSHIKIKATSUDOUHI:
                return YOUSHIKI_EDA15_KBN_SOSHIKIKATSUDOUHI_TEXT;

            // 様式その15枝区分 選挙活動費
            case YOUSHIKI_EDA15_KBN_SENKYOKATSUDOUHI:
                return YOUSHIKI_EDA15_KBN_SENKYOKATSUDOUHI_TEXT;

            // 様式その15枝区分 機関誌発行事業費
            case YOUSHIKI_EDA15_KBN_KIKANSHIHAKKOUHI:
                return YOUSHIKI_EDA15_KBN_KIKANSHIHAKKOUHI_TEXT;

            // 様式その15枝区分 宣伝事業費
            case YOUSHIKI_EDA15_KBN_SENDENKOUKOKUHI:
                return YOUSHIKI_EDA15_KBN_SENDENKOUKOKUHI_TEXT;

            // 様式その15枝区分 政治資金パーティ開催事業費
            case YOUSHIKI_EDA15_KBN_PARTYKAISAIHI:
                return YOUSHIKI_EDA15_KBN_PARTYKAISAIHI_TEXT;

            // 様式その15枝区分 その他の事業費
            case YOUSHIKI_EDA15_KBN_SONOTAJIGYOU:
                return YOUSHIKI_EDA15_KBN_SONOTAJIGYOU_TEXT;

            // 様式その15枝区分 調査研究費
            case YOUSHIKI_EDA15_KBN_CHOUSAKENKYUHI:
                return YOUSHIKI_EDA15_KBN_CHOUSAKENKYUHI_TEXT;

            // 様式その15枝区分 寄付交付金
            case YOUSHIKI_EDA15_KBN_KIFUKOUFUKIN:
                return YOUSHIKI_EDA15_KBN_KIFUKOUFUKIN_TEXT;

            // 様式その15枝区分 その他の経費
            case YOUSHIKI_EDA15_KBN_SONOTAKEIHI:
                return YOUSHIKI_EDA15_KBN_SONOTAKEIHI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + kbnEda);
        }
    }

}
