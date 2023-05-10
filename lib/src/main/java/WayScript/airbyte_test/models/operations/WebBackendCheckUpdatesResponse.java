/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class WebBackendCheckUpdatesResponse {
    
    public String contentType;

    public WebBackendCheckUpdatesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public WebBackendCheckUpdatesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public WebBackendCheckUpdatesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.WebBackendCheckUpdatesRead webBackendCheckUpdatesRead;

    public WebBackendCheckUpdatesResponse withWebBackendCheckUpdatesRead(WayScript.airbyte_test.models.shared.WebBackendCheckUpdatesRead webBackendCheckUpdatesRead) {
        this.webBackendCheckUpdatesRead = webBackendCheckUpdatesRead;
        return this;
    }
    
    public WebBackendCheckUpdatesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
