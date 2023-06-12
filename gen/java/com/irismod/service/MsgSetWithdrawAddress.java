// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/tx.proto

package com.irismod.service;

/**
 * <pre>
 * MsgSetWithdrawAddress defines an SDK message to set the withdrawal address for a provider
 * </pre>
 *
 * Protobuf type {@code irismod.service.MsgSetWithdrawAddress}
 */
public final class MsgSetWithdrawAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.service.MsgSetWithdrawAddress)
    MsgSetWithdrawAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetWithdrawAddress.newBuilder() to construct.
  private MsgSetWithdrawAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetWithdrawAddress() {
    owner_ = "";
    withdrawAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSetWithdrawAddress();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.service.TxProto.internal_static_irismod_service_MsgSetWithdrawAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.service.TxProto.internal_static_irismod_service_MsgSetWithdrawAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.service.MsgSetWithdrawAddress.class, com.irismod.service.MsgSetWithdrawAddress.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITHDRAW_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object withdrawAddress_ = "";
  /**
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
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
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, withdrawAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, withdrawAddress_);
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
    if (!(obj instanceof com.irismod.service.MsgSetWithdrawAddress)) {
      return super.equals(obj);
    }
    com.irismod.service.MsgSetWithdrawAddress other = (com.irismod.service.MsgSetWithdrawAddress) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (!getWithdrawAddress()
        .equals(other.getWithdrawAddress())) return false;
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
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + WITHDRAW_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getWithdrawAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.service.MsgSetWithdrawAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.service.MsgSetWithdrawAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.MsgSetWithdrawAddress parseFrom(
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
  public static Builder newBuilder(com.irismod.service.MsgSetWithdrawAddress prototype) {
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
   * MsgSetWithdrawAddress defines an SDK message to set the withdrawal address for a provider
   * </pre>
   *
   * Protobuf type {@code irismod.service.MsgSetWithdrawAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.service.MsgSetWithdrawAddress)
      com.irismod.service.MsgSetWithdrawAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.service.TxProto.internal_static_irismod_service_MsgSetWithdrawAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.service.TxProto.internal_static_irismod_service_MsgSetWithdrawAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.service.MsgSetWithdrawAddress.class, com.irismod.service.MsgSetWithdrawAddress.Builder.class);
    }

    // Construct using com.irismod.service.MsgSetWithdrawAddress.newBuilder()
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
      owner_ = "";
      withdrawAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.service.TxProto.internal_static_irismod_service_MsgSetWithdrawAddress_descriptor;
    }

    @java.lang.Override
    public com.irismod.service.MsgSetWithdrawAddress getDefaultInstanceForType() {
      return com.irismod.service.MsgSetWithdrawAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.service.MsgSetWithdrawAddress build() {
      com.irismod.service.MsgSetWithdrawAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.service.MsgSetWithdrawAddress buildPartial() {
      com.irismod.service.MsgSetWithdrawAddress result = new com.irismod.service.MsgSetWithdrawAddress(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.service.MsgSetWithdrawAddress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withdrawAddress_ = withdrawAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.service.MsgSetWithdrawAddress) {
        return mergeFrom((com.irismod.service.MsgSetWithdrawAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.service.MsgSetWithdrawAddress other) {
      if (other == com.irismod.service.MsgSetWithdrawAddress.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWithdrawAddress().isEmpty()) {
        withdrawAddress_ = other.withdrawAddress_;
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
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              withdrawAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object owner_ = "";
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object withdrawAddress_ = "";
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
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
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
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
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @param value The withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      withdrawAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithdrawAddress() {
      withdrawAddress_ = getDefaultInstance().getWithdrawAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @param value The bytes for withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      withdrawAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:irismod.service.MsgSetWithdrawAddress)
  }

  // @@protoc_insertion_point(class_scope:irismod.service.MsgSetWithdrawAddress)
  private static final com.irismod.service.MsgSetWithdrawAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.service.MsgSetWithdrawAddress();
  }

  public static com.irismod.service.MsgSetWithdrawAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetWithdrawAddress>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetWithdrawAddress>() {
    @java.lang.Override
    public MsgSetWithdrawAddress parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSetWithdrawAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetWithdrawAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.service.MsgSetWithdrawAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

