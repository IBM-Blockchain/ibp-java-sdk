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
 * MspCryptoFieldTlsca.
 */
public class MspCryptoFieldTlsca extends GenericModel {

  protected String name;
  @SerializedName("root_certs")
  protected List<String> rootCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> rootCerts;

    private Builder(MspCryptoFieldTlsca mspCryptoFieldTlsca) {
      this.name = mspCryptoFieldTlsca.name;
      this.rootCerts = mspCryptoFieldTlsca.rootCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rootCerts the rootCerts
     */
    public Builder(List<String> rootCerts) {
      this.rootCerts = rootCerts;
    }

    /**
     * Builds a MspCryptoFieldTlsca.
     *
     * @return the new MspCryptoFieldTlsca instance
     */
    public MspCryptoFieldTlsca build() {
      return new MspCryptoFieldTlsca(this);
    }

    /**
     * Adds an rootCerts to rootCerts.
     *
     * @param rootCerts the new rootCerts
     * @return the MspCryptoFieldTlsca builder
     */
    public Builder addRootCerts(String rootCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rootCerts,
        "rootCerts cannot be null");
      if (this.rootCerts == null) {
        this.rootCerts = new ArrayList<String>();
      }
      this.rootCerts.add(rootCerts);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the MspCryptoFieldTlsca builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rootCerts.
     * Existing rootCerts will be replaced.
     *
     * @param rootCerts the rootCerts
     * @return the MspCryptoFieldTlsca builder
     */
    public Builder rootCerts(List<String> rootCerts) {
      this.rootCerts = rootCerts;
      return this;
    }
  }

  protected MspCryptoFieldTlsca(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootCerts,
      "rootCerts cannot be null");
    name = builder.name;
    rootCerts = builder.rootCerts;
  }

  /**
   * New builder.
   *
   * @return a MspCryptoFieldTlsca builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The TLS CA's "CAName" attribute. This name is used to distinguish this TLS CA from the other CA.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the rootCerts.
   *
   * An array that contains one or more base 64 encoded PEM root certificates for the TLS CA.
   *
   * @return the rootCerts
   */
  public List<String> rootCerts() {
    return rootCerts;
  }
}

