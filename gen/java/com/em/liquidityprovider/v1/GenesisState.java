// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/liquidityprovider/v1/genesis.proto

package com.em.liquidityprovider.v1;

/**
 * Protobuf type {@code em.liquidityprovider.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:em.liquidityprovider.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.em.liquidityprovider.v1.GenesisProto.internal_static_em_liquidityprovider_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.em.liquidityprovider.v1.GenesisProto.internal_static_em_liquidityprovider_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.em.liquidityprovider.v1.GenesisState.class, com.em.liquidityprovider.v1.GenesisState.Builder.class);
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.em.liquidityprovider.v1.GenesisAcc> accounts_;
  /**
   * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.em.liquidityprovider.v1.GenesisAcc> getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.em.liquidityprovider.v1.GenesisAccOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
   */
  @java.lang.Override
  public com.em.liquidityprovider.v1.GenesisAcc getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
   */
  @java.lang.Override
  public com.em.liquidityprovider.v1.GenesisAccOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
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
    for (int i = 0; i < accounts_.size(); i++) {
      output.writeMessage(1, accounts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accounts_.get(i));
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
    if (!(obj instanceof com.em.liquidityprovider.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.em.liquidityprovider.v1.GenesisState other = (com.em.liquidityprovider.v1.GenesisState) obj;

    if (!getAccountsList()
        .equals(other.getAccountsList())) return false;
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
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.em.liquidityprovider.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.em.liquidityprovider.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.liquidityprovider.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.em.liquidityprovider.v1.GenesisState prototype) {
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
   * Protobuf type {@code em.liquidityprovider.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:em.liquidityprovider.v1.GenesisState)
      com.em.liquidityprovider.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.em.liquidityprovider.v1.GenesisProto.internal_static_em_liquidityprovider_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.em.liquidityprovider.v1.GenesisProto.internal_static_em_liquidityprovider_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.em.liquidityprovider.v1.GenesisState.class, com.em.liquidityprovider.v1.GenesisState.Builder.class);
    }

    // Construct using com.em.liquidityprovider.v1.GenesisState.newBuilder()
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
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
      } else {
        accounts_ = null;
        accountsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.em.liquidityprovider.v1.GenesisProto.internal_static_em_liquidityprovider_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.em.liquidityprovider.v1.GenesisState getDefaultInstanceForType() {
      return com.em.liquidityprovider.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.em.liquidityprovider.v1.GenesisState build() {
      com.em.liquidityprovider.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.em.liquidityprovider.v1.GenesisState buildPartial() {
      com.em.liquidityprovider.v1.GenesisState result = new com.em.liquidityprovider.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.em.liquidityprovider.v1.GenesisState result) {
      if (accountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accounts_ = accounts_;
      } else {
        result.accounts_ = accountsBuilder_.build();
      }
    }

    private void buildPartial0(com.em.liquidityprovider.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.em.liquidityprovider.v1.GenesisState) {
        return mergeFrom((com.em.liquidityprovider.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.em.liquidityprovider.v1.GenesisState other) {
      if (other == com.em.liquidityprovider.v1.GenesisState.getDefaultInstance()) return this;
      if (accountsBuilder_ == null) {
        if (!other.accounts_.isEmpty()) {
          if (accounts_.isEmpty()) {
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountsIsMutable();
            accounts_.addAll(other.accounts_);
          }
          onChanged();
        }
      } else {
        if (!other.accounts_.isEmpty()) {
          if (accountsBuilder_.isEmpty()) {
            accountsBuilder_.dispose();
            accountsBuilder_ = null;
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountsFieldBuilder() : null;
          } else {
            accountsBuilder_.addAllMessages(other.accounts_);
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
              com.em.liquidityprovider.v1.GenesisAcc m =
                  input.readMessage(
                      com.em.liquidityprovider.v1.GenesisAcc.parser(),
                      extensionRegistry);
              if (accountsBuilder_ == null) {
                ensureAccountsIsMutable();
                accounts_.add(m);
              } else {
                accountsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.em.liquidityprovider.v1.GenesisAcc> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accounts_ = new java.util.ArrayList<com.em.liquidityprovider.v1.GenesisAcc>(accounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.em.liquidityprovider.v1.GenesisAcc, com.em.liquidityprovider.v1.GenesisAcc.Builder, com.em.liquidityprovider.v1.GenesisAccOrBuilder> accountsBuilder_;

    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public java.util.List<com.em.liquidityprovider.v1.GenesisAcc> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public com.em.liquidityprovider.v1.GenesisAcc getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder setAccounts(
        int index, com.em.liquidityprovider.v1.GenesisAcc value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.set(index, value);
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder setAccounts(
        int index, com.em.liquidityprovider.v1.GenesisAcc.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder addAccounts(com.em.liquidityprovider.v1.GenesisAcc value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder addAccounts(
        int index, com.em.liquidityprovider.v1.GenesisAcc value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(index, value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder addAccounts(
        com.em.liquidityprovider.v1.GenesisAcc.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder addAccounts(
        int index, com.em.liquidityprovider.v1.GenesisAcc.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends com.em.liquidityprovider.v1.GenesisAcc> values) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accounts_);
        onChanged();
      } else {
        accountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder clearAccounts() {
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public Builder removeAccounts(int index) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.remove(index);
        onChanged();
      } else {
        accountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public com.em.liquidityprovider.v1.GenesisAcc.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public com.em.liquidityprovider.v1.GenesisAccOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public java.util.List<? extends com.em.liquidityprovider.v1.GenesisAccOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public com.em.liquidityprovider.v1.GenesisAcc.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          com.em.liquidityprovider.v1.GenesisAcc.getDefaultInstance());
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public com.em.liquidityprovider.v1.GenesisAcc.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, com.em.liquidityprovider.v1.GenesisAcc.getDefaultInstance());
    }
    /**
     * <code>repeated .em.liquidityprovider.v1.GenesisAcc accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accounts&#92;""];</code>
     */
    public java.util.List<com.em.liquidityprovider.v1.GenesisAcc.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.em.liquidityprovider.v1.GenesisAcc, com.em.liquidityprovider.v1.GenesisAcc.Builder, com.em.liquidityprovider.v1.GenesisAccOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.em.liquidityprovider.v1.GenesisAcc, com.em.liquidityprovider.v1.GenesisAcc.Builder, com.em.liquidityprovider.v1.GenesisAccOrBuilder>(
                accounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accounts_ = null;
      }
      return accountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:em.liquidityprovider.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:em.liquidityprovider.v1.GenesisState)
  private static final com.em.liquidityprovider.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.em.liquidityprovider.v1.GenesisState();
  }

  public static com.em.liquidityprovider.v1.GenesisState getDefaultInstance() {
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
  public com.em.liquidityprovider.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

