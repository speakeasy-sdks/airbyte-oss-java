/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobReadList - Successful operation
 */
public class JobReadList {
    @JsonProperty("jobs")
    public JobWithAttemptsRead[] jobs;

    public JobReadList withJobs(JobWithAttemptsRead[] jobs) {
        this.jobs = jobs;
        return this;
    }
    
    /**
     * the total count of jobs for the specified connection
     */
    @JsonProperty("totalJobCount")
    public Long totalJobCount;

    public JobReadList withTotalJobCount(Long totalJobCount) {
        this.totalJobCount = totalJobCount;
        return this;
    }
    
    public JobReadList(@JsonProperty("jobs") JobWithAttemptsRead[] jobs, @JsonProperty("totalJobCount") Long totalJobCount) {
        this.jobs = jobs;
        this.totalJobCount = totalJobCount;
  }
}
