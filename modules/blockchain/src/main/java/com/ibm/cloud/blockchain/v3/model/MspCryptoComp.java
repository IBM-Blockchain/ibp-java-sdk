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
 * MspCryptoComp.
 */
public class MspCryptoComp extends GenericModel {

  protected String ekey;
  protected String ecert;
  @SerializedName("admin_certs")
  protected List<String> adminCerts;
  @SerializedName("tls_key")
  protected String tlsKey;
  @SerializedName("tls_cert")
  protected String tlsCert;
  @SerializedName("client_auth")
  protected ClientAuth clientAuth;

  /**
   * Builder.
   */
  public static class Builder {
    private String ekey;
    private String ecert;
    private List<String> adminCerts;
    private String tlsKey;
    private String tlsCert;
    private ClientAuth clientAuth;

    private Builder(MspCryptoComp mspCryptoComp) {
      this.ekey = mspCryptoComp.ekey;
      this.ecert = mspCryptoComp.ecert;
      this.adminCerts = mspCryptoComp.adminCerts;
      this.tlsKey = mspCryptoComp.tlsKey;
      this.tlsCert = mspCryptoComp.tlsCert;
      this.clientAuth = mspCryptoComp.clientAuth;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ekey the ekey
     * @param ecert the ecert
     * @param tlsKey the tlsKey
     * @param tlsCert the tlsCert
     */
    public Builder(String ekey, String ecert, String tlsKey, String tlsCert) {
      this.ekey = ekey;
      this.ecert = ecert;
      this.tlsKey = tlsKey;
      this.tlsCert = tlsCert;
    }

    /**
     * Builds a MspCryptoComp.
     *
     * @return the new MspCryptoComp instance
     */
    public MspCryptoComp build() {
      return new MspCryptoComp(this);
    }

    /**
     * Adds an adminCerts to adminCerts.
     *
     * @param adminCerts the new adminCerts
     * @return the MspCryptoComp builder
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
     * Set the ekey.
     *
     * @param ekey the ekey
     * @return the MspCryptoComp builder
     */
    public Builder ekey(String ekey) {
      this.ekey = ekey;
      return this;
    }

    /**
     * Set the ecert.
     *
     * @param ecert the ecert
     * @return the MspCryptoComp builder
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
     * @return the MspCryptoComp builder
     */
    public Builder adminCerts(List<String> adminCerts) {
      this.adminCerts = adminCerts;
      return this;
    }

    /**
     * Set the tlsKey.
     *
     * @param tlsKey the tlsKey
     * @return the MspCryptoComp builder
     */
    public Builder tlsKey(String tlsKey) {
      this.tlsKey = tlsKey;
      return this;
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the MspCryptoComp builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the clientAuth.
     *
     * @param clientAuth the clientAuth
     * @return the MspCryptoComp builder
     */
    public Builder clientAuth(ClientAuth clientAuth) {
      this.clientAuth = clientAuth;
      return this;
    }
  }

  protected MspCryptoComp(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ekey,
      "ekey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ecert,
      "ecert cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsKey,
      "tlsKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsCert,
      "tlsCert cannot be null");
    ekey = builder.ekey;
    ecert = builder.ecert;
    adminCerts = builder.adminCerts;
    tlsKey = builder.tlsKey;
    tlsCert = builder.tlsCert;
    clientAuth = builder.clientAuth;
  }

  /**
   * New builder.
   *
   * @return a MspCryptoComp builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ekey.
   *
   * An identity private key (base 64 encoded PEM) for this component (aka enrollment private key).
   *
   * @return the ekey
   */
  public String ekey() {
    return ekey;
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

  /**
   * Gets the tlsKey.
   *
   * A private key (base 64 encoded PEM) for this component's TLS.
   *
   * @return the tlsKey
   */
  public String tlsKey() {
    return tlsKey;
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
   * Gets the clientAuth.
   *
   * @return the clientAuth
   */
  public ClientAuth clientAuth() {
    return clientAuth;
  }
}

