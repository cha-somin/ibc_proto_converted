// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/market/v1/query.proto

package com.em.market.v1;

/**
 * Protobuf type {@code em.market.v1.QueryByAccountResponse}
 */
public final class QueryByAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:em.market.v1.QueryByAccountResponse)
    QueryByAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryByAccountResponse.newBuilder() to construct.
  private QueryByAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryByAccountResponse() {
    orders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryByAccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.em.market.v1.QueryProto.internal_static_em_market_v1_QueryByAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.em.market.v1.QueryProto.internal_static_em_market_v1_QueryByAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.em.market.v1.QueryByAccountResponse.class, com.em.market.v1.QueryByAccountResponse.Builder.class);
  }

  public static final int ORDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.em.market.v1.Order> orders_;
  /**
   * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.em.market.v1.Order> getOrdersList() {
    return orders_;
  }
  /**
   * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.em.market.v1.OrderOrBuilder> 
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
   */
  @java.lang.Override
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
   */
  @java.lang.Override
  public com.em.market.v1.Order getOrders(int index) {
    return orders_.get(index);
  }
  /**
   * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
   */
  @java.lang.Override
  public com.em.market.v1.OrderOrBuilder getOrdersOrBuilder(
      int index) {
    return orders_.get(index);
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
    for (int i = 0; i < orders_.size(); i++) {
      output.writeMessage(1, orders_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orders_.get(i));
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
    if (!(obj instanceof com.em.market.v1.QueryByAccountResponse)) {
      return super.equals(obj);
    }
    com.em.market.v1.QueryByAccountResponse other = (com.em.market.v1.QueryByAccountResponse) obj;

    if (!getOrdersList()
        .equals(other.getOrdersList())) return false;
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
    if (getOrdersCount() > 0) {
      hash = (37 * hash) + ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getOrdersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.em.market.v1.QueryByAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.em.market.v1.QueryByAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.market.v1.QueryByAccountResponse parseFrom(
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
  public static Builder newBuilder(com.em.market.v1.QueryByAccountResponse prototype) {
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
   * Protobuf type {@code em.market.v1.QueryByAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:em.market.v1.QueryByAccountResponse)
      com.em.market.v1.QueryByAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.em.market.v1.QueryProto.internal_static_em_market_v1_QueryByAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.em.market.v1.QueryProto.internal_static_em_market_v1_QueryByAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.em.market.v1.QueryByAccountResponse.class, com.em.market.v1.QueryByAccountResponse.Builder.class);
    }

    // Construct using com.em.market.v1.QueryByAccountResponse.newBuilder()
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
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
      } else {
        orders_ = null;
        ordersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.em.market.v1.QueryProto.internal_static_em_market_v1_QueryByAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.em.market.v1.QueryByAccountResponse getDefaultInstanceForType() {
      return com.em.market.v1.QueryByAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.em.market.v1.QueryByAccountResponse build() {
      com.em.market.v1.QueryByAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.em.market.v1.QueryByAccountResponse buildPartial() {
      com.em.market.v1.QueryByAccountResponse result = new com.em.market.v1.QueryByAccountResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.em.market.v1.QueryByAccountResponse result) {
      if (ordersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orders_ = java.util.Collections.unmodifiableList(orders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orders_ = orders_;
      } else {
        result.orders_ = ordersBuilder_.build();
      }
    }

    private void buildPartial0(com.em.market.v1.QueryByAccountResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.em.market.v1.QueryByAccountResponse) {
        return mergeFrom((com.em.market.v1.QueryByAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.em.market.v1.QueryByAccountResponse other) {
      if (other == com.em.market.v1.QueryByAccountResponse.getDefaultInstance()) return this;
      if (ordersBuilder_ == null) {
        if (!other.orders_.isEmpty()) {
          if (orders_.isEmpty()) {
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrdersIsMutable();
            orders_.addAll(other.orders_);
          }
          onChanged();
        }
      } else {
        if (!other.orders_.isEmpty()) {
          if (ordersBuilder_.isEmpty()) {
            ordersBuilder_.dispose();
            ordersBuilder_ = null;
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ordersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrdersFieldBuilder() : null;
          } else {
            ordersBuilder_.addAllMessages(other.orders_);
          }
        }
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
              com.em.market.v1.Order m =
                  input.readMessage(
                      com.em.market.v1.Order.parser(),
                      extensionRegistry);
              if (ordersBuilder_ == null) {
                ensureOrdersIsMutable();
                orders_.add(m);
              } else {
                ordersBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.em.market.v1.Order> orders_ =
      java.util.Collections.emptyList();
    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orders_ = new java.util.ArrayList<com.em.market.v1.Order>(orders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.em.market.v1.Order, com.em.market.v1.Order.Builder, com.em.market.v1.OrderOrBuilder> ordersBuilder_;

    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public java.util.List<com.em.market.v1.Order> getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public com.em.market.v1.Order getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder setOrders(
        int index, com.em.market.v1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.set(index, value);
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder setOrders(
        int index, com.em.market.v1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.set(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder addOrders(com.em.market.v1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder addOrders(
        int index, com.em.market.v1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(index, value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder addOrders(
        com.em.market.v1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder addOrders(
        int index, com.em.market.v1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends com.em.market.v1.Order> values) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orders_);
        onChanged();
      } else {
        ordersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder clearOrders() {
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public Builder removeOrders(int index) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.remove(index);
        onChanged();
      } else {
        ordersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public com.em.market.v1.Order.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public com.em.market.v1.OrderOrBuilder getOrdersOrBuilder(
        int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);  } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public java.util.List<? extends com.em.market.v1.OrderOrBuilder> 
         getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public com.em.market.v1.Order.Builder addOrdersBuilder() {
      return getOrdersFieldBuilder().addBuilder(
          com.em.market.v1.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public com.em.market.v1.Order.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().addBuilder(
          index, com.em.market.v1.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .em.market.v1.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = true, (.gogoproto.moretags) = "yaml:&#92;"orders&#92;""];</code>
     */
    public java.util.List<com.em.market.v1.Order.Builder> 
         getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.em.market.v1.Order, com.em.market.v1.Order.Builder, com.em.market.v1.OrderOrBuilder> 
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.em.market.v1.Order, com.em.market.v1.Order.Builder, com.em.market.v1.OrderOrBuilder>(
                orders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        orders_ = null;
      }
      return ordersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:em.market.v1.QueryByAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:em.market.v1.QueryByAccountResponse)
  private static final com.em.market.v1.QueryByAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.em.market.v1.QueryByAccountResponse();
  }

  public static com.em.market.v1.QueryByAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryByAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryByAccountResponse>() {
    @java.lang.Override
    public QueryByAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryByAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryByAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.em.market.v1.QueryByAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

