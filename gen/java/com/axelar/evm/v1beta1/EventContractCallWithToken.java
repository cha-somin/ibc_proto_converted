// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/types.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf type {@code axelar.evm.v1beta1.EventContractCallWithToken}
 */
public final class EventContractCallWithToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.EventContractCallWithToken)
    EventContractCallWithTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventContractCallWithToken.newBuilder() to construct.
  private EventContractCallWithToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventContractCallWithToken() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    destinationChain_ = "";
    contractAddress_ = "";
    payloadHash_ = com.google.protobuf.ByteString.EMPTY;
    symbol_ = "";
    amount_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventContractCallWithToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.TypesProto.internal_static_axelar_evm_v1beta1_EventContractCallWithToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.TypesProto.internal_static_axelar_evm_v1beta1_EventContractCallWithToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.EventContractCallWithToken.class, com.axelar.evm.v1beta1.EventContractCallWithToken.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSender() {
    return sender_;
  }

  public static final int DESTINATION_CHAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationChain_ = "";
  /**
   * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The destinationChain.
   */
  @java.lang.Override
  public java.lang.String getDestinationChain() {
    java.lang.Object ref = destinationChain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationChain_ = s;
      return s;
    }
  }
  /**
   * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for destinationChain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationChainBytes() {
    java.lang.Object ref = destinationChain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationChain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractAddress_ = "";
  /**
   * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
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
   * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
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

  public static final int PAYLOAD_HASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString payloadHash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes payload_hash = 4 [json_name = "payloadHash", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash"];</code>
   * @return The payloadHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayloadHash() {
    return payloadHash_;
  }

  public static final int SYMBOL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object symbol_ = "";
  /**
   * <code>string symbol = 5 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 5 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes amount = 6 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAmount() {
    return amount_;
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
    if (!sender_.isEmpty()) {
      output.writeBytes(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationChain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contractAddress_);
    }
    if (!payloadHash_.isEmpty()) {
      output.writeBytes(4, payloadHash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, symbol_);
    }
    if (!amount_.isEmpty()) {
      output.writeBytes(6, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!sender_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationChain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contractAddress_);
    }
    if (!payloadHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, payloadHash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, symbol_);
    }
    if (!amount_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, amount_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.EventContractCallWithToken)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.EventContractCallWithToken other = (com.axelar.evm.v1beta1.EventContractCallWithToken) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getDestinationChain()
        .equals(other.getDestinationChain())) return false;
    if (!getContractAddress()
        .equals(other.getContractAddress())) return false;
    if (!getPayloadHash()
        .equals(other.getPayloadHash())) return false;
    if (!getSymbol()
        .equals(other.getSymbol())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
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
    hash = (37 * hash) + DESTINATION_CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationChain().hashCode();
    hash = (37 * hash) + CONTRACT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getContractAddress().hashCode();
    hash = (37 * hash) + PAYLOAD_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadHash().hashCode();
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.EventContractCallWithToken parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.EventContractCallWithToken prototype) {
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
   * Protobuf type {@code axelar.evm.v1beta1.EventContractCallWithToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.EventContractCallWithToken)
      com.axelar.evm.v1beta1.EventContractCallWithTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.TypesProto.internal_static_axelar_evm_v1beta1_EventContractCallWithToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.TypesProto.internal_static_axelar_evm_v1beta1_EventContractCallWithToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.EventContractCallWithToken.class, com.axelar.evm.v1beta1.EventContractCallWithToken.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.EventContractCallWithToken.newBuilder()
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
      sender_ = com.google.protobuf.ByteString.EMPTY;
      destinationChain_ = "";
      contractAddress_ = "";
      payloadHash_ = com.google.protobuf.ByteString.EMPTY;
      symbol_ = "";
      amount_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.TypesProto.internal_static_axelar_evm_v1beta1_EventContractCallWithToken_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.EventContractCallWithToken getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.EventContractCallWithToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.EventContractCallWithToken build() {
      com.axelar.evm.v1beta1.EventContractCallWithToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.EventContractCallWithToken buildPartial() {
      com.axelar.evm.v1beta1.EventContractCallWithToken result = new com.axelar.evm.v1beta1.EventContractCallWithToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.EventContractCallWithToken result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destinationChain_ = destinationChain_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contractAddress_ = contractAddress_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.payloadHash_ = payloadHash_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.symbol_ = symbol_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.amount_ = amount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.EventContractCallWithToken) {
        return mergeFrom((com.axelar.evm.v1beta1.EventContractCallWithToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.EventContractCallWithToken other) {
      if (other == com.axelar.evm.v1beta1.EventContractCallWithToken.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (!other.getDestinationChain().isEmpty()) {
        destinationChain_ = other.destinationChain_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getContractAddress().isEmpty()) {
        contractAddress_ = other.contractAddress_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPayloadHash() != com.google.protobuf.ByteString.EMPTY) {
        setPayloadHash(other.getPayloadHash());
      }
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getAmount() != com.google.protobuf.ByteString.EMPTY) {
        setAmount(other.getAmount());
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
              sender_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              destinationChain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              contractAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              payloadHash_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              symbol_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              amount_ = input.readBytes();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return The sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSender() {
      return sender_;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = getDefaultInstance().getSender();
      onChanged();
      return this;
    }

    private java.lang.Object destinationChain_ = "";
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The destinationChain.
     */
    public java.lang.String getDestinationChain() {
      java.lang.Object ref = destinationChain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationChain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The bytes for destinationChain.
     */
    public com.google.protobuf.ByteString
        getDestinationChainBytes() {
      java.lang.Object ref = destinationChain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationChain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The destinationChain to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      destinationChain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationChain() {
      destinationChain_ = getDefaultInstance().getDestinationChain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The bytes for destinationChain to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      destinationChain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object contractAddress_ = "";
    /**
     * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
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
     * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
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
     * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
     * @param value The contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractAddress() {
      contractAddress_ = getDefaultInstance().getContractAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string contract_address = 3 [json_name = "contractAddress"];</code>
     * @param value The bytes for contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payloadHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload_hash = 4 [json_name = "payloadHash", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash"];</code>
     * @return The payloadHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayloadHash() {
      return payloadHash_;
    }
    /**
     * <code>bytes payload_hash = 4 [json_name = "payloadHash", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash"];</code>
     * @param value The payloadHash to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      payloadHash_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload_hash = 4 [json_name = "payloadHash", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadHash() {
      bitField0_ = (bitField0_ & ~0x00000008);
      payloadHash_ = getDefaultInstance().getPayloadHash();
      onChanged();
      return this;
    }

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 5 [json_name = "symbol"];</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 5 [json_name = "symbol"];</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 5 [json_name = "symbol"];</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      symbol_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 5 [json_name = "symbol"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      symbol_ = getDefaultInstance().getSymbol();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 5 [json_name = "symbol"];</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      symbol_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes amount = 6 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAmount() {
      return amount_;
    }
    /**
     * <code>bytes amount = 6 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bytes amount = 6 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000020);
      amount_ = getDefaultInstance().getAmount();
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.EventContractCallWithToken)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.EventContractCallWithToken)
  private static final com.axelar.evm.v1beta1.EventContractCallWithToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.EventContractCallWithToken();
  }

  public static com.axelar.evm.v1beta1.EventContractCallWithToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventContractCallWithToken>
      PARSER = new com.google.protobuf.AbstractParser<EventContractCallWithToken>() {
    @java.lang.Override
    public EventContractCallWithToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventContractCallWithToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventContractCallWithToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.EventContractCallWithToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

