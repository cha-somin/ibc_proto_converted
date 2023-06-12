// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/querier.proto

package com.sentinel.subscription.v2;

/**
 * Protobuf type {@code sentinel.subscription.v2.QuerySubscriptionsForNodeResponse}
 */
public final class QuerySubscriptionsForNodeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)
    QuerySubscriptionsForNodeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubscriptionsForNodeResponse.newBuilder() to construct.
  private QuerySubscriptionsForNodeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubscriptionsForNodeResponse() {
    subscriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySubscriptionsForNodeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.subscription.v2.QuerierProto.internal_static_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.subscription.v2.QuerierProto.internal_static_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.class, com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.Builder.class);
  }

  public static final int SUBSCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Any> subscriptions_;
  /**
   * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getSubscriptionsList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getSubscriptionsOrBuilderList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public int getSubscriptionsCount() {
    return subscriptions_.size();
  }
  /**
   * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getSubscriptions(int index) {
    return subscriptions_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSubscriptionsOrBuilder(
      int index) {
    return subscriptions_.get(index);
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
    for (int i = 0; i < subscriptions_.size(); i++) {
      output.writeMessage(1, subscriptions_.get(i));
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
    for (int i = 0; i < subscriptions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subscriptions_.get(i));
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
    if (!(obj instanceof com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)) {
      return super.equals(obj);
    }
    com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse other = (com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse) obj;

    if (!getSubscriptionsList()
        .equals(other.getSubscriptionsList())) return false;
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
    if (getSubscriptionsCount() > 0) {
      hash = (37 * hash) + SUBSCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse parseFrom(
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
  public static Builder newBuilder(com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse prototype) {
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
   * Protobuf type {@code sentinel.subscription.v2.QuerySubscriptionsForNodeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)
      com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.subscription.v2.QuerierProto.internal_static_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.subscription.v2.QuerierProto.internal_static_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.class, com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.Builder.class);
    }

    // Construct using com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.newBuilder()
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
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
      } else {
        subscriptions_ = null;
        subscriptionsBuilder_.clear();
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
      return com.sentinel.subscription.v2.QuerierProto.internal_static_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse_descriptor;
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse getDefaultInstanceForType() {
      return com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse build() {
      com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse buildPartial() {
      com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse result = new com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse result) {
      if (subscriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subscriptions_ = java.util.Collections.unmodifiableList(subscriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subscriptions_ = subscriptions_;
      } else {
        result.subscriptions_ = subscriptionsBuilder_.build();
      }
    }

    private void buildPartial0(com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse) {
        return mergeFrom((com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse other) {
      if (other == com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.getDefaultInstance()) return this;
      if (subscriptionsBuilder_ == null) {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptions_.isEmpty()) {
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubscriptionsIsMutable();
            subscriptions_.addAll(other.subscriptions_);
          }
          onChanged();
        }
      } else {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptionsBuilder_.isEmpty()) {
            subscriptionsBuilder_.dispose();
            subscriptionsBuilder_ = null;
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subscriptionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubscriptionsFieldBuilder() : null;
          } else {
            subscriptionsBuilder_.addAllMessages(other.subscriptions_);
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
              com.google.protobuf.Any m =
                  input.readMessage(
                      com.google.protobuf.Any.parser(),
                      extensionRegistry);
              if (subscriptionsBuilder_ == null) {
                ensureSubscriptionsIsMutable();
                subscriptions_.add(m);
              } else {
                subscriptionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.protobuf.Any> subscriptions_ =
      java.util.Collections.emptyList();
    private void ensureSubscriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = new java.util.ArrayList<com.google.protobuf.Any>(subscriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> subscriptionsBuilder_;

    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.google.protobuf.Any> getSubscriptionsList() {
      if (subscriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subscriptions_);
      } else {
        return subscriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public int getSubscriptionsCount() {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.size();
      } else {
        return subscriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.google.protobuf.Any getSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);
      } else {
        return subscriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.google.protobuf.Any value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(com.google.protobuf.Any value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.google.protobuf.Any value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        com.google.protobuf.Any.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addAllSubscriptions(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subscriptions_);
        onChanged();
      } else {
        subscriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder clearSubscriptions() {
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subscriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder removeSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.remove(index);
        onChanged();
      } else {
        subscriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.google.protobuf.Any.Builder getSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getSubscriptionsOrBuilder(
        int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);  } else {
        return subscriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getSubscriptionsOrBuilderList() {
      if (subscriptionsBuilder_ != null) {
        return subscriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subscriptions_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.google.protobuf.Any.Builder addSubscriptionsBuilder() {
      return getSubscriptionsFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.google.protobuf.Any.Builder addSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getSubscriptionsBuilderList() {
      return getSubscriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getSubscriptionsFieldBuilder() {
      if (subscriptionsBuilder_ == null) {
        subscriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                subscriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subscriptions_ = null;
      }
      return subscriptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)
  }

  // @@protoc_insertion_point(class_scope:sentinel.subscription.v2.QuerySubscriptionsForNodeResponse)
  private static final com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse();
  }

  public static com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubscriptionsForNodeResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubscriptionsForNodeResponse>() {
    @java.lang.Override
    public QuerySubscriptionsForNodeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySubscriptionsForNodeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubscriptionsForNodeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

