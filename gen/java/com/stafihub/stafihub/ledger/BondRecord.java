// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/ledger.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf type {@code stafihub.stafihub.ledger.BondRecord}
 */
public final class BondRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.ledger.BondRecord)
    BondRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondRecord.newBuilder() to construct.
  private BondRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondRecord() {
    denom_ = "";
    bonder_ = "";
    pool_ = "";
    txhash_ = "";
    amount_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.ledger.LedgerProto.internal_static_stafihub_stafihub_ledger_BondRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.ledger.LedgerProto.internal_static_stafihub_stafihub_ledger_BondRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.ledger.BondRecord.class, com.stafihub.stafihub.ledger.BondRecord.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
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
   * <code>string denom = 1 [json_name = "denom"];</code>
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

  public static final int BONDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bonder_ = "";
  /**
   * <code>string bonder = 2 [json_name = "bonder"];</code>
   * @return The bonder.
   */
  @java.lang.Override
  public java.lang.String getBonder() {
    java.lang.Object ref = bonder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bonder_ = s;
      return s;
    }
  }
  /**
   * <code>string bonder = 2 [json_name = "bonder"];</code>
   * @return The bytes for bonder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBonderBytes() {
    java.lang.Object ref = bonder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bonder_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POOL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pool_ = "";
  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The pool.
   */
  @java.lang.Override
  public java.lang.String getPool() {
    java.lang.Object ref = pool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pool_ = s;
      return s;
    }
  }
  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The bytes for pool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoolBytes() {
    java.lang.Object ref = pool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pool_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TXHASH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object txhash_ = "";
  /**
   * <code>string txhash = 4 [json_name = "txhash"];</code>
   * @return The txhash.
   */
  @java.lang.Override
  public java.lang.String getTxhash() {
    java.lang.Object ref = txhash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txhash_ = s;
      return s;
    }
  }
  /**
   * <code>string txhash = 4 [json_name = "txhash"];</code>
   * @return The bytes for txhash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxhashBytes() {
    java.lang.Object ref = txhash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txhash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
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
   * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
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

  public static final int STATE_FIELD_NUMBER = 6;
  private int state_ = 0;
  /**
   * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override public com.stafihub.stafihub.ledger.LiquidityBondState getState() {
    com.stafihub.stafihub.ledger.LiquidityBondState result = com.stafihub.stafihub.ledger.LiquidityBondState.forNumber(state_);
    return result == null ? com.stafihub.stafihub.ledger.LiquidityBondState.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bonder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bonder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pool_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txhash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, txhash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, amount_);
    }
    if (state_ != com.stafihub.stafihub.ledger.LiquidityBondState.LIQUIDITY_BOND_STATE_VERIFY_OK.getNumber()) {
      output.writeEnum(6, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bonder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bonder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pool_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txhash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, txhash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, amount_);
    }
    if (state_ != com.stafihub.stafihub.ledger.LiquidityBondState.LIQUIDITY_BOND_STATE_VERIFY_OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, state_);
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
    if (!(obj instanceof com.stafihub.stafihub.ledger.BondRecord)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.ledger.BondRecord other = (com.stafihub.stafihub.ledger.BondRecord) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getBonder()
        .equals(other.getBonder())) return false;
    if (!getPool()
        .equals(other.getPool())) return false;
    if (!getTxhash()
        .equals(other.getTxhash())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + BONDER_FIELD_NUMBER;
    hash = (53 * hash) + getBonder().hashCode();
    hash = (37 * hash) + POOL_FIELD_NUMBER;
    hash = (53 * hash) + getPool().hashCode();
    hash = (37 * hash) + TXHASH_FIELD_NUMBER;
    hash = (53 * hash) + getTxhash().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.ledger.BondRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.ledger.BondRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.BondRecord parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.ledger.BondRecord prototype) {
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
   * Protobuf type {@code stafihub.stafihub.ledger.BondRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.ledger.BondRecord)
      com.stafihub.stafihub.ledger.BondRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.ledger.LedgerProto.internal_static_stafihub_stafihub_ledger_BondRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.ledger.LedgerProto.internal_static_stafihub_stafihub_ledger_BondRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.ledger.BondRecord.class, com.stafihub.stafihub.ledger.BondRecord.Builder.class);
    }

    // Construct using com.stafihub.stafihub.ledger.BondRecord.newBuilder()
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
      denom_ = "";
      bonder_ = "";
      pool_ = "";
      txhash_ = "";
      amount_ = "";
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.ledger.LedgerProto.internal_static_stafihub_stafihub_ledger_BondRecord_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondRecord getDefaultInstanceForType() {
      return com.stafihub.stafihub.ledger.BondRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondRecord build() {
      com.stafihub.stafihub.ledger.BondRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondRecord buildPartial() {
      com.stafihub.stafihub.ledger.BondRecord result = new com.stafihub.stafihub.ledger.BondRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.ledger.BondRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bonder_ = bonder_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pool_ = pool_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.txhash_ = txhash_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.state_ = state_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.ledger.BondRecord) {
        return mergeFrom((com.stafihub.stafihub.ledger.BondRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.ledger.BondRecord other) {
      if (other == com.stafihub.stafihub.ledger.BondRecord.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBonder().isEmpty()) {
        bonder_ = other.bonder_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getPool().isEmpty()) {
        pool_ = other.pool_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getTxhash().isEmpty()) {
        txhash_ = other.txhash_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bonder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              pool_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              txhash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
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
     * <code>string denom = 1 [json_name = "denom"];</code>
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
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object bonder_ = "";
    /**
     * <code>string bonder = 2 [json_name = "bonder"];</code>
     * @return The bonder.
     */
    public java.lang.String getBonder() {
      java.lang.Object ref = bonder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bonder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bonder = 2 [json_name = "bonder"];</code>
     * @return The bytes for bonder.
     */
    public com.google.protobuf.ByteString
        getBonderBytes() {
      java.lang.Object ref = bonder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bonder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bonder = 2 [json_name = "bonder"];</code>
     * @param value The bonder to set.
     * @return This builder for chaining.
     */
    public Builder setBonder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bonder_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bonder = 2 [json_name = "bonder"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBonder() {
      bonder_ = getDefaultInstance().getBonder();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bonder = 2 [json_name = "bonder"];</code>
     * @param value The bytes for bonder to set.
     * @return This builder for chaining.
     */
    public Builder setBonderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bonder_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object pool_ = "";
    /**
     * <code>string pool = 3 [json_name = "pool"];</code>
     * @return The pool.
     */
    public java.lang.String getPool() {
      java.lang.Object ref = pool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pool = 3 [json_name = "pool"];</code>
     * @return The bytes for pool.
     */
    public com.google.protobuf.ByteString
        getPoolBytes() {
      java.lang.Object ref = pool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pool = 3 [json_name = "pool"];</code>
     * @param value The pool to set.
     * @return This builder for chaining.
     */
    public Builder setPool(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pool_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 3 [json_name = "pool"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPool() {
      pool_ = getDefaultInstance().getPool();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 3 [json_name = "pool"];</code>
     * @param value The bytes for pool to set.
     * @return This builder for chaining.
     */
    public Builder setPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pool_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object txhash_ = "";
    /**
     * <code>string txhash = 4 [json_name = "txhash"];</code>
     * @return The txhash.
     */
    public java.lang.String getTxhash() {
      java.lang.Object ref = txhash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txhash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string txhash = 4 [json_name = "txhash"];</code>
     * @return The bytes for txhash.
     */
    public com.google.protobuf.ByteString
        getTxhashBytes() {
      java.lang.Object ref = txhash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txhash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string txhash = 4 [json_name = "txhash"];</code>
     * @param value The txhash to set.
     * @return This builder for chaining.
     */
    public Builder setTxhash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      txhash_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string txhash = 4 [json_name = "txhash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxhash() {
      txhash_ = getDefaultInstance().getTxhash();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string txhash = 4 [json_name = "txhash"];</code>
     * @param value The bytes for txhash to set.
     * @return This builder for chaining.
     */
    public Builder setTxhashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      txhash_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
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
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
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
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.stafihub.stafihub.ledger.LiquidityBondState getState() {
      com.stafihub.stafihub.ledger.LiquidityBondState result = com.stafihub.stafihub.ledger.LiquidityBondState.forNumber(state_);
      return result == null ? com.stafihub.stafihub.ledger.LiquidityBondState.UNRECOGNIZED : result;
    }
    /**
     * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.stafihub.stafihub.ledger.LiquidityBondState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000020;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.LiquidityBondState state = 6 [json_name = "state"];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000020);
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.ledger.BondRecord)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.ledger.BondRecord)
  private static final com.stafihub.stafihub.ledger.BondRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.ledger.BondRecord();
  }

  public static com.stafihub.stafihub.ledger.BondRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondRecord>
      PARSER = new com.google.protobuf.AbstractParser<BondRecord>() {
    @java.lang.Override
    public BondRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<BondRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.ledger.BondRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

