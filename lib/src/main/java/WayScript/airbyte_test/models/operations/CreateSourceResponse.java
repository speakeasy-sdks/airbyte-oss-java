/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateSourceResponse {
    
    public String contentType;

    public CreateSourceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public CreateSourceResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.SourceRead sourceRead;

    public CreateSourceResponse withSourceRead(WayScript.airbyte_test.models.shared.SourceRead sourceRead) {
        this.sourceRead = sourceRead;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateSourceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateSourceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateSourceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
