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

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(771632L);            

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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.CancelJobResponse](../../models/operations/CancelJobResponse.md)**


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

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(397014L);            

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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse](../../models/operations/GetAttemptNormalizationStatusesForJobResponse.md)**


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

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(339843L);            

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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetJobDebugInfoResponse](../../models/operations/GetJobDebugInfoResponse.md)**


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

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(704402L);            

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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetJobInfoResponse](../../models/operations/GetJobInfoResponse.md)**


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

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(218128L);            

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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetJobInfoLightResponse](../../models/operations/GetJobInfoLightResponse.md)**


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

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("4418e3bb-91c8-4d97-9e0e-8419d8f84f14");            

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

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [WayScript.airbyte_test.models.shared.ConnectionIdRequestBody](../../models/shared/ConnectionIdRequestBody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetLastReplicationJobResponse](../../models/operations/GetLastReplicationJobResponse.md)**


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

            WayScript.airbyte_test.models.shared.JobListRequestBody req = new JobListRequestBody("labore",                 new WayScript.airbyte_test.models.shared.JobConfigType[]{{
                                add(JobConfigType.CHECK_CONNECTION_DESTINATION),
                                add(JobConfigType.RESET_CONNECTION),
                                add(JobConfigType.CHECK_CONNECTION_SOURCE),
                                add(JobConfigType.DISCOVER_SCHEMA),
                            }}) {{
                includingJobId = 891302L;
                pagination = new Pagination() {{
                    pageSize = 817454L;
                    rowOffset = 789016L;
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

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [WayScript.airbyte_test.models.shared.JobListRequestBody](../../models/shared/JobListRequestBody.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[WayScript.airbyte_test.models.operations.ListJobsForResponse](../../models/operations/ListJobsForResponse.md)**

