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
 * GetAthenaHealthStatsResponseOPTOOLS.
 */
public class GetAthenaHealthStatsResponseOPTOOLS extends GenericModel {

  @SerializedName("instance_id")
  protected String instanceId;
  protected Double now;
  protected Double born;
  @SerializedName("up_time")
  protected String upTime;
  @SerializedName("memory_usage")
  protected GetAthenaHealthStatsResponseOPTOOLSMemoryUsage memoryUsage;
  @SerializedName("session_cache_stats")
  protected CacheData sessionCacheStats;
  @SerializedName("couch_cache_stats")
  protected CacheData couchCacheStats;
  @SerializedName("iam_cache_stats")
  protected CacheData iamCacheStats;
  @SerializedName("proxy_cache")
  protected CacheData proxyCache;

  /**
   * Gets the instanceId.
   *
   * Random/unique id for a process running IBP console.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the now.
   *
   * UTC UNIX timestamp of the current time according to the server. In milliseconds.
   *
   * @return the now
   */
  public Double getNow() {
    return now;
  }

  /**
   * Gets the born.
   *
   * UTC UNIX timestamp of when the server started. In milliseconds.
   *
   * @return the born
   */
  public Double getBorn() {
    return born;
  }

  /**
   * Gets the upTime.
   *
   * Total time the IBP console server has been running.
   *
   * @return the upTime
   */
  public String getUpTime() {
    return upTime;
  }

  /**
   * Gets the memoryUsage.
   *
   * @return the memoryUsage
   */
  public GetAthenaHealthStatsResponseOPTOOLSMemoryUsage getMemoryUsage() {
    return memoryUsage;
  }

  /**
   * Gets the sessionCacheStats.
   *
   * @return the sessionCacheStats
   */
  public CacheData getSessionCacheStats() {
    return sessionCacheStats;
  }

  /**
   * Gets the couchCacheStats.
   *
   * @return the couchCacheStats
   */
  public CacheData getCouchCacheStats() {
    return couchCacheStats;
  }

  /**
   * Gets the iamCacheStats.
   *
   * @return the iamCacheStats
   */
  public CacheData getIamCacheStats() {
    return iamCacheStats;
  }

  /**
   * Gets the proxyCache.
   *
   * @return the proxyCache
   */
  public CacheData getProxyCache() {
    return proxyCache;
  }
}

