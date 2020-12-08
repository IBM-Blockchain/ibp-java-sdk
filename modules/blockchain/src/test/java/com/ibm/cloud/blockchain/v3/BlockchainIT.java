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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
// import static org.testng.Assert.assertEquals;
// import static org.testng.Assert.assertFalse;
// import static org.testng.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.blockchain.test.SdkIntegrationTestBase;
import com.ibm.cloud.blockchain.v3.model.ActionsResponse;
import com.ibm.cloud.blockchain.v3.model.CaActionOptions;
import com.ibm.cloud.blockchain.v3.model.CaResponse;
import com.ibm.cloud.blockchain.v3.model.ConfigCACreate;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistry;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
// import com.ibm.cloud.blockchain.v3.model.CpuHealthStats;
// import com.ibm.cloud.blockchain.v3.model.CpuHealthStatsTimes;
import com.ibm.cloud.blockchain.v3.model.CreateCaBodyConfigOverride;
import com.ibm.cloud.blockchain.v3.model.CreateCaOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentResponse;
import com.ibm.cloud.blockchain.v3.model.EditCaOptions;
// import com.ibm.cloud.blockchain.v3.model.FabVersionObject;
// import com.ibm.cloud.blockchain.v3.model.FabricVersionDictionary;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
import com.ibm.cloud.blockchain.v3.model.GetComponentOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTagOptions;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOPTOOLS;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOPTOOLSMemoryUsage;
// import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponseOS;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions.Type;
import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMsp;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspCa;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspComponent;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspTlsca;
import com.ibm.cloud.blockchain.v3.model.ImportCaOptions;
import com.ibm.cloud.blockchain.v3.model.ListComponentsOptions;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Integration test class for the Blockchain service.
 */
public class BlockchainIT extends SdkIntegrationTestBase {
        public Blockchain service = null;
        public static Map<String, String> config = null;
        final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
        final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

        /**
         * This method provides our config filename to the base class.
         */

        public String getConfigFilename() {
                return "../../blockchain_v3.env";
        }

        public String prefix(String name) {
                return new StringBuilder().append("JavaIBPSDK_").append(name).toString();
        }

        @BeforeClass
        public void constructService() {
                // Ask super if we should skip the tests.
                if (skipTests()) {
                        return;
                }

                service = Blockchain.newInstance();
                assertNotNull(service);
                assertNotNull(service.getServiceUrl());

                // Load up our test-specific config properties.
                config = CredentialUtils.getServiceProperties(Blockchain.DEFAULT_SERVICE_NAME);
                assertNotNull(config);
                assertFalse(config.isEmpty());
                assertEquals(service.getServiceUrl(), config.get("URL"));

                System.out.println("Setup complete.");
        }

        String createdCaId;

        @Test(groups = { "create" })
        public void testCreateCa() throws Exception {
                try {
                        IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder().hfRegistrarRoles("*")
                                        .hfRegistrarDelegateRoles("*").hfRevoker(true).hfIntermediateCa(true)
                                        .hfGenCrl(true).hfRegistrarAttributes("*").hfAffiliationMgr(true).build();

                        ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
                                        .name("admin").pass("password").type("client").affiliation("")
                                        .attrs(identityAttrsModel).build();

                        ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder()
                                        .maxenrollments(Double.valueOf("-1"))
                                        .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(
                                                        java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
                                        .build();

                        ConfigCACreate configCaCreateModel = new ConfigCACreate.Builder()
                                        .registry(configCaRegistryModel).build();

                        CreateCaBodyConfigOverride createCaBodyConfigOverrideModel = new CreateCaBodyConfigOverride.Builder()
                                        .ca(configCaCreateModel).build();

                        CreateCaOptions createCaOptions = new CreateCaOptions.Builder().displayName(prefix("My CA"))
                                        .configOverride(createCaBodyConfigOverrideModel).build();

                        // Invoke operation
                        Response<CaResponse> response = service.createCa(createCaOptions).execute();
                        // Validate response
                        assertNotNull(response);
                        assertEquals(response.getStatusCode(), 200);

                        CaResponse caResponseResult = response.getResult();

                        assertNotNull(caResponseResult);
                        createdCaId = caResponseResult.getId();
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void restartCA() throws Exception {
                if (createdCaId == null) {
                        fail("CA id not available");
                }
                CaActionOptions caActionOptions = new CaActionOptions.Builder().restart(true).id(createdCaId).build();
                ServiceCall<ActionsResponse> call = service.caAction(caActionOptions);
                Response<ActionsResponse> resp = call.execute();

                assertNotNull(resp);
                ActionsResponse actionresp = resp.getResult();
                assertNotNull(actionresp);

                assertEquals(202, resp.getStatusCode());
                System.out.println(actionresp.getActions());
        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void getCaInfo() throws Exception {
                if (createdCaId == null) {
                        fail("CA id not available");
                }
                try {

                        GetComponentOptions options = new GetComponentOptions.Builder().cache("skip").id(createdCaId)
                                        .deploymentAttrs("included").build();
                        ServiceCall<GenericComponentResponse> call = service.getComponent(options);
                        Response<GenericComponentResponse> resp = call.execute();

                        assertNotNull(resp);
                        GenericComponentResponse actionresp = resp.getResult();
                        assertNotNull(actionresp);

                        assertEquals(200, resp.getStatusCode());
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void getAllComponentData() throws Exception {
                ListComponentsOptions listComponentsOptions = new ListComponentsOptions.Builder().cache("skip")
                                .deploymentAttrs("included").build();

                ServiceCall<GetMultiComponentsResponse> call = service.listComponents(listComponentsOptions);
                Response<GetMultiComponentsResponse> resp = call.execute();
                assertNotNull(resp);
                assertEquals(200, resp.getStatusCode());

                GetMultiComponentsResponse compResp = resp.getResult();
                assertNotNull(compResp);
                List<GenericComponentResponse> components = compResp.getComponents();

                assertTrue(components.size() > 0);

        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void getAllComponentDataNoDeployment() throws Exception {
                ListComponentsOptions listComponentsOptions = new ListComponentsOptions.Builder().cache("skip")
                                .deploymentAttrs(ListComponentsOptions.DeploymentAttrs.OMITTED).build();

                ServiceCall<GetMultiComponentsResponse> call = service.listComponents(listComponentsOptions);
                Response<GetMultiComponentsResponse> resp = call.execute();
                assertNotNull(resp);
                assertEquals(200, resp.getStatusCode());

                GetMultiComponentsResponse compResp = resp.getResult();
                assertNotNull(compResp);
                List<GenericComponentResponse> components = compResp.getComponents();

                assertTrue(components.size() > 0);

        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void getAllByType() throws Exception {
                // get all the peer components
                GetComponentsByTypeOptions options = new GetComponentsByTypeOptions.Builder().type(Type.FABRIC_CA)
                                .deploymentAttrs(GetComponentsByTypeOptions.DeploymentAttrs.INCLUDED).build();
                ServiceCall<GetMultiComponentsResponse> call = service.getComponentsByType(options);
                Response<GetMultiComponentsResponse> response = call.execute();
                List<GenericComponentResponse> l = response.getResult().getComponents();

                assertNotNull(l);
        }

        @Test(dependsOnMethods = { "testCreateCa" }, groups = { "cause" })
        public void getByTag() throws Exception {
                GetComponentsByTagOptions options = new GetComponentsByTagOptions.Builder().tag("ibm_saas")
                                .deploymentAttrs(GetComponentsByTagOptions.DeploymentAttrs.INCLUDED).build();
                ServiceCall<GetMultiComponentsResponse> call = service.getComponentsByTag(options);
                Response<GetMultiComponentsResponse> response = call.execute();
                List<GenericComponentResponse> l = response.getResult().getComponents();

                assertNotNull(l);
        }

        @Test(dependsOnGroups = { "cause" })
        public void deleteCa() throws Exception {

                DeleteComponentOptions options = new DeleteComponentOptions.Builder().id(createdCaId).build();

                ServiceCall<DeleteComponentResponse> call = service.deleteComponent(options);
                Response<DeleteComponentResponse> response = call.execute();
                assertNotNull(response);
                assertEquals(200, response.getStatusCode());

                DeleteComponentResponse deleteResponse = response.getResult();
                System.out.println(deleteResponse);
        }

        @Test(dependsOnMethods = { "deleteCa" })
        public void importFakeCa() throws Exception {
                String cert = "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURxVENDQTArZ0F3SUJBZ0lSQUwxQ2lORks1SkxIZGNraGh1bjFETFV3Q2dZSUtvWkl6ajBFQXdJd2dkVXgKQ3pBSkJnTlZCQVlUQWxWVE1SY3dGUVlEVlFRSUV3NU9iM0owYUNCRFlYSnZiR2x1WVRFUE1BMEdBMVVFQnhNRwpSSFZ5YUdGdE1Rd3dDZ1lEVlFRS0V3TkpRazB4RXpBUkJnTlZCQXNUQ2tKc2IyTnJZMmhoYVc0eGVUQjNCZ05WCkJBTVRjR05sYkdSbGNuUmxjM1F4TFc5eVp6RmpZUzFqWVM1alpXeGtaWEl4TFdJell5MDBlREUyTFRNek5HVXgKT1dJMU5qTTBOMlE1WTJVek1tSTJaRFpoT0Rjd1pERTBaak0zTFRBd01EQXVkWE10YzI5MWRHZ3VZMjl1ZEdGcApibVZ5Y3k1aGNIQmtiMjFoYVc0dVkyeHZkV1F3SGhjTk1qQXhNREU0TURFMU5URTNXaGNOTXpBeE1ERTJNREUxCk5URTNXakNCMVRFTE1Ba0dBMVVFQmhNQ1ZWTXhGekFWQmdOVkJBZ1REazV2Y25Sb0lFTmhjbTlzYVc1aE1ROHcKRFFZRFZRUUhFd1pFZFhKb1lXMHhEREFLQmdOVkJBb1RBMGxDVFRFVE1CRUdBMVVFQ3hNS1FteHZZMnRqYUdGcApiakY1TUhjR0ExVUVBeE53WTJWc1pHVnlkR1Z6ZERFdGIzSm5NV05oTFdOaExtTmxiR1JsY2pFdFlqTmpMVFI0Ck1UWXRNek0wWlRFNVlqVTJNelEzWkRsalpUTXlZalprTm1FNE56QmtNVFJtTXpjdE1EQXdNQzUxY3kxemIzVjAKYUM1amIyNTBZV2x1WlhKekxtRndjR1J2YldGcGJpNWpiRzkxWkRCWk1CTUdCeXFHU000OUFnRUdDQ3FHU000OQpBd0VIQTBJQUJOYTQxRzRYZGJtT09tY000L2FxaExlYUlPdjZZSHdTOEJqRitFd2lmQW5TYis3U0pma3NmYWNRCmhKS3RvQXRXK2F2SE1vcDFmbVpYS1pQT3lpL2NuWFdqZ2Ywd2dmb3dnZmNHQTFVZEVRU0I3ekNCN0lKd1kyVnMKWkdWeWRHVnpkREV0YjNKbk1XTmhMV05oTG1ObGJHUmxjakV0WWpOakxUUjRNVFl0TXpNMFpURTVZalUyTXpRMwpaRGxqWlRNeVlqWmtObUU0TnpCa01UUm1NemN0TURBd01DNTFjeTF6YjNWMGFDNWpiMjUwWVdsdVpYSnpMbUZ3CmNHUnZiV0ZwYmk1amJHOTFaSUo0WTJWc1pHVnlkR1Z6ZERFdGIzSm5NV05oTFc5d1pYSmhkR2x2Ym5NdVkyVnMKWkdWeU1TMWlNMk10TkhneE5pMHpNelJsTVRsaU5UWXpORGRrT1dObE16SmlObVEyWVRnM01HUXhOR1l6TnkwdwpNREF3TG5WekxYTnZkWFJvTG1OdmJuUmhhVzVsY25NdVlYQndaRzl0WVdsdUxtTnNiM1ZrTUFvR0NDcUdTTTQ5CkJBTUNBMGdBTUVVQ0lFSzZCSWtvamptNm1rbmt0aDgxenIxbU0yM0QzTWhaS2M2QVRRUnZwK3ZHQWlFQXRvcFgKNkJnWlV4NlV0SE5MR3dWKzhDNmwxaEFNQ2YzUnhjRDlQU1ErbUUwPQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0tCg==";

                ImportCaBodyMspComponent importCaBodyMspComponent = new ImportCaBodyMspComponent.Builder().tlsCert(cert)
                                .build();
                // tlscert().build();
                ImportCaBodyMspTlsca importCaBodyMspTlsca = new ImportCaBodyMspTlsca.Builder().name("tlsca").build();
                ImportCaBodyMspCa importCaBodyMspCa = new ImportCaBodyMspCa.Builder().name("ca").build();
                ImportCaBodyMsp msp = new ImportCaBodyMsp.Builder().ca(importCaBodyMspCa).tlsca(importCaBodyMspTlsca)
                                .component(importCaBodyMspComponent).build();

                ImportCaOptions options = new ImportCaOptions.Builder().displayName(prefix("ImportedCA"))
                                .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054")
                                .operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443")
                                .location("ibmcloud").msp(msp).build();

                ServiceCall<CaResponse> call = service.importCa(options);
                Response<CaResponse> response = call.execute();
                assertNotNull(response);
                assertEquals(200, response.getStatusCode());

                CaResponse ca = response.getResult();
                createdFakeCa = ca.getId();

        }

        String createdFakeCa;

        @Test(dependsOnMethods = { "importFakeCa" })
        public void editCaMetadata() throws Exception {
                if (createdFakeCa == null) {
                        fail("FakeCA Id not available");
                }

                List<String> tags = Arrays.asList(new String[] { "fabric-ca", "ibm_sass", "blue_team", "dev" });
                EditCaOptions editCaOptions = new EditCaOptions.Builder().id(createdFakeCa)
                                .displayName(prefix("Other ca")).tags(tags).build();
                ServiceCall<CaResponse> call = service.editCa(editCaOptions);
                Response<CaResponse> response = call.execute();
                assertNotNull(response);
                assertEquals(200, response.getStatusCode());

                CaResponse ca = response.getResult();

        }

        @AfterClass
        public void tearDown() {
                // Add any clean up logic here
                System.out.println("Clean up complete.");
        }
}
