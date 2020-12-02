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

import com.ibm.cloud.blockchain.v3.model.GenericResourceLimits;
import com.ibm.cloud.blockchain.v3.model.GenericResources;
import com.ibm.cloud.blockchain.v3.model.GenericResourcesRequests;
import com.ibm.cloud.blockchain.v3.model.MspCryptoField;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.NodeOu;
import com.ibm.cloud.blockchain.v3.model.OrdererResponse;
import com.ibm.cloud.blockchain.v3.model.OrdererResponseResources;
import com.ibm.cloud.blockchain.v3.model.OrdererResponseStorage;
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
 * Unit test class for the OrdererResponse model.
 */
public class OrdererResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOrdererResponse() throws Throwable {
    OrdererResponse ordererResponseModel = new OrdererResponse();
    assertNull(ordererResponseModel.getId());
    assertNull(ordererResponseModel.getDepComponentId());
    assertNull(ordererResponseModel.getApiUrl());
    assertNull(ordererResponseModel.getDisplayName());
    assertNull(ordererResponseModel.getGrpcwpUrl());
    assertNull(ordererResponseModel.getLocation());
    assertNull(ordererResponseModel.getOperationsUrl());
    assertNull(ordererResponseModel.getOrdererType());
    assertNull(ordererResponseModel.getConfigOverride());
    assertNull(ordererResponseModel.isConsenterProposalFin());
    assertNull(ordererResponseModel.getNodeOu());
    assertNull(ordererResponseModel.getMsp());
    assertNull(ordererResponseModel.getMspId());
    assertNull(ordererResponseModel.getResources());
    assertNull(ordererResponseModel.getSchemeVersion());
    assertNull(ordererResponseModel.getStorage());
    assertNull(ordererResponseModel.getSystemChannelId());
    assertNull(ordererResponseModel.getTags());
    assertNull(ordererResponseModel.getTimestamp());
    assertNull(ordererResponseModel.getType());
    assertNull(ordererResponseModel.getVersion());
    assertNull(ordererResponseModel.getZone());
  }
}