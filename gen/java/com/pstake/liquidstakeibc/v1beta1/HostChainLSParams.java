// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/liquidstakeibc/v1beta1/liquidstakeibc.proto

package com.pstake.liquidstakeibc.v1beta1;

/**
 * Protobuf type {@code pstake.liquidstakeibc.v1beta1.HostChainLSParams}
 */
public final class HostChainLSParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pstake.liquidstakeibc.v1beta1.HostChainLSParams)
    HostChainLSParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HostChainLSParams.newBuilder() to construct.
  private HostChainLSParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HostChainLSParams() {
    depositFee_ = "";
    restakeFee_ = "";
    unstakeFee_ = "";
    redemptionFee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HostChainLSParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pstake.liquidstakeibc.v1beta1.LiquidstakeibcProto.internal_static_pstake_liquidstakeibc_v1beta1_HostChainLSParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pstake.liquidstakeibc.v1beta1.LiquidstakeibcProto.internal_static_pstake_liquidstakeibc_v1beta1_HostChainLSParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.class, com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.Builder.class);
  }

  public static final int DEPOSIT_FEE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositFee_ = "";
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The depositFee.
   */
  @java.lang.Override
  public java.lang.String getDepositFee() {
    java.lang.Object ref = depositFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for depositFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositFeeBytes() {
    java.lang.Object ref = depositFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositFee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESTAKE_FEE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object restakeFee_ = "";
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The restakeFee.
   */
  @java.lang.Override
  public java.lang.String getRestakeFee() {
    java.lang.Object ref = restakeFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      restakeFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for restakeFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRestakeFeeBytes() {
    java.lang.Object ref = restakeFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      restakeFee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNSTAKE_FEE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object unstakeFee_ = "";
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The unstakeFee.
   */
  @java.lang.Override
  public java.lang.String getUnstakeFee() {
    java.lang.Object ref = unstakeFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unstakeFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for unstakeFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnstakeFeeBytes() {
    java.lang.Object ref = unstakeFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unstakeFee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REDEMPTION_FEE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object redemptionFee_ = "";
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The redemptionFee.
   */
  @java.lang.Override
  public java.lang.String getRedemptionFee() {
    java.lang.Object ref = redemptionFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redemptionFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * protocol fee in percentage
   * </pre>
   *
   * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for redemptionFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRedemptionFeeBytes() {
    java.lang.Object ref = redemptionFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      redemptionFee_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, depositFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restakeFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, restakeFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unstakeFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unstakeFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redemptionFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, redemptionFee_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, depositFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restakeFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, restakeFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unstakeFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unstakeFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(redemptionFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, redemptionFee_);
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
    if (!(obj instanceof com.pstake.liquidstakeibc.v1beta1.HostChainLSParams)) {
      return super.equals(obj);
    }
    com.pstake.liquidstakeibc.v1beta1.HostChainLSParams other = (com.pstake.liquidstakeibc.v1beta1.HostChainLSParams) obj;

    if (!getDepositFee()
        .equals(other.getDepositFee())) return false;
    if (!getRestakeFee()
        .equals(other.getRestakeFee())) return false;
    if (!getUnstakeFee()
        .equals(other.getUnstakeFee())) return false;
    if (!getRedemptionFee()
        .equals(other.getRedemptionFee())) return false;
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
    hash = (37 * hash) + DEPOSIT_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getDepositFee().hashCode();
    hash = (37 * hash) + RESTAKE_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getRestakeFee().hashCode();
    hash = (37 * hash) + UNSTAKE_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getUnstakeFee().hashCode();
    hash = (37 * hash) + REDEMPTION_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getRedemptionFee().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams parseFrom(
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
  public static Builder newBuilder(com.pstake.liquidstakeibc.v1beta1.HostChainLSParams prototype) {
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
   * Protobuf type {@code pstake.liquidstakeibc.v1beta1.HostChainLSParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pstake.liquidstakeibc.v1beta1.HostChainLSParams)
      com.pstake.liquidstakeibc.v1beta1.HostChainLSParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.LiquidstakeibcProto.internal_static_pstake_liquidstakeibc_v1beta1_HostChainLSParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.liquidstakeibc.v1beta1.LiquidstakeibcProto.internal_static_pstake_liquidstakeibc_v1beta1_HostChainLSParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.class, com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.Builder.class);
    }

    // Construct using com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.newBuilder()
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
      depositFee_ = "";
      restakeFee_ = "";
      unstakeFee_ = "";
      redemptionFee_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pstake.liquidstakeibc.v1beta1.LiquidstakeibcProto.internal_static_pstake_liquidstakeibc_v1beta1_HostChainLSParams_descriptor;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.HostChainLSParams getDefaultInstanceForType() {
      return com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.HostChainLSParams build() {
      com.pstake.liquidstakeibc.v1beta1.HostChainLSParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.HostChainLSParams buildPartial() {
      com.pstake.liquidstakeibc.v1beta1.HostChainLSParams result = new com.pstake.liquidstakeibc.v1beta1.HostChainLSParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pstake.liquidstakeibc.v1beta1.HostChainLSParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.depositFee_ = depositFee_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restakeFee_ = restakeFee_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unstakeFee_ = unstakeFee_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.redemptionFee_ = redemptionFee_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pstake.liquidstakeibc.v1beta1.HostChainLSParams) {
        return mergeFrom((com.pstake.liquidstakeibc.v1beta1.HostChainLSParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pstake.liquidstakeibc.v1beta1.HostChainLSParams other) {
      if (other == com.pstake.liquidstakeibc.v1beta1.HostChainLSParams.getDefaultInstance()) return this;
      if (!other.getDepositFee().isEmpty()) {
        depositFee_ = other.depositFee_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRestakeFee().isEmpty()) {
        restakeFee_ = other.restakeFee_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUnstakeFee().isEmpty()) {
        unstakeFee_ = other.unstakeFee_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getRedemptionFee().isEmpty()) {
        redemptionFee_ = other.redemptionFee_;
        bitField0_ |= 0x00000008;
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
              depositFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              restakeFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              unstakeFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              redemptionFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
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

    private java.lang.Object depositFee_ = "";
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The depositFee.
     */
    public java.lang.String getDepositFee() {
      java.lang.Object ref = depositFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for depositFee.
     */
    public com.google.protobuf.ByteString
        getDepositFeeBytes() {
      java.lang.Object ref = depositFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The depositFee to set.
     * @return This builder for chaining.
     */
    public Builder setDepositFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositFee_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositFee() {
      depositFee_ = getDefaultInstance().getDepositFee();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string deposit_fee = 1 [json_name = "depositFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for depositFee to set.
     * @return This builder for chaining.
     */
    public Builder setDepositFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositFee_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object restakeFee_ = "";
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The restakeFee.
     */
    public java.lang.String getRestakeFee() {
      java.lang.Object ref = restakeFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        restakeFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for restakeFee.
     */
    public com.google.protobuf.ByteString
        getRestakeFeeBytes() {
      java.lang.Object ref = restakeFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        restakeFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The restakeFee to set.
     * @return This builder for chaining.
     */
    public Builder setRestakeFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      restakeFee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRestakeFee() {
      restakeFee_ = getDefaultInstance().getRestakeFee();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string restake_fee = 2 [json_name = "restakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for restakeFee to set.
     * @return This builder for chaining.
     */
    public Builder setRestakeFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      restakeFee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object unstakeFee_ = "";
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The unstakeFee.
     */
    public java.lang.String getUnstakeFee() {
      java.lang.Object ref = unstakeFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unstakeFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for unstakeFee.
     */
    public com.google.protobuf.ByteString
        getUnstakeFeeBytes() {
      java.lang.Object ref = unstakeFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unstakeFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The unstakeFee to set.
     * @return This builder for chaining.
     */
    public Builder setUnstakeFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      unstakeFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnstakeFee() {
      unstakeFee_ = getDefaultInstance().getUnstakeFee();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string unstake_fee = 3 [json_name = "unstakeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for unstakeFee to set.
     * @return This builder for chaining.
     */
    public Builder setUnstakeFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      unstakeFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object redemptionFee_ = "";
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The redemptionFee.
     */
    public java.lang.String getRedemptionFee() {
      java.lang.Object ref = redemptionFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redemptionFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for redemptionFee.
     */
    public com.google.protobuf.ByteString
        getRedemptionFeeBytes() {
      java.lang.Object ref = redemptionFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        redemptionFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The redemptionFee to set.
     * @return This builder for chaining.
     */
    public Builder setRedemptionFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      redemptionFee_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRedemptionFee() {
      redemptionFee_ = getDefaultInstance().getRedemptionFee();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * protocol fee in percentage
     * </pre>
     *
     * <code>string redemption_fee = 4 [json_name = "redemptionFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for redemptionFee to set.
     * @return This builder for chaining.
     */
    public Builder setRedemptionFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      redemptionFee_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:pstake.liquidstakeibc.v1beta1.HostChainLSParams)
  }

  // @@protoc_insertion_point(class_scope:pstake.liquidstakeibc.v1beta1.HostChainLSParams)
  private static final com.pstake.liquidstakeibc.v1beta1.HostChainLSParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pstake.liquidstakeibc.v1beta1.HostChainLSParams();
  }

  public static com.pstake.liquidstakeibc.v1beta1.HostChainLSParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HostChainLSParams>
      PARSER = new com.google.protobuf.AbstractParser<HostChainLSParams>() {
    @java.lang.Override
    public HostChainLSParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<HostChainLSParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HostChainLSParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pstake.liquidstakeibc.v1beta1.HostChainLSParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

