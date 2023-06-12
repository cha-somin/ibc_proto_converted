// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/community/v1beta1/proposal.proto

package com.kava.community.v1beta1;

/**
 * <pre>
 * CommunityCDPWithdrawCollateralProposal withdraws cdp collateral owned by the community module
 * This proposal exists primarily to allow committees to withdraw community module cdp collateral.
 * </pre>
 *
 * Protobuf type {@code kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal}
 */
public final class CommunityCDPWithdrawCollateralProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)
    CommunityCDPWithdrawCollateralProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommunityCDPWithdrawCollateralProposal.newBuilder() to construct.
  private CommunityCDPWithdrawCollateralProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommunityCDPWithdrawCollateralProposal() {
    title_ = "";
    description_ = "";
    collateralType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommunityCDPWithdrawCollateralProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.community.v1beta1.ProposalProto.internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.community.v1beta1.ProposalProto.internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.class, com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLATERAL_TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collateralType_ = "";
  /**
   * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
   * @return The collateralType.
   */
  @java.lang.Override
  public java.lang.String getCollateralType() {
    java.lang.Object ref = collateralType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collateralType_ = s;
      return s;
    }
  }
  /**
   * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
   * @return The bytes for collateralType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollateralTypeBytes() {
    java.lang.Object ref = collateralType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collateralType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLATERAL_FIELD_NUMBER = 4;
  private com.cosmos.base.v1beta1.Coin collateral_;
  /**
   * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
   * @return Whether the collateral field is set.
   */
  @java.lang.Override
  public boolean hasCollateral() {
    return collateral_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
   * @return The collateral.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getCollateral() {
    return collateral_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : collateral_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getCollateralOrBuilder() {
    return collateral_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : collateral_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, collateralType_);
    }
    if (collateral_ != null) {
      output.writeMessage(4, getCollateral());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, collateralType_);
    }
    if (collateral_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCollateral());
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
    if (!(obj instanceof com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)) {
      return super.equals(obj);
    }
    com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal other = (com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getCollateralType()
        .equals(other.getCollateralType())) return false;
    if (hasCollateral() != other.hasCollateral()) return false;
    if (hasCollateral()) {
      if (!getCollateral()
          .equals(other.getCollateral())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + COLLATERAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCollateralType().hashCode();
    if (hasCollateral()) {
      hash = (37 * hash) + COLLATERAL_FIELD_NUMBER;
      hash = (53 * hash) + getCollateral().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal parseFrom(
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
  public static Builder newBuilder(com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal prototype) {
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
   * CommunityCDPWithdrawCollateralProposal withdraws cdp collateral owned by the community module
   * This proposal exists primarily to allow committees to withdraw community module cdp collateral.
   * </pre>
   *
   * Protobuf type {@code kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)
      com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.community.v1beta1.ProposalProto.internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.community.v1beta1.ProposalProto.internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.class, com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.Builder.class);
    }

    // Construct using com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.newBuilder()
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
      title_ = "";
      description_ = "";
      collateralType_ = "";
      collateral_ = null;
      if (collateralBuilder_ != null) {
        collateralBuilder_.dispose();
        collateralBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.community.v1beta1.ProposalProto.internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor;
    }

    @java.lang.Override
    public com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal getDefaultInstanceForType() {
      return com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal build() {
      com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal buildPartial() {
      com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal result = new com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.collateralType_ = collateralType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.collateral_ = collateralBuilder_ == null
            ? collateral_
            : collateralBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal) {
        return mergeFrom((com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal other) {
      if (other == com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCollateralType().isEmpty()) {
        collateralType_ = other.collateralType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasCollateral()) {
        mergeCollateral(other.getCollateral());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              collateralType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getCollateralFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object collateralType_ = "";
    /**
     * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
     * @return The collateralType.
     */
    public java.lang.String getCollateralType() {
      java.lang.Object ref = collateralType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collateralType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
     * @return The bytes for collateralType.
     */
    public com.google.protobuf.ByteString
        getCollateralTypeBytes() {
      java.lang.Object ref = collateralType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collateralType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
     * @param value The collateralType to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collateralType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollateralType() {
      collateralType_ = getDefaultInstance().getCollateralType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_type = 3 [json_name = "collateralType"];</code>
     * @param value The bytes for collateralType to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collateralType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin collateral_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> collateralBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     * @return Whether the collateral field is set.
     */
    public boolean hasCollateral() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     * @return The collateral.
     */
    public com.cosmos.base.v1beta1.Coin getCollateral() {
      if (collateralBuilder_ == null) {
        return collateral_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : collateral_;
      } else {
        return collateralBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCollateral(com.cosmos.base.v1beta1.Coin value) {
      if (collateralBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        collateral_ = value;
      } else {
        collateralBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCollateral(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (collateralBuilder_ == null) {
        collateral_ = builderForValue.build();
      } else {
        collateralBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeCollateral(com.cosmos.base.v1beta1.Coin value) {
      if (collateralBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          collateral_ != null &&
          collateral_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getCollateralBuilder().mergeFrom(value);
        } else {
          collateral_ = value;
        }
      } else {
        collateralBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearCollateral() {
      bitField0_ = (bitField0_ & ~0x00000008);
      collateral_ = null;
      if (collateralBuilder_ != null) {
        collateralBuilder_.dispose();
        collateralBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getCollateralBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getCollateralFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getCollateralOrBuilder() {
      if (collateralBuilder_ != null) {
        return collateralBuilder_.getMessageOrBuilder();
      } else {
        return collateral_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : collateral_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin collateral = 4 [json_name = "collateral", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getCollateralFieldBuilder() {
      if (collateralBuilder_ == null) {
        collateralBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getCollateral(),
                getParentForChildren(),
                isClean());
        collateral_ = null;
      }
      return collateralBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)
  }

  // @@protoc_insertion_point(class_scope:kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal)
  private static final com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal();
  }

  public static com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommunityCDPWithdrawCollateralProposal>
      PARSER = new com.google.protobuf.AbstractParser<CommunityCDPWithdrawCollateralProposal>() {
    @java.lang.Override
    public CommunityCDPWithdrawCollateralProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommunityCDPWithdrawCollateralProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommunityCDPWithdrawCollateralProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.community.v1beta1.CommunityCDPWithdrawCollateralProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

