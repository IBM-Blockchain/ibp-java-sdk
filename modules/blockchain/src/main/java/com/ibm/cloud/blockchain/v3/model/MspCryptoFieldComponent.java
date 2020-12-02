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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MspCryptoFieldComponent.
 */
public class MspCryptoFieldComponent extends GenericModel {

  @SerializedName("tls_cert")
  protected String tlsCert;
  protected String ecert;
  @SerializedName("admin_certs")
  protected List<String> adminCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String tlsCert;
    private String ecert;
    private List<String> adminCerts;

    private Builder(MspCryptoFieldComponent mspCryptoFieldComponent) {
      this.tlsCert = mspCryptoFieldComponent.tlsCert;
      this.ecert = mspCryptoFieldComponent.ecert;
      this.adminCerts = mspCryptoFieldComponent.adminCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param tlsCert the tlsCert
     */
    public Builder(String tlsCert) {
      this.tlsCert = tlsCert;
    }

    /**
     * Builds a MspCryptoFieldComponent.
     *
     * @return the new MspCryptoFieldComponent instance
     */
    public MspCryptoFieldComponent build() {
      return new MspCryptoFieldComponent(this);
    }

    /**
     * Adds an adminCerts to adminCerts.
     *
     * @param adminCerts the new adminCerts
     * @return the MspCryptoFieldComponent builder
     */
    public Builder addAdminCerts(String adminCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(adminCerts,
        "adminCerts cannot be null");
      if (this.adminCerts == null) {
        this.adminCerts = new ArrayList<String>();
      }
      this.adminCerts.add(adminCerts);
      return this;
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the MspCryptoFieldComponent builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the ecert.
     *
     * @param ecert the ecert
     * @return the MspCryptoFieldComponent builder
     */
    public Builder ecert(String ecert) {
      this.ecert = ecert;
      return this;
    }

    /**
     * Set the adminCerts.
     * Existing adminCerts will be replaced.
     *
     * @param adminCerts the adminCerts
     * @return the MspCryptoFieldComponent builder
     */
    public Builder adminCerts(List<String> adminCerts) {
      this.adminCerts = adminCerts;
      return this;
    }
  }

  protected MspCryptoFieldComponent(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsCert,
      "tlsCert cannot be null");
    tlsCert = builder.tlsCert;
    ecert = builder.ecert;
    adminCerts = builder.adminCerts;
  }

  /**
   * New builder.
   *
   * @return a MspCryptoFieldComponent builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tlsCert.
   *
   * The TLS certificate as base 64 encoded PEM. Certificate is used to secure/validate a TLS connection with this
   * component.
   *
   * @return the tlsCert
   */
  public String tlsCert() {
    return tlsCert;
  }

  /**
   * Gets the ecert.
   *
   * An identity certificate (base 64 encoded PEM) for this component that was signed by the CA (aka enrollment
   * certificate).
   *
   * @return the ecert
   */
  public String ecert() {
    return ecert;
  }

  /**
   * Gets the adminCerts.
   *
   * An array that contains base 64 encoded PEM identity certificates for administrators. Also known as signing
   * certificates of an organization administrator.
   *
   * @return the adminCerts
   */
  public List<String> adminCerts() {
    return adminCerts;
  }
}

