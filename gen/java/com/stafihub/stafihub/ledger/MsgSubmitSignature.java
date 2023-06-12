// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/tx.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf type {@code stafihub.stafihub.ledger.MsgSubmitSignature}
 */
public final class MsgSubmitSignature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.ledger.MsgSubmitSignature)
    MsgSubmitSignatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSubmitSignature.newBuilder() to construct.
  private MsgSubmitSignature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSubmitSignature() {
    creator_ = "";
    denom_ = "";
    pool_ = "";
    txType_ = 0;
    propId_ = "";
    signature_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSubmitSignature();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.ledger.TxProto.internal_static_stafihub_stafihub_ledger_MsgSubmitSignature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.ledger.TxProto.internal_static_stafihub_stafihub_ledger_MsgSubmitSignature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.ledger.MsgSubmitSignature.class, com.stafihub.stafihub.ledger.MsgSubmitSignature.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
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
   * <code>string denom = 2 [json_name = "denom"];</code>
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

  public static final int ERA_FIELD_NUMBER = 3;
  private int era_ = 0;
  /**
   * <code>uint32 era = 3 [json_name = "era", (.gogoproto.jsontag) = "era"];</code>
   * @return The era.
   */
  @java.lang.Override
  public int getEra() {
    return era_;
  }

  public static final int POOL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pool_ = "";
  /**
   * <code>string pool = 4 [json_name = "pool"];</code>
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
   * <code>string pool = 4 [json_name = "pool"];</code>
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

  public static final int TXTYPE_FIELD_NUMBER = 5;
  private int txType_ = 0;
  /**
   * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
   * @return The enum numeric value on the wire for txType.
   */
  @java.lang.Override public int getTxTypeValue() {
    return txType_;
  }
  /**
   * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
   * @return The txType.
   */
  @java.lang.Override public com.stafihub.stafihub.ledger.OriginalTxType getTxType() {
    com.stafihub.stafihub.ledger.OriginalTxType result = com.stafihub.stafihub.ledger.OriginalTxType.forNumber(txType_);
    return result == null ? com.stafihub.stafihub.ledger.OriginalTxType.UNRECOGNIZED : result;
  }

  public static final int PROPID_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object propId_ = "";
  /**
   * <code>string propId = 6 [json_name = "propId"];</code>
   * @return The propId.
   */
  @java.lang.Override
  public java.lang.String getPropId() {
    java.lang.Object ref = propId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      propId_ = s;
      return s;
    }
  }
  /**
   * <code>string propId = 6 [json_name = "propId"];</code>
   * @return The bytes for propId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPropIdBytes() {
    java.lang.Object ref = propId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      propId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signature_ = "";
  /**
   * <code>string signature = 7 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public java.lang.String getSignature() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signature_ = s;
      return s;
    }
  }
  /**
   * <code>string signature = 7 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signature_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (era_ != 0) {
      output.writeUInt32(3, era_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pool_);
    }
    if (txType_ != com.stafihub.stafihub.ledger.OriginalTxType.ORIGINAL_TX_TYPE_DEAL_ERAUPDATED.getNumber()) {
      output.writeEnum(5, txType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, propId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (era_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, era_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pool_);
    }
    if (txType_ != com.stafihub.stafihub.ledger.OriginalTxType.ORIGINAL_TX_TYPE_DEAL_ERAUPDATED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, txType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, propId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, signature_);
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
    if (!(obj instanceof com.stafihub.stafihub.ledger.MsgSubmitSignature)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.ledger.MsgSubmitSignature other = (com.stafihub.stafihub.ledger.MsgSubmitSignature) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (getEra()
        != other.getEra()) return false;
    if (!getPool()
        .equals(other.getPool())) return false;
    if (txType_ != other.txType_) return false;
    if (!getPropId()
        .equals(other.getPropId())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ERA_FIELD_NUMBER;
    hash = (53 * hash) + getEra();
    hash = (37 * hash) + POOL_FIELD_NUMBER;
    hash = (53 * hash) + getPool().hashCode();
    hash = (37 * hash) + TXTYPE_FIELD_NUMBER;
    hash = (53 * hash) + txType_;
    hash = (37 * hash) + PROPID_FIELD_NUMBER;
    hash = (53 * hash) + getPropId().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.MsgSubmitSignature parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.ledger.MsgSubmitSignature prototype) {
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
   * Protobuf type {@code stafihub.stafihub.ledger.MsgSubmitSignature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.ledger.MsgSubmitSignature)
      com.stafihub.stafihub.ledger.MsgSubmitSignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.ledger.TxProto.internal_static_stafihub_stafihub_ledger_MsgSubmitSignature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.ledger.TxProto.internal_static_stafihub_stafihub_ledger_MsgSubmitSignature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.ledger.MsgSubmitSignature.class, com.stafihub.stafihub.ledger.MsgSubmitSignature.Builder.class);
    }

    // Construct using com.stafihub.stafihub.ledger.MsgSubmitSignature.newBuilder()
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
      creator_ = "";
      denom_ = "";
      era_ = 0;
      pool_ = "";
      txType_ = 0;
      propId_ = "";
      signature_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.ledger.TxProto.internal_static_stafihub_stafihub_ledger_MsgSubmitSignature_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.MsgSubmitSignature getDefaultInstanceForType() {
      return com.stafihub.stafihub.ledger.MsgSubmitSignature.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.MsgSubmitSignature build() {
      com.stafihub.stafihub.ledger.MsgSubmitSignature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.MsgSubmitSignature buildPartial() {
      com.stafihub.stafihub.ledger.MsgSubmitSignature result = new com.stafihub.stafihub.ledger.MsgSubmitSignature(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.ledger.MsgSubmitSignature result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.era_ = era_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pool_ = pool_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.txType_ = txType_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.propId_ = propId_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.signature_ = signature_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.ledger.MsgSubmitSignature) {
        return mergeFrom((com.stafihub.stafihub.ledger.MsgSubmitSignature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.ledger.MsgSubmitSignature other) {
      if (other == com.stafihub.stafihub.ledger.MsgSubmitSignature.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getEra() != 0) {
        setEra(other.getEra());
      }
      if (!other.getPool().isEmpty()) {
        pool_ = other.pool_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.txType_ != 0) {
        setTxTypeValue(other.getTxTypeValue());
      }
      if (!other.getPropId().isEmpty()) {
        propId_ = other.propId_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (!other.getSignature().isEmpty()) {
        signature_ = other.signature_;
        bitField0_ |= 0x00000040;
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
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              era_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              pool_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              txType_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              propId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              signature_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private java.lang.Object creator_ = "";
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
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
     * <code>string denom = 2 [json_name = "denom"];</code>
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
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int era_ ;
    /**
     * <code>uint32 era = 3 [json_name = "era", (.gogoproto.jsontag) = "era"];</code>
     * @return The era.
     */
    @java.lang.Override
    public int getEra() {
      return era_;
    }
    /**
     * <code>uint32 era = 3 [json_name = "era", (.gogoproto.jsontag) = "era"];</code>
     * @param value The era to set.
     * @return This builder for chaining.
     */
    public Builder setEra(int value) {

      era_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 era = 3 [json_name = "era", (.gogoproto.jsontag) = "era"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEra() {
      bitField0_ = (bitField0_ & ~0x00000004);
      era_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pool_ = "";
    /**
     * <code>string pool = 4 [json_name = "pool"];</code>
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
     * <code>string pool = 4 [json_name = "pool"];</code>
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
     * <code>string pool = 4 [json_name = "pool"];</code>
     * @param value The pool to set.
     * @return This builder for chaining.
     */
    public Builder setPool(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pool_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 4 [json_name = "pool"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPool() {
      pool_ = getDefaultInstance().getPool();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 4 [json_name = "pool"];</code>
     * @param value The bytes for pool to set.
     * @return This builder for chaining.
     */
    public Builder setPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pool_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int txType_ = 0;
    /**
     * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
     * @return The enum numeric value on the wire for txType.
     */
    @java.lang.Override public int getTxTypeValue() {
      return txType_;
    }
    /**
     * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
     * @param value The enum numeric value on the wire for txType to set.
     * @return This builder for chaining.
     */
    public Builder setTxTypeValue(int value) {
      txType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
     * @return The txType.
     */
    @java.lang.Override
    public com.stafihub.stafihub.ledger.OriginalTxType getTxType() {
      com.stafihub.stafihub.ledger.OriginalTxType result = com.stafihub.stafihub.ledger.OriginalTxType.forNumber(txType_);
      return result == null ? com.stafihub.stafihub.ledger.OriginalTxType.UNRECOGNIZED : result;
    }
    /**
     * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
     * @param value The txType to set.
     * @return This builder for chaining.
     */
    public Builder setTxType(com.stafihub.stafihub.ledger.OriginalTxType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      txType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 5 [json_name = "txType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      txType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object propId_ = "";
    /**
     * <code>string propId = 6 [json_name = "propId"];</code>
     * @return The propId.
     */
    public java.lang.String getPropId() {
      java.lang.Object ref = propId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        propId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string propId = 6 [json_name = "propId"];</code>
     * @return The bytes for propId.
     */
    public com.google.protobuf.ByteString
        getPropIdBytes() {
      java.lang.Object ref = propId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string propId = 6 [json_name = "propId"];</code>
     * @param value The propId to set.
     * @return This builder for chaining.
     */
    public Builder setPropId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      propId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string propId = 6 [json_name = "propId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPropId() {
      propId_ = getDefaultInstance().getPropId();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string propId = 6 [json_name = "propId"];</code>
     * @param value The bytes for propId to set.
     * @return This builder for chaining.
     */
    public Builder setPropIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      propId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object signature_ = "";
    /**
     * <code>string signature = 7 [json_name = "signature"];</code>
     * @return The signature.
     */
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signature = 7 [json_name = "signature"];</code>
     * @return The bytes for signature.
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signature = 7 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 7 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      signature_ = getDefaultInstance().getSignature();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 7 [json_name = "signature"];</code>
     * @param value The bytes for signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signature_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.ledger.MsgSubmitSignature)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.ledger.MsgSubmitSignature)
  private static final com.stafihub.stafihub.ledger.MsgSubmitSignature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.ledger.MsgSubmitSignature();
  }

  public static com.stafihub.stafihub.ledger.MsgSubmitSignature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSubmitSignature>
      PARSER = new com.google.protobuf.AbstractParser<MsgSubmitSignature>() {
    @java.lang.Override
    public MsgSubmitSignature parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSubmitSignature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSubmitSignature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.ledger.MsgSubmitSignature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

