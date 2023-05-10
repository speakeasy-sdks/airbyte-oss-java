/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetDestinationDefinitionSpecificationResponse {
    
    public String contentType;

    public GetDestinationDefinitionSpecificationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.DestinationDefinitionSpecificationRead destinationDefinitionSpecificationRead;

    public GetDestinationDefinitionSpecificationResponse withDestinationDefinitionSpecificationRead(WayScript.airbyte_test.models.shared.DestinationDefinitionSpecificationRead destinationDefinitionSpecificationRead) {
        this.destinationDefinitionSpecificationRead = destinationDefinitionSpecificationRead;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public GetDestinationDefinitionSpecificationResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Object with given id was not found.
     */
    
    public WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo;

    public GetDestinationDefinitionSpecificationResponse withNotFoundKnownExceptionInfo(WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo) {
        this.notFoundKnownExceptionInfo = notFoundKnownExceptionInfo;
        return this;
    }
    
    
    public Integer statusCode;

    public GetDestinationDefinitionSpecificationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetDestinationDefinitionSpecificationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetDestinationDefinitionSpecificationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
