// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/merkledrop/v1beta1/gov.proto

package com.bitsong.merkledrop.v1beta1;

/**
 * Protobuf type {@code bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit}
 */
public final class UpdateFeesProposalWithDeposit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)
    UpdateFeesProposalWithDepositOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFeesProposalWithDeposit.newBuilder() to construct.
  private UpdateFeesProposalWithDeposit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFeesProposalWithDeposit() {
    title_ = "";
    description_ = "";
    creationFee_ = "";
    deposit_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFeesProposalWithDeposit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bitsong.merkledrop.v1beta1.GovProto.internal_static_bitsong_merkledrop_v1beta1_UpdateFeesProposalWithDeposit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bitsong.merkledrop.v1beta1.GovProto.internal_static_bitsong_merkledrop_v1beta1_UpdateFeesProposalWithDeposit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.class, com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.Builder.class);
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

  public static final int CREATION_FEE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creationFee_ = "";
  /**
   * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
   * @return The creationFee.
   */
  @java.lang.Override
  public java.lang.String getCreationFee() {
    java.lang.Object ref = creationFee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creationFee_ = s;
      return s;
    }
  }
  /**
   * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
   * @return The bytes for creationFee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreationFeeBytes() {
    java.lang.Object ref = creationFee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creationFee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPOSIT_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deposit_ = "";
  /**
   * <code>string deposit = 7 [json_name = "deposit"];</code>
   * @return The deposit.
   */
  @java.lang.Override
  public java.lang.String getDeposit() {
    java.lang.Object ref = deposit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deposit_ = s;
      return s;
    }
  }
  /**
   * <code>string deposit = 7 [json_name = "deposit"];</code>
   * @return The bytes for deposit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositBytes() {
    java.lang.Object ref = deposit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deposit_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creationFee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, creationFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deposit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, deposit_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creationFee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, creationFee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deposit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, deposit_);
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
    if (!(obj instanceof com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)) {
      return super.equals(obj);
    }
    com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit other = (com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getCreationFee()
        .equals(other.getCreationFee())) return false;
    if (!getDeposit()
        .equals(other.getDeposit())) return false;
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
    hash = (37 * hash) + CREATION_FEE_FIELD_NUMBER;
    hash = (53 * hash) + getCreationFee().hashCode();
    hash = (37 * hash) + DEPOSIT_FIELD_NUMBER;
    hash = (53 * hash) + getDeposit().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit parseFrom(
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
  public static Builder newBuilder(com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit prototype) {
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
   * Protobuf type {@code bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)
      com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDepositOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bitsong.merkledrop.v1beta1.GovProto.internal_static_bitsong_merkledrop_v1beta1_UpdateFeesProposalWithDeposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bitsong.merkledrop.v1beta1.GovProto.internal_static_bitsong_merkledrop_v1beta1_UpdateFeesProposalWithDeposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.class, com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.Builder.class);
    }

    // Construct using com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.newBuilder()
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
      creationFee_ = "";
      deposit_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bitsong.merkledrop.v1beta1.GovProto.internal_static_bitsong_merkledrop_v1beta1_UpdateFeesProposalWithDeposit_descriptor;
    }

    @java.lang.Override
    public com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit getDefaultInstanceForType() {
      return com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.getDefaultInstance();
    }

    @java.lang.Override
    public com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit build() {
      com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit buildPartial() {
      com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit result = new com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.creationFee_ = creationFee_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.deposit_ = deposit_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit) {
        return mergeFrom((com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit other) {
      if (other == com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit.getDefaultInstance()) return this;
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
      if (!other.getCreationFee().isEmpty()) {
        creationFee_ = other.creationFee_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDeposit().isEmpty()) {
        deposit_ = other.deposit_;
        bitField0_ |= 0x00000008;
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
              creationFee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 58: {
              deposit_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 58
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

    private java.lang.Object creationFee_ = "";
    /**
     * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
     * @return The creationFee.
     */
    public java.lang.String getCreationFee() {
      java.lang.Object ref = creationFee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creationFee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
     * @return The bytes for creationFee.
     */
    public com.google.protobuf.ByteString
        getCreationFeeBytes() {
      java.lang.Object ref = creationFee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creationFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
     * @param value The creationFee to set.
     * @return This builder for chaining.
     */
    public Builder setCreationFee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creationFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationFee() {
      creationFee_ = getDefaultInstance().getCreationFee();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string creation_fee = 3 [json_name = "creationFee"];</code>
     * @param value The bytes for creationFee to set.
     * @return This builder for chaining.
     */
    public Builder setCreationFeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creationFee_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object deposit_ = "";
    /**
     * <code>string deposit = 7 [json_name = "deposit"];</code>
     * @return The deposit.
     */
    public java.lang.String getDeposit() {
      java.lang.Object ref = deposit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deposit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deposit = 7 [json_name = "deposit"];</code>
     * @return The bytes for deposit.
     */
    public com.google.protobuf.ByteString
        getDepositBytes() {
      java.lang.Object ref = deposit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deposit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deposit = 7 [json_name = "deposit"];</code>
     * @param value The deposit to set.
     * @return This builder for chaining.
     */
    public Builder setDeposit(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deposit_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string deposit = 7 [json_name = "deposit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeposit() {
      deposit_ = getDefaultInstance().getDeposit();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string deposit = 7 [json_name = "deposit"];</code>
     * @param value The bytes for deposit to set.
     * @return This builder for chaining.
     */
    public Builder setDepositBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deposit_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)
  }

  // @@protoc_insertion_point(class_scope:bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit)
  private static final com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit();
  }

  public static com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFeesProposalWithDeposit>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFeesProposalWithDeposit>() {
    @java.lang.Override
    public UpdateFeesProposalWithDeposit parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFeesProposalWithDeposit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFeesProposalWithDeposit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bitsong.merkledrop.v1beta1.UpdateFeesProposalWithDeposit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

