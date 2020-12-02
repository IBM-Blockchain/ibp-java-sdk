// /*
//  * (C) Copyright IBM Corp. 2020.
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
//  * the License. You may obtain a copy of the License at
//  *
//  * http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
//  * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
//  * specific language governing permissions and limitations under the License.
//  */

// package com.ibm.cloud.blockchain.v3;

// import com.ibm.cloud.blockchain.v3.model.ActionEnroll;
// import com.ibm.cloud.blockchain.v3.model.ActionReenroll;
// import com.ibm.cloud.blockchain.v3.model.ActionRenew;
// import com.ibm.cloud.blockchain.v3.model.ActionsResponse;
// import com.ibm.cloud.blockchain.v3.model.ArchiveNotificationsOptions;
// import com.ibm.cloud.blockchain.v3.model.ArchiveResponse;
// import com.ibm.cloud.blockchain.v3.model.Bccsp;
// import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
// import com.ibm.cloud.blockchain.v3.model.BccspSW;
// import com.ibm.cloud.blockchain.v3.model.CaActionOptions;
// import com.ibm.cloud.blockchain.v3.model.CaResponse;
// import com.ibm.cloud.blockchain.v3.model.CaResponseResources;
// import com.ibm.cloud.blockchain.v3.model.CaResponseStorage;
// import com.ibm.cloud.blockchain.v3.model.CacheData;
// import com.ibm.cloud.blockchain.v3.model.CacheFlushResponse;
// import com.ibm.cloud.blockchain.v3.model.ClearCachesOptions;
// import com.ibm.cloud.blockchain.v3.model.ClientAuth;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAAffiliations;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACa;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACfg;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACfgIdentities;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACors;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACreate;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACrl;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACsr;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACsrCa;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACsrKeyrequest;
// import com.ibm.cloud.blockchain.v3.model.ConfigCACsrNamesItem;
// import com.ibm.cloud.blockchain.v3.model.ConfigCADb;
// import com.ibm.cloud.blockchain.v3.model.ConfigCADbTls;
// import com.ibm.cloud.blockchain.v3.model.ConfigCADbTlsClient;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIdemix;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediate;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateEnrollment;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateParentserver;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTls;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTlsClient;
// import com.ibm.cloud.blockchain.v3.model.ConfigCARegistry;
// import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigning;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigningDefault;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfiles;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesCa;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesCaCaconstraint;
// import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesTls;
// import com.ibm.cloud.blockchain.v3.model.ConfigCATls;
// import com.ibm.cloud.blockchain.v3.model.ConfigCATlsClientauth;
// import com.ibm.cloud.blockchain.v3.model.ConfigCAUpdate;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererCreate;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneral;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneralUpdate;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
// import com.ibm.cloud.blockchain.v3.model.ConfigOrdererUpdate;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerAdminService;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerAuthentication;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincode;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeExternalBuildersItem;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeGolang;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeLogging;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeSystem;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerClient;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerCreate;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerCreatePeer;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclient;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclientAddressOverridesItem;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerDiscovery;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossip;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipElection;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtData;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipState;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepalive;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveClient;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveDeliveryClient;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimits;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimitsConcurrency;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdate;
// import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdatePeer;
// import com.ibm.cloud.blockchain.v3.model.CpuHealthStats;
// import com.ibm.cloud.blockchain.v3.model.CpuHealthStatsTimes;
// import com.ibm.cloud.blockchain.v3.model.CreateCaBodyConfigOverride;
// import com.ibm.cloud.blockchain.v3.model.CreateCaBodyResources;
// import com.ibm.cloud.blockchain.v3.model.CreateCaBodyStorage;
// import com.ibm.cloud.blockchain.v3.model.CreateCaOptions;
// import com.ibm.cloud.blockchain.v3.model.CreateOrdererOptions;
// import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyResources;
// import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyStorage;
// import com.ibm.cloud.blockchain.v3.model.CreatePeerBodyStorage;
// import com.ibm.cloud.blockchain.v3.model.CreatePeerOptions;
// import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
// import com.ibm.cloud.blockchain.v3.model.CryptoObject;
// import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollment;
// import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentCa;
// import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentTlsca;
// import com.ibm.cloud.blockchain.v3.model.CryptoObjectMsp;
// import com.ibm.cloud.blockchain.v3.model.DeleteAllComponentsOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsResponse;
// import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsResponse;
// import com.ibm.cloud.blockchain.v3.model.DeleteComponentOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteComponentResponse;
// import com.ibm.cloud.blockchain.v3.model.DeleteComponentsByTagOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteMultiComponentsResponse;
// import com.ibm.cloud.blockchain.v3.model.DeleteSigTxOptions;
// import com.ibm.cloud.blockchain.v3.model.DeleteSignatureCollectionResponse;
// import com.ibm.cloud.blockchain.v3.model.EditAdminCertsOptions;
// import com.ibm.cloud.blockchain.v3.model.EditAdminCertsResponse;
// import com.ibm.cloud.blockchain.v3.model.EditAdminCertsResponseSetAdminCertsItem;
// import com.ibm.cloud.blockchain.v3.model.EditCaOptions;
// import com.ibm.cloud.blockchain.v3.model.EditLogSettingsBody;
// import com.ibm.cloud.blockchain.v3.model.EditMspOptions;
// import com.ibm.cloud.blockchain.v3.model.EditOrdererOptions;
// import com.ibm.cloud.blockchain.v3.model.EditPeerOptions;
// import com.ibm.cloud.blockchain.v3.model.EditSettingsBodyInactivityTimeouts;
// import com.ibm.cloud.blockchain.v3.model.EditSettingsOptions;
// import com.ibm.cloud.blockchain.v3.model.FabVersionObject;
// import com.ibm.cloud.blockchain.v3.model.FabricVersionDictionary;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMsp;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspCa;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspComponent;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspTlsca;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseResources;
// import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseStorage;
// import com.ibm.cloud.blockchain.v3.model.GenericResourceLimits;
// import com.ibm.cloud.blockchain.v3.model.GenericResources;
// import com.ibm.cloud.blockchain.v3.model.GenericResourcesRequests;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponse;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOPTOOLS;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOPTOOLSMemoryUsage;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOS;
// import com.ibm.cloud.blockchain.v3.model.GetComponentOptions;
// import com.ibm.cloud.blockchain.v3.model.GetComponentsByTagOptions;
// import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions;
// import com.ibm.cloud.blockchain.v3.model.GetFabVersionsOptions;
// import com.ibm.cloud.blockchain.v3.model.GetFabricVersionsResponse;
// import com.ibm.cloud.blockchain.v3.model.GetFabricVersionsResponseVersions;
// import com.ibm.cloud.blockchain.v3.model.GetHealthOptions;
// import com.ibm.cloud.blockchain.v3.model.GetMSPCertificateResponse;
// import com.ibm.cloud.blockchain.v3.model.GetMspCertificateOptions;
// import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
// import com.ibm.cloud.blockchain.v3.model.GetNotificationsResponse;
// import com.ibm.cloud.blockchain.v3.model.GetPostmanOptions;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponse;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseCLUSTERDATA;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseCRN;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseFABRICCAPABILITIES;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseFILELOGGING;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseINACTIVITYTIMEOUTS;
// import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseVERSIONS;
// import com.ibm.cloud.blockchain.v3.model.GetSettingsOptions;
// import com.ibm.cloud.blockchain.v3.model.GetSwaggerOptions;
// import com.ibm.cloud.blockchain.v3.model.Hsm;
// import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
// import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMsp;
// import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspCa;
// import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspComponent;
// import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspTlsca;
// import com.ibm.cloud.blockchain.v3.model.ImportCaOptions;
// import com.ibm.cloud.blockchain.v3.model.ImportMspOptions;
// import com.ibm.cloud.blockchain.v3.model.ImportOrdererOptions;
// import com.ibm.cloud.blockchain.v3.model.ImportPeerOptions;
// import com.ibm.cloud.blockchain.v3.model.ListComponentsOptions;
// import com.ibm.cloud.blockchain.v3.model.ListNotificationsOptions;
// import com.ibm.cloud.blockchain.v3.model.LogSettingsResponse;
// import com.ibm.cloud.blockchain.v3.model.LoggingSettingsClient;
// import com.ibm.cloud.blockchain.v3.model.LoggingSettingsServer;
// import com.ibm.cloud.blockchain.v3.model.Metrics;
// import com.ibm.cloud.blockchain.v3.model.MetricsStatsd;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoCa;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoComp;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoField;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldCa;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldComponent;
// import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldTlsca;
// import com.ibm.cloud.blockchain.v3.model.MspPublicData;
// import com.ibm.cloud.blockchain.v3.model.MspResponse;
// import com.ibm.cloud.blockchain.v3.model.NodeOu;
// import com.ibm.cloud.blockchain.v3.model.NodeOuGeneral;
// import com.ibm.cloud.blockchain.v3.model.NotificationData;
// import com.ibm.cloud.blockchain.v3.model.OrdererActionOptions;
// import com.ibm.cloud.blockchain.v3.model.OrdererResponse;
// import com.ibm.cloud.blockchain.v3.model.OrdererResponseResources;
// import com.ibm.cloud.blockchain.v3.model.OrdererResponseStorage;
// import com.ibm.cloud.blockchain.v3.model.PeerActionOptions;
// import com.ibm.cloud.blockchain.v3.model.PeerResources;
// import com.ibm.cloud.blockchain.v3.model.PeerResponse;
// import com.ibm.cloud.blockchain.v3.model.PeerResponseResources;
// import com.ibm.cloud.blockchain.v3.model.PeerResponseStorage;
// import com.ibm.cloud.blockchain.v3.model.RemoveComponentOptions;
// import com.ibm.cloud.blockchain.v3.model.RemoveComponentsByTagOptions;
// import com.ibm.cloud.blockchain.v3.model.RemoveMultiComponentsResponse;
// import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
// import com.ibm.cloud.blockchain.v3.model.ResourceObject;
// import com.ibm.cloud.blockchain.v3.model.ResourceObjectCouchDb;
// import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV1;
// import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV2;
// import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
// import com.ibm.cloud.blockchain.v3.model.RestartAthenaResponse;
// import com.ibm.cloud.blockchain.v3.model.RestartOptions;
// import com.ibm.cloud.blockchain.v3.model.SettingsTimestampData;
// import com.ibm.cloud.blockchain.v3.model.StorageObject;
// import com.ibm.cloud.blockchain.v3.model.SubmitBlockOptions;
// import com.ibm.cloud.blockchain.v3.model.UpdateCaBodyConfigOverride;
// import com.ibm.cloud.blockchain.v3.model.UpdateCaBodyResources;
// import com.ibm.cloud.blockchain.v3.model.UpdateCaOptions;
// import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoField;
// import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
// import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldTlsca;
// import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoField;
// import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldCa;
// import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldComponent;
// import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldTlsca;
// import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyCrypto;
// import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyResources;
// import com.ibm.cloud.blockchain.v3.model.UpdateOrdererOptions;
// import com.ibm.cloud.blockchain.v3.model.UpdatePeerBodyCrypto;
// import com.ibm.cloud.blockchain.v3.model.UpdatePeerOptions;
// import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
// import com.ibm.cloud.sdk.core.http.Response;
// import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
// import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
// import com.ibm.cloud.sdk.core.util.CredentialUtils;
// import com.ibm.cloud.test.SdkIntegrationTestBase;
// import java.io.InputStream;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.Test;
// import static org.testng.Assert.*;

// /**
//  * Integration test class for the Blockchain service.
//  */
// public class BlockchainIT extends SdkIntegrationTestBase {
//   public Blockchain service = null;
//   public static Map<String, String> config = null;
//   final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
//   final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
//   /**
//    * This method provides our config filename to the base class.
//    */

//   public String getConfigFilename() {
//     return "../../blockchain_v3.env";
//   }

//   @BeforeClass
//   public void constructService() {
//     // Ask super if we should skip the tests.
//     if (skipTests()) {
//       return;
//     }

//     service = Blockchain.newInstance();
//     assertNotNull(service);
//     assertNotNull(service.getServiceUrl());

//     // Load up our test-specific config properties.
//     config = CredentialUtils.getServiceProperties(Blockchain.DEFAULT_SERVICE_NAME);
//     assertNotNull(config);
//     assertFalse(config.isEmpty());
//     assertEquals(service.getServiceUrl(), config.get("URL"));

//     System.out.println("Setup complete.");
//   }

//   @Test
//   public void testGetComponent() throws Exception {
//     try {
//       GetComponentOptions getComponentOptions = new GetComponentOptions.Builder()
//       .id("testString")
//       .deploymentAttrs("included")
//       .parsedCerts("included")
//       .cache("skip")
//       .caAttrs("included")
//       .build();

//       // Invoke operation
//       Response<GenericComponentResponse> response = service.getComponent(getComponentOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GenericComponentResponse genericComponentResponseResult = response.getResult();

//       assertNotNull(genericComponentResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testCreateCa() throws Exception {
//     try {
//       ConfigCACors configCaCorsModel = new ConfigCACors.Builder()
//       .enabled(true)
//       .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("*")))
//       .build();

//       ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder()
//       .type("noclientcert")
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       ConfigCATls configCaTlsModel = new ConfigCATls.Builder()
//       .keyfile("testString")
//       .certfile("testString")
//       .clientauth(configCaTlsClientauthModel)
//       .build();

//       ConfigCACa configCaCaModel = new ConfigCACa.Builder()
//       .keyfile("testString")
//       .certfile("testString")
//       .chainfile("testString")
//       .build();

//       ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder()
//       .expiry("24h")
//       .build();

//       IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder()
//       .hfRegistrarRoles("*")
//       .hfRegistrarDelegateRoles("*")
//       .hfRevoker(true)
//       .hfIntermediateCa(true)
//       .hfGenCrl(true)
//       .hfRegistrarAttributes("*")
//       .hfAffiliationMgr(true)
//       .build();

//       ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
//       .name("admin")
//       .pass("password")
//       .type("client")
//       .maxenrollments(Double.valueOf("-1"))
//       .affiliation("testString")
//       .attrs(identityAttrsModel)
//       .build();

//       ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder()
//       .maxenrollments(Double.valueOf("-1"))
//       .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
//       .build();

//       ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder()
//       .certfile("testString")
//       .keyfile("testString")
//       .build();

//       ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .client(configCaDbTlsClientModel)
//       .enabled(false)
//       .build();

//       ConfigCADb configCaDbModel = new ConfigCADb.Builder()
//       .type("postgres")
//       .datasource("host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full")
//       .tls(configCaDbTlsModel)
//       .build();

//       ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
//       .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
//       .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
//       .add("foo", "testString")
//       .build();

//       ConfigCACsrKeyrequest configCaCsrKeyrequestModel = new ConfigCACsrKeyrequest.Builder()
//       .algo("ecdsa")
//       .size(Double.valueOf("256"))
//       .build();

//       ConfigCACsrNamesItem configCaCsrNamesItemModel = new ConfigCACsrNamesItem.Builder()
//       .c("US")
//       .st("North Carolina")
//       .l("Raleigh")
//       .o("Hyperledger")
//       .ou("Fabric")
//       .build();

//       ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder()
//       .expiry("131400h")
//       .pathlength(Double.valueOf("0"))
//       .build();

//       ConfigCACsr configCaCsrModel = new ConfigCACsr.Builder()
//       .cn("ca")
//       .keyrequest(configCaCsrKeyrequestModel)
//       .names(new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)))
//       .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("localhost")))
//       .ca(configCaCsrCaModel)
//       .build();

//       ConfigCAIdemix configCaIdemixModel = new ConfigCAIdemix.Builder()
//       .rhpoolsize(Double.valueOf("100"))
//       .nonceexpiration("15s")
//       .noncesweepinterval("15m")
//       .build();

//       BccspSW bccspSwModel = new BccspSW.Builder()
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
//       .label("testString")
//       .pin("testString")
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       Bccsp bccspModel = new Bccsp.Builder()
//       .xDefault("SW")
//       .sw(bccspSwModel)
//       .pkcS11(bccspPkcS11Model)
//       .build();

//       ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
//       .url("testString")
//       .caname("testString")
//       .build();

//       ConfigCAIntermediateEnrollment configCaIntermediateEnrollmentModel = new ConfigCAIntermediateEnrollment.Builder()
//       .hosts("localhost")
//       .profile("testString")
//       .label("testString")
//       .build();

//       ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
//       .certfile("testString")
//       .keyfile("testString")
//       .build();

//       ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .client(configCaIntermediateTlsClientModel)
//       .build();

//       ConfigCAIntermediate configCaIntermediateModel = new ConfigCAIntermediate.Builder()
//       .parentserver(configCaIntermediateParentserverModel)
//       .enrollment(configCaIntermediateEnrollmentModel)
//       .tls(configCaIntermediateTlsModel)
//       .build();

//       ConfigCACfgIdentities configCaCfgIdentitiesModel = new ConfigCACfgIdentities.Builder()
//       .passwordattempts(Double.valueOf("10"))
//       .allowremove(false)
//       .build();

//       ConfigCACfg configCaCfgModel = new ConfigCACfg.Builder()
//       .identities(configCaCfgIdentitiesModel)
//       .build();

//       MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       Metrics metricsModel = new Metrics.Builder()
//       .provider("prometheus")
//       .statsd(metricsStatsdModel)
//       .build();

//       ConfigCASigningDefault configCaSigningDefaultModel = new ConfigCASigningDefault.Builder()
//       .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign")))
//       .expiry("8760h")
//       .build();

//       ConfigCASigningProfilesCaCaconstraint configCaSigningProfilesCaCaconstraintModel = new ConfigCASigningProfilesCaCaconstraint.Builder()
//       .isca(true)
//       .maxpathlen(Double.valueOf("0"))
//       .maxpathlenzero(true)
//       .build();

//       ConfigCASigningProfilesCa configCaSigningProfilesCaModel = new ConfigCASigningProfilesCa.Builder()
//       .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign")))
//       .expiry("43800h")
//       .caconstraint(configCaSigningProfilesCaCaconstraintModel)
//       .build();

//       ConfigCASigningProfilesTls configCaSigningProfilesTlsModel = new ConfigCASigningProfilesTls.Builder()
//       .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign")))
//       .expiry("43800h")
//       .build();

//       ConfigCASigningProfiles configCaSigningProfilesModel = new ConfigCASigningProfiles.Builder()
//       .ca(configCaSigningProfilesCaModel)
//       .tls(configCaSigningProfilesTlsModel)
//       .build();

//       ConfigCASigning configCaSigningModel = new ConfigCASigning.Builder()
//       .xDefault(configCaSigningDefaultModel)
//       .profiles(configCaSigningProfilesModel)
//       .build();

//       ConfigCACreate configCaCreateModel = new ConfigCACreate.Builder()
//       .cors(configCaCorsModel)
//       .debug(false)
//       .crlsizelimit(Double.valueOf("512000"))
//       .tls(configCaTlsModel)
//       .ca(configCaCaModel)
//       .crl(configCaCrlModel)
//       .registry(configCaRegistryModel)
//       .db(configCaDbModel)
//       .affiliations(configCaAffiliationsModel)
//       .csr(configCaCsrModel)
//       .idemix(configCaIdemixModel)
//       .bccsp(bccspModel)
//       .intermediate(configCaIntermediateModel)
//       .cfg(configCaCfgModel)
//       .metrics(metricsModel)
//       .signing(configCaSigningModel)
//       .build();

//       CreateCaBodyConfigOverride createCaBodyConfigOverrideModel = new CreateCaBodyConfigOverride.Builder()
//       .ca(configCaCreateModel)
//       .tlsca(configCaCreateModel)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       CreateCaBodyResources createCaBodyResourcesModel = new CreateCaBodyResources.Builder()
//       .ca(resourceObjectModel)
//       .build();

//       StorageObject storageObjectModel = new StorageObject.Builder()
//       .size("4GiB")
//       .xClass("default")
//       .build();

//       CreateCaBodyStorage createCaBodyStorageModel = new CreateCaBodyStorage.Builder()
//       .ca(storageObjectModel)
//       .build();

//       Hsm hsmModel = new Hsm.Builder()
//       .pkcs11endpoint("tcp://example.com:666")
//       .build();

//       CreateCaOptions createCaOptions = new CreateCaOptions.Builder()
//       .displayName("My CA")
//       .configOverride(createCaBodyConfigOverrideModel)
//       .resources(createCaBodyResourcesModel)
//       .storage(createCaBodyStorageModel)
//       .zone("-")
//       .replicas(Double.valueOf("1"))
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .hsm(hsmModel)
//       .region("-")
//       .version("1.4.6-1")
//       .build();

//       // Invoke operation
//       Response<CaResponse> response = service.createCa(createCaOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       CaResponse caResponseResult = response.getResult();

//       assertNotNull(caResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testImportCa() throws Exception {
//     try {
//       ImportCaBodyMspCa importCaBodyMspCaModel = new ImportCaBodyMspCa.Builder()
//       .name("org1CA")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       ImportCaBodyMspTlsca importCaBodyMspTlscaModel = new ImportCaBodyMspTlsca.Builder()
//       .name("org1tlsCA")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       ImportCaBodyMspComponent importCaBodyMspComponentModel = new ImportCaBodyMspComponent.Builder()
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .build();

//       ImportCaBodyMsp importCaBodyMspModel = new ImportCaBodyMsp.Builder()
//       .ca(importCaBodyMspCaModel)
//       .tlsca(importCaBodyMspTlscaModel)
//       .component(importCaBodyMspComponentModel)
//       .build();

//       ImportCaOptions importCaOptions = new ImportCaOptions.Builder()
//       .displayName("Sample CA")
//       .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054")
//       .msp(importCaBodyMspModel)
//       .location("ibmcloud")
//       .operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .build();

//       // Invoke operation
//       Response<CaResponse> response = service.importCa(importCaOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       CaResponse caResponseResult = response.getResult();

//       assertNotNull(caResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testUpdateCa() throws Exception {
//     try {
//       ConfigCACors configCaCorsModel = new ConfigCACors.Builder()
//       .enabled(true)
//       .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("*")))
//       .build();

//       ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder()
//       .type("noclientcert")
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       ConfigCATls configCaTlsModel = new ConfigCATls.Builder()
//       .keyfile("testString")
//       .certfile("testString")
//       .clientauth(configCaTlsClientauthModel)
//       .build();

//       ConfigCACa configCaCaModel = new ConfigCACa.Builder()
//       .keyfile("testString")
//       .certfile("testString")
//       .chainfile("testString")
//       .build();

//       ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder()
//       .expiry("24h")
//       .build();

//       IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder()
//       .hfRegistrarRoles("*")
//       .hfRegistrarDelegateRoles("*")
//       .hfRevoker(true)
//       .hfIntermediateCa(true)
//       .hfGenCrl(true)
//       .hfRegistrarAttributes("*")
//       .hfAffiliationMgr(true)
//       .build();

//       ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
//       .name("admin")
//       .pass("password")
//       .type("client")
//       .maxenrollments(Double.valueOf("-1"))
//       .affiliation("testString")
//       .attrs(identityAttrsModel)
//       .build();

//       ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder()
//       .maxenrollments(Double.valueOf("-1"))
//       .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
//       .build();

//       ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder()
//       .certfile("testString")
//       .keyfile("testString")
//       .build();

//       ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .client(configCaDbTlsClientModel)
//       .enabled(false)
//       .build();

//       ConfigCADb configCaDbModel = new ConfigCADb.Builder()
//       .type("postgres")
//       .datasource("host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full")
//       .tls(configCaDbTlsModel)
//       .build();

//       ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
//       .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
//       .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
//       .add("foo", "testString")
//       .build();

//       ConfigCACsrKeyrequest configCaCsrKeyrequestModel = new ConfigCACsrKeyrequest.Builder()
//       .algo("ecdsa")
//       .size(Double.valueOf("256"))
//       .build();

//       ConfigCACsrNamesItem configCaCsrNamesItemModel = new ConfigCACsrNamesItem.Builder()
//       .c("US")
//       .st("North Carolina")
//       .l("Raleigh")
//       .o("Hyperledger")
//       .ou("Fabric")
//       .build();

//       ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder()
//       .expiry("131400h")
//       .pathlength(Double.valueOf("0"))
//       .build();

//       ConfigCACsr configCaCsrModel = new ConfigCACsr.Builder()
//       .cn("ca")
//       .keyrequest(configCaCsrKeyrequestModel)
//       .names(new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)))
//       .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("localhost")))
//       .ca(configCaCsrCaModel)
//       .build();

//       ConfigCAIdemix configCaIdemixModel = new ConfigCAIdemix.Builder()
//       .rhpoolsize(Double.valueOf("100"))
//       .nonceexpiration("15s")
//       .noncesweepinterval("15m")
//       .build();

//       BccspSW bccspSwModel = new BccspSW.Builder()
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
//       .label("testString")
//       .pin("testString")
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       Bccsp bccspModel = new Bccsp.Builder()
//       .xDefault("SW")
//       .sw(bccspSwModel)
//       .pkcS11(bccspPkcS11Model)
//       .build();

//       ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
//       .url("testString")
//       .caname("testString")
//       .build();

//       ConfigCAIntermediateEnrollment configCaIntermediateEnrollmentModel = new ConfigCAIntermediateEnrollment.Builder()
//       .hosts("localhost")
//       .profile("testString")
//       .label("testString")
//       .build();

//       ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
//       .certfile("testString")
//       .keyfile("testString")
//       .build();

//       ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
//       .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .client(configCaIntermediateTlsClientModel)
//       .build();

//       ConfigCAIntermediate configCaIntermediateModel = new ConfigCAIntermediate.Builder()
//       .parentserver(configCaIntermediateParentserverModel)
//       .enrollment(configCaIntermediateEnrollmentModel)
//       .tls(configCaIntermediateTlsModel)
//       .build();

//       ConfigCACfgIdentities configCaCfgIdentitiesModel = new ConfigCACfgIdentities.Builder()
//       .passwordattempts(Double.valueOf("10"))
//       .allowremove(false)
//       .build();

//       ConfigCACfg configCaCfgModel = new ConfigCACfg.Builder()
//       .identities(configCaCfgIdentitiesModel)
//       .build();

//       MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       Metrics metricsModel = new Metrics.Builder()
//       .provider("prometheus")
//       .statsd(metricsStatsdModel)
//       .build();

//       ConfigCAUpdate configCaUpdateModel = new ConfigCAUpdate.Builder()
//       .cors(configCaCorsModel)
//       .debug(false)
//       .crlsizelimit(Double.valueOf("512000"))
//       .tls(configCaTlsModel)
//       .ca(configCaCaModel)
//       .crl(configCaCrlModel)
//       .registry(configCaRegistryModel)
//       .db(configCaDbModel)
//       .affiliations(configCaAffiliationsModel)
//       .csr(configCaCsrModel)
//       .idemix(configCaIdemixModel)
//       .bccsp(bccspModel)
//       .intermediate(configCaIntermediateModel)
//       .cfg(configCaCfgModel)
//       .metrics(metricsModel)
//       .build();

//       UpdateCaBodyConfigOverride updateCaBodyConfigOverrideModel = new UpdateCaBodyConfigOverride.Builder()
//       .ca(configCaUpdateModel)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       UpdateCaBodyResources updateCaBodyResourcesModel = new UpdateCaBodyResources.Builder()
//       .ca(resourceObjectModel)
//       .build();

//       UpdateCaOptions updateCaOptions = new UpdateCaOptions.Builder()
//       .id("testString")
//       .configOverride(updateCaBodyConfigOverrideModel)
//       .replicas(Double.valueOf("1"))
//       .resources(updateCaBodyResourcesModel)
//       .version("1.4.6-1")
//       .zone("-")
//       .build();

//       // Invoke operation
//       Response<CaResponse> response = service.updateCa(updateCaOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       CaResponse caResponseResult = response.getResult();

//       assertNotNull(caResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditCa() throws Exception {
//     try {
//       EditCaOptions editCaOptions = new EditCaOptions.Builder()
//       .id("testString")
//       .displayName("My CA")
//       .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054")
//       .operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443")
//       .caName("ca")
//       .location("ibmcloud")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .build();

//       // Invoke operation
//       Response<CaResponse> response = service.editCa(editCaOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       CaResponse caResponseResult = response.getResult();

//       assertNotNull(caResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testCaAction() throws Exception {
//     try {
//       ActionRenew actionRenewModel = new ActionRenew.Builder()
//       .tlsCert(true)
//       .build();

//       CaActionOptions caActionOptions = new CaActionOptions.Builder()
//       .id("testString")
//       .restart(true)
//       .renew(actionRenewModel)
//       .build();

//       // Invoke operation
//       Response<ActionsResponse> response = service.caAction(caActionOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 202);

//       ActionsResponse actionsResponseResult = response.getResult();

//       assertNotNull(actionsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testCreatePeer() throws Exception {
//     try {
//       CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
//       .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("ca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .build();

//       CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("tlsca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
//       .component(cryptoEnrollmentComponentModel)
//       .ca(cryptoObjectEnrollmentCaModel)
//       .tlsca(cryptoObjectEnrollmentTlscaModel)
//       .build();

//       ClientAuth clientAuthModel = new ClientAuth.Builder()
//       .type("noclientcert")
//       .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder()
//       .ekey("testString")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsKey("testString")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .clientAuth(clientAuthModel)
//       .build();

//       MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder()
//       .component(mspCryptoCompModel)
//       .ca(mspCryptoCaModel)
//       .tlsca(mspCryptoCaModel)
//       .build();

//       CryptoObject cryptoObjectModel = new CryptoObject.Builder()
//       .enrollment(cryptoObjectEnrollmentModel)
//       .msp(cryptoObjectMspModel)
//       .build();

//       ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder()
//       .interval("60s")
//       .timeout("20s")
//       .build();

//       ConfigPeerKeepaliveDeliveryClient configPeerKeepaliveDeliveryClientModel = new ConfigPeerKeepaliveDeliveryClient.Builder()
//       .interval("60s")
//       .timeout("20s")
//       .build();

//       ConfigPeerKeepalive configPeerKeepaliveModel = new ConfigPeerKeepalive.Builder()
//       .minInterval("60s")
//       .client(configPeerKeepaliveClientModel)
//       .deliveryClient(configPeerKeepaliveDeliveryClientModel)
//       .build();

//       ConfigPeerGossipElection configPeerGossipElectionModel = new ConfigPeerGossipElection.Builder()
//       .startupGracePeriod("15s")
//       .membershipSampleInterval("1s")
//       .leaderAliveThreshold("10s")
//       .leaderElectionDuration("5s")
//       .build();

//       ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
//       .requiredPeerCount(Double.valueOf("0"))
//       .maxPeerCount(Double.valueOf("1"))
//       .build();

//       ConfigPeerGossipPvtData configPeerGossipPvtDataModel = new ConfigPeerGossipPvtData.Builder()
//       .pullRetryThreshold("60s")
//       .transientstoreMaxBlockRetention(Double.valueOf("1000"))
//       .pushAckTimeout("3s")
//       .btlPullMargin(Double.valueOf("10"))
//       .reconcileBatchSize(Double.valueOf("10"))
//       .reconcileSleepInterval("1m")
//       .reconciliationEnabled(true)
//       .skipPullingInvalidTransactionsDuringCommit(false)
//       .implicitCollectionDisseminationPolicy(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel)
//       .build();

//       ConfigPeerGossipState configPeerGossipStateModel = new ConfigPeerGossipState.Builder()
//       .enabled(true)
//       .checkInterval("10s")
//       .responseTimeout("3s")
//       .batchSize(Double.valueOf("10"))
//       .blockBufferSize(Double.valueOf("100"))
//       .maxRetries(Double.valueOf("3"))
//       .build();

//       ConfigPeerGossip configPeerGossipModel = new ConfigPeerGossip.Builder()
//       .useLeaderElection(true)
//       .orgLeader(false)
//       .membershipTrackerInterval("5s")
//       .maxBlockCountToStore(Double.valueOf("100"))
//       .maxPropagationBurstLatency("10ms")
//       .maxPropagationBurstSize(Double.valueOf("10"))
//       .propagateIterations(Double.valueOf("3"))
//       .pullInterval("4s")
//       .pullPeerNum(Double.valueOf("3"))
//       .requestStateInfoInterval("4s")
//       .publishStateInfoInterval("4s")
//       .stateInfoRetentionInterval("0s")
//       .publishCertPeriod("10s")
//       .skipBlockVerification(false)
//       .dialTimeout("3s")
//       .connTimeout("2s")
//       .recvBuffSize(Double.valueOf("20"))
//       .sendBuffSize(Double.valueOf("200"))
//       .digestWaitTime("1s")
//       .requestWaitTime("1500ms")
//       .responseWaitTime("2s")
//       .aliveTimeInterval("5s")
//       .aliveExpirationTimeout("25s")
//       .reconnectInterval("25s")
//       .election(configPeerGossipElectionModel)
//       .pvtData(configPeerGossipPvtDataModel)
//       .state(configPeerGossipStateModel)
//       .build();

//       ConfigPeerAuthentication configPeerAuthenticationModel = new ConfigPeerAuthentication.Builder()
//       .timewindow("15m")
//       .build();

//       BccspSW bccspSwModel = new BccspSW.Builder()
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
//       .label("testString")
//       .pin("testString")
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       Bccsp bccspModel = new Bccsp.Builder()
//       .xDefault("SW")
//       .sw(bccspSwModel)
//       .pkcS11(bccspPkcS11Model)
//       .build();

//       ConfigPeerClient configPeerClientModel = new ConfigPeerClient.Builder()
//       .connTimeout("2s")
//       .build();

//       ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItemModel = new ConfigPeerDeliveryclientAddressOverridesItem.Builder()
//       .from("n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
//       .to("n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050")
//       .caCertsFile("my-data/cert.pem")
//       .build();

//       ConfigPeerDeliveryclient configPeerDeliveryclientModel = new ConfigPeerDeliveryclient.Builder()
//       .reconnectTotalTimeThreshold("60m")
//       .connTimeout("2s")
//       .reConnectBackoffThreshold("60m")
//       .addressOverrides(new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)))
//       .build();

//       ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
//       .listenAddress("0.0.0.0:7051")
//       .build();

//       ConfigPeerDiscovery configPeerDiscoveryModel = new ConfigPeerDiscovery.Builder()
//       .enabled(true)
//       .authCacheEnabled(true)
//       .authCacheMaxSize(Double.valueOf("1000"))
//       .authCachePurgeRetentionRatio(Double.valueOf("0.75"))
//       .orgMembersAllowedAccess(false)
//       .build();

//       ConfigPeerLimitsConcurrency configPeerLimitsConcurrencyModel = new ConfigPeerLimitsConcurrency.Builder()
//       .endorserService(Double.valueOf("2500"))
//       .deliverService(Double.valueOf("2500"))
//       .build();

//       ConfigPeerLimits configPeerLimitsModel = new ConfigPeerLimits.Builder()
//       .concurrency(configPeerLimitsConcurrencyModel)
//       .build();

//       ConfigPeerCreatePeer configPeerCreatePeerModel = new ConfigPeerCreatePeer.Builder()
//       .id("john-doe")
//       .networkId("dev")
//       .keepalive(configPeerKeepaliveModel)
//       .gossip(configPeerGossipModel)
//       .authentication(configPeerAuthenticationModel)
//       .bccsp(bccspModel)
//       .client(configPeerClientModel)
//       .deliveryclient(configPeerDeliveryclientModel)
//       .adminService(configPeerAdminServiceModel)
//       .validatorPoolSize(Double.valueOf("8"))
//       .discovery(configPeerDiscoveryModel)
//       .limits(configPeerLimitsModel)
//       .build();

//       ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
//       .dynamicLink(false)
//       .build();

//       ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
//       .path("/path/to/directory")
//       .name("descriptive-build-name")
//       .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")))
//       .build();

//       ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder()
//       .cscc(true)
//       .lscc(true)
//       .escc(true)
//       .vscc(true)
//       .qscc(true)
//       .build();

//       ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder()
//       .level("info")
//       .shim("warning")
//       .format("%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
//       .build();

//       ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
//       .golang(configPeerChaincodeGolangModel)
//       .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
//       .installTimeout("300s")
//       .startuptimeout("300s")
//       .executetimeout("30s")
//       .system(configPeerChaincodeSystemModel)
//       .logging(configPeerChaincodeLoggingModel)
//       .build();

//       MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       Metrics metricsModel = new Metrics.Builder()
//       .provider("prometheus")
//       .statsd(metricsStatsdModel)
//       .build();

//       ConfigPeerCreate configPeerCreateModel = new ConfigPeerCreate.Builder()
//       .peer(configPeerCreatePeerModel)
//       .chaincode(configPeerChaincodeModel)
//       .metrics(metricsModel)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObjectFabV2 resourceObjectFabV2Model = new ResourceObjectFabV2.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       PeerResources peerResourcesModel = new PeerResources.Builder()
//       .chaincodelauncher(resourceObjectFabV2Model)
//       .couchdb(resourceObjectCouchDbModel)
//       .statedb(resourceObjectModel)
//       .dind(resourceObjectFabV1Model)
//       .fluentd(resourceObjectFabV1Model)
//       .peer(resourceObjectModel)
//       .proxy(resourceObjectModel)
//       .build();

//       StorageObject storageObjectModel = new StorageObject.Builder()
//       .size("4GiB")
//       .xClass("default")
//       .build();

//       CreatePeerBodyStorage createPeerBodyStorageModel = new CreatePeerBodyStorage.Builder()
//       .peer(storageObjectModel)
//       .statedb(storageObjectModel)
//       .build();

//       Hsm hsmModel = new Hsm.Builder()
//       .pkcs11endpoint("tcp://example.com:666")
//       .build();

//       CreatePeerOptions createPeerOptions = new CreatePeerOptions.Builder()
//       .mspId("Org1")
//       .displayName("My Peer")
//       .crypto(cryptoObjectModel)
//       .configOverride(configPeerCreateModel)
//       .resources(peerResourcesModel)
//       .storage(createPeerBodyStorageModel)
//       .zone("-")
//       .stateDb("couchdb")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .hsm(hsmModel)
//       .region("-")
//       .version("1.4.6-1")
//       .build();

//       // Invoke operation
//       Response<PeerResponse> response = service.createPeer(createPeerOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       PeerResponse peerResponseResult = response.getResult();

//       assertNotNull(peerResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testImportPeer() throws Exception {
//     try {
//       MspCryptoFieldCa mspCryptoFieldCaModel = new MspCryptoFieldCa.Builder()
//       .name("ca")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoFieldTlsca mspCryptoFieldTlscaModel = new MspCryptoFieldTlsca.Builder()
//       .name("tlsca")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoFieldComponent mspCryptoFieldComponentModel = new MspCryptoFieldComponent.Builder()
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoField mspCryptoFieldModel = new MspCryptoField.Builder()
//       .ca(mspCryptoFieldCaModel)
//       .tlsca(mspCryptoFieldTlscaModel)
//       .component(mspCryptoFieldComponentModel)
//       .build();

//       ImportPeerOptions importPeerOptions = new ImportPeerOptions.Builder()
//       .displayName("My Peer")
//       .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084")
//       .msp(mspCryptoFieldModel)
//       .mspId("Org1")
//       .apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
//       .location("ibmcloud")
//       .operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .build();

//       // Invoke operation
//       Response<PeerResponse> response = service.importPeer(importPeerOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       PeerResponse peerResponseResult = response.getResult();

//       assertNotNull(peerResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditPeer() throws Exception {
//     try {
//       EditPeerOptions editPeerOptions = new EditPeerOptions.Builder()
//       .id("testString")
//       .displayName("My Peer")
//       .apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
//       .operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
//       .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084")
//       .mspId("Org1")
//       .location("ibmcloud")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .build();

//       // Invoke operation
//       Response<PeerResponse> response = service.editPeer(editPeerOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       PeerResponse peerResponseResult = response.getResult();

//       assertNotNull(peerResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testPeerAction() throws Exception {
//     try {
//       ActionReenroll actionReenrollModel = new ActionReenroll.Builder()
//       .tlsCert(true)
//       .ecert(true)
//       .build();

//       ActionEnroll actionEnrollModel = new ActionEnroll.Builder()
//       .tlsCert(true)
//       .ecert(true)
//       .build();

//       PeerActionOptions peerActionOptions = new PeerActionOptions.Builder()
//       .id("testString")
//       .restart(true)
//       .reenroll(actionReenrollModel)
//       .enroll(actionEnrollModel)
//       .upgradeDbs(true)
//       .build();

//       // Invoke operation
//       Response<ActionsResponse> response = service.peerAction(peerActionOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 202);

//       ActionsResponse actionsResponseResult = response.getResult();

//       assertNotNull(actionsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testUpdatePeer() throws Exception {
//     try {
//       ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder()
//       .interval("60s")
//       .timeout("20s")
//       .build();

//       ConfigPeerKeepaliveDeliveryClient configPeerKeepaliveDeliveryClientModel = new ConfigPeerKeepaliveDeliveryClient.Builder()
//       .interval("60s")
//       .timeout("20s")
//       .build();

//       ConfigPeerKeepalive configPeerKeepaliveModel = new ConfigPeerKeepalive.Builder()
//       .minInterval("60s")
//       .client(configPeerKeepaliveClientModel)
//       .deliveryClient(configPeerKeepaliveDeliveryClientModel)
//       .build();

//       ConfigPeerGossipElection configPeerGossipElectionModel = new ConfigPeerGossipElection.Builder()
//       .startupGracePeriod("15s")
//       .membershipSampleInterval("1s")
//       .leaderAliveThreshold("10s")
//       .leaderElectionDuration("5s")
//       .build();

//       ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
//       .requiredPeerCount(Double.valueOf("0"))
//       .maxPeerCount(Double.valueOf("1"))
//       .build();

//       ConfigPeerGossipPvtData configPeerGossipPvtDataModel = new ConfigPeerGossipPvtData.Builder()
//       .pullRetryThreshold("60s")
//       .transientstoreMaxBlockRetention(Double.valueOf("1000"))
//       .pushAckTimeout("3s")
//       .btlPullMargin(Double.valueOf("10"))
//       .reconcileBatchSize(Double.valueOf("10"))
//       .reconcileSleepInterval("1m")
//       .reconciliationEnabled(true)
//       .skipPullingInvalidTransactionsDuringCommit(false)
//       .implicitCollectionDisseminationPolicy(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel)
//       .build();

//       ConfigPeerGossipState configPeerGossipStateModel = new ConfigPeerGossipState.Builder()
//       .enabled(true)
//       .checkInterval("10s")
//       .responseTimeout("3s")
//       .batchSize(Double.valueOf("10"))
//       .blockBufferSize(Double.valueOf("100"))
//       .maxRetries(Double.valueOf("3"))
//       .build();

//       ConfigPeerGossip configPeerGossipModel = new ConfigPeerGossip.Builder()
//       .useLeaderElection(true)
//       .orgLeader(false)
//       .membershipTrackerInterval("5s")
//       .maxBlockCountToStore(Double.valueOf("100"))
//       .maxPropagationBurstLatency("10ms")
//       .maxPropagationBurstSize(Double.valueOf("10"))
//       .propagateIterations(Double.valueOf("3"))
//       .pullInterval("4s")
//       .pullPeerNum(Double.valueOf("3"))
//       .requestStateInfoInterval("4s")
//       .publishStateInfoInterval("4s")
//       .stateInfoRetentionInterval("0s")
//       .publishCertPeriod("10s")
//       .skipBlockVerification(false)
//       .dialTimeout("3s")
//       .connTimeout("2s")
//       .recvBuffSize(Double.valueOf("20"))
//       .sendBuffSize(Double.valueOf("200"))
//       .digestWaitTime("1s")
//       .requestWaitTime("1500ms")
//       .responseWaitTime("2s")
//       .aliveTimeInterval("5s")
//       .aliveExpirationTimeout("25s")
//       .reconnectInterval("25s")
//       .election(configPeerGossipElectionModel)
//       .pvtData(configPeerGossipPvtDataModel)
//       .state(configPeerGossipStateModel)
//       .build();

//       ConfigPeerAuthentication configPeerAuthenticationModel = new ConfigPeerAuthentication.Builder()
//       .timewindow("15m")
//       .build();

//       ConfigPeerClient configPeerClientModel = new ConfigPeerClient.Builder()
//       .connTimeout("2s")
//       .build();

//       ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItemModel = new ConfigPeerDeliveryclientAddressOverridesItem.Builder()
//       .from("n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
//       .to("n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050")
//       .caCertsFile("my-data/cert.pem")
//       .build();

//       ConfigPeerDeliveryclient configPeerDeliveryclientModel = new ConfigPeerDeliveryclient.Builder()
//       .reconnectTotalTimeThreshold("60m")
//       .connTimeout("2s")
//       .reConnectBackoffThreshold("60m")
//       .addressOverrides(new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)))
//       .build();

//       ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
//       .listenAddress("0.0.0.0:7051")
//       .build();

//       ConfigPeerDiscovery configPeerDiscoveryModel = new ConfigPeerDiscovery.Builder()
//       .enabled(true)
//       .authCacheEnabled(true)
//       .authCacheMaxSize(Double.valueOf("1000"))
//       .authCachePurgeRetentionRatio(Double.valueOf("0.75"))
//       .orgMembersAllowedAccess(false)
//       .build();

//       ConfigPeerLimitsConcurrency configPeerLimitsConcurrencyModel = new ConfigPeerLimitsConcurrency.Builder()
//       .endorserService(Double.valueOf("2500"))
//       .deliverService(Double.valueOf("2500"))
//       .build();

//       ConfigPeerLimits configPeerLimitsModel = new ConfigPeerLimits.Builder()
//       .concurrency(configPeerLimitsConcurrencyModel)
//       .build();

//       ConfigPeerUpdatePeer configPeerUpdatePeerModel = new ConfigPeerUpdatePeer.Builder()
//       .id("john-doe")
//       .networkId("dev")
//       .keepalive(configPeerKeepaliveModel)
//       .gossip(configPeerGossipModel)
//       .authentication(configPeerAuthenticationModel)
//       .client(configPeerClientModel)
//       .deliveryclient(configPeerDeliveryclientModel)
//       .adminService(configPeerAdminServiceModel)
//       .validatorPoolSize(Double.valueOf("8"))
//       .discovery(configPeerDiscoveryModel)
//       .limits(configPeerLimitsModel)
//       .build();

//       ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
//       .dynamicLink(false)
//       .build();

//       ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
//       .path("/path/to/directory")
//       .name("descriptive-build-name")
//       .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")))
//       .build();

//       ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder()
//       .cscc(true)
//       .lscc(true)
//       .escc(true)
//       .vscc(true)
//       .qscc(true)
//       .build();

//       ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder()
//       .level("info")
//       .shim("warning")
//       .format("%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
//       .build();

//       ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
//       .golang(configPeerChaincodeGolangModel)
//       .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
//       .installTimeout("300s")
//       .startuptimeout("300s")
//       .executetimeout("30s")
//       .system(configPeerChaincodeSystemModel)
//       .logging(configPeerChaincodeLoggingModel)
//       .build();

//       MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       Metrics metricsModel = new Metrics.Builder()
//       .provider("prometheus")
//       .statsd(metricsStatsdModel)
//       .build();

//       ConfigPeerUpdate configPeerUpdateModel = new ConfigPeerUpdate.Builder()
//       .peer(configPeerUpdatePeerModel)
//       .chaincode(configPeerChaincodeModel)
//       .metrics(metricsModel)
//       .build();

//       CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
//       .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("ca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .build();

//       UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("tlsca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
//       .component(cryptoEnrollmentComponentModel)
//       .ca(updateEnrollmentCryptoFieldCaModel)
//       .tlsca(updateEnrollmentCryptoFieldTlscaModel)
//       .build();

//       UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       ClientAuth clientAuthModel = new ClientAuth.Builder()
//       .type("noclientcert")
//       .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
//       .ekey("testString")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsKey("testString")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .clientAuth(clientAuthModel)
//       .build();

//       UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder()
//       .ca(updateMspCryptoFieldCaModel)
//       .tlsca(updateMspCryptoFieldTlscaModel)
//       .component(updateMspCryptoFieldComponentModel)
//       .build();

//       UpdatePeerBodyCrypto updatePeerBodyCryptoModel = new UpdatePeerBodyCrypto.Builder()
//       .enrollment(updateEnrollmentCryptoFieldModel)
//       .msp(updateMspCryptoFieldModel)
//       .build();

//       NodeOu nodeOuModel = new NodeOu.Builder()
//       .enabled(true)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObjectFabV2 resourceObjectFabV2Model = new ResourceObjectFabV2.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       PeerResources peerResourcesModel = new PeerResources.Builder()
//       .chaincodelauncher(resourceObjectFabV2Model)
//       .couchdb(resourceObjectCouchDbModel)
//       .statedb(resourceObjectModel)
//       .dind(resourceObjectFabV1Model)
//       .fluentd(resourceObjectFabV1Model)
//       .peer(resourceObjectModel)
//       .proxy(resourceObjectModel)
//       .build();

//       UpdatePeerOptions updatePeerOptions = new UpdatePeerOptions.Builder()
//       .id("testString")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .configOverride(configPeerUpdateModel)
//       .crypto(updatePeerBodyCryptoModel)
//       .nodeOu(nodeOuModel)
//       .replicas(Double.valueOf("1"))
//       .resources(peerResourcesModel)
//       .version("1.4.6-1")
//       .zone("-")
//       .build();

//       // Invoke operation
//       Response<PeerResponse> response = service.updatePeer(updatePeerOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       PeerResponse peerResponseResult = response.getResult();

//       assertNotNull(peerResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testCreateOrderer() throws Exception {
//     try {
//       CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
//       .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("ca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .build();

//       CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("tlsca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
//       .component(cryptoEnrollmentComponentModel)
//       .ca(cryptoObjectEnrollmentCaModel)
//       .tlsca(cryptoObjectEnrollmentTlscaModel)
//       .build();

//       ClientAuth clientAuthModel = new ClientAuth.Builder()
//       .type("noclientcert")
//       .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder()
//       .ekey("testString")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsKey("testString")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .clientAuth(clientAuthModel)
//       .build();

//       MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder()
//       .component(mspCryptoCompModel)
//       .ca(mspCryptoCaModel)
//       .tlsca(mspCryptoCaModel)
//       .build();

//       CryptoObject cryptoObjectModel = new CryptoObject.Builder()
//       .enrollment(cryptoObjectEnrollmentModel)
//       .msp(cryptoObjectMspModel)
//       .build();

//       ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
//       .serverMinInterval("60s")
//       .serverInterval("2h")
//       .serverTimeout("20s")
//       .build();

//       BccspSW bccspSwModel = new BccspSW.Builder()
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
//       .label("testString")
//       .pin("testString")
//       .hash("SHA2")
//       .security(Double.valueOf("256"))
//       .build();

//       Bccsp bccspModel = new Bccsp.Builder()
//       .xDefault("SW")
//       .sw(bccspSwModel)
//       .pkcS11(bccspPkcS11Model)
//       .build();

//       ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
//       .timeWindow("15m")
//       .noExpirationChecks(false)
//       .build();

//       ConfigOrdererGeneral configOrdererGeneralModel = new ConfigOrdererGeneral.Builder()
//       .keepalive(configOrdererKeepaliveModel)
//       .bccsp(bccspModel)
//       .authentication(configOrdererAuthenticationModel)
//       .build();

//       ConfigOrdererDebug configOrdererDebugModel = new ConfigOrdererDebug.Builder()
//       .broadcastTraceDir("testString")
//       .deliverTraceDir("testString")
//       .build();

//       ConfigOrdererMetricsStatsd configOrdererMetricsStatsdModel = new ConfigOrdererMetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       ConfigOrdererMetrics configOrdererMetricsModel = new ConfigOrdererMetrics.Builder()
//       .provider("disabled")
//       .statsd(configOrdererMetricsStatsdModel)
//       .build();

//       ConfigOrdererCreate configOrdererCreateModel = new ConfigOrdererCreate.Builder()
//       .general(configOrdererGeneralModel)
//       .debug(configOrdererDebugModel)
//       .metrics(configOrdererMetricsModel)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       CreateOrdererRaftBodyResources createOrdererRaftBodyResourcesModel = new CreateOrdererRaftBodyResources.Builder()
//       .orderer(resourceObjectModel)
//       .proxy(resourceObjectModel)
//       .build();

//       StorageObject storageObjectModel = new StorageObject.Builder()
//       .size("4GiB")
//       .xClass("default")
//       .build();

//       CreateOrdererRaftBodyStorage createOrdererRaftBodyStorageModel = new CreateOrdererRaftBodyStorage.Builder()
//       .orderer(storageObjectModel)
//       .build();

//       Hsm hsmModel = new Hsm.Builder()
//       .pkcs11endpoint("tcp://example.com:666")
//       .build();

//       CreateOrdererOptions createOrdererOptions = new CreateOrdererOptions.Builder()
//       .ordererType("raft")
//       .mspId("Org1")
//       .displayName("orderer")
//       .crypto(new java.util.ArrayList<CryptoObject>(java.util.Arrays.asList(cryptoObjectModel)))
//       .clusterName("ordering service 1")
//       .clusterId("abcde")
//       .externalAppend("false")
//       .configOverride(new java.util.ArrayList<ConfigOrdererCreate>(java.util.Arrays.asList(configOrdererCreateModel)))
//       .resources(createOrdererRaftBodyResourcesModel)
//       .storage(createOrdererRaftBodyStorageModel)
//       .systemChannelId("testchainid")
//       .zone(new java.util.ArrayList<String>(java.util.Arrays.asList("-")))
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .region(new java.util.ArrayList<String>(java.util.Arrays.asList("-")))
//       .hsm(hsmModel)
//       .version("1.4.6-1")
//       .build();

//       // Invoke operation
//       Response<OrdererResponse> response = service.createOrderer(createOrdererOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       OrdererResponse ordererResponseResult = response.getResult();

//       assertNotNull(ordererResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testImportOrderer() throws Exception {
//     try {
//       MspCryptoFieldCa mspCryptoFieldCaModel = new MspCryptoFieldCa.Builder()
//       .name("ca")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoFieldTlsca mspCryptoFieldTlscaModel = new MspCryptoFieldTlsca.Builder()
//       .name("tlsca")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoFieldComponent mspCryptoFieldComponentModel = new MspCryptoFieldComponent.Builder()
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       MspCryptoField mspCryptoFieldModel = new MspCryptoField.Builder()
//       .ca(mspCryptoFieldCaModel)
//       .tlsca(mspCryptoFieldTlscaModel)
//       .component(mspCryptoFieldComponentModel)
//       .build();

//       ImportOrdererOptions importOrdererOptions = new ImportOrdererOptions.Builder()
//       .clusterName("ordering service 1")
//       .displayName("orderer")
//       .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443")
//       .msp(mspCryptoFieldModel)
//       .mspId("Org1")
//       .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
//       .clusterId("testString")
//       .location("ibmcloud")
//       .operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
//       .systemChannelId("testchainid")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .build();

//       // Invoke operation
//       Response<OrdererResponse> response = service.importOrderer(importOrdererOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       OrdererResponse ordererResponseResult = response.getResult();

//       assertNotNull(ordererResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditOrderer() throws Exception {
//     try {
//       EditOrdererOptions editOrdererOptions = new EditOrdererOptions.Builder()
//       .id("testString")
//       .clusterName("ordering service 1")
//       .displayName("orderer")
//       .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
//       .operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
//       .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443")
//       .mspId("Org1")
//       .consenterProposalFin(true)
//       .location("ibmcloud")
//       .systemChannelId("testchainid")
//       .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
//       .build();

//       // Invoke operation
//       Response<OrdererResponse> response = service.editOrderer(editOrdererOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       OrdererResponse ordererResponseResult = response.getResult();

//       assertNotNull(ordererResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testOrdererAction() throws Exception {
//     try {
//       ActionReenroll actionReenrollModel = new ActionReenroll.Builder()
//       .tlsCert(true)
//       .ecert(true)
//       .build();

//       ActionEnroll actionEnrollModel = new ActionEnroll.Builder()
//       .tlsCert(true)
//       .ecert(true)
//       .build();

//       OrdererActionOptions ordererActionOptions = new OrdererActionOptions.Builder()
//       .id("testString")
//       .restart(true)
//       .reenroll(actionReenrollModel)
//       .enroll(actionEnrollModel)
//       .build();

//       // Invoke operation
//       Response<ActionsResponse> response = service.ordererAction(ordererActionOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 202);

//       ActionsResponse actionsResponseResult = response.getResult();

//       assertNotNull(actionsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testUpdateOrderer() throws Exception {
//     try {
//       ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
//       .serverMinInterval("60s")
//       .serverInterval("2h")
//       .serverTimeout("20s")
//       .build();

//       ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
//       .timeWindow("15m")
//       .noExpirationChecks(false)
//       .build();

//       ConfigOrdererGeneralUpdate configOrdererGeneralUpdateModel = new ConfigOrdererGeneralUpdate.Builder()
//       .keepalive(configOrdererKeepaliveModel)
//       .authentication(configOrdererAuthenticationModel)
//       .build();

//       ConfigOrdererDebug configOrdererDebugModel = new ConfigOrdererDebug.Builder()
//       .broadcastTraceDir("testString")
//       .deliverTraceDir("testString")
//       .build();

//       ConfigOrdererMetricsStatsd configOrdererMetricsStatsdModel = new ConfigOrdererMetricsStatsd.Builder()
//       .network("udp")
//       .address("127.0.0.1:8125")
//       .writeInterval("10s")
//       .prefix("server")
//       .build();

//       ConfigOrdererMetrics configOrdererMetricsModel = new ConfigOrdererMetrics.Builder()
//       .provider("disabled")
//       .statsd(configOrdererMetricsStatsdModel)
//       .build();

//       ConfigOrdererUpdate configOrdererUpdateModel = new ConfigOrdererUpdate.Builder()
//       .general(configOrdererGeneralUpdateModel)
//       .debug(configOrdererDebugModel)
//       .metrics(configOrdererMetricsModel)
//       .build();

//       CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
//       .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("ca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .build();

//       UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
//       .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
//       .port(Double.valueOf("7054"))
//       .name("tlsca")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .enrollId("admin")
//       .enrollSecret("password")
//       .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
//       .component(cryptoEnrollmentComponentModel)
//       .ca(updateEnrollmentCryptoFieldCaModel)
//       .tlsca(updateEnrollmentCryptoFieldTlscaModel)
//       .build();

//       UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       ClientAuth clientAuthModel = new ClientAuth.Builder()
//       .type("noclientcert")
//       .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
//       .build();

//       UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
//       .ekey("testString")
//       .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsKey("testString")
//       .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
//       .clientAuth(clientAuthModel)
//       .build();

//       UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder()
//       .ca(updateMspCryptoFieldCaModel)
//       .tlsca(updateMspCryptoFieldTlscaModel)
//       .component(updateMspCryptoFieldComponentModel)
//       .build();

//       UpdateOrdererBodyCrypto updateOrdererBodyCryptoModel = new UpdateOrdererBodyCrypto.Builder()
//       .enrollment(updateEnrollmentCryptoFieldModel)
//       .msp(updateMspCryptoFieldModel)
//       .build();

//       NodeOu nodeOuModel = new NodeOu.Builder()
//       .enabled(true)
//       .build();

//       ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
//       .cpu("100m")
//       .memory("256MiB")
//       .build();

//       ResourceObject resourceObjectModel = new ResourceObject.Builder()
//       .requests(resourceRequestsModel)
//       .limits(resourceLimitsModel)
//       .build();

//       UpdateOrdererBodyResources updateOrdererBodyResourcesModel = new UpdateOrdererBodyResources.Builder()
//       .orderer(resourceObjectModel)
//       .proxy(resourceObjectModel)
//       .build();

//       UpdateOrdererOptions updateOrdererOptions = new UpdateOrdererOptions.Builder()
//       .id("testString")
//       .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .configOverride(configOrdererUpdateModel)
//       .crypto(updateOrdererBodyCryptoModel)
//       .nodeOu(nodeOuModel)
//       .replicas(Double.valueOf("1"))
//       .resources(updateOrdererBodyResourcesModel)
//       .version("1.4.6-1")
//       .zone("-")
//       .build();

//       // Invoke operation
//       Response<OrdererResponse> response = service.updateOrderer(updateOrdererOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       OrdererResponse ordererResponseResult = response.getResult();

//       assertNotNull(ordererResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testSubmitBlock() throws Exception {
//     try {
//       SubmitBlockOptions submitBlockOptions = new SubmitBlockOptions.Builder()
//       .id("testString")
//       .b64Block("bWFzc2l2ZSBiaW5hcnkgb2YgYSBjb25maWcgYmxvY2sgd291bGQgYmUgaGVyZSBpZiB0aGlzIHdhcyByZWFsLCBwbGVhc2UgZG9udCBzZW5kIHRoaXM=")
//       .build();

//       // Invoke operation
//       Response<GenericComponentResponse> response = service.submitBlock(submitBlockOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GenericComponentResponse genericComponentResponseResult = response.getResult();

//       assertNotNull(genericComponentResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testImportMsp() throws Exception {
//     try {
//       ImportMspOptions importMspOptions = new ImportMspOptions.Builder()
//       .mspId("Org1")
//       .displayName("My Peer")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .intermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K")))
//       .admins(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsRootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       // Invoke operation
//       Response<MspResponse> response = service.importMsp(importMspOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       MspResponse mspResponseResult = response.getResult();

//       assertNotNull(mspResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditMsp() throws Exception {
//     try {
//       EditMspOptions editMspOptions = new EditMspOptions.Builder()
//       .id("testString")
//       .mspId("Org1")
//       .displayName("My Peer")
//       .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .intermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkRhdGEgaGVyZSBpZiB0aGlzIHdhcyByZWFsCi0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K")))
//       .admins(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .tlsRootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       // Invoke operation
//       Response<MspResponse> response = service.editMsp(editMspOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       MspResponse mspResponseResult = response.getResult();

//       assertNotNull(mspResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetMspCertificate() throws Exception {
//     try {
//       GetMspCertificateOptions getMspCertificateOptions = new GetMspCertificateOptions.Builder()
//       .mspId("testString")
//       .cache("skip")
//       .build();

//       // Invoke operation
//       Response<GetMSPCertificateResponse> response = service.getMspCertificate(getMspCertificateOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetMSPCertificateResponse getMspCertificateResponseResult = response.getResult();

//       assertNotNull(getMspCertificateResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditAdminCerts() throws Exception {
//     try {
//       EditAdminCertsOptions editAdminCertsOptions = new EditAdminCertsOptions.Builder()
//       .id("testString")
//       .appendAdminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .removeAdminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
//       .build();

//       // Invoke operation
//       Response<EditAdminCertsResponse> response = service.editAdminCerts(editAdminCertsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       EditAdminCertsResponse editAdminCertsResponseResult = response.getResult();

//       assertNotNull(editAdminCertsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testListComponents() throws Exception {
//     try {
//       ListComponentsOptions listComponentsOptions = new ListComponentsOptions.Builder()
//       .deploymentAttrs("included")
//       .parsedCerts("included")
//       .cache("skip")
//       .caAttrs("included")
//       .build();

//       // Invoke operation
//       Response<GetMultiComponentsResponse> response = service.listComponents(listComponentsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetMultiComponentsResponse getMultiComponentsResponseResult = response.getResult();

//       assertNotNull(getMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetComponentsByType() throws Exception {
//     try {
//       GetComponentsByTypeOptions getComponentsByTypeOptions = new GetComponentsByTypeOptions.Builder()
//       .componentType("fabric-peer")
//       .deploymentAttrs("included")
//       .parsedCerts("included")
//       .cache("skip")
//       .build();

//       // Invoke operation
//       Response<GetMultiComponentsResponse> response = service.getComponentsByType(getComponentsByTypeOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetMultiComponentsResponse getMultiComponentsResponseResult = response.getResult();

//       assertNotNull(getMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetComponentsByTag() throws Exception {
//     try {
//       GetComponentsByTagOptions getComponentsByTagOptions = new GetComponentsByTagOptions.Builder()
//       .tag("testString")
//       .deploymentAttrs("included")
//       .parsedCerts("included")
//       .cache("skip")
//       .build();

//       // Invoke operation
//       Response<GetMultiComponentsResponse> response = service.getComponentsByTag(getComponentsByTagOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetMultiComponentsResponse getMultiComponentsResponseResult = response.getResult();

//       assertNotNull(getMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetSettings() throws Exception {
//     try {
//       GetSettingsOptions getSettingsOptions = new GetSettingsOptions();

//       // Invoke operation
//       Response<GetPublicSettingsResponse> response = service.getSettings(getSettingsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetPublicSettingsResponse getPublicSettingsResponseResult = response.getResult();

//       assertNotNull(getPublicSettingsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testEditSettings() throws Exception {
//     try {
//       EditSettingsBodyInactivityTimeouts editSettingsBodyInactivityTimeoutsModel = new EditSettingsBodyInactivityTimeouts.Builder()
//       .enabled(false)
//       .maxIdleTime(Double.valueOf("90000"))
//       .build();

//       LoggingSettingsClient loggingSettingsClientModel = new LoggingSettingsClient.Builder()
//       .enabled(true)
//       .level("silly")
//       .uniqueName(false)
//       .build();

//       LoggingSettingsServer loggingSettingsServerModel = new LoggingSettingsServer.Builder()
//       .enabled(true)
//       .level("silly")
//       .uniqueName(false)
//       .build();

//       EditLogSettingsBody editLogSettingsBodyModel = new EditLogSettingsBody.Builder()
//       .client(loggingSettingsClientModel)
//       .server(loggingSettingsServerModel)
//       .build();

//       EditSettingsOptions editSettingsOptions = new EditSettingsOptions.Builder()
//       .inactivityTimeouts(editSettingsBodyInactivityTimeoutsModel)
//       .fileLogging(editLogSettingsBodyModel)
//       .maxReqPerMin(Double.valueOf("25"))
//       .maxReqPerMinAk(Double.valueOf("25"))
//       .fabricGetBlockTimeoutMs(Double.valueOf("10000"))
//       .fabricInstantiateTimeoutMs(Double.valueOf("300000"))
//       .fabricJoinChannelTimeoutMs(Double.valueOf("25000"))
//       .fabricInstallCcTimeoutMs(Double.valueOf("300000"))
//       .fabricLcInstallCcTimeoutMs(Double.valueOf("300000"))
//       .fabricLcGetCcTimeoutMs(Double.valueOf("180000"))
//       .fabricGeneralTimeoutMs(Double.valueOf("10000"))
//       .build();

//       // Invoke operation
//       Response<GetPublicSettingsResponse> response = service.editSettings(editSettingsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetPublicSettingsResponse getPublicSettingsResponseResult = response.getResult();

//       assertNotNull(getPublicSettingsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetFabVersions() throws Exception {
//     try {
//       GetFabVersionsOptions getFabVersionsOptions = new GetFabVersionsOptions.Builder()
//       .cache("skip")
//       .build();

//       // Invoke operation
//       Response<GetFabricVersionsResponse> response = service.getFabVersions(getFabVersionsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetFabricVersionsResponse getFabricVersionsResponseResult = response.getResult();

//       assertNotNull(getFabricVersionsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetHealth() throws Exception {
//     try {
//       GetHealthOptions getHealthOptions = new GetHealthOptions();

//       // Invoke operation
//       Response<GetAthenaHealthStatsResponse> response = service.getHealth(getHealthOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetAthenaHealthStatsResponse getAthenaHealthStatsResponseResult = response.getResult();

//       assertNotNull(getAthenaHealthStatsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testListNotifications() throws Exception {
//     try {
//       ListNotificationsOptions listNotificationsOptions = new ListNotificationsOptions.Builder()
//       .limit(Double.valueOf("1"))
//       .skip(Double.valueOf("1"))
//       .componentId("MyPeer")
//       .build();

//       // Invoke operation
//       Response<GetNotificationsResponse> response = service.listNotifications(listNotificationsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       GetNotificationsResponse getNotificationsResponseResult = response.getResult();

//       assertNotNull(getNotificationsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testArchiveNotifications() throws Exception {
//     try {
//       ArchiveNotificationsOptions archiveNotificationsOptions = new ArchiveNotificationsOptions.Builder()
//       .notificationIds(new java.util.ArrayList<String>(java.util.Arrays.asList("c9d00ebf849051e4f102008dc0be2488")))
//       .build();

//       // Invoke operation
//       Response<ArchiveResponse> response = service.archiveNotifications(archiveNotificationsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       ArchiveResponse archiveResponseResult = response.getResult();

//       assertNotNull(archiveResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testRestart() throws Exception {
//     try {
//       RestartOptions restartOptions = new RestartOptions();

//       // Invoke operation
//       Response<RestartAthenaResponse> response = service.restart(restartOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       RestartAthenaResponse restartAthenaResponseResult = response.getResult();

//       assertNotNull(restartAthenaResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetPostman() throws Exception {
//     try {
//       GetPostmanOptions getPostmanOptions = new GetPostmanOptions.Builder()
//       .authType("bearer")
//       .token("testString")
//       .apiKey("testString")
//       .username("admin")
//       .password("password")
//       .build();

//       // Invoke operation
//       Response<Void> response = service.getPostman(getPostmanOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testGetSwagger() throws Exception {
//     try {
//       GetSwaggerOptions getSwaggerOptions = new GetSwaggerOptions();

//       // Invoke operation
//       Response<String> response = service.getSwagger(getSwaggerOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       String resultResult = response.getResult();

//       assertNotNull(resultResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testRemoveComponentsByTag() throws Exception {
//     try {
//       RemoveComponentsByTagOptions removeComponentsByTagOptions = new RemoveComponentsByTagOptions.Builder()
//       .tag("testString")
//       .build();

//       // Invoke operation
//       Response<RemoveMultiComponentsResponse> response = service.removeComponentsByTag(removeComponentsByTagOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       RemoveMultiComponentsResponse removeMultiComponentsResponseResult = response.getResult();

//       assertNotNull(removeMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testRemoveComponent() throws Exception {
//     try {
//       RemoveComponentOptions removeComponentOptions = new RemoveComponentOptions.Builder()
//       .id("testString")
//       .build();

//       // Invoke operation
//       Response<DeleteComponentResponse> response = service.removeComponent(removeComponentOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteComponentResponse deleteComponentResponseResult = response.getResult();

//       assertNotNull(deleteComponentResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteSigTx() throws Exception {
//     try {
//       DeleteSigTxOptions deleteSigTxOptions = new DeleteSigTxOptions.Builder()
//       .id("testString")
//       .build();

//       // Invoke operation
//       Response<DeleteSignatureCollectionResponse> response = service.deleteSigTx(deleteSigTxOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteSignatureCollectionResponse deleteSignatureCollectionResponseResult = response.getResult();

//       assertNotNull(deleteSignatureCollectionResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteComponentsByTag() throws Exception {
//     try {
//       DeleteComponentsByTagOptions deleteComponentsByTagOptions = new DeleteComponentsByTagOptions.Builder()
//       .tag("testString")
//       .build();

//       // Invoke operation
//       Response<DeleteMultiComponentsResponse> response = service.deleteComponentsByTag(deleteComponentsByTagOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteMultiComponentsResponse deleteMultiComponentsResponseResult = response.getResult();

//       assertNotNull(deleteMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteComponent() throws Exception {
//     try {
//       DeleteComponentOptions deleteComponentOptions = new DeleteComponentOptions.Builder()
//       .id("testString")
//       .build();

//       // Invoke operation
//       Response<DeleteComponentResponse> response = service.deleteComponent(deleteComponentOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteComponentResponse deleteComponentResponseResult = response.getResult();

//       assertNotNull(deleteComponentResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteAllSessions() throws Exception {
//     try {
//       DeleteAllSessionsOptions deleteAllSessionsOptions = new DeleteAllSessionsOptions();

//       // Invoke operation
//       Response<DeleteAllSessionsResponse> response = service.deleteAllSessions(deleteAllSessionsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteAllSessionsResponse deleteAllSessionsResponseResult = response.getResult();

//       assertNotNull(deleteAllSessionsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteAllNotifications() throws Exception {
//     try {
//       DeleteAllNotificationsOptions deleteAllNotificationsOptions = new DeleteAllNotificationsOptions();

//       // Invoke operation
//       Response<DeleteAllNotificationsResponse> response = service.deleteAllNotifications(deleteAllNotificationsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteAllNotificationsResponse deleteAllNotificationsResponseResult = response.getResult();

//       assertNotNull(deleteAllNotificationsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testDeleteAllComponents() throws Exception {
//     try {
//       DeleteAllComponentsOptions deleteAllComponentsOptions = new DeleteAllComponentsOptions();

//       // Invoke operation
//       Response<DeleteMultiComponentsResponse> response = service.deleteAllComponents(deleteAllComponentsOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       DeleteMultiComponentsResponse deleteMultiComponentsResponseResult = response.getResult();

//       assertNotNull(deleteMultiComponentsResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @Test
//   public void testClearCaches() throws Exception {
//     try {
//       ClearCachesOptions clearCachesOptions = new ClearCachesOptions();

//       // Invoke operation
//       Response<CacheFlushResponse> response = service.clearCaches(clearCachesOptions).execute();
//       // Validate response
//       assertNotNull(response);
//       assertEquals(response.getStatusCode(), 200);

//       CacheFlushResponse cacheFlushResponseResult = response.getResult();

//       assertNotNull(cacheFlushResponseResult);
//     } catch (ServiceResponseException e) {
//         fail(String.format("Service returned status code %d: %s\nError details: %s",
//           e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
//     }
//   }

//   @AfterClass
//   public void tearDown() {
//     // Add any clean up logic here
//     System.out.println("Clean up complete.");
//   }
//  }
