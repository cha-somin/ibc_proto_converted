// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/incentive/v1/incentive.proto

package com.umee.incentive.v1;

/**
 * <pre>
 * Params defines the parameters for the incentive module.
 * </pre>
 *
 * Protobuf type {@code umee.incentive.v1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.incentive.v1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    emergencyUnbondFee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.incentive.v1.IncentiveProto.internal_static_umee_incentive_v1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.incentive.v1.IncentiveProto.internal_static_umee_incentive_v1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.incentive.v1.Params.class, com.umee.incentive.v1.Params.Builder.class);
  }

  public static final int MAX_UNBONDINGS_FIELD_NUMBER = 1;
  private int maxUnbondings_ = 0;
  /**
   * <pre>
   * max_unbondings is the maximum amount of concurrent unbondings an address can have
   * of each bonded uToken denom. Zero is interpreted as no limit.
   * </pre>
   *
   * <code>uint32 max_unbondings = 1 [json_name = "maxUnbondings"];</code>
   * @return The maxUnbondings.
   */
  @java.lang.Override
  public int getMaxUnbondings() {
    return maxUnbondings_;
  }

  public static final int UNBONDING_DURATION_FIELD_NUMBER = 2;
  private long unbondingDuration_ = 0L;
  /**
   * <pre>
   * unbonding_duration is the unbonding duration (in seconds).
   * </pre>
   *
   * <code>int64 unbonding_duration = 2 [json_name = "unbondingDuration"];</code>
   * @return The unbondingDuration.
   */
  @java.lang.Override
  public long getUnbondingDuration() {
    return unbondingDuration_;
  }

  public static final int EMERGENCY_UNBOND_FEE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emergencyUnbondFee_ = "";
  /**
   * <pre>
   * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
   * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
   * </pre>
   *
   * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The emergencyUnbondFee.
   */
  @java.lang.Override
  public java.lang.String getEmergencyUnbondFee() {
    java.lang.Object ref = emergencyUnbondFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emergencyUnbondFee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
   * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
   * </pre>
   *
   * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for emergencyUnbondFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmergencyUnbondFeeBytes() {
    java.lang.Object ref = emergencyUnbondFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emergencyUnbondFee_ = b;
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
    if (maxUnbondings_ != 0) {
      output.writeUInt32(1, maxUnbondings_);
    }
    if (unbondingDuration_ != 0L) {
      output.writeInt64(2, unbondingDuration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emergencyUnbondFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, emergencyUnbondFee_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxUnbondings_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, maxUnbondings_);
    }
    if (unbondingDuration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, unbondingDuration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emergencyUnbondFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, emergencyUnbondFee_);
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
    if (!(obj instanceof com.umee.incentive.v1.Params)) {
      return super.equals(obj);
    }
    com.umee.incentive.v1.Params other = (com.umee.incentive.v1.Params) obj;

    if (getMaxUnbondings()
        != other.getMaxUnbondings()) return false;
    if (getUnbondingDuration()
        != other.getUnbondingDuration()) return false;
    if (!getEmergencyUnbondFee()
        .equals(other.getEmergencyUnbondFee())) return false;
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
    hash = (37 * hash) + MAX_UNBONDINGS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxUnbondings();
    hash = (37 * hash) + UNBONDING_DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnbondingDuration());
    hash = (37 * hash) + EMERGENCY_UNBOND_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getEmergencyUnbondFee().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.incentive.v1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.incentive.v1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.incentive.v1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.incentive.v1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.incentive.v1.Params parseFrom(
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
  public static Builder newBuilder(com.umee.incentive.v1.Params prototype) {
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
   * Params defines the parameters for the incentive module.
   * </pre>
   *
   * Protobuf type {@code umee.incentive.v1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.incentive.v1.Params)
      com.umee.incentive.v1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.incentive.v1.IncentiveProto.internal_static_umee_incentive_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.incentive.v1.IncentiveProto.internal_static_umee_incentive_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.incentive.v1.Params.class, com.umee.incentive.v1.Params.Builder.class);
    }

    // Construct using com.umee.incentive.v1.Params.newBuilder()
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
      maxUnbondings_ = 0;
      unbondingDuration_ = 0L;
      emergencyUnbondFee_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.incentive.v1.IncentiveProto.internal_static_umee_incentive_v1_Params_descriptor;
    }

    @java.lang.Override
    public com.umee.incentive.v1.Params getDefaultInstanceForType() {
      return com.umee.incentive.v1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.incentive.v1.Params build() {
      com.umee.incentive.v1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.incentive.v1.Params buildPartial() {
      com.umee.incentive.v1.Params result = new com.umee.incentive.v1.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.incentive.v1.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxUnbondings_ = maxUnbondings_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unbondingDuration_ = unbondingDuration_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.emergencyUnbondFee_ = emergencyUnbondFee_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.incentive.v1.Params) {
        return mergeFrom((com.umee.incentive.v1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.incentive.v1.Params other) {
      if (other == com.umee.incentive.v1.Params.getDefaultInstance()) return this;
      if (other.getMaxUnbondings() != 0) {
        setMaxUnbondings(other.getMaxUnbondings());
      }
      if (other.getUnbondingDuration() != 0L) {
        setUnbondingDuration(other.getUnbondingDuration());
      }
      if (!other.getEmergencyUnbondFee().isEmpty()) {
        emergencyUnbondFee_ = other.emergencyUnbondFee_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              maxUnbondings_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              unbondingDuration_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              emergencyUnbondFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int maxUnbondings_ ;
    /**
     * <pre>
     * max_unbondings is the maximum amount of concurrent unbondings an address can have
     * of each bonded uToken denom. Zero is interpreted as no limit.
     * </pre>
     *
     * <code>uint32 max_unbondings = 1 [json_name = "maxUnbondings"];</code>
     * @return The maxUnbondings.
     */
    @java.lang.Override
    public int getMaxUnbondings() {
      return maxUnbondings_;
    }
    /**
     * <pre>
     * max_unbondings is the maximum amount of concurrent unbondings an address can have
     * of each bonded uToken denom. Zero is interpreted as no limit.
     * </pre>
     *
     * <code>uint32 max_unbondings = 1 [json_name = "maxUnbondings"];</code>
     * @param value The maxUnbondings to set.
     * @return This builder for chaining.
     */
    public Builder setMaxUnbondings(int value) {

      maxUnbondings_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max_unbondings is the maximum amount of concurrent unbondings an address can have
     * of each bonded uToken denom. Zero is interpreted as no limit.
     * </pre>
     *
     * <code>uint32 max_unbondings = 1 [json_name = "maxUnbondings"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxUnbondings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxUnbondings_ = 0;
      onChanged();
      return this;
    }

    private long unbondingDuration_ ;
    /**
     * <pre>
     * unbonding_duration is the unbonding duration (in seconds).
     * </pre>
     *
     * <code>int64 unbonding_duration = 2 [json_name = "unbondingDuration"];</code>
     * @return The unbondingDuration.
     */
    @java.lang.Override
    public long getUnbondingDuration() {
      return unbondingDuration_;
    }
    /**
     * <pre>
     * unbonding_duration is the unbonding duration (in seconds).
     * </pre>
     *
     * <code>int64 unbonding_duration = 2 [json_name = "unbondingDuration"];</code>
     * @param value The unbondingDuration to set.
     * @return This builder for chaining.
     */
    public Builder setUnbondingDuration(long value) {

      unbondingDuration_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unbonding_duration is the unbonding duration (in seconds).
     * </pre>
     *
     * <code>int64 unbonding_duration = 2 [json_name = "unbondingDuration"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnbondingDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      unbondingDuration_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object emergencyUnbondFee_ = "";
    /**
     * <pre>
     * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
     * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
     * </pre>
     *
     * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The emergencyUnbondFee.
     */
    public java.lang.String getEmergencyUnbondFee() {
      java.lang.Object ref = emergencyUnbondFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emergencyUnbondFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
     * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
     * </pre>
     *
     * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for emergencyUnbondFee.
     */
    public com.google.protobuf.ByteString
        getEmergencyUnbondFeeBytes() {
      java.lang.Object ref = emergencyUnbondFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emergencyUnbondFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
     * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
     * </pre>
     *
     * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The emergencyUnbondFee to set.
     * @return This builder for chaining.
     */
    public Builder setEmergencyUnbondFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emergencyUnbondFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
     * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
     * </pre>
     *
     * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmergencyUnbondFee() {
      emergencyUnbondFee_ = getDefaultInstance().getEmergencyUnbondFee();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * emergency_unbond_fee is the portion of a bond that is paid when it is instantly
     * released using MsgEmergencyUnbond. For example, 0.01 is a 1% fee. Ranges 0-1.
     * </pre>
     *
     * <code>string emergency_unbond_fee = 3 [json_name = "emergencyUnbondFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for emergencyUnbondFee to set.
     * @return This builder for chaining.
     */
    public Builder setEmergencyUnbondFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emergencyUnbondFee_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:umee.incentive.v1.Params)
  }

  // @@protoc_insertion_point(class_scope:umee.incentive.v1.Params)
  private static final com.umee.incentive.v1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.incentive.v1.Params();
  }

  public static com.umee.incentive.v1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.incentive.v1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

