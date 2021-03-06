// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface SearchEvaluationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Evaluation search parent. Format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Evaluation search parent. Format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Support filtering by model id, job state, start and end time.
   * Format:
   * "evaluation_job.evaluation_job_id = {evaluation_job_id} AND
   * evaluation_job.evaluation_job_run_time_start = {timestamp} AND
   * evaluation_job.evaluation_job_run_time_end = {timestamp} AND
   * annotation_spec.display_name = {display_name}"
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Support filtering by model id, job state, start and end time.
   * Format:
   * "evaluation_job.evaluation_job_id = {evaluation_job_id} AND
   * evaluation_job.evaluation_job_run_time_start = {timestamp} AND
   * evaluation_job.evaluation_job_run_time_end = {timestamp} AND
   * annotation_spec.display_name = {display_name}"
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [SearchEvaluationsResponse.next_page_token][google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse.next_page_token]
   * of the previous [DataLabelingService.SearchEvaluations] call. Return first
   * page if empty.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [SearchEvaluationsResponse.next_page_token][google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse.next_page_token]
   * of the previous [DataLabelingService.SearchEvaluations] call. Return first
   * page if empty.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
