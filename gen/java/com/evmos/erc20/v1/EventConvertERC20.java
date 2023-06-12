// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/events.proto

package com.evmos.erc20.v1;

/**
 * <pre>
 * EventConvertERC20 is an event emitted when an ERC20 is converted.
 * </pre>
 *
 * Protobuf type {@code evmos.erc20.v1.EventConvertERC20}
 */
public final class EventConvertERC20 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.erc20.v1.EventConvertERC20)
    EventConvertERC20OrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventConvertERC20.newBuilder() to construct.
  private EventConvertERC20(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventConvertERC20() {
    sender_ = "";
    receiver_ = "";
    amount_ = "";
    denom_ = "";
    contractAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventConvertERC20();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.erc20.v1.EventsProto.internal_static_evmos_erc20_v1_EventConvertERC20_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.erc20.v1.EventsProto.internal_static_evmos_erc20_v1_EventConvertERC20_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.erc20.v1.EventConvertERC20.class, com.evmos.erc20.v1.EventConvertERC20.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <pre>
   * sender is the sender's address.
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * sender is the sender's address.
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object receiver_ = "";
  /**
   * <pre>
   * receiver is the receiver's address.
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The receiver.
   */
  @java.lang.Override
  public java.lang.String getReceiver() {
    java.lang.Object ref = receiver_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiver_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * receiver is the receiver's address.
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The bytes for receiver.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiverBytes() {
    java.lang.Object ref = receiver_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiver_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <pre>
   * amount is the amount of coins to be converted.
   * </pre>
   *
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * amount is the amount of coins to be converted.
   * </pre>
   *
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <pre>
   * denom is the coin's denomination.
   * </pre>
   *
   * <code>string denom = 4 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * denom is the coin's denomination.
   * </pre>
   *
   * <code>string denom = 4 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractAddress_ = "";
  /**
   * <pre>
   * contract_address of an ERC20 token contract, that is registered in a token pair
   * </pre>
   *
   * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  @java.lang.Override
  public java.lang.String getContractAddress() {
    java.lang.Object ref = contractAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contractAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * contract_address of an ERC20 token contract, that is registered in a token pair
   * </pre>
   *
   * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractAddressBytes() {
    java.lang.Object ref = contractAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contractAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiver_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiver_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, contractAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiver_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiver_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, contractAddress_);
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
    if (!(obj instanceof com.evmos.erc20.v1.EventConvertERC20)) {
      return super.equals(obj);
    }
    com.evmos.erc20.v1.EventConvertERC20 other = (com.evmos.erc20.v1.EventConvertERC20) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getReceiver()
        .equals(other.getReceiver())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getContractAddress()
        .equals(other.getContractAddress())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
    hash = (53 * hash) + getReceiver().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + CONTRACT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getContractAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.erc20.v1.EventConvertERC20 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.erc20.v1.EventConvertERC20 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.EventConvertERC20 parseFrom(
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
  public static Builder newBuilder(com.evmos.erc20.v1.EventConvertERC20 prototype) {
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
   * EventConvertERC20 is an event emitted when an ERC20 is converted.
   * </pre>
   *
   * Protobuf type {@code evmos.erc20.v1.EventConvertERC20}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.erc20.v1.EventConvertERC20)
      com.evmos.erc20.v1.EventConvertERC20OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.erc20.v1.EventsProto.internal_static_evmos_erc20_v1_EventConvertERC20_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.erc20.v1.EventsProto.internal_static_evmos_erc20_v1_EventConvertERC20_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.erc20.v1.EventConvertERC20.class, com.evmos.erc20.v1.EventConvertERC20.Builder.class);
    }

    // Construct using com.evmos.erc20.v1.EventConvertERC20.newBuilder()
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
      sender_ = "";
      receiver_ = "";
      amount_ = "";
      denom_ = "";
      contractAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.erc20.v1.EventsProto.internal_static_evmos_erc20_v1_EventConvertERC20_descriptor;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.EventConvertERC20 getDefaultInstanceForType() {
      return com.evmos.erc20.v1.EventConvertERC20.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.erc20.v1.EventConvertERC20 build() {
      com.evmos.erc20.v1.EventConvertERC20 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.EventConvertERC20 buildPartial() {
      com.evmos.erc20.v1.EventConvertERC20 result = new com.evmos.erc20.v1.EventConvertERC20(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.erc20.v1.EventConvertERC20 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.receiver_ = receiver_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.contractAddress_ = contractAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.erc20.v1.EventConvertERC20) {
        return mergeFrom((com.evmos.erc20.v1.EventConvertERC20)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.erc20.v1.EventConvertERC20 other) {
      if (other == com.evmos.erc20.v1.EventConvertERC20.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getReceiver().isEmpty()) {
        receiver_ = other.receiver_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getContractAddress().isEmpty()) {
        contractAddress_ = other.contractAddress_;
        bitField0_ |= 0x00000010;
        onChanged();
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
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              receiver_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              contractAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object sender_ = "";
    /**
     * <pre>
     * sender is the sender's address.
     * </pre>
     *
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * sender is the sender's address.
     * </pre>
     *
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * sender is the sender's address.
     * </pre>
     *
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sender is the sender's address.
     * </pre>
     *
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sender is the sender's address.
     * </pre>
     *
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object receiver_ = "";
    /**
     * <pre>
     * receiver is the receiver's address.
     * </pre>
     *
     * <code>string receiver = 2 [json_name = "receiver"];</code>
     * @return The receiver.
     */
    public java.lang.String getReceiver() {
      java.lang.Object ref = receiver_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * receiver is the receiver's address.
     * </pre>
     *
     * <code>string receiver = 2 [json_name = "receiver"];</code>
     * @return The bytes for receiver.
     */
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      java.lang.Object ref = receiver_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * receiver is the receiver's address.
     * </pre>
     *
     * <code>string receiver = 2 [json_name = "receiver"];</code>
     * @param value The receiver to set.
     * @return This builder for chaining.
     */
    public Builder setReceiver(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      receiver_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * receiver is the receiver's address.
     * </pre>
     *
     * <code>string receiver = 2 [json_name = "receiver"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiver() {
      receiver_ = getDefaultInstance().getReceiver();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * receiver is the receiver's address.
     * </pre>
     *
     * <code>string receiver = 2 [json_name = "receiver"];</code>
     * @param value The bytes for receiver to set.
     * @return This builder for chaining.
     */
    public Builder setReceiverBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      receiver_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <pre>
     * amount is the amount of coins to be converted.
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * amount is the amount of coins to be converted.
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * amount is the amount of coins to be converted.
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount is the amount of coins to be converted.
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount is the amount of coins to be converted.
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <pre>
     * denom is the coin's denomination.
     * </pre>
     *
     * <code>string denom = 4 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * denom is the coin's denomination.
     * </pre>
     *
     * <code>string denom = 4 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * denom is the coin's denomination.
     * </pre>
     *
     * <code>string denom = 4 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the coin's denomination.
     * </pre>
     *
     * <code>string denom = 4 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the coin's denomination.
     * </pre>
     *
     * <code>string denom = 4 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object contractAddress_ = "";
    /**
     * <pre>
     * contract_address of an ERC20 token contract, that is registered in a token pair
     * </pre>
     *
     * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
     * @return The contractAddress.
     */
    public java.lang.String getContractAddress() {
      java.lang.Object ref = contractAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contractAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * contract_address of an ERC20 token contract, that is registered in a token pair
     * </pre>
     *
     * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
     * @return The bytes for contractAddress.
     */
    public com.google.protobuf.ByteString
        getContractAddressBytes() {
      java.lang.Object ref = contractAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contractAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * contract_address of an ERC20 token contract, that is registered in a token pair
     * </pre>
     *
     * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
     * @param value The contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractAddress_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_address of an ERC20 token contract, that is registered in a token pair
     * </pre>
     *
     * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractAddress() {
      contractAddress_ = getDefaultInstance().getContractAddress();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_address of an ERC20 token contract, that is registered in a token pair
     * </pre>
     *
     * <code>string contract_address = 5 [json_name = "contractAddress"];</code>
     * @param value The bytes for contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractAddress_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:evmos.erc20.v1.EventConvertERC20)
  }

  // @@protoc_insertion_point(class_scope:evmos.erc20.v1.EventConvertERC20)
  private static final com.evmos.erc20.v1.EventConvertERC20 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.erc20.v1.EventConvertERC20();
  }

  public static com.evmos.erc20.v1.EventConvertERC20 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventConvertERC20>
      PARSER = new com.google.protobuf.AbstractParser<EventConvertERC20>() {
    @java.lang.Override
    public EventConvertERC20 parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventConvertERC20> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventConvertERC20> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.erc20.v1.EventConvertERC20 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

