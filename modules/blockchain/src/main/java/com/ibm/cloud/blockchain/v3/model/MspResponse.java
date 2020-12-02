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
 * Contains the details of an MSP (Membership Service Provider).
 */
public class MspResponse extends GenericModel {

  protected String id;
  protected String type;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("msp_id")
  protected String mspId;
  protected Double timestamp;
  protected List<String> tags;
  @SerializedName("root_certs")
  protected List<String> rootCerts;
  @SerializedName("intermediate_certs")
  protected List<String> intermediateCerts;
  protected List<String> admins;
  @SerializedName("scheme_version")
  protected String schemeVersion;
  @SerializedName("tls_root_certs")
  protected List<String> tlsRootCerts;

  /**
   * Gets the id.
   *
   * The unique identifier of this component.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of this component. Such as: "fabric-peer", "fabric-ca", "fabric-orderer", etc.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this MSP. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

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
   * Gets the timestamp.
   *
   * UTC UNIX timestamp of component onboarding to the UI. In milliseconds.
   *
   * @return the timestamp
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
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
   * Gets the intermediateCerts.
   *
   * An array that contains base 64 encoded PEM intermediate certificates.
   *
   * @return the intermediateCerts
   */
  public List<String> getIntermediateCerts() {
    return intermediateCerts;
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
   * Gets the schemeVersion.
   *
   * The versioning of the IBP console format of this JSON.
   *
   * @return the schemeVersion
   */
  public String getSchemeVersion() {
    return schemeVersion;
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

