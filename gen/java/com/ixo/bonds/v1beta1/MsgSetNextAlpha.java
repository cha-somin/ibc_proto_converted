// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/bonds/v1beta1/tx.proto

package com.ixo.bonds.v1beta1;

/**
 * <pre>
 * MsgSetNextAlpha defines a message for editing a bond's alpha parameter.
 * </pre>
 *
 * Protobuf type {@code ixo.bonds.v1beta1.MsgSetNextAlpha}
 */
public final class MsgSetNextAlpha extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.bonds.v1beta1.MsgSetNextAlpha)
    MsgSetNextAlphaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetNextAlpha.newBuilder() to construct.
  private MsgSetNextAlpha(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetNextAlpha() {
    bondDid_ = "";
    alpha_ = "";
    delta_ = "";
    oracleDid_ = "";
    oracleAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSetNextAlpha();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.bonds.v1beta1.TxProto.internal_static_ixo_bonds_v1beta1_MsgSetNextAlpha_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.bonds.v1beta1.TxProto.internal_static_ixo_bonds_v1beta1_MsgSetNextAlpha_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.bonds.v1beta1.MsgSetNextAlpha.class, com.ixo.bonds.v1beta1.MsgSetNextAlpha.Builder.class);
  }

  public static final int BOND_DID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bondDid_ = "";
  /**
   * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
   * @return The bondDid.
   */
  @java.lang.Override
  public java.lang.String getBondDid() {
    java.lang.Object ref = bondDid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bondDid_ = s;
      return s;
    }
  }
  /**
   * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
   * @return The bytes for bondDid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBondDidBytes() {
    java.lang.Object ref = bondDid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bondDid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALPHA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alpha_ = "";
  /**
   * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
   * @return The alpha.
   */
  @java.lang.Override
  public java.lang.String getAlpha() {
    java.lang.Object ref = alpha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alpha_ = s;
      return s;
    }
  }
  /**
   * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
   * @return The bytes for alpha.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlphaBytes() {
    java.lang.Object ref = alpha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alpha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELTA_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delta_ = "";
  /**
   * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
   * @return The delta.
   */
  @java.lang.Override
  public java.lang.String getDelta() {
    java.lang.Object ref = delta_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delta_ = s;
      return s;
    }
  }
  /**
   * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
   * @return The bytes for delta.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeltaBytes() {
    java.lang.Object ref = delta_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delta_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_DID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oracleDid_ = "";
  /**
   * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
   * @return The oracleDid.
   */
  @java.lang.Override
  public java.lang.String getOracleDid() {
    java.lang.Object ref = oracleDid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oracleDid_ = s;
      return s;
    }
  }
  /**
   * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
   * @return The bytes for oracleDid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOracleDidBytes() {
    java.lang.Object ref = oracleDid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oracleDid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_ADDRESS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oracleAddress_ = "";
  /**
   * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
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
   * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bondDid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bondDid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alpha_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alpha_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delta_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, delta_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleDid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, oracleDid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, oracleAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bondDid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bondDid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alpha_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alpha_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delta_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, delta_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleDid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, oracleDid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, oracleAddress_);
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
    if (!(obj instanceof com.ixo.bonds.v1beta1.MsgSetNextAlpha)) {
      return super.equals(obj);
    }
    com.ixo.bonds.v1beta1.MsgSetNextAlpha other = (com.ixo.bonds.v1beta1.MsgSetNextAlpha) obj;

    if (!getBondDid()
        .equals(other.getBondDid())) return false;
    if (!getAlpha()
        .equals(other.getAlpha())) return false;
    if (!getDelta()
        .equals(other.getDelta())) return false;
    if (!getOracleDid()
        .equals(other.getOracleDid())) return false;
    if (!getOracleAddress()
        .equals(other.getOracleAddress())) return false;
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
    hash = (37 * hash) + BOND_DID_FIELD_NUMBER;
    hash = (53 * hash) + getBondDid().hashCode();
    hash = (37 * hash) + ALPHA_FIELD_NUMBER;
    hash = (53 * hash) + getAlpha().hashCode();
    hash = (37 * hash) + DELTA_FIELD_NUMBER;
    hash = (53 * hash) + getDelta().hashCode();
    hash = (37 * hash) + ORACLE_DID_FIELD_NUMBER;
    hash = (53 * hash) + getOracleDid().hashCode();
    hash = (37 * hash) + ORACLE_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOracleAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha parseFrom(
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
  public static Builder newBuilder(com.ixo.bonds.v1beta1.MsgSetNextAlpha prototype) {
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
   * MsgSetNextAlpha defines a message for editing a bond's alpha parameter.
   * </pre>
   *
   * Protobuf type {@code ixo.bonds.v1beta1.MsgSetNextAlpha}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.bonds.v1beta1.MsgSetNextAlpha)
      com.ixo.bonds.v1beta1.MsgSetNextAlphaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.bonds.v1beta1.TxProto.internal_static_ixo_bonds_v1beta1_MsgSetNextAlpha_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.bonds.v1beta1.TxProto.internal_static_ixo_bonds_v1beta1_MsgSetNextAlpha_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.bonds.v1beta1.MsgSetNextAlpha.class, com.ixo.bonds.v1beta1.MsgSetNextAlpha.Builder.class);
    }

    // Construct using com.ixo.bonds.v1beta1.MsgSetNextAlpha.newBuilder()
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
      bondDid_ = "";
      alpha_ = "";
      delta_ = "";
      oracleDid_ = "";
      oracleAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.bonds.v1beta1.TxProto.internal_static_ixo_bonds_v1beta1_MsgSetNextAlpha_descriptor;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.MsgSetNextAlpha getDefaultInstanceForType() {
      return com.ixo.bonds.v1beta1.MsgSetNextAlpha.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.MsgSetNextAlpha build() {
      com.ixo.bonds.v1beta1.MsgSetNextAlpha result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.MsgSetNextAlpha buildPartial() {
      com.ixo.bonds.v1beta1.MsgSetNextAlpha result = new com.ixo.bonds.v1beta1.MsgSetNextAlpha(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.bonds.v1beta1.MsgSetNextAlpha result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bondDid_ = bondDid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.alpha_ = alpha_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.delta_ = delta_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.oracleDid_ = oracleDid_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.oracleAddress_ = oracleAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.bonds.v1beta1.MsgSetNextAlpha) {
        return mergeFrom((com.ixo.bonds.v1beta1.MsgSetNextAlpha)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.bonds.v1beta1.MsgSetNextAlpha other) {
      if (other == com.ixo.bonds.v1beta1.MsgSetNextAlpha.getDefaultInstance()) return this;
      if (!other.getBondDid().isEmpty()) {
        bondDid_ = other.bondDid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAlpha().isEmpty()) {
        alpha_ = other.alpha_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDelta().isEmpty()) {
        delta_ = other.delta_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getOracleDid().isEmpty()) {
        oracleDid_ = other.oracleDid_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getOracleAddress().isEmpty()) {
        oracleAddress_ = other.oracleAddress_;
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
              bondDid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              alpha_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              delta_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              oracleDid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              oracleAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object bondDid_ = "";
    /**
     * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
     * @return The bondDid.
     */
    public java.lang.String getBondDid() {
      java.lang.Object ref = bondDid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bondDid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
     * @return The bytes for bondDid.
     */
    public com.google.protobuf.ByteString
        getBondDidBytes() {
      java.lang.Object ref = bondDid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bondDid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
     * @param value The bondDid to set.
     * @return This builder for chaining.
     */
    public Builder setBondDid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bondDid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearBondDid() {
      bondDid_ = getDefaultInstance().getBondDid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string bond_did = 1 [json_name = "bondDid", (.gogoproto.moretags) = "yaml:&#92;"bond_did&#92;""];</code>
     * @param value The bytes for bondDid to set.
     * @return This builder for chaining.
     */
    public Builder setBondDidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bondDid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object alpha_ = "";
    /**
     * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
     * @return The alpha.
     */
    public java.lang.String getAlpha() {
      java.lang.Object ref = alpha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alpha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
     * @return The bytes for alpha.
     */
    public com.google.protobuf.ByteString
        getAlphaBytes() {
      java.lang.Object ref = alpha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alpha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
     * @param value The alpha to set.
     * @return This builder for chaining.
     */
    public Builder setAlpha(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alpha_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlpha() {
      alpha_ = getDefaultInstance().getAlpha();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string alpha = 2 [json_name = "alpha", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"alpha&#92;""];</code>
     * @param value The bytes for alpha to set.
     * @return This builder for chaining.
     */
    public Builder setAlphaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alpha_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object delta_ = "";
    /**
     * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
     * @return The delta.
     */
    public java.lang.String getDelta() {
      java.lang.Object ref = delta_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delta_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
     * @return The bytes for delta.
     */
    public com.google.protobuf.ByteString
        getDeltaBytes() {
      java.lang.Object ref = delta_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delta_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
     * @param value The delta to set.
     * @return This builder for chaining.
     */
    public Builder setDelta(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delta_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelta() {
      delta_ = getDefaultInstance().getDelta();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string delta = 3 [json_name = "delta", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"delta&#92;""];</code>
     * @param value The bytes for delta to set.
     * @return This builder for chaining.
     */
    public Builder setDeltaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delta_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object oracleDid_ = "";
    /**
     * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
     * @return The oracleDid.
     */
    public java.lang.String getOracleDid() {
      java.lang.Object ref = oracleDid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oracleDid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
     * @return The bytes for oracleDid.
     */
    public com.google.protobuf.ByteString
        getOracleDidBytes() {
      java.lang.Object ref = oracleDid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oracleDid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
     * @param value The oracleDid to set.
     * @return This builder for chaining.
     */
    public Builder setOracleDid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oracleDid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleDid() {
      oracleDid_ = getDefaultInstance().getOracleDid();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string oracle_did = 4 [json_name = "oracleDid", (.gogoproto.moretags) = "yaml:&#92;"editor_did&#92;"", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
     * @param value The bytes for oracleDid to set.
     * @return This builder for chaining.
     */
    public Builder setOracleDidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oracleDid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object oracleAddress_ = "";
    /**
     * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
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
     * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
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
     * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
     * @param value The oracleAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOracleAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oracleAddress_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleAddress() {
      oracleAddress_ = getDefaultInstance().getOracleAddress();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string oracle_address = 5 [json_name = "oracleAddress", (.gogoproto.jsontag) = "editor_address", (.gogoproto.moretags) = "yaml:&#92;"editor_address&#92;""];</code>
     * @param value The bytes for oracleAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOracleAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oracleAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:ixo.bonds.v1beta1.MsgSetNextAlpha)
  }

  // @@protoc_insertion_point(class_scope:ixo.bonds.v1beta1.MsgSetNextAlpha)
  private static final com.ixo.bonds.v1beta1.MsgSetNextAlpha DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.bonds.v1beta1.MsgSetNextAlpha();
  }

  public static com.ixo.bonds.v1beta1.MsgSetNextAlpha getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetNextAlpha>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetNextAlpha>() {
    @java.lang.Override
    public MsgSetNextAlpha parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSetNextAlpha> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetNextAlpha> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.bonds.v1beta1.MsgSetNextAlpha getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

