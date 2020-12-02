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
 * UpdateMspCryptoFieldCa.
 */
public class UpdateMspCryptoFieldCa extends GenericModel {

  @SerializedName("root_certs")
  protected List<String> rootCerts;
  @SerializedName("ca_intermediate_certs")
  protected List<String> caIntermediateCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> rootCerts;
    private List<String> caIntermediateCerts;

    private Builder(UpdateMspCryptoFieldCa updateMspCryptoFieldCa) {
      this.rootCerts = updateMspCryptoFieldCa.rootCerts;
      this.caIntermediateCerts = updateMspCryptoFieldCa.caIntermediateCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateMspCryptoFieldCa.
     *
     * @return the new UpdateMspCryptoFieldCa instance
     */
    public UpdateMspCryptoFieldCa build() {
      return new UpdateMspCryptoFieldCa(this);
    }

    /**
     * Adds an rootCerts to rootCerts.
     *
     * @param rootCerts the new rootCerts
     * @return the UpdateMspCryptoFieldCa builder
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
     * Adds an caIntermediateCerts to caIntermediateCerts.
     *
     * @param caIntermediateCerts the new caIntermediateCerts
     * @return the UpdateMspCryptoFieldCa builder
     */
    public Builder addCaIntermediateCerts(String caIntermediateCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(caIntermediateCerts,
        "caIntermediateCerts cannot be null");
      if (this.caIntermediateCerts == null) {
        this.caIntermediateCerts = new ArrayList<String>();
      }
      this.caIntermediateCerts.add(caIntermediateCerts);
      return this;
    }

    /**
     * Set the rootCerts.
     * Existing rootCerts will be replaced.
     *
     * @param rootCerts the rootCerts
     * @return the UpdateMspCryptoFieldCa builder
     */
    public Builder rootCerts(List<String> rootCerts) {
      this.rootCerts = rootCerts;
      return this;
    }

    /**
     * Set the caIntermediateCerts.
     * Existing caIntermediateCerts will be replaced.
     *
     * @param caIntermediateCerts the caIntermediateCerts
     * @return the UpdateMspCryptoFieldCa builder
     */
    public Builder caIntermediateCerts(List<String> caIntermediateCerts) {
      this.caIntermediateCerts = caIntermediateCerts;
      return this;
    }
  }

  protected UpdateMspCryptoFieldCa(Builder builder) {
    rootCerts = builder.rootCerts;
    caIntermediateCerts = builder.caIntermediateCerts;
  }

  /**
   * New builder.
   *
   * @return a UpdateMspCryptoFieldCa builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the caIntermediateCerts.
   *
   * An array that contains base 64 encoded PEM intermediate CA certificates.
   *
   * @return the caIntermediateCerts
   */
  public List<String> caIntermediateCerts() {
    return caIntermediateCerts;
  }
}

