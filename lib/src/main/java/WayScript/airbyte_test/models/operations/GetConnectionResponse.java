/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetConnectionResponse {
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.ConnectionRead connectionRead;

    public GetConnectionResponse withConnectionRead(WayScript.airbyte_test.models.shared.ConnectionRead connectionRead) {
        this.connectionRead = connectionRead;
        return this;
    }
    
    
    public String contentType;

    public GetConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public GetConnectionResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Object with given id was not found.
     */
    
    public WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo;

    public GetConnectionResponse withNotFoundKnownExceptionInfo(WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo) {
        this.notFoundKnownExceptionInfo = notFoundKnownExceptionInfo;
        return this;
    }
    
    
    public Integer statusCode;

    public GetConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetConnectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
