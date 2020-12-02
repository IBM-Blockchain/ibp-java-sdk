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

import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateEnrollmentCryptoFieldCa model.
 */
public class UpdateEnrollmentCryptoFieldCaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateEnrollmentCryptoFieldCa() throws Throwable {
    UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("ca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .build();
    assertEquals(updateEnrollmentCryptoFieldCaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldCaModel.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldCaModel.name(), "ca");
    assertEquals(updateEnrollmentCryptoFieldCaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldCaModel.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldCaModel.enrollSecret(), "password");

    String json = TestUtilities.serialize(updateEnrollmentCryptoFieldCaModel);

    UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModelNew = TestUtilities.deserialize(json, UpdateEnrollmentCryptoFieldCa.class);
    assertTrue(updateEnrollmentCryptoFieldCaModelNew instanceof UpdateEnrollmentCryptoFieldCa);
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.name(), "ca");
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldCaModelNew.enrollSecret(), "password");
  }
}