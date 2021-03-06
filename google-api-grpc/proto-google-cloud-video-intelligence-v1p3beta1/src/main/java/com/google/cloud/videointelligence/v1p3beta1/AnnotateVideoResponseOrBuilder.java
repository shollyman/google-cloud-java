// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface AnnotateVideoResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.AnnotateVideoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults>
      getAnnotationResultsList();
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults getAnnotationResults(
      int index);
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  int getAnnotationResultsCount();
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder>
      getAnnotationResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotation results for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults annotation_results = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoAnnotationResultsOrBuilder
      getAnnotationResultsOrBuilder(int index);
}
