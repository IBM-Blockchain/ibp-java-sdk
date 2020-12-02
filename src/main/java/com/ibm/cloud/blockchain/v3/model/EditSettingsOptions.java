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
 * The editSettings options.
 */
public class EditSettingsOptions extends GenericModel {

  protected EditSettingsBodyInactivityTimeouts inactivityTimeouts;
  protected EditLogSettingsBody fileLogging;
  protected Double maxReqPerMin;
  protected Double maxReqPerMinAk;
  protected Double fabricGetBlockTimeoutMs;
  protected Double fabricInstantiateTimeoutMs;
  protected Double fabricJoinChannelTimeoutMs;
  protected Double fabricInstallCcTimeoutMs;
  protected Double fabricLcInstallCcTimeoutMs;
  protected Double fabricLcGetCcTimeoutMs;
  protected Double fabricGeneralTimeoutMs;

  /**
   * Builder.
   */
  public static class Builder {
    private EditSettingsBodyInactivityTimeouts inactivityTimeouts;
    private EditLogSettingsBody fileLogging;
    private Double maxReqPerMin;
    private Double maxReqPerMinAk;
    private Double fabricGetBlockTimeoutMs;
    private Double fabricInstantiateTimeoutMs;
    private Double fabricJoinChannelTimeoutMs;
    private Double fabricInstallCcTimeoutMs;
    private Double fabricLcInstallCcTimeoutMs;
    private Double fabricLcGetCcTimeoutMs;
    private Double fabricGeneralTimeoutMs;

    private Builder(EditSettingsOptions editSettingsOptions) {
      this.inactivityTimeouts = editSettingsOptions.inactivityTimeouts;
      this.fileLogging = editSettingsOptions.fileLogging;
      this.maxReqPerMin = editSettingsOptions.maxReqPerMin;
      this.maxReqPerMinAk = editSettingsOptions.maxReqPerMinAk;
      this.fabricGetBlockTimeoutMs = editSettingsOptions.fabricGetBlockTimeoutMs;
      this.fabricInstantiateTimeoutMs = editSettingsOptions.fabricInstantiateTimeoutMs;
      this.fabricJoinChannelTimeoutMs = editSettingsOptions.fabricJoinChannelTimeoutMs;
      this.fabricInstallCcTimeoutMs = editSettingsOptions.fabricInstallCcTimeoutMs;
      this.fabricLcInstallCcTimeoutMs = editSettingsOptions.fabricLcInstallCcTimeoutMs;
      this.fabricLcGetCcTimeoutMs = editSettingsOptions.fabricLcGetCcTimeoutMs;
      this.fabricGeneralTimeoutMs = editSettingsOptions.fabricGeneralTimeoutMs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EditSettingsOptions.
     *
     * @return the new EditSettingsOptions instance
     */
    public EditSettingsOptions build() {
      return new EditSettingsOptions(this);
    }

    /**
     * Set the inactivityTimeouts.
     *
     * @param inactivityTimeouts the inactivityTimeouts
     * @return the EditSettingsOptions builder
     */
    public Builder inactivityTimeouts(EditSettingsBodyInactivityTimeouts inactivityTimeouts) {
      this.inactivityTimeouts = inactivityTimeouts;
      return this;
    }

    /**
     * Set the fileLogging.
     *
     * @param fileLogging the fileLogging
     * @return the EditSettingsOptions builder
     */
    public Builder fileLogging(EditLogSettingsBody fileLogging) {
      this.fileLogging = fileLogging;
      return this;
    }

    /**
     * Set the maxReqPerMin.
     *
     * @param maxReqPerMin the maxReqPerMin
     * @return the EditSettingsOptions builder
     */
    public Builder maxReqPerMin(Double maxReqPerMin) {
      this.maxReqPerMin = maxReqPerMin;
      return this;
    }

    /**
     * Set the maxReqPerMinAk.
     *
     * @param maxReqPerMinAk the maxReqPerMinAk
     * @return the EditSettingsOptions builder
     */
    public Builder maxReqPerMinAk(Double maxReqPerMinAk) {
      this.maxReqPerMinAk = maxReqPerMinAk;
      return this;
    }

    /**
     * Set the fabricGetBlockTimeoutMs.
     *
     * @param fabricGetBlockTimeoutMs the fabricGetBlockTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricGetBlockTimeoutMs(Double fabricGetBlockTimeoutMs) {
      this.fabricGetBlockTimeoutMs = fabricGetBlockTimeoutMs;
      return this;
    }

    /**
     * Set the fabricInstantiateTimeoutMs.
     *
     * @param fabricInstantiateTimeoutMs the fabricInstantiateTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricInstantiateTimeoutMs(Double fabricInstantiateTimeoutMs) {
      this.fabricInstantiateTimeoutMs = fabricInstantiateTimeoutMs;
      return this;
    }

    /**
     * Set the fabricJoinChannelTimeoutMs.
     *
     * @param fabricJoinChannelTimeoutMs the fabricJoinChannelTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricJoinChannelTimeoutMs(Double fabricJoinChannelTimeoutMs) {
      this.fabricJoinChannelTimeoutMs = fabricJoinChannelTimeoutMs;
      return this;
    }

    /**
     * Set the fabricInstallCcTimeoutMs.
     *
     * @param fabricInstallCcTimeoutMs the fabricInstallCcTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricInstallCcTimeoutMs(Double fabricInstallCcTimeoutMs) {
      this.fabricInstallCcTimeoutMs = fabricInstallCcTimeoutMs;
      return this;
    }

    /**
     * Set the fabricLcInstallCcTimeoutMs.
     *
     * @param fabricLcInstallCcTimeoutMs the fabricLcInstallCcTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricLcInstallCcTimeoutMs(Double fabricLcInstallCcTimeoutMs) {
      this.fabricLcInstallCcTimeoutMs = fabricLcInstallCcTimeoutMs;
      return this;
    }

    /**
     * Set the fabricLcGetCcTimeoutMs.
     *
     * @param fabricLcGetCcTimeoutMs the fabricLcGetCcTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricLcGetCcTimeoutMs(Double fabricLcGetCcTimeoutMs) {
      this.fabricLcGetCcTimeoutMs = fabricLcGetCcTimeoutMs;
      return this;
    }

    /**
     * Set the fabricGeneralTimeoutMs.
     *
     * @param fabricGeneralTimeoutMs the fabricGeneralTimeoutMs
     * @return the EditSettingsOptions builder
     */
    public Builder fabricGeneralTimeoutMs(Double fabricGeneralTimeoutMs) {
      this.fabricGeneralTimeoutMs = fabricGeneralTimeoutMs;
      return this;
    }
  }

  protected EditSettingsOptions(Builder builder) {
    inactivityTimeouts = builder.inactivityTimeouts;
    fileLogging = builder.fileLogging;
    maxReqPerMin = builder.maxReqPerMin;
    maxReqPerMinAk = builder.maxReqPerMinAk;
    fabricGetBlockTimeoutMs = builder.fabricGetBlockTimeoutMs;
    fabricInstantiateTimeoutMs = builder.fabricInstantiateTimeoutMs;
    fabricJoinChannelTimeoutMs = builder.fabricJoinChannelTimeoutMs;
    fabricInstallCcTimeoutMs = builder.fabricInstallCcTimeoutMs;
    fabricLcInstallCcTimeoutMs = builder.fabricLcInstallCcTimeoutMs;
    fabricLcGetCcTimeoutMs = builder.fabricLcGetCcTimeoutMs;
    fabricGeneralTimeoutMs = builder.fabricGeneralTimeoutMs;
  }

  /**
   * New builder.
   *
   * @return a EditSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inactivityTimeouts.
   *
   * @return the inactivityTimeouts
   */
  public EditSettingsBodyInactivityTimeouts inactivityTimeouts() {
    return inactivityTimeouts;
  }

  /**
   * Gets the fileLogging.
   *
   * File system logging settings. All body fields are optional (only send the fields that you want to change). _Changes
   * to this field will restart the IBP console server(s)_.
   *
   * @return the fileLogging
   */
  public EditLogSettingsBody fileLogging() {
    return fileLogging;
  }

  /**
   * Gets the maxReqPerMin.
   *
   * The base limit for the maximum number of `/api/_*` API requests (aka UI requests) in 1 minute. Defaults `25`. [Rate
   * Limits](#rate-limits). _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the maxReqPerMin
   */
  public Double maxReqPerMin() {
    return maxReqPerMin;
  }

  /**
   * Gets the maxReqPerMinAk.
   *
   * The base limit for the maximum number of `/ak/api/_*` API requests (aka external api key requests) in 1 minute.
   * Defaults `25`. [Rate Limits](#rate-limits). _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the maxReqPerMinAk
   */
  public Double maxReqPerMinAk() {
    return maxReqPerMinAk;
  }

  /**
   * Gets the fabricGetBlockTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a get-block transaction. Defaults to `10000` ms (10 seconds). _Refresh
   * browser after changes_.
   *
   * @return the fabricGetBlockTimeoutMs
   */
  public Double fabricGetBlockTimeoutMs() {
    return fabricGetBlockTimeoutMs;
  }

  /**
   * Gets the fabricInstantiateTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a instantiate chaincode transaction. Defaults to `300000` ms (5 minutes).
   * _Refresh browser after changes_.
   *
   * @return the fabricInstantiateTimeoutMs
   */
  public Double fabricInstantiateTimeoutMs() {
    return fabricInstantiateTimeoutMs;
  }

  /**
   * Gets the fabricJoinChannelTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a join-channel transaction. Defaults to `25000` ms (25 seconds). _Refresh
   * browser after changes_.
   *
   * @return the fabricJoinChannelTimeoutMs
   */
  public Double fabricJoinChannelTimeoutMs() {
    return fabricJoinChannelTimeoutMs;
  }

  /**
   * Gets the fabricInstallCcTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a install chaincode transaction (Fabric v1.x). Defaults to `300000` ms (5
   * minutes). _Refresh browser after changes_.
   *
   * @return the fabricInstallCcTimeoutMs
   */
  public Double fabricInstallCcTimeoutMs() {
    return fabricInstallCcTimeoutMs;
  }

  /**
   * Gets the fabricLcInstallCcTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a install chaincode transaction (Fabric v2.x). Defaults to `300000` ms (5
   * minutes). _Refresh browser after changes_.
   *
   * @return the fabricLcInstallCcTimeoutMs
   */
  public Double fabricLcInstallCcTimeoutMs() {
    return fabricLcInstallCcTimeoutMs;
  }

  /**
   * Gets the fabricLcGetCcTimeoutMs.
   *
   * Maximum time in milliseconds to wait for a get-chaincode transaction (Fabric v2.x). Defaults to `180000` ms (3
   * minutes). _Refresh browser after changes_.
   *
   * @return the fabricLcGetCcTimeoutMs
   */
  public Double fabricLcGetCcTimeoutMs() {
    return fabricLcGetCcTimeoutMs;
  }

  /**
   * Gets the fabricGeneralTimeoutMs.
   *
   * Default maximum time in milliseconds to wait for a Fabric transaction. Defaults to `10000` ms (10 seconds).
   * _Refresh browser after changes_.
   *
   * @return the fabricGeneralTimeoutMs
   */
  public Double fabricGeneralTimeoutMs() {
    return fabricGeneralTimeoutMs;
  }
}

