/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/conformance/storage/v1/tests.proto

package com.google.cloud.conformance.storage.v1;

/** Protobuf type {@code google.cloud.conformance.storage.v1.TestFile} */
public final class TestFile extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.TestFile)
    TestFileOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TestFile.newBuilder() to construct.
  private TestFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TestFile() {
    signingV4Tests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TestFile(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                signingV4Tests_ =
                    new java.util.ArrayList<
                        com.google.cloud.conformance.storage.v1.SigningV4Test>();
                mutable_bitField0_ |= 0x00000001;
              }
              signingV4Tests_.add(
                  input.readMessage(
                      com.google.cloud.conformance.storage.v1.SigningV4Test.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        signingV4Tests_ = java.util.Collections.unmodifiableList(signingV4Tests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_TestFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.TestFile.class,
            com.google.cloud.conformance.storage.v1.TestFile.Builder.class);
  }

  public static final int SIGNING_V4_TESTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test> signingV4Tests_;
  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  public java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test>
      getSigningV4TestsList() {
    return signingV4Tests_;
  }
  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>
      getSigningV4TestsOrBuilderList() {
    return signingV4Tests_;
  }
  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  public int getSigningV4TestsCount() {
    return signingV4Tests_.size();
  }
  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  public com.google.cloud.conformance.storage.v1.SigningV4Test getSigningV4Tests(int index) {
    return signingV4Tests_.get(index);
  }
  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  public com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder getSigningV4TestsOrBuilder(
      int index) {
    return signingV4Tests_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < signingV4Tests_.size(); i++) {
      output.writeMessage(1, signingV4Tests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < signingV4Tests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, signingV4Tests_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.TestFile)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.TestFile other =
        (com.google.cloud.conformance.storage.v1.TestFile) obj;

    if (!getSigningV4TestsList().equals(other.getSigningV4TestsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSigningV4TestsCount() > 0) {
      hash = (37 * hash) + SIGNING_V4_TESTS_FIELD_NUMBER;
      hash = (53 * hash) + getSigningV4TestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.TestFile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.conformance.storage.v1.TestFile prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code google.cloud.conformance.storage.v1.TestFile} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.TestFile)
      com.google.cloud.conformance.storage.v1.TestFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_TestFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.TestFile.class,
              com.google.cloud.conformance.storage.v1.TestFile.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.TestFile.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSigningV4TestsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (signingV4TestsBuilder_ == null) {
        signingV4Tests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        signingV4TestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.TestFile getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.TestFile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.TestFile build() {
      com.google.cloud.conformance.storage.v1.TestFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.TestFile buildPartial() {
      com.google.cloud.conformance.storage.v1.TestFile result =
          new com.google.cloud.conformance.storage.v1.TestFile(this);
      int from_bitField0_ = bitField0_;
      if (signingV4TestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          signingV4Tests_ = java.util.Collections.unmodifiableList(signingV4Tests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.signingV4Tests_ = signingV4Tests_;
      } else {
        result.signingV4Tests_ = signingV4TestsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.conformance.storage.v1.TestFile) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.TestFile) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.TestFile other) {
      if (other == com.google.cloud.conformance.storage.v1.TestFile.getDefaultInstance())
        return this;
      if (signingV4TestsBuilder_ == null) {
        if (!other.signingV4Tests_.isEmpty()) {
          if (signingV4Tests_.isEmpty()) {
            signingV4Tests_ = other.signingV4Tests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSigningV4TestsIsMutable();
            signingV4Tests_.addAll(other.signingV4Tests_);
          }
          onChanged();
        }
      } else {
        if (!other.signingV4Tests_.isEmpty()) {
          if (signingV4TestsBuilder_.isEmpty()) {
            signingV4TestsBuilder_.dispose();
            signingV4TestsBuilder_ = null;
            signingV4Tests_ = other.signingV4Tests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            signingV4TestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSigningV4TestsFieldBuilder()
                    : null;
          } else {
            signingV4TestsBuilder_.addAllMessages(other.signingV4Tests_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.conformance.storage.v1.TestFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.conformance.storage.v1.TestFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test> signingV4Tests_ =
        java.util.Collections.emptyList();

    private void ensureSigningV4TestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signingV4Tests_ =
            new java.util.ArrayList<com.google.cloud.conformance.storage.v1.SigningV4Test>(
                signingV4Tests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.SigningV4Test,
            com.google.cloud.conformance.storage.v1.SigningV4Test.Builder,
            com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>
        signingV4TestsBuilder_;

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test>
        getSigningV4TestsList() {
      if (signingV4TestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signingV4Tests_);
      } else {
        return signingV4TestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public int getSigningV4TestsCount() {
      if (signingV4TestsBuilder_ == null) {
        return signingV4Tests_.size();
      } else {
        return signingV4TestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public com.google.cloud.conformance.storage.v1.SigningV4Test getSigningV4Tests(int index) {
      if (signingV4TestsBuilder_ == null) {
        return signingV4Tests_.get(index);
      } else {
        return signingV4TestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder setSigningV4Tests(
        int index, com.google.cloud.conformance.storage.v1.SigningV4Test value) {
      if (signingV4TestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.set(index, value);
        onChanged();
      } else {
        signingV4TestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder setSigningV4Tests(
        int index, com.google.cloud.conformance.storage.v1.SigningV4Test.Builder builderForValue) {
      if (signingV4TestsBuilder_ == null) {
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.set(index, builderForValue.build());
        onChanged();
      } else {
        signingV4TestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder addSigningV4Tests(com.google.cloud.conformance.storage.v1.SigningV4Test value) {
      if (signingV4TestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.add(value);
        onChanged();
      } else {
        signingV4TestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder addSigningV4Tests(
        int index, com.google.cloud.conformance.storage.v1.SigningV4Test value) {
      if (signingV4TestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.add(index, value);
        onChanged();
      } else {
        signingV4TestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder addSigningV4Tests(
        com.google.cloud.conformance.storage.v1.SigningV4Test.Builder builderForValue) {
      if (signingV4TestsBuilder_ == null) {
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.add(builderForValue.build());
        onChanged();
      } else {
        signingV4TestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder addSigningV4Tests(
        int index, com.google.cloud.conformance.storage.v1.SigningV4Test.Builder builderForValue) {
      if (signingV4TestsBuilder_ == null) {
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.add(index, builderForValue.build());
        onChanged();
      } else {
        signingV4TestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder addAllSigningV4Tests(
        java.lang.Iterable<? extends com.google.cloud.conformance.storage.v1.SigningV4Test>
            values) {
      if (signingV4TestsBuilder_ == null) {
        ensureSigningV4TestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, signingV4Tests_);
        onChanged();
      } else {
        signingV4TestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder clearSigningV4Tests() {
      if (signingV4TestsBuilder_ == null) {
        signingV4Tests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        signingV4TestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public Builder removeSigningV4Tests(int index) {
      if (signingV4TestsBuilder_ == null) {
        ensureSigningV4TestsIsMutable();
        signingV4Tests_.remove(index);
        onChanged();
      } else {
        signingV4TestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public com.google.cloud.conformance.storage.v1.SigningV4Test.Builder getSigningV4TestsBuilder(
        int index) {
      return getSigningV4TestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder
        getSigningV4TestsOrBuilder(int index) {
      if (signingV4TestsBuilder_ == null) {
        return signingV4Tests_.get(index);
      } else {
        return signingV4TestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>
        getSigningV4TestsOrBuilderList() {
      if (signingV4TestsBuilder_ != null) {
        return signingV4TestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signingV4Tests_);
      }
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public com.google.cloud.conformance.storage.v1.SigningV4Test.Builder
        addSigningV4TestsBuilder() {
      return getSigningV4TestsFieldBuilder()
          .addBuilder(com.google.cloud.conformance.storage.v1.SigningV4Test.getDefaultInstance());
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public com.google.cloud.conformance.storage.v1.SigningV4Test.Builder addSigningV4TestsBuilder(
        int index) {
      return getSigningV4TestsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.conformance.storage.v1.SigningV4Test.getDefaultInstance());
    }
    /**
     * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test.Builder>
        getSigningV4TestsBuilderList() {
      return getSigningV4TestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.SigningV4Test,
            com.google.cloud.conformance.storage.v1.SigningV4Test.Builder,
            com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>
        getSigningV4TestsFieldBuilder() {
      if (signingV4TestsBuilder_ == null) {
        signingV4TestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.conformance.storage.v1.SigningV4Test,
                com.google.cloud.conformance.storage.v1.SigningV4Test.Builder,
                com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>(
                signingV4Tests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        signingV4Tests_ = null;
      }
      return signingV4TestsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.TestFile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.TestFile)
  private static final com.google.cloud.conformance.storage.v1.TestFile DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.TestFile();
  }

  public static com.google.cloud.conformance.storage.v1.TestFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestFile> PARSER =
      new com.google.protobuf.AbstractParser<TestFile>() {
        @java.lang.Override
        public TestFile parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestFile(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TestFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.TestFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}