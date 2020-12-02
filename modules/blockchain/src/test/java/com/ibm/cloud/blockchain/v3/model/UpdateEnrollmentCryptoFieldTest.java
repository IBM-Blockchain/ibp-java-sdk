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

import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
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
 * Unit test class for the UpdateEnrollmentCryptoField model.
 */
public class UpdateEnrollmentCryptoFieldTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateEnrollmentCryptoField() throws Throwable {
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
      .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(cryptoEnrollmentComponentModel.admincerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

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

    UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
      .component(cryptoEnrollmentComponentModel)
      .ca(updateEnrollmentCryptoFieldCaModel)
      .tlsca(updateEnrollmentCryptoFieldTlscaModel)
      .build();
    assertEquals(updateEnrollmentCryptoFieldModel.component(), cryptoEnrollmentComponentModel);
    assertEquals(updateEnrollmentCryptoFieldModel.ca(), updateEnrollmentCryptoFieldCaModel);
    assertEquals(updateEnrollmentCryptoFieldModel.tlsca(), updateEnrollmentCryptoFieldTlscaModel);

    String json = TestUtilities.serialize(updateEnrollmentCryptoFieldModel);

    UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModelNew = TestUtilities.deserialize(json, UpdateEnrollmentCryptoField.class);
    assertTrue(updateEnrollmentCryptoFieldModelNew instanceof UpdateEnrollmentCryptoField);
    assertEquals(updateEnrollmentCryptoFieldModelNew.component().toString(), cryptoEnrollmentComponentModel.toString());
    assertEquals(updateEnrollmentCryptoFieldModelNew.ca().toString(), updateEnrollmentCryptoFieldCaModel.toString());
    assertEquals(updateEnrollmentCryptoFieldModelNew.tlsca().toString(), updateEnrollmentCryptoFieldTlscaModel.toString());
  }
}