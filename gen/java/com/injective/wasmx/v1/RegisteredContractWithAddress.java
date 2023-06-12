// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/wasmx/v1/genesis.proto

package com.injective.wasmx.v1;

/**
 * Protobuf type {@code injective.wasmx.v1.RegisteredContractWithAddress}
 */
public final class RegisteredContractWithAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.wasmx.v1.RegisteredContractWithAddress)
    RegisteredContractWithAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisteredContractWithAddress.newBuilder() to construct.
  private RegisteredContractWithAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisteredContractWithAddress() {
    address_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisteredContractWithAddress();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.wasmx.v1.GenesisProto.internal_static_injective_wasmx_v1_RegisteredContractWithAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.wasmx.v1.GenesisProto.internal_static_injective_wasmx_v1_RegisteredContractWithAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.wasmx.v1.RegisteredContractWithAddress.class, com.injective.wasmx.v1.RegisteredContractWithAddress.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGISTERED_CONTRACT_FIELD_NUMBER = 2;
  private com.injective.wasmx.v1.RegisteredContract registeredContract_;
  /**
   * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
   * @return Whether the registeredContract field is set.
   */
  @java.lang.Override
  public boolean hasRegisteredContract() {
    return registeredContract_ != null;
  }
  /**
   * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
   * @return The registeredContract.
   */
  @java.lang.Override
  public com.injective.wasmx.v1.RegisteredContract getRegisteredContract() {
    return registeredContract_ == null ? com.injective.wasmx.v1.RegisteredContract.getDefaultInstance() : registeredContract_;
  }
  /**
   * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
   */
  @java.lang.Override
  public com.injective.wasmx.v1.RegisteredContractOrBuilder getRegisteredContractOrBuilder() {
    return registeredContract_ == null ? com.injective.wasmx.v1.RegisteredContract.getDefaultInstance() : registeredContract_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (registeredContract_ != null) {
      output.writeMessage(2, getRegisteredContract());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (registeredContract_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRegisteredContract());
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
    if (!(obj instanceof com.injective.wasmx.v1.RegisteredContractWithAddress)) {
      return super.equals(obj);
    }
    com.injective.wasmx.v1.RegisteredContractWithAddress other = (com.injective.wasmx.v1.RegisteredContractWithAddress) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (hasRegisteredContract() != other.hasRegisteredContract()) return false;
    if (hasRegisteredContract()) {
      if (!getRegisteredContract()
          .equals(other.getRegisteredContract())) return false;
    }
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (hasRegisteredContract()) {
      hash = (37 * hash) + REGISTERED_CONTRACT_FIELD_NUMBER;
      hash = (53 * hash) + getRegisteredContract().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.wasmx.v1.RegisteredContractWithAddress parseFrom(
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
  public static Builder newBuilder(com.injective.wasmx.v1.RegisteredContractWithAddress prototype) {
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
   * Protobuf type {@code injective.wasmx.v1.RegisteredContractWithAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.wasmx.v1.RegisteredContractWithAddress)
      com.injective.wasmx.v1.RegisteredContractWithAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.wasmx.v1.GenesisProto.internal_static_injective_wasmx_v1_RegisteredContractWithAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.wasmx.v1.GenesisProto.internal_static_injective_wasmx_v1_RegisteredContractWithAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.wasmx.v1.RegisteredContractWithAddress.class, com.injective.wasmx.v1.RegisteredContractWithAddress.Builder.class);
    }

    // Construct using com.injective.wasmx.v1.RegisteredContractWithAddress.newBuilder()
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
      address_ = "";
      registeredContract_ = null;
      if (registeredContractBuilder_ != null) {
        registeredContractBuilder_.dispose();
        registeredContractBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.wasmx.v1.GenesisProto.internal_static_injective_wasmx_v1_RegisteredContractWithAddress_descriptor;
    }

    @java.lang.Override
    public com.injective.wasmx.v1.RegisteredContractWithAddress getDefaultInstanceForType() {
      return com.injective.wasmx.v1.RegisteredContractWithAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.wasmx.v1.RegisteredContractWithAddress build() {
      com.injective.wasmx.v1.RegisteredContractWithAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.wasmx.v1.RegisteredContractWithAddress buildPartial() {
      com.injective.wasmx.v1.RegisteredContractWithAddress result = new com.injective.wasmx.v1.RegisteredContractWithAddress(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.wasmx.v1.RegisteredContractWithAddress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.registeredContract_ = registeredContractBuilder_ == null
            ? registeredContract_
            : registeredContractBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.wasmx.v1.RegisteredContractWithAddress) {
        return mergeFrom((com.injective.wasmx.v1.RegisteredContractWithAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.wasmx.v1.RegisteredContractWithAddress other) {
      if (other == com.injective.wasmx.v1.RegisteredContractWithAddress.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRegisteredContract()) {
        mergeRegisteredContract(other.getRegisteredContract());
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRegisteredContractFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.injective.wasmx.v1.RegisteredContract registeredContract_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.wasmx.v1.RegisteredContract, com.injective.wasmx.v1.RegisteredContract.Builder, com.injective.wasmx.v1.RegisteredContractOrBuilder> registeredContractBuilder_;
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     * @return Whether the registeredContract field is set.
     */
    public boolean hasRegisteredContract() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     * @return The registeredContract.
     */
    public com.injective.wasmx.v1.RegisteredContract getRegisteredContract() {
      if (registeredContractBuilder_ == null) {
        return registeredContract_ == null ? com.injective.wasmx.v1.RegisteredContract.getDefaultInstance() : registeredContract_;
      } else {
        return registeredContractBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public Builder setRegisteredContract(com.injective.wasmx.v1.RegisteredContract value) {
      if (registeredContractBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registeredContract_ = value;
      } else {
        registeredContractBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public Builder setRegisteredContract(
        com.injective.wasmx.v1.RegisteredContract.Builder builderForValue) {
      if (registeredContractBuilder_ == null) {
        registeredContract_ = builderForValue.build();
      } else {
        registeredContractBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public Builder mergeRegisteredContract(com.injective.wasmx.v1.RegisteredContract value) {
      if (registeredContractBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          registeredContract_ != null &&
          registeredContract_ != com.injective.wasmx.v1.RegisteredContract.getDefaultInstance()) {
          getRegisteredContractBuilder().mergeFrom(value);
        } else {
          registeredContract_ = value;
        }
      } else {
        registeredContractBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public Builder clearRegisteredContract() {
      bitField0_ = (bitField0_ & ~0x00000002);
      registeredContract_ = null;
      if (registeredContractBuilder_ != null) {
        registeredContractBuilder_.dispose();
        registeredContractBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public com.injective.wasmx.v1.RegisteredContract.Builder getRegisteredContractBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRegisteredContractFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    public com.injective.wasmx.v1.RegisteredContractOrBuilder getRegisteredContractOrBuilder() {
      if (registeredContractBuilder_ != null) {
        return registeredContractBuilder_.getMessageOrBuilder();
      } else {
        return registeredContract_ == null ?
            com.injective.wasmx.v1.RegisteredContract.getDefaultInstance() : registeredContract_;
      }
    }
    /**
     * <code>.injective.wasmx.v1.RegisteredContract registered_contract = 2 [json_name = "registeredContract"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.wasmx.v1.RegisteredContract, com.injective.wasmx.v1.RegisteredContract.Builder, com.injective.wasmx.v1.RegisteredContractOrBuilder> 
        getRegisteredContractFieldBuilder() {
      if (registeredContractBuilder_ == null) {
        registeredContractBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.wasmx.v1.RegisteredContract, com.injective.wasmx.v1.RegisteredContract.Builder, com.injective.wasmx.v1.RegisteredContractOrBuilder>(
                getRegisteredContract(),
                getParentForChildren(),
                isClean());
        registeredContract_ = null;
      }
      return registeredContractBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.wasmx.v1.RegisteredContractWithAddress)
  }

  // @@protoc_insertion_point(class_scope:injective.wasmx.v1.RegisteredContractWithAddress)
  private static final com.injective.wasmx.v1.RegisteredContractWithAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.wasmx.v1.RegisteredContractWithAddress();
  }

  public static com.injective.wasmx.v1.RegisteredContractWithAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisteredContractWithAddress>
      PARSER = new com.google.protobuf.AbstractParser<RegisteredContractWithAddress>() {
    @java.lang.Override
    public RegisteredContractWithAddress parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisteredContractWithAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisteredContractWithAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.wasmx.v1.RegisteredContractWithAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

