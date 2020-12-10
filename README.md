# Blockchain Java SDK/Module

Java client library to use the IBM Cloud Blockchain **Service**.

**This module will allow you to use Java to leverage the same functionality seen in the [IBP APIs](https://cloud.ibm.com/apidocs/blockchain)**

<details>
<summary>Table of Contents</summary>

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Explore the SDK](#explore-the-sdk)
* [Using the SDK](#using-the-sdk)
  * [Constructing service clients](#constructing-service-clients)
  * [Authentication](#authentication)
  * [Receiving operation responses](#receiving-operation-responses)
  * [Error Handling](#error-handling)
* [Generation](#generation)
* [License](#license)

</details>

## Overview

The IBM Cloud Blockchain Java SDK allows developers to programmatically interact with the
IBM Cloud Blockchain service.

This repository is generated from an OpenAPI file that describes all available APIs.
It is recommended to read through the [IBP API docs](https://cloud.ibm.com/apidocs/blockchain#sdk) to see the list of capabilities.
Any issues with this SDK can be opened here or against the IBM Blockchain Platform service through IBM Cloud support.

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An [IBM Blockchain Platform Service instance](https://cloud.ibm.com/catalog/services/blockchain-platform)
* An IAM API key to allow the SDK to access your service instance. Create an account level api key [here](https://cloud.ibm.com/iam/apikeys) (alternatively you can create a service instance level api key from the IBM cloud UI).
* An installation of Java (version 8 or above) on your local machine.

## Installation

Currently the SDK is not published to Maven Central. It can be installed locally by clone the repository and running maven.
To build you must use a Java 8 SDK, and have Maven 3.6.3 installed

```
# using SDKMan to use an installed Java 8
sdk use java 8.0.275.hs-adpt

# clone the repository
git clone https://github.com/IBM-Blockchain/ibp-java-sdk

# Package and Install to the local maven repository
mvn package install
```


## Explore the SDK
This module is generated from an OpenAPI (swagger) file.
The same file populated our [IBP APIs documentation](https://cloud.ibm.com/apidocs/blockchain#sdk).
To find desired functionality start by browsing the [IBP APIs documentation](https://cloud.ibm.com/apidocs/blockchain#introduction).

## Using the SDK
This section provides general information on how to use the services contained in this SDK.

### Constructing service clients

Here's an example of how to construct an instance:
```java
// Most java editors will organize the imports
import com.ibm.cloud.blockchain.v3.Blockchain;
import com.ibm.cloud.blockchain.v3.model.*;
import com.ibm.cloud.sdk.core.*;

// Create an IAM authenticator.
IamAuthenticator authenticator = new IamAuthenticator(System.getenv("IAM_API_KEY"));

Blockchain bc = new Blockchain("myIbp", authenticator);
bc.setServiceUrl(System.getenv("IBP_SERVICE_INSTANCE_URL"));
// Service operations can now be called using the "client" variable.

```

### Authentication
Blockchain services use token-based Identity and Access Management (IAM) authentication.

IAM authentication uses an API key to obtain an access token, which is then used to authenticate
each API request.  Access tokens are valid for a limited amount of time and must be regenerated.

To provide credentials to the SDK, you supply either an IAM service **API key** or an **access token**:

- Specify the IAM API key to have the SDK manage the lifecycle of the access token.
The SDK requests an access token, ensures that the access token is valid, and refreshes it when
necessary.
- Specify the access token if you want to manage the lifecycle yourself.
For details, see [Authenticating with IAM tokens](https://cloud.ibm.com/docs/services/watson/getting-started-iam.html).


For more information on authentication, including the full set of authentication schemes supported by
the underlying Java Core library, see
[this page](https://github.com/IBM/java-sdk-core/blob/master/AUTHENTICATION.md).

### Receiving operation responses

The general approach to using the API is to 

- Create an 'options' object. This is done via a builder pattern
- Create a Call from the Blockchain Service API, passing in the options
- Execute this call, and get back a 'Response'
- This response object can be used to check the http code
- Extract the specific result object from the response
- Perform actions as you need

##### Example:
1. Here's an example of calling the `GetComponent` operation:
```java
	try {

			GetComponentOptions options = new GetComponentOptions.Builder()
							.cache(GetComponentOptions.Cache.SKIP).id(createdCaId)
							.deploymentAttrs(GetComponentOptions.DeploymentAttrs.INCLUDED).build();
			ServiceCall<GenericComponentResponse> call = bc.getComponent(options);
			Response<GenericComponentResponse> resp = call.execute();
		
			GenericComponentResponse actionresp = resp.getResult();
			assertEquals(200, resp.getStatusCode()); // remember to take action if not 200

			String dislayName = actionresp.getDisplayName();
			//... check the API docs for 
	} catch (ServiceResponseException e) {
			Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
			wrappedError.initCause(e);
			throw wrappedError;
	}
```

### Error Handling

The `Response<>` will contain the HTTP code, you need to check this and take action as needed.
Runtime Exeptions can be thrown for other situations including failure to get options that are semtantically correct.

As this is a runtime exception it needs to be caught explicilty. In order to get the maximum amount of information get the debugging information from the exception

```java
try {
	//...
} catch (ServiceResponseException e) {
	Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
	wrappedError.initCause(e);
	throw wrappedError;
}
```

## Generation
This is a note for developers of this repository on how to rebuild the SDK.
- this module was generated/built via the [IBM Cloud OpenAPI SDK generator](https://github.ibm.com/CloudEngineering/openapi-sdkgen)
    - [SDK generator overview](https://github.ibm.com/CloudEngineering/openapi-sdkgen/wiki/SDK-Gen-Overview)
    - [Configuration option code](https://github.ibm.com/CloudEngineering/openapi-sdkgen/blob/ab7d50a1dcdc707faad8cbe4f86de2d2ca510d24/src/main/java/com/ibm/sdk/codegen/IBMDefaultCodegen.java)
    - [IBP's OpenAPI source](https://github.ibm.com/cloud-api-docs/ibp/blob/master/ibp.yaml)
1. download the  latest sdk generator **release** (should see the java file `lib/openapi-sdkgen.jar`)
1. clone/download the IBP OpenAPI file
1. build command shell:
```
cd code/openapi-sdkgen
openapi-sdkgen.sh generate -g ibm-java --input-spec ./ibpv3-openapi.yaml --additional-properties initialize=true --apiref ./apiref-java.json -o ./modules_/ --api-package com.ibm.cloud --genITs

```

## License

The IBM Cloud Blockchain Java SDK is released under the Apache 2.0 license. The license's full text can be found in [LICENSE](LICENSE).