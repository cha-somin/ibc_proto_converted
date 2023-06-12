// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QuerySpotOrdersByHashesResponse is the response type for the
 * Query/SpotOrdersByHashes RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse}
 */
public final class QuerySpotOrdersByHashesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)
    QuerySpotOrdersByHashesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySpotOrdersByHashesResponse.newBuilder() to construct.
  private QuerySpotOrdersByHashesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySpotOrdersByHashesResponse() {
    orders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySpotOrdersByHashesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.class, com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.Builder.class);
  }

  public static final int ORDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> orders_;
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> getOrdersList() {
    return orders_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder> 
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.TrimmedSpotLimitOrder getOrders(int index) {
    return orders_.get(index);
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder getOrdersOrBuilder(
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse other = (com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse) obj;

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

  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse prototype) {
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
   * QuerySpotOrdersByHashesResponse is the response type for the
   * Query/SpotOrdersByHashes RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)
      com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.class, com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.newBuilder()
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
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse build() {
      com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse buildPartial() {
      com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse result = new com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse result) {
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

    private void buildPartial0(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse) {
        return mergeFrom((com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse other) {
      if (other == com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.getDefaultInstance()) return this;
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
              com.injective.exchange.v1beta1.TrimmedSpotLimitOrder m =
                  input.readMessage(
                      com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.parser(),
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

    private java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> orders_ =
      java.util.Collections.emptyList();
    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orders_ = new java.util.ArrayList<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder>(orders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.TrimmedSpotLimitOrder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder> ordersBuilder_;

    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public com.injective.exchange.v1beta1.TrimmedSpotLimitOrder getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder setOrders(
        int index, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder value) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder setOrders(
        int index, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder builderForValue) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(com.injective.exchange.v1beta1.TrimmedSpotLimitOrder value) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        int index, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder value) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder builderForValue) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder addOrders(
        int index, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder builderForValue) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> values) {
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
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
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder getOrdersOrBuilder(
        int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);  } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<? extends com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder> 
         getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder addOrdersBuilder() {
      return getOrdersFieldBuilder().addBuilder(
          com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().addBuilder(
          index, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder> 
         getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.TrimmedSpotLimitOrder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder> 
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.injective.exchange.v1beta1.TrimmedSpotLimitOrder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrder.Builder, com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)
  private static final com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse();
  }

  public static com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySpotOrdersByHashesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySpotOrdersByHashesResponse>() {
    @java.lang.Override
    public QuerySpotOrdersByHashesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySpotOrdersByHashesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySpotOrdersByHashesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

