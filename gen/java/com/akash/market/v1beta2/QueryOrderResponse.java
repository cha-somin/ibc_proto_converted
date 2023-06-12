// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/query.proto

package com.akash.market.v1beta2;

/**
 * <pre>
 * QueryOrderResponse is response type for the Query/Order RPC method
 * </pre>
 *
 * Protobuf type {@code akash.market.v1beta2.QueryOrderResponse}
 */
public final class QueryOrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.market.v1beta2.QueryOrderResponse)
    QueryOrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOrderResponse.newBuilder() to construct.
  private QueryOrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOrderResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOrderResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryOrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryOrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.market.v1beta2.QueryOrderResponse.class, com.akash.market.v1beta2.QueryOrderResponse.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private com.akash.market.v1beta2.Order order_;
  /**
   * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
   * @return Whether the order field is set.
   */
  @java.lang.Override
  public boolean hasOrder() {
    return order_ != null;
  }
  /**
   * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
   * @return The order.
   */
  @java.lang.Override
  public com.akash.market.v1beta2.Order getOrder() {
    return order_ == null ? com.akash.market.v1beta2.Order.getDefaultInstance() : order_;
  }
  /**
   * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.akash.market.v1beta2.OrderOrBuilder getOrderOrBuilder() {
    return order_ == null ? com.akash.market.v1beta2.Order.getDefaultInstance() : order_;
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
    if (order_ != null) {
      output.writeMessage(1, getOrder());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (order_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrder());
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
    if (!(obj instanceof com.akash.market.v1beta2.QueryOrderResponse)) {
      return super.equals(obj);
    }
    com.akash.market.v1beta2.QueryOrderResponse other = (com.akash.market.v1beta2.QueryOrderResponse) obj;

    if (hasOrder() != other.hasOrder()) return false;
    if (hasOrder()) {
      if (!getOrder()
          .equals(other.getOrder())) return false;
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
    if (hasOrder()) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrder().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.market.v1beta2.QueryOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.market.v1beta2.QueryOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.QueryOrderResponse parseFrom(
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
  public static Builder newBuilder(com.akash.market.v1beta2.QueryOrderResponse prototype) {
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
   * QueryOrderResponse is response type for the Query/Order RPC method
   * </pre>
   *
   * Protobuf type {@code akash.market.v1beta2.QueryOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.market.v1beta2.QueryOrderResponse)
      com.akash.market.v1beta2.QueryOrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryOrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryOrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.market.v1beta2.QueryOrderResponse.class, com.akash.market.v1beta2.QueryOrderResponse.Builder.class);
    }

    // Construct using com.akash.market.v1beta2.QueryOrderResponse.newBuilder()
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
      order_ = null;
      if (orderBuilder_ != null) {
        orderBuilder_.dispose();
        orderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryOrderResponse_descriptor;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryOrderResponse getDefaultInstanceForType() {
      return com.akash.market.v1beta2.QueryOrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryOrderResponse build() {
      com.akash.market.v1beta2.QueryOrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryOrderResponse buildPartial() {
      com.akash.market.v1beta2.QueryOrderResponse result = new com.akash.market.v1beta2.QueryOrderResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.market.v1beta2.QueryOrderResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.order_ = orderBuilder_ == null
            ? order_
            : orderBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.market.v1beta2.QueryOrderResponse) {
        return mergeFrom((com.akash.market.v1beta2.QueryOrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.market.v1beta2.QueryOrderResponse other) {
      if (other == com.akash.market.v1beta2.QueryOrderResponse.getDefaultInstance()) return this;
      if (other.hasOrder()) {
        mergeOrder(other.getOrder());
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
              input.readMessage(
                  getOrderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.akash.market.v1beta2.Order order_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta2.Order, com.akash.market.v1beta2.Order.Builder, com.akash.market.v1beta2.OrderOrBuilder> orderBuilder_;
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     * @return Whether the order field is set.
     */
    public boolean hasOrder() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     * @return The order.
     */
    public com.akash.market.v1beta2.Order getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? com.akash.market.v1beta2.Order.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOrder(com.akash.market.v1beta2.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
      } else {
        orderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOrder(
        com.akash.market.v1beta2.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeOrder(com.akash.market.v1beta2.Order value) {
      if (orderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          order_ != null &&
          order_ != com.akash.market.v1beta2.Order.getDefaultInstance()) {
          getOrderBuilder().mergeFrom(value);
        } else {
          order_ = value;
        }
      } else {
        orderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearOrder() {
      bitField0_ = (bitField0_ & ~0x00000001);
      order_ = null;
      if (orderBuilder_ != null) {
        orderBuilder_.dispose();
        orderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.Order.Builder getOrderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.OrderOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            com.akash.market.v1beta2.Order.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.akash.market.v1beta2.Order order = 1 [json_name = "order", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta2.Order, com.akash.market.v1beta2.Order.Builder, com.akash.market.v1beta2.OrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.market.v1beta2.Order, com.akash.market.v1beta2.Order.Builder, com.akash.market.v1beta2.OrderOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.market.v1beta2.QueryOrderResponse)
  }

  // @@protoc_insertion_point(class_scope:akash.market.v1beta2.QueryOrderResponse)
  private static final com.akash.market.v1beta2.QueryOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.market.v1beta2.QueryOrderResponse();
  }

  public static com.akash.market.v1beta2.QueryOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryOrderResponse>() {
    @java.lang.Override
    public QueryOrderResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryOrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.market.v1beta2.QueryOrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

