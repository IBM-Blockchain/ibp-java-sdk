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

import com.ibm.cloud.blockchain.v3.model.ClientAuth;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldTlsca;
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
 * Unit test class for the UpdateMspCryptoField model.
 */
public class UpdateMspCryptoFieldTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateMspCryptoField() throws Throwable {
    UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateMspCryptoFieldCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldCaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateMspCryptoFieldTlscaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldTlscaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    ClientAuth clientAuthModel = new ClientAuth.Builder()
      .type("noclientcert")
      .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(clientAuthModel.type(), "noclientcert");
    assertEquals(clientAuthModel.tlsCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
      .ekey("testString")
      .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .tlsKey("testString")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .clientAuth(clientAuthModel)
      .build();
    assertEquals(updateMspCryptoFieldComponentModel.ekey(), "testString");
    assertEquals(updateMspCryptoFieldComponentModel.ecert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateMspCryptoFieldComponentModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldComponentModel.tlsKey(), "testString");
    assertEquals(updateMspCryptoFieldComponentModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateMspCryptoFieldComponentModel.clientAuth(), clientAuthModel);

    UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder()
      .ca(updateMspCryptoFieldCaModel)
      .tlsca(updateMspCryptoFieldTlscaModel)
      .component(updateMspCryptoFieldComponentModel)
      .build();
    assertEquals(updateMspCryptoFieldModel.ca(), updateMspCryptoFieldCaModel);
    assertEquals(updateMspCryptoFieldModel.tlsca(), updateMspCryptoFieldTlscaModel);
    assertEquals(updateMspCryptoFieldModel.component(), updateMspCryptoFieldComponentModel);

    String json = TestUtilities.serialize(updateMspCryptoFieldModel);

    UpdateMspCryptoField updateMspCryptoFieldModelNew = TestUtilities.deserialize(json, UpdateMspCryptoField.class);
    assertTrue(updateMspCryptoFieldModelNew instanceof UpdateMspCryptoField);
    assertEquals(updateMspCryptoFieldModelNew.ca().toString(), updateMspCryptoFieldCaModel.toString());
    assertEquals(updateMspCryptoFieldModelNew.tlsca().toString(), updateMspCryptoFieldTlscaModel.toString());
    assertEquals(updateMspCryptoFieldModelNew.component().toString(), updateMspCryptoFieldComponentModel.toString());
  }
}