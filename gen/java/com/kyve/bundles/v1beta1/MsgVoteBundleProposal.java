// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/tx.proto

package com.kyve.bundles.v1beta1;

/**
 * <pre>
 * MsgVoteBundleProposal defines a SDK message for voting on a bundle proposal.
 * </pre>
 *
 * Protobuf type {@code kyve.bundles.v1beta1.MsgVoteBundleProposal}
 */
public final class MsgVoteBundleProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.bundles.v1beta1.MsgVoteBundleProposal)
    MsgVoteBundleProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgVoteBundleProposal.newBuilder() to construct.
  private MsgVoteBundleProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgVoteBundleProposal() {
    creator_ = "";
    staker_ = "";
    storageId_ = "";
    vote_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgVoteBundleProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.bundles.v1beta1.TxProto.internal_static_kyve_bundles_v1beta1_MsgVoteBundleProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.bundles.v1beta1.TxProto.internal_static_kyve_bundles_v1beta1_MsgVoteBundleProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.bundles.v1beta1.MsgVoteBundleProposal.class, com.kyve.bundles.v1beta1.MsgVoteBundleProposal.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAKER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object staker_ = "";
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  @java.lang.Override
  public java.lang.String getStaker() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staker_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStakerBytes() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POOL_ID_FIELD_NUMBER = 3;
  private long poolId_ = 0L;
  /**
   * <pre>
   * id ...
   * </pre>
   *
   * <code>uint64 pool_id = 3 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int STORAGE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storageId_ = "";
  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The storageId.
   */
  @java.lang.Override
  public java.lang.String getStorageId() {
    java.lang.Object ref = storageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The bytes for storageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStorageIdBytes() {
    java.lang.Object ref = storageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOTE_FIELD_NUMBER = 5;
  private int vote_ = 0;
  /**
   * <pre>
   * vote ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
   * @return The enum numeric value on the wire for vote.
   */
  @java.lang.Override public int getVoteValue() {
    return vote_;
  }
  /**
   * <pre>
   * vote ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
   * @return The vote.
   */
  @java.lang.Override public com.kyve.bundles.v1beta1.VoteType getVote() {
    com.kyve.bundles.v1beta1.VoteType result = com.kyve.bundles.v1beta1.VoteType.forNumber(vote_);
    return result == null ? com.kyve.bundles.v1beta1.VoteType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, staker_);
    }
    if (poolId_ != 0L) {
      output.writeUInt64(3, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, storageId_);
    }
    if (vote_ != com.kyve.bundles.v1beta1.VoteType.VOTE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, vote_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, staker_);
    }
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, storageId_);
    }
    if (vote_ != com.kyve.bundles.v1beta1.VoteType.VOTE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, vote_);
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
    if (!(obj instanceof com.kyve.bundles.v1beta1.MsgVoteBundleProposal)) {
      return super.equals(obj);
    }
    com.kyve.bundles.v1beta1.MsgVoteBundleProposal other = (com.kyve.bundles.v1beta1.MsgVoteBundleProposal) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getStaker()
        .equals(other.getStaker())) return false;
    if (getPoolId()
        != other.getPoolId()) return false;
    if (!getStorageId()
        .equals(other.getStorageId())) return false;
    if (vote_ != other.vote_) return false;
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + STAKER_FIELD_NUMBER;
    hash = (53 * hash) + getStaker().hashCode();
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + STORAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStorageId().hashCode();
    hash = (37 * hash) + VOTE_FIELD_NUMBER;
    hash = (53 * hash) + vote_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal parseFrom(
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
  public static Builder newBuilder(com.kyve.bundles.v1beta1.MsgVoteBundleProposal prototype) {
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
   * MsgVoteBundleProposal defines a SDK message for voting on a bundle proposal.
   * </pre>
   *
   * Protobuf type {@code kyve.bundles.v1beta1.MsgVoteBundleProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.bundles.v1beta1.MsgVoteBundleProposal)
      com.kyve.bundles.v1beta1.MsgVoteBundleProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.bundles.v1beta1.TxProto.internal_static_kyve_bundles_v1beta1_MsgVoteBundleProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.bundles.v1beta1.TxProto.internal_static_kyve_bundles_v1beta1_MsgVoteBundleProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.bundles.v1beta1.MsgVoteBundleProposal.class, com.kyve.bundles.v1beta1.MsgVoteBundleProposal.Builder.class);
    }

    // Construct using com.kyve.bundles.v1beta1.MsgVoteBundleProposal.newBuilder()
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
      creator_ = "";
      staker_ = "";
      poolId_ = 0L;
      storageId_ = "";
      vote_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.bundles.v1beta1.TxProto.internal_static_kyve_bundles_v1beta1_MsgVoteBundleProposal_descriptor;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.MsgVoteBundleProposal getDefaultInstanceForType() {
      return com.kyve.bundles.v1beta1.MsgVoteBundleProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.MsgVoteBundleProposal build() {
      com.kyve.bundles.v1beta1.MsgVoteBundleProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.MsgVoteBundleProposal buildPartial() {
      com.kyve.bundles.v1beta1.MsgVoteBundleProposal result = new com.kyve.bundles.v1beta1.MsgVoteBundleProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.bundles.v1beta1.MsgVoteBundleProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.staker_ = staker_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.storageId_ = storageId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.vote_ = vote_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.bundles.v1beta1.MsgVoteBundleProposal) {
        return mergeFrom((com.kyve.bundles.v1beta1.MsgVoteBundleProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.bundles.v1beta1.MsgVoteBundleProposal other) {
      if (other == com.kyve.bundles.v1beta1.MsgVoteBundleProposal.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getStaker().isEmpty()) {
        staker_ = other.staker_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (!other.getStorageId().isEmpty()) {
        storageId_ = other.storageId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.vote_ != 0) {
        setVoteValue(other.getVoteValue());
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
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              staker_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              storageId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              vote_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object creator_ = "";
    /**
     * <pre>
     * creator ...
     * </pre>
     *
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * creator ...
     * </pre>
     *
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * creator ...
     * </pre>
     *
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creator ...
     * </pre>
     *
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creator ...
     * </pre>
     *
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object staker_ = "";
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The staker.
     */
    public java.lang.String getStaker() {
      java.lang.Object ref = staker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The bytes for staker.
     */
    public com.google.protobuf.ByteString
        getStakerBytes() {
      java.lang.Object ref = staker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The staker to set.
     * @return This builder for chaining.
     */
    public Builder setStaker(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      staker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStaker() {
      staker_ = getDefaultInstance().getStaker();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The bytes for staker to set.
     * @return This builder for chaining.
     */
    public Builder setStakerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      staker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long poolId_ ;
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 pool_id = 3 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 pool_id = 3 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 pool_id = 3 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object storageId_ = "";
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return The storageId.
     */
    public java.lang.String getStorageId() {
      java.lang.Object ref = storageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return The bytes for storageId.
     */
    public com.google.protobuf.ByteString
        getStorageIdBytes() {
      java.lang.Object ref = storageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @param value The storageId to set.
     * @return This builder for chaining.
     */
    public Builder setStorageId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storageId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStorageId() {
      storageId_ = getDefaultInstance().getStorageId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @param value The bytes for storageId to set.
     * @return This builder for chaining.
     */
    public Builder setStorageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storageId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int vote_ = 0;
    /**
     * <pre>
     * vote ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
     * @return The enum numeric value on the wire for vote.
     */
    @java.lang.Override public int getVoteValue() {
      return vote_;
    }
    /**
     * <pre>
     * vote ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
     * @param value The enum numeric value on the wire for vote to set.
     * @return This builder for chaining.
     */
    public Builder setVoteValue(int value) {
      vote_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * vote ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
     * @return The vote.
     */
    @java.lang.Override
    public com.kyve.bundles.v1beta1.VoteType getVote() {
      com.kyve.bundles.v1beta1.VoteType result = com.kyve.bundles.v1beta1.VoteType.forNumber(vote_);
      return result == null ? com.kyve.bundles.v1beta1.VoteType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * vote ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
     * @param value The vote to set.
     * @return This builder for chaining.
     */
    public Builder setVote(com.kyve.bundles.v1beta1.VoteType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      vote_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * vote ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVote() {
      bitField0_ = (bitField0_ & ~0x00000010);
      vote_ = 0;
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


    // @@protoc_insertion_point(builder_scope:kyve.bundles.v1beta1.MsgVoteBundleProposal)
  }

  // @@protoc_insertion_point(class_scope:kyve.bundles.v1beta1.MsgVoteBundleProposal)
  private static final com.kyve.bundles.v1beta1.MsgVoteBundleProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.bundles.v1beta1.MsgVoteBundleProposal();
  }

  public static com.kyve.bundles.v1beta1.MsgVoteBundleProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgVoteBundleProposal>
      PARSER = new com.google.protobuf.AbstractParser<MsgVoteBundleProposal>() {
    @java.lang.Override
    public MsgVoteBundleProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgVoteBundleProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgVoteBundleProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.bundles.v1beta1.MsgVoteBundleProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

