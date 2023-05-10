/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttemptInfoRead {
    @JsonProperty("attempt")
    public AttemptRead attempt;

    public AttemptInfoRead withAttempt(AttemptRead attempt) {
        this.attempt = attempt;
        return this;
    }
    
    @JsonProperty("logs")
    public LogRead logs;

    public AttemptInfoRead withLogs(LogRead logs) {
        this.logs = logs;
        return this;
    }
    
    public AttemptInfoRead(@JsonProperty("attempt") AttemptRead attempt, @JsonProperty("logs") LogRead logs) {
        this.attempt = attempt;
        this.logs = logs;
  }
}
