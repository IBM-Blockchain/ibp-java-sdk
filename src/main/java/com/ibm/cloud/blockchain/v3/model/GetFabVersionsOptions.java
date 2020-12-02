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
 * The getFabVersions options.
 */
public class GetFabVersionsOptions extends GenericModel {

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

  protected String cache;

  /**
   * Builder.
   */
  public static class Builder {
    private String cache;

    private Builder(GetFabVersionsOptions getFabVersionsOptions) {
      this.cache = getFabVersionsOptions.cache;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetFabVersionsOptions.
     *
     * @return the new GetFabVersionsOptions instance
     */
    public GetFabVersionsOptions build() {
      return new GetFabVersionsOptions(this);
    }

    /**
     * Set the cache.
     *
     * @param cache the cache
     * @return the GetFabVersionsOptions builder
     */
    public Builder cache(String cache) {
      this.cache = cache;
      return this;
    }
  }

  protected GetFabVersionsOptions(Builder builder) {
    cache = builder.cache;
  }

  /**
   * New builder.
   *
   * @return a GetFabVersionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

