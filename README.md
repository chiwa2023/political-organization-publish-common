# 政治団体会計提出発行書類共通

## 目的

政治資金収支報告書Ver5、政党交付金使途報告書Ver5の公式ソフトウェアが排出する、
オンライン提出用のXMLデータの取り込み、書き出しに使用できるDto群とValidation群の作成

## 含まれる公式発行書類用ツール

- 政治資金収支報告書…[createレポジトリ](https://github.com/chiwa2023/create-politician-balance-report)から移動後、追加作業予定
- 政党交付金使途報告書…2024/08/13 新規公開、順次開発追加

## 動作環境

- Pure Java(Mavenプロジェクト)
- 他プロジェクトに導入して使われる事が前提ですので、このプロジェクト全体を単独で動作させるコマンド、クラス類はありません。

## 政治資金収支報告書

TODO 内容記載

## 政党交付金使途報告書

- XMLと対応する`AllShitoBookDto`を用いて変換作業を行う。詳しくは [Dto要素一覧](./docs/party_usage/view_dto.md)
- [Validation](./docs/party_usage/view_validation.md)
- 書き出しはvalidationを行ったのち`com.fasterxml.jackson.dataformat.xml.XmlMapper.writeValueAsString(allShitoBook))`で書き出し可能。特に書き出しのためのロジックを設けていない
- 読み取りは[(未定)common.publish.party.usage.report.service.ConvertAllBookByXmlService]を用いて行う。
