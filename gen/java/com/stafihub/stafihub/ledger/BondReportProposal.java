// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/proposal.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf type {@code stafihub.stafihub.ledger.BondReportProposal}
 */
public final class BondReportProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.ledger.BondReportProposal)
    BondReportProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondReportProposal.newBuilder() to construct.
  private BondReportProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondReportProposal() {
    proposer_ = "";
    denom_ = "";
    shotId_ = "";
    action_ = 0;
    propId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondReportProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.ledger.ProposalProto.internal_static_stafihub_stafihub_ledger_BondReportProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.ledger.ProposalProto.internal_static_stafihub_stafihub_ledger_BondReportProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.ledger.BondReportProposal.class, com.stafihub.stafihub.ledger.BondReportProposal.Builder.class);
  }

  public static final int PROPOSER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object proposer_ = "";
  /**
   * <code>string proposer = 1 [json_name = "proposer"];</code>
   * @return The proposer.
   */
  @java.lang.Override
  public java.lang.String getProposer() {
    java.lang.Object ref = proposer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proposer_ = s;
      return s;
    }
  }
  /**
   * <code>string proposer = 1 [json_name = "proposer"];</code>
   * @return The bytes for proposer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProposerBytes() {
    java.lang.Object ref = proposer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      proposer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOTID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shotId_ = "";
  /**
   * <code>string shotId = 3 [json_name = "shotId"];</code>
   * @return The shotId.
   */
  @java.lang.Override
  public java.lang.String getShotId() {
    java.lang.Object ref = shotId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shotId_ = s;
      return s;
    }
  }
  /**
   * <code>string shotId = 3 [json_name = "shotId"];</code>
   * @return The bytes for shotId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShotIdBytes() {
    java.lang.Object ref = shotId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shotId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 4;
  private int action_ = 0;
  /**
   * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override public com.stafihub.stafihub.ledger.BondAction getAction() {
    com.stafihub.stafihub.ledger.BondAction result = com.stafihub.stafihub.ledger.BondAction.forNumber(action_);
    return result == null ? com.stafihub.stafihub.ledger.BondAction.UNRECOGNIZED : result;
  }

  public static final int PROPID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object propId_ = "";
  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The propId.
   */
  @java.lang.Override
  public java.lang.String getPropId() {
    java.lang.Object ref = propId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      propId_ = s;
      return s;
    }
  }
  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The bytes for propId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPropIdBytes() {
    java.lang.Object ref = propId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      propId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proposer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, proposer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shotId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shotId_);
    }
    if (action_ != com.stafihub.stafihub.ledger.BondAction.BOND_ONLY.getNumber()) {
      output.writeEnum(4, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, propId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proposer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, proposer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shotId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shotId_);
    }
    if (action_ != com.stafihub.stafihub.ledger.BondAction.BOND_ONLY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(propId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, propId_);
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
    if (!(obj instanceof com.stafihub.stafihub.ledger.BondReportProposal)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.ledger.BondReportProposal other = (com.stafihub.stafihub.ledger.BondReportProposal) obj;

    if (!getProposer()
        .equals(other.getProposer())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getShotId()
        .equals(other.getShotId())) return false;
    if (action_ != other.action_) return false;
    if (!getPropId()
        .equals(other.getPropId())) return false;
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
    hash = (37 * hash) + PROPOSER_FIELD_NUMBER;
    hash = (53 * hash) + getProposer().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + SHOTID_FIELD_NUMBER;
    hash = (53 * hash) + getShotId().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + PROPID_FIELD_NUMBER;
    hash = (53 * hash) + getPropId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.ledger.BondReportProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.ledger.BondReportProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.BondReportProposal parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.ledger.BondReportProposal prototype) {
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
   * Protobuf type {@code stafihub.stafihub.ledger.BondReportProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.ledger.BondReportProposal)
      com.stafihub.stafihub.ledger.BondReportProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.ledger.ProposalProto.internal_static_stafihub_stafihub_ledger_BondReportProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.ledger.ProposalProto.internal_static_stafihub_stafihub_ledger_BondReportProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.ledger.BondReportProposal.class, com.stafihub.stafihub.ledger.BondReportProposal.Builder.class);
    }

    // Construct using com.stafihub.stafihub.ledger.BondReportProposal.newBuilder()
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
      proposer_ = "";
      denom_ = "";
      shotId_ = "";
      action_ = 0;
      propId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.ledger.ProposalProto.internal_static_stafihub_stafihub_ledger_BondReportProposal_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondReportProposal getDefaultInstanceForType() {
      return com.stafihub.stafihub.ledger.BondReportProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondReportProposal build() {
      com.stafihub.stafihub.ledger.BondReportProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondReportProposal buildPartial() {
      com.stafihub.stafihub.ledger.BondReportProposal result = new com.stafihub.stafihub.ledger.BondReportProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.ledger.BondReportProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposer_ = proposer_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.shotId_ = shotId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.propId_ = propId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.ledger.BondReportProposal) {
        return mergeFrom((com.stafihub.stafihub.ledger.BondReportProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.ledger.BondReportProposal other) {
      if (other == com.stafihub.stafihub.ledger.BondReportProposal.getDefaultInstance()) return this;
      if (!other.getProposer().isEmpty()) {
        proposer_ = other.proposer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getShotId().isEmpty()) {
        shotId_ = other.shotId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (!other.getPropId().isEmpty()) {
        propId_ = other.propId_;
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
            case 10: {
              proposer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              shotId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              action_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              propId_ = input.readStringRequireUtf8();
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

    private java.lang.Object proposer_ = "";
    /**
     * <code>string proposer = 1 [json_name = "proposer"];</code>
     * @return The proposer.
     */
    public java.lang.String getProposer() {
      java.lang.Object ref = proposer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proposer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string proposer = 1 [json_name = "proposer"];</code>
     * @return The bytes for proposer.
     */
    public com.google.protobuf.ByteString
        getProposerBytes() {
      java.lang.Object ref = proposer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proposer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string proposer = 1 [json_name = "proposer"];</code>
     * @param value The proposer to set.
     * @return This builder for chaining.
     */
    public Builder setProposer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      proposer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string proposer = 1 [json_name = "proposer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposer() {
      proposer_ = getDefaultInstance().getProposer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string proposer = 1 [json_name = "proposer"];</code>
     * @param value The bytes for proposer to set.
     * @return This builder for chaining.
     */
    public Builder setProposerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      proposer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object shotId_ = "";
    /**
     * <code>string shotId = 3 [json_name = "shotId"];</code>
     * @return The shotId.
     */
    public java.lang.String getShotId() {
      java.lang.Object ref = shotId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shotId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shotId = 3 [json_name = "shotId"];</code>
     * @return The bytes for shotId.
     */
    public com.google.protobuf.ByteString
        getShotIdBytes() {
      java.lang.Object ref = shotId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shotId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shotId = 3 [json_name = "shotId"];</code>
     * @param value The shotId to set.
     * @return This builder for chaining.
     */
    public Builder setShotId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shotId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string shotId = 3 [json_name = "shotId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShotId() {
      shotId_ = getDefaultInstance().getShotId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string shotId = 3 [json_name = "shotId"];</code>
     * @param value The bytes for shotId to set.
     * @return This builder for chaining.
     */
    public Builder setShotIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shotId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int action_ = 0;
    /**
     * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
     * @return The action.
     */
    @java.lang.Override
    public com.stafihub.stafihub.ledger.BondAction getAction() {
      com.stafihub.stafihub.ledger.BondAction result = com.stafihub.stafihub.ledger.BondAction.forNumber(action_);
      return result == null ? com.stafihub.stafihub.ledger.BondAction.UNRECOGNIZED : result;
    }
    /**
     * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.stafihub.stafihub.ledger.BondAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000008);
      action_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object propId_ = "";
    /**
     * <code>string propId = 5 [json_name = "propId"];</code>
     * @return The propId.
     */
    public java.lang.String getPropId() {
      java.lang.Object ref = propId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        propId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string propId = 5 [json_name = "propId"];</code>
     * @return The bytes for propId.
     */
    public com.google.protobuf.ByteString
        getPropIdBytes() {
      java.lang.Object ref = propId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string propId = 5 [json_name = "propId"];</code>
     * @param value The propId to set.
     * @return This builder for chaining.
     */
    public Builder setPropId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      propId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string propId = 5 [json_name = "propId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPropId() {
      propId_ = getDefaultInstance().getPropId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string propId = 5 [json_name = "propId"];</code>
     * @param value The bytes for propId to set.
     * @return This builder for chaining.
     */
    public Builder setPropIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      propId_ = value;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.ledger.BondReportProposal)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.ledger.BondReportProposal)
  private static final com.stafihub.stafihub.ledger.BondReportProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.ledger.BondReportProposal();
  }

  public static com.stafihub.stafihub.ledger.BondReportProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondReportProposal>
      PARSER = new com.google.protobuf.AbstractParser<BondReportProposal>() {
    @java.lang.Override
    public BondReportProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<BondReportProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondReportProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.ledger.BondReportProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

