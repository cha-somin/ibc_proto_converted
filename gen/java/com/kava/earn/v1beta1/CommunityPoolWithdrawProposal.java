// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/earn/v1beta1/proposal.proto

package com.kava.earn.v1beta1;

/**
 * <pre>
 * CommunityPoolWithdrawProposal withdraws from an earn vault back to community pool
 * </pre>
 *
 * Protobuf type {@code kava.earn.v1beta1.CommunityPoolWithdrawProposal}
 */
public final class CommunityPoolWithdrawProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.earn.v1beta1.CommunityPoolWithdrawProposal)
    CommunityPoolWithdrawProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommunityPoolWithdrawProposal.newBuilder() to construct.
  private CommunityPoolWithdrawProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommunityPoolWithdrawProposal() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommunityPoolWithdrawProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.earn.v1beta1.ProposalProto.internal_static_kava_earn_v1beta1_CommunityPoolWithdrawProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.earn.v1beta1.ProposalProto.internal_static_kava_earn_v1beta1_CommunityPoolWithdrawProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.class, com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.Builder.class);
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

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
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
    if (amount_ != null) {
      output.writeMessage(3, getAmount());
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
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAmount());
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
    if (!(obj instanceof com.kava.earn.v1beta1.CommunityPoolWithdrawProposal)) {
      return super.equals(obj);
    }
    com.kava.earn.v1beta1.CommunityPoolWithdrawProposal other = (com.kava.earn.v1beta1.CommunityPoolWithdrawProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
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
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal parseFrom(
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
  public static Builder newBuilder(com.kava.earn.v1beta1.CommunityPoolWithdrawProposal prototype) {
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
   * CommunityPoolWithdrawProposal withdraws from an earn vault back to community pool
   * </pre>
   *
   * Protobuf type {@code kava.earn.v1beta1.CommunityPoolWithdrawProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.earn.v1beta1.CommunityPoolWithdrawProposal)
      com.kava.earn.v1beta1.CommunityPoolWithdrawProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.earn.v1beta1.ProposalProto.internal_static_kava_earn_v1beta1_CommunityPoolWithdrawProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.earn.v1beta1.ProposalProto.internal_static_kava_earn_v1beta1_CommunityPoolWithdrawProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.class, com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.Builder.class);
    }

    // Construct using com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.newBuilder()
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
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.earn.v1beta1.ProposalProto.internal_static_kava_earn_v1beta1_CommunityPoolWithdrawProposal_descriptor;
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.CommunityPoolWithdrawProposal getDefaultInstanceForType() {
      return com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.CommunityPoolWithdrawProposal build() {
      com.kava.earn.v1beta1.CommunityPoolWithdrawProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.earn.v1beta1.CommunityPoolWithdrawProposal buildPartial() {
      com.kava.earn.v1beta1.CommunityPoolWithdrawProposal result = new com.kava.earn.v1beta1.CommunityPoolWithdrawProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.earn.v1beta1.CommunityPoolWithdrawProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.earn.v1beta1.CommunityPoolWithdrawProposal) {
        return mergeFrom((com.kava.earn.v1beta1.CommunityPoolWithdrawProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.earn.v1beta1.CommunityPoolWithdrawProposal other) {
      if (other == com.kava.earn.v1beta1.CommunityPoolWithdrawProposal.getDefaultInstance()) return this;
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
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    public com.cosmos.base.v1beta1.Coin getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.earn.v1beta1.CommunityPoolWithdrawProposal)
  }

  // @@protoc_insertion_point(class_scope:kava.earn.v1beta1.CommunityPoolWithdrawProposal)
  private static final com.kava.earn.v1beta1.CommunityPoolWithdrawProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.earn.v1beta1.CommunityPoolWithdrawProposal();
  }

  public static com.kava.earn.v1beta1.CommunityPoolWithdrawProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommunityPoolWithdrawProposal>
      PARSER = new com.google.protobuf.AbstractParser<CommunityPoolWithdrawProposal>() {
    @java.lang.Override
    public CommunityPoolWithdrawProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommunityPoolWithdrawProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommunityPoolWithdrawProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.earn.v1beta1.CommunityPoolWithdrawProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

