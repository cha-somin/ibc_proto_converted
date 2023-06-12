// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/circuit/v1/types.proto

package com.cosmos.circuit.v1;

/**
 * <pre>
 * GenesisState is the state that must be provided at genesis.
 * </pre>
 *
 * Protobuf type {@code cosmos.circuit.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.circuit.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    accountPermissions_ = java.util.Collections.emptyList();
    disabledTypeUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.circuit.v1.TypesProto.internal_static_cosmos_circuit_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.circuit.v1.TypesProto.internal_static_cosmos_circuit_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.circuit.v1.GenesisState.class, com.cosmos.circuit.v1.GenesisState.Builder.class);
  }

  public static final int ACCOUNT_PERMISSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.circuit.v1.GenesisAccountPermissions> accountPermissions_;
  /**
   * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.circuit.v1.GenesisAccountPermissions> getAccountPermissionsList() {
    return accountPermissions_;
  }
  /**
   * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder> 
      getAccountPermissionsOrBuilderList() {
    return accountPermissions_;
  }
  /**
   * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
   */
  @java.lang.Override
  public int getAccountPermissionsCount() {
    return accountPermissions_.size();
  }
  /**
   * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
   */
  @java.lang.Override
  public com.cosmos.circuit.v1.GenesisAccountPermissions getAccountPermissions(int index) {
    return accountPermissions_.get(index);
  }
  /**
   * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
   */
  @java.lang.Override
  public com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder getAccountPermissionsOrBuilder(
      int index) {
    return accountPermissions_.get(index);
  }

  public static final int DISABLED_TYPE_URLS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList disabledTypeUrls_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
   * @return A list containing the disabledTypeUrls.
   */
  public com.google.protobuf.ProtocolStringList
      getDisabledTypeUrlsList() {
    return disabledTypeUrls_;
  }
  /**
   * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
   * @return The count of disabledTypeUrls.
   */
  public int getDisabledTypeUrlsCount() {
    return disabledTypeUrls_.size();
  }
  /**
   * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
   * @param index The index of the element to return.
   * @return The disabledTypeUrls at the given index.
   */
  public java.lang.String getDisabledTypeUrls(int index) {
    return disabledTypeUrls_.get(index);
  }
  /**
   * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the disabledTypeUrls at the given index.
   */
  public com.google.protobuf.ByteString
      getDisabledTypeUrlsBytes(int index) {
    return disabledTypeUrls_.getByteString(index);
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
    for (int i = 0; i < accountPermissions_.size(); i++) {
      output.writeMessage(1, accountPermissions_.get(i));
    }
    for (int i = 0; i < disabledTypeUrls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, disabledTypeUrls_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accountPermissions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accountPermissions_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < disabledTypeUrls_.size(); i++) {
        dataSize += computeStringSizeNoTag(disabledTypeUrls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDisabledTypeUrlsList().size();
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
    if (!(obj instanceof com.cosmos.circuit.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.cosmos.circuit.v1.GenesisState other = (com.cosmos.circuit.v1.GenesisState) obj;

    if (!getAccountPermissionsList()
        .equals(other.getAccountPermissionsList())) return false;
    if (!getDisabledTypeUrlsList()
        .equals(other.getDisabledTypeUrlsList())) return false;
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
    if (getAccountPermissionsCount() > 0) {
      hash = (37 * hash) + ACCOUNT_PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountPermissionsList().hashCode();
    }
    if (getDisabledTypeUrlsCount() > 0) {
      hash = (37 * hash) + DISABLED_TYPE_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getDisabledTypeUrlsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.circuit.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.circuit.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.cosmos.circuit.v1.GenesisState prototype) {
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
   * GenesisState is the state that must be provided at genesis.
   * </pre>
   *
   * Protobuf type {@code cosmos.circuit.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.circuit.v1.GenesisState)
      com.cosmos.circuit.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.circuit.v1.TypesProto.internal_static_cosmos_circuit_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.circuit.v1.TypesProto.internal_static_cosmos_circuit_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.circuit.v1.GenesisState.class, com.cosmos.circuit.v1.GenesisState.Builder.class);
    }

    // Construct using com.cosmos.circuit.v1.GenesisState.newBuilder()
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
      if (accountPermissionsBuilder_ == null) {
        accountPermissions_ = java.util.Collections.emptyList();
      } else {
        accountPermissions_ = null;
        accountPermissionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      disabledTypeUrls_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.circuit.v1.TypesProto.internal_static_cosmos_circuit_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.GenesisState getDefaultInstanceForType() {
      return com.cosmos.circuit.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.GenesisState build() {
      com.cosmos.circuit.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.GenesisState buildPartial() {
      com.cosmos.circuit.v1.GenesisState result = new com.cosmos.circuit.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.circuit.v1.GenesisState result) {
      if (accountPermissionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accountPermissions_ = java.util.Collections.unmodifiableList(accountPermissions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accountPermissions_ = accountPermissions_;
      } else {
        result.accountPermissions_ = accountPermissionsBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.circuit.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        disabledTypeUrls_.makeImmutable();
        result.disabledTypeUrls_ = disabledTypeUrls_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.circuit.v1.GenesisState) {
        return mergeFrom((com.cosmos.circuit.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.circuit.v1.GenesisState other) {
      if (other == com.cosmos.circuit.v1.GenesisState.getDefaultInstance()) return this;
      if (accountPermissionsBuilder_ == null) {
        if (!other.accountPermissions_.isEmpty()) {
          if (accountPermissions_.isEmpty()) {
            accountPermissions_ = other.accountPermissions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountPermissionsIsMutable();
            accountPermissions_.addAll(other.accountPermissions_);
          }
          onChanged();
        }
      } else {
        if (!other.accountPermissions_.isEmpty()) {
          if (accountPermissionsBuilder_.isEmpty()) {
            accountPermissionsBuilder_.dispose();
            accountPermissionsBuilder_ = null;
            accountPermissions_ = other.accountPermissions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountPermissionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountPermissionsFieldBuilder() : null;
          } else {
            accountPermissionsBuilder_.addAllMessages(other.accountPermissions_);
          }
        }
      }
      if (!other.disabledTypeUrls_.isEmpty()) {
        if (disabledTypeUrls_.isEmpty()) {
          disabledTypeUrls_ = other.disabledTypeUrls_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDisabledTypeUrlsIsMutable();
          disabledTypeUrls_.addAll(other.disabledTypeUrls_);
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
              com.cosmos.circuit.v1.GenesisAccountPermissions m =
                  input.readMessage(
                      com.cosmos.circuit.v1.GenesisAccountPermissions.parser(),
                      extensionRegistry);
              if (accountPermissionsBuilder_ == null) {
                ensureAccountPermissionsIsMutable();
                accountPermissions_.add(m);
              } else {
                accountPermissionsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDisabledTypeUrlsIsMutable();
              disabledTypeUrls_.add(s);
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

    private java.util.List<com.cosmos.circuit.v1.GenesisAccountPermissions> accountPermissions_ =
      java.util.Collections.emptyList();
    private void ensureAccountPermissionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accountPermissions_ = new java.util.ArrayList<com.cosmos.circuit.v1.GenesisAccountPermissions>(accountPermissions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.circuit.v1.GenesisAccountPermissions, com.cosmos.circuit.v1.GenesisAccountPermissions.Builder, com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder> accountPermissionsBuilder_;

    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public java.util.List<com.cosmos.circuit.v1.GenesisAccountPermissions> getAccountPermissionsList() {
      if (accountPermissionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accountPermissions_);
      } else {
        return accountPermissionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public int getAccountPermissionsCount() {
      if (accountPermissionsBuilder_ == null) {
        return accountPermissions_.size();
      } else {
        return accountPermissionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public com.cosmos.circuit.v1.GenesisAccountPermissions getAccountPermissions(int index) {
      if (accountPermissionsBuilder_ == null) {
        return accountPermissions_.get(index);
      } else {
        return accountPermissionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder setAccountPermissions(
        int index, com.cosmos.circuit.v1.GenesisAccountPermissions value) {
      if (accountPermissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountPermissionsIsMutable();
        accountPermissions_.set(index, value);
        onChanged();
      } else {
        accountPermissionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder setAccountPermissions(
        int index, com.cosmos.circuit.v1.GenesisAccountPermissions.Builder builderForValue) {
      if (accountPermissionsBuilder_ == null) {
        ensureAccountPermissionsIsMutable();
        accountPermissions_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountPermissionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder addAccountPermissions(com.cosmos.circuit.v1.GenesisAccountPermissions value) {
      if (accountPermissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountPermissionsIsMutable();
        accountPermissions_.add(value);
        onChanged();
      } else {
        accountPermissionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder addAccountPermissions(
        int index, com.cosmos.circuit.v1.GenesisAccountPermissions value) {
      if (accountPermissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountPermissionsIsMutable();
        accountPermissions_.add(index, value);
        onChanged();
      } else {
        accountPermissionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder addAccountPermissions(
        com.cosmos.circuit.v1.GenesisAccountPermissions.Builder builderForValue) {
      if (accountPermissionsBuilder_ == null) {
        ensureAccountPermissionsIsMutable();
        accountPermissions_.add(builderForValue.build());
        onChanged();
      } else {
        accountPermissionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder addAccountPermissions(
        int index, com.cosmos.circuit.v1.GenesisAccountPermissions.Builder builderForValue) {
      if (accountPermissionsBuilder_ == null) {
        ensureAccountPermissionsIsMutable();
        accountPermissions_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountPermissionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder addAllAccountPermissions(
        java.lang.Iterable<? extends com.cosmos.circuit.v1.GenesisAccountPermissions> values) {
      if (accountPermissionsBuilder_ == null) {
        ensureAccountPermissionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accountPermissions_);
        onChanged();
      } else {
        accountPermissionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder clearAccountPermissions() {
      if (accountPermissionsBuilder_ == null) {
        accountPermissions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountPermissionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public Builder removeAccountPermissions(int index) {
      if (accountPermissionsBuilder_ == null) {
        ensureAccountPermissionsIsMutable();
        accountPermissions_.remove(index);
        onChanged();
      } else {
        accountPermissionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public com.cosmos.circuit.v1.GenesisAccountPermissions.Builder getAccountPermissionsBuilder(
        int index) {
      return getAccountPermissionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder getAccountPermissionsOrBuilder(
        int index) {
      if (accountPermissionsBuilder_ == null) {
        return accountPermissions_.get(index);  } else {
        return accountPermissionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public java.util.List<? extends com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder> 
         getAccountPermissionsOrBuilderList() {
      if (accountPermissionsBuilder_ != null) {
        return accountPermissionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accountPermissions_);
      }
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public com.cosmos.circuit.v1.GenesisAccountPermissions.Builder addAccountPermissionsBuilder() {
      return getAccountPermissionsFieldBuilder().addBuilder(
          com.cosmos.circuit.v1.GenesisAccountPermissions.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public com.cosmos.circuit.v1.GenesisAccountPermissions.Builder addAccountPermissionsBuilder(
        int index) {
      return getAccountPermissionsFieldBuilder().addBuilder(
          index, com.cosmos.circuit.v1.GenesisAccountPermissions.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.circuit.v1.GenesisAccountPermissions account_permissions = 1 [json_name = "accountPermissions"];</code>
     */
    public java.util.List<com.cosmos.circuit.v1.GenesisAccountPermissions.Builder> 
         getAccountPermissionsBuilderList() {
      return getAccountPermissionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.circuit.v1.GenesisAccountPermissions, com.cosmos.circuit.v1.GenesisAccountPermissions.Builder, com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder> 
        getAccountPermissionsFieldBuilder() {
      if (accountPermissionsBuilder_ == null) {
        accountPermissionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.circuit.v1.GenesisAccountPermissions, com.cosmos.circuit.v1.GenesisAccountPermissions.Builder, com.cosmos.circuit.v1.GenesisAccountPermissionsOrBuilder>(
                accountPermissions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accountPermissions_ = null;
      }
      return accountPermissionsBuilder_;
    }

    private com.google.protobuf.LazyStringArrayList disabledTypeUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDisabledTypeUrlsIsMutable() {
      if (!disabledTypeUrls_.isModifiable()) {
        disabledTypeUrls_ = new com.google.protobuf.LazyStringArrayList(disabledTypeUrls_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @return A list containing the disabledTypeUrls.
     */
    public com.google.protobuf.ProtocolStringList
        getDisabledTypeUrlsList() {
      disabledTypeUrls_.makeImmutable();
      return disabledTypeUrls_;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @return The count of disabledTypeUrls.
     */
    public int getDisabledTypeUrlsCount() {
      return disabledTypeUrls_.size();
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param index The index of the element to return.
     * @return The disabledTypeUrls at the given index.
     */
    public java.lang.String getDisabledTypeUrls(int index) {
      return disabledTypeUrls_.get(index);
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the disabledTypeUrls at the given index.
     */
    public com.google.protobuf.ByteString
        getDisabledTypeUrlsBytes(int index) {
      return disabledTypeUrls_.getByteString(index);
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param index The index to set the value at.
     * @param value The disabledTypeUrls to set.
     * @return This builder for chaining.
     */
    public Builder setDisabledTypeUrls(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDisabledTypeUrlsIsMutable();
      disabledTypeUrls_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param value The disabledTypeUrls to add.
     * @return This builder for chaining.
     */
    public Builder addDisabledTypeUrls(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDisabledTypeUrlsIsMutable();
      disabledTypeUrls_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param values The disabledTypeUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAllDisabledTypeUrls(
        java.lang.Iterable<java.lang.String> values) {
      ensureDisabledTypeUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, disabledTypeUrls_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabledTypeUrls() {
      disabledTypeUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string disabled_type_urls = 2 [json_name = "disabledTypeUrls"];</code>
     * @param value The bytes of the disabledTypeUrls to add.
     * @return This builder for chaining.
     */
    public Builder addDisabledTypeUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDisabledTypeUrlsIsMutable();
      disabledTypeUrls_.add(value);
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


    // @@protoc_insertion_point(builder_scope:cosmos.circuit.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:cosmos.circuit.v1.GenesisState)
  private static final com.cosmos.circuit.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.circuit.v1.GenesisState();
  }

  public static com.cosmos.circuit.v1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.circuit.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

