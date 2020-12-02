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

import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMsp;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspCa;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspComponent;
import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspTlsca;
import com.ibm.cloud.blockchain.v3.model.ImportCaOptions;
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
 * Unit test class for the ImportCaOptions model.
 */
public class ImportCaOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportCaOptions() throws Throwable {
    ImportCaBodyMspCa importCaBodyMspCaModel = new ImportCaBodyMspCa.Builder()
      .name("org1CA")
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(importCaBodyMspCaModel.name(), "org1CA");
    assertEquals(importCaBodyMspCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    ImportCaBodyMspTlsca importCaBodyMspTlscaModel = new ImportCaBodyMspTlsca.Builder()
      .name("org1tlsCA")
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(importCaBodyMspTlscaModel.name(), "org1tlsCA");
    assertEquals(importCaBodyMspTlscaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    ImportCaBodyMspComponent importCaBodyMspComponentModel = new ImportCaBodyMspComponent.Builder()
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .build();
    assertEquals(importCaBodyMspComponentModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");

    ImportCaBodyMsp importCaBodyMspModel = new ImportCaBodyMsp.Builder()
      .ca(importCaBodyMspCaModel)
      .tlsca(importCaBodyMspTlscaModel)
      .component(importCaBodyMspComponentModel)
      .build();
    assertEquals(importCaBodyMspModel.ca(), importCaBodyMspCaModel);
    assertEquals(importCaBodyMspModel.tlsca(), importCaBodyMspTlscaModel);
    assertEquals(importCaBodyMspModel.component(), importCaBodyMspComponentModel);

    ImportCaOptions importCaOptionsModel = new ImportCaOptions.Builder()
      .displayName("Sample CA")
      .apiUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054")
      .msp(importCaBodyMspModel)
      .location("ibmcloud")
      .operationsUrl("https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .build();
    assertEquals(importCaOptionsModel.displayName(), "Sample CA");
    assertEquals(importCaOptionsModel.apiUrl(), "https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:7054");
    assertEquals(importCaOptionsModel.msp(), importCaBodyMspModel);
    assertEquals(importCaOptionsModel.location(), "ibmcloud");
    assertEquals(importCaOptionsModel.operationsUrl(), "https://n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud:9443");
    assertEquals(importCaOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
    assertEquals(importCaOptionsModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportCaOptionsError() throws Throwable {
    new ImportCaOptions.Builder().build();
  }

}