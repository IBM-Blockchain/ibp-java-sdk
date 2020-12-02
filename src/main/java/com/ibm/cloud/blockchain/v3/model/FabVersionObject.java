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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * FabVersionObject.
 */
public class FabVersionObject extends GenericModel {

  @SerializedName("default")
  protected Boolean xDefault;
  protected String version;
  protected Map<String, Object> image;

  /**
   * Gets the xDefault.
   *
   * Indicates if this is the Fabric version that will be used if none is selected.
   *
   * @return the xDefault
   */
  public Boolean isXDefault() {
    return xDefault;
  }

  /**
   * Gets the version.
   *
   * The Fabric version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the image.
   *
   * Detailed image information for this Fabric release.
   *
   * @return the image
   */
  public Map<String, Object> getImage() {
    return image;
  }
}

