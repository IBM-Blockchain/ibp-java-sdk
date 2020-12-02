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
 * ImportCaBodyMspComponent.
 */
public class ImportCaBodyMspComponent extends GenericModel {

  @SerializedName("tls_cert")
  protected String tlsCert;

  /**
   * Builder.
   */
  public static class Builder {
    private String tlsCert;

    private Builder(ImportCaBodyMspComponent importCaBodyMspComponent) {
      this.tlsCert = importCaBodyMspComponent.tlsCert;
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
     * Builds a ImportCaBodyMspComponent.
     *
     * @return the new ImportCaBodyMspComponent instance
     */
    public ImportCaBodyMspComponent build() {
      return new ImportCaBodyMspComponent(this);
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the ImportCaBodyMspComponent builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }
  }

  protected ImportCaBodyMspComponent(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsCert,
      "tlsCert cannot be null");
    tlsCert = builder.tlsCert;
  }

  /**
   * New builder.
   *
   * @return a ImportCaBodyMspComponent builder
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
}

