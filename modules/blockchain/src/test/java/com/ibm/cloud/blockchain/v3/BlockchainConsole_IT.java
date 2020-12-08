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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Map;

import com.ibm.cloud.blockchain.test.SdkIntegrationTestBase;
import com.ibm.cloud.blockchain.v3.model.ArchiveNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.ArchiveResponse;
import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponse;
import com.ibm.cloud.blockchain.v3.model.GetFabricVersionsResponse;
import com.ibm.cloud.blockchain.v3.model.GetNotificationsResponse;
import com.ibm.cloud.blockchain.v3.model.GetPostmanOptions;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponse;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlockchainConsole_IT extends SdkIntegrationTestBase {
    public Blockchain service = null;
    public static Map<String, String> config = null;

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

    @Test()
    public void getIBPSettings() {
        ServiceCall<GetPublicSettingsResponse> call = service.getSettings();
        Response<GetPublicSettingsResponse> response = call.execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
    }

    @Test()
    public void getSupportFabricVersions() {
        ServiceCall<GetFabricVersionsResponse> call = service.getFabVersions();
        Response<GetFabricVersionsResponse> response = call.execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
    }

    @Test()
    public void getConsoleHealth() {
        ServiceCall<GetAthenaHealthStatsResponse> call = service.getHealth();
        Response<GetAthenaHealthStatsResponse> response = call.execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
    }

    @Test()
    public void getNotifications() {
        ServiceCall<GetNotificationsResponse> call = service.listNotifications();
        Response<GetNotificationsResponse> response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test()
    public void archiveNotifications() {

        ArchiveNotificationsOptions archiveNotificationsOptions = new ArchiveNotificationsOptions.Builder()
                .notificationIds(Arrays.asList(new String[] {})).build();

        ServiceCall<ArchiveResponse> call = service.archiveNotifications(archiveNotificationsOptions);
        Response<ArchiveResponse> response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);

    }

    @Test
    public void deleteIBPSessions() {
        ServiceCall call = service.deleteAllSessions();
        Response response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(202);
    }

    @Test
    public void clearNotifications() {
        ServiceCall call = service.deleteAllNotifications();
        Response response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void deleteAllCaches() {
        ServiceCall call = service.clearCaches();
        Response response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }


    @Test()
    public void swagger() {
        ServiceCall<String> call = service.getSwagger();
        Response<String> response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void postman() {
        GetPostmanOptions getPostmanOptions = new GetPostmanOptions.Builder().authType(GetPostmanOptions.AuthType.API_KEY).apiKey("dummyKeyHere").build();
        ServiceCall<Void> call = service.getPostman(getPostmanOptions);
        Response<Void> response = call.execute();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

}
