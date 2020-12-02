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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A supported release of Fabric for this component type.
 */
public class FabricVersionDictionary extends DynamicModel<Object> {

  @SerializedName("1.4.6-2")
  protected FabVersionObject x1462;
  @SerializedName("2.1.0-0")
  protected FabVersionObject x2100;

  public FabricVersionDictionary() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the x1462.
   *
   * @return the x1462
   */
  public FabVersionObject getX1462() {
    return this.x1462;
  }

  /**
   * Gets the x2100.
   *
   * @return the x2100
   */
  public FabVersionObject getX2100() {
    return this.x2100;
  }
}
