// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/tx.proto

package com.panacea.oracle.v2alpha2;

/**
 * <pre>
 * MsgRegisterOracle defines the Msg/RegisterOracle request type.
 * </pre>
 *
 * Protobuf type {@code panacea.oracle.v2alpha2.MsgRegisterOracle}
 */
public final class MsgRegisterOracle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.oracle.v2alpha2.MsgRegisterOracle)
    MsgRegisterOracleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRegisterOracle.newBuilder() to construct.
  private MsgRegisterOracle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRegisterOracle() {
    uniqueId_ = "";
    oracleAddress_ = "";
    nodePubKey_ = com.google.protobuf.ByteString.EMPTY;
    nodePubKeyRemoteReport_ = com.google.protobuf.ByteString.EMPTY;
    trustedBlockHash_ = com.google.protobuf.ByteString.EMPTY;
    nonce_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRegisterOracle();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgRegisterOracle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgRegisterOracle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.oracle.v2alpha2.MsgRegisterOracle.class, com.panacea.oracle.v2alpha2.MsgRegisterOracle.Builder.class);
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uniqueId_ = "";
  /**
   * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
   * @return The uniqueId.
   */
  @java.lang.Override
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueId_ = s;
      return s;
    }
  }
  /**
   * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
   * @return The bytes for uniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oracleAddress_ = "";
  /**
   * <pre>
   * panacea1.. account address
   * </pre>
   *
   * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
   * @return The oracleAddress.
   */
  @java.lang.Override
  public java.lang.String getOracleAddress() {
    java.lang.Object ref = oracleAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oracleAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * panacea1.. account address
   * </pre>
   *
   * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
   * @return The bytes for oracleAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOracleAddressBytes() {
    java.lang.Object ref = oracleAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oracleAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_PUB_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString nodePubKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes node_pub_key = 3 [json_name = "nodePubKey"];</code>
   * @return The nodePubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNodePubKey() {
    return nodePubKey_;
  }

  public static final int NODE_PUB_KEY_REMOTE_REPORT_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString nodePubKeyRemoteReport_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes node_pub_key_remote_report = 4 [json_name = "nodePubKeyRemoteReport"];</code>
   * @return The nodePubKeyRemoteReport.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNodePubKeyRemoteReport() {
    return nodePubKeyRemoteReport_;
  }

  public static final int TRUSTED_BLOCK_HEIGHT_FIELD_NUMBER = 5;
  private long trustedBlockHeight_ = 0L;
  /**
   * <code>int64 trusted_block_height = 5 [json_name = "trustedBlockHeight"];</code>
   * @return The trustedBlockHeight.
   */
  @java.lang.Override
  public long getTrustedBlockHeight() {
    return trustedBlockHeight_;
  }

  public static final int TRUSTED_BLOCK_HASH_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString trustedBlockHash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes trusted_block_hash = 6 [json_name = "trustedBlockHash"];</code>
   * @return The trustedBlockHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTrustedBlockHash() {
    return trustedBlockHash_;
  }

  public static final int NONCE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes nonce = 7 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNonce() {
    return nonce_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uniqueId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oracleAddress_);
    }
    if (!nodePubKey_.isEmpty()) {
      output.writeBytes(3, nodePubKey_);
    }
    if (!nodePubKeyRemoteReport_.isEmpty()) {
      output.writeBytes(4, nodePubKeyRemoteReport_);
    }
    if (trustedBlockHeight_ != 0L) {
      output.writeInt64(5, trustedBlockHeight_);
    }
    if (!trustedBlockHash_.isEmpty()) {
      output.writeBytes(6, trustedBlockHash_);
    }
    if (!nonce_.isEmpty()) {
      output.writeBytes(7, nonce_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uniqueId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oracleAddress_);
    }
    if (!nodePubKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, nodePubKey_);
    }
    if (!nodePubKeyRemoteReport_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, nodePubKeyRemoteReport_);
    }
    if (trustedBlockHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, trustedBlockHeight_);
    }
    if (!trustedBlockHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, trustedBlockHash_);
    }
    if (!nonce_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, nonce_);
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
    if (!(obj instanceof com.panacea.oracle.v2alpha2.MsgRegisterOracle)) {
      return super.equals(obj);
    }
    com.panacea.oracle.v2alpha2.MsgRegisterOracle other = (com.panacea.oracle.v2alpha2.MsgRegisterOracle) obj;

    if (!getUniqueId()
        .equals(other.getUniqueId())) return false;
    if (!getOracleAddress()
        .equals(other.getOracleAddress())) return false;
    if (!getNodePubKey()
        .equals(other.getNodePubKey())) return false;
    if (!getNodePubKeyRemoteReport()
        .equals(other.getNodePubKeyRemoteReport())) return false;
    if (getTrustedBlockHeight()
        != other.getTrustedBlockHeight()) return false;
    if (!getTrustedBlockHash()
        .equals(other.getTrustedBlockHash())) return false;
    if (!getNonce()
        .equals(other.getNonce())) return false;
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
    hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUniqueId().hashCode();
    hash = (37 * hash) + ORACLE_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOracleAddress().hashCode();
    hash = (37 * hash) + NODE_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getNodePubKey().hashCode();
    hash = (37 * hash) + NODE_PUB_KEY_REMOTE_REPORT_FIELD_NUMBER;
    hash = (53 * hash) + getNodePubKeyRemoteReport().hashCode();
    hash = (37 * hash) + TRUSTED_BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrustedBlockHeight());
    hash = (37 * hash) + TRUSTED_BLOCK_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getTrustedBlockHash().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle parseFrom(
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
  public static Builder newBuilder(com.panacea.oracle.v2alpha2.MsgRegisterOracle prototype) {
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
   * MsgRegisterOracle defines the Msg/RegisterOracle request type.
   * </pre>
   *
   * Protobuf type {@code panacea.oracle.v2alpha2.MsgRegisterOracle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.oracle.v2alpha2.MsgRegisterOracle)
      com.panacea.oracle.v2alpha2.MsgRegisterOracleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgRegisterOracle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgRegisterOracle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.oracle.v2alpha2.MsgRegisterOracle.class, com.panacea.oracle.v2alpha2.MsgRegisterOracle.Builder.class);
    }

    // Construct using com.panacea.oracle.v2alpha2.MsgRegisterOracle.newBuilder()
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
      uniqueId_ = "";
      oracleAddress_ = "";
      nodePubKey_ = com.google.protobuf.ByteString.EMPTY;
      nodePubKeyRemoteReport_ = com.google.protobuf.ByteString.EMPTY;
      trustedBlockHeight_ = 0L;
      trustedBlockHash_ = com.google.protobuf.ByteString.EMPTY;
      nonce_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.oracle.v2alpha2.TxProto.internal_static_panacea_oracle_v2alpha2_MsgRegisterOracle_descriptor;
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgRegisterOracle getDefaultInstanceForType() {
      return com.panacea.oracle.v2alpha2.MsgRegisterOracle.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgRegisterOracle build() {
      com.panacea.oracle.v2alpha2.MsgRegisterOracle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.oracle.v2alpha2.MsgRegisterOracle buildPartial() {
      com.panacea.oracle.v2alpha2.MsgRegisterOracle result = new com.panacea.oracle.v2alpha2.MsgRegisterOracle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.oracle.v2alpha2.MsgRegisterOracle result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uniqueId_ = uniqueId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oracleAddress_ = oracleAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nodePubKey_ = nodePubKey_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.nodePubKeyRemoteReport_ = nodePubKeyRemoteReport_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.trustedBlockHeight_ = trustedBlockHeight_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.trustedBlockHash_ = trustedBlockHash_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.nonce_ = nonce_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.oracle.v2alpha2.MsgRegisterOracle) {
        return mergeFrom((com.panacea.oracle.v2alpha2.MsgRegisterOracle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.oracle.v2alpha2.MsgRegisterOracle other) {
      if (other == com.panacea.oracle.v2alpha2.MsgRegisterOracle.getDefaultInstance()) return this;
      if (!other.getUniqueId().isEmpty()) {
        uniqueId_ = other.uniqueId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOracleAddress().isEmpty()) {
        oracleAddress_ = other.oracleAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getNodePubKey() != com.google.protobuf.ByteString.EMPTY) {
        setNodePubKey(other.getNodePubKey());
      }
      if (other.getNodePubKeyRemoteReport() != com.google.protobuf.ByteString.EMPTY) {
        setNodePubKeyRemoteReport(other.getNodePubKeyRemoteReport());
      }
      if (other.getTrustedBlockHeight() != 0L) {
        setTrustedBlockHeight(other.getTrustedBlockHeight());
      }
      if (other.getTrustedBlockHash() != com.google.protobuf.ByteString.EMPTY) {
        setTrustedBlockHash(other.getTrustedBlockHash());
      }
      if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
        setNonce(other.getNonce());
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
              uniqueId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              oracleAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              nodePubKey_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              nodePubKeyRemoteReport_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              trustedBlockHeight_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              trustedBlockHash_ = input.readBytes();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              nonce_ = input.readBytes();
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

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
     * @return The uniqueId.
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
     * @return The bytes for uniqueId.
     */
    public com.google.protobuf.ByteString
        getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
     * @param value The uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uniqueId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUniqueId() {
      uniqueId_ = getDefaultInstance().getUniqueId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string unique_id = 1 [json_name = "uniqueId"];</code>
     * @param value The bytes for uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uniqueId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object oracleAddress_ = "";
    /**
     * <pre>
     * panacea1.. account address
     * </pre>
     *
     * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
     * @return The oracleAddress.
     */
    public java.lang.String getOracleAddress() {
      java.lang.Object ref = oracleAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oracleAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * panacea1.. account address
     * </pre>
     *
     * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
     * @return The bytes for oracleAddress.
     */
    public com.google.protobuf.ByteString
        getOracleAddressBytes() {
      java.lang.Object ref = oracleAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oracleAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * panacea1.. account address
     * </pre>
     *
     * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
     * @param value The oracleAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOracleAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oracleAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panacea1.. account address
     * </pre>
     *
     * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleAddress() {
      oracleAddress_ = getDefaultInstance().getOracleAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panacea1.. account address
     * </pre>
     *
     * <code>string oracle_address = 2 [json_name = "oracleAddress"];</code>
     * @param value The bytes for oracleAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOracleAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oracleAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString nodePubKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes node_pub_key = 3 [json_name = "nodePubKey"];</code>
     * @return The nodePubKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNodePubKey() {
      return nodePubKey_;
    }
    /**
     * <code>bytes node_pub_key = 3 [json_name = "nodePubKey"];</code>
     * @param value The nodePubKey to set.
     * @return This builder for chaining.
     */
    public Builder setNodePubKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      nodePubKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes node_pub_key = 3 [json_name = "nodePubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNodePubKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nodePubKey_ = getDefaultInstance().getNodePubKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString nodePubKeyRemoteReport_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes node_pub_key_remote_report = 4 [json_name = "nodePubKeyRemoteReport"];</code>
     * @return The nodePubKeyRemoteReport.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNodePubKeyRemoteReport() {
      return nodePubKeyRemoteReport_;
    }
    /**
     * <code>bytes node_pub_key_remote_report = 4 [json_name = "nodePubKeyRemoteReport"];</code>
     * @param value The nodePubKeyRemoteReport to set.
     * @return This builder for chaining.
     */
    public Builder setNodePubKeyRemoteReport(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      nodePubKeyRemoteReport_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes node_pub_key_remote_report = 4 [json_name = "nodePubKeyRemoteReport"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNodePubKeyRemoteReport() {
      bitField0_ = (bitField0_ & ~0x00000008);
      nodePubKeyRemoteReport_ = getDefaultInstance().getNodePubKeyRemoteReport();
      onChanged();
      return this;
    }

    private long trustedBlockHeight_ ;
    /**
     * <code>int64 trusted_block_height = 5 [json_name = "trustedBlockHeight"];</code>
     * @return The trustedBlockHeight.
     */
    @java.lang.Override
    public long getTrustedBlockHeight() {
      return trustedBlockHeight_;
    }
    /**
     * <code>int64 trusted_block_height = 5 [json_name = "trustedBlockHeight"];</code>
     * @param value The trustedBlockHeight to set.
     * @return This builder for chaining.
     */
    public Builder setTrustedBlockHeight(long value) {

      trustedBlockHeight_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 trusted_block_height = 5 [json_name = "trustedBlockHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrustedBlockHeight() {
      bitField0_ = (bitField0_ & ~0x00000010);
      trustedBlockHeight_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString trustedBlockHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes trusted_block_hash = 6 [json_name = "trustedBlockHash"];</code>
     * @return The trustedBlockHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTrustedBlockHash() {
      return trustedBlockHash_;
    }
    /**
     * <code>bytes trusted_block_hash = 6 [json_name = "trustedBlockHash"];</code>
     * @param value The trustedBlockHash to set.
     * @return This builder for chaining.
     */
    public Builder setTrustedBlockHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      trustedBlockHash_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bytes trusted_block_hash = 6 [json_name = "trustedBlockHash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrustedBlockHash() {
      bitField0_ = (bitField0_ & ~0x00000020);
      trustedBlockHash_ = getDefaultInstance().getTrustedBlockHash();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes nonce = 7 [json_name = "nonce"];</code>
     * @return The nonce.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNonce() {
      return nonce_;
    }
    /**
     * <code>bytes nonce = 7 [json_name = "nonce"];</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      nonce_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>bytes nonce = 7 [json_name = "nonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      bitField0_ = (bitField0_ & ~0x00000040);
      nonce_ = getDefaultInstance().getNonce();
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


    // @@protoc_insertion_point(builder_scope:panacea.oracle.v2alpha2.MsgRegisterOracle)
  }

  // @@protoc_insertion_point(class_scope:panacea.oracle.v2alpha2.MsgRegisterOracle)
  private static final com.panacea.oracle.v2alpha2.MsgRegisterOracle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.oracle.v2alpha2.MsgRegisterOracle();
  }

  public static com.panacea.oracle.v2alpha2.MsgRegisterOracle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRegisterOracle>
      PARSER = new com.google.protobuf.AbstractParser<MsgRegisterOracle>() {
    @java.lang.Override
    public MsgRegisterOracle parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRegisterOracle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRegisterOracle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.oracle.v2alpha2.MsgRegisterOracle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

