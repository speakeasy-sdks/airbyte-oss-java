/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetDestinationResponse {
    
    public String contentType;

    public GetDestinationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.DestinationRead destinationRead;

    public GetDestinationResponse withDestinationRead(WayScript.airbyte_test.models.shared.DestinationRead destinationRead) {
        this.destinationRead = destinationRead;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public GetDestinationResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Object with given id was not found.
     */
    
    public WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo;

    public GetDestinationResponse withNotFoundKnownExceptionInfo(WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo) {
        this.notFoundKnownExceptionInfo = notFoundKnownExceptionInfo;
        return this;
    }
    
    
    public Integer statusCode;

    public GetDestinationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetDestinationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetDestinationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
