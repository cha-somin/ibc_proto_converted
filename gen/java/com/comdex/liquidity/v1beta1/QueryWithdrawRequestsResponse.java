// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/query.proto

package com.comdex.liquidity.v1beta1;

/**
 * <pre>
 * QueryWithdrawRequestsResponse is response type for the Query/WithdrawRequests RPC method.
 * </pre>
 *
 * Protobuf type {@code comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse}
 */
public final class QueryWithdrawRequestsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)
    QueryWithdrawRequestsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryWithdrawRequestsResponse.newBuilder() to construct.
  private QueryWithdrawRequestsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryWithdrawRequestsResponse() {
    withdrawRequests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryWithdrawRequestsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.class, com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.Builder.class);
  }

  public static final int WITHDRAW_REQUESTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.comdex.liquidity.v1beta1.WithdrawRequest> withdrawRequests_;
  /**
   * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.comdex.liquidity.v1beta1.WithdrawRequest> getWithdrawRequestsList() {
    return withdrawRequests_;
  }
  /**
   * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder> 
      getWithdrawRequestsOrBuilderList() {
    return withdrawRequests_;
  }
  /**
   * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getWithdrawRequestsCount() {
    return withdrawRequests_.size();
  }
  /**
   * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.comdex.liquidity.v1beta1.WithdrawRequest getWithdrawRequests(int index) {
    return withdrawRequests_.get(index);
  }
  /**
   * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder getWithdrawRequestsOrBuilder(
      int index) {
    return withdrawRequests_.get(index);
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
    for (int i = 0; i < withdrawRequests_.size(); i++) {
      output.writeMessage(1, withdrawRequests_.get(i));
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
    for (int i = 0; i < withdrawRequests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, withdrawRequests_.get(i));
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
    if (!(obj instanceof com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)) {
      return super.equals(obj);
    }
    com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse other = (com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse) obj;

    if (!getWithdrawRequestsList()
        .equals(other.getWithdrawRequestsList())) return false;
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
    if (getWithdrawRequestsCount() > 0) {
      hash = (37 * hash) + WITHDRAW_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getWithdrawRequestsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse prototype) {
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
   * QueryWithdrawRequestsResponse is response type for the Query/WithdrawRequests RPC method.
   * </pre>
   *
   * Protobuf type {@code comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)
      com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.class, com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.Builder.class);
    }

    // Construct using com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.newBuilder()
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
      if (withdrawRequestsBuilder_ == null) {
        withdrawRequests_ = java.util.Collections.emptyList();
      } else {
        withdrawRequests_ = null;
        withdrawRequestsBuilder_.clear();
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
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse getDefaultInstanceForType() {
      return com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse build() {
      com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse buildPartial() {
      com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse result = new com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse result) {
      if (withdrawRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          withdrawRequests_ = java.util.Collections.unmodifiableList(withdrawRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.withdrawRequests_ = withdrawRequests_;
      } else {
        result.withdrawRequests_ = withdrawRequestsBuilder_.build();
      }
    }

    private void buildPartial0(com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse) {
        return mergeFrom((com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse other) {
      if (other == com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse.getDefaultInstance()) return this;
      if (withdrawRequestsBuilder_ == null) {
        if (!other.withdrawRequests_.isEmpty()) {
          if (withdrawRequests_.isEmpty()) {
            withdrawRequests_ = other.withdrawRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWithdrawRequestsIsMutable();
            withdrawRequests_.addAll(other.withdrawRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.withdrawRequests_.isEmpty()) {
          if (withdrawRequestsBuilder_.isEmpty()) {
            withdrawRequestsBuilder_.dispose();
            withdrawRequestsBuilder_ = null;
            withdrawRequests_ = other.withdrawRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            withdrawRequestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWithdrawRequestsFieldBuilder() : null;
          } else {
            withdrawRequestsBuilder_.addAllMessages(other.withdrawRequests_);
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
              com.comdex.liquidity.v1beta1.WithdrawRequest m =
                  input.readMessage(
                      com.comdex.liquidity.v1beta1.WithdrawRequest.parser(),
                      extensionRegistry);
              if (withdrawRequestsBuilder_ == null) {
                ensureWithdrawRequestsIsMutable();
                withdrawRequests_.add(m);
              } else {
                withdrawRequestsBuilder_.addMessage(m);
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

    private java.util.List<com.comdex.liquidity.v1beta1.WithdrawRequest> withdrawRequests_ =
      java.util.Collections.emptyList();
    private void ensureWithdrawRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        withdrawRequests_ = new java.util.ArrayList<com.comdex.liquidity.v1beta1.WithdrawRequest>(withdrawRequests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.comdex.liquidity.v1beta1.WithdrawRequest, com.comdex.liquidity.v1beta1.WithdrawRequest.Builder, com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder> withdrawRequestsBuilder_;

    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.comdex.liquidity.v1beta1.WithdrawRequest> getWithdrawRequestsList() {
      if (withdrawRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(withdrawRequests_);
      } else {
        return withdrawRequestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public int getWithdrawRequestsCount() {
      if (withdrawRequestsBuilder_ == null) {
        return withdrawRequests_.size();
      } else {
        return withdrawRequestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.liquidity.v1beta1.WithdrawRequest getWithdrawRequests(int index) {
      if (withdrawRequestsBuilder_ == null) {
        return withdrawRequests_.get(index);
      } else {
        return withdrawRequestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder setWithdrawRequests(
        int index, com.comdex.liquidity.v1beta1.WithdrawRequest value) {
      if (withdrawRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.set(index, value);
        onChanged();
      } else {
        withdrawRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder setWithdrawRequests(
        int index, com.comdex.liquidity.v1beta1.WithdrawRequest.Builder builderForValue) {
      if (withdrawRequestsBuilder_ == null) {
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        withdrawRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawRequests(com.comdex.liquidity.v1beta1.WithdrawRequest value) {
      if (withdrawRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.add(value);
        onChanged();
      } else {
        withdrawRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawRequests(
        int index, com.comdex.liquidity.v1beta1.WithdrawRequest value) {
      if (withdrawRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.add(index, value);
        onChanged();
      } else {
        withdrawRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawRequests(
        com.comdex.liquidity.v1beta1.WithdrawRequest.Builder builderForValue) {
      if (withdrawRequestsBuilder_ == null) {
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.add(builderForValue.build());
        onChanged();
      } else {
        withdrawRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawRequests(
        int index, com.comdex.liquidity.v1beta1.WithdrawRequest.Builder builderForValue) {
      if (withdrawRequestsBuilder_ == null) {
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        withdrawRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllWithdrawRequests(
        java.lang.Iterable<? extends com.comdex.liquidity.v1beta1.WithdrawRequest> values) {
      if (withdrawRequestsBuilder_ == null) {
        ensureWithdrawRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, withdrawRequests_);
        onChanged();
      } else {
        withdrawRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearWithdrawRequests() {
      if (withdrawRequestsBuilder_ == null) {
        withdrawRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        withdrawRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeWithdrawRequests(int index) {
      if (withdrawRequestsBuilder_ == null) {
        ensureWithdrawRequestsIsMutable();
        withdrawRequests_.remove(index);
        onChanged();
      } else {
        withdrawRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.liquidity.v1beta1.WithdrawRequest.Builder getWithdrawRequestsBuilder(
        int index) {
      return getWithdrawRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder getWithdrawRequestsOrBuilder(
        int index) {
      if (withdrawRequestsBuilder_ == null) {
        return withdrawRequests_.get(index);  } else {
        return withdrawRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder> 
         getWithdrawRequestsOrBuilderList() {
      if (withdrawRequestsBuilder_ != null) {
        return withdrawRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(withdrawRequests_);
      }
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.liquidity.v1beta1.WithdrawRequest.Builder addWithdrawRequestsBuilder() {
      return getWithdrawRequestsFieldBuilder().addBuilder(
          com.comdex.liquidity.v1beta1.WithdrawRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.liquidity.v1beta1.WithdrawRequest.Builder addWithdrawRequestsBuilder(
        int index) {
      return getWithdrawRequestsFieldBuilder().addBuilder(
          index, com.comdex.liquidity.v1beta1.WithdrawRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .comdex.liquidity.v1beta1.WithdrawRequest withdraw_requests = 1 [json_name = "withdrawRequests", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.comdex.liquidity.v1beta1.WithdrawRequest.Builder> 
         getWithdrawRequestsBuilderList() {
      return getWithdrawRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.comdex.liquidity.v1beta1.WithdrawRequest, com.comdex.liquidity.v1beta1.WithdrawRequest.Builder, com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder> 
        getWithdrawRequestsFieldBuilder() {
      if (withdrawRequestsBuilder_ == null) {
        withdrawRequestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.comdex.liquidity.v1beta1.WithdrawRequest, com.comdex.liquidity.v1beta1.WithdrawRequest.Builder, com.comdex.liquidity.v1beta1.WithdrawRequestOrBuilder>(
                withdrawRequests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        withdrawRequests_ = null;
      }
      return withdrawRequestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse)
  private static final com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse();
  }

  public static com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWithdrawRequestsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryWithdrawRequestsResponse>() {
    @java.lang.Override
    public QueryWithdrawRequestsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryWithdrawRequestsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWithdrawRequestsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

