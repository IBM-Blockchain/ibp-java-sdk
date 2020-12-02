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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Software based blockchain crypto provider.
 */
public class BccspSW extends GenericModel {

  @SerializedName("Hash")
  protected String hash;
  @SerializedName("Security")
  protected Double security;

  /**
   * Builder.
   */
  public static class Builder {
    private String hash;
    private Double security;

    private Builder(BccspSW bccspSw) {
      this.hash = bccspSw.hash;
      this.security = bccspSw.security;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hash the hash
     * @param security the security
     */
    public Builder(String hash, Double security) {
      this.hash = hash;
      this.security = security;
    }

    /**
     * Builds a BccspSW.
     *
     * @return the new BccspSW instance
     */
    public BccspSW build() {
      return new BccspSW(this);
    }

    /**
     * Set the hash.
     *
     * @param hash the hash
     * @return the BccspSW builder
     */
    public Builder hash(String hash) {
      this.hash = hash;
      return this;
    }

    /**
     * Set the security.
     *
     * @param security the security
     * @return the BccspSW builder
     */
    public Builder security(Double security) {
      this.security = security;
      return this;
    }
  }

  protected BccspSW(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hash,
      "hash cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.security,
      "security cannot be null");
    hash = builder.hash;
    security = builder.security;
  }

  /**
   * New builder.
   *
   * @return a BccspSW builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hash.
   *
   * The hash family to use for the BlockChain Crypto Service Provider (bccsp).
   *
   * @return the hash
   */
  public String hash() {
    return hash;
  }

  /**
   * Gets the security.
   *
   * The length of hash to use for the BlockChain Crypto Service Provider (bccsp).
   *
   * @return the security
   */
  public Double security() {
    return security;
  }
}

