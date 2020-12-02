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
 * The various commit hashes of components powering this IBP console.
 */
public class GetPublicSettingsResponseVERSIONS extends GenericModel {

  protected String apollo;
  protected String athena;
  protected String stitch;
  protected String tag;

  /**
   * Gets the apollo.
   *
   * The commit hash of Apollo code (front-end).
   *
   * @return the apollo
   */
  public String getApollo() {
    return apollo;
  }

  /**
   * Gets the athena.
   *
   * The commit hash of Athena code (back-end).
   *
   * @return the athena
   */
  public String getAthena() {
    return athena;
  }

  /**
   * Gets the stitch.
   *
   * The commit hash of Stitch code (fabric-sdk).
   *
   * @return the stitch
   */
  public String getStitch() {
    return stitch;
  }

  /**
   * Gets the tag.
   *
   * The tag of the build powering this IBP console.
   *
   * @return the tag
   */
  public String getTag() {
    return tag;
  }
}

