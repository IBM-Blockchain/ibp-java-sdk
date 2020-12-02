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
 * CpuHealthStatsTimes.
 */
public class CpuHealthStatsTimes extends GenericModel {

  protected Double idle;
  protected Double irq;
  protected Double nice;
  protected Double sys;
  protected Double user;

  /**
   * Gets the idle.
   *
   * ms CPU is in idle.
   *
   * @return the idle
   */
  public Double getIdle() {
    return idle;
  }

  /**
   * Gets the irq.
   *
   * ms CPU is in irq.
   *
   * @return the irq
   */
  public Double getIrq() {
    return irq;
  }

  /**
   * Gets the nice.
   *
   * ms CPU is in nice.
   *
   * @return the nice
   */
  public Double getNice() {
    return nice;
  }

  /**
   * Gets the sys.
   *
   * ms CPU is in sys.
   *
   * @return the sys
   */
  public Double getSys() {
    return sys;
  }

  /**
   * Gets the user.
   *
   * ms CPU is in user.
   *
   * @return the user
   */
  public Double getUser() {
    return user;
  }
}

