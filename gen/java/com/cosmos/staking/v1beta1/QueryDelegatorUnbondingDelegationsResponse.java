// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryUnbondingDelegatorDelegationsResponse is response type for the
 * Query/UnbondingDelegatorDelegations RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse}
 */
public final class QueryDelegatorUnbondingDelegationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)
    QueryDelegatorUnbondingDelegationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegatorUnbondingDelegationsResponse.newBuilder() to construct.
  private QueryDelegatorUnbondingDelegationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegatorUnbondingDelegationsResponse() {
    unbondingResponses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegatorUnbondingDelegationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorUnbondingDelegationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorUnbondingDelegationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.class, com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.Builder.class);
  }

  public static final int UNBONDING_RESPONSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation> unbondingResponses_;
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation> getUnbondingResponsesList() {
    return unbondingResponses_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> 
      getUnbondingResponsesOrBuilderList() {
    return unbondingResponses_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public int getUnbondingResponsesCount() {
    return unbondingResponses_.size();
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.UnbondingDelegation getUnbondingResponses(int index) {
    return unbondingResponses_.get(index);
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder getUnbondingResponsesOrBuilder(
      int index) {
    return unbondingResponses_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
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
    for (int i = 0; i < unbondingResponses_.size(); i++) {
      output.writeMessage(1, unbondingResponses_.get(i));
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
    for (int i = 0; i < unbondingResponses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, unbondingResponses_.get(i));
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
    if (!(obj instanceof com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse other = (com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse) obj;

    if (!getUnbondingResponsesList()
        .equals(other.getUnbondingResponsesList())) return false;
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
    if (getUnbondingResponsesCount() > 0) {
      hash = (37 * hash) + UNBONDING_RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getUnbondingResponsesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse prototype) {
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
   * <pre>
   * QueryUnbondingDelegatorDelegationsResponse is response type for the
   * Query/UnbondingDelegatorDelegations RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)
      com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorUnbondingDelegationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorUnbondingDelegationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.class, com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.newBuilder()
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
      if (unbondingResponsesBuilder_ == null) {
        unbondingResponses_ = java.util.Collections.emptyList();
      } else {
        unbondingResponses_ = null;
        unbondingResponsesBuilder_.clear();
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
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorUnbondingDelegationsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse getDefaultInstanceForType() {
      return com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse build() {
      com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse buildPartial() {
      com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse result = new com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse result) {
      if (unbondingResponsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          unbondingResponses_ = java.util.Collections.unmodifiableList(unbondingResponses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unbondingResponses_ = unbondingResponses_;
      } else {
        result.unbondingResponses_ = unbondingResponsesBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse) {
        return mergeFrom((com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse other) {
      if (other == com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.getDefaultInstance()) return this;
      if (unbondingResponsesBuilder_ == null) {
        if (!other.unbondingResponses_.isEmpty()) {
          if (unbondingResponses_.isEmpty()) {
            unbondingResponses_ = other.unbondingResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnbondingResponsesIsMutable();
            unbondingResponses_.addAll(other.unbondingResponses_);
          }
          onChanged();
        }
      } else {
        if (!other.unbondingResponses_.isEmpty()) {
          if (unbondingResponsesBuilder_.isEmpty()) {
            unbondingResponsesBuilder_.dispose();
            unbondingResponsesBuilder_ = null;
            unbondingResponses_ = other.unbondingResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            unbondingResponsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUnbondingResponsesFieldBuilder() : null;
          } else {
            unbondingResponsesBuilder_.addAllMessages(other.unbondingResponses_);
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
              com.cosmos.staking.v1beta1.UnbondingDelegation m =
                  input.readMessage(
                      com.cosmos.staking.v1beta1.UnbondingDelegation.parser(),
                      extensionRegistry);
              if (unbondingResponsesBuilder_ == null) {
                ensureUnbondingResponsesIsMutable();
                unbondingResponses_.add(m);
              } else {
                unbondingResponsesBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation> unbondingResponses_ =
      java.util.Collections.emptyList();
    private void ensureUnbondingResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        unbondingResponses_ = new java.util.ArrayList<com.cosmos.staking.v1beta1.UnbondingDelegation>(unbondingResponses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.staking.v1beta1.UnbondingDelegation, com.cosmos.staking.v1beta1.UnbondingDelegation.Builder, com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> unbondingResponsesBuilder_;

    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation> getUnbondingResponsesList() {
      if (unbondingResponsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(unbondingResponses_);
      } else {
        return unbondingResponsesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public int getUnbondingResponsesCount() {
      if (unbondingResponsesBuilder_ == null) {
        return unbondingResponses_.size();
      } else {
        return unbondingResponsesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.staking.v1beta1.UnbondingDelegation getUnbondingResponses(int index) {
      if (unbondingResponsesBuilder_ == null) {
        return unbondingResponses_.get(index);
      } else {
        return unbondingResponsesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setUnbondingResponses(
        int index, com.cosmos.staking.v1beta1.UnbondingDelegation value) {
      if (unbondingResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.set(index, value);
        onChanged();
      } else {
        unbondingResponsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setUnbondingResponses(
        int index, com.cosmos.staking.v1beta1.UnbondingDelegation.Builder builderForValue) {
      if (unbondingResponsesBuilder_ == null) {
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.set(index, builderForValue.build());
        onChanged();
      } else {
        unbondingResponsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addUnbondingResponses(com.cosmos.staking.v1beta1.UnbondingDelegation value) {
      if (unbondingResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.add(value);
        onChanged();
      } else {
        unbondingResponsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addUnbondingResponses(
        int index, com.cosmos.staking.v1beta1.UnbondingDelegation value) {
      if (unbondingResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.add(index, value);
        onChanged();
      } else {
        unbondingResponsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addUnbondingResponses(
        com.cosmos.staking.v1beta1.UnbondingDelegation.Builder builderForValue) {
      if (unbondingResponsesBuilder_ == null) {
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.add(builderForValue.build());
        onChanged();
      } else {
        unbondingResponsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addUnbondingResponses(
        int index, com.cosmos.staking.v1beta1.UnbondingDelegation.Builder builderForValue) {
      if (unbondingResponsesBuilder_ == null) {
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.add(index, builderForValue.build());
        onChanged();
      } else {
        unbondingResponsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addAllUnbondingResponses(
        java.lang.Iterable<? extends com.cosmos.staking.v1beta1.UnbondingDelegation> values) {
      if (unbondingResponsesBuilder_ == null) {
        ensureUnbondingResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unbondingResponses_);
        onChanged();
      } else {
        unbondingResponsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearUnbondingResponses() {
      if (unbondingResponsesBuilder_ == null) {
        unbondingResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        unbondingResponsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder removeUnbondingResponses(int index) {
      if (unbondingResponsesBuilder_ == null) {
        ensureUnbondingResponsesIsMutable();
        unbondingResponses_.remove(index);
        onChanged();
      } else {
        unbondingResponsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.staking.v1beta1.UnbondingDelegation.Builder getUnbondingResponsesBuilder(
        int index) {
      return getUnbondingResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder getUnbondingResponsesOrBuilder(
        int index) {
      if (unbondingResponsesBuilder_ == null) {
        return unbondingResponses_.get(index);  } else {
        return unbondingResponsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<? extends com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> 
         getUnbondingResponsesOrBuilderList() {
      if (unbondingResponsesBuilder_ != null) {
        return unbondingResponsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(unbondingResponses_);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.staking.v1beta1.UnbondingDelegation.Builder addUnbondingResponsesBuilder() {
      return getUnbondingResponsesFieldBuilder().addBuilder(
          com.cosmos.staking.v1beta1.UnbondingDelegation.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.staking.v1beta1.UnbondingDelegation.Builder addUnbondingResponsesBuilder(
        int index) {
      return getUnbondingResponsesFieldBuilder().addBuilder(
          index, com.cosmos.staking.v1beta1.UnbondingDelegation.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation.Builder> 
         getUnbondingResponsesBuilderList() {
      return getUnbondingResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.staking.v1beta1.UnbondingDelegation, com.cosmos.staking.v1beta1.UnbondingDelegation.Builder, com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> 
        getUnbondingResponsesFieldBuilder() {
      if (unbondingResponsesBuilder_ == null) {
        unbondingResponsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.staking.v1beta1.UnbondingDelegation, com.cosmos.staking.v1beta1.UnbondingDelegation.Builder, com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder>(
                unbondingResponses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        unbondingResponses_ = null;
      }
      return unbondingResponsesBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse)
  private static final com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse();
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegatorUnbondingDelegationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegatorUnbondingDelegationsResponse>() {
    @java.lang.Override
    public QueryDelegatorUnbondingDelegationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegatorUnbondingDelegationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegatorUnbondingDelegationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

