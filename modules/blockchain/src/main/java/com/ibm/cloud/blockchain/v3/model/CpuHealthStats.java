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
 * CpuHealthStats.
 */
public class CpuHealthStats extends GenericModel {

  protected String model;
  protected Double speed;
  protected CpuHealthStatsTimes times;

  /**
   * Gets the model.
   *
   * Model of CPU core.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * Gets the speed.
   *
   * Speed of core in MHz.
   *
   * @return the speed
   */
  public Double getSpeed() {
    return speed;
  }

  /**
   * Gets the times.
   *
   * @return the times
   */
  public CpuHealthStatsTimes getTimes() {
    return times;
  }
}

