// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/tx.proto

package com.axelar.evm.v1beta1;

/**
 * <pre>
 * MsgConfirmDeposit represents an erc20 deposit confirmation message
 * </pre>
 *
 * Protobuf type {@code axelar.evm.v1beta1.ConfirmDepositRequest}
 */
public final class ConfirmDepositRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.ConfirmDepositRequest)
    ConfirmDepositRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfirmDepositRequest.newBuilder() to construct.
  private ConfirmDepositRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfirmDepositRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    chain_ = "";
    txId_ = com.google.protobuf.ByteString.EMPTY;
    amount_ = com.google.protobuf.ByteString.EMPTY;
    burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfirmDepositRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_ConfirmDepositRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_ConfirmDepositRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.ConfirmDepositRequest.class, com.axelar.evm.v1beta1.ConfirmDepositRequest.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSender() {
    return sender_;
  }

  public static final int CHAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chain_ = "";
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public java.lang.String getChain() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chain_ = s;
      return s;
    }
  }
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainBytes() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TX_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes tx_id = 3 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
   * @return The txId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTxId() {
    return txId_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes amount = 4 [json_name = "amount", deprecated = true, (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @deprecated axelar.evm.v1beta1.ConfirmDepositRequest.amount is deprecated.
   *     See axelar/evm/v1beta1/tx.proto;l=73
   * @return The amount.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString getAmount() {
    return amount_;
  }

  public static final int BURNER_ADDRESS_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes burner_address = 5 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return The burnerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBurnerAddress() {
    return burnerAddress_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chain_);
    }
    if (!txId_.isEmpty()) {
      output.writeBytes(3, txId_);
    }
    if (!amount_.isEmpty()) {
      output.writeBytes(4, amount_);
    }
    if (!burnerAddress_.isEmpty()) {
      output.writeBytes(5, burnerAddress_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chain_);
    }
    if (!txId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, txId_);
    }
    if (!amount_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, amount_);
    }
    if (!burnerAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, burnerAddress_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.ConfirmDepositRequest)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.ConfirmDepositRequest other = (com.axelar.evm.v1beta1.ConfirmDepositRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getChain()
        .equals(other.getChain())) return false;
    if (!getTxId()
        .equals(other.getTxId())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getBurnerAddress()
        .equals(other.getBurnerAddress())) return false;
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
    hash = (37 * hash) + CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getChain().hashCode();
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + BURNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getBurnerAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.ConfirmDepositRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.ConfirmDepositRequest prototype) {
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
   * MsgConfirmDeposit represents an erc20 deposit confirmation message
   * </pre>
   *
   * Protobuf type {@code axelar.evm.v1beta1.ConfirmDepositRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.ConfirmDepositRequest)
      com.axelar.evm.v1beta1.ConfirmDepositRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_ConfirmDepositRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_ConfirmDepositRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.ConfirmDepositRequest.class, com.axelar.evm.v1beta1.ConfirmDepositRequest.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.ConfirmDepositRequest.newBuilder()
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
      chain_ = "";
      txId_ = com.google.protobuf.ByteString.EMPTY;
      amount_ = com.google.protobuf.ByteString.EMPTY;
      burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_ConfirmDepositRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.ConfirmDepositRequest getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.ConfirmDepositRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.ConfirmDepositRequest build() {
      com.axelar.evm.v1beta1.ConfirmDepositRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.ConfirmDepositRequest buildPartial() {
      com.axelar.evm.v1beta1.ConfirmDepositRequest result = new com.axelar.evm.v1beta1.ConfirmDepositRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.ConfirmDepositRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chain_ = chain_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.txId_ = txId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.burnerAddress_ = burnerAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.ConfirmDepositRequest) {
        return mergeFrom((com.axelar.evm.v1beta1.ConfirmDepositRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.ConfirmDepositRequest other) {
      if (other == com.axelar.evm.v1beta1.ConfirmDepositRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (!other.getChain().isEmpty()) {
        chain_ = other.chain_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTxId() != com.google.protobuf.ByteString.EMPTY) {
        setTxId(other.getTxId());
      }
      if (other.getAmount() != com.google.protobuf.ByteString.EMPTY) {
        setAmount(other.getAmount());
      }
      if (other.getBurnerAddress() != com.google.protobuf.ByteString.EMPTY) {
        setBurnerAddress(other.getBurnerAddress());
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
              chain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              txId_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              amount_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              burnerAddress_ = input.readBytes();
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

    private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSender() {
      return sender_;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = getDefaultInstance().getSender();
      onChanged();
      return this;
    }

    private java.lang.Object chain_ = "";
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The chain.
     */
    public java.lang.String getChain() {
      java.lang.Object ref = chain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The bytes for chain.
     */
    public com.google.protobuf.ByteString
        getChainBytes() {
      java.lang.Object ref = chain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The chain to set.
     * @return This builder for chaining.
     */
    public Builder setChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChain() {
      chain_ = getDefaultInstance().getChain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The bytes for chain to set.
     * @return This builder for chaining.
     */
    public Builder setChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes tx_id = 3 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return The txId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxId() {
      return txId_;
    }
    /**
     * <code>bytes tx_id = 3 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      txId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes tx_id = 3 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      txId_ = getDefaultInstance().getTxId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes amount = 4 [json_name = "amount", deprecated = true, (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @deprecated axelar.evm.v1beta1.ConfirmDepositRequest.amount is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=73
     * @return The amount.
     */
    @java.lang.Override
    @java.lang.Deprecated public com.google.protobuf.ByteString getAmount() {
      return amount_;
    }
    /**
     * <code>bytes amount = 4 [json_name = "amount", deprecated = true, (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @deprecated axelar.evm.v1beta1.ConfirmDepositRequest.amount is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=73
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setAmount(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes amount = 4 [json_name = "amount", deprecated = true, (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @deprecated axelar.evm.v1beta1.ConfirmDepositRequest.amount is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=73
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes burner_address = 5 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return The burnerAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBurnerAddress() {
      return burnerAddress_;
    }
    /**
     * <code>bytes burner_address = 5 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @param value The burnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setBurnerAddress(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      burnerAddress_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bytes burner_address = 5 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBurnerAddress() {
      bitField0_ = (bitField0_ & ~0x00000010);
      burnerAddress_ = getDefaultInstance().getBurnerAddress();
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.ConfirmDepositRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.ConfirmDepositRequest)
  private static final com.axelar.evm.v1beta1.ConfirmDepositRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.ConfirmDepositRequest();
  }

  public static com.axelar.evm.v1beta1.ConfirmDepositRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfirmDepositRequest>
      PARSER = new com.google.protobuf.AbstractParser<ConfirmDepositRequest>() {
    @java.lang.Override
    public ConfirmDepositRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfirmDepositRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfirmDepositRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.ConfirmDepositRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

