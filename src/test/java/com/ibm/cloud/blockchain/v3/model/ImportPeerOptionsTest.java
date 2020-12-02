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

import com.ibm.cloud.blockchain.v3.model.ImportPeerOptions;
import com.ibm.cloud.blockchain.v3.model.MspCryptoField;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.MspCryptoFieldTlsca;
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
 * Unit test class for the ImportPeerOptions model.
 */
public class ImportPeerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportPeerOptions() throws Throwable {
    MspCryptoFieldCa mspCryptoFieldCaModel = new MspCryptoFieldCa.Builder()
      .name("ca")
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(mspCryptoFieldCaModel.name(), "ca");
    assertEquals(mspCryptoFieldCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    MspCryptoFieldTlsca mspCryptoFieldTlscaModel = new MspCryptoFieldTlsca.Builder()
      .name("tlsca")
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(mspCryptoFieldTlscaModel.name(), "tlsca");
    assertEquals(mspCryptoFieldTlscaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    MspCryptoFieldComponent mspCryptoFieldComponentModel = new MspCryptoFieldComponent.Builder()
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(mspCryptoFieldComponentModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoFieldComponentModel.ecert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoFieldComponentModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    MspCryptoField mspCryptoFieldModel = new MspCryptoField.Builder()
      .ca(mspCryptoFieldCaModel)
      .tlsca(mspCryptoFieldTlscaModel)
      .component(mspCryptoFieldComponentModel)
      .build();
    assertEquals(mspCryptoFieldModel.ca(), mspCryptoFieldCaModel);
    assertEquals(mspCryptoFieldModel.tlsca(), mspCryptoFieldTlscaModel);
    assertEquals(mspCryptoFieldModel.component(), mspCryptoFieldComponentModel);

    ImportPeerOptions importPeerOptionsModel = new ImportPeerOptions.Builder()
      .displayName("My Peer")
      .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084")
      .msp(mspCryptoFieldModel)
      .mspId("Org1")
      .apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
      .location("ibmcloud")
      .operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .build();
    assertEquals(importPeerOptionsModel.displayName(), "My Peer");
    assertEquals(importPeerOptionsModel.grpcwpUrl(), "https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084");
    assertEquals(importPeerOptionsModel.msp(), mspCryptoFieldModel);
    assertEquals(importPeerOptionsModel.mspId(), "Org1");
    assertEquals(importPeerOptionsModel.apiUrl(), "grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051");
    assertEquals(importPeerOptionsModel.location(), "ibmcloud");
    assertEquals(importPeerOptionsModel.operationsUrl(), "https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443");
    assertEquals(importPeerOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportPeerOptionsError() throws Throwable {
    new ImportPeerOptions.Builder().build();
  }

}