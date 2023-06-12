// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/globalfee/v1/proposal.proto

package com.publicawesome.stargaze.globalfee.v1;

/**
 * Protobuf type {@code publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal}
 */
public final class SetCodeAuthorizationProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)
    SetCodeAuthorizationProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetCodeAuthorizationProposal.newBuilder() to construct.
  private SetCodeAuthorizationProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetCodeAuthorizationProposal() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetCodeAuthorizationProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.publicawesome.stargaze.globalfee.v1.ProposalProto.internal_static_publicawesome_stargaze_globalfee_v1_SetCodeAuthorizationProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.publicawesome.stargaze.globalfee.v1.ProposalProto.internal_static_publicawesome_stargaze_globalfee_v1_SetCodeAuthorizationProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.class, com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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

  public static final int CODE_AUTHORIZATION_FIELD_NUMBER = 3;
  private com.publicawesome.stargaze.globalfee.v1.CodeAuthorization codeAuthorization_;
  /**
   * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
   * @return Whether the codeAuthorization field is set.
   */
  @java.lang.Override
  public boolean hasCodeAuthorization() {
    return codeAuthorization_ != null;
  }
  /**
   * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
   * @return The codeAuthorization.
   */
  @java.lang.Override
  public com.publicawesome.stargaze.globalfee.v1.CodeAuthorization getCodeAuthorization() {
    return codeAuthorization_ == null ? com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.getDefaultInstance() : codeAuthorization_;
  }
  /**
   * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
   */
  @java.lang.Override
  public com.publicawesome.stargaze.globalfee.v1.CodeAuthorizationOrBuilder getCodeAuthorizationOrBuilder() {
    return codeAuthorization_ == null ? com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.getDefaultInstance() : codeAuthorization_;
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
    if (codeAuthorization_ != null) {
      output.writeMessage(3, getCodeAuthorization());
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
    if (codeAuthorization_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCodeAuthorization());
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
    if (!(obj instanceof com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)) {
      return super.equals(obj);
    }
    com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal other = (com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasCodeAuthorization() != other.hasCodeAuthorization()) return false;
    if (hasCodeAuthorization()) {
      if (!getCodeAuthorization()
          .equals(other.getCodeAuthorization())) return false;
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
    if (hasCodeAuthorization()) {
      hash = (37 * hash) + CODE_AUTHORIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getCodeAuthorization().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal parseFrom(
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
  public static Builder newBuilder(com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal prototype) {
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
   * Protobuf type {@code publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)
      com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.publicawesome.stargaze.globalfee.v1.ProposalProto.internal_static_publicawesome_stargaze_globalfee_v1_SetCodeAuthorizationProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.publicawesome.stargaze.globalfee.v1.ProposalProto.internal_static_publicawesome_stargaze_globalfee_v1_SetCodeAuthorizationProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.class, com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.Builder.class);
    }

    // Construct using com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.newBuilder()
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
      codeAuthorization_ = null;
      if (codeAuthorizationBuilder_ != null) {
        codeAuthorizationBuilder_.dispose();
        codeAuthorizationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.publicawesome.stargaze.globalfee.v1.ProposalProto.internal_static_publicawesome_stargaze_globalfee_v1_SetCodeAuthorizationProposal_descriptor;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal getDefaultInstanceForType() {
      return com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal build() {
      com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal buildPartial() {
      com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal result = new com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.codeAuthorization_ = codeAuthorizationBuilder_ == null
            ? codeAuthorization_
            : codeAuthorizationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal) {
        return mergeFrom((com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal other) {
      if (other == com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.getDefaultInstance()) return this;
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
      if (other.hasCodeAuthorization()) {
        mergeCodeAuthorization(other.getCodeAuthorization());
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
                  getCodeAuthorizationFieldBuilder().getBuilder(),
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
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
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
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
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

    private com.publicawesome.stargaze.globalfee.v1.CodeAuthorization codeAuthorization_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.publicawesome.stargaze.globalfee.v1.CodeAuthorization, com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.Builder, com.publicawesome.stargaze.globalfee.v1.CodeAuthorizationOrBuilder> codeAuthorizationBuilder_;
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     * @return Whether the codeAuthorization field is set.
     */
    public boolean hasCodeAuthorization() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     * @return The codeAuthorization.
     */
    public com.publicawesome.stargaze.globalfee.v1.CodeAuthorization getCodeAuthorization() {
      if (codeAuthorizationBuilder_ == null) {
        return codeAuthorization_ == null ? com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.getDefaultInstance() : codeAuthorization_;
      } else {
        return codeAuthorizationBuilder_.getMessage();
      }
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public Builder setCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.CodeAuthorization value) {
      if (codeAuthorizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        codeAuthorization_ = value;
      } else {
        codeAuthorizationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public Builder setCodeAuthorization(
        com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.Builder builderForValue) {
      if (codeAuthorizationBuilder_ == null) {
        codeAuthorization_ = builderForValue.build();
      } else {
        codeAuthorizationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public Builder mergeCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.CodeAuthorization value) {
      if (codeAuthorizationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          codeAuthorization_ != null &&
          codeAuthorization_ != com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.getDefaultInstance()) {
          getCodeAuthorizationBuilder().mergeFrom(value);
        } else {
          codeAuthorization_ = value;
        }
      } else {
        codeAuthorizationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public Builder clearCodeAuthorization() {
      bitField0_ = (bitField0_ & ~0x00000004);
      codeAuthorization_ = null;
      if (codeAuthorizationBuilder_ != null) {
        codeAuthorizationBuilder_.dispose();
        codeAuthorizationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.Builder getCodeAuthorizationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCodeAuthorizationFieldBuilder().getBuilder();
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    public com.publicawesome.stargaze.globalfee.v1.CodeAuthorizationOrBuilder getCodeAuthorizationOrBuilder() {
      if (codeAuthorizationBuilder_ != null) {
        return codeAuthorizationBuilder_.getMessageOrBuilder();
      } else {
        return codeAuthorization_ == null ?
            com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.getDefaultInstance() : codeAuthorization_;
      }
    }
    /**
     * <code>.publicawesome.stargaze.globalfee.v1.CodeAuthorization code_authorization = 3 [json_name = "codeAuthorization", (.gogoproto.moretags) = "yaml:&#92;"code_authorization&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.publicawesome.stargaze.globalfee.v1.CodeAuthorization, com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.Builder, com.publicawesome.stargaze.globalfee.v1.CodeAuthorizationOrBuilder> 
        getCodeAuthorizationFieldBuilder() {
      if (codeAuthorizationBuilder_ == null) {
        codeAuthorizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.publicawesome.stargaze.globalfee.v1.CodeAuthorization, com.publicawesome.stargaze.globalfee.v1.CodeAuthorization.Builder, com.publicawesome.stargaze.globalfee.v1.CodeAuthorizationOrBuilder>(
                getCodeAuthorization(),
                getParentForChildren(),
                isClean());
        codeAuthorization_ = null;
      }
      return codeAuthorizationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)
  }

  // @@protoc_insertion_point(class_scope:publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal)
  private static final com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal();
  }

  public static com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetCodeAuthorizationProposal>
      PARSER = new com.google.protobuf.AbstractParser<SetCodeAuthorizationProposal>() {
    @java.lang.Override
    public SetCodeAuthorizationProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetCodeAuthorizationProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetCodeAuthorizationProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

