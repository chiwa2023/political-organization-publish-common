# 政党交付金使途報告書Dto一覧

## XML文書情報

BookHeadDto

 |     論理名     |  論理名   |   型   | XML名前空間 |                      説明(例)                       |
 | -------------- | --------- | ------ | ----------- | --------------------------------------------------- |
 | バージョン番号 | version   | String | VERSION     | バージョン表記。`20191220`固定                      |
 | アプリ名称     | apliNamet | String | APP         | ソフトウェアの表記。`使途等報告書作成ソフト`        |
 | アプリフラグ   | flgApli   | String | APP_FLG     | 詳細不明。1/0フラグと思われる                       |
 | 本部フラグ     | flgHonbu  | String | HONBU_FLG   | 本部フラグ。本部の場合`1`,支部の場合`0`(と思われる) |

## データ利用一覧フラグ

SitoUmuFlgDto

 |            論理名            |    論理名     |   型   | XML名前空間 |                            説明(例)                            |
 | ---------------------------- | ------------- | ------ | ----------- | -------------------------------------------------------------- |
 | データ存在の有無一覧テキスト | umuStatusText | String | SITO_UMU    | どのカテゴリに情報が入っているかを占めるフラグを連結した文字列 |

付表　位置によるフラグ内容

| 文字位置 |                 入力情報                  |
| -------: | ----------------------------------------- |
|        1 | 8号様式その2:収支の総括表                 |
|        2 | 8号様式その3:支出の総括表                 |
|        3 | 8号様式その4-01:支部政党交付金            |
|        4 | 8号様式その4-02:備品                      |
|        5 | 8号様式その4-03:事務所費                  |
|        6 | 8号様式その4-04:組織活動費                |
|        7 | 8号様式その4-05:選挙活動費                |
|        8 | 8号様式その4-06:機関誌発行事業            |
|        9 | 8号様式その4-07:宣伝事業                  |
|       10 | 8号様式その4-08:政治資金パーティ開催      |
|       11 | 8号様式その4-09:その他の事業費            |
|       12 | 8号様式その4-10:調査研究費                |
|       13 | 8号様式その4-11:寄付金                    |
|       14 | 8号様式その4-12:その他の経費              |
|       15 | 8号様式その5:支部政党交付金の内訳         |
|       16 | 8号様式その6:政党基金の内訳               |
|       17 | 9号様式:領収書を徴しがたかった明細書      |
|       18 | 9号様式その2:振込明細書にかかる支出目的書 |

※　表紙と宣誓書は常に情報が入力されている項目に分類されるので位置フラグの対象ではない

## 様式8の1　表紙

様式8その1`Shito0801Dto`はシート`Sheet0801Dto`を持つ(XML名前空間はSHEET)

Sheet0801Dto

 |      論理名      |       論理名       |   型    | XML名前空間  |     説明(例)     |
 | ---------------- | ------------------ | ------- | ------------ | ---------------- |
 | 報告年度         | nendo              | Integer | NENDO        | 報告年度         |
 | 政党名称         | partyName          | String  | SEITOU_SK_NM | 政党正式名称     |
 | 政党名称かな     | partyNameKana      | String  | SEITOU_KANA  | 政党正式名称かな |
 | 主たる事務所住所 | officeAddress      | String  | JIMU_ADR     | 主たる事務所住所 |
 | 代表者姓名       | delegateName       | String  | JDAI_NM      | 代表者姓名       |
 | 会計責任者姓名   | accountManagerName | String  | KAI_NM       | 会計責任者姓名   |
 | 担当者1姓名      | worker1Name        | String  | TANTOU1_NM   | 担当者1姓名      |
 | 担当者1電話番号  | worker1Tel         | String  | TANTOU1_TEL  | 担当者1電話番号  |
 | 担当者2姓名      | worker2Name        | String  | TANTOU2_NM   | 担当者2姓名      |
 | 担当者2電話番号  | worker2Tel         | String  | TANTOU2_TEL  | 担当者2電話番号  |
 | 支部区分         | shibuKbn           | Integer | SIBU_KBN     | 支部区分         |
 | 解散区分         | kaisanKbn          | Integer | KAISAN_KBN   | 解散区分         |
 | 解散報告日       | kaisanDate         | String  | KAISAN_DT    | 解散報告日       |
 | 整理番号         | seiriNo            | String  | SEIRI_NO     | (内部変数?)      |
 | 受付番号         | uketsukeNo         | String  | UKETUKE_NO   | (内部変数?)      |

## 様式8の2　収支の状況

様式8その2`Shito0802Dto`はシート`Sheet0802Dto`を持つ(XML名前空間はSHEET)

### 区分1.収支の総括表

 |  論理名  |   論理名    |   型    | XML名前空間 |        説明(例)        |
 | -------- | ----------- | ------- | ----------- | ---------------------- |
 | 行番号   | rowNo       | Integer | ICHIREN_NO  | 行番号                 |
 | 項目名称 | itemName    | String  | KOUMOKU_NM  | 総括表の項目(`固定値`) |
 | 発生日   | accrualDate | String  | DT          | `入力なし:空文字`      |
 | 金額     | amount      | Long    | KINGAKU     | 集計された金額         |

付表　行番号と項目(固定値)

| 行番号 |                                   固定項目名称                                    |
| -----: | --------------------------------------------------------------------------------- |
|      1 | 政党交付金（支部政党交付金）の総額　--------------------------------------------① |
|      2 | 前年末政党基金（支部基金）残高　------------------------------------------------② |
|      3 | 政党交付金（支部政党交付金）による支出総額（④＋⑤）　--------------------------③   |
|      4 | 政党交付金（支部政党交付金）支出充当額総額　----------------------------------④   |
|      5 | 政党基金（支部基金）支出充当額総額　------------------------------------------⑤   |
|      6 | 政党基金（支部基金）の積立に充てるために取り崩した政党基金（支部基金）の額　----⑥ |
|      7 | 政党基金（支部基金）積立総額（果実を含む。）　----------------------------------⑦ |
|      8 | 政党基金（支部基金）の運用により収受した果実の総額                                |
|      9 | 本年末等政党基金（支部基金）残高（②－⑤－⑥＋⑦）　----------------------------⑧     |
|     10 | （備　　　　　考）　　　　　　　　　　　　　　　　　　　　　　　①－③＋②－⑧        |

### 区分2.政党交付金の内訳

 |  論理名  |   論理名    |   型    | XML名前空間 |       説明(例)       |
 | -------- | ----------- | ------- | ----------- | -------------------- |
 | 行番号   | rowNo       | Integer | ICHIREN_NO  | 行番号               |
 | 項目名称 | itemName    | String  | KOUMOKU_NM  | 交付金を渡した相手   |
 | 発生日   | accrualDate | String  | DT          | 交付金を渡した発生日 |
 | 金額     | amount      | Long    | KINGAKU     | 交付金を渡した金額   |

## 様式8の3 支出金額項目の内訳

様式8その3`Shito0803Dto`はシート`Sheet0803Dto`を持つ(XML名前空間はSHEET)

Sheet0803Dto

 |              論理名              |            論理名             |   型   |    XML名前空間     |             説明(例)             |
 | -------------------------------- | ----------------------------- | ------ | ------------------ | -------------------------------- |
 | 支部交付金全合計                 | totalShibuKoufuAll            | Long   | KOUFU0_GK          | 支部交付金全合計                 |
 | 支部交付金合計充当交付金から     | totalShibuKoufuJutoKoufukin   | Long   | KOUFU1_GK          | 支部交付金合計充当交付金から     |
 | 支部交付金合計充当政党基金から   | totalShibuKouJutoMyFundsl     | Long   | KOUFU2_GK          | 支部交付金合計充当政党基金から   |
 | 支部交付金合計備考               | totalShibuKoufuBikou          | String | KOUFU_BIKOU        | 支部交付金集計備考               |
 | 人件費全合計                     | totalJinkenhiAll              | Long   | JINKENHI0_GK       | 人件費全合計                     |
 | 人件費合計充当交付金から         | totalJinkenhiJutoKoufukin     | Long   | JINKENHI1_GK       | 人件費合計充当交付金から         |
 | 人件費合計充当政党基金から       | totalJinkenhiJutoMyFunds      | Long   | JINKENHI2_GK       | 人件費合計充当政党基金から       |
 | 人件費合計備考                   | totalJinkenhiBikou            | String | JINKENHI_BIKOU     | 人件費集計備考                   |
 | 光熱費全合計                     | totalKounetsuhiAll            | Long   | KOUNETU0_GK        | 光熱費全合計                     |
 | 光熱費合計充当交付金から         | totalKounetsuhiJutoKoufukin   | Long   | KOUNETU1_GK        | 光熱費合計充当交付金から         |
 | 光熱費合計充当政党基金から       | totalKounetsuhiJutoMyFunds    | Long   | KOUNETU2_GK        | 光熱費合計充当政党基金から       |
 | 光熱費合計備考                   | totalKounetsuhiBikou          | String | KOUNETU_BIKOU      | 人光熱費集計備考                 |
 | 備品全合計                       | totalBihinAll                 | Long   | BIHIN0_GK          | 備品全合計                       |
 | 備品合計充当交付金から           | totalBihinJutoKoufukin        | Long   | BIHIN1_GK          | 備品合計充当交付金から           |
 | 備品合計充当政党基金から         | totalBihinJutoMyFunds         | Long   | BIHIN2_GK          | 備品合計充当政党基金から         |
 | 備品合計備考                     | totalBihinBikou               | String | BIHIN_BIKOU        | 備品費集計備考                   |
 | 事務所全合計                     | totalJimushoAll               | Long   | JIMUSYO0_GK        | 事務所全合計                     |
 | 事務所合計充当交付金から         | totalJimushoJutoKoufukin      | Long   | JIMUSYO1_GK        | 事務所合計充当交付金から         |
 | 事務所合計充当政党基金から       | totalJimushoJutoMyFunds       | Long   | JIMUSYO2_GK        | 事務所合計充当政党基金から       |
 | 事務所合計備考                   | totalJimushoBikou             | String | JIMUSYO_BIKOU      | 事務所集計備考                   |
 | 経費全合計                       | totalKeihioAll                | Long   | KEIHI_SKEI0_GK     | 経費全合計                       |
 | 経費合計充当交付金から           | totalKeihiJutoKoufukin        | Long   | KEIHI_SKEI1_GK     | 経費合計充当交付金から           |
 | 経費合計充当政党基金から         | totalKeihiJutoMyFunds         | Long   | KEIHI_SKEI2_GK     | 経費合計充当政党基金から         |
 | 経費合計備考                     | totalKeihiBikou               | String | KEIHI_SKEI_BIKOU   | 経費集計備考                     |
 | 組織全合計                       | totalSoshikiAll               | Long   | SOSIKI0_GK         | 組織全合計                       |
 | 組織合計充当交付金から           | totalSoshikiJutoKoufukin      | Long   | SOSIKI1_GK         | 組織合計充当交付金から           |
 | 組織合計充当政党基金から         | totalSoshikiJutoMyFunds       | Long   | SOSIKI2_GK         | 組織合計充当政党基金から         |
 | 組織合計備考                     | totalSoshikiBikou             | String | SOSIKI_BIKOU       | 組織集計備考                     |
 | 選挙全合計                       | totalSenkyoAll                | Long   | SENKYO0_GK         | 選挙全合計                       |
 | 選挙合計充当交付金から           | totalSenkyoJutoKoufukin       | Long   | SENKYO1_GK         | 選挙合計充当交付金から           |
 | 選挙合計充当政党基金から         | totalSenkyoJutoMyFunds        | Long   | SENKYO2_GK         | 選挙合計充当政党基金から         |
 | 選挙合計備考                     | totalSenkyoBikou              | String | SENKYO_BIKOU       | 選挙集計備考                     |
 | 事業全般全合計                   | totalAllJigyoAll              | Long   | SONOTA_JIGYO0_GK   | 事業全般全合計                   |
 | 事業全般合計充当交付金から       | totalAllJigyoJutoKoufukin     | Long   | SONOTA_JIGYO1_GK   | 事業全般合計充当交付金から       |
 | 事業全般合計充当政党基金から     | totalAllJigyoJutoMyFunds      | Long   | SONOTA_JIGYO2_GK   | 事業全般合計充当政党基金から     |
 | 事業全般合計備考                 | totalAllJigyoBikou            | String | SONOTA_JIGYO_BIKOU | 事業全般集計備考                 |
 | 機関誌発行全合計                 | totalKikanshiAll              | Long   | HAKKOU_JIGYO0_GK   | 機関誌発行全合計                 |
 | 機関誌発行合計充当交付金から     | totalKikanshiJutoKoufukin     | Long   | HAKKOU_JIGYO1_GK   | 機関誌発行合計充当交付金から     |
 | 機関誌発行合計充当政党基金から   | totalKikanshiJutoMyFunds      | Long   | HAKKOU_JIGYO2_GK   | 機関誌発行合計充当政党基金から   |
 | 機関誌発行合計備考               | totalKikanshiBikou            | String | HAKKOU_JIGYO_BIKOU | 機関誌発行集計備考               |
 | 宣伝全合計                       | totalSendenAll                | Long   | SENDEN0_GK         | 宣伝全合計                       |
 | 宣伝合計充当交付金から           | totalSendenJutoKoufukin       | Long   | SENDEN1_GK         | 宣伝合計充当交付金から           |
 | 宣伝合計充当政党基金から         | totalSendenJutoMyFunds        | Long   | SENDEN2_GK         | 宣伝合計充当政党基金から         |
 | 宣伝合計備考                     | totalSendenBikou              | String | SENDEN_BIKOU       | 宣伝集計備考                     |
 | パーティ全合計                   | totalPartyAll                 | Long   | KAISAI0_GK         | パーティ全合計                   |
 | パーティ合計充当交付金から       | totalPartyJutoKoufukin        | Long   | KAISAI1_GK         | パーティ合計充当交付金から       |
 | パーティ合計充当政党基金から     | totalPartyJutoMyFunds         | Long   | KAISAI2_GK         | パーティ合計充当政党基金から     |
 | パーティ合計備考                 | totalPartyBikou               | String | KAISAI_BIKOU       | パーティ集計備考                 |
 | その他事業全合計                 | totalSonotaJigyouAll          | Long   | SONOTA0_GK         | その他事業全合計                 |
 | その他事業合計充当交付金から     | totalSonotaJigyouJutoKoufukin | Long   | SONOTA1_GK         | その他事業合計充当交付金から     |
 | その他事業合計充当政党基金から   | totalSonotaJigyouJutoMyFunds  | Long   | SONOTA2_GK         | その他事業合計充当政党基金から   |
 | その他事業合計備考               | totalSonotaJigyouBikou        | String | SONOTA_BIKOU       | その他事業集計備考               |
 | 調査全合計                       | totalChousaAll                | Long   | CYOUSA0_GK         | 調査全合計                       |
 | 調査合計充当交付金から           | totalChousaJutoKoufukin       | Long   | CYOUSA1_GK         | 調査合計充当交付金から           |
 | 調査合計充当政党基金から         | totalChousaJutoMyFunds        | Long   | CYOUSA2_GK         | 調査合計充当政党基金から         |
 | 調査合計備考                     | totalChousauBikou             | String | CYOUSA_BIKOU       | 調査集計備考                     |
 | 寄附全合計                       | totalKifuAll                  | Long   | KIFU0_GK           | 寄附全合計                       |
 | 寄附合計充当交付金から           | totalKifuJutoKoufukin         | Long   | KIFU1_GK           | 寄附合計充当交付金から           |
 | 寄附合計充当政党基金から         | totalKifuJutoMyFunds          | Long   | KIFU2_GK           | 寄附合計充当政党基金から         |
 | 寄附合計備考                     | totalKifuBikou                | String | KIFU_BIKOU         | 寄附集計備考                     |
 | その他経費全合計                 | totalSonotaKeihiAll           | Long   | SONOTA_KEIHI0_GK   | その他経費全合計                 |
 | その他経費合計充当交付金から     | totalSonotaKeihiJutoKoufukin  | Long   | SONOTA_KEIHI1_GK   | その他経費合計充当交付金から     |
 | その他経費合計充当政党基金から   | totalSonotaKeihiJutoMyFunds   | Long   | SONOTA_KEIHI2_GK   | その他経費合計充当政党基金から   |
 | その他経費合計備考               | totalSonotaKeihiBikou         | String | SONOTA_KEIHI_BIKOU | その他経費集計備考               |
 | 活動カテゴリ全合計               | totalAllActionAll             | Long   | KATUDOU_SKEI0_GK   | 活動カテゴリ全合計               |
 | 活動カテゴリ合計充当交付金から   | totalAllActionJutoKoufukin    | Long   | KATUDOU_SKEI1_GK   | 活動カテゴリ合計充当交付金から   |
 | 活動カテゴリ合計充当政党基金から | totalAllActionJutoMyFunds     | Long   | KATUDOU_SKEI2_GK   | 活動カテゴリ合計充当政党基金から |
 | 活動カテゴリ合計備考             | totalAllActionBikou           | String | KATUDOU_SKEI_BIKOU | 活動カテゴリ集計備考             |
 | 全合計全合計                     | totalAllAmountAll             | Long   | GKEI0_GK           | 全合計全合計                     |
 | 全合計合計充当交付金から         | totalAllAmountJutoKoufukin    | Long   | GKEI1_GK           | 全合計合計充当交付金から         |
 | 全合計合計充当政党基金から       | totalAllAmountJutoMyFunds     | Long   | GKEI2_GK           | 全合計合計充当政党基金から       |
 | 全合計合計備考                   | totalAllAmountnBikou          | String | GKEI_BIKOU         | 全合計集計備考                   |

## 様式8の4

SitoUmuFlgDto

 |         論理名         |    論理名    |      型      | XML名前空間 |            説明(例)            |
 | ---------------------- | ------------ | ------------ | ----------- | ------------------------------ |
 | 区分01(支部政党交付金) | kbn080401Dto | Kbn080401Dto | KUBUN01     | 支部政党交付金に関する支出明細 |
 | 区分02(備品)           | kbn080402Dto | Kbn080402Dto | KUBUN02     | 備品に関する支出明細           |
 | 区分03(事務所)         | kbn080403Dto | Kbn080403Dto | KUBUN03     | 事務所に関する支出明細         |
 | 区分04(組織)           | kbn080404Dto | Kbn080404Dto | KUBUN04     | 組織に関する支出明細           |
 | 区分05(選挙)           | kbn080405Dto | Kbn080405Dto | KUBUN05     | 選挙に関する支出明細           |
 | 区分06(機関誌)         | kbn080406Dto | Kbn080406Dto | KUBUN06     | 機関誌に関する支出明細         |
 | 区分07(宣伝)           | kbn080407Dto | Kbn080407Dto | KUBUN07     | 宣伝に関する支出明細           |
 | 区分08(パーティ)       | kbn080408Dto | Kbn080408Dto | KUBUN08     | パーティに関する支出明細       |
 | 区分09(その他事業)     | kbn080409Dto | Kbn080409Dto | KUBUN09     | その他事業に関する支出明細     |
 | 区分10(調査)           | kbn080410Dto | Kbn080410Dto | KUBUN10     | 調査に関する支出明細           |
 | 区分11(寄附)           | kbn080411Dto | Kbn080411Dto | KUBUN11     | 寄附に関する支出明細           |
 | 区分12(その他経費)     | kbn080412Dto | Kbn080412Dto | KUBUN12     | その他経費に関する支出明細     |

### 様式8の4詳細説明(全区分共通)

Sheet0804Dto

 |       論理名       |      論理名       |           型            |    XML名前空間     |      説明(例)      |
 | ------------------ | ----------------- | ----------------------- | ------------------ | ------------------ |
 | 費目               | himoku            | String                  | HIMOKU             | 費目               |
 | その他合計金額     | sonotaAmount      | Long                    | KINGAKU_SONOTA_GK  | その他合計金額     |
 | その他交付金合計   | sonotaKofukin     | String                  | KOUFU_SONOTA_GK    | その他交付金合計   |
 | その他政党基金合計 | sonotaMyFunds     | String                  | KIKIN_SONOTA_GK    | その他政党基金合計 |
 | 全金額合計         | amountAll         | Long                    | KINGAKU_KINGAKU_GK | 全金額合計         |
 | 交付金金額合計     | amountAllKoufukin | Long                    | KOUFU_KINGAKU_GK   | 交付金金額合計     |
 | 政党基金合計       | amountAllMyFunds  | Long                    | KIKIN_KINGAKU_GK   | 政党基金合計       |
 | 項目リスト         | amountAllMyFunds  | List\<RowShitoCoreDto\> | ROW                | 内訳リスト         |

RowShitoCoreDto

 |           論理名           |      論理名      |   型    |   XML名前空間    |          説明(例)          |
 | -------------------------- | ---------------- | ------- | ---------------- | -------------------------- |
 | 行番号                     | rowNo            | Integer | ICHIREN_NO       | 行番号                     |
 | 取引項目                   | usageItemt       | String  | MOKUTEKI         | 取引項目                   |
 | 総支出額                   | amountAll        | String  | KINGAKU          | 総支出額                   |
 | 政党交付金空の支出（充当） | amountKoufukin   | String  | KOUFU_JYUUTOU_GK | 政党交付金空の支出（充当） |
 | 政党基金からの支出（充当） | amountMyFunds    | String  | KIKIN_JYUUTOU_GK | 政党基金からの支出（充当） |
 | 発生日                     | accrualDate      | String  | DT               | 発生日                     |
 | 取引相手名称               | payeeName        | String  | NM               | 取引相手名称               |
 | 取引相手住所               | address          | String  | ADR              | 取引相手住所               |
 | 備考                       | bikou            | String  | BIKOU            | 備考                       |
 | 領収書を徴し難い区分       | flgCollectRecipt | String  | RYOUSYU          | 領収書を徴し難い区分       |

## 様式8の5

様式8その5`Shito0805Dto`はシート`Sheet0805Dto`を持つ(XML名前空間はSHEET)

RowShito0805Dto

 |  論理名  |   論理名    |   型    | XML名前空間 |       説明(例)       |
 | -------- | ----------- | ------- | ----------- | -------------------- |
 | 行番号   | rowNo       | Integer | ICHIREN_NO  | 行番号               |
 | 支部名称 | sibuName    | String  | SIBU_NM     | 支部名称             |
 | 金額     | amount      | Long    | KINGAKU     | 交付金を渡した金額   |
 | 発生日   | accrualDate | String  | DT          | 交付金を渡した発生日 |
 | 目的     | purpose     | String  | MOKUTEKI    | 目的                 |
 | 備考     | bikou       | String  | BIKOU       | 備考                 |
 | 行区分   | rowKbn      | Integer | ROWKBN      | 行区分               |

## 様式8の6

様式8その6`Shito0806Dto`はシート**配列**`Sheet0806Dto`を持つ(XML名前空間はSHEET)

Sheet0806Dto

 |     論理名      |       論理名       |           型            |   XML名前空間    |         説明(例)          |
 | --------------- | ------------------ | ----------------------- | ---------------- | ------------------------- |
 | 基金名称        | fundsName          | String                  | KIKIN_NM         | 基金名称                  |
 | 全年まで残合計  | totalLastYear      | Long                    | ZENNEN_ZAN_GK    | 全年まで残合計            |
 | 基金目的        | fundsPuropose      | String                  | MOKUTEKI         | 基金目的                  |
 | 本年合計        | total              | Long                    | MOKUTEKI         | 本年合計                  |
 | 本年合計備考    | totalBikou         | String                  | GOUKEI_BIKOU     | 本年合計備考              |
 | 本年残合計      | totalThisYear      | Long                    | HONNEN_ZAN_GK    | 本年残合計                |
 | 本年残合計備考  | totalThisYearBikou | String                  | HONNEN_ZAN_BIKOU | 本年残合計備考            |
 | 増減合計        | totalIncrease      | Long                    | ZOUGEN_GK        | 増減合計                  |
 | 増減合計備考    | totalIncreaseBikou | String                  | ZOUGEN_BIKOU     | 増減合計備考              |
 | 区分1(積み立て) | totalIncreaseBikou | List\<RowShito0806Dto\> | KUBUN1           | 区分1(積み立て)内訳リスト |
 | 区分2(果実)     | totalIncreaseBikou | List\<RowShito0806Dto\> | KUBUN2           | 区分2(果実)内訳リスト     |
 | 区分3(取り崩し) | totalIncreaseBikou | List\<RowShito0806Dto\> | KUBUN3           | 区分3(取り崩し)内訳リスト |

RowShito0806Dto

 | 論理名 |   論理名    |   型    | XML名前空間 |       説明(例)       |
 | ------ | ----------- | ------- | ----------- | -------------------- |
 | 行番号 | rowNo       | Integer | ICHIREN_NO  | 行番号               |
 | 発生日 | accrualDate | String  | DT          | 交付金を渡した発生日 |
 | 金額   | amount      | Long    | KINGAKU     | 交付金を渡した金額   |
 | 備考   | bikou       | String  | BIKOU       | 備考                 |

## 様式8の7 宣誓書

様式8その7`Shito0807Dto`はシート`Sheet0807Dto`を持つ(XML名前空間はSHEET)

Sheet0807Dto

 |                           論理名                           |      論理名       |   型    | XML名前空間 |                          説明(例)                          |
 | ---------------------------------------------------------- | ----------------- | ------- | ----------- | ---------------------------------------------------------- |
 | 添付書類：領収書の写し                                     | copyRecipt        | Integer | TENPU1      | 添付書類：領収書の写し                                     |
 | 添付書類：監査意見書                                       | auditOption       | Integer | TENPU2      | 添付書類：監査意見書                                       |
 | 添付書類：本部のみ監査報告書                               | auditReport       | Integer | TENPU3      | 添付書類：本部のみ監査報告書                               |
 | 添付書類：本部が支部から受け取りした支部報告書、監査意見書 | shibuDocument     | Integer | TENPU4      | 添付書類：本部が支部から受け取りした支部報告書、監査意見書 |
 | 添付書類：領収書の写し                                     | governingDocument | Integer | TENPU5      | 添付書類：領収書の写し                                     |
 | 相違がないか確認                                           | flgConfirm        | Integer | KAKUNIN1    | 相違がないか確認                                           |
 | 宣誓日                                                     | accuralDate       | String  | DT          | 宣誓日                                                     |

## 様式9(の1) 領収書を徴しがたかった事情

様式9その1`Shito0901Dto`はシート`Sheet0901Dto`を持つ(XML名前空間はSHEET)

Sheet0901Dto

 |           論理名           |   論理名    |   型    | XML名前空間 |          説明(例)          |
 | -------------------------- | ----------- | ------- | ----------- | -------------------------- |
 | 行番号                     | rowNo       | Integer | ICHIREN_NO  | 行番号                     |
 | 項目                       | itemName    | String  | KOMOKU      | 項目                       |
 | 摘要                       | digest      | String  | TEKIYOU     | 摘要                       |
 | 金額                       | amount      | Long    | KINGAKU     | 交付金を渡した金額         |
 | 発生日                     | accrualDate | String  | DT          | 交付金を渡した発生日       |
 | 領収書が徴しがたかった事情 | explain     | String  | JIJYOU      | 領収書が徴しがたかった事情 |

## 様式9の2 振込明細書に係る支出目的書

様式9その2`Shito0902Dto`はシート`Sheet0902Dto`を持つ(XML名前空間はSHEET)

 |  論理名  |   論理名   |   型   | XML名前空間 | 説明(例) |
 | -------- | ---------- | ------ | ----------- | -------- |
 | 項目     | itemName   | String | KOMOKU      | 項目     |
 | 摘要     | digest     | String | TEKIYOU     | 摘要     |
 | 団体名称 | dantaiName | String | DANTAI_NM   | 団体名称 |
