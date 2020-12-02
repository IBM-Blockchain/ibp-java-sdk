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

import com.ibm.cloud.blockchain.v3.model.GetComponentOptions;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetComponentOptions model.
 */
public class GetComponentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetComponentOptions() throws Throwable {
    GetComponentOptions getComponentOptionsModel = new GetComponentOptions.Builder()
      .id("testString")
      .deploymentAttrs("included")
      .parsedCerts("included")
      .cache("skip")
      .caAttrs("included")
      .build();
    assertEquals(getComponentOptionsModel.id(), "testString");
    assertEquals(getComponentOptionsModel.deploymentAttrs(), "included");
    assertEquals(getComponentOptionsModel.parsedCerts(), "included");
    assertEquals(getComponentOptionsModel.cache(), "skip");
    assertEquals(getComponentOptionsModel.caAttrs(), "included");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetComponentOptionsError() throws Throwable {
    new GetComponentOptions.Builder().build();
  }

}