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
import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.CryptoObject;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollment;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentCa;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentTlsca;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectMsp;
import com.ibm.cloud.blockchain.v3.model.MspCryptoCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoComp;
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
 * Unit test class for the CryptoObject model.
 */
public class CryptoObjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCryptoObject() throws Throwable {
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
      .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(cryptoEnrollmentComponentModel.admincerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

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

    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("tlsca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(cryptoObjectEnrollmentTlscaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentTlscaModel.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentTlscaModel.name(), "tlsca");
    assertEquals(cryptoObjectEnrollmentTlscaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollSecret(), "password");
    assertEquals(cryptoObjectEnrollmentTlscaModel.csrHosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
      .component(cryptoEnrollmentComponentModel)
      .ca(cryptoObjectEnrollmentCaModel)
      .tlsca(cryptoObjectEnrollmentTlscaModel)
      .build();
    assertEquals(cryptoObjectEnrollmentModel.component(), cryptoEnrollmentComponentModel);
    assertEquals(cryptoObjectEnrollmentModel.ca(), cryptoObjectEnrollmentCaModel);
    assertEquals(cryptoObjectEnrollmentModel.tlsca(), cryptoObjectEnrollmentTlscaModel);

    ClientAuth clientAuthModel = new ClientAuth.Builder()
      .type("noclientcert")
      .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(clientAuthModel.type(), "noclientcert");
    assertEquals(clientAuthModel.tlsCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder()
      .ekey("testString")
      .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .tlsKey("testString")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .clientAuth(clientAuthModel)
      .build();
    assertEquals(mspCryptoCompModel.ekey(), "testString");
    assertEquals(mspCryptoCompModel.ecert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoCompModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(mspCryptoCompModel.tlsKey(), "testString");
    assertEquals(mspCryptoCompModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoCompModel.clientAuth(), clientAuthModel);

    MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(mspCryptoCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(mspCryptoCaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder()
      .component(mspCryptoCompModel)
      .ca(mspCryptoCaModel)
      .tlsca(mspCryptoCaModel)
      .build();
    assertEquals(cryptoObjectMspModel.component(), mspCryptoCompModel);
    assertEquals(cryptoObjectMspModel.ca(), mspCryptoCaModel);
    assertEquals(cryptoObjectMspModel.tlsca(), mspCryptoCaModel);

    CryptoObject cryptoObjectModel = new CryptoObject.Builder()
      .enrollment(cryptoObjectEnrollmentModel)
      .msp(cryptoObjectMspModel)
      .build();
    assertEquals(cryptoObjectModel.enrollment(), cryptoObjectEnrollmentModel);
    assertEquals(cryptoObjectModel.msp(), cryptoObjectMspModel);

    String json = TestUtilities.serialize(cryptoObjectModel);

    CryptoObject cryptoObjectModelNew = TestUtilities.deserialize(json, CryptoObject.class);
    assertTrue(cryptoObjectModelNew instanceof CryptoObject);
    assertEquals(cryptoObjectModelNew.enrollment().toString(), cryptoObjectEnrollmentModel.toString());
    assertEquals(cryptoObjectModelNew.msp().toString(), cryptoObjectMspModel.toString());
  }
}