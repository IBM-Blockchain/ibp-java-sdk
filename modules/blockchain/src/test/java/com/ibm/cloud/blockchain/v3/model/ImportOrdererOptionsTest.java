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

import com.ibm.cloud.blockchain.v3.model.ImportOrdererOptions;
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
 * Unit test class for the ImportOrdererOptions model.
 */
public class ImportOrdererOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportOrdererOptions() throws Throwable {
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

    ImportOrdererOptions importOrdererOptionsModel = new ImportOrdererOptions.Builder()
      .clusterName("ordering service 1")
      .displayName("orderer")
      .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443")
      .msp(mspCryptoFieldModel)
      .mspId("Org1")
      .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
      .clusterId("testString")
      .location("ibmcloud")
      .operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
      .systemChannelId("testchainid")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .build();
    assertEquals(importOrdererOptionsModel.clusterName(), "ordering service 1");
    assertEquals(importOrdererOptionsModel.displayName(), "orderer");
    assertEquals(importOrdererOptionsModel.grpcwpUrl(), "https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443");
    assertEquals(importOrdererOptionsModel.msp(), mspCryptoFieldModel);
    assertEquals(importOrdererOptionsModel.mspId(), "Org1");
    assertEquals(importOrdererOptionsModel.apiUrl(), "grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050");
    assertEquals(importOrdererOptionsModel.clusterId(), "testString");
    assertEquals(importOrdererOptionsModel.location(), "ibmcloud");
    assertEquals(importOrdererOptionsModel.operationsUrl(), "https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443");
    assertEquals(importOrdererOptionsModel.systemChannelId(), "testchainid");
    assertEquals(importOrdererOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportOrdererOptionsError() throws Throwable {
    new ImportOrdererOptions.Builder().build();
  }

}