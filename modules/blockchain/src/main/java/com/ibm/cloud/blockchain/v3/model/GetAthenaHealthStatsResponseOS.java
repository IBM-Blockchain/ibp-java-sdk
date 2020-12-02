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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetAthenaHealthStatsResponseOS.
 */
public class GetAthenaHealthStatsResponseOS extends GenericModel {

  protected String arch;
  protected String type;
  protected String endian;
  protected List<Double> loadavg;
  protected List<CpuHealthStats> cpus;
  @SerializedName("total_memory")
  protected String totalMemory;
  @SerializedName("free_memory")
  protected String freeMemory;
  @SerializedName("up_time")
  protected String upTime;

  /**
   * Gets the arch.
   *
   * CPU architecture.
   *
   * @return the arch
   */
  public String getArch() {
    return arch;
  }

  /**
   * Gets the type.
   *
   * Operating system name.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the endian.
   *
   * Endianness of the CPU. LE = Little Endian, BE = Big Endian.
   *
   * @return the endian
   */
  public String getEndian() {
    return endian;
  }

  /**
   * Gets the loadavg.
   *
   * CPU load in 1, 5, &amp; 15 minute averages. n/a on windows.
   *
   * @return the loadavg
   */
  public List<Double> getLoadavg() {
    return loadavg;
  }

  /**
   * Gets the cpus.
   *
   * @return the cpus
   */
  public List<CpuHealthStats> getCpus() {
    return cpus;
  }

  /**
   * Gets the totalMemory.
   *
   * Total memory known to the operating system.
   *
   * @return the totalMemory
   */
  public String getTotalMemory() {
    return totalMemory;
  }

  /**
   * Gets the freeMemory.
   *
   * Free memory on the operating system.
   *
   * @return the freeMemory
   */
  public String getFreeMemory() {
    return freeMemory;
  }

  /**
   * Gets the upTime.
   *
   * Time operating system has been running.
   *
   * @return the upTime
   */
  public String getUpTime() {
    return upTime;
  }
}

