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

import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMsp;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspCa;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspComponent;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseMspTlsca;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseResources;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponseStorage;
import com.ibm.cloud.blockchain.v3.model.GenericResourceLimits;
import com.ibm.cloud.blockchain.v3.model.GenericResources;
import com.ibm.cloud.blockchain.v3.model.GenericResourcesRequests;
import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.NodeOuGeneral;
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
 * Unit test class for the GetMultiComponentsResponse model.
 */
public class GetMultiComponentsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetMultiComponentsResponse() throws Throwable {
    GetMultiComponentsResponse getMultiComponentsResponseModel = new GetMultiComponentsResponse();
    assertNull(getMultiComponentsResponseModel.getComponents());
  }
}