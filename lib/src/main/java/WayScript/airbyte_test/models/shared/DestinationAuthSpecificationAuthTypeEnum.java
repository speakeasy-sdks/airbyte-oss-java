/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationAuthSpecificationAuthTypeEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private DestinationAuthSpecificationAuthTypeEnum(String value) {
        this.value = value;
    }
}
