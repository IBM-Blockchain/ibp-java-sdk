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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MspPublicData.
 */
public class MspPublicData extends GenericModel {

  @SerializedName("msp_id")
  protected String mspId;
  @SerializedName("root_certs")
  protected List<String> rootCerts;
  protected List<String> admins;
  @SerializedName("tls_root_certs")
  protected List<String> tlsRootCerts;

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String getMspId() {
    return mspId;
  }

  /**
   * Gets the rootCerts.
   *
   * An array that contains one or more base 64 encoded PEM root certificates for the MSP.
   *
   * @return the rootCerts
   */
  public List<String> getRootCerts() {
    return rootCerts;
  }

  /**
   * Gets the admins.
   *
   * An array that contains base 64 encoded PEM identity certificates for administrators. Also known as signing
   * certificates of an organization administrator.
   *
   * @return the admins
   */
  public List<String> getAdmins() {
    return admins;
  }

  /**
   * Gets the tlsRootCerts.
   *
   * An array that contains one or more base 64 encoded PEM TLS root certificates.
   *
   * @return the tlsRootCerts
   */
  public List<String> getTlsRootCerts() {
    return tlsRootCerts;
  }
}

