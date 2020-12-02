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
 * GetAthenaHealthStatsResponseOPTOOLSMemoryUsage.
 */
public class GetAthenaHealthStatsResponseOPTOOLSMemoryUsage extends GenericModel {

  protected String rss;
  protected String heapTotal;
  protected String heapUsed;
  protected String external;

  /**
   * Gets the rss.
   *
   * Resident set size - total memory allocated for the process.
   *
   * @return the rss
   */
  public String getRss() {
    return rss;
  }

  /**
   * Gets the heapTotal.
   *
   * Memory allocated for the heap of V8.
   *
   * @return the heapTotal
   */
  public String getHeapTotal() {
    return heapTotal;
  }

  /**
   * Gets the heapUsed.
   *
   * Current heap used by V8.
   *
   * @return the heapUsed
   */
  public String getHeapUsed() {
    return heapUsed;
  }

  /**
   * Gets the external.
   *
   * Memory used by bound C++ objects.
   *
   * @return the external
   */
  public String getExternal() {
    return external;
  }
}

