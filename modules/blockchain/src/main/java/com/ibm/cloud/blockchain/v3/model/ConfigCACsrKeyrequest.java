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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigCACsrKeyrequest.
 */
public class ConfigCACsrKeyrequest extends GenericModel {

  protected String algo;
  protected Double size;

  /**
   * Builder.
   */
  public static class Builder {
    private String algo;
    private Double size;

    private Builder(ConfigCACsrKeyrequest configCaCsrKeyrequest) {
      this.algo = configCaCsrKeyrequest.algo;
      this.size = configCaCsrKeyrequest.size;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param algo the algo
     * @param size the size
     */
    public Builder(String algo, Double size) {
      this.algo = algo;
      this.size = size;
    }

    /**
     * Builds a ConfigCACsrKeyrequest.
     *
     * @return the new ConfigCACsrKeyrequest instance
     */
    public ConfigCACsrKeyrequest build() {
      return new ConfigCACsrKeyrequest(this);
    }

    /**
     * Set the algo.
     *
     * @param algo the algo
     * @return the ConfigCACsrKeyrequest builder
     */
    public Builder algo(String algo) {
      this.algo = algo;
      return this;
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the ConfigCACsrKeyrequest builder
     */
    public Builder size(Double size) {
      this.size = size;
      return this;
    }
  }

  protected ConfigCACsrKeyrequest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.algo,
      "algo cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.size,
      "size cannot be null");
    algo = builder.algo;
    size = builder.size;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACsrKeyrequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the algo.
   *
   * The algorithm to use for CSRs.
   *
   * @return the algo
   */
  public String algo() {
    return algo;
  }

  /**
   * Gets the size.
   *
   * The size of the key for CSRs.
   *
   * @return the size
   */
  public Double size() {
    return size;
  }
}

