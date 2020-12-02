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
 * CacheData.
 */
public class CacheData extends GenericModel {

  protected Double hits;
  protected Double misses;
  protected Double keys;
  @SerializedName("cache_size")
  protected String cacheSize;

  /**
   * Gets the hits.
   *
   * Number of cache hits.
   *
   * @return the hits
   */
  public Double getHits() {
    return hits;
  }

  /**
   * Gets the misses.
   *
   * Number of cache misses.
   *
   * @return the misses
   */
  public Double getMisses() {
    return misses;
  }

  /**
   * Gets the keys.
   *
   * Number of entries in the cache.
   *
   * @return the keys
   */
  public Double getKeys() {
    return keys;
  }

  /**
   * Gets the cacheSize.
   *
   * Approximate size of the in memory cache.
   *
   * @return the cacheSize
   */
  public String getCacheSize() {
    return cacheSize;
  }
}

