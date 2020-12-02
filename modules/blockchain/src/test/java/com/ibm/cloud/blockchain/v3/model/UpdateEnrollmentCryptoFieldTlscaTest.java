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

import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldTlsca;
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
 * Unit test class for the UpdateEnrollmentCryptoFieldTlsca model.
 */
public class UpdateEnrollmentCryptoFieldTlscaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateEnrollmentCryptoFieldTlsca() throws Throwable {
    UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("tlsca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.name(), "tlsca");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.enrollSecret(), "password");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.csrHosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    String json = TestUtilities.serialize(updateEnrollmentCryptoFieldTlscaModel);

    UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModelNew = TestUtilities.deserialize(json, UpdateEnrollmentCryptoFieldTlsca.class);
    assertTrue(updateEnrollmentCryptoFieldTlscaModelNew instanceof UpdateEnrollmentCryptoFieldTlsca);
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.name(), "tlsca");
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldTlscaModelNew.enrollSecret(), "password");
  }
}