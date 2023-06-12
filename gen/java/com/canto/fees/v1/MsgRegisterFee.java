// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/fees/v1/tx.proto

package com.canto.fees.v1;

/**
 * <pre>
 * MsgRegisterFee defines a message that registers a Fee
 * </pre>
 *
 * Protobuf type {@code canto.fees.v1.MsgRegisterFee}
 */
public final class MsgRegisterFee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:canto.fees.v1.MsgRegisterFee)
    MsgRegisterFeeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRegisterFee.newBuilder() to construct.
  private MsgRegisterFee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRegisterFee() {
    contractAddress_ = "";
    deployerAddress_ = "";
    withdrawAddress_ = "";
    nonces_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRegisterFee();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.canto.fees.v1.TxProto.internal_static_canto_fees_v1_MsgRegisterFee_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.canto.fees.v1.TxProto.internal_static_canto_fees_v1_MsgRegisterFee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.canto.fees.v1.MsgRegisterFee.class, com.canto.fees.v1.MsgRegisterFee.Builder.class);
  }

  public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractAddress_ = "";
  /**
   * <pre>
   * contract hex address
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
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
   * contract hex address
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
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

  public static final int DEPLOYER_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deployerAddress_ = "";
  /**
   * <pre>
   * bech32 address of message sender, must be the same as the origin EOA
   * sending the transaction which deploys the contract
   * </pre>
   *
   * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
   * @return The deployerAddress.
   */
  @java.lang.Override
  public java.lang.String getDeployerAddress() {
    java.lang.Object ref = deployerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bech32 address of message sender, must be the same as the origin EOA
   * sending the transaction which deploys the contract
   * </pre>
   *
   * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
   * @return The bytes for deployerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeployerAddressBytes() {
    java.lang.Object ref = deployerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITHDRAW_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object withdrawAddress_ = "";
  /**
   * <pre>
   * bech32 address of account receiving the transaction fees
   * </pre>
   *
   * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
   * @return The withdrawAddress.
   */
  @java.lang.Override
  public java.lang.String getWithdrawAddress() {
    java.lang.Object ref = withdrawAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      withdrawAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bech32 address of account receiving the transaction fees
   * </pre>
   *
   * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
   * @return The bytes for withdrawAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWithdrawAddressBytes() {
    java.lang.Object ref = withdrawAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      withdrawAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList nonces_;
  /**
   * <pre>
   * array of nonces from the address path, where the last nonce is
   * the nonce that determines the contract's address - it can be an EOA nonce
   * or a factory contract nonce
   * </pre>
   *
   * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
   * @return A list containing the nonces.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getNoncesList() {
    return nonces_;
  }
  /**
   * <pre>
   * array of nonces from the address path, where the last nonce is
   * the nonce that determines the contract's address - it can be an EOA nonce
   * or a factory contract nonce
   * </pre>
   *
   * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
   * @return The count of nonces.
   */
  public int getNoncesCount() {
    return nonces_.size();
  }
  /**
   * <pre>
   * array of nonces from the address path, where the last nonce is
   * the nonce that determines the contract's address - it can be an EOA nonce
   * or a factory contract nonce
   * </pre>
   *
   * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
   * @param index The index of the element to return.
   * @return The nonces at the given index.
   */
  public long getNonces(int index) {
    return nonces_.getLong(index);
  }
  private int noncesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contractAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, withdrawAddress_);
    }
    if (getNoncesList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(noncesMemoizedSerializedSize);
    }
    for (int i = 0; i < nonces_.size(); i++) {
      output.writeUInt64NoTag(nonces_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contractAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, withdrawAddress_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nonces_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(nonces_.getLong(i));
      }
      size += dataSize;
      if (!getNoncesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      noncesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.canto.fees.v1.MsgRegisterFee)) {
      return super.equals(obj);
    }
    com.canto.fees.v1.MsgRegisterFee other = (com.canto.fees.v1.MsgRegisterFee) obj;

    if (!getContractAddress()
        .equals(other.getContractAddress())) return false;
    if (!getDeployerAddress()
        .equals(other.getDeployerAddress())) return false;
    if (!getWithdrawAddress()
        .equals(other.getWithdrawAddress())) return false;
    if (!getNoncesList()
        .equals(other.getNoncesList())) return false;
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
    hash = (37 * hash) + CONTRACT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getContractAddress().hashCode();
    hash = (37 * hash) + DEPLOYER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDeployerAddress().hashCode();
    hash = (37 * hash) + WITHDRAW_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getWithdrawAddress().hashCode();
    if (getNoncesCount() > 0) {
      hash = (37 * hash) + NONCES_FIELD_NUMBER;
      hash = (53 * hash) + getNoncesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.canto.fees.v1.MsgRegisterFee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.canto.fees.v1.MsgRegisterFee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.fees.v1.MsgRegisterFee parseFrom(
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
  public static Builder newBuilder(com.canto.fees.v1.MsgRegisterFee prototype) {
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
   * MsgRegisterFee defines a message that registers a Fee
   * </pre>
   *
   * Protobuf type {@code canto.fees.v1.MsgRegisterFee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:canto.fees.v1.MsgRegisterFee)
      com.canto.fees.v1.MsgRegisterFeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.canto.fees.v1.TxProto.internal_static_canto_fees_v1_MsgRegisterFee_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.canto.fees.v1.TxProto.internal_static_canto_fees_v1_MsgRegisterFee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.canto.fees.v1.MsgRegisterFee.class, com.canto.fees.v1.MsgRegisterFee.Builder.class);
    }

    // Construct using com.canto.fees.v1.MsgRegisterFee.newBuilder()
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
      contractAddress_ = "";
      deployerAddress_ = "";
      withdrawAddress_ = "";
      nonces_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.canto.fees.v1.TxProto.internal_static_canto_fees_v1_MsgRegisterFee_descriptor;
    }

    @java.lang.Override
    public com.canto.fees.v1.MsgRegisterFee getDefaultInstanceForType() {
      return com.canto.fees.v1.MsgRegisterFee.getDefaultInstance();
    }

    @java.lang.Override
    public com.canto.fees.v1.MsgRegisterFee build() {
      com.canto.fees.v1.MsgRegisterFee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.canto.fees.v1.MsgRegisterFee buildPartial() {
      com.canto.fees.v1.MsgRegisterFee result = new com.canto.fees.v1.MsgRegisterFee(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.canto.fees.v1.MsgRegisterFee result) {
      if (((bitField0_ & 0x00000008) != 0)) {
        nonces_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.nonces_ = nonces_;
    }

    private void buildPartial0(com.canto.fees.v1.MsgRegisterFee result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contractAddress_ = contractAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployerAddress_ = deployerAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.withdrawAddress_ = withdrawAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.canto.fees.v1.MsgRegisterFee) {
        return mergeFrom((com.canto.fees.v1.MsgRegisterFee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.canto.fees.v1.MsgRegisterFee other) {
      if (other == com.canto.fees.v1.MsgRegisterFee.getDefaultInstance()) return this;
      if (!other.getContractAddress().isEmpty()) {
        contractAddress_ = other.contractAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeployerAddress().isEmpty()) {
        deployerAddress_ = other.deployerAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getWithdrawAddress().isEmpty()) {
        withdrawAddress_ = other.withdrawAddress_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.nonces_.isEmpty()) {
        if (nonces_.isEmpty()) {
          nonces_ = other.nonces_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureNoncesIsMutable();
          nonces_.addAll(other.nonces_);
        }
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
              contractAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              deployerAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              withdrawAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              long v = input.readUInt64();
              ensureNoncesIsMutable();
              nonces_.addLong(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureNoncesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                nonces_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            } // case 34
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

    private java.lang.Object contractAddress_ = "";
    /**
     * <pre>
     * contract hex address
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
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
     * contract hex address
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
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
     * contract hex address
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @param value The contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract hex address
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractAddress() {
      contractAddress_ = getDefaultInstance().getContractAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract hex address
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @param value The bytes for contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deployerAddress_ = "";
    /**
     * <pre>
     * bech32 address of message sender, must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The deployerAddress.
     */
    public java.lang.String getDeployerAddress() {
      java.lang.Object ref = deployerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bech32 address of message sender, must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The bytes for deployerAddress.
     */
    public com.google.protobuf.ByteString
        getDeployerAddressBytes() {
      java.lang.Object ref = deployerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bech32 address of message sender, must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @param value The deployerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDeployerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deployerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bech32 address of message sender, must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployerAddress() {
      deployerAddress_ = getDefaultInstance().getDeployerAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bech32 address of message sender, must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @param value The bytes for deployerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDeployerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deployerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object withdrawAddress_ = "";
    /**
     * <pre>
     * bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
     * @return The withdrawAddress.
     */
    public java.lang.String getWithdrawAddress() {
      java.lang.Object ref = withdrawAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        withdrawAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
     * @return The bytes for withdrawAddress.
     */
    public com.google.protobuf.ByteString
        getWithdrawAddressBytes() {
      java.lang.Object ref = withdrawAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        withdrawAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
     * @param value The withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      withdrawAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithdrawAddress() {
      withdrawAddress_ = getDefaultInstance().getWithdrawAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdraw_address = 3 [json_name = "withdrawAddress"];</code>
     * @param value The bytes for withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      withdrawAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList nonces_ = emptyLongList();
    private void ensureNoncesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        nonces_ = mutableCopy(nonces_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @return A list containing the nonces.
     */
    public java.util.List<java.lang.Long>
        getNoncesList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(nonces_) : nonces_;
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @return The count of nonces.
     */
    public int getNoncesCount() {
      return nonces_.size();
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @param index The index of the element to return.
     * @return The nonces at the given index.
     */
    public long getNonces(int index) {
      return nonces_.getLong(index);
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @param index The index to set the value at.
     * @param value The nonces to set.
     * @return This builder for chaining.
     */
    public Builder setNonces(
        int index, long value) {

      ensureNoncesIsMutable();
      nonces_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @param value The nonces to add.
     * @return This builder for chaining.
     */
    public Builder addNonces(long value) {

      ensureNoncesIsMutable();
      nonces_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @param values The nonces to add.
     * @return This builder for chaining.
     */
    public Builder addAllNonces(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureNoncesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nonces_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * array of nonces from the address path, where the last nonce is
     * the nonce that determines the contract's address - it can be an EOA nonce
     * or a factory contract nonce
     * </pre>
     *
     * <code>repeated uint64 nonces = 4 [json_name = "nonces"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonces() {
      nonces_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:canto.fees.v1.MsgRegisterFee)
  }

  // @@protoc_insertion_point(class_scope:canto.fees.v1.MsgRegisterFee)
  private static final com.canto.fees.v1.MsgRegisterFee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.canto.fees.v1.MsgRegisterFee();
  }

  public static com.canto.fees.v1.MsgRegisterFee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRegisterFee>
      PARSER = new com.google.protobuf.AbstractParser<MsgRegisterFee>() {
    @java.lang.Override
    public MsgRegisterFee parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRegisterFee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRegisterFee> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.canto.fees.v1.MsgRegisterFee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

