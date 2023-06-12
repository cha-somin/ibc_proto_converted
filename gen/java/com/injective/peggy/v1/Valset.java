// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/types.proto

package com.injective.peggy.v1;

/**
 * <pre>
 * Valset is the Ethereum Bridge Multsig Set, each peggy validator also
 * maintains an ETH key to sign messages, these are used to check signatures on
 * ETH because of the significant gas savings
 * </pre>
 *
 * Protobuf type {@code injective.peggy.v1.Valset}
 */
public final class Valset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.peggy.v1.Valset)
    ValsetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Valset.newBuilder() to construct.
  private Valset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Valset() {
    members_ = java.util.Collections.emptyList();
    rewardAmount_ = "";
    rewardToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Valset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.peggy.v1.TypesProto.internal_static_injective_peggy_v1_Valset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.peggy.v1.TypesProto.internal_static_injective_peggy_v1_Valset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.peggy.v1.Valset.class, com.injective.peggy.v1.Valset.Builder.class);
  }

  public static final int NONCE_FIELD_NUMBER = 1;
  private long nonce_ = 0L;
  /**
   * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  @java.lang.Override
  public long getNonce() {
    return nonce_;
  }

  public static final int MEMBERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.injective.peggy.v1.BridgeValidator> members_;
  /**
   * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
   */
  @java.lang.Override
  public java.util.List<com.injective.peggy.v1.BridgeValidator> getMembersList() {
    return members_;
  }
  /**
   * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.injective.peggy.v1.BridgeValidatorOrBuilder> 
      getMembersOrBuilderList() {
    return members_;
  }
  /**
   * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
   */
  @java.lang.Override
  public int getMembersCount() {
    return members_.size();
  }
  /**
   * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
   */
  @java.lang.Override
  public com.injective.peggy.v1.BridgeValidator getMembers(int index) {
    return members_.get(index);
  }
  /**
   * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
   */
  @java.lang.Override
  public com.injective.peggy.v1.BridgeValidatorOrBuilder getMembersOrBuilder(
      int index) {
    return members_.get(index);
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private long height_ = 0L;
  /**
   * <code>uint64 height = 3 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int REWARD_AMOUNT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardAmount_ = "";
  /**
   * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardAmount.
   */
  @java.lang.Override
  public java.lang.String getRewardAmount() {
    java.lang.Object ref = rewardAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardAmountBytes() {
    java.lang.Object ref = rewardAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARD_TOKEN_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardToken_ = "";
  /**
   * <pre>
   * the reward token in it's Ethereum hex address representation
   * </pre>
   *
   * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
   * @return The rewardToken.
   */
  @java.lang.Override
  public java.lang.String getRewardToken() {
    java.lang.Object ref = rewardToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the reward token in it's Ethereum hex address representation
   * </pre>
   *
   * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
   * @return The bytes for rewardToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardTokenBytes() {
    java.lang.Object ref = rewardToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardToken_ = b;
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
    if (nonce_ != 0L) {
      output.writeUInt64(1, nonce_);
    }
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(2, members_.get(i));
    }
    if (height_ != 0L) {
      output.writeUInt64(3, height_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, rewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, rewardToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, nonce_);
    }
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, members_.get(i));
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, height_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, rewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, rewardToken_);
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
    if (!(obj instanceof com.injective.peggy.v1.Valset)) {
      return super.equals(obj);
    }
    com.injective.peggy.v1.Valset other = (com.injective.peggy.v1.Valset) obj;

    if (getNonce()
        != other.getNonce()) return false;
    if (!getMembersList()
        .equals(other.getMembersList())) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (!getRewardAmount()
        .equals(other.getRewardAmount())) return false;
    if (!getRewardToken()
        .equals(other.getRewardToken())) return false;
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
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNonce());
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + REWARD_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRewardAmount().hashCode();
    hash = (37 * hash) + REWARD_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getRewardToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.peggy.v1.Valset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.Valset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.Valset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.peggy.v1.Valset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.peggy.v1.Valset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.Valset parseFrom(
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
  public static Builder newBuilder(com.injective.peggy.v1.Valset prototype) {
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
   * Valset is the Ethereum Bridge Multsig Set, each peggy validator also
   * maintains an ETH key to sign messages, these are used to check signatures on
   * ETH because of the significant gas savings
   * </pre>
   *
   * Protobuf type {@code injective.peggy.v1.Valset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.peggy.v1.Valset)
      com.injective.peggy.v1.ValsetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.peggy.v1.TypesProto.internal_static_injective_peggy_v1_Valset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.peggy.v1.TypesProto.internal_static_injective_peggy_v1_Valset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.peggy.v1.Valset.class, com.injective.peggy.v1.Valset.Builder.class);
    }

    // Construct using com.injective.peggy.v1.Valset.newBuilder()
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
      nonce_ = 0L;
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
      } else {
        members_ = null;
        membersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      rewardAmount_ = "";
      rewardToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.peggy.v1.TypesProto.internal_static_injective_peggy_v1_Valset_descriptor;
    }

    @java.lang.Override
    public com.injective.peggy.v1.Valset getDefaultInstanceForType() {
      return com.injective.peggy.v1.Valset.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.peggy.v1.Valset build() {
      com.injective.peggy.v1.Valset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.peggy.v1.Valset buildPartial() {
      com.injective.peggy.v1.Valset result = new com.injective.peggy.v1.Valset(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.peggy.v1.Valset result) {
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
    }

    private void buildPartial0(com.injective.peggy.v1.Valset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nonce_ = nonce_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rewardAmount_ = rewardAmount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.rewardToken_ = rewardToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.peggy.v1.Valset) {
        return mergeFrom((com.injective.peggy.v1.Valset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.peggy.v1.Valset other) {
      if (other == com.injective.peggy.v1.Valset.getDefaultInstance()) return this;
      if (other.getNonce() != 0L) {
        setNonce(other.getNonce());
      }
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
            membersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMembersFieldBuilder() : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (!other.getRewardAmount().isEmpty()) {
        rewardAmount_ = other.rewardAmount_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getRewardToken().isEmpty()) {
        rewardToken_ = other.rewardToken_;
        bitField0_ |= 0x00000010;
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
            case 8: {
              nonce_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.injective.peggy.v1.BridgeValidator m =
                  input.readMessage(
                      com.injective.peggy.v1.BridgeValidator.parser(),
                      extensionRegistry);
              if (membersBuilder_ == null) {
                ensureMembersIsMutable();
                members_.add(m);
              } else {
                membersBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              height_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              rewardAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              rewardToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long nonce_ ;
    /**
     * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
     * @return The nonce.
     */
    @java.lang.Override
    public long getNonce() {
      return nonce_;
    }
    /**
     * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(long value) {

      nonce_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nonce_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.injective.peggy.v1.BridgeValidator> members_ =
      java.util.Collections.emptyList();
    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        members_ = new java.util.ArrayList<com.injective.peggy.v1.BridgeValidator>(members_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.peggy.v1.BridgeValidator, com.injective.peggy.v1.BridgeValidator.Builder, com.injective.peggy.v1.BridgeValidatorOrBuilder> membersBuilder_;

    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public java.util.List<com.injective.peggy.v1.BridgeValidator> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public com.injective.peggy.v1.BridgeValidator getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder setMembers(
        int index, com.injective.peggy.v1.BridgeValidator value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder setMembers(
        int index, com.injective.peggy.v1.BridgeValidator.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder addMembers(com.injective.peggy.v1.BridgeValidator value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder addMembers(
        int index, com.injective.peggy.v1.BridgeValidator value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder addMembers(
        com.injective.peggy.v1.BridgeValidator.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder addMembers(
        int index, com.injective.peggy.v1.BridgeValidator.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<? extends com.injective.peggy.v1.BridgeValidator> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public com.injective.peggy.v1.BridgeValidator.Builder getMembersBuilder(
        int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public com.injective.peggy.v1.BridgeValidatorOrBuilder getMembersOrBuilder(
        int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);  } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public java.util.List<? extends com.injective.peggy.v1.BridgeValidatorOrBuilder> 
         getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public com.injective.peggy.v1.BridgeValidator.Builder addMembersBuilder() {
      return getMembersFieldBuilder().addBuilder(
          com.injective.peggy.v1.BridgeValidator.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public com.injective.peggy.v1.BridgeValidator.Builder addMembersBuilder(
        int index) {
      return getMembersFieldBuilder().addBuilder(
          index, com.injective.peggy.v1.BridgeValidator.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.peggy.v1.BridgeValidator members = 2 [json_name = "members"];</code>
     */
    public java.util.List<com.injective.peggy.v1.BridgeValidator.Builder> 
         getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.peggy.v1.BridgeValidator, com.injective.peggy.v1.BridgeValidator.Builder, com.injective.peggy.v1.BridgeValidatorOrBuilder> 
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.injective.peggy.v1.BridgeValidator, com.injective.peggy.v1.BridgeValidator.Builder, com.injective.peggy.v1.BridgeValidatorOrBuilder>(
                members_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        members_ = null;
      }
      return membersBuilder_;
    }

    private long height_ ;
    /**
     * <code>uint64 height = 3 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 3 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 3 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      height_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object rewardAmount_ = "";
    /**
     * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The rewardAmount.
     */
    public java.lang.String getRewardAmount() {
      java.lang.Object ref = rewardAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for rewardAmount.
     */
    public com.google.protobuf.ByteString
        getRewardAmountBytes() {
      java.lang.Object ref = rewardAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The rewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAmount() {
      rewardAmount_ = getDefaultInstance().getRewardAmount();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string reward_amount = 4 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for rewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object rewardToken_ = "";
    /**
     * <pre>
     * the reward token in it's Ethereum hex address representation
     * </pre>
     *
     * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
     * @return The rewardToken.
     */
    public java.lang.String getRewardToken() {
      java.lang.Object ref = rewardToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the reward token in it's Ethereum hex address representation
     * </pre>
     *
     * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
     * @return The bytes for rewardToken.
     */
    public com.google.protobuf.ByteString
        getRewardTokenBytes() {
      java.lang.Object ref = rewardToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the reward token in it's Ethereum hex address representation
     * </pre>
     *
     * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
     * @param value The rewardToken to set.
     * @return This builder for chaining.
     */
    public Builder setRewardToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardToken_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the reward token in it's Ethereum hex address representation
     * </pre>
     *
     * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardToken() {
      rewardToken_ = getDefaultInstance().getRewardToken();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the reward token in it's Ethereum hex address representation
     * </pre>
     *
     * <code>string reward_token = 5 [json_name = "rewardToken"];</code>
     * @param value The bytes for rewardToken to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardToken_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:injective.peggy.v1.Valset)
  }

  // @@protoc_insertion_point(class_scope:injective.peggy.v1.Valset)
  private static final com.injective.peggy.v1.Valset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.peggy.v1.Valset();
  }

  public static com.injective.peggy.v1.Valset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Valset>
      PARSER = new com.google.protobuf.AbstractParser<Valset>() {
    @java.lang.Override
    public Valset parsePartialFrom(
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

  public static com.google.protobuf.Parser<Valset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Valset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.peggy.v1.Valset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

