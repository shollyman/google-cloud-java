// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

public interface CreateAutoscalingPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the region, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the region, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The autoscaling policy to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 2;</code>
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The autoscaling policy to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.AutoscalingPolicy getPolicy();
  /**
   *
   *
   * <pre>
   * The autoscaling policy to create.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder getPolicyOrBuilder();
}