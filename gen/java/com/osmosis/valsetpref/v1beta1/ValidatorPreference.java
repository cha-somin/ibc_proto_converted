// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/state.proto

package com.osmosis.valsetpref.v1beta1;

/**
 * <pre>
 * ValidatorPreference defines the message structure for
 * CreateValidatorSetPreference. It allows a user to set {val_addr, weight} in
 * state. If a user does not have a validator set preference list set, and has
 * staked, make their preference list default to their current staking
 * distribution.
 * </pre>
 *
 * Protobuf type {@code osmosis.valsetpref.v1beta1.ValidatorPreference}
 */
public final class ValidatorPreference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.valsetpref.v1beta1.ValidatorPreference)
    ValidatorPreferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorPreference.newBuilder() to construct.
  private ValidatorPreference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorPreference() {
    valOperAddress_ = "";
    weight_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidatorPreference();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.valsetpref.v1beta1.StateProto.internal_static_osmosis_valsetpref_v1beta1_ValidatorPreference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.valsetpref.v1beta1.StateProto.internal_static_osmosis_valsetpref_v1beta1_ValidatorPreference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.valsetpref.v1beta1.ValidatorPreference.class, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder.class);
  }

  public static final int VAL_OPER_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object valOperAddress_ = "";
  /**
   * <pre>
   * val_oper_address holds the validator address the user wants to delegate
   * funds to.
   * </pre>
   *
   * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
   * @return The valOperAddress.
   */
  @java.lang.Override
  public java.lang.String getValOperAddress() {
    java.lang.Object ref = valOperAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valOperAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * val_oper_address holds the validator address the user wants to delegate
   * funds to.
   * </pre>
   *
   * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
   * @return The bytes for valOperAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValOperAddressBytes() {
    java.lang.Object ref = valOperAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valOperAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object weight_ = "";
  /**
   * <pre>
   * weight is decimal between 0 and 1, and they all sum to 1.
   * </pre>
   *
   * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The weight.
   */
  @java.lang.Override
  public java.lang.String getWeight() {
    java.lang.Object ref = weight_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      weight_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * weight is decimal between 0 and 1, and they all sum to 1.
   * </pre>
   *
   * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for weight.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWeightBytes() {
    java.lang.Object ref = weight_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      weight_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valOperAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, valOperAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weight_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, weight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valOperAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, valOperAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weight_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, weight_);
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
    if (!(obj instanceof com.osmosis.valsetpref.v1beta1.ValidatorPreference)) {
      return super.equals(obj);
    }
    com.osmosis.valsetpref.v1beta1.ValidatorPreference other = (com.osmosis.valsetpref.v1beta1.ValidatorPreference) obj;

    if (!getValOperAddress()
        .equals(other.getValOperAddress())) return false;
    if (!getWeight()
        .equals(other.getWeight())) return false;
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
    hash = (37 * hash) + VAL_OPER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValOperAddress().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference parseFrom(
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
  public static Builder newBuilder(com.osmosis.valsetpref.v1beta1.ValidatorPreference prototype) {
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
   * ValidatorPreference defines the message structure for
   * CreateValidatorSetPreference. It allows a user to set {val_addr, weight} in
   * state. If a user does not have a validator set preference list set, and has
   * staked, make their preference list default to their current staking
   * distribution.
   * </pre>
   *
   * Protobuf type {@code osmosis.valsetpref.v1beta1.ValidatorPreference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.valsetpref.v1beta1.ValidatorPreference)
      com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.valsetpref.v1beta1.StateProto.internal_static_osmosis_valsetpref_v1beta1_ValidatorPreference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.valsetpref.v1beta1.StateProto.internal_static_osmosis_valsetpref_v1beta1_ValidatorPreference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.valsetpref.v1beta1.ValidatorPreference.class, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder.class);
    }

    // Construct using com.osmosis.valsetpref.v1beta1.ValidatorPreference.newBuilder()
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
      valOperAddress_ = "";
      weight_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.valsetpref.v1beta1.StateProto.internal_static_osmosis_valsetpref_v1beta1_ValidatorPreference_descriptor;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference getDefaultInstanceForType() {
      return com.osmosis.valsetpref.v1beta1.ValidatorPreference.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference build() {
      com.osmosis.valsetpref.v1beta1.ValidatorPreference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference buildPartial() {
      com.osmosis.valsetpref.v1beta1.ValidatorPreference result = new com.osmosis.valsetpref.v1beta1.ValidatorPreference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.valsetpref.v1beta1.ValidatorPreference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valOperAddress_ = valOperAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weight_ = weight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.valsetpref.v1beta1.ValidatorPreference) {
        return mergeFrom((com.osmosis.valsetpref.v1beta1.ValidatorPreference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.valsetpref.v1beta1.ValidatorPreference other) {
      if (other == com.osmosis.valsetpref.v1beta1.ValidatorPreference.getDefaultInstance()) return this;
      if (!other.getValOperAddress().isEmpty()) {
        valOperAddress_ = other.valOperAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWeight().isEmpty()) {
        weight_ = other.weight_;
        bitField0_ |= 0x00000002;
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
              valOperAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              weight_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object valOperAddress_ = "";
    /**
     * <pre>
     * val_oper_address holds the validator address the user wants to delegate
     * funds to.
     * </pre>
     *
     * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
     * @return The valOperAddress.
     */
    public java.lang.String getValOperAddress() {
      java.lang.Object ref = valOperAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valOperAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * val_oper_address holds the validator address the user wants to delegate
     * funds to.
     * </pre>
     *
     * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
     * @return The bytes for valOperAddress.
     */
    public com.google.protobuf.ByteString
        getValOperAddressBytes() {
      java.lang.Object ref = valOperAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valOperAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * val_oper_address holds the validator address the user wants to delegate
     * funds to.
     * </pre>
     *
     * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
     * @param value The valOperAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValOperAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valOperAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * val_oper_address holds the validator address the user wants to delegate
     * funds to.
     * </pre>
     *
     * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearValOperAddress() {
      valOperAddress_ = getDefaultInstance().getValOperAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * val_oper_address holds the validator address the user wants to delegate
     * funds to.
     * </pre>
     *
     * <code>string val_oper_address = 1 [json_name = "valOperAddress", (.gogoproto.moretags) = "yaml:&#92;"val_oper_address&#92;""];</code>
     * @param value The bytes for valOperAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValOperAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valOperAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object weight_ = "";
    /**
     * <pre>
     * weight is decimal between 0 and 1, and they all sum to 1.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The weight.
     */
    public java.lang.String getWeight() {
      java.lang.Object ref = weight_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weight_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * weight is decimal between 0 and 1, and they all sum to 1.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for weight.
     */
    public com.google.protobuf.ByteString
        getWeightBytes() {
      java.lang.Object ref = weight_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weight_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * weight is decimal between 0 and 1, and they all sum to 1.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      weight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * weight is decimal between 0 and 1, and they all sum to 1.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      weight_ = getDefaultInstance().getWeight();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * weight is decimal between 0 and 1, and they all sum to 1.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeightBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      weight_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:osmosis.valsetpref.v1beta1.ValidatorPreference)
  }

  // @@protoc_insertion_point(class_scope:osmosis.valsetpref.v1beta1.ValidatorPreference)
  private static final com.osmosis.valsetpref.v1beta1.ValidatorPreference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.valsetpref.v1beta1.ValidatorPreference();
  }

  public static com.osmosis.valsetpref.v1beta1.ValidatorPreference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorPreference>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorPreference>() {
    @java.lang.Override
    public ValidatorPreference parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidatorPreference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorPreference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.ValidatorPreference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

