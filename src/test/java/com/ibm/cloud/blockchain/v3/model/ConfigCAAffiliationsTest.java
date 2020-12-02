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

import com.ibm.cloud.blockchain.v3.model.ConfigCAAffiliations;
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
 * Unit test class for the ConfigCAAffiliations model.
 */
public class ConfigCAAffiliationsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCAAffiliations() throws Throwable {
    ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
      .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
      .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
      .add("foo", "testString")
      .build();
    assertEquals(configCaAffiliationsModel.getOrg1(), new java.util.ArrayList<String>(java.util.Arrays.asList("department1")));
    assertEquals(configCaAffiliationsModel.getOrg2(), new java.util.ArrayList<String>(java.util.Arrays.asList("department1")));
    assertEquals(configCaAffiliationsModel.get("foo"), "testString");

    String json = TestUtilities.serialize(configCaAffiliationsModel);

    ConfigCAAffiliations configCaAffiliationsModelNew = TestUtilities.deserialize(json, ConfigCAAffiliations.class);
    assertTrue(configCaAffiliationsModelNew instanceof ConfigCAAffiliations);
    assertEquals(configCaAffiliationsModelNew.get("foo"), "testString");
  }
}