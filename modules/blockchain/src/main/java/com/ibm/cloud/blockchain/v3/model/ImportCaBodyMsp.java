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
 * ImportCaBodyMsp.
 */
public class ImportCaBodyMsp extends GenericModel {

  protected ImportCaBodyMspCa ca;
  protected ImportCaBodyMspTlsca tlsca;
  protected ImportCaBodyMspComponent component;

  /**
   * Builder.
   */
  public static class Builder {
    private ImportCaBodyMspCa ca;
    private ImportCaBodyMspTlsca tlsca;
    private ImportCaBodyMspComponent component;

    private Builder(ImportCaBodyMsp importCaBodyMsp) {
      this.ca = importCaBodyMsp.ca;
      this.tlsca = importCaBodyMsp.tlsca;
      this.component = importCaBodyMsp.component;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ca the ca
     * @param tlsca the tlsca
     * @param component the component
     */
    public Builder(ImportCaBodyMspCa ca, ImportCaBodyMspTlsca tlsca, ImportCaBodyMspComponent component) {
      this.ca = ca;
      this.tlsca = tlsca;
      this.component = component;
    }

    /**
     * Builds a ImportCaBodyMsp.
     *
     * @return the new ImportCaBodyMsp instance
     */
    public ImportCaBodyMsp build() {
      return new ImportCaBodyMsp(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the ImportCaBodyMsp builder
     */
    public Builder ca(ImportCaBodyMspCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the ImportCaBodyMsp builder
     */
    public Builder tlsca(ImportCaBodyMspTlsca tlsca) {
      this.tlsca = tlsca;
      return this;
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the ImportCaBodyMsp builder
     */
    public Builder component(ImportCaBodyMspComponent component) {
      this.component = component;
      return this;
    }
  }

  protected ImportCaBodyMsp(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsca,
      "tlsca cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.component,
      "component cannot be null");
    ca = builder.ca;
    tlsca = builder.tlsca;
    component = builder.component;
  }

  /**
   * New builder.
   *
   * @return a ImportCaBodyMsp builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public ImportCaBodyMspCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public ImportCaBodyMspTlsca tlsca() {
    return tlsca;
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public ImportCaBodyMspComponent component() {
    return component;
  }
}

