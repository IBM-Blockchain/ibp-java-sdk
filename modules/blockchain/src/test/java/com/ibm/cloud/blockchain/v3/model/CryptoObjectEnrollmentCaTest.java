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

import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentCa;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CryptoObjectEnrollmentCa model.
 */
public class CryptoObjectEnrollmentCaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCryptoObjectEnrollmentCa() throws Throwable {
    CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("ca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .build();
    assertEquals(cryptoObjectEnrollmentCaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentCaModel.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentCaModel.name(), "ca");
    assertEquals(cryptoObjectEnrollmentCaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentCaModel.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentCaModel.enrollSecret(), "password");

    String json = TestUtilities.serialize(cryptoObjectEnrollmentCaModel);

    CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModelNew = TestUtilities.deserialize(json, CryptoObjectEnrollmentCa.class);
    assertTrue(cryptoObjectEnrollmentCaModelNew instanceof CryptoObjectEnrollmentCa);
    assertEquals(cryptoObjectEnrollmentCaModelNew.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentCaModelNew.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentCaModelNew.name(), "ca");
    assertEquals(cryptoObjectEnrollmentCaModelNew.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentCaModelNew.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentCaModelNew.enrollSecret(), "password");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCryptoObjectEnrollmentCaError() throws Throwable {
    new CryptoObjectEnrollmentCa.Builder().build();
  }

}