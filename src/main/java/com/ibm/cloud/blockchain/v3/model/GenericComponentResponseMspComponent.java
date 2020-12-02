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
 * GenericComponentResponseMspComponent.
 */
public class GenericComponentResponseMspComponent extends GenericModel {

  @SerializedName("tls_cert")
  protected String tlsCert;
  protected String ecert;
  @SerializedName("admin_certs")
  protected List<String> adminCerts;

  /**
   * Gets the tlsCert.
   *
   * The TLS certificate as base 64 encoded PEM. Certificate is used to secure/validate a TLS connection with this
   * component.
   *
   * @return the tlsCert
   */
  public String getTlsCert() {
    return tlsCert;
  }

  /**
   * Gets the ecert.
   *
   * An identity certificate (base 64 encoded PEM) for this component that was signed by the CA (aka enrollment
   * certificate). [Available on peer/orderer components w/query parameter 'deployment_attrs'].
   *
   * @return the ecert
   */
  public String getEcert() {
    return ecert;
  }

  /**
   * Gets the adminCerts.
   *
   * An array that contains base 64 encoded PEM identity certificates for administrators. Also known as signing
   * certificates of an organization administrator. [Available on peer/orderer components w/query parameter
   * 'deployment_attrs'].
   *
   * @return the adminCerts
   */
  public List<String> getAdminCerts() {
    return adminCerts;
  }
}

