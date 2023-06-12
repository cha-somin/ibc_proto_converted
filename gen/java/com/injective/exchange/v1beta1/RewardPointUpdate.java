// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.RewardPointUpdate}
 */
public final class RewardPointUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.RewardPointUpdate)
    RewardPointUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RewardPointUpdate.newBuilder() to construct.
  private RewardPointUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RewardPointUpdate() {
    accountAddress_ = "";
    newPoints_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RewardPointUpdate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_RewardPointUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_RewardPointUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.RewardPointUpdate.class, com.injective.exchange.v1beta1.RewardPointUpdate.Builder.class);
  }

  public static final int ACCOUNT_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accountAddress_ = "";
  /**
   * <code>string account_address = 1 [json_name = "accountAddress"];</code>
   * @return The accountAddress.
   */
  @java.lang.Override
  public java.lang.String getAccountAddress() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string account_address = 1 [json_name = "accountAddress"];</code>
   * @return The bytes for accountAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountAddressBytes() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_POINTS_FIELD_NUMBER = 12;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newPoints_ = "";
  /**
   * <pre>
   * new_points overwrites the current trading reward points for the account
   * </pre>
   *
   * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The newPoints.
   */
  @java.lang.Override
  public java.lang.String getNewPoints() {
    java.lang.Object ref = newPoints_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newPoints_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * new_points overwrites the current trading reward points for the account
   * </pre>
   *
   * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for newPoints.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewPointsBytes() {
    java.lang.Object ref = newPoints_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newPoints_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accountAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPoints_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, newPoints_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accountAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPoints_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, newPoints_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.RewardPointUpdate)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.RewardPointUpdate other = (com.injective.exchange.v1beta1.RewardPointUpdate) obj;

    if (!getAccountAddress()
        .equals(other.getAccountAddress())) return false;
    if (!getNewPoints()
        .equals(other.getNewPoints())) return false;
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
    hash = (37 * hash) + ACCOUNT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAccountAddress().hashCode();
    hash = (37 * hash) + NEW_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + getNewPoints().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.RewardPointUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.RewardPointUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.RewardPointUpdate parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.RewardPointUpdate prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.RewardPointUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.RewardPointUpdate)
      com.injective.exchange.v1beta1.RewardPointUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_RewardPointUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_RewardPointUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.RewardPointUpdate.class, com.injective.exchange.v1beta1.RewardPointUpdate.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.RewardPointUpdate.newBuilder()
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
      accountAddress_ = "";
      newPoints_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_RewardPointUpdate_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.RewardPointUpdate getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.RewardPointUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.RewardPointUpdate build() {
      com.injective.exchange.v1beta1.RewardPointUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.RewardPointUpdate buildPartial() {
      com.injective.exchange.v1beta1.RewardPointUpdate result = new com.injective.exchange.v1beta1.RewardPointUpdate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.RewardPointUpdate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accountAddress_ = accountAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newPoints_ = newPoints_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.RewardPointUpdate) {
        return mergeFrom((com.injective.exchange.v1beta1.RewardPointUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.RewardPointUpdate other) {
      if (other == com.injective.exchange.v1beta1.RewardPointUpdate.getDefaultInstance()) return this;
      if (!other.getAccountAddress().isEmpty()) {
        accountAddress_ = other.accountAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNewPoints().isEmpty()) {
        newPoints_ = other.newPoints_;
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
              accountAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 98: {
              newPoints_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 98
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

    private java.lang.Object accountAddress_ = "";
    /**
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return The accountAddress.
     */
    public java.lang.String getAccountAddress() {
      java.lang.Object ref = accountAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return The bytes for accountAddress.
     */
    public com.google.protobuf.ByteString
        getAccountAddressBytes() {
      java.lang.Object ref = accountAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @param value The accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accountAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountAddress() {
      accountAddress_ = getDefaultInstance().getAccountAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @param value The bytes for accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accountAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object newPoints_ = "";
    /**
     * <pre>
     * new_points overwrites the current trading reward points for the account
     * </pre>
     *
     * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The newPoints.
     */
    public java.lang.String getNewPoints() {
      java.lang.Object ref = newPoints_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newPoints_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * new_points overwrites the current trading reward points for the account
     * </pre>
     *
     * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for newPoints.
     */
    public com.google.protobuf.ByteString
        getNewPointsBytes() {
      java.lang.Object ref = newPoints_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newPoints_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * new_points overwrites the current trading reward points for the account
     * </pre>
     *
     * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The newPoints to set.
     * @return This builder for chaining.
     */
    public Builder setNewPoints(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newPoints_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_points overwrites the current trading reward points for the account
     * </pre>
     *
     * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPoints() {
      newPoints_ = getDefaultInstance().getNewPoints();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_points overwrites the current trading reward points for the account
     * </pre>
     *
     * <code>string new_points = 12 [json_name = "newPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for newPoints to set.
     * @return This builder for chaining.
     */
    public Builder setNewPointsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newPoints_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.RewardPointUpdate)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.RewardPointUpdate)
  private static final com.injective.exchange.v1beta1.RewardPointUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.RewardPointUpdate();
  }

  public static com.injective.exchange.v1beta1.RewardPointUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RewardPointUpdate>
      PARSER = new com.google.protobuf.AbstractParser<RewardPointUpdate>() {
    @java.lang.Override
    public RewardPointUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<RewardPointUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RewardPointUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.RewardPointUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

