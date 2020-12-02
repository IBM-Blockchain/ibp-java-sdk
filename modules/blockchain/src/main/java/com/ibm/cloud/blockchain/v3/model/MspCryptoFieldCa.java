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
 * MspCryptoFieldCa.
 */
public class MspCryptoFieldCa extends GenericModel {

  protected String name;
  @SerializedName("root_certs")
  protected List<String> rootCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> rootCerts;

    private Builder(MspCryptoFieldCa mspCryptoFieldCa) {
      this.name = mspCryptoFieldCa.name;
      this.rootCerts = mspCryptoFieldCa.rootCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a MspCryptoFieldCa.
     *
     * @return the new MspCryptoFieldCa instance
     */
    public MspCryptoFieldCa build() {
      return new MspCryptoFieldCa(this);
    }

    /**
     * Adds an rootCerts to rootCerts.
     *
     * @param rootCerts the new rootCerts
     * @return the MspCryptoFieldCa builder
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
     * @return the MspCryptoFieldCa builder
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
     * @return the MspCryptoFieldCa builder
     */
    public Builder rootCerts(List<String> rootCerts) {
      this.rootCerts = rootCerts;
      return this;
    }
  }

  protected MspCryptoFieldCa(Builder builder) {
    name = builder.name;
    rootCerts = builder.rootCerts;
  }

  /**
   * New builder.
   *
   * @return a MspCryptoFieldCa builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The CA's "CAName" attribute. This name is used to distinguish this CA from the TLS CA.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the rootCerts.
   *
   * An array that contains one or more base 64 encoded PEM CA root certificates.
   *
   * @return the rootCerts
   */
  public List<String> rootCerts() {
    return rootCerts;
  }
}

