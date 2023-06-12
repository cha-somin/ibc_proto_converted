// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package com.cosmos.group.v1;

/**
 * <pre>
 * MsgWithdrawProposal is the Msg/WithdrawProposal request type.
 * </pre>
 *
 * Protobuf type {@code cosmos.group.v1.MsgWithdrawProposal}
 */
public final class MsgWithdrawProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.group.v1.MsgWithdrawProposal)
    MsgWithdrawProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWithdrawProposal.newBuilder() to construct.
  private MsgWithdrawProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWithdrawProposal() {
    address_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWithdrawProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgWithdrawProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgWithdrawProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.group.v1.MsgWithdrawProposal.class, com.cosmos.group.v1.MsgWithdrawProposal.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <pre>
   * proposal is the unique ID of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
   * @return The proposalId.
   */
  @java.lang.Override
  public long getProposalId() {
    return proposalId_;
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <pre>
   * address is the admin of the group policy or one of the proposer of the proposal.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
   * address is the admin of the group policy or one of the proposer of the proposal.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
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
    if (!(obj instanceof com.cosmos.group.v1.MsgWithdrawProposal)) {
      return super.equals(obj);
    }
    com.cosmos.group.v1.MsgWithdrawProposal other = (com.cosmos.group.v1.MsgWithdrawProposal) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.group.v1.MsgWithdrawProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.group.v1.MsgWithdrawProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.MsgWithdrawProposal parseFrom(
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
  public static Builder newBuilder(com.cosmos.group.v1.MsgWithdrawProposal prototype) {
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
   * MsgWithdrawProposal is the Msg/WithdrawProposal request type.
   * </pre>
   *
   * Protobuf type {@code cosmos.group.v1.MsgWithdrawProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.group.v1.MsgWithdrawProposal)
      com.cosmos.group.v1.MsgWithdrawProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgWithdrawProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgWithdrawProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.group.v1.MsgWithdrawProposal.class, com.cosmos.group.v1.MsgWithdrawProposal.Builder.class);
    }

    // Construct using com.cosmos.group.v1.MsgWithdrawProposal.newBuilder()
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
      address_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgWithdrawProposal_descriptor;
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgWithdrawProposal getDefaultInstanceForType() {
      return com.cosmos.group.v1.MsgWithdrawProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgWithdrawProposal build() {
      com.cosmos.group.v1.MsgWithdrawProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgWithdrawProposal buildPartial() {
      com.cosmos.group.v1.MsgWithdrawProposal result = new com.cosmos.group.v1.MsgWithdrawProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.group.v1.MsgWithdrawProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.group.v1.MsgWithdrawProposal) {
        return mergeFrom((com.cosmos.group.v1.MsgWithdrawProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.group.v1.MsgWithdrawProposal other) {
      if (other == com.cosmos.group.v1.MsgWithdrawProposal.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000002;
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
              proposalId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              address_ = input.readStringRequireUtf8();
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
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return The proposalId.
     */
    @java.lang.Override
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
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
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <pre>
     * address is the admin of the group policy or one of the proposer of the proposal.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * address is the admin of the group policy or one of the proposer of the proposal.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * address is the admin of the group policy or one of the proposer of the proposal.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address is the admin of the group policy or one of the proposer of the proposal.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address is the admin of the group policy or one of the proposer of the proposal.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.group.v1.MsgWithdrawProposal)
  }

  // @@protoc_insertion_point(class_scope:cosmos.group.v1.MsgWithdrawProposal)
  private static final com.cosmos.group.v1.MsgWithdrawProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.group.v1.MsgWithdrawProposal();
  }

  public static com.cosmos.group.v1.MsgWithdrawProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWithdrawProposal>
      PARSER = new com.google.protobuf.AbstractParser<MsgWithdrawProposal>() {
    @java.lang.Override
    public MsgWithdrawProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgWithdrawProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWithdrawProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.group.v1.MsgWithdrawProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

