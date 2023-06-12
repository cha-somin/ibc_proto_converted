// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/shield/v1alpha1/genesis.proto

package com.shentu.shield.v1alpha1;

/**
 * Protobuf type {@code shentu.shield.v1alpha1.ProposalIDReimbursementPair}
 */
public final class ProposalIDReimbursementPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.shield.v1alpha1.ProposalIDReimbursementPair)
    ProposalIDReimbursementPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProposalIDReimbursementPair.newBuilder() to construct.
  private ProposalIDReimbursementPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProposalIDReimbursementPair() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProposalIDReimbursementPair();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.shield.v1alpha1.GenesisProto.internal_static_shentu_shield_v1alpha1_ProposalIDReimbursementPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.shield.v1alpha1.GenesisProto.internal_static_shentu_shield_v1alpha1_ProposalIDReimbursementPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.class, com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
   * @return The proposalId.
   */
  @java.lang.Override
  public long getProposalId() {
    return proposalId_;
  }

  public static final int REIMBURSEMENT_FIELD_NUMBER = 2;
  private com.shentu.shield.v1alpha1.Reimbursement reimbursement_;
  /**
   * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
   * @return Whether the reimbursement field is set.
   */
  @java.lang.Override
  public boolean hasReimbursement() {
    return reimbursement_ != null;
  }
  /**
   * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
   * @return The reimbursement.
   */
  @java.lang.Override
  public com.shentu.shield.v1alpha1.Reimbursement getReimbursement() {
    return reimbursement_ == null ? com.shentu.shield.v1alpha1.Reimbursement.getDefaultInstance() : reimbursement_;
  }
  /**
   * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
   */
  @java.lang.Override
  public com.shentu.shield.v1alpha1.ReimbursementOrBuilder getReimbursementOrBuilder() {
    return reimbursement_ == null ? com.shentu.shield.v1alpha1.Reimbursement.getDefaultInstance() : reimbursement_;
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
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    if (reimbursement_ != null) {
      output.writeMessage(2, getReimbursement());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
    }
    if (reimbursement_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReimbursement());
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
    if (!(obj instanceof com.shentu.shield.v1alpha1.ProposalIDReimbursementPair)) {
      return super.equals(obj);
    }
    com.shentu.shield.v1alpha1.ProposalIDReimbursementPair other = (com.shentu.shield.v1alpha1.ProposalIDReimbursementPair) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (hasReimbursement() != other.hasReimbursement()) return false;
    if (hasReimbursement()) {
      if (!getReimbursement()
          .equals(other.getReimbursement())) return false;
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
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    if (hasReimbursement()) {
      hash = (37 * hash) + REIMBURSEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getReimbursement().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair parseFrom(
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
  public static Builder newBuilder(com.shentu.shield.v1alpha1.ProposalIDReimbursementPair prototype) {
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
   * Protobuf type {@code shentu.shield.v1alpha1.ProposalIDReimbursementPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.shield.v1alpha1.ProposalIDReimbursementPair)
      com.shentu.shield.v1alpha1.ProposalIDReimbursementPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.shield.v1alpha1.GenesisProto.internal_static_shentu_shield_v1alpha1_ProposalIDReimbursementPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.shield.v1alpha1.GenesisProto.internal_static_shentu_shield_v1alpha1_ProposalIDReimbursementPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.class, com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.Builder.class);
    }

    // Construct using com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.newBuilder()
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
      proposalId_ = 0L;
      reimbursement_ = null;
      if (reimbursementBuilder_ != null) {
        reimbursementBuilder_.dispose();
        reimbursementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.shield.v1alpha1.GenesisProto.internal_static_shentu_shield_v1alpha1_ProposalIDReimbursementPair_descriptor;
    }

    @java.lang.Override
    public com.shentu.shield.v1alpha1.ProposalIDReimbursementPair getDefaultInstanceForType() {
      return com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.shield.v1alpha1.ProposalIDReimbursementPair build() {
      com.shentu.shield.v1alpha1.ProposalIDReimbursementPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.shield.v1alpha1.ProposalIDReimbursementPair buildPartial() {
      com.shentu.shield.v1alpha1.ProposalIDReimbursementPair result = new com.shentu.shield.v1alpha1.ProposalIDReimbursementPair(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.shield.v1alpha1.ProposalIDReimbursementPair result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reimbursement_ = reimbursementBuilder_ == null
            ? reimbursement_
            : reimbursementBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.shield.v1alpha1.ProposalIDReimbursementPair) {
        return mergeFrom((com.shentu.shield.v1alpha1.ProposalIDReimbursementPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.shield.v1alpha1.ProposalIDReimbursementPair other) {
      if (other == com.shentu.shield.v1alpha1.ProposalIDReimbursementPair.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (other.hasReimbursement()) {
        mergeReimbursement(other.getReimbursement());
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
              proposalId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getReimbursementFieldBuilder().getBuilder(),
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

    private long proposalId_ ;
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @return The proposalId.
     */
    @java.lang.Override
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @param value The proposalId to set.
     * @return This builder for chaining.
     */
    public Builder setProposalId(long value) {

      proposalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalId_ = 0L;
      onChanged();
      return this;
    }

    private com.shentu.shield.v1alpha1.Reimbursement reimbursement_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.shentu.shield.v1alpha1.Reimbursement, com.shentu.shield.v1alpha1.Reimbursement.Builder, com.shentu.shield.v1alpha1.ReimbursementOrBuilder> reimbursementBuilder_;
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     * @return Whether the reimbursement field is set.
     */
    public boolean hasReimbursement() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     * @return The reimbursement.
     */
    public com.shentu.shield.v1alpha1.Reimbursement getReimbursement() {
      if (reimbursementBuilder_ == null) {
        return reimbursement_ == null ? com.shentu.shield.v1alpha1.Reimbursement.getDefaultInstance() : reimbursement_;
      } else {
        return reimbursementBuilder_.getMessage();
      }
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public Builder setReimbursement(com.shentu.shield.v1alpha1.Reimbursement value) {
      if (reimbursementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reimbursement_ = value;
      } else {
        reimbursementBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public Builder setReimbursement(
        com.shentu.shield.v1alpha1.Reimbursement.Builder builderForValue) {
      if (reimbursementBuilder_ == null) {
        reimbursement_ = builderForValue.build();
      } else {
        reimbursementBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public Builder mergeReimbursement(com.shentu.shield.v1alpha1.Reimbursement value) {
      if (reimbursementBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          reimbursement_ != null &&
          reimbursement_ != com.shentu.shield.v1alpha1.Reimbursement.getDefaultInstance()) {
          getReimbursementBuilder().mergeFrom(value);
        } else {
          reimbursement_ = value;
        }
      } else {
        reimbursementBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public Builder clearReimbursement() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reimbursement_ = null;
      if (reimbursementBuilder_ != null) {
        reimbursementBuilder_.dispose();
        reimbursementBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public com.shentu.shield.v1alpha1.Reimbursement.Builder getReimbursementBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReimbursementFieldBuilder().getBuilder();
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    public com.shentu.shield.v1alpha1.ReimbursementOrBuilder getReimbursementOrBuilder() {
      if (reimbursementBuilder_ != null) {
        return reimbursementBuilder_.getMessageOrBuilder();
      } else {
        return reimbursement_ == null ?
            com.shentu.shield.v1alpha1.Reimbursement.getDefaultInstance() : reimbursement_;
      }
    }
    /**
     * <code>.shentu.shield.v1alpha1.Reimbursement reimbursement = 2 [json_name = "reimbursement", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reimbursement&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.shentu.shield.v1alpha1.Reimbursement, com.shentu.shield.v1alpha1.Reimbursement.Builder, com.shentu.shield.v1alpha1.ReimbursementOrBuilder> 
        getReimbursementFieldBuilder() {
      if (reimbursementBuilder_ == null) {
        reimbursementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.shentu.shield.v1alpha1.Reimbursement, com.shentu.shield.v1alpha1.Reimbursement.Builder, com.shentu.shield.v1alpha1.ReimbursementOrBuilder>(
                getReimbursement(),
                getParentForChildren(),
                isClean());
        reimbursement_ = null;
      }
      return reimbursementBuilder_;
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


    // @@protoc_insertion_point(builder_scope:shentu.shield.v1alpha1.ProposalIDReimbursementPair)
  }

  // @@protoc_insertion_point(class_scope:shentu.shield.v1alpha1.ProposalIDReimbursementPair)
  private static final com.shentu.shield.v1alpha1.ProposalIDReimbursementPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.shield.v1alpha1.ProposalIDReimbursementPair();
  }

  public static com.shentu.shield.v1alpha1.ProposalIDReimbursementPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProposalIDReimbursementPair>
      PARSER = new com.google.protobuf.AbstractParser<ProposalIDReimbursementPair>() {
    @java.lang.Override
    public ProposalIDReimbursementPair parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProposalIDReimbursementPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProposalIDReimbursementPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.shield.v1alpha1.ProposalIDReimbursementPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

