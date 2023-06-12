// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/contractmanager/query.proto

package com.neutron.contractmanager;

/**
 * Protobuf type {@code neutron.contractmanager.QueryFailuresResponse}
 */
public final class QueryFailuresResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:neutron.contractmanager.QueryFailuresResponse)
    QueryFailuresResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFailuresResponse.newBuilder() to construct.
  private QueryFailuresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFailuresResponse() {
    failures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFailuresResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.neutron.contractmanager.QueryProto.internal_static_neutron_contractmanager_QueryFailuresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.neutron.contractmanager.QueryProto.internal_static_neutron_contractmanager_QueryFailuresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.neutron.contractmanager.QueryFailuresResponse.class, com.neutron.contractmanager.QueryFailuresResponse.Builder.class);
  }

  public static final int FAILURES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.neutron.contractmanager.Failure> failures_;
  /**
   * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.neutron.contractmanager.Failure> getFailuresList() {
    return failures_;
  }
  /**
   * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.neutron.contractmanager.FailureOrBuilder> 
      getFailuresOrBuilderList() {
    return failures_;
  }
  /**
   * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getFailuresCount() {
    return failures_.size();
  }
  /**
   * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.neutron.contractmanager.Failure getFailures(int index) {
    return failures_.get(index);
  }
  /**
   * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.neutron.contractmanager.FailureOrBuilder getFailuresOrBuilder(
      int index) {
    return failures_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < failures_.size(); i++) {
      output.writeMessage(1, failures_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < failures_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, failures_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.neutron.contractmanager.QueryFailuresResponse)) {
      return super.equals(obj);
    }
    com.neutron.contractmanager.QueryFailuresResponse other = (com.neutron.contractmanager.QueryFailuresResponse) obj;

    if (!getFailuresList()
        .equals(other.getFailuresList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFailuresCount() > 0) {
      hash = (37 * hash) + FAILURES_FIELD_NUMBER;
      hash = (53 * hash) + getFailuresList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.neutron.contractmanager.QueryFailuresResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.neutron.contractmanager.QueryFailuresResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.contractmanager.QueryFailuresResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.neutron.contractmanager.QueryFailuresResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code neutron.contractmanager.QueryFailuresResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:neutron.contractmanager.QueryFailuresResponse)
      com.neutron.contractmanager.QueryFailuresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.neutron.contractmanager.QueryProto.internal_static_neutron_contractmanager_QueryFailuresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.neutron.contractmanager.QueryProto.internal_static_neutron_contractmanager_QueryFailuresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.neutron.contractmanager.QueryFailuresResponse.class, com.neutron.contractmanager.QueryFailuresResponse.Builder.class);
    }

    // Construct using com.neutron.contractmanager.QueryFailuresResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (failuresBuilder_ == null) {
        failures_ = java.util.Collections.emptyList();
      } else {
        failures_ = null;
        failuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.neutron.contractmanager.QueryProto.internal_static_neutron_contractmanager_QueryFailuresResponse_descriptor;
    }

    @java.lang.Override
    public com.neutron.contractmanager.QueryFailuresResponse getDefaultInstanceForType() {
      return com.neutron.contractmanager.QueryFailuresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.neutron.contractmanager.QueryFailuresResponse build() {
      com.neutron.contractmanager.QueryFailuresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.neutron.contractmanager.QueryFailuresResponse buildPartial() {
      com.neutron.contractmanager.QueryFailuresResponse result = new com.neutron.contractmanager.QueryFailuresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.neutron.contractmanager.QueryFailuresResponse result) {
      if (failuresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          failures_ = java.util.Collections.unmodifiableList(failures_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.failures_ = failures_;
      } else {
        result.failures_ = failuresBuilder_.build();
      }
    }

    private void buildPartial0(com.neutron.contractmanager.QueryFailuresResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.neutron.contractmanager.QueryFailuresResponse) {
        return mergeFrom((com.neutron.contractmanager.QueryFailuresResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.neutron.contractmanager.QueryFailuresResponse other) {
      if (other == com.neutron.contractmanager.QueryFailuresResponse.getDefaultInstance()) return this;
      if (failuresBuilder_ == null) {
        if (!other.failures_.isEmpty()) {
          if (failures_.isEmpty()) {
            failures_ = other.failures_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFailuresIsMutable();
            failures_.addAll(other.failures_);
          }
          onChanged();
        }
      } else {
        if (!other.failures_.isEmpty()) {
          if (failuresBuilder_.isEmpty()) {
            failuresBuilder_.dispose();
            failuresBuilder_ = null;
            failures_ = other.failures_;
            bitField0_ = (bitField0_ & ~0x00000001);
            failuresBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFailuresFieldBuilder() : null;
          } else {
            failuresBuilder_.addAllMessages(other.failures_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.neutron.contractmanager.Failure m =
                  input.readMessage(
                      com.neutron.contractmanager.Failure.parser(),
                      extensionRegistry);
              if (failuresBuilder_ == null) {
                ensureFailuresIsMutable();
                failures_.add(m);
              } else {
                failuresBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.neutron.contractmanager.Failure> failures_ =
      java.util.Collections.emptyList();
    private void ensureFailuresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        failures_ = new java.util.ArrayList<com.neutron.contractmanager.Failure>(failures_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.neutron.contractmanager.Failure, com.neutron.contractmanager.Failure.Builder, com.neutron.contractmanager.FailureOrBuilder> failuresBuilder_;

    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.neutron.contractmanager.Failure> getFailuresList() {
      if (failuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(failures_);
      } else {
        return failuresBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public int getFailuresCount() {
      if (failuresBuilder_ == null) {
        return failures_.size();
      } else {
        return failuresBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.contractmanager.Failure getFailures(int index) {
      if (failuresBuilder_ == null) {
        return failures_.get(index);
      } else {
        return failuresBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFailures(
        int index, com.neutron.contractmanager.Failure value) {
      if (failuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailuresIsMutable();
        failures_.set(index, value);
        onChanged();
      } else {
        failuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFailures(
        int index, com.neutron.contractmanager.Failure.Builder builderForValue) {
      if (failuresBuilder_ == null) {
        ensureFailuresIsMutable();
        failures_.set(index, builderForValue.build());
        onChanged();
      } else {
        failuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFailures(com.neutron.contractmanager.Failure value) {
      if (failuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailuresIsMutable();
        failures_.add(value);
        onChanged();
      } else {
        failuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFailures(
        int index, com.neutron.contractmanager.Failure value) {
      if (failuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailuresIsMutable();
        failures_.add(index, value);
        onChanged();
      } else {
        failuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFailures(
        com.neutron.contractmanager.Failure.Builder builderForValue) {
      if (failuresBuilder_ == null) {
        ensureFailuresIsMutable();
        failures_.add(builderForValue.build());
        onChanged();
      } else {
        failuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFailures(
        int index, com.neutron.contractmanager.Failure.Builder builderForValue) {
      if (failuresBuilder_ == null) {
        ensureFailuresIsMutable();
        failures_.add(index, builderForValue.build());
        onChanged();
      } else {
        failuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllFailures(
        java.lang.Iterable<? extends com.neutron.contractmanager.Failure> values) {
      if (failuresBuilder_ == null) {
        ensureFailuresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failures_);
        onChanged();
      } else {
        failuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearFailures() {
      if (failuresBuilder_ == null) {
        failures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        failuresBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeFailures(int index) {
      if (failuresBuilder_ == null) {
        ensureFailuresIsMutable();
        failures_.remove(index);
        onChanged();
      } else {
        failuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.contractmanager.Failure.Builder getFailuresBuilder(
        int index) {
      return getFailuresFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.contractmanager.FailureOrBuilder getFailuresOrBuilder(
        int index) {
      if (failuresBuilder_ == null) {
        return failures_.get(index);  } else {
        return failuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.neutron.contractmanager.FailureOrBuilder> 
         getFailuresOrBuilderList() {
      if (failuresBuilder_ != null) {
        return failuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(failures_);
      }
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.contractmanager.Failure.Builder addFailuresBuilder() {
      return getFailuresFieldBuilder().addBuilder(
          com.neutron.contractmanager.Failure.getDefaultInstance());
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.contractmanager.Failure.Builder addFailuresBuilder(
        int index) {
      return getFailuresFieldBuilder().addBuilder(
          index, com.neutron.contractmanager.Failure.getDefaultInstance());
    }
    /**
     * <code>repeated .neutron.contractmanager.Failure failures = 1 [json_name = "failures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.neutron.contractmanager.Failure.Builder> 
         getFailuresBuilderList() {
      return getFailuresFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.neutron.contractmanager.Failure, com.neutron.contractmanager.Failure.Builder, com.neutron.contractmanager.FailureOrBuilder> 
        getFailuresFieldBuilder() {
      if (failuresBuilder_ == null) {
        failuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.neutron.contractmanager.Failure, com.neutron.contractmanager.Failure.Builder, com.neutron.contractmanager.FailureOrBuilder>(
                failures_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        failures_ = null;
      }
      return failuresBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:neutron.contractmanager.QueryFailuresResponse)
  }

  // @@protoc_insertion_point(class_scope:neutron.contractmanager.QueryFailuresResponse)
  private static final com.neutron.contractmanager.QueryFailuresResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.neutron.contractmanager.QueryFailuresResponse();
  }

  public static com.neutron.contractmanager.QueryFailuresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFailuresResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryFailuresResponse>() {
    @java.lang.Override
    public QueryFailuresResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryFailuresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFailuresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.neutron.contractmanager.QueryFailuresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

