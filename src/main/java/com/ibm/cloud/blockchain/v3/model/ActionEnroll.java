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
 * ActionEnroll.
 */
public class ActionEnroll extends GenericModel {

  @SerializedName("tls_cert")
  protected Boolean tlsCert;
  protected Boolean ecert;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean tlsCert;
    private Boolean ecert;

    private Builder(ActionEnroll actionEnroll) {
      this.tlsCert = actionEnroll.tlsCert;
      this.ecert = actionEnroll.ecert;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionEnroll.
     *
     * @return the new ActionEnroll instance
     */
    public ActionEnroll build() {
      return new ActionEnroll(this);
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the ActionEnroll builder
     */
    public Builder tlsCert(Boolean tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the ecert.
     *
     * @param ecert the ecert
     * @return the ActionEnroll builder
     */
    public Builder ecert(Boolean ecert) {
      this.ecert = ecert;
      return this;
    }
  }

  protected ActionEnroll(Builder builder) {
    tlsCert = builder.tlsCert;
    ecert = builder.ecert;
  }

  /**
   * New builder.
   *
   * @return a ActionEnroll builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tlsCert.
   *
   * Set to `true` to generate a new tls cert for this component via enrollment.
   *
   * @return the tlsCert
   */
  public Boolean tlsCert() {
    return tlsCert;
  }

  /**
   * Gets the ecert.
   *
   * Set to `true` to generate a new ecert for this component via enrollment.
   *
   * @return the ecert
   */
  public Boolean ecert() {
    return ecert;
  }
}

