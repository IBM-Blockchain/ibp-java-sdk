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

import com.ibm.cloud.blockchain.v3.model.NodeOu;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NodeOu model.
 */
public class NodeOuTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNodeOu() throws Throwable {
    NodeOu nodeOuModel = new NodeOu.Builder()
      .enabled(true)
      .build();
    assertEquals(nodeOuModel.enabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(nodeOuModel);

    NodeOu nodeOuModelNew = TestUtilities.deserialize(json, NodeOu.class);
    assertTrue(nodeOuModelNew instanceof NodeOu);
    assertEquals(nodeOuModelNew.enabled(), Boolean.valueOf(true));
  }
}