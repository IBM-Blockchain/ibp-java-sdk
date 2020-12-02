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

import com.ibm.cloud.blockchain.v3.model.Bccsp;
import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
import com.ibm.cloud.blockchain.v3.model.BccspSW;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneral;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigOrdererGeneral model.
 */
public class ConfigOrdererGeneralTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigOrdererGeneral() throws Throwable {
    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
      .serverMinInterval("60s")
      .serverInterval("2h")
      .serverTimeout("20s")
      .build();
    assertEquals(configOrdererKeepaliveModel.serverMinInterval(), "60s");
    assertEquals(configOrdererKeepaliveModel.serverInterval(), "2h");
    assertEquals(configOrdererKeepaliveModel.serverTimeout(), "20s");

    BccspSW bccspSwModel = new BccspSW.Builder()
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspSwModel.hash(), "SHA2");
    assertEquals(bccspSwModel.security(), Double.valueOf("256"));

    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
      .label("testString")
      .pin("testString")
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspPkcS11Model.label(), "testString");
    assertEquals(bccspPkcS11Model.pin(), "testString");
    assertEquals(bccspPkcS11Model.hash(), "SHA2");
    assertEquals(bccspPkcS11Model.security(), Double.valueOf("256"));

    Bccsp bccspModel = new Bccsp.Builder()
      .xDefault("SW")
      .sw(bccspSwModel)
      .pkcS11(bccspPkcS11Model)
      .build();
    assertEquals(bccspModel.xDefault(), "SW");
    assertEquals(bccspModel.sw(), bccspSwModel);
    assertEquals(bccspModel.pkcS11(), bccspPkcS11Model);

    ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
      .timeWindow("15m")
      .noExpirationChecks(false)
      .build();
    assertEquals(configOrdererAuthenticationModel.timeWindow(), "15m");
    assertEquals(configOrdererAuthenticationModel.noExpirationChecks(), Boolean.valueOf(false));

    ConfigOrdererGeneral configOrdererGeneralModel = new ConfigOrdererGeneral.Builder()
      .keepalive(configOrdererKeepaliveModel)
      .bccsp(bccspModel)
      .authentication(configOrdererAuthenticationModel)
      .build();
    assertEquals(configOrdererGeneralModel.keepalive(), configOrdererKeepaliveModel);
    assertEquals(configOrdererGeneralModel.bccsp(), bccspModel);
    assertEquals(configOrdererGeneralModel.authentication(), configOrdererAuthenticationModel);

    String json = TestUtilities.serialize(configOrdererGeneralModel);

    ConfigOrdererGeneral configOrdererGeneralModelNew = TestUtilities.deserialize(json, ConfigOrdererGeneral.class);
    assertTrue(configOrdererGeneralModelNew instanceof ConfigOrdererGeneral);
    assertEquals(configOrdererGeneralModelNew.keepalive().toString(), configOrdererKeepaliveModel.toString());
    assertEquals(configOrdererGeneralModelNew.bccsp().toString(), bccspModel.toString());
    assertEquals(configOrdererGeneralModelNew.authentication().toString(), configOrdererAuthenticationModel.toString());
  }
}