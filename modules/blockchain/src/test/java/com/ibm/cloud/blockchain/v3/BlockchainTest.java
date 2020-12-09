/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.blockchain.v3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.blockchain.v3.model.ActionEnroll;
import com.ibm.cloud.blockchain.v3.model.ActionReenroll;
import com.ibm.cloud.blockchain.v3.model.ActionRenew;
import com.ibm.cloud.blockchain.v3.model.ActionsResponse;
import com.ibm.cloud.blockchain.v3.model.ArchiveNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.ArchiveResponse;
import com.ibm.cloud.blockchain.v3.model.Bccsp;
import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
import com.ibm.cloud.blockchain.v3.model.BccspSW;
import com.ibm.cloud.blockchain.v3.model.CaActionOptions;
import com.ibm.cloud.blockchain.v3.model.CaResponse;
import com.ibm.cloud.blockchain.v3.model.CacheFlushResponse;
import com.ibm.cloud.blockchain.v3.model.ClearCachesOptions;
import com.ibm.cloud.blockchain.v3.model.ClientAuth;
import com.ibm.cloud.blockchain.v3.model.ConfigCAAffiliations;
import com.ibm.cloud.blockchain.v3.model.ConfigCACa;
import com.ibm.cloud.blockchain.v3.model.ConfigCACfg;
import com.ibm.cloud.blockchain.v3.model.ConfigCACfgIdentities;
import com.ibm.cloud.blockchain.v3.model.ConfigCACors;
import com.ibm.cloud.blockchain.v3.model.ConfigCACreate;
import com.ibm.cloud.blockchain.v3.model.ConfigCACrl;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsr;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrCa;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrKeyrequest;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrNamesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigCADb;
import com.ibm.cloud.blockchain.v3.model.ConfigCADbTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCADbTlsClient;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIdemix;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediate;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateEnrollment;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateParentserver;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTlsClient;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistry;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigning;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigningDefault;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfiles;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesCa;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesCaCaconstraint;
import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCATls;
import com.ibm.cloud.blockchain.v3.model.ConfigCATlsClientauth;
import com.ibm.cloud.blockchain.v3.model.ConfigCAUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererCreate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneral;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneralUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAdminService;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincode;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeExternalBuildersItem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeGolang;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeLogging;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeSystem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerCreate;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerCreatePeer;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclientAddressOverridesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDiscovery;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossip;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipElection;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtData;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipState;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveDeliveryClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimits;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimitsConcurrency;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdatePeer;
import com.ibm.cloud.blockchain.v3.model.CreateCaBodyConfigOverride;
import com.ibm.cloud.blockchain.v3.model.CreateCaBodyResources;
import com.ibm.cloud.blockchain.v3.model.CreateCaBodyStorage;
import com.ibm.cloud.blockchain.v3.model.CreateCaOptions;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyResources;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyStorage;
import com.ibm.cloud.blockchain.v3.model.CreatePeerBodyStorage;
import com.ibm.cloud.blockchain.v3.model.CreatePeerOptions;
import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.CryptoObject;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollment;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentCa;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentTlsca;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectMsp;
import com.ibm.cloud.blockchain.v3.model.DeleteAllComponentsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteSigTxOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteSignatureCollectionResponse;
import com.ibm.cloud.blockchain.v3.model.EditAdminCertsOptions;
import com.ibm.cloud.blockchain.v3.model.EditAdminCertsResponse;
import com.ibm.cloud.blockchain.v3.model.EditCaOptions;
import com.ibm.cloud.blockchain.v3.model.EditLogSettingsBody;
import com.ibm.cloud.blockchain.v3.model.EditMspOptions;
import com.ibm.cloud.blockchain.v3.model.EditOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.EditPeerOptions;
import com.ibm.cloud.blockchain.v3.model.EditSettingsBodyInactivityTimeouts;
import com.ibm.cloud.blockchain.v3.model.EditSettingsOptions;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponse;
import com.ibm.cloud.blockchain.v3.model.GetComponentOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions;
import com.ibm.cloud.blockchain.v3.model.GetFabVersionsOptions;
import com.ibm.cloud.blockchain.v3.model.GetFabricVersionsResponse;
import com.ibm.cloud.blockchain.v3.model.GetHealthOptions;
import com.ibm.cloud.blockchain.v3.model.GetMSPCertificateResponse;
import com.ibm.cloud.blockchain.v3.model.GetMspCertificateOptions;
import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.GetNotificationsResponse;
import com.ibm.cloud.blockchain.v3.model.GetPostmanOptions;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponse;
import com.ibm.cloud.blockchain.v3.model.GetSettingsOptions;
import com.ibm.cloud.blockchain.v3.model.GetSwaggerOptions;
import com.ibm.cloud.blockchain.v3.model.Hsm;
import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMsp;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspCa;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspComponent;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspTlsca;
import com.ibm.cloud.blockchain.v3.model.ImportCaOptions;
import com.ibm.cloud.blockchain.v3.model.ImportMspOptions;
import com.ibm.cloud.blockchain.v3.model.ImportOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.ImportPeerOptions;
import com.ibm.cloud.blockchain.v3.model.ListComponentsOptions;
import com.ibm.cloud.blockchain.v3.model.ListNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsClient;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsServer;
import com.ibm.cloud.blockchain.v3.model.Metrics;
import com.ibm.cloud.blockchain.v3.model.MetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.MspCryptoCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoComp;
import com.ibm.cloud.blockchain.v3.model.MspCryptoField;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.MspResponse;
import com.ibm.cloud.blockchain.v3.model.NodeOu;
import com.ibm.cloud.blockchain.v3.model.OrdererActionOptions;
import com.ibm.cloud.blockchain.v3.model.OrdererResponse;
import com.ibm.cloud.blockchain.v3.model.PeerActionOptions;
import com.ibm.cloud.blockchain.v3.model.PeerResources;
import com.ibm.cloud.blockchain.v3.model.PeerResponse;
import com.ibm.cloud.blockchain.v3.model.RemoveComponentOptions;
import com.ibm.cloud.blockchain.v3.model.RemoveComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.RemoveMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectCouchDb;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV1;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV2;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.model.RestartAthenaResponse;
import com.ibm.cloud.blockchain.v3.model.RestartOptions;
import com.ibm.cloud.blockchain.v3.model.StorageObject;
import com.ibm.cloud.blockchain.v3.model.SubmitBlockOptions;
import com.ibm.cloud.blockchain.v3.model.UpdateCaBodyConfigOverride;
import com.ibm.cloud.blockchain.v3.model.UpdateCaBodyResources;
import com.ibm.cloud.blockchain.v3.model.UpdateCaOptions;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyCrypto;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyResources;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.UpdatePeerBodyCrypto;
import com.ibm.cloud.blockchain.v3.model.UpdatePeerOptions;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;

import com.ibm.cloud.blockchain.v3.utils.TestUtilities;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * Unit test class for the Blockchain service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({ "javax.net.ssl.*", "org.mockito.*" })
public class BlockchainTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Blockchain blockchainService;

  // Creates a mock set of environment variables that are returned by
  // EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    blockchainService = Blockchain.newInstance(serviceName);
    String url = server.url("/").toString();
    blockchainService.setServiceUrl(url);
  }

  /**
   * Negative Test - construct the service with a null authenticator.
   */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new Blockchain(serviceName, null);
  }

  @Test
  public void testGetComponentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"myca-2\", \"type\": \"fabric-ca\", \"display_name\": \"Example CA\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"msp\": {\"ca\": {\"name\": \"org1CA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"org1tlsCA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"location\": \"ibmcloud\", \"node_ou\": {\"enabled\": true}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String getComponentPath = "/ak/api/v3/components/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetComponentOptions model
    GetComponentOptions getComponentOptionsModel = new GetComponentOptions.Builder().id("testString")
        .deploymentAttrs("included").parsedCerts("included").cache("skip").caAttrs("included").build();

    // Invoke operation with valid options model (positive test)
    Response<GenericComponentResponse> response = blockchainService.getComponent(getComponentOptionsModel).execute();
    assertNotNull(response);
    GenericComponentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("deployment_attrs"), "included");
    assertEquals(query.get("parsed_certs"), "included");
    assertEquals(query.get("cache"), "skip");
    assertEquals(query.get("ca_attrs"), "included");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getComponentPath);
  }

  // Test the getComponent operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetComponentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.getComponent(null).execute();
  }

  @Test
  public void testRemoveComponentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"deleted\", \"type\": \"fabric-peer\", \"id\": \"component-1\", \"display_name\": \"My Peer\"}";
    String removeComponentPath = "/ak/api/v3/components/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveComponentOptions model
    RemoveComponentOptions removeComponentOptionsModel = new RemoveComponentOptions.Builder().id("testString").build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteComponentResponse> response = blockchainService.removeComponent(removeComponentOptionsModel)
        .execute();
    assertNotNull(response);
    DeleteComponentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeComponentPath);
  }

  // Test the removeComponent operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveComponentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.removeComponent(null).execute();
  }

  @Test
  public void testDeleteComponentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"deleted\", \"type\": \"fabric-peer\", \"id\": \"component-1\", \"display_name\": \"My Peer\"}";
    String deleteComponentPath = "/ak/api/v3/kubernetes/components/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteComponentOptions model
    DeleteComponentOptions deleteComponentOptionsModel = new DeleteComponentOptions.Builder().id("testString").build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteComponentResponse> response = blockchainService.deleteComponent(deleteComponentOptionsModel)
        .execute();
    assertNotNull(response);
    DeleteComponentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteComponentPath);
  }

  // Test the deleteComponent operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteComponentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.deleteComponent(null).execute();
  }

  @Test
  public void testCreateCaWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"display_name\": \"My CA\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"location\": \"ibmcloud\", \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String createCaPath = "/ak/api/v3/kubernetes/components/fabric-ca";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigCACors model
    ConfigCACors configCaCorsModel = new ConfigCACors.Builder().enabled(true)
        .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("*"))).build();

    // Construct an instance of the ConfigCATlsClientauth model
    ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder().type("noclientcert")
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the ConfigCATls model
    ConfigCATls configCaTlsModel = new ConfigCATls.Builder().keyfile("testString").certfile("testString")
        .clientauth(configCaTlsClientauthModel).build();

    // Construct an instance of the ConfigCACa model
    ConfigCACa configCaCaModel = new ConfigCACa.Builder().keyfile("testString").certfile("testString")
        .chainfile("testString").build();

    // Construct an instance of the ConfigCACrl model
    ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder().expiry("24h").build();

    // Construct an instance of the IdentityAttrs model
    IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder().hfRegistrarRoles("*").hfRegistrarDelegateRoles("*")
        .hfRevoker(true).hfIntermediateCa(true).hfGenCrl(true).hfRegistrarAttributes("*").hfAffiliationMgr(true)
        .build();

    // Construct an instance of the ConfigCARegistryIdentitiesItem model
    ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
        .name("admin").pass("password").type("client").maxenrollments(Double.valueOf("-1")).affiliation("testString")
        .attrs(identityAttrsModel).build();

    // Construct an instance of the ConfigCARegistry model
    ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder().maxenrollments(Double.valueOf("-1"))
        .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(
            java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
        .build();

    // Construct an instance of the ConfigCADbTlsClient model
    ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder().certfile("testString")
        .keyfile("testString").build();

    // Construct an instance of the ConfigCADbTls model
    ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .client(configCaDbTlsClientModel).enabled(false).build();

    // Construct an instance of the ConfigCADb model
    ConfigCADb configCaDbModel = new ConfigCADb.Builder().type("postgres").datasource(
        "host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full")
        .tls(configCaDbTlsModel).build();

    // Construct an instance of the ConfigCAAffiliations model
    ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
        .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
        .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1"))).add("foo", "testString").build();

    // Construct an instance of the ConfigCACsrKeyrequest model
    ConfigCACsrKeyrequest configCaCsrKeyrequestModel = new ConfigCACsrKeyrequest.Builder().algo("ecdsa")
        .size(Double.valueOf("256")).build();

    // Construct an instance of the ConfigCACsrNamesItem model
    ConfigCACsrNamesItem configCaCsrNamesItemModel = new ConfigCACsrNamesItem.Builder().c("US").st("North Carolina")
        .l("Raleigh").o("Hyperledger").ou("Fabric").build();

    // Construct an instance of the ConfigCACsrCa model
    ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder().expiry("131400h").pathlength(Double.valueOf("0"))
        .build();

    // Construct an instance of the ConfigCACsr model
    ConfigCACsr configCaCsrModel = new ConfigCACsr.Builder().cn("ca").keyrequest(configCaCsrKeyrequestModel)
        .names(new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)))
        .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("localhost"))).ca(configCaCsrCaModel).build();

    // Construct an instance of the ConfigCAIdemix model
    ConfigCAIdemix configCaIdemixModel = new ConfigCAIdemix.Builder().rhpoolsize(Double.valueOf("100"))
        .nonceexpiration("15s").noncesweepinterval("15m").build();

    // Construct an instance of the BccspSW model
    BccspSW bccspSwModel = new BccspSW.Builder().hash("SHA2").security(Double.valueOf("256")).build();

    // Construct an instance of the BccspPKCS11 model
    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder().label("testString").pin("testString").hash("SHA2")
        .security(Double.valueOf("256")).build();

    // Construct an instance of the Bccsp model
    Bccsp bccspModel = new Bccsp.Builder().xDefault("SW").sw(bccspSwModel).pkcS11(bccspPkcS11Model).build();

    // Construct an instance of the ConfigCAIntermediateParentserver model
    ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
        .url("testString").caname("testString").build();

    // Construct an instance of the ConfigCAIntermediateEnrollment model
    ConfigCAIntermediateEnrollment configCaIntermediateEnrollmentModel = new ConfigCAIntermediateEnrollment.Builder()
        .hosts("localhost").profile("testString").label("testString").build();

    // Construct an instance of the ConfigCAIntermediateTlsClient model
    ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
        .certfile("testString").keyfile("testString").build();

    // Construct an instance of the ConfigCAIntermediateTls model
    ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .client(configCaIntermediateTlsClientModel).build();

    // Construct an instance of the ConfigCAIntermediate model
    ConfigCAIntermediate configCaIntermediateModel = new ConfigCAIntermediate.Builder()
        .parentserver(configCaIntermediateParentserverModel).enrollment(configCaIntermediateEnrollmentModel)
        .tls(configCaIntermediateTlsModel).build();

    // Construct an instance of the ConfigCACfgIdentities model
    ConfigCACfgIdentities configCaCfgIdentitiesModel = new ConfigCACfgIdentities.Builder()
        .passwordattempts(Double.valueOf("10")).allowremove(false).build();

    // Construct an instance of the ConfigCACfg model
    ConfigCACfg configCaCfgModel = new ConfigCACfg.Builder().identities(configCaCfgIdentitiesModel).build();

    // Construct an instance of the MetricsStatsd model
    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder().network("udp").address("127.0.0.1:8125")
        .writeInterval("10s").prefix("server").build();

    // Construct an instance of the Metrics model
    Metrics metricsModel = new Metrics.Builder().provider("prometheus").statsd(metricsStatsdModel).build();

    // Construct an instance of the ConfigCASigningDefault model
    ConfigCASigningDefault configCaSigningDefaultModel = new ConfigCASigningDefault.Builder()
        .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign"))).expiry("8760h").build();

    // Construct an instance of the ConfigCASigningProfilesCaCaconstraint model
    ConfigCASigningProfilesCaCaconstraint configCaSigningProfilesCaCaconstraintModel = new ConfigCASigningProfilesCaCaconstraint.Builder()
        .isca(true).maxpathlen(Double.valueOf("0")).maxpathlenzero(true).build();

    // Construct an instance of the ConfigCASigningProfilesCa model
    ConfigCASigningProfilesCa configCaSigningProfilesCaModel = new ConfigCASigningProfilesCa.Builder()
        .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign"))).expiry("43800h")
        .caconstraint(configCaSigningProfilesCaCaconstraintModel).build();

    // Construct an instance of the ConfigCASigningProfilesTls model
    ConfigCASigningProfilesTls configCaSigningProfilesTlsModel = new ConfigCASigningProfilesTls.Builder()
        .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign"))).expiry("43800h").build();

    // Construct an instance of the ConfigCASigningProfiles model
    ConfigCASigningProfiles configCaSigningProfilesModel = new ConfigCASigningProfiles.Builder()
        .ca(configCaSigningProfilesCaModel).tls(configCaSigningProfilesTlsModel).build();

    // Construct an instance of the ConfigCASigning model
    ConfigCASigning configCaSigningModel = new ConfigCASigning.Builder().xDefault(configCaSigningDefaultModel)
        .profiles(configCaSigningProfilesModel).build();

    // Construct an instance of the ConfigCACreate model
    ConfigCACreate configCaCreateModel = new ConfigCACreate.Builder().cors(configCaCorsModel).debug(false)
        .crlsizelimit(Double.valueOf("512000")).tls(configCaTlsModel).ca(configCaCaModel).crl(configCaCrlModel)
        .registry(configCaRegistryModel).db(configCaDbModel).affiliations(configCaAffiliationsModel)
        .csr(configCaCsrModel).idemix(configCaIdemixModel).bccsp(bccspModel).intermediate(configCaIntermediateModel)
        .cfg(configCaCfgModel).metrics(metricsModel).signing(configCaSigningModel).build();

    // Construct an instance of the CreateCaBodyConfigOverride model
    CreateCaBodyConfigOverride createCaBodyConfigOverrideModel = new CreateCaBodyConfigOverride.Builder()
        .ca(configCaCreateModel).tlsca(configCaCreateModel).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the CreateCaBodyResources model
    CreateCaBodyResources createCaBodyResourcesModel = new CreateCaBodyResources.Builder().ca(resourceObjectModel)
        .build();

    // Construct an instance of the StorageObject model
    StorageObject storageObjectModel = new StorageObject.Builder().size("4GiB").xClass("default").build();

    // Construct an instance of the CreateCaBodyStorage model
    CreateCaBodyStorage createCaBodyStorageModel = new CreateCaBodyStorage.Builder().ca(storageObjectModel).build();

    // Construct an instance of the Hsm model
    Hsm hsmModel = new Hsm.Builder().pkcs11endpoint("tcp://example.com:666").build();

    // Construct an instance of the CreateCaOptions model
    CreateCaOptions createCaOptionsModel = new CreateCaOptions.Builder().displayName("My CA")
        .configOverride(createCaBodyConfigOverrideModel).resources(createCaBodyResourcesModel)
        .storage(createCaBodyStorageModel).zone("-").replicas(Double.valueOf("1"))
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).hsm(hsmModel).region("-")
        .version("1.4.6-1").build();

    // Invoke operation with valid options model (positive test)
    Response<CaResponse> response = blockchainService.createCa(createCaOptionsModel).execute();
    assertNotNull(response);
    CaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCaPath);
  }

  // Test the createCa operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCaNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.createCa(null).execute();
  }

  @Test
  public void testImportCaWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"display_name\": \"My CA\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"location\": \"ibmcloud\", \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String importCaPath = "/ak/api/v3/components/fabric-ca";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ImportCaBodyMspCa model
    ImportCaBodyMspCa importCaBodyMspCaModel = new ImportCaBodyMspCa.Builder().name("org1CA")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the ImportCaBodyMspTlsca model
    ImportCaBodyMspTlsca importCaBodyMspTlscaModel = new ImportCaBodyMspTlsca.Builder().name("org1tlsCA")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the ImportCaBodyMspComponent model
    ImportCaBodyMspComponent importCaBodyMspComponentModel = new ImportCaBodyMspComponent.Builder().tlsCert(
        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .build();

    // Construct an instance of the ImportCaBodyMsp model
    ImportCaBodyMsp importCaBodyMspModel = new ImportCaBodyMsp.Builder().ca(importCaBodyMspCaModel)
        .tlsca(importCaBodyMspTlscaModel).component(importCaBodyMspComponentModel).build();

    // Construct an instance of the ImportCaOptions model
    ImportCaOptions importCaOptionsModel = new ImportCaOptions.Builder().displayName("Sample CA")
        .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054").msp(importCaBodyMspModel)
        .location("ibmcloud").operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443")
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .build();

    // Invoke operation with valid options model (positive test)
    Response<CaResponse> response = blockchainService.importCa(importCaOptionsModel).execute();
    assertNotNull(response);
    CaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importCaPath);
  }

  // Test the importCa operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportCaNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.importCa(null).execute();
  }

  @Test
  public void testUpdateCaWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"display_name\": \"My CA\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"location\": \"ibmcloud\", \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String updateCaPath = "/ak/api/v3/kubernetes/components/fabric-ca/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigCACors model
    ConfigCACors configCaCorsModel = new ConfigCACors.Builder().enabled(true)
        .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("*"))).build();

    // Construct an instance of the ConfigCATlsClientauth model
    ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder().type("noclientcert")
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the ConfigCATls model
    ConfigCATls configCaTlsModel = new ConfigCATls.Builder().keyfile("testString").certfile("testString")
        .clientauth(configCaTlsClientauthModel).build();

    // Construct an instance of the ConfigCACa model
    ConfigCACa configCaCaModel = new ConfigCACa.Builder().keyfile("testString").certfile("testString")
        .chainfile("testString").build();

    // Construct an instance of the ConfigCACrl model
    ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder().expiry("24h").build();

    // Construct an instance of the IdentityAttrs model
    IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder().hfRegistrarRoles("*").hfRegistrarDelegateRoles("*")
        .hfRevoker(true).hfIntermediateCa(true).hfGenCrl(true).hfRegistrarAttributes("*").hfAffiliationMgr(true)
        .build();

    // Construct an instance of the ConfigCARegistryIdentitiesItem model
    ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
        .name("admin").pass("password").type("client").maxenrollments(Double.valueOf("-1")).affiliation("testString")
        .attrs(identityAttrsModel).build();

    // Construct an instance of the ConfigCARegistry model
    ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder().maxenrollments(Double.valueOf("-1"))
        .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(
            java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
        .build();

    // Construct an instance of the ConfigCADbTlsClient model
    ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder().certfile("testString")
        .keyfile("testString").build();

    // Construct an instance of the ConfigCADbTls model
    ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .client(configCaDbTlsClientModel).enabled(false).build();

    // Construct an instance of the ConfigCADb model
    ConfigCADb configCaDbModel = new ConfigCADb.Builder().type("postgres").datasource(
        "host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full")
        .tls(configCaDbTlsModel).build();

    // Construct an instance of the ConfigCAAffiliations model
    ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
        .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
        .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1"))).add("foo", "testString").build();

    // Construct an instance of the ConfigCACsrKeyrequest model
    ConfigCACsrKeyrequest configCaCsrKeyrequestModel = new ConfigCACsrKeyrequest.Builder().algo("ecdsa")
        .size(Double.valueOf("256")).build();

    // Construct an instance of the ConfigCACsrNamesItem model
    ConfigCACsrNamesItem configCaCsrNamesItemModel = new ConfigCACsrNamesItem.Builder().c("US").st("North Carolina")
        .l("Raleigh").o("Hyperledger").ou("Fabric").build();

    // Construct an instance of the ConfigCACsrCa model
    ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder().expiry("131400h").pathlength(Double.valueOf("0"))
        .build();

    // Construct an instance of the ConfigCACsr model
    ConfigCACsr configCaCsrModel = new ConfigCACsr.Builder().cn("ca").keyrequest(configCaCsrKeyrequestModel)
        .names(new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)))
        .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("localhost"))).ca(configCaCsrCaModel).build();

    // Construct an instance of the ConfigCAIdemix model
    ConfigCAIdemix configCaIdemixModel = new ConfigCAIdemix.Builder().rhpoolsize(Double.valueOf("100"))
        .nonceexpiration("15s").noncesweepinterval("15m").build();

    // Construct an instance of the BccspSW model
    BccspSW bccspSwModel = new BccspSW.Builder().hash("SHA2").security(Double.valueOf("256")).build();

    // Construct an instance of the BccspPKCS11 model
    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder().label("testString").pin("testString").hash("SHA2")
        .security(Double.valueOf("256")).build();

    // Construct an instance of the Bccsp model
    Bccsp bccspModel = new Bccsp.Builder().xDefault("SW").sw(bccspSwModel).pkcS11(bccspPkcS11Model).build();

    // Construct an instance of the ConfigCAIntermediateParentserver model
    ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
        .url("testString").caname("testString").build();

    // Construct an instance of the ConfigCAIntermediateEnrollment model
    ConfigCAIntermediateEnrollment configCaIntermediateEnrollmentModel = new ConfigCAIntermediateEnrollment.Builder()
        .hosts("localhost").profile("testString").label("testString").build();

    // Construct an instance of the ConfigCAIntermediateTlsClient model
    ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
        .certfile("testString").keyfile("testString").build();

    // Construct an instance of the ConfigCAIntermediateTls model
    ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
        .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .client(configCaIntermediateTlsClientModel).build();

    // Construct an instance of the ConfigCAIntermediate model
    ConfigCAIntermediate configCaIntermediateModel = new ConfigCAIntermediate.Builder()
        .parentserver(configCaIntermediateParentserverModel).enrollment(configCaIntermediateEnrollmentModel)
        .tls(configCaIntermediateTlsModel).build();

    // Construct an instance of the ConfigCACfgIdentities model
    ConfigCACfgIdentities configCaCfgIdentitiesModel = new ConfigCACfgIdentities.Builder()
        .passwordattempts(Double.valueOf("10")).allowremove(false).build();

    // Construct an instance of the ConfigCACfg model
    ConfigCACfg configCaCfgModel = new ConfigCACfg.Builder().identities(configCaCfgIdentitiesModel).build();

    // Construct an instance of the MetricsStatsd model
    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder().network("udp").address("127.0.0.1:8125")
        .writeInterval("10s").prefix("server").build();

    // Construct an instance of the Metrics model
    Metrics metricsModel = new Metrics.Builder().provider("prometheus").statsd(metricsStatsdModel).build();

    // Construct an instance of the ConfigCAUpdate model
    ConfigCAUpdate configCaUpdateModel = new ConfigCAUpdate.Builder().cors(configCaCorsModel).debug(false)
        .crlsizelimit(Double.valueOf("512000")).tls(configCaTlsModel).ca(configCaCaModel).crl(configCaCrlModel)
        .registry(configCaRegistryModel).db(configCaDbModel).affiliations(configCaAffiliationsModel)
        .csr(configCaCsrModel).idemix(configCaIdemixModel).bccsp(bccspModel).intermediate(configCaIntermediateModel)
        .cfg(configCaCfgModel).metrics(metricsModel).build();

    // Construct an instance of the UpdateCaBodyConfigOverride model
    UpdateCaBodyConfigOverride updateCaBodyConfigOverrideModel = new UpdateCaBodyConfigOverride.Builder()
        .ca(configCaUpdateModel).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the UpdateCaBodyResources model
    UpdateCaBodyResources updateCaBodyResourcesModel = new UpdateCaBodyResources.Builder().ca(resourceObjectModel)
        .build();

    // Construct an instance of the UpdateCaOptions model
    UpdateCaOptions updateCaOptionsModel = new UpdateCaOptions.Builder().id("testString")
        .configOverride(updateCaBodyConfigOverrideModel).replicas(Double.valueOf("1"))
        .resources(updateCaBodyResourcesModel).version("1.4.6-1").zone("-").build();

    // Invoke operation with valid options model (positive test)
    Response<CaResponse> response = blockchainService.updateCa(updateCaOptionsModel).execute();
    assertNotNull(response);
    CaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCaPath);
  }

  // Test the updateCa operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCaNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.updateCa(null).execute();
  }

  @Test
  public void testEditCaWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"display_name\": \"My CA\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"location\": \"ibmcloud\", \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String editCaPath = "/ak/api/v3/components/fabric-ca/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditCaOptions model
    EditCaOptions editCaOptionsModel = new EditCaOptions.Builder().id("testString").displayName("My CA")
        .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054")
        .operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443").caName("ca")
        .location("ibmcloud").tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).build();

    // Invoke operation with valid options model (positive test)
    Response<CaResponse> response = blockchainService.editCa(editCaOptionsModel).execute();
    assertNotNull(response);
    CaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editCaPath);
  }

  // Test the editCa operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditCaNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.editCa(null).execute();
  }

  @Test
  public void testCaActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"accepted\", \"id\": \"myca\", \"actions\": [\"restart\"]}";
    String caActionPath = "/ak/api/v3/kubernetes/components/fabric-ca/testString/actions";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(202)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ActionRenew model
    ActionRenew actionRenewModel = new ActionRenew.Builder().tlsCert(true).build();

    // Construct an instance of the CaActionOptions model
    CaActionOptions caActionOptionsModel = new CaActionOptions.Builder().id("testString").restart(true)
        .renew(actionRenewModel).build();

    // Invoke operation with valid options model (positive test)
    Response<ActionsResponse> response = blockchainService.caAction(caActionOptionsModel).execute();
    assertNotNull(response);
    ActionsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, caActionPath);
  }

  // Test the caAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCaActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.caAction(null).execute();
  }

  @Test
  public void testCreatePeerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"display_name\": \"My Peer\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String createPeerPath = "/ak/api/v3/kubernetes/components/fabric-peer";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CryptoEnrollmentComponent model
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
        .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the CryptoObjectEnrollmentCa model
    CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("ca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password").build();

    // Construct an instance of the CryptoObjectEnrollmentTlsca model
    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("tlsca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password")
        .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the CryptoObjectEnrollment model
    CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
        .component(cryptoEnrollmentComponentModel).ca(cryptoObjectEnrollmentCaModel)
        .tlsca(cryptoObjectEnrollmentTlscaModel).build();

    // Construct an instance of the ClientAuth model
    ClientAuth clientAuthModel = new ClientAuth.Builder().type("noclientcert")
        .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the MspCryptoComp model
    MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder().ekey("testString").ecert(
        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsKey("testString")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .clientAuth(clientAuthModel).build();

    // Construct an instance of the MspCryptoCa model
    MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the CryptoObjectMsp model
    CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder().component(mspCryptoCompModel)
        .ca(mspCryptoCaModel).tlsca(mspCryptoCaModel).build();

    // Construct an instance of the CryptoObject model
    CryptoObject cryptoObjectModel = new CryptoObject.Builder().enrollment(cryptoObjectEnrollmentModel)
        .msp(cryptoObjectMspModel).build();

    // Construct an instance of the ConfigPeerKeepaliveClient model
    ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder().interval("60s")
        .timeout("20s").build();

    // Construct an instance of the ConfigPeerKeepaliveDeliveryClient model
    ConfigPeerKeepaliveDeliveryClient configPeerKeepaliveDeliveryClientModel = new ConfigPeerKeepaliveDeliveryClient.Builder()
        .interval("60s").timeout("20s").build();

    // Construct an instance of the ConfigPeerKeepalive model
    ConfigPeerKeepalive configPeerKeepaliveModel = new ConfigPeerKeepalive.Builder().minInterval("60s")
        .client(configPeerKeepaliveClientModel).deliveryClient(configPeerKeepaliveDeliveryClientModel).build();

    // Construct an instance of the ConfigPeerGossipElection model
    ConfigPeerGossipElection configPeerGossipElectionModel = new ConfigPeerGossipElection.Builder()
        .startupGracePeriod("15s").membershipSampleInterval("1s").leaderAliveThreshold("10s")
        .leaderElectionDuration("5s").build();

    // Construct an instance of the
    // ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy model
    ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
        .requiredPeerCount(Double.valueOf("0")).maxPeerCount(Double.valueOf("1")).build();

    // Construct an instance of the ConfigPeerGossipPvtData model
    ConfigPeerGossipPvtData configPeerGossipPvtDataModel = new ConfigPeerGossipPvtData.Builder()
        .pullRetryThreshold("60s").transientstoreMaxBlockRetention(Double.valueOf("1000")).pushAckTimeout("3s")
        .btlPullMargin(Double.valueOf("10")).reconcileBatchSize(Double.valueOf("10")).reconcileSleepInterval("1m")
        .reconciliationEnabled(true).skipPullingInvalidTransactionsDuringCommit(false)
        .implicitCollectionDisseminationPolicy(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel)
        .build();

    // Construct an instance of the ConfigPeerGossipState model
    ConfigPeerGossipState configPeerGossipStateModel = new ConfigPeerGossipState.Builder().enabled(true)
        .checkInterval("10s").responseTimeout("3s").batchSize(Double.valueOf("10"))
        .blockBufferSize(Double.valueOf("100")).maxRetries(Double.valueOf("3")).build();

    // Construct an instance of the ConfigPeerGossip model
    ConfigPeerGossip configPeerGossipModel = new ConfigPeerGossip.Builder().useLeaderElection(true).orgLeader(false)
        .membershipTrackerInterval("5s").maxBlockCountToStore(Double.valueOf("100")).maxPropagationBurstLatency("10ms")
        .maxPropagationBurstSize(Double.valueOf("10")).propagateIterations(Double.valueOf("3")).pullInterval("4s")
        .pullPeerNum(Double.valueOf("3")).requestStateInfoInterval("4s").publishStateInfoInterval("4s")
        .stateInfoRetentionInterval("0s").publishCertPeriod("10s").skipBlockVerification(false).dialTimeout("3s")
        .connTimeout("2s").recvBuffSize(Double.valueOf("20")).sendBuffSize(Double.valueOf("200")).digestWaitTime("1s")
        .requestWaitTime("1500ms").responseWaitTime("2s").aliveTimeInterval("5s").aliveExpirationTimeout("25s")
        .reconnectInterval("25s").election(configPeerGossipElectionModel).pvtData(configPeerGossipPvtDataModel)
        .state(configPeerGossipStateModel).build();

    // Construct an instance of the ConfigPeerAuthentication model
    ConfigPeerAuthentication configPeerAuthenticationModel = new ConfigPeerAuthentication.Builder().timewindow("15m")
        .build();

    // Construct an instance of the BccspSW model
    BccspSW bccspSwModel = new BccspSW.Builder().hash("SHA2").security(Double.valueOf("256")).build();

    // Construct an instance of the BccspPKCS11 model
    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder().label("testString").pin("testString").hash("SHA2")
        .security(Double.valueOf("256")).build();

    // Construct an instance of the Bccsp model
    Bccsp bccspModel = new Bccsp.Builder().xDefault("SW").sw(bccspSwModel).pkcS11(bccspPkcS11Model).build();

    // Construct an instance of the ConfigPeerClient model
    ConfigPeerClient configPeerClientModel = new ConfigPeerClient.Builder().connTimeout("2s").build();

    // Construct an instance of the ConfigPeerDeliveryclientAddressOverridesItem
    // model
    ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItemModel = new ConfigPeerDeliveryclientAddressOverridesItem.Builder()
        .from("n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
        .to("n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050").caCertsFile("my-data/cert.pem").build();

    // Construct an instance of the ConfigPeerDeliveryclient model
    ConfigPeerDeliveryclient configPeerDeliveryclientModel = new ConfigPeerDeliveryclient.Builder()
        .reconnectTotalTimeThreshold("60m").connTimeout("2s").reConnectBackoffThreshold("60m")
        .addressOverrides(new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(
            java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)))
        .build();

    // Construct an instance of the ConfigPeerAdminService model
    ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
        .listenAddress("0.0.0.0:7051").build();

    // Construct an instance of the ConfigPeerDiscovery model
    ConfigPeerDiscovery configPeerDiscoveryModel = new ConfigPeerDiscovery.Builder().enabled(true)
        .authCacheEnabled(true).authCacheMaxSize(Double.valueOf("1000"))
        .authCachePurgeRetentionRatio(Double.valueOf("0.75")).orgMembersAllowedAccess(false).build();

    // Construct an instance of the ConfigPeerLimitsConcurrency model
    ConfigPeerLimitsConcurrency configPeerLimitsConcurrencyModel = new ConfigPeerLimitsConcurrency.Builder()
        .endorserService(Double.valueOf("2500")).deliverService(Double.valueOf("2500")).build();

    // Construct an instance of the ConfigPeerLimits model
    ConfigPeerLimits configPeerLimitsModel = new ConfigPeerLimits.Builder()
        .concurrency(configPeerLimitsConcurrencyModel).build();

    // Construct an instance of the ConfigPeerCreatePeer model
    ConfigPeerCreatePeer configPeerCreatePeerModel = new ConfigPeerCreatePeer.Builder().id("john-doe").networkId("dev")
        .keepalive(configPeerKeepaliveModel).gossip(configPeerGossipModel).authentication(configPeerAuthenticationModel)
        .bccsp(bccspModel).client(configPeerClientModel).deliveryclient(configPeerDeliveryclientModel)
        .adminService(configPeerAdminServiceModel).validatorPoolSize(Double.valueOf("8"))
        .discovery(configPeerDiscoveryModel).limits(configPeerLimitsModel).build();

    // Construct an instance of the ConfigPeerChaincodeGolang model
    ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
        .dynamicLink(false).build();

    // Construct an instance of the ConfigPeerChaincodeExternalBuildersItem model
    ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
        .path("/path/to/directory").name("descriptive-build-name")
        .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY"))).build();

    // Construct an instance of the ConfigPeerChaincodeSystem model
    ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder().cscc(true)
        .lscc(true).escc(true).vscc(true).qscc(true).build();

    // Construct an instance of the ConfigPeerChaincodeLogging model
    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder().level("info")
        .shim("warning")
        .format(
            "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
        .build();

    // Construct an instance of the ConfigPeerChaincode model
    ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
        .golang(configPeerChaincodeGolangModel)
        .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(
            java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
        .installTimeout("300s").startuptimeout("300s").executetimeout("30s").system(configPeerChaincodeSystemModel)
        .logging(configPeerChaincodeLoggingModel).build();

    // Construct an instance of the MetricsStatsd model
    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder().network("udp").address("127.0.0.1:8125")
        .writeInterval("10s").prefix("server").build();

    // Construct an instance of the Metrics model
    Metrics metricsModel = new Metrics.Builder().provider("prometheus").statsd(metricsStatsdModel).build();

    // Construct an instance of the ConfigPeerCreate model
    ConfigPeerCreate configPeerCreateModel = new ConfigPeerCreate.Builder().peer(configPeerCreatePeerModel)
        .chaincode(configPeerChaincodeModel).metrics(metricsModel).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObjectFabV2 model
    ResourceObjectFabV2 resourceObjectFabV2Model = new ResourceObjectFabV2.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObjectCouchDb model
    ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
        .requests(resourceRequestsModel).limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObjectFabV1 model
    ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the PeerResources model
    PeerResources peerResourcesModel = new PeerResources.Builder().chaincodelauncher(resourceObjectFabV2Model)
        .couchdb(resourceObjectCouchDbModel).statedb(resourceObjectModel).dind(resourceObjectFabV1Model)
        .fluentd(resourceObjectFabV1Model).peer(resourceObjectModel).proxy(resourceObjectModel).build();

    // Construct an instance of the StorageObject model
    StorageObject storageObjectModel = new StorageObject.Builder().size("4GiB").xClass("default").build();

    // Construct an instance of the CreatePeerBodyStorage model
    CreatePeerBodyStorage createPeerBodyStorageModel = new CreatePeerBodyStorage.Builder().peer(storageObjectModel)
        .statedb(storageObjectModel).build();

    // Construct an instance of the Hsm model
    Hsm hsmModel = new Hsm.Builder().pkcs11endpoint("tcp://example.com:666").build();

    // Construct an instance of the CreatePeerOptions model
    CreatePeerOptions createPeerOptionsModel = new CreatePeerOptions.Builder().mspId("Org1").displayName("My Peer")
        .crypto(cryptoObjectModel).configOverride(configPeerCreateModel).resources(peerResourcesModel)
        .storage(createPeerBodyStorageModel).zone("-").stateDb("couchdb")
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).hsm(hsmModel).region("-")
        .version("1.4.6-1").build();

    // Invoke operation with valid options model (positive test)
    Response<PeerResponse> response = blockchainService.createPeer(createPeerOptionsModel).execute();
    assertNotNull(response);
    PeerResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPeerPath);
  }

  // Test the createPeer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePeerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.createPeer(null).execute();
  }

  @Test
  public void testImportPeerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"display_name\": \"My Peer\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String importPeerPath = "/ak/api/v3/components/fabric-peer";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MspCryptoFieldCa model
    MspCryptoFieldCa mspCryptoFieldCaModel = new MspCryptoFieldCa.Builder().name("ca")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoFieldTlsca model
    MspCryptoFieldTlsca mspCryptoFieldTlscaModel = new MspCryptoFieldTlsca.Builder().name("tlsca")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoFieldComponent model
    MspCryptoFieldComponent mspCryptoFieldComponentModel = new MspCryptoFieldComponent.Builder().tlsCert(
        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .ecert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoField model
    MspCryptoField mspCryptoFieldModel = new MspCryptoField.Builder().ca(mspCryptoFieldCaModel)
        .tlsca(mspCryptoFieldTlscaModel).component(mspCryptoFieldComponentModel).build();

    // Construct an instance of the ImportPeerOptions model
    ImportPeerOptions importPeerOptionsModel = new ImportPeerOptions.Builder().displayName("My Peer")
        .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084").msp(mspCryptoFieldModel)
        .mspId("Org1").apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
        .location("ibmcloud").operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).build();

    // Invoke operation with valid options model (positive test)
    Response<PeerResponse> response = blockchainService.importPeer(importPeerOptionsModel).execute();
    assertNotNull(response);
    PeerResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importPeerPath);
  }

  // Test the importPeer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportPeerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.importPeer(null).execute();
  }

  @Test
  public void testEditPeerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"display_name\": \"My Peer\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String editPeerPath = "/ak/api/v3/components/fabric-peer/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditPeerOptions model
    EditPeerOptions editPeerOptionsModel = new EditPeerOptions.Builder().id("testString").displayName("My Peer")
        .apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
        .operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
        .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084").mspId("Org1")
        .location("ibmcloud").tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).build();

    // Invoke operation with valid options model (positive test)
    Response<PeerResponse> response = blockchainService.editPeer(editPeerOptionsModel).execute();
    assertNotNull(response);
    PeerResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editPeerPath);
  }

  // Test the editPeer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditPeerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.editPeer(null).execute();
  }

  @Test
  public void testPeerActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"accepted\", \"id\": \"myca\", \"actions\": [\"restart\"]}";
    String peerActionPath = "/ak/api/v3/kubernetes/components/fabric-peer/testString/actions";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(202)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ActionReenroll model
    ActionReenroll actionReenrollModel = new ActionReenroll.Builder().tlsCert(true).ecert(true).build();

    // Construct an instance of the ActionEnroll model
    ActionEnroll actionEnrollModel = new ActionEnroll.Builder().tlsCert(true).ecert(true).build();

    // Construct an instance of the PeerActionOptions model
    PeerActionOptions peerActionOptionsModel = new PeerActionOptions.Builder().id("testString").restart(true)
        .reenroll(actionReenrollModel).enroll(actionEnrollModel).upgradeDbs(true).build();

    // Invoke operation with valid options model (positive test)
    Response<ActionsResponse> response = blockchainService.peerAction(peerActionOptionsModel).execute();
    assertNotNull(response);
    ActionsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, peerActionPath);
  }

  // Test the peerAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPeerActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.peerAction(null).execute();
  }

  @Test
  public void testUpdatePeerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"display_name\": \"My Peer\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String updatePeerPath = "/ak/api/v3/kubernetes/components/fabric-peer/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigPeerKeepaliveClient model
    ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder().interval("60s")
        .timeout("20s").build();

    // Construct an instance of the ConfigPeerKeepaliveDeliveryClient model
    ConfigPeerKeepaliveDeliveryClient configPeerKeepaliveDeliveryClientModel = new ConfigPeerKeepaliveDeliveryClient.Builder()
        .interval("60s").timeout("20s").build();

    // Construct an instance of the ConfigPeerKeepalive model
    ConfigPeerKeepalive configPeerKeepaliveModel = new ConfigPeerKeepalive.Builder().minInterval("60s")
        .client(configPeerKeepaliveClientModel).deliveryClient(configPeerKeepaliveDeliveryClientModel).build();

    // Construct an instance of the ConfigPeerGossipElection model
    ConfigPeerGossipElection configPeerGossipElectionModel = new ConfigPeerGossipElection.Builder()
        .startupGracePeriod("15s").membershipSampleInterval("1s").leaderAliveThreshold("10s")
        .leaderElectionDuration("5s").build();

    // Construct an instance of the
    // ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy model
    ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
        .requiredPeerCount(Double.valueOf("0")).maxPeerCount(Double.valueOf("1")).build();

    // Construct an instance of the ConfigPeerGossipPvtData model
    ConfigPeerGossipPvtData configPeerGossipPvtDataModel = new ConfigPeerGossipPvtData.Builder()
        .pullRetryThreshold("60s").transientstoreMaxBlockRetention(Double.valueOf("1000")).pushAckTimeout("3s")
        .btlPullMargin(Double.valueOf("10")).reconcileBatchSize(Double.valueOf("10")).reconcileSleepInterval("1m")
        .reconciliationEnabled(true).skipPullingInvalidTransactionsDuringCommit(false)
        .implicitCollectionDisseminationPolicy(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel)
        .build();

    // Construct an instance of the ConfigPeerGossipState model
    ConfigPeerGossipState configPeerGossipStateModel = new ConfigPeerGossipState.Builder().enabled(true)
        .checkInterval("10s").responseTimeout("3s").batchSize(Double.valueOf("10"))
        .blockBufferSize(Double.valueOf("100")).maxRetries(Double.valueOf("3")).build();

    // Construct an instance of the ConfigPeerGossip model
    ConfigPeerGossip configPeerGossipModel = new ConfigPeerGossip.Builder().useLeaderElection(true).orgLeader(false)
        .membershipTrackerInterval("5s").maxBlockCountToStore(Double.valueOf("100")).maxPropagationBurstLatency("10ms")
        .maxPropagationBurstSize(Double.valueOf("10")).propagateIterations(Double.valueOf("3")).pullInterval("4s")
        .pullPeerNum(Double.valueOf("3")).requestStateInfoInterval("4s").publishStateInfoInterval("4s")
        .stateInfoRetentionInterval("0s").publishCertPeriod("10s").skipBlockVerification(false).dialTimeout("3s")
        .connTimeout("2s").recvBuffSize(Double.valueOf("20")).sendBuffSize(Double.valueOf("200")).digestWaitTime("1s")
        .requestWaitTime("1500ms").responseWaitTime("2s").aliveTimeInterval("5s").aliveExpirationTimeout("25s")
        .reconnectInterval("25s").election(configPeerGossipElectionModel).pvtData(configPeerGossipPvtDataModel)
        .state(configPeerGossipStateModel).build();

    // Construct an instance of the ConfigPeerAuthentication model
    ConfigPeerAuthentication configPeerAuthenticationModel = new ConfigPeerAuthentication.Builder().timewindow("15m")
        .build();

    // Construct an instance of the ConfigPeerClient model
    ConfigPeerClient configPeerClientModel = new ConfigPeerClient.Builder().connTimeout("2s").build();

    // Construct an instance of the ConfigPeerDeliveryclientAddressOverridesItem
    // model
    ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItemModel = new ConfigPeerDeliveryclientAddressOverridesItem.Builder()
        .from("n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
        .to("n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050").caCertsFile("my-data/cert.pem").build();

    // Construct an instance of the ConfigPeerDeliveryclient model
    ConfigPeerDeliveryclient configPeerDeliveryclientModel = new ConfigPeerDeliveryclient.Builder()
        .reconnectTotalTimeThreshold("60m").connTimeout("2s").reConnectBackoffThreshold("60m")
        .addressOverrides(new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(
            java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)))
        .build();

    // Construct an instance of the ConfigPeerAdminService model
    ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
        .listenAddress("0.0.0.0:7051").build();

    // Construct an instance of the ConfigPeerDiscovery model
    ConfigPeerDiscovery configPeerDiscoveryModel = new ConfigPeerDiscovery.Builder().enabled(true)
        .authCacheEnabled(true).authCacheMaxSize(Double.valueOf("1000"))
        .authCachePurgeRetentionRatio(Double.valueOf("0.75")).orgMembersAllowedAccess(false).build();

    // Construct an instance of the ConfigPeerLimitsConcurrency model
    ConfigPeerLimitsConcurrency configPeerLimitsConcurrencyModel = new ConfigPeerLimitsConcurrency.Builder()
        .endorserService(Double.valueOf("2500")).deliverService(Double.valueOf("2500")).build();

    // Construct an instance of the ConfigPeerLimits model
    ConfigPeerLimits configPeerLimitsModel = new ConfigPeerLimits.Builder()
        .concurrency(configPeerLimitsConcurrencyModel).build();

    // Construct an instance of the ConfigPeerUpdatePeer model
    ConfigPeerUpdatePeer configPeerUpdatePeerModel = new ConfigPeerUpdatePeer.Builder().id("john-doe").networkId("dev")
        .keepalive(configPeerKeepaliveModel).gossip(configPeerGossipModel).authentication(configPeerAuthenticationModel)
        .client(configPeerClientModel).deliveryclient(configPeerDeliveryclientModel)
        .adminService(configPeerAdminServiceModel).validatorPoolSize(Double.valueOf("8"))
        .discovery(configPeerDiscoveryModel).limits(configPeerLimitsModel).build();

    // Construct an instance of the ConfigPeerChaincodeGolang model
    ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
        .dynamicLink(false).build();

    // Construct an instance of the ConfigPeerChaincodeExternalBuildersItem model
    ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
        .path("/path/to/directory").name("descriptive-build-name")
        .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY"))).build();

    // Construct an instance of the ConfigPeerChaincodeSystem model
    ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder().cscc(true)
        .lscc(true).escc(true).vscc(true).qscc(true).build();

    // Construct an instance of the ConfigPeerChaincodeLogging model
    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder().level("info")
        .shim("warning")
        .format(
            "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
        .build();

    // Construct an instance of the ConfigPeerChaincode model
    ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
        .golang(configPeerChaincodeGolangModel)
        .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(
            java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
        .installTimeout("300s").startuptimeout("300s").executetimeout("30s").system(configPeerChaincodeSystemModel)
        .logging(configPeerChaincodeLoggingModel).build();

    // Construct an instance of the MetricsStatsd model
    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder().network("udp").address("127.0.0.1:8125")
        .writeInterval("10s").prefix("server").build();

    // Construct an instance of the Metrics model
    Metrics metricsModel = new Metrics.Builder().provider("prometheus").statsd(metricsStatsdModel).build();

    // Construct an instance of the ConfigPeerUpdate model
    ConfigPeerUpdate configPeerUpdateModel = new ConfigPeerUpdate.Builder().peer(configPeerUpdatePeerModel)
        .chaincode(configPeerChaincodeModel).metrics(metricsModel).build();

    // Construct an instance of the CryptoEnrollmentComponent model
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
        .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the UpdateEnrollmentCryptoFieldCa model
    UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("ca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password").build();

    // Construct an instance of the UpdateEnrollmentCryptoFieldTlsca model
    UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("tlsca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password")
        .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateEnrollmentCryptoField model
    UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
        .component(cryptoEnrollmentComponentModel).ca(updateEnrollmentCryptoFieldCaModel)
        .tlsca(updateEnrollmentCryptoFieldTlscaModel).build();

    // Construct an instance of the UpdateMspCryptoFieldCa model
    UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateMspCryptoFieldTlsca model
    UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the ClientAuth model
    ClientAuth clientAuthModel = new ClientAuth.Builder().type("noclientcert")
        .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateMspCryptoFieldComponent model
    UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
        .ekey("testString")
        .ecert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsKey("testString")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .clientAuth(clientAuthModel).build();

    // Construct an instance of the UpdateMspCryptoField model
    UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder().ca(updateMspCryptoFieldCaModel)
        .tlsca(updateMspCryptoFieldTlscaModel).component(updateMspCryptoFieldComponentModel).build();

    // Construct an instance of the UpdatePeerBodyCrypto model
    UpdatePeerBodyCrypto updatePeerBodyCryptoModel = new UpdatePeerBodyCrypto.Builder()
        .enrollment(updateEnrollmentCryptoFieldModel).msp(updateMspCryptoFieldModel).build();

    // Construct an instance of the NodeOu model
    NodeOu nodeOuModel = new NodeOu.Builder().enabled(true).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObjectFabV2 model
    ResourceObjectFabV2 resourceObjectFabV2Model = new ResourceObjectFabV2.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObjectCouchDb model
    ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
        .requests(resourceRequestsModel).limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the ResourceObjectFabV1 model
    ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the PeerResources model
    PeerResources peerResourcesModel = new PeerResources.Builder().chaincodelauncher(resourceObjectFabV2Model)
        .couchdb(resourceObjectCouchDbModel).statedb(resourceObjectModel).dind(resourceObjectFabV1Model)
        .fluentd(resourceObjectFabV1Model).peer(resourceObjectModel).proxy(resourceObjectModel).build();

    // Construct an instance of the UpdatePeerOptions model
    UpdatePeerOptions updatePeerOptionsModel = new UpdatePeerOptions.Builder().id("testString")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .configOverride(configPeerUpdateModel).crypto(updatePeerBodyCryptoModel).nodeOu(nodeOuModel)
        .replicas(Double.valueOf("1")).resources(peerResourcesModel).version("1.4.6-1").zone("-").build();

    // Invoke operation with valid options model (positive test)
    Response<PeerResponse> response = blockchainService.updatePeer(updatePeerOptionsModel).execute();
    assertNotNull(response);
    PeerResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePeerPath);
  }

  // Test the updatePeer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePeerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.updatePeer(null).execute();
  }

  @Test
  public void testCreateOrdererWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050\", \"display_name\": \"orderer\", \"grpcwp_url\": \"https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443\", \"orderer_type\": \"raft\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"consenter_proposal_fin\": true, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"system_channel_id\": \"testchainid\", \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String createOrdererPath = "/ak/api/v3/kubernetes/components/fabric-orderer";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CryptoEnrollmentComponent model
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
        .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the CryptoObjectEnrollmentCa model
    CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("ca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password").build();

    // Construct an instance of the CryptoObjectEnrollmentTlsca model
    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("tlsca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password")
        .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the CryptoObjectEnrollment model
    CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
        .component(cryptoEnrollmentComponentModel).ca(cryptoObjectEnrollmentCaModel)
        .tlsca(cryptoObjectEnrollmentTlscaModel).build();

    // Construct an instance of the ClientAuth model
    ClientAuth clientAuthModel = new ClientAuth.Builder().type("noclientcert")
        .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the MspCryptoComp model
    MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder().ekey("testString").ecert(
        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsKey("testString")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .clientAuth(clientAuthModel).build();

    // Construct an instance of the MspCryptoCa model
    MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the CryptoObjectMsp model
    CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder().component(mspCryptoCompModel)
        .ca(mspCryptoCaModel).tlsca(mspCryptoCaModel).build();

    // Construct an instance of the CryptoObject model
    CryptoObject cryptoObjectModel = new CryptoObject.Builder().enrollment(cryptoObjectEnrollmentModel)
        .msp(cryptoObjectMspModel).build();

    // Construct an instance of the ConfigOrdererKeepalive model
    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder().serverMinInterval("60s")
        .serverInterval("2h").serverTimeout("20s").build();

    // Construct an instance of the BccspSW model
    BccspSW bccspSwModel = new BccspSW.Builder().hash("SHA2").security(Double.valueOf("256")).build();

    // Construct an instance of the BccspPKCS11 model
    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder().label("testString").pin("testString").hash("SHA2")
        .security(Double.valueOf("256")).build();

    // Construct an instance of the Bccsp model
    Bccsp bccspModel = new Bccsp.Builder().xDefault("SW").sw(bccspSwModel).pkcS11(bccspPkcS11Model).build();

    // Construct an instance of the ConfigOrdererAuthentication model
    ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
        .timeWindow("15m").noExpirationChecks(false).build();

    // Construct an instance of the ConfigOrdererGeneral model
    ConfigOrdererGeneral configOrdererGeneralModel = new ConfigOrdererGeneral.Builder()
        .keepalive(configOrdererKeepaliveModel).bccsp(bccspModel).authentication(configOrdererAuthenticationModel)
        .build();

    // Construct an instance of the ConfigOrdererDebug model
    ConfigOrdererDebug configOrdererDebugModel = new ConfigOrdererDebug.Builder().broadcastTraceDir("testString")
        .deliverTraceDir("testString").build();

    // Construct an instance of the ConfigOrdererMetricsStatsd model
    ConfigOrdererMetricsStatsd configOrdererMetricsStatsdModel = new ConfigOrdererMetricsStatsd.Builder().network("udp")
        .address("127.0.0.1:8125").writeInterval("10s").prefix("server").build();

    // Construct an instance of the ConfigOrdererMetrics model
    ConfigOrdererMetrics configOrdererMetricsModel = new ConfigOrdererMetrics.Builder().provider("disabled")
        .statsd(configOrdererMetricsStatsdModel).build();

    // Construct an instance of the ConfigOrdererCreate model
    ConfigOrdererCreate configOrdererCreateModel = new ConfigOrdererCreate.Builder().general(configOrdererGeneralModel)
        .debug(configOrdererDebugModel).metrics(configOrdererMetricsModel).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the CreateOrdererRaftBodyResources model
    CreateOrdererRaftBodyResources createOrdererRaftBodyResourcesModel = new CreateOrdererRaftBodyResources.Builder()
        .orderer(resourceObjectModel).proxy(resourceObjectModel).build();

    // Construct an instance of the StorageObject model
    StorageObject storageObjectModel = new StorageObject.Builder().size("4GiB").xClass("default").build();

    // Construct an instance of the CreateOrdererRaftBodyStorage model
    CreateOrdererRaftBodyStorage createOrdererRaftBodyStorageModel = new CreateOrdererRaftBodyStorage.Builder()
        .orderer(storageObjectModel).build();

    // Construct an instance of the Hsm model
    Hsm hsmModel = new Hsm.Builder().pkcs11endpoint("tcp://example.com:666").build();

    // Construct an instance of the CreateOrdererOptions model
    CreateOrdererOptions createOrdererOptionsModel = new CreateOrdererOptions.Builder().ordererType("raft")
        .mspId("Org1").displayName("orderer")
        .crypto(new java.util.ArrayList<CryptoObject>(java.util.Arrays.asList(cryptoObjectModel)))
        .clusterName("ordering service 1").clusterId("abcde").externalAppend("false")
        .configOverride(new java.util.ArrayList<ConfigOrdererCreate>(java.util.Arrays.asList(configOrdererCreateModel)))
        .resources(createOrdererRaftBodyResourcesModel).storage(createOrdererRaftBodyStorageModel)
        .systemChannelId("testchainid").zone(new java.util.ArrayList<String>(java.util.Arrays.asList("-")))
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
        .region(new java.util.ArrayList<String>(java.util.Arrays.asList("-"))).hsm(hsmModel).version("1.4.6-1").build();

    // Invoke operation with valid options model (positive test)
    Response<OrdererResponse> response = blockchainService.createOrderer(createOrdererOptionsModel).execute();
    assertNotNull(response);
    OrdererResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createOrdererPath);
  }

  // Test the createOrderer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateOrdererNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.createOrderer(null).execute();
  }

  @Test
  public void testImportOrdererWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050\", \"display_name\": \"orderer\", \"grpcwp_url\": \"https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443\", \"orderer_type\": \"raft\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"consenter_proposal_fin\": true, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"system_channel_id\": \"testchainid\", \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String importOrdererPath = "/ak/api/v3/components/fabric-orderer";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MspCryptoFieldCa model
    MspCryptoFieldCa mspCryptoFieldCaModel = new MspCryptoFieldCa.Builder().name("ca")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoFieldTlsca model
    MspCryptoFieldTlsca mspCryptoFieldTlscaModel = new MspCryptoFieldTlsca.Builder().name("tlsca")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoFieldComponent model
    MspCryptoFieldComponent mspCryptoFieldComponentModel = new MspCryptoFieldComponent.Builder().tlsCert(
        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .ecert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the MspCryptoField model
    MspCryptoField mspCryptoFieldModel = new MspCryptoField.Builder().ca(mspCryptoFieldCaModel)
        .tlsca(mspCryptoFieldTlscaModel).component(mspCryptoFieldComponentModel).build();

    // Construct an instance of the ImportOrdererOptions model
    ImportOrdererOptions importOrdererOptionsModel = new ImportOrdererOptions.Builder()
        .clusterName("ordering service 1").displayName("orderer")
        .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443")
        .msp(mspCryptoFieldModel).mspId("Org1")
        .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050").clusterId("testString")
        .location("ibmcloud").operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
        .systemChannelId("testchainid").tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
        .build();

    // Invoke operation with valid options model (positive test)
    Response<OrdererResponse> response = blockchainService.importOrderer(importOrdererOptionsModel).execute();
    assertNotNull(response);
    OrdererResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importOrdererPath);
  }

  // Test the importOrderer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportOrdererNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.importOrderer(null).execute();
  }

  @Test
  public void testEditOrdererWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050\", \"display_name\": \"orderer\", \"grpcwp_url\": \"https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443\", \"orderer_type\": \"raft\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"consenter_proposal_fin\": true, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"system_channel_id\": \"testchainid\", \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String editOrdererPath = "/ak/api/v3/components/fabric-orderer/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditOrdererOptions model
    EditOrdererOptions editOrdererOptionsModel = new EditOrdererOptions.Builder().id("testString")
        .clusterName("ordering service 1").displayName("orderer")
        .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
        .operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
        .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443").mspId("Org1")
        .consenterProposalFin(true).location("ibmcloud").systemChannelId("testchainid")
        .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca"))).build();

    // Invoke operation with valid options model (positive test)
    Response<OrdererResponse> response = blockchainService.editOrderer(editOrdererOptionsModel).execute();
    assertNotNull(response);
    OrdererResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editOrdererPath);
  }

  // Test the editOrderer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditOrdererNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.editOrderer(null).execute();
  }

  @Test
  public void testOrdererActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"accepted\", \"id\": \"myca\", \"actions\": [\"restart\"]}";
    String ordererActionPath = "/ak/api/v3/kubernetes/components/fabric-orderer/testString/actions";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(202)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ActionReenroll model
    ActionReenroll actionReenrollModel = new ActionReenroll.Builder().tlsCert(true).ecert(true).build();

    // Construct an instance of the ActionEnroll model
    ActionEnroll actionEnrollModel = new ActionEnroll.Builder().tlsCert(true).ecert(true).build();

    // Construct an instance of the OrdererActionOptions model
    OrdererActionOptions ordererActionOptionsModel = new OrdererActionOptions.Builder().id("testString").restart(true)
        .reenroll(actionReenrollModel).enroll(actionEnrollModel).build();

    // Invoke operation with valid options model (positive test)
    Response<ActionsResponse> response = blockchainService.ordererAction(ordererActionOptionsModel).execute();
    assertNotNull(response);
    ActionsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, ordererActionPath);
  }

  // Test the ordererAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testOrdererActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.ordererAction(null).execute();
  }

  @Test
  public void testUpdateOrdererWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"dep_component_id\": \"admin\", \"api_url\": \"grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050\", \"display_name\": \"orderer\", \"grpcwp_url\": \"https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443\", \"location\": \"ibmcloud\", \"operations_url\": \"https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443\", \"orderer_type\": \"raft\", \"config_override\": {\"mapKey\": \"anyValue\"}, \"consenter_proposal_fin\": true, \"node_ou\": {\"enabled\": true}, \"msp\": {\"ca\": {\"name\": \"ca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"tlsca\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"resources\": {\"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"storage\": {\"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"system_channel_id\": \"testchainid\", \"tags\": [\"fabric-ca\"], \"timestamp\": 1537262855753, \"type\": \"fabric-peer\", \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String updateOrdererPath = "/ak/api/v3/kubernetes/components/fabric-orderer/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigOrdererKeepalive model
    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder().serverMinInterval("60s")
        .serverInterval("2h").serverTimeout("20s").build();

    // Construct an instance of the ConfigOrdererAuthentication model
    ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
        .timeWindow("15m").noExpirationChecks(false).build();

    // Construct an instance of the ConfigOrdererGeneralUpdate model
    ConfigOrdererGeneralUpdate configOrdererGeneralUpdateModel = new ConfigOrdererGeneralUpdate.Builder()
        .keepalive(configOrdererKeepaliveModel).authentication(configOrdererAuthenticationModel).build();

    // Construct an instance of the ConfigOrdererDebug model
    ConfigOrdererDebug configOrdererDebugModel = new ConfigOrdererDebug.Builder().broadcastTraceDir("testString")
        .deliverTraceDir("testString").build();

    // Construct an instance of the ConfigOrdererMetricsStatsd model
    ConfigOrdererMetricsStatsd configOrdererMetricsStatsdModel = new ConfigOrdererMetricsStatsd.Builder().network("udp")
        .address("127.0.0.1:8125").writeInterval("10s").prefix("server").build();

    // Construct an instance of the ConfigOrdererMetrics model
    ConfigOrdererMetrics configOrdererMetricsModel = new ConfigOrdererMetrics.Builder().provider("disabled")
        .statsd(configOrdererMetricsStatsdModel).build();

    // Construct an instance of the ConfigOrdererUpdate model
    ConfigOrdererUpdate configOrdererUpdateModel = new ConfigOrdererUpdate.Builder()
        .general(configOrdererGeneralUpdateModel).debug(configOrdererDebugModel).metrics(configOrdererMetricsModel)
        .build();

    // Construct an instance of the CryptoEnrollmentComponent model
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
        .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Construct an instance of the UpdateEnrollmentCryptoFieldCa model
    UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("ca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password").build();

    // Construct an instance of the UpdateEnrollmentCryptoFieldTlsca model
    UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
        .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud").port(Double.valueOf("7054")).name("tlsca")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .enrollId("admin").enrollSecret("password")
        .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateEnrollmentCryptoField model
    UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
        .component(cryptoEnrollmentComponentModel).ca(updateEnrollmentCryptoFieldCaModel)
        .tlsca(updateEnrollmentCryptoFieldTlscaModel).build();

    // Construct an instance of the UpdateMspCryptoFieldCa model
    UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateMspCryptoFieldTlsca model
    UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the ClientAuth model
    ClientAuth clientAuthModel = new ClientAuth.Builder().type("noclientcert")
        .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))).build();

    // Construct an instance of the UpdateMspCryptoFieldComponent model
    UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
        .ekey("testString")
        .ecert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsKey("testString")
        .tlsCert(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
        .clientAuth(clientAuthModel).build();

    // Construct an instance of the UpdateMspCryptoField model
    UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder().ca(updateMspCryptoFieldCaModel)
        .tlsca(updateMspCryptoFieldTlscaModel).component(updateMspCryptoFieldComponentModel).build();

    // Construct an instance of the UpdateOrdererBodyCrypto model
    UpdateOrdererBodyCrypto updateOrdererBodyCryptoModel = new UpdateOrdererBodyCrypto.Builder()
        .enrollment(updateEnrollmentCryptoFieldModel).msp(updateMspCryptoFieldModel).build();

    // Construct an instance of the NodeOu model
    NodeOu nodeOuModel = new NodeOu.Builder().enabled(true).build();

    // Construct an instance of the ResourceRequests model
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceLimits model
    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder().cpu("100m").memory("256MiB").build();

    // Construct an instance of the ResourceObject model
    ResourceObject resourceObjectModel = new ResourceObject.Builder().requests(resourceRequestsModel)
        .limits(resourceLimitsModel).build();

    // Construct an instance of the UpdateOrdererBodyResources model
    UpdateOrdererBodyResources updateOrdererBodyResourcesModel = new UpdateOrdererBodyResources.Builder()
        .orderer(resourceObjectModel).proxy(resourceObjectModel).build();

    // Construct an instance of the UpdateOrdererOptions model
    UpdateOrdererOptions updateOrdererOptionsModel = new UpdateOrdererOptions.Builder().id("testString")
        .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .configOverride(configOrdererUpdateModel).crypto(updateOrdererBodyCryptoModel).nodeOu(nodeOuModel)
        .replicas(Double.valueOf("1")).resources(updateOrdererBodyResourcesModel).version("1.4.6-1").zone("-").build();

    // Invoke operation with valid options model (positive test)
    Response<OrdererResponse> response = blockchainService.updateOrderer(updateOrdererOptionsModel).execute();
    assertNotNull(response);
    OrdererResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOrdererPath);
  }

  // Test the updateOrderer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateOrdererNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.updateOrderer(null).execute();
  }

  @Test
  public void testSubmitBlockWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"myca-2\", \"type\": \"fabric-ca\", \"display_name\": \"Example CA\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"msp\": {\"ca\": {\"name\": \"org1CA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"org1tlsCA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"location\": \"ibmcloud\", \"node_ou\": {\"enabled\": true}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"version\": \"1.4.6-1\", \"zone\": \"-\"}";
    String submitBlockPath = "/ak/api/v3/kubernetes/components/testString/config";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SubmitBlockOptions model
    SubmitBlockOptions submitBlockOptionsModel = new SubmitBlockOptions.Builder().id("testString").b64Block(
        "bWFzc2l2ZSBiaW5hcnkgb2YgYSBjb25maWcgYmxvY2sgd291bGQgYmUgaGVyZSBpZiB0aGlzIHdhcyByZWFsLCBwbGVhc2UgZG9udCBzZW5kIHRoaXM=")
        .build();

    // Invoke operation with valid options model (positive test)
    Response<GenericComponentResponse> response = blockchainService.submitBlock(submitBlockOptionsModel).execute();
    assertNotNull(response);
    GenericComponentResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, submitBlockPath);
  }

  // Test the submitBlock operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubmitBlockNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.submitBlock(null).execute();
  }

  @Test
  public void testImportMspWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"type\": \"fabric-peer\", \"display_name\": \"My Peer\", \"msp_id\": \"Org1\", \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"intermediate_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K\"], \"admins\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"scheme_version\": \"v1\", \"tls_root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}";
    String importMspPath = "/ak/api/v3/components/msp";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ImportMspOptions model
    ImportMspOptions importMspOptionsModel = new ImportMspOptions.Builder().mspId("Org1").displayName("My Peer")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .intermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K")))
        .admins(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsRootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Invoke operation with valid options model (positive test)
    Response<MspResponse> response = blockchainService.importMsp(importMspOptionsModel).execute();
    assertNotNull(response);
    MspResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importMspPath);
  }

  // Test the importMsp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportMspNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.importMsp(null).execute();
  }

  @Test
  public void testEditMspWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"component-1\", \"type\": \"fabric-peer\", \"display_name\": \"My Peer\", \"msp_id\": \"Org1\", \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"intermediate_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K\"], \"admins\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"scheme_version\": \"v1\", \"tls_root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}";
    String editMspPath = "/ak/api/v3/components/msp/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditMspOptions model
    EditMspOptions editMspOptionsModel = new EditMspOptions.Builder().id("testString").mspId("Org1")
        .displayName("My Peer")
        .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .intermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K")))
        .admins(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .tlsRootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Invoke operation with valid options model (positive test)
    Response<MspResponse> response = blockchainService.editMsp(editMspOptionsModel).execute();
    assertNotNull(response);
    MspResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editMspPath);
  }

  // Test the editMsp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditMspNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.editMsp(null).execute();
  }

  @Test
  public void testGetMspCertificateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"msps\": [{\"msp_id\": \"Org1\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"admins\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"], \"tls_root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}]}";
    String getMspCertificatePath = "/ak/api/v3/components/msps/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMspCertificateOptions model
    GetMspCertificateOptions getMspCertificateOptionsModel = new GetMspCertificateOptions.Builder().mspId("testString")
        .cache("skip").build();

    // Invoke operation with valid options model (positive test)
    Response<GetMSPCertificateResponse> response = blockchainService.getMspCertificate(getMspCertificateOptionsModel)
        .execute();
    assertNotNull(response);
    GetMSPCertificateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("cache"), "skip");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMspCertificatePath);
  }

  // Test the getMspCertificate operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMspCertificateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.getMspCertificate(null).execute();
  }

  @Test
  public void testEditAdminCertsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"changes_made\": 1, \"set_admin_certs\": [{\"base_64_pem\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"issuer\": \"/C=US/ST=North Carolina/O=Hyperledger/OU=Fabric/CN=fabric-ca-server\", \"not_after_ts\": 1597770420000, \"not_before_ts\": 1566234120000, \"serial_number_hex\": \"649a1206fd0bc8be994886dd715cecb0a7a21276\", \"signature_algorithm\": \"SHA256withECDSA\", \"subject\": \"/OU=client/CN=admin\", \"X509_version\": 3, \"time_left\": \"10 hrs\"}]}";
    String editAdminCertsPath = "/ak/api/v3/kubernetes/components/testString/certs";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditAdminCertsOptions model
    EditAdminCertsOptions editAdminCertsOptionsModel = new EditAdminCertsOptions.Builder().id("testString")
        .appendAdminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .removeAdminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList(
            "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
        .build();

    // Invoke operation with valid options model (positive test)
    Response<EditAdminCertsResponse> response = blockchainService.editAdminCerts(editAdminCertsOptionsModel).execute();
    assertNotNull(response);
    EditAdminCertsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editAdminCertsPath);
  }

  // Test the editAdminCerts operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditAdminCertsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.editAdminCerts(null).execute();
  }

  @Test
  public void testListComponentsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"components\": [{\"id\": \"myca-2\", \"type\": \"fabric-ca\", \"display_name\": \"Example CA\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"msp\": {\"ca\": {\"name\": \"org1CA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"org1tlsCA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"location\": \"ibmcloud\", \"node_ou\": {\"enabled\": true}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"version\": \"1.4.6-1\", \"zone\": \"-\"}]}";
    String listComponentsPath = "/ak/api/v3/components";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListComponentsOptions model
    ListComponentsOptions listComponentsOptionsModel = new ListComponentsOptions.Builder().deploymentAttrs("included")
        .parsedCerts("included").cache("skip").caAttrs("included").build();

    // Invoke operation with valid options model (positive test)
    Response<GetMultiComponentsResponse> response = blockchainService.listComponents(listComponentsOptionsModel)
        .execute();
    assertNotNull(response);
    GetMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("deployment_attrs"), "included");
    assertEquals(query.get("parsed_certs"), "included");
    assertEquals(query.get("cache"), "skip");
    assertEquals(query.get("ca_attrs"), "included");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listComponentsPath);
  }

  @Test
  public void testGetComponentsByTypeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"components\": [{\"id\": \"myca-2\", \"type\": \"fabric-ca\", \"display_name\": \"Example CA\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"msp\": {\"ca\": {\"name\": \"org1CA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"org1tlsCA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"location\": \"ibmcloud\", \"node_ou\": {\"enabled\": true}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"version\": \"1.4.6-1\", \"zone\": \"-\"}]}";
    String getComponentsByTypePath = "/ak/api/v3/components/types/fabric-peer";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetComponentsByTypeOptions model
    GetComponentsByTypeOptions getComponentsByTypeOptionsModel = new GetComponentsByTypeOptions.Builder()
        .type("fabric-peer").deploymentAttrs("included").parsedCerts("included").cache("skip").build();

    // Invoke operation with valid options model (positive test)
    Response<GetMultiComponentsResponse> response = blockchainService
        .getComponentsByType(getComponentsByTypeOptionsModel).execute();
    assertNotNull(response);
    GetMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("deployment_attrs"), "included");
    assertEquals(query.get("parsed_certs"), "included");
    assertEquals(query.get("cache"), "skip");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getComponentsByTypePath);
  }

  // Test the getComponentsByType operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetComponentsByTypeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.getComponentsByType(null).execute();
  }

  @Test
  public void testGetComponentsByTagWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"components\": [{\"id\": \"myca-2\", \"type\": \"fabric-ca\", \"display_name\": \"Example CA\", \"grpcwp_url\": \"https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084\", \"api_url\": \"grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051\", \"operations_url\": \"https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443\", \"msp\": {\"ca\": {\"name\": \"org1CA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"tlsca\": {\"name\": \"org1tlsCA\", \"root_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}, \"component\": {\"tls_cert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"ecert\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\", \"admin_certs\": [\"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\"]}}, \"msp_id\": \"Org1\", \"location\": \"ibmcloud\", \"node_ou\": {\"enabled\": true}, \"resources\": {\"ca\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"peer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"orderer\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"proxy\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}, \"statedb\": {\"requests\": {\"cpu\": \"100m\", \"memory\": \"256M\"}, \"limits\": {\"cpu\": \"8000m\", \"memory\": \"16384M\"}}}, \"scheme_version\": \"v1\", \"state_db\": \"couchdb\", \"storage\": {\"ca\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"peer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"orderer\": {\"size\": \"4GiB\", \"class\": \"default\"}, \"statedb\": {\"size\": \"4GiB\", \"class\": \"default\"}}, \"timestamp\": 1537262855753, \"tags\": [\"fabric-ca\"], \"version\": \"1.4.6-1\", \"zone\": \"-\"}]}";
    String getComponentsByTagPath = "/ak/api/v3/components/tags/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetComponentsByTagOptions model
    GetComponentsByTagOptions getComponentsByTagOptionsModel = new GetComponentsByTagOptions.Builder().tag("testString")
        .deploymentAttrs("included").parsedCerts("included").cache("skip").build();

    // Invoke operation with valid options model (positive test)
    Response<GetMultiComponentsResponse> response = blockchainService.getComponentsByTag(getComponentsByTagOptionsModel)
        .execute();
    assertNotNull(response);
    GetMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("deployment_attrs"), "included");
    assertEquals(query.get("parsed_certs"), "included");
    assertEquals(query.get("cache"), "skip");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getComponentsByTagPath);
  }

  // Test the getComponentsByTag operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetComponentsByTagNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.getComponentsByTag(null).execute();
  }

  @Test
  public void testRemoveComponentsByTagWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"removed\": [{\"message\": \"deleted\", \"type\": \"fabric-peer\", \"id\": \"component-1\", \"display_name\": \"My Peer\"}]}";
    String removeComponentsByTagPath = "/ak/api/v3/components/tags/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RemoveComponentsByTagOptions model
    RemoveComponentsByTagOptions removeComponentsByTagOptionsModel = new RemoveComponentsByTagOptions.Builder()
        .tag("testString").build();

    // Invoke operation with valid options model (positive test)
    Response<RemoveMultiComponentsResponse> response = blockchainService
        .removeComponentsByTag(removeComponentsByTagOptionsModel).execute();
    assertNotNull(response);
    RemoveMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeComponentsByTagPath);
  }

  // Test the removeComponentsByTag operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveComponentsByTagNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.removeComponentsByTag(null).execute();
  }

  @Test
  public void testDeleteComponentsByTagWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"deleted\": [{\"message\": \"deleted\", \"type\": \"fabric-peer\", \"id\": \"component-1\", \"display_name\": \"My Peer\"}]}";
    String deleteComponentsByTagPath = "/ak/api/v3/kubernetes/components/tags/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteComponentsByTagOptions model
    DeleteComponentsByTagOptions deleteComponentsByTagOptionsModel = new DeleteComponentsByTagOptions.Builder()
        .tag("testString").build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteMultiComponentsResponse> response = blockchainService
        .deleteComponentsByTag(deleteComponentsByTagOptionsModel).execute();
    assertNotNull(response);
    DeleteMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteComponentsByTagPath);
  }

  // Test the deleteComponentsByTag operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteComponentsByTagNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.deleteComponentsByTag(null).execute();
  }

  @Test
  public void testDeleteAllComponentsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"deleted\": [{\"message\": \"deleted\", \"type\": \"fabric-peer\", \"id\": \"component-1\", \"display_name\": \"My Peer\"}]}";
    String deleteAllComponentsPath = "/ak/api/v3/kubernetes/components/purge";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAllComponentsOptions model
    DeleteAllComponentsOptions deleteAllComponentsOptionsModel = new DeleteAllComponentsOptions();

    // Invoke operation with valid options model (positive test)
    Response<DeleteMultiComponentsResponse> response = blockchainService
        .deleteAllComponents(deleteAllComponentsOptionsModel).execute();
    assertNotNull(response);
    DeleteMultiComponentsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAllComponentsPath);
  }

  @Test
  public void testGetSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"ACTIVITY_TRACKER_PATH\": \"/logs\", \"ATHENA_ID\": \"17v7e\", \"AUTH_SCHEME\": \"iam\", \"CALLBACK_URI\": \"/auth/cb\", \"CLUSTER_DATA\": {\"type\": \"paid\"}, \"CONFIGTXLATOR_URL\": \"https://n3a3ec3-configtxlator.ibp.us-south.containers.appdomain.cloud\", \"CRN\": {\"account_id\": \"a/abcd\", \"c_name\": \"staging\", \"c_type\": \"public\", \"instance_id\": \"abc123\", \"location\": \"us-south\", \"resource_id\": \"-\", \"resource_type\": \"-\", \"service_name\": \"blockchain\", \"version\": \"v1\"}, \"CRN_STRING\": \"crn:v1:staging:public:blockchain:us-south:a/abcd:abc123::\", \"CSP_HEADER_VALUES\": [\"-\"], \"DB_SYSTEM\": \"system\", \"DEPLOYER_URL\": \"https://api.dev.blockchain.cloud.ibm.com\", \"DOMAIN\": \"localhost\", \"ENVIRONMENT\": \"prod\", \"FABRIC_CAPABILITIES\": {\"application\": [\"V1_1\"], \"channel\": [\"V1_1\"], \"orderer\": [\"V1_1\"]}, \"FEATURE_FLAGS\": {\"mapKey\": \"anyValue\"}, \"FILE_LOGGING\": {\"server\": {\"client\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}, \"server\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}}, \"client\": {\"client\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}, \"server\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}}}, \"HOST_URL\": \"http://localhost:3000\", \"IAM_CACHE_ENABLED\": true, \"IAM_URL\": \"-\", \"IBM_ID_CALLBACK_URL\": \"http://localhost:3000/auth/login\", \"IGNORE_CONFIG_FILE\": true, \"INACTIVITY_TIMEOUTS\": {\"enabled\": true, \"max_idle_time\": 60000}, \"INFRASTRUCTURE\": \"ibmcloud\", \"LANDING_URL\": \"http://localhost:3000\", \"LOGIN_URI\": \"/auth/login\", \"LOGOUT_URI\": \"/auth/logout\", \"MAX_REQ_PER_MIN\": 25, \"MAX_REQ_PER_MIN_AK\": 25, \"MEMORY_CACHE_ENABLED\": true, \"PORT\": \"3000\", \"PROXY_CACHE_ENABLED\": true, \"PROXY_TLS_FABRIC_REQS\": \"always\", \"PROXY_TLS_HTTP_URL\": \"http://localhost:3000\", \"PROXY_TLS_WS_URL\": \"anyValue\", \"REGION\": \"us_south\", \"SESSION_CACHE_ENABLED\": true, \"TIMEOUTS\": {\"mapKey\": \"anyValue\"}, \"TIMESTAMPS\": {\"now\": 1542746836056, \"born\": 1542746836056, \"next_settings_update\": \"1.2 mins\", \"up_time\": \"30 days\"}, \"TRANSACTION_VISIBILITY\": {\"mapKey\": \"anyValue\"}, \"TRUST_PROXY\": \"loopback\", \"TRUST_UNKNOWN_CERTS\": true, \"VERSIONS\": {\"apollo\": \"65f3cbfd\", \"athena\": \"1198f94\", \"stitch\": \"0f1a0c6\", \"tag\": \"v0.4.31\"}}";
    String getSettingsPath = "/ak/api/v3/settings";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSettingsOptions model
    GetSettingsOptions getSettingsOptionsModel = new GetSettingsOptions();

    // Invoke operation with valid options model (positive test)
    Response<GetPublicSettingsResponse> response = blockchainService.getSettings(getSettingsOptionsModel).execute();
    assertNotNull(response);
    GetPublicSettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSettingsPath);
  }

  @Test
  public void testEditSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"ACTIVITY_TRACKER_PATH\": \"/logs\", \"ATHENA_ID\": \"17v7e\", \"AUTH_SCHEME\": \"iam\", \"CALLBACK_URI\": \"/auth/cb\", \"CLUSTER_DATA\": {\"type\": \"paid\"}, \"CONFIGTXLATOR_URL\": \"https://n3a3ec3-configtxlator.ibp.us-south.containers.appdomain.cloud\", \"CRN\": {\"account_id\": \"a/abcd\", \"c_name\": \"staging\", \"c_type\": \"public\", \"instance_id\": \"abc123\", \"location\": \"us-south\", \"resource_id\": \"-\", \"resource_type\": \"-\", \"service_name\": \"blockchain\", \"version\": \"v1\"}, \"CRN_STRING\": \"crn:v1:staging:public:blockchain:us-south:a/abcd:abc123::\", \"CSP_HEADER_VALUES\": [\"-\"], \"DB_SYSTEM\": \"system\", \"DEPLOYER_URL\": \"https://api.dev.blockchain.cloud.ibm.com\", \"DOMAIN\": \"localhost\", \"ENVIRONMENT\": \"prod\", \"FABRIC_CAPABILITIES\": {\"application\": [\"V1_1\"], \"channel\": [\"V1_1\"], \"orderer\": [\"V1_1\"]}, \"FEATURE_FLAGS\": {\"mapKey\": \"anyValue\"}, \"FILE_LOGGING\": {\"server\": {\"client\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}, \"server\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}}, \"client\": {\"client\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}, \"server\": {\"enabled\": true, \"level\": \"silly\", \"unique_name\": false}}}, \"HOST_URL\": \"http://localhost:3000\", \"IAM_CACHE_ENABLED\": true, \"IAM_URL\": \"-\", \"IBM_ID_CALLBACK_URL\": \"http://localhost:3000/auth/login\", \"IGNORE_CONFIG_FILE\": true, \"INACTIVITY_TIMEOUTS\": {\"enabled\": true, \"max_idle_time\": 60000}, \"INFRASTRUCTURE\": \"ibmcloud\", \"LANDING_URL\": \"http://localhost:3000\", \"LOGIN_URI\": \"/auth/login\", \"LOGOUT_URI\": \"/auth/logout\", \"MAX_REQ_PER_MIN\": 25, \"MAX_REQ_PER_MIN_AK\": 25, \"MEMORY_CACHE_ENABLED\": true, \"PORT\": \"3000\", \"PROXY_CACHE_ENABLED\": true, \"PROXY_TLS_FABRIC_REQS\": \"always\", \"PROXY_TLS_HTTP_URL\": \"http://localhost:3000\", \"PROXY_TLS_WS_URL\": \"anyValue\", \"REGION\": \"us_south\", \"SESSION_CACHE_ENABLED\": true, \"TIMEOUTS\": {\"mapKey\": \"anyValue\"}, \"TIMESTAMPS\": {\"now\": 1542746836056, \"born\": 1542746836056, \"next_settings_update\": \"1.2 mins\", \"up_time\": \"30 days\"}, \"TRANSACTION_VISIBILITY\": {\"mapKey\": \"anyValue\"}, \"TRUST_PROXY\": \"loopback\", \"TRUST_UNKNOWN_CERTS\": true, \"VERSIONS\": {\"apollo\": \"65f3cbfd\", \"athena\": \"1198f94\", \"stitch\": \"0f1a0c6\", \"tag\": \"v0.4.31\"}}";
    String editSettingsPath = "/ak/api/v3/settings";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditSettingsBodyInactivityTimeouts model
    EditSettingsBodyInactivityTimeouts editSettingsBodyInactivityTimeoutsModel = new EditSettingsBodyInactivityTimeouts.Builder()
        .enabled(false).maxIdleTime(Double.valueOf("90000")).build();

    // Construct an instance of the LoggingSettingsClient model
    LoggingSettingsClient loggingSettingsClientModel = new LoggingSettingsClient.Builder().enabled(true).level("silly")
        .uniqueName(false).build();

    // Construct an instance of the LoggingSettingsServer model
    LoggingSettingsServer loggingSettingsServerModel = new LoggingSettingsServer.Builder().enabled(true).level("silly")
        .uniqueName(false).build();

    // Construct an instance of the EditLogSettingsBody model
    EditLogSettingsBody editLogSettingsBodyModel = new EditLogSettingsBody.Builder().client(loggingSettingsClientModel)
        .server(loggingSettingsServerModel).build();

    // Construct an instance of the EditSettingsOptions model
    EditSettingsOptions editSettingsOptionsModel = new EditSettingsOptions.Builder()
        .inactivityTimeouts(editSettingsBodyInactivityTimeoutsModel).fileLogging(editLogSettingsBodyModel)
        .maxReqPerMin(Double.valueOf("25")).maxReqPerMinAk(Double.valueOf("25"))
        .fabricGetBlockTimeoutMs(Double.valueOf("10000")).fabricInstantiateTimeoutMs(Double.valueOf("300000"))
        .fabricJoinChannelTimeoutMs(Double.valueOf("25000")).fabricInstallCcTimeoutMs(Double.valueOf("300000"))
        .fabricLcInstallCcTimeoutMs(Double.valueOf("300000")).fabricLcGetCcTimeoutMs(Double.valueOf("180000"))
        .fabricGeneralTimeoutMs(Double.valueOf("10000")).build();

    // Invoke operation with valid options model (positive test)
    Response<GetPublicSettingsResponse> response = blockchainService.editSettings(editSettingsOptionsModel).execute();
    assertNotNull(response);
    GetPublicSettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, editSettingsPath);
  }

  @Test
  public void testGetFabVersionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"versions\": {\"ca\": {\"1.4.6-2\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}, \"2.1.0-0\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}}, \"peer\": {\"1.4.6-2\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}, \"2.1.0-0\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}}, \"orderer\": {\"1.4.6-2\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}, \"2.1.0-0\": {\"default\": true, \"version\": \"1.4.6-2\", \"image\": {\"mapKey\": \"anyValue\"}}}}}";
    String getFabVersionsPath = "/ak/api/v3/kubernetes/fabric/versions";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFabVersionsOptions model
    GetFabVersionsOptions getFabVersionsOptionsModel = new GetFabVersionsOptions.Builder().cache("skip").build();

    // Invoke operation with valid options model (positive test)
    Response<GetFabricVersionsResponse> response = blockchainService.getFabVersions(getFabVersionsOptionsModel)
        .execute();
    assertNotNull(response);
    GetFabricVersionsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("cache"), "skip");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFabVersionsPath);
  }

  @Test
  public void testGetHealthWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"OPTOOLS\": {\"instance_id\": \"p59ta\", \"now\": 1542746836056, \"born\": 1542746836056, \"up_time\": \"30 days\", \"memory_usage\": {\"rss\": \"56.1 MB\", \"heapTotal\": \"34.4 MB\", \"heapUsed\": \"28.4 MB\", \"external\": \"369.3 KB\"}, \"session_cache_stats\": {\"hits\": 42, \"misses\": 11, \"keys\": 100, \"cache_size\": \"4.19 KiB\"}, \"couch_cache_stats\": {\"hits\": 42, \"misses\": 11, \"keys\": 100, \"cache_size\": \"4.19 KiB\"}, \"iam_cache_stats\": {\"hits\": 42, \"misses\": 11, \"keys\": 100, \"cache_size\": \"4.19 KiB\"}, \"proxy_cache\": {\"hits\": 42, \"misses\": 11, \"keys\": 100, \"cache_size\": \"4.19 KiB\"}}, \"OS\": {\"arch\": \"x64\", \"type\": \"Windows_NT\", \"endian\": \"LE\", \"loadavg\": [0], \"cpus\": [{\"model\": \"Intel(R) Core(TM) i7-8850H CPU @ 2.60GHz\", \"speed\": 2592, \"times\": {\"idle\": 131397203, \"irq\": 6068640, \"nice\": 0, \"sys\": 9652328, \"user\": 4152187}}], \"total_memory\": \"31.7 GB\", \"free_memory\": \"21.9 GB\", \"up_time\": \"4.9 days\"}}";
    String getHealthPath = "/ak/api/v3/health";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetHealthOptions model
    GetHealthOptions getHealthOptionsModel = new GetHealthOptions();

    // Invoke operation with valid options model (positive test)
    Response<GetAthenaHealthStatsResponse> response = blockchainService.getHealth(getHealthOptionsModel).execute();
    assertNotNull(response);
    GetAthenaHealthStatsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHealthPath);
  }

  @Test
  public void testListNotificationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total\": 10, \"returning\": 3, \"notifications\": [{\"id\": \"60d84819bfa17adb4174ff3a1c52b5d6\", \"type\": \"notification\", \"status\": \"pending\", \"by\": \"d******a@us.ibm.com\", \"message\": \"Restarting application\", \"ts_display\": 1537262855753}]}";
    String listNotificationsPath = "/ak/api/v3/notifications";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListNotificationsOptions model
    ListNotificationsOptions listNotificationsOptionsModel = new ListNotificationsOptions.Builder()
        .limit(Double.valueOf("1")).skip(Double.valueOf("1")).componentId("MyPeer").build();

    // Invoke operation with valid options model (positive test)
    Response<GetNotificationsResponse> response = blockchainService.listNotifications(listNotificationsOptionsModel)
        .execute();
    assertNotNull(response);
    GetNotificationsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("limit"), "1.0");
    assertEquals(query.get("skip"), "1.0");
    assertEquals(query.get("component_id"), "MyPeer");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listNotificationsPath);
  }

  @Test
  public void testDeleteSigTxWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"ok\", \"tx_id\": \"abcde\"}";
    String deleteSigTxPath = "/ak/api/v3/signature_collections/testString";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSigTxOptions model
    DeleteSigTxOptions deleteSigTxOptionsModel = new DeleteSigTxOptions.Builder().id("testString").build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteSignatureCollectionResponse> response = blockchainService.deleteSigTx(deleteSigTxOptionsModel)
        .execute();
    assertNotNull(response);
    DeleteSignatureCollectionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSigTxPath);
  }

  // Test the deleteSigTx operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSigTxNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.deleteSigTx(null).execute();
  }

  @Test
  public void testArchiveNotificationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"ok\", \"details\": \"archived 3 notification(s)\"}";
    String archiveNotificationsPath = "/ak/api/v3/notifications/bulk";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ArchiveNotificationsOptions model
    ArchiveNotificationsOptions archiveNotificationsOptionsModel = new ArchiveNotificationsOptions.Builder()
        .notificationIds(new java.util.ArrayList<String>(java.util.Arrays.asList("c9d00ebf849051e4f102008dc0be2488")))
        .build();

    // Invoke operation with valid options model (positive test)
    Response<ArchiveResponse> response = blockchainService.archiveNotifications(archiveNotificationsOptionsModel)
        .execute();
    assertNotNull(response);
    ArchiveResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, archiveNotificationsPath);
  }

  // Test the archiveNotifications operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testArchiveNotificationsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.archiveNotifications(null).execute();
  }

  @Test
  public void testRestartWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"restarting - give me 5-30 seconds\"}";
    String restartPath = "/ak/api/v3/restart";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RestartOptions model
    RestartOptions restartOptionsModel = new RestartOptions();

    // Invoke operation with valid options model (positive test)
    Response<RestartAthenaResponse> response = blockchainService.restart(restartOptionsModel).execute();
    assertNotNull(response);
    RestartAthenaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, restartPath);
  }

  @Test
  public void testDeleteAllSessionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"delete submitted\"}";
    String deleteAllSessionsPath = "/ak/api/v3/sessions";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAllSessionsOptions model
    DeleteAllSessionsOptions deleteAllSessionsOptionsModel = new DeleteAllSessionsOptions();

    // Invoke operation with valid options model (positive test)
    Response<DeleteAllSessionsResponse> response = blockchainService.deleteAllSessions(deleteAllSessionsOptionsModel)
        .execute();
    assertNotNull(response);
    DeleteAllSessionsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAllSessionsPath);
  }

  @Test
  public void testDeleteAllNotificationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"ok\", \"details\": \"deleted 101 notification(s)\"}";
    String deleteAllNotificationsPath = "/ak/api/v3/notifications/purge";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAllNotificationsOptions model
    DeleteAllNotificationsOptions deleteAllNotificationsOptionsModel = new DeleteAllNotificationsOptions();

    // Invoke operation with valid options model (positive test)
    Response<DeleteAllNotificationsResponse> response = blockchainService
        .deleteAllNotifications(deleteAllNotificationsOptionsModel).execute();
    assertNotNull(response);
    DeleteAllNotificationsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAllNotificationsPath);
  }

  @Test
  public void testClearCachesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"message\": \"ok\", \"flushed\": [\"iam_cache\"]}";
    String clearCachesPath = "/ak/api/v3/cache";

    server.enqueue(new MockResponse().setHeader("Content-type", "application/json").setResponseCode(200)
        .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ClearCachesOptions model
    ClearCachesOptions clearCachesOptionsModel = new ClearCachesOptions();

    // Invoke operation with valid options model (positive test)
    Response<CacheFlushResponse> response = blockchainService.clearCaches(clearCachesOptionsModel).execute();
    assertNotNull(response);
    CacheFlushResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, clearCachesPath);
  }

  @Test
  public void testGetPostmanWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String getPostmanPath = "/ak/api/v3/postman";

    server.enqueue(new MockResponse().setResponseCode(200).setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPostmanOptions model
    GetPostmanOptions getPostmanOptionsModel = new GetPostmanOptions.Builder().authType("bearer").token("testString")
        .apiKey("testString").username("admin").password("password").build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = blockchainService.getPostman(getPostmanOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("auth_type"), "bearer");
    assertEquals(query.get("token"), "testString");
    assertEquals(query.get("api_key"), "testString");
    assertEquals(query.get("username"), "admin");
    assertEquals(query.get("password"), "password");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPostmanPath);
  }

  // Test the getPostman operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPostmanNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    blockchainService.getPostman(null).execute();
  }

  @Test
  public void testGetSwaggerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "\"operationResponse\"";
    String getSwaggerPath = "/ak/api/v3/openapi";

    server.enqueue(
        new MockResponse().setHeader("Content-type", "text/plain").setResponseCode(200).setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSwaggerOptions model
    GetSwaggerOptions getSwaggerOptionsModel = new GetSwaggerOptions();

    // Invoke operation with valid options model (positive test)
    Response<String> response = blockchainService.getSwagger(getSwaggerOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSwaggerPath);
  }

  /** Initialize the server. */
  @BeforeMethod
  public void setUpMockServer() {
    try {
      server = new MockWebServer();
      // register handler
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    blockchainService = null;
  }
}
