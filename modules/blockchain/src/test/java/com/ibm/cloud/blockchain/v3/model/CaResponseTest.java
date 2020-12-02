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

import com.ibm.cloud.blockchain.v3.model.CaResponse;
import com.ibm.cloud.blockchain.v3.model.CaResponseResources;
import com.ibm.cloud.blockchain.v3.model.CaResponseStorage;
import com.ibm.cloud.blockchain.v3.model.GenericResourceLimits;
import com.ibm.cloud.blockchain.v3.model.GenericResources;
import com.ibm.cloud.blockchain.v3.model.GenericResourcesRequests;
import com.ibm.cloud.blockchain.v3.model.MspCryptoField;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.StorageObject;
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
 * Unit test class for the CaResponse model.
 */
public class CaResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCaResponse() throws Throwable {
    CaResponse caResponseModel = new CaResponse();
    assertNull(caResponseModel.getId());
    assertNull(caResponseModel.getDepComponentId());
    assertNull(caResponseModel.getDisplayName());
    assertNull(caResponseModel.getApiUrl());
    assertNull(caResponseModel.getOperationsUrl());
    assertNull(caResponseModel.getConfigOverride());
    assertNull(caResponseModel.getLocation());
    assertNull(caResponseModel.getMsp());
    assertNull(caResponseModel.getResources());
    assertNull(caResponseModel.getSchemeVersion());
    assertNull(caResponseModel.getStorage());
    assertNull(caResponseModel.getTags());
    assertNull(caResponseModel.getTimestamp());
    assertNull(caResponseModel.getVersion());
    assertNull(caResponseModel.getZone());
  }
}