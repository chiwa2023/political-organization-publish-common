package mitei.mitei.common.publish.politician.balancesheet.report.dto.v5;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 様式17その18の6 資産のうち信託を表すワークシートDto
 */
@JacksonXmlRootElement(localName = "SHEET")
public class Sheet071806TrustAmongAssetsDto extends Template0718SheetDto implements Serializable {

    /** serialId */
    private static final long serialVersionUID = 1L;

}
