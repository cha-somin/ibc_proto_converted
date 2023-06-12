// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persistence/oracle/v1beta1/genesis.proto

package com.persistence.oracle.v1beta1;

/**
 * <pre>
 * FeederDelegation is the address for where oracle feeder authority are
 * delegated to. By default this struct is only used at genesis to feed in
 * default feeder addresses.
 * </pre>
 *
 * Protobuf type {@code persistence.oracle.v1beta1.FeederDelegation}
 */
public final class FeederDelegation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:persistence.oracle.v1beta1.FeederDelegation)
    FeederDelegationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeederDelegation.newBuilder() to construct.
  private FeederDelegation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeederDelegation() {
    feederAddress_ = "";
    validatorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeederDelegation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.persistence.oracle.v1beta1.GenesisProto.internal_static_persistence_oracle_v1beta1_FeederDelegation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.persistence.oracle.v1beta1.GenesisProto.internal_static_persistence_oracle_v1beta1_FeederDelegation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.persistence.oracle.v1beta1.FeederDelegation.class, com.persistence.oracle.v1beta1.FeederDelegation.Builder.class);
  }

  public static final int FEEDER_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feederAddress_ = "";
  /**
   * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The feederAddress.
   */
  @java.lang.Override
  public java.lang.String getFeederAddress() {
    java.lang.Object ref = feederAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feederAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for feederAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeederAddressBytes() {
    java.lang.Object ref = feederAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feederAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validatorAddress_ = "";
  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feederAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, feederAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, validatorAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feederAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, feederAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, validatorAddress_);
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
    if (!(obj instanceof com.persistence.oracle.v1beta1.FeederDelegation)) {
      return super.equals(obj);
    }
    com.persistence.oracle.v1beta1.FeederDelegation other = (com.persistence.oracle.v1beta1.FeederDelegation) obj;

    if (!getFeederAddress()
        .equals(other.getFeederAddress())) return false;
    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
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
    hash = (37 * hash) + FEEDER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getFeederAddress().hashCode();
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.persistence.oracle.v1beta1.FeederDelegation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.persistence.oracle.v1beta1.FeederDelegation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.persistence.oracle.v1beta1.FeederDelegation parseFrom(
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
  public static Builder newBuilder(com.persistence.oracle.v1beta1.FeederDelegation prototype) {
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
   * FeederDelegation is the address for where oracle feeder authority are
   * delegated to. By default this struct is only used at genesis to feed in
   * default feeder addresses.
   * </pre>
   *
   * Protobuf type {@code persistence.oracle.v1beta1.FeederDelegation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:persistence.oracle.v1beta1.FeederDelegation)
      com.persistence.oracle.v1beta1.FeederDelegationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.persistence.oracle.v1beta1.GenesisProto.internal_static_persistence_oracle_v1beta1_FeederDelegation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.persistence.oracle.v1beta1.GenesisProto.internal_static_persistence_oracle_v1beta1_FeederDelegation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.persistence.oracle.v1beta1.FeederDelegation.class, com.persistence.oracle.v1beta1.FeederDelegation.Builder.class);
    }

    // Construct using com.persistence.oracle.v1beta1.FeederDelegation.newBuilder()
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
      feederAddress_ = "";
      validatorAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.persistence.oracle.v1beta1.GenesisProto.internal_static_persistence_oracle_v1beta1_FeederDelegation_descriptor;
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.FeederDelegation getDefaultInstanceForType() {
      return com.persistence.oracle.v1beta1.FeederDelegation.getDefaultInstance();
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.FeederDelegation build() {
      com.persistence.oracle.v1beta1.FeederDelegation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.FeederDelegation buildPartial() {
      com.persistence.oracle.v1beta1.FeederDelegation result = new com.persistence.oracle.v1beta1.FeederDelegation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.persistence.oracle.v1beta1.FeederDelegation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feederAddress_ = feederAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validatorAddress_ = validatorAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.persistence.oracle.v1beta1.FeederDelegation) {
        return mergeFrom((com.persistence.oracle.v1beta1.FeederDelegation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.persistence.oracle.v1beta1.FeederDelegation other) {
      if (other == com.persistence.oracle.v1beta1.FeederDelegation.getDefaultInstance()) return this;
      if (!other.getFeederAddress().isEmpty()) {
        feederAddress_ = other.feederAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
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
              feederAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              validatorAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object feederAddress_ = "";
    /**
     * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The feederAddress.
     */
    public java.lang.String getFeederAddress() {
      java.lang.Object ref = feederAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feederAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for feederAddress.
     */
    public com.google.protobuf.ByteString
        getFeederAddressBytes() {
      java.lang.Object ref = feederAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feederAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The feederAddress to set.
     * @return This builder for chaining.
     */
    public Builder setFeederAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feederAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeederAddress() {
      feederAddress_ = getDefaultInstance().getFeederAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string feeder_address = 1 [json_name = "feederAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for feederAddress to set.
     * @return This builder for chaining.
     */
    public Builder setFeederAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feederAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object validatorAddress_ = "";
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The validatorAddress.
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:persistence.oracle.v1beta1.FeederDelegation)
  }

  // @@protoc_insertion_point(class_scope:persistence.oracle.v1beta1.FeederDelegation)
  private static final com.persistence.oracle.v1beta1.FeederDelegation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.persistence.oracle.v1beta1.FeederDelegation();
  }

  public static com.persistence.oracle.v1beta1.FeederDelegation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeederDelegation>
      PARSER = new com.google.protobuf.AbstractParser<FeederDelegation>() {
    @java.lang.Override
    public FeederDelegation parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeederDelegation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeederDelegation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.persistence.oracle.v1beta1.FeederDelegation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

