// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/evm/v1/genesis.proto

package com.ethermint.evm.v1;

/**
 * <pre>
 * GenesisAccount defines an account to be initialized in the genesis state.
 * Its main difference between with Geth's GenesisAccount is that it uses a
 * custom storage type and that it doesn't contain the private key field.
 * </pre>
 *
 * Protobuf type {@code ethermint.evm.v1.GenesisAccount}
 */
public final class GenesisAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ethermint.evm.v1.GenesisAccount)
    GenesisAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisAccount.newBuilder() to construct.
  private GenesisAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisAccount() {
    address_ = "";
    code_ = "";
    storage_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ethermint.evm.v1.GenesisProto.internal_static_ethermint_evm_v1_GenesisAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ethermint.evm.v1.GenesisProto.internal_static_ethermint_evm_v1_GenesisAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ethermint.evm.v1.GenesisAccount.class, com.ethermint.evm.v1.GenesisAccount.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <pre>
   * address defines an ethereum hex formated address of an account
   * </pre>
   *
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
   * <pre>
   * address defines an ethereum hex formated address of an account
   * </pre>
   *
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

  public static final int CODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object code_ = "";
  /**
   * <pre>
   * code defines the hex bytes of the account code.
   * </pre>
   *
   * <code>string code = 2 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * code defines the hex bytes of the account code.
   * </pre>
   *
   * <code>string code = 2 [json_name = "code"];</code>
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.ethermint.evm.v1.State> storage_;
  /**
   * <pre>
   * storage defines the set of state key values for the account.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
   */
  @java.lang.Override
  public java.util.List<com.ethermint.evm.v1.State> getStorageList() {
    return storage_;
  }
  /**
   * <pre>
   * storage defines the set of state key values for the account.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ethermint.evm.v1.StateOrBuilder> 
      getStorageOrBuilderList() {
    return storage_;
  }
  /**
   * <pre>
   * storage defines the set of state key values for the account.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
   */
  @java.lang.Override
  public int getStorageCount() {
    return storage_.size();
  }
  /**
   * <pre>
   * storage defines the set of state key values for the account.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
   */
  @java.lang.Override
  public com.ethermint.evm.v1.State getStorage(int index) {
    return storage_.get(index);
  }
  /**
   * <pre>
   * storage defines the set of state key values for the account.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
   */
  @java.lang.Override
  public com.ethermint.evm.v1.StateOrBuilder getStorageOrBuilder(
      int index) {
    return storage_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    for (int i = 0; i < storage_.size(); i++) {
      output.writeMessage(3, storage_.get(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
    }
    for (int i = 0; i < storage_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, storage_.get(i));
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
    if (!(obj instanceof com.ethermint.evm.v1.GenesisAccount)) {
      return super.equals(obj);
    }
    com.ethermint.evm.v1.GenesisAccount other = (com.ethermint.evm.v1.GenesisAccount) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getCode()
        .equals(other.getCode())) return false;
    if (!getStorageList()
        .equals(other.getStorageList())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    if (getStorageCount() > 0) {
      hash = (37 * hash) + STORAGE_FIELD_NUMBER;
      hash = (53 * hash) + getStorageList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ethermint.evm.v1.GenesisAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ethermint.evm.v1.GenesisAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.evm.v1.GenesisAccount parseFrom(
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
  public static Builder newBuilder(com.ethermint.evm.v1.GenesisAccount prototype) {
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
   * GenesisAccount defines an account to be initialized in the genesis state.
   * Its main difference between with Geth's GenesisAccount is that it uses a
   * custom storage type and that it doesn't contain the private key field.
   * </pre>
   *
   * Protobuf type {@code ethermint.evm.v1.GenesisAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ethermint.evm.v1.GenesisAccount)
      com.ethermint.evm.v1.GenesisAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ethermint.evm.v1.GenesisProto.internal_static_ethermint_evm_v1_GenesisAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ethermint.evm.v1.GenesisProto.internal_static_ethermint_evm_v1_GenesisAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ethermint.evm.v1.GenesisAccount.class, com.ethermint.evm.v1.GenesisAccount.Builder.class);
    }

    // Construct using com.ethermint.evm.v1.GenesisAccount.newBuilder()
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
      code_ = "";
      if (storageBuilder_ == null) {
        storage_ = java.util.Collections.emptyList();
      } else {
        storage_ = null;
        storageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ethermint.evm.v1.GenesisProto.internal_static_ethermint_evm_v1_GenesisAccount_descriptor;
    }

    @java.lang.Override
    public com.ethermint.evm.v1.GenesisAccount getDefaultInstanceForType() {
      return com.ethermint.evm.v1.GenesisAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.ethermint.evm.v1.GenesisAccount build() {
      com.ethermint.evm.v1.GenesisAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ethermint.evm.v1.GenesisAccount buildPartial() {
      com.ethermint.evm.v1.GenesisAccount result = new com.ethermint.evm.v1.GenesisAccount(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ethermint.evm.v1.GenesisAccount result) {
      if (storageBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          storage_ = java.util.Collections.unmodifiableList(storage_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.storage_ = storage_;
      } else {
        result.storage_ = storageBuilder_.build();
      }
    }

    private void buildPartial0(com.ethermint.evm.v1.GenesisAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.code_ = code_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ethermint.evm.v1.GenesisAccount) {
        return mergeFrom((com.ethermint.evm.v1.GenesisAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ethermint.evm.v1.GenesisAccount other) {
      if (other == com.ethermint.evm.v1.GenesisAccount.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (storageBuilder_ == null) {
        if (!other.storage_.isEmpty()) {
          if (storage_.isEmpty()) {
            storage_ = other.storage_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureStorageIsMutable();
            storage_.addAll(other.storage_);
          }
          onChanged();
        }
      } else {
        if (!other.storage_.isEmpty()) {
          if (storageBuilder_.isEmpty()) {
            storageBuilder_.dispose();
            storageBuilder_ = null;
            storage_ = other.storage_;
            bitField0_ = (bitField0_ & ~0x00000004);
            storageBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStorageFieldBuilder() : null;
          } else {
            storageBuilder_.addAllMessages(other.storage_);
          }
        }
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
              code_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.ethermint.evm.v1.State m =
                  input.readMessage(
                      com.ethermint.evm.v1.State.parser(),
                      extensionRegistry);
              if (storageBuilder_ == null) {
                ensureStorageIsMutable();
                storage_.add(m);
              } else {
                storageBuilder_.addMessage(m);
              }
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

    private java.lang.Object address_ = "";
    /**
     * <pre>
     * address defines an ethereum hex formated address of an account
     * </pre>
     *
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
     * <pre>
     * address defines an ethereum hex formated address of an account
     * </pre>
     *
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
     * <pre>
     * address defines an ethereum hex formated address of an account
     * </pre>
     *
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
     * <pre>
     * address defines an ethereum hex formated address of an account
     * </pre>
     *
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
     * <pre>
     * address defines an ethereum hex formated address of an account
     * </pre>
     *
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

    private java.lang.Object code_ = "";
    /**
     * <pre>
     * code defines the hex bytes of the account code.
     * </pre>
     *
     * <code>string code = 2 [json_name = "code"];</code>
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * code defines the hex bytes of the account code.
     * </pre>
     *
     * <code>string code = 2 [json_name = "code"];</code>
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * code defines the hex bytes of the account code.
     * </pre>
     *
     * <code>string code = 2 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      code_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * code defines the hex bytes of the account code.
     * </pre>
     *
     * <code>string code = 2 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      code_ = getDefaultInstance().getCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * code defines the hex bytes of the account code.
     * </pre>
     *
     * <code>string code = 2 [json_name = "code"];</code>
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      code_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.ethermint.evm.v1.State> storage_ =
      java.util.Collections.emptyList();
    private void ensureStorageIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        storage_ = new java.util.ArrayList<com.ethermint.evm.v1.State>(storage_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ethermint.evm.v1.State, com.ethermint.evm.v1.State.Builder, com.ethermint.evm.v1.StateOrBuilder> storageBuilder_;

    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public java.util.List<com.ethermint.evm.v1.State> getStorageList() {
      if (storageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(storage_);
      } else {
        return storageBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public int getStorageCount() {
      if (storageBuilder_ == null) {
        return storage_.size();
      } else {
        return storageBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public com.ethermint.evm.v1.State getStorage(int index) {
      if (storageBuilder_ == null) {
        return storage_.get(index);
      } else {
        return storageBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder setStorage(
        int index, com.ethermint.evm.v1.State value) {
      if (storageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStorageIsMutable();
        storage_.set(index, value);
        onChanged();
      } else {
        storageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder setStorage(
        int index, com.ethermint.evm.v1.State.Builder builderForValue) {
      if (storageBuilder_ == null) {
        ensureStorageIsMutable();
        storage_.set(index, builderForValue.build());
        onChanged();
      } else {
        storageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder addStorage(com.ethermint.evm.v1.State value) {
      if (storageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStorageIsMutable();
        storage_.add(value);
        onChanged();
      } else {
        storageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder addStorage(
        int index, com.ethermint.evm.v1.State value) {
      if (storageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStorageIsMutable();
        storage_.add(index, value);
        onChanged();
      } else {
        storageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder addStorage(
        com.ethermint.evm.v1.State.Builder builderForValue) {
      if (storageBuilder_ == null) {
        ensureStorageIsMutable();
        storage_.add(builderForValue.build());
        onChanged();
      } else {
        storageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder addStorage(
        int index, com.ethermint.evm.v1.State.Builder builderForValue) {
      if (storageBuilder_ == null) {
        ensureStorageIsMutable();
        storage_.add(index, builderForValue.build());
        onChanged();
      } else {
        storageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder addAllStorage(
        java.lang.Iterable<? extends com.ethermint.evm.v1.State> values) {
      if (storageBuilder_ == null) {
        ensureStorageIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, storage_);
        onChanged();
      } else {
        storageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder clearStorage() {
      if (storageBuilder_ == null) {
        storage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        storageBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public Builder removeStorage(int index) {
      if (storageBuilder_ == null) {
        ensureStorageIsMutable();
        storage_.remove(index);
        onChanged();
      } else {
        storageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public com.ethermint.evm.v1.State.Builder getStorageBuilder(
        int index) {
      return getStorageFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public com.ethermint.evm.v1.StateOrBuilder getStorageOrBuilder(
        int index) {
      if (storageBuilder_ == null) {
        return storage_.get(index);  } else {
        return storageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public java.util.List<? extends com.ethermint.evm.v1.StateOrBuilder> 
         getStorageOrBuilderList() {
      if (storageBuilder_ != null) {
        return storageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(storage_);
      }
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public com.ethermint.evm.v1.State.Builder addStorageBuilder() {
      return getStorageFieldBuilder().addBuilder(
          com.ethermint.evm.v1.State.getDefaultInstance());
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public com.ethermint.evm.v1.State.Builder addStorageBuilder(
        int index) {
      return getStorageFieldBuilder().addBuilder(
          index, com.ethermint.evm.v1.State.getDefaultInstance());
    }
    /**
     * <pre>
     * storage defines the set of state key values for the account.
     * </pre>
     *
     * <code>repeated .ethermint.evm.v1.State storage = 3 [json_name = "storage", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Storage"];</code>
     */
    public java.util.List<com.ethermint.evm.v1.State.Builder> 
         getStorageBuilderList() {
      return getStorageFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ethermint.evm.v1.State, com.ethermint.evm.v1.State.Builder, com.ethermint.evm.v1.StateOrBuilder> 
        getStorageFieldBuilder() {
      if (storageBuilder_ == null) {
        storageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ethermint.evm.v1.State, com.ethermint.evm.v1.State.Builder, com.ethermint.evm.v1.StateOrBuilder>(
                storage_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        storage_ = null;
      }
      return storageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ethermint.evm.v1.GenesisAccount)
  }

  // @@protoc_insertion_point(class_scope:ethermint.evm.v1.GenesisAccount)
  private static final com.ethermint.evm.v1.GenesisAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ethermint.evm.v1.GenesisAccount();
  }

  public static com.ethermint.evm.v1.GenesisAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisAccount>
      PARSER = new com.google.protobuf.AbstractParser<GenesisAccount>() {
    @java.lang.Override
    public GenesisAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ethermint.evm.v1.GenesisAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

