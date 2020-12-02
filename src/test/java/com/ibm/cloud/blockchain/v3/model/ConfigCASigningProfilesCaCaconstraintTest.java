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

import com.ibm.cloud.blockchain.v3.model.ConfigCASigningProfilesCaCaconstraint;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCASigningProfilesCaCaconstraint model.
 */
public class ConfigCASigningProfilesCaCaconstraintTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCASigningProfilesCaCaconstraint() throws Throwable {
    ConfigCASigningProfilesCaCaconstraint configCaSigningProfilesCaCaconstraintModel = new ConfigCASigningProfilesCaCaconstraint.Builder()
      .isca(true)
      .maxpathlen(Double.valueOf("0"))
      .maxpathlenzero(true)
      .build();
    assertEquals(configCaSigningProfilesCaCaconstraintModel.isca(), Boolean.valueOf(true));
    assertEquals(configCaSigningProfilesCaCaconstraintModel.maxpathlen(), Double.valueOf("0"));
    assertEquals(configCaSigningProfilesCaCaconstraintModel.maxpathlenzero(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(configCaSigningProfilesCaCaconstraintModel);

    ConfigCASigningProfilesCaCaconstraint configCaSigningProfilesCaCaconstraintModelNew = TestUtilities.deserialize(json, ConfigCASigningProfilesCaCaconstraint.class);
    assertTrue(configCaSigningProfilesCaCaconstraintModelNew instanceof ConfigCASigningProfilesCaCaconstraint);
    assertEquals(configCaSigningProfilesCaCaconstraintModelNew.isca(), Boolean.valueOf(true));
    assertEquals(configCaSigningProfilesCaCaconstraintModelNew.maxpathlen(), Double.valueOf("0"));
    assertEquals(configCaSigningProfilesCaCaconstraintModelNew.maxpathlenzero(), Boolean.valueOf(true));
  }
}