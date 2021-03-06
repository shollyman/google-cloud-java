/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/package.proto

package io.grafeas.v1;

public interface DistributionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  java.lang.String getCpeUri();
  /**
   *
   *
   * <pre>
   * Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  com.google.protobuf.ByteString getCpeUriBytes();

  /**
   *
   *
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built.
   * </pre>
   *
   * <code>.grafeas.v1.Architecture architecture = 2;</code>
   */
  int getArchitectureValue();
  /**
   *
   *
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built.
   * </pre>
   *
   * <code>.grafeas.v1.Architecture architecture = 2;</code>
   */
  io.grafeas.v1.Architecture getArchitecture();

  /**
   *
   *
   * <pre>
   * The latest available version of this package in this distribution channel.
   * </pre>
   *
   * <code>.grafeas.v1.Version latest_version = 3;</code>
   */
  boolean hasLatestVersion();
  /**
   *
   *
   * <pre>
   * The latest available version of this package in this distribution channel.
   * </pre>
   *
   * <code>.grafeas.v1.Version latest_version = 3;</code>
   */
  io.grafeas.v1.Version getLatestVersion();
  /**
   *
   *
   * <pre>
   * The latest available version of this package in this distribution channel.
   * </pre>
   *
   * <code>.grafeas.v1.Version latest_version = 3;</code>
   */
  io.grafeas.v1.VersionOrBuilder getLatestVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * A freeform string denoting the maintainer of this package.
   * </pre>
   *
   * <code>string maintainer = 4;</code>
   */
  java.lang.String getMaintainer();
  /**
   *
   *
   * <pre>
   * A freeform string denoting the maintainer of this package.
   * </pre>
   *
   * <code>string maintainer = 4;</code>
   */
  com.google.protobuf.ByteString getMaintainerBytes();

  /**
   *
   *
   * <pre>
   * The distribution channel-specific homepage for this package.
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * The distribution channel-specific homepage for this package.
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * The distribution channel-specific description of this package.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The distribution channel-specific description of this package.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
