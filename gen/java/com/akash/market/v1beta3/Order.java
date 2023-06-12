// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta3/order.proto

package com.akash.market.v1beta3;

/**
 * <pre>
 * Order stores orderID, state of order and other details
 * </pre>
 *
 * Protobuf type {@code akash.market.v1beta3.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.market.v1beta3.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.market.v1beta3.OrderProto.internal_static_akash_market_v1beta3_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.market.v1beta3.OrderProto.internal_static_akash_market_v1beta3_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.market.v1beta3.Order.class, com.akash.market.v1beta3.Order.Builder.class);
  }

  /**
   * <pre>
   * State is an enum which refers to state of order
   * </pre>
   *
   * Protobuf enum {@code akash.market.v1beta3.Order.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Prefix should start with 0 in enum. So declaring dummy state
     * </pre>
     *
     * <code>invalid = 0 [(.gogoproto.enumvalue_customname) = "OrderStateInvalid"];</code>
     */
    invalid(0),
    /**
     * <pre>
     * OrderOpen denotes state for order open
     * </pre>
     *
     * <code>open = 1 [(.gogoproto.enumvalue_customname) = "OrderOpen"];</code>
     */
    open(1),
    /**
     * <pre>
     * OrderMatched denotes state for order matched
     * </pre>
     *
     * <code>active = 2 [(.gogoproto.enumvalue_customname) = "OrderActive"];</code>
     */
    active(2),
    /**
     * <pre>
     * OrderClosed denotes state for order lost
     * </pre>
     *
     * <code>closed = 3 [(.gogoproto.enumvalue_customname) = "OrderClosed"];</code>
     */
    closed(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Prefix should start with 0 in enum. So declaring dummy state
     * </pre>
     *
     * <code>invalid = 0 [(.gogoproto.enumvalue_customname) = "OrderStateInvalid"];</code>
     */
    public static final int invalid_VALUE = 0;
    /**
     * <pre>
     * OrderOpen denotes state for order open
     * </pre>
     *
     * <code>open = 1 [(.gogoproto.enumvalue_customname) = "OrderOpen"];</code>
     */
    public static final int open_VALUE = 1;
    /**
     * <pre>
     * OrderMatched denotes state for order matched
     * </pre>
     *
     * <code>active = 2 [(.gogoproto.enumvalue_customname) = "OrderActive"];</code>
     */
    public static final int active_VALUE = 2;
    /**
     * <pre>
     * OrderClosed denotes state for order lost
     * </pre>
     *
     * <code>closed = 3 [(.gogoproto.enumvalue_customname) = "OrderClosed"];</code>
     */
    public static final int closed_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return invalid;
        case 1: return open;
        case 2: return active;
        case 3: return closed;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akash.market.v1beta3.Order.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:akash.market.v1beta3.Order.State)
  }

  public static final int ORDER_ID_FIELD_NUMBER = 1;
  private com.akash.market.v1beta3.OrderID orderId_;
  /**
   * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return Whether the orderId field is set.
   */
  @java.lang.Override
  public boolean hasOrderId() {
    return orderId_ != null;
  }
  /**
   * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The orderId.
   */
  @java.lang.Override
  public com.akash.market.v1beta3.OrderID getOrderId() {
    return orderId_ == null ? com.akash.market.v1beta3.OrderID.getDefaultInstance() : orderId_;
  }
  /**
   * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.market.v1beta3.OrderIDOrBuilder getOrderIdOrBuilder() {
    return orderId_ == null ? com.akash.market.v1beta3.OrderID.getDefaultInstance() : orderId_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The state.
   */
  @java.lang.Override public com.akash.market.v1beta3.Order.State getState() {
    com.akash.market.v1beta3.Order.State result = com.akash.market.v1beta3.Order.State.forNumber(state_);
    return result == null ? com.akash.market.v1beta3.Order.State.UNRECOGNIZED : result;
  }

  public static final int SPEC_FIELD_NUMBER = 3;
  private com.akash.deployment.v1beta3.GroupSpec spec_;
  /**
   * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   * @return The spec.
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.GroupSpec getSpec() {
    return spec_ == null ? com.akash.deployment.v1beta3.GroupSpec.getDefaultInstance() : spec_;
  }
  /**
   * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.GroupSpecOrBuilder getSpecOrBuilder() {
    return spec_ == null ? com.akash.deployment.v1beta3.GroupSpec.getDefaultInstance() : spec_;
  }

  public static final int CREATED_AT_FIELD_NUMBER = 4;
  private long createdAt_ = 0L;
  /**
   * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public long getCreatedAt() {
    return createdAt_;
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
    if (orderId_ != null) {
      output.writeMessage(1, getOrderId());
    }
    if (state_ != com.akash.market.v1beta3.Order.State.invalid.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (spec_ != null) {
      output.writeMessage(3, getSpec());
    }
    if (createdAt_ != 0L) {
      output.writeInt64(4, createdAt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrderId());
    }
    if (state_ != com.akash.market.v1beta3.Order.State.invalid.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSpec());
    }
    if (createdAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, createdAt_);
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
    if (!(obj instanceof com.akash.market.v1beta3.Order)) {
      return super.equals(obj);
    }
    com.akash.market.v1beta3.Order other = (com.akash.market.v1beta3.Order) obj;

    if (hasOrderId() != other.hasOrderId()) return false;
    if (hasOrderId()) {
      if (!getOrderId()
          .equals(other.getOrderId())) return false;
    }
    if (state_ != other.state_) return false;
    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (getCreatedAt()
        != other.getCreatedAt()) return false;
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
    if (hasOrderId()) {
      hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOrderId().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatedAt());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.market.v1beta3.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.market.v1beta3.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.market.v1beta3.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta3.Order parseFrom(
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
  public static Builder newBuilder(com.akash.market.v1beta3.Order prototype) {
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
   * Order stores orderID, state of order and other details
   * </pre>
   *
   * Protobuf type {@code akash.market.v1beta3.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.market.v1beta3.Order)
      com.akash.market.v1beta3.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.market.v1beta3.OrderProto.internal_static_akash_market_v1beta3_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.market.v1beta3.OrderProto.internal_static_akash_market_v1beta3_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.market.v1beta3.Order.class, com.akash.market.v1beta3.Order.Builder.class);
    }

    // Construct using com.akash.market.v1beta3.Order.newBuilder()
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
      orderId_ = null;
      if (orderIdBuilder_ != null) {
        orderIdBuilder_.dispose();
        orderIdBuilder_ = null;
      }
      state_ = 0;
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      createdAt_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.market.v1beta3.OrderProto.internal_static_akash_market_v1beta3_Order_descriptor;
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Order getDefaultInstanceForType() {
      return com.akash.market.v1beta3.Order.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Order build() {
      com.akash.market.v1beta3.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Order buildPartial() {
      com.akash.market.v1beta3.Order result = new com.akash.market.v1beta3.Order(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.market.v1beta3.Order result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orderId_ = orderIdBuilder_ == null
            ? orderId_
            : orderIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.spec_ = specBuilder_ == null
            ? spec_
            : specBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.createdAt_ = createdAt_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.market.v1beta3.Order) {
        return mergeFrom((com.akash.market.v1beta3.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.market.v1beta3.Order other) {
      if (other == com.akash.market.v1beta3.Order.getDefaultInstance()) return this;
      if (other.hasOrderId()) {
        mergeOrderId(other.getOrderId());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.getCreatedAt() != 0L) {
        setCreatedAt(other.getCreatedAt());
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
                  getOrderIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getSpecFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              createdAt_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.akash.market.v1beta3.OrderID orderId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta3.OrderID, com.akash.market.v1beta3.OrderID.Builder, com.akash.market.v1beta3.OrderIDOrBuilder> orderIdBuilder_;
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return Whether the orderId field is set.
     */
    public boolean hasOrderId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return The orderId.
     */
    public com.akash.market.v1beta3.OrderID getOrderId() {
      if (orderIdBuilder_ == null) {
        return orderId_ == null ? com.akash.market.v1beta3.OrderID.getDefaultInstance() : orderId_;
      } else {
        return orderIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setOrderId(com.akash.market.v1beta3.OrderID value) {
      if (orderIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orderId_ = value;
      } else {
        orderIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setOrderId(
        com.akash.market.v1beta3.OrderID.Builder builderForValue) {
      if (orderIdBuilder_ == null) {
        orderId_ = builderForValue.build();
      } else {
        orderIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder mergeOrderId(com.akash.market.v1beta3.OrderID value) {
      if (orderIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          orderId_ != null &&
          orderId_ != com.akash.market.v1beta3.OrderID.getDefaultInstance()) {
          getOrderIdBuilder().mergeFrom(value);
        } else {
          orderId_ = value;
        }
      } else {
        orderIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder clearOrderId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      orderId_ = null;
      if (orderIdBuilder_ != null) {
        orderIdBuilder_.dispose();
        orderIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.market.v1beta3.OrderID.Builder getOrderIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrderIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.market.v1beta3.OrderIDOrBuilder getOrderIdOrBuilder() {
      if (orderIdBuilder_ != null) {
        return orderIdBuilder_.getMessageOrBuilder();
      } else {
        return orderId_ == null ?
            com.akash.market.v1beta3.OrderID.getDefaultInstance() : orderId_;
      }
    }
    /**
     * <code>.akash.market.v1beta3.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta3.OrderID, com.akash.market.v1beta3.OrderID.Builder, com.akash.market.v1beta3.OrderIDOrBuilder> 
        getOrderIdFieldBuilder() {
      if (orderIdBuilder_ == null) {
        orderIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.market.v1beta3.OrderID, com.akash.market.v1beta3.OrderID.Builder, com.akash.market.v1beta3.OrderIDOrBuilder>(
                getOrderId(),
                getParentForChildren(),
                isClean());
        orderId_ = null;
      }
      return orderIdBuilder_;
    }

    private int state_ = 0;
    /**
     * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.akash.market.v1beta3.Order.State getState() {
      com.akash.market.v1beta3.Order.State result = com.akash.market.v1beta3.Order.State.forNumber(state_);
      return result == null ? com.akash.market.v1beta3.Order.State.UNRECOGNIZED : result;
    }
    /**
     * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.akash.market.v1beta3.Order.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta3.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private com.akash.deployment.v1beta3.GroupSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.GroupSpec, com.akash.deployment.v1beta3.GroupSpec.Builder, com.akash.deployment.v1beta3.GroupSpecOrBuilder> specBuilder_;
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     * @return The spec.
     */
    public com.akash.deployment.v1beta3.GroupSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? com.akash.deployment.v1beta3.GroupSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public Builder setSpec(com.akash.deployment.v1beta3.GroupSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
      } else {
        specBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public Builder setSpec(
        com.akash.deployment.v1beta3.GroupSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public Builder mergeSpec(com.akash.deployment.v1beta3.GroupSpec value) {
      if (specBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          spec_ != null &&
          spec_ != com.akash.deployment.v1beta3.GroupSpec.getDefaultInstance()) {
          getSpecBuilder().mergeFrom(value);
        } else {
          spec_ = value;
        }
      } else {
        specBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public Builder clearSpec() {
      bitField0_ = (bitField0_ & ~0x00000004);
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.GroupSpec.Builder getSpecBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.GroupSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            com.akash.deployment.v1beta3.GroupSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.GroupSpec, com.akash.deployment.v1beta3.GroupSpec.Builder, com.akash.deployment.v1beta3.GroupSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.deployment.v1beta3.GroupSpec, com.akash.deployment.v1beta3.GroupSpec.Builder, com.akash.deployment.v1beta3.GroupSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private long createdAt_ ;
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @return The createdAt.
     */
    @java.lang.Override
    public long getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @param value The createdAt to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedAt(long value) {

      createdAt_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedAt() {
      bitField0_ = (bitField0_ & ~0x00000008);
      createdAt_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:akash.market.v1beta3.Order)
  }

  // @@protoc_insertion_point(class_scope:akash.market.v1beta3.Order)
  private static final com.akash.market.v1beta3.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.market.v1beta3.Order();
  }

  public static com.akash.market.v1beta3.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
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

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.market.v1beta3.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

