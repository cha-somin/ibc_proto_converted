// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/team/v1beta1/query.proto

package com.kyve.team.v1beta1;

/**
 * <pre>
 * QueryAccountsResponse is response type for the Query/TeamVestingAccounts RPC method.
 * </pre>
 *
 * Protobuf type {@code kyve.team.v1beta1.QueryTeamVestingAccountsResponse}
 */
public final class QueryTeamVestingAccountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.team.v1beta1.QueryTeamVestingAccountsResponse)
    QueryTeamVestingAccountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTeamVestingAccountsResponse.newBuilder() to construct.
  private QueryTeamVestingAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTeamVestingAccountsResponse() {
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTeamVestingAccountsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.team.v1beta1.QueryProto.internal_static_kyve_team_v1beta1_QueryTeamVestingAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.team.v1beta1.QueryProto.internal_static_kyve_team_v1beta1_QueryTeamVestingAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.class, com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.Builder.class);
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.kyve.team.v1beta1.TeamVestingAccount> accounts_;
  /**
   * <pre>
   * accounts holds all the team vesting accounts of this module.
   * </pre>
   *
   * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.kyve.team.v1beta1.TeamVestingAccount> getAccountsList() {
    return accounts_;
  }
  /**
   * <pre>
   * accounts holds all the team vesting accounts of this module.
   * </pre>
   *
   * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kyve.team.v1beta1.TeamVestingAccountOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <pre>
   * accounts holds all the team vesting accounts of this module.
   * </pre>
   *
   * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <pre>
   * accounts holds all the team vesting accounts of this module.
   * </pre>
   *
   * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.kyve.team.v1beta1.TeamVestingAccount getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <pre>
   * accounts holds all the team vesting accounts of this module.
   * </pre>
   *
   * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.kyve.team.v1beta1.TeamVestingAccountOrBuilder getAccountsOrBuilder(
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
    if (!(obj instanceof com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse)) {
      return super.equals(obj);
    }
    com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse other = (com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse) obj;

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

  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse parseFrom(
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
  public static Builder newBuilder(com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse prototype) {
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
   * QueryAccountsResponse is response type for the Query/TeamVestingAccounts RPC method.
   * </pre>
   *
   * Protobuf type {@code kyve.team.v1beta1.QueryTeamVestingAccountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.team.v1beta1.QueryTeamVestingAccountsResponse)
      com.kyve.team.v1beta1.QueryTeamVestingAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.team.v1beta1.QueryProto.internal_static_kyve_team_v1beta1_QueryTeamVestingAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.team.v1beta1.QueryProto.internal_static_kyve_team_v1beta1_QueryTeamVestingAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.class, com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.Builder.class);
    }

    // Construct using com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.newBuilder()
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
      return com.kyve.team.v1beta1.QueryProto.internal_static_kyve_team_v1beta1_QueryTeamVestingAccountsResponse_descriptor;
    }

    @java.lang.Override
    public com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse getDefaultInstanceForType() {
      return com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse build() {
      com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse buildPartial() {
      com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse result = new com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse result) {
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

    private void buildPartial0(com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse) {
        return mergeFrom((com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse other) {
      if (other == com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse.getDefaultInstance()) return this;
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
              com.kyve.team.v1beta1.TeamVestingAccount m =
                  input.readMessage(
                      com.kyve.team.v1beta1.TeamVestingAccount.parser(),
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

    private java.util.List<com.kyve.team.v1beta1.TeamVestingAccount> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accounts_ = new java.util.ArrayList<com.kyve.team.v1beta1.TeamVestingAccount>(accounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kyve.team.v1beta1.TeamVestingAccount, com.kyve.team.v1beta1.TeamVestingAccount.Builder, com.kyve.team.v1beta1.TeamVestingAccountOrBuilder> accountsBuilder_;

    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.kyve.team.v1beta1.TeamVestingAccount> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.team.v1beta1.TeamVestingAccount getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAccounts(
        int index, com.kyve.team.v1beta1.TeamVestingAccount value) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAccounts(
        int index, com.kyve.team.v1beta1.TeamVestingAccount.Builder builderForValue) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccounts(com.kyve.team.v1beta1.TeamVestingAccount value) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccounts(
        int index, com.kyve.team.v1beta1.TeamVestingAccount value) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccounts(
        com.kyve.team.v1beta1.TeamVestingAccount.Builder builderForValue) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccounts(
        int index, com.kyve.team.v1beta1.TeamVestingAccount.Builder builderForValue) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends com.kyve.team.v1beta1.TeamVestingAccount> values) {
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
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
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.team.v1beta1.TeamVestingAccount.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.team.v1beta1.TeamVestingAccountOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.kyve.team.v1beta1.TeamVestingAccountOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.team.v1beta1.TeamVestingAccount.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          com.kyve.team.v1beta1.TeamVestingAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.team.v1beta1.TeamVestingAccount.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, com.kyve.team.v1beta1.TeamVestingAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * accounts holds all the team vesting accounts of this module.
     * </pre>
     *
     * <code>repeated .kyve.team.v1beta1.TeamVestingAccount accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.kyve.team.v1beta1.TeamVestingAccount.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kyve.team.v1beta1.TeamVestingAccount, com.kyve.team.v1beta1.TeamVestingAccount.Builder, com.kyve.team.v1beta1.TeamVestingAccountOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kyve.team.v1beta1.TeamVestingAccount, com.kyve.team.v1beta1.TeamVestingAccount.Builder, com.kyve.team.v1beta1.TeamVestingAccountOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:kyve.team.v1beta1.QueryTeamVestingAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:kyve.team.v1beta1.QueryTeamVestingAccountsResponse)
  private static final com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse();
  }

  public static com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTeamVestingAccountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTeamVestingAccountsResponse>() {
    @java.lang.Override
    public QueryTeamVestingAccountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTeamVestingAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTeamVestingAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.team.v1beta1.QueryTeamVestingAccountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

