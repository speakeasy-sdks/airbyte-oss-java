/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobDebugInfoRead - Successful operation
 */
public class JobDebugInfoRead {
    @JsonProperty("attempts")
    public AttemptInfoRead[] attempts;

    public JobDebugInfoRead withAttempts(AttemptInfoRead[] attempts) {
        this.attempts = attempts;
        return this;
    }
    
    @JsonProperty("job")
    public JobDebugRead job;

    public JobDebugInfoRead withJob(JobDebugRead job) {
        this.job = job;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowState")
    public WorkflowStateRead workflowState;

    public JobDebugInfoRead withWorkflowState(WorkflowStateRead workflowState) {
        this.workflowState = workflowState;
        return this;
    }
    
    public JobDebugInfoRead(@JsonProperty("attempts") AttemptInfoRead[] attempts, @JsonProperty("job") JobDebugRead job) {
        this.attempts = attempts;
        this.job = job;
  }
}
