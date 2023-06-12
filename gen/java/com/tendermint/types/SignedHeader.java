// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

/**
 * Protobuf type {@code tendermint.types.SignedHeader}
 */
public final class SignedHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.SignedHeader)
    SignedHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignedHeader.newBuilder() to construct.
  private SignedHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignedHeader() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignedHeader();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_SignedHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_SignedHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.SignedHeader.class, com.tendermint.types.SignedHeader.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.tendermint.types.Header header_;
  /**
   * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
   * @return The header.
   */
  @java.lang.Override
  public com.tendermint.types.Header getHeader() {
    return header_ == null ? com.tendermint.types.Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? com.tendermint.types.Header.getDefaultInstance() : header_;
  }

  public static final int COMMIT_FIELD_NUMBER = 2;
  private com.tendermint.types.Commit commit_;
  /**
   * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
   * @return Whether the commit field is set.
   */
  @java.lang.Override
  public boolean hasCommit() {
    return commit_ != null;
  }
  /**
   * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
   * @return The commit.
   */
  @java.lang.Override
  public com.tendermint.types.Commit getCommit() {
    return commit_ == null ? com.tendermint.types.Commit.getDefaultInstance() : commit_;
  }
  /**
   * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.CommitOrBuilder getCommitOrBuilder() {
    return commit_ == null ? com.tendermint.types.Commit.getDefaultInstance() : commit_;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (commit_ != null) {
      output.writeMessage(2, getCommit());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (commit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCommit());
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
    if (!(obj instanceof com.tendermint.types.SignedHeader)) {
      return super.equals(obj);
    }
    com.tendermint.types.SignedHeader other = (com.tendermint.types.SignedHeader) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasCommit() != other.hasCommit()) return false;
    if (hasCommit()) {
      if (!getCommit()
          .equals(other.getCommit())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasCommit()) {
      hash = (37 * hash) + COMMIT_FIELD_NUMBER;
      hash = (53 * hash) + getCommit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.SignedHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.SignedHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.SignedHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tendermint.types.SignedHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tendermint.types.SignedHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.SignedHeader parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.SignedHeader prototype) {
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
   * Protobuf type {@code tendermint.types.SignedHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.SignedHeader)
      com.tendermint.types.SignedHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_SignedHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_SignedHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.SignedHeader.class, com.tendermint.types.SignedHeader.Builder.class);
    }

    // Construct using com.tendermint.types.SignedHeader.newBuilder()
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
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      commit_ = null;
      if (commitBuilder_ != null) {
        commitBuilder_.dispose();
        commitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_SignedHeader_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.SignedHeader getDefaultInstanceForType() {
      return com.tendermint.types.SignedHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.SignedHeader build() {
      com.tendermint.types.SignedHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.SignedHeader buildPartial() {
      com.tendermint.types.SignedHeader result = new com.tendermint.types.SignedHeader(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.types.SignedHeader result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commit_ = commitBuilder_ == null
            ? commit_
            : commitBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tendermint.types.SignedHeader) {
        return mergeFrom((com.tendermint.types.SignedHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.SignedHeader other) {
      if (other == com.tendermint.types.SignedHeader.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasCommit()) {
        mergeCommit(other.getCommit());
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
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCommitFieldBuilder().getBuilder(),
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

    private com.tendermint.types.Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Header, com.tendermint.types.Header.Builder, com.tendermint.types.HeaderOrBuilder> headerBuilder_;
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     * @return The header.
     */
    public com.tendermint.types.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.tendermint.types.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public Builder setHeader(com.tendermint.types.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public Builder setHeader(
        com.tendermint.types.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public Builder mergeHeader(com.tendermint.types.Header value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          header_ != null &&
          header_ != com.tendermint.types.Header.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public com.tendermint.types.Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    public com.tendermint.types.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.tendermint.types.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Header, com.tendermint.types.Header.Builder, com.tendermint.types.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.Header, com.tendermint.types.Header.Builder, com.tendermint.types.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.tendermint.types.Commit commit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Commit, com.tendermint.types.Commit.Builder, com.tendermint.types.CommitOrBuilder> commitBuilder_;
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     * @return Whether the commit field is set.
     */
    public boolean hasCommit() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     * @return The commit.
     */
    public com.tendermint.types.Commit getCommit() {
      if (commitBuilder_ == null) {
        return commit_ == null ? com.tendermint.types.Commit.getDefaultInstance() : commit_;
      } else {
        return commitBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public Builder setCommit(com.tendermint.types.Commit value) {
      if (commitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commit_ = value;
      } else {
        commitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public Builder setCommit(
        com.tendermint.types.Commit.Builder builderForValue) {
      if (commitBuilder_ == null) {
        commit_ = builderForValue.build();
      } else {
        commitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public Builder mergeCommit(com.tendermint.types.Commit value) {
      if (commitBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          commit_ != null &&
          commit_ != com.tendermint.types.Commit.getDefaultInstance()) {
          getCommitBuilder().mergeFrom(value);
        } else {
          commit_ = value;
        }
      } else {
        commitBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public Builder clearCommit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      commit_ = null;
      if (commitBuilder_ != null) {
        commitBuilder_.dispose();
        commitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public com.tendermint.types.Commit.Builder getCommitBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCommitFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    public com.tendermint.types.CommitOrBuilder getCommitOrBuilder() {
      if (commitBuilder_ != null) {
        return commitBuilder_.getMessageOrBuilder();
      } else {
        return commit_ == null ?
            com.tendermint.types.Commit.getDefaultInstance() : commit_;
      }
    }
    /**
     * <code>.tendermint.types.Commit commit = 2 [json_name = "commit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Commit, com.tendermint.types.Commit.Builder, com.tendermint.types.CommitOrBuilder> 
        getCommitFieldBuilder() {
      if (commitBuilder_ == null) {
        commitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.Commit, com.tendermint.types.Commit.Builder, com.tendermint.types.CommitOrBuilder>(
                getCommit(),
                getParentForChildren(),
                isClean());
        commit_ = null;
      }
      return commitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.SignedHeader)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.SignedHeader)
  private static final com.tendermint.types.SignedHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.SignedHeader();
  }

  public static com.tendermint.types.SignedHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignedHeader>
      PARSER = new com.google.protobuf.AbstractParser<SignedHeader>() {
    @java.lang.Override
    public SignedHeader parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignedHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignedHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.SignedHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

