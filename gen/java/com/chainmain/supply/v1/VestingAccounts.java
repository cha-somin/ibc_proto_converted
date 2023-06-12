// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/supply/v1/accounts.proto

package com.chainmain.supply.v1;

/**
 * <pre>
 * VestingAccounts stored in keeper
 * </pre>
 *
 * Protobuf type {@code chainmain.supply.v1.VestingAccounts}
 */
public final class VestingAccounts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chainmain.supply.v1.VestingAccounts)
    VestingAccountsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VestingAccounts.newBuilder() to construct.
  private VestingAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VestingAccounts() {
    addresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VestingAccounts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.chainmain.supply.v1.AccountsProto.internal_static_chainmain_supply_v1_VestingAccounts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.chainmain.supply.v1.AccountsProto.internal_static_chainmain_supply_v1_VestingAccounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.chainmain.supply.v1.VestingAccounts.class, com.chainmain.supply.v1.VestingAccounts.Builder.class);
  }

  public static final int ADDRESSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList addresses_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * addresses defines addresses of all the vesting accounts at genesis
   * </pre>
   *
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @return A list containing the addresses.
   */
  public com.google.protobuf.ProtocolStringList
      getAddressesList() {
    return addresses_;
  }
  /**
   * <pre>
   * addresses defines addresses of all the vesting accounts at genesis
   * </pre>
   *
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @return The count of addresses.
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <pre>
   * addresses defines addresses of all the vesting accounts at genesis
   * </pre>
   *
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  public java.lang.String getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <pre>
   * addresses defines addresses of all the vesting accounts at genesis
   * </pre>
   *
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  public com.google.protobuf.ByteString
      getAddressesBytes(int index) {
    return addresses_.getByteString(index);
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
    for (int i = 0; i < addresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addresses_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < addresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressesList().size();
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
    if (!(obj instanceof com.chainmain.supply.v1.VestingAccounts)) {
      return super.equals(obj);
    }
    com.chainmain.supply.v1.VestingAccounts other = (com.chainmain.supply.v1.VestingAccounts) obj;

    if (!getAddressesList()
        .equals(other.getAddressesList())) return false;
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
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.chainmain.supply.v1.VestingAccounts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.chainmain.supply.v1.VestingAccounts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.supply.v1.VestingAccounts parseFrom(
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
  public static Builder newBuilder(com.chainmain.supply.v1.VestingAccounts prototype) {
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
   * VestingAccounts stored in keeper
   * </pre>
   *
   * Protobuf type {@code chainmain.supply.v1.VestingAccounts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chainmain.supply.v1.VestingAccounts)
      com.chainmain.supply.v1.VestingAccountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chainmain.supply.v1.AccountsProto.internal_static_chainmain_supply_v1_VestingAccounts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chainmain.supply.v1.AccountsProto.internal_static_chainmain_supply_v1_VestingAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chainmain.supply.v1.VestingAccounts.class, com.chainmain.supply.v1.VestingAccounts.Builder.class);
    }

    // Construct using com.chainmain.supply.v1.VestingAccounts.newBuilder()
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
      addresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.chainmain.supply.v1.AccountsProto.internal_static_chainmain_supply_v1_VestingAccounts_descriptor;
    }

    @java.lang.Override
    public com.chainmain.supply.v1.VestingAccounts getDefaultInstanceForType() {
      return com.chainmain.supply.v1.VestingAccounts.getDefaultInstance();
    }

    @java.lang.Override
    public com.chainmain.supply.v1.VestingAccounts build() {
      com.chainmain.supply.v1.VestingAccounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.chainmain.supply.v1.VestingAccounts buildPartial() {
      com.chainmain.supply.v1.VestingAccounts result = new com.chainmain.supply.v1.VestingAccounts(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.chainmain.supply.v1.VestingAccounts result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        addresses_.makeImmutable();
        result.addresses_ = addresses_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.chainmain.supply.v1.VestingAccounts) {
        return mergeFrom((com.chainmain.supply.v1.VestingAccounts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.chainmain.supply.v1.VestingAccounts other) {
      if (other == com.chainmain.supply.v1.VestingAccounts.getDefaultInstance()) return this;
      if (!other.addresses_.isEmpty()) {
        if (addresses_.isEmpty()) {
          addresses_ = other.addresses_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAddressesIsMutable();
          addresses_.addAll(other.addresses_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAddressesIsMutable();
              addresses_.add(s);
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

    private com.google.protobuf.LazyStringArrayList addresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAddressesIsMutable() {
      if (!addresses_.isModifiable()) {
        addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @return A list containing the addresses.
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      addresses_.makeImmutable();
      return addresses_;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @return The count of addresses.
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param index The index of the element to return.
     * @return The addresses at the given index.
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the addresses at the given index.
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     * @return This builder for chaining.
     */
    public Builder setAddresses(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAddressesIsMutable();
      addresses_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param value The addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAddresses(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAddressesIsMutable();
      addresses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param values The addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addresses_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddresses() {
      addresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * addresses defines addresses of all the vesting accounts at genesis
     * </pre>
     *
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param value The bytes of the addresses to add.
     * @return This builder for chaining.
     */
    public Builder addAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAddressesIsMutable();
      addresses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:chainmain.supply.v1.VestingAccounts)
  }

  // @@protoc_insertion_point(class_scope:chainmain.supply.v1.VestingAccounts)
  private static final com.chainmain.supply.v1.VestingAccounts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.chainmain.supply.v1.VestingAccounts();
  }

  public static com.chainmain.supply.v1.VestingAccounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VestingAccounts>
      PARSER = new com.google.protobuf.AbstractParser<VestingAccounts>() {
    @java.lang.Override
    public VestingAccounts parsePartialFrom(
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

  public static com.google.protobuf.Parser<VestingAccounts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VestingAccounts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.chainmain.supply.v1.VestingAccounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

