# jobs

### Available Operations

* [cancelJob](#canceljob) - Cancels a job
* [getAttemptNormalizationStatusesForJob](#getattemptnormalizationstatusesforjob) - Get normalization status to determine if we can bypass normalization phase
* [getJobDebugInfo](#getjobdebuginfo) - Gets all information needed to debug this job
* [getJobInfo](#getjobinfo) - Get information about a job
* [getJobInfoLight](#getjobinfolight) - Get information about a job excluding attempt info and logs
* [getLastReplicationJob](#getlastreplicationjob)
* [listJobsFor](#listjobsfor) - Returns recent jobs for a connection. Jobs are returned in descending order by createdAt.

## cancelJob

Cancels a job

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CancelJobResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(197982L);            

            CancelJobResponse res = sdk.jobs.cancelJob(req);

            if (res.jobInfoRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getAttemptNormalizationStatusesForJob

Get normalization status to determine if we can bypass normalization phase

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(590998L);            

            GetAttemptNormalizationStatusesForJobResponse res = sdk.jobs.getAttemptNormalizationStatusesForJob(req);

            if (res.attemptNormalizationStatusReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getJobDebugInfo

Gets all information needed to debug this job

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetJobDebugInfoResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(404774L);            

            GetJobDebugInfoResponse res = sdk.jobs.getJobDebugInfo(req);

            if (res.jobDebugInfoRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getJobInfo

Get information about a job

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetJobInfoResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(832944L);            

            GetJobInfoResponse res = sdk.jobs.getJobInfo(req);

            if (res.jobInfoRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getJobInfoLight

Get information about a job excluding attempt info and logs

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetJobInfoLightResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(601277L);            

            GetJobInfoLightResponse res = sdk.jobs.getJobInfoLight(req);

            if (res.jobInfoLightRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getLastReplicationJob

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetLastReplicationJobResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("0c364b7c-15df-4bac-a188-b1c4ee2c8c6c");            

            GetLastReplicationJobResponse res = sdk.jobs.getLastReplicationJob(req);

            if (res.jobOptionalRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listJobsFor

Returns recent jobs for a connection. Jobs are returned in descending order by createdAt.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListJobsForResponse;
import WayScript.airbyte_test.models.shared.JobConfigType;
import WayScript.airbyte_test.models.shared.JobListRequestBody;
import WayScript.airbyte_test.models.shared.Pagination;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobListRequestBody req = new JobListRequestBody("recusandae",                 new WayScript.airbyte_test.models.shared.JobConfigType[]{{
                                add(JobConfigType.CHECK_CONNECTION_SOURCE),
                                add(JobConfigType.CHECK_CONNECTION_SOURCE),
                            }}) {{
                includingJobId = 982574L;
                pagination = new Pagination() {{
                    pageSize = 930877L;
                    rowOffset = 875452L;
                }};;
            }};            

            ListJobsForResponse res = sdk.jobs.listJobsFor(req);

            if (res.jobReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
