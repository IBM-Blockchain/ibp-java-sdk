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

package com.ibm.cloud.blockchain.v3.model;

import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponse;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseCLUSTERDATA;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseCRN;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseFABRICCAPABILITIES;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseFILELOGGING;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseINACTIVITYTIMEOUTS;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponseVERSIONS;
import com.ibm.cloud.blockchain.v3.model.LogSettingsResponse;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsClient;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsServer;
import com.ibm.cloud.blockchain.v3.model.SettingsTimestampData;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPublicSettingsResponse model.
 */
public class GetPublicSettingsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPublicSettingsResponse() throws Throwable {
    GetPublicSettingsResponse getPublicSettingsResponseModel = new GetPublicSettingsResponse();
    assertNull(getPublicSettingsResponseModel.getActivityTrackerPath());
    assertNull(getPublicSettingsResponseModel.getAthenaId());
    assertNull(getPublicSettingsResponseModel.getAuthScheme());
    assertNull(getPublicSettingsResponseModel.getCallbackUri());
    assertNull(getPublicSettingsResponseModel.getClusterData());
    assertNull(getPublicSettingsResponseModel.getConfigtxlatorUrl());
    assertNull(getPublicSettingsResponseModel.getCrn());
    assertNull(getPublicSettingsResponseModel.getCrnString());
    assertNull(getPublicSettingsResponseModel.getCspHeaderValues());
    assertNull(getPublicSettingsResponseModel.getDbSystem());
    assertNull(getPublicSettingsResponseModel.getDeployerUrl());
    assertNull(getPublicSettingsResponseModel.getDomain());
    assertNull(getPublicSettingsResponseModel.getEnvironment());
    assertNull(getPublicSettingsResponseModel.getFabricCapabilities());
    assertNull(getPublicSettingsResponseModel.getFeatureFlags());
    assertNull(getPublicSettingsResponseModel.getFileLogging());
    assertNull(getPublicSettingsResponseModel.getHostUrl());
    assertNull(getPublicSettingsResponseModel.isIamCacheEnabled());
    assertNull(getPublicSettingsResponseModel.getIamUrl());
    assertNull(getPublicSettingsResponseModel.getIbmIdCallbackUrl());
    assertNull(getPublicSettingsResponseModel.isIgnoreConfigFile());
    assertNull(getPublicSettingsResponseModel.getInactivityTimeouts());
    assertNull(getPublicSettingsResponseModel.getInfrastructure());
    assertNull(getPublicSettingsResponseModel.getLandingUrl());
    assertNull(getPublicSettingsResponseModel.getLoginUri());
    assertNull(getPublicSettingsResponseModel.getLogoutUri());
    assertNull(getPublicSettingsResponseModel.getMaxReqPerMin());
    assertNull(getPublicSettingsResponseModel.getMaxReqPerMinAk());
    assertNull(getPublicSettingsResponseModel.isMemoryCacheEnabled());
    assertNull(getPublicSettingsResponseModel.getPort());
    assertNull(getPublicSettingsResponseModel.isProxyCacheEnabled());
    assertNull(getPublicSettingsResponseModel.getProxyTlsFabricReqs());
    assertNull(getPublicSettingsResponseModel.getProxyTlsHttpUrl());
    assertNull(getPublicSettingsResponseModel.getProxyTlsWsUrl());
    assertNull(getPublicSettingsResponseModel.getRegion());
    assertNull(getPublicSettingsResponseModel.isSessionCacheEnabled());
    assertNull(getPublicSettingsResponseModel.getTimeouts());
    assertNull(getPublicSettingsResponseModel.getTimestamps());
    assertNull(getPublicSettingsResponseModel.getTransactionVisibility());
    assertNull(getPublicSettingsResponseModel.getTrustProxy());
    assertNull(getPublicSettingsResponseModel.isTrustUnknownCerts());
    assertNull(getPublicSettingsResponseModel.getVersions());
  }
}