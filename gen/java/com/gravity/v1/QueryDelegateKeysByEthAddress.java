// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.QueryDelegateKeysByEthAddress}
 */
public final class QueryDelegateKeysByEthAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.QueryDelegateKeysByEthAddress)
    QueryDelegateKeysByEthAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegateKeysByEthAddress.newBuilder() to construct.
  private QueryDelegateKeysByEthAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegateKeysByEthAddress() {
    ethAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegateKeysByEthAddress();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByEthAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByEthAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.QueryDelegateKeysByEthAddress.class, com.gravity.v1.QueryDelegateKeysByEthAddress.Builder.class);
  }

  public static final int ETH_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ethAddress_ = "";
  /**
   * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
   * @return The ethAddress.
   */
  @java.lang.Override
  public java.lang.String getEthAddress() {
    java.lang.Object ref = ethAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ethAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
   * @return The bytes for ethAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEthAddressBytes() {
    java.lang.Object ref = ethAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ethAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ethAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ethAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ethAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ethAddress_);
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
    if (!(obj instanceof com.gravity.v1.QueryDelegateKeysByEthAddress)) {
      return super.equals(obj);
    }
    com.gravity.v1.QueryDelegateKeysByEthAddress other = (com.gravity.v1.QueryDelegateKeysByEthAddress) obj;

    if (!getEthAddress()
        .equals(other.getEthAddress())) return false;
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
    hash = (37 * hash) + ETH_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEthAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryDelegateKeysByEthAddress parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.QueryDelegateKeysByEthAddress prototype) {
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
   * Protobuf type {@code gravity.v1.QueryDelegateKeysByEthAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.QueryDelegateKeysByEthAddress)
      com.gravity.v1.QueryDelegateKeysByEthAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByEthAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByEthAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.QueryDelegateKeysByEthAddress.class, com.gravity.v1.QueryDelegateKeysByEthAddress.Builder.class);
    }

    // Construct using com.gravity.v1.QueryDelegateKeysByEthAddress.newBuilder()
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
      ethAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByEthAddress_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByEthAddress getDefaultInstanceForType() {
      return com.gravity.v1.QueryDelegateKeysByEthAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByEthAddress build() {
      com.gravity.v1.QueryDelegateKeysByEthAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByEthAddress buildPartial() {
      com.gravity.v1.QueryDelegateKeysByEthAddress result = new com.gravity.v1.QueryDelegateKeysByEthAddress(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.QueryDelegateKeysByEthAddress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ethAddress_ = ethAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.QueryDelegateKeysByEthAddress) {
        return mergeFrom((com.gravity.v1.QueryDelegateKeysByEthAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.QueryDelegateKeysByEthAddress other) {
      if (other == com.gravity.v1.QueryDelegateKeysByEthAddress.getDefaultInstance()) return this;
      if (!other.getEthAddress().isEmpty()) {
        ethAddress_ = other.ethAddress_;
        bitField0_ |= 0x00000001;
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
              ethAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object ethAddress_ = "";
    /**
     * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
     * @return The ethAddress.
     */
    public java.lang.String getEthAddress() {
      java.lang.Object ref = ethAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ethAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
     * @return The bytes for ethAddress.
     */
    public com.google.protobuf.ByteString
        getEthAddressBytes() {
      java.lang.Object ref = ethAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ethAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
     * @param value The ethAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEthAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ethAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEthAddress() {
      ethAddress_ = getDefaultInstance().getEthAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string eth_address = 1 [json_name = "ethAddress"];</code>
     * @param value The bytes for ethAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEthAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ethAddress_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.QueryDelegateKeysByEthAddress)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.QueryDelegateKeysByEthAddress)
  private static final com.gravity.v1.QueryDelegateKeysByEthAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.QueryDelegateKeysByEthAddress();
  }

  public static com.gravity.v1.QueryDelegateKeysByEthAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegateKeysByEthAddress>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegateKeysByEthAddress>() {
    @java.lang.Override
    public QueryDelegateKeysByEthAddress parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegateKeysByEthAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegateKeysByEthAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.QueryDelegateKeysByEthAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

