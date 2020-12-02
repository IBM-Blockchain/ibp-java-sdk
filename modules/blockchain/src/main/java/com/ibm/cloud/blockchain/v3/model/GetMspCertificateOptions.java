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
 * The getMspCertificate options.
 */
public class GetMspCertificateOptions extends GenericModel {

  /**
   * Set to 'skip' if the response should skip local data and fetch live data wherever possible. Expect longer response
   * times if the cache is skipped. Default responses will use the cache.
   */
  public interface Cache {
    /** skip. */
    String SKIP = "skip";
    /** use. */
    String USE = "use";
  }

  protected String mspId;
  protected String cache;

  /**
   * Builder.
   */
  public static class Builder {
    private String mspId;
    private String cache;

    private Builder(GetMspCertificateOptions getMspCertificateOptions) {
      this.mspId = getMspCertificateOptions.mspId;
      this.cache = getMspCertificateOptions.cache;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mspId the mspId
     */
    public Builder(String mspId) {
      this.mspId = mspId;
    }

    /**
     * Builds a GetMspCertificateOptions.
     *
     * @return the new GetMspCertificateOptions instance
     */
    public GetMspCertificateOptions build() {
      return new GetMspCertificateOptions(this);
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the GetMspCertificateOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the cache.
     *
     * @param cache the cache
     * @return the GetMspCertificateOptions builder
     */
    public Builder cache(String cache) {
      this.cache = cache;
      return this;
    }
  }

  protected GetMspCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.mspId,
      "mspId cannot be empty");
    mspId = builder.mspId;
    cache = builder.cache;
  }

  /**
   * New builder.
   *
   * @return a GetMspCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mspId.
   *
   * The `msp_id` to fetch.
   *
   * @return the mspId
   */
  public String mspId() {
    return mspId;
  }

  /**
   * Gets the cache.
   *
   * Set to 'skip' if the response should skip local data and fetch live data wherever possible. Expect longer response
   * times if the cache is skipped. Default responses will use the cache.
   *
   * @return the cache
   */
  public String cache() {
    return cache;
  }
}

