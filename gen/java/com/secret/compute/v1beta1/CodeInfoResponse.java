// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/query.proto

package com.secret.compute.v1beta1;

/**
 * Protobuf type {@code secret.compute.v1beta1.CodeInfoResponse}
 */
public final class CodeInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:secret.compute.v1beta1.CodeInfoResponse)
    CodeInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CodeInfoResponse.newBuilder() to construct.
  private CodeInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CodeInfoResponse() {
    creator_ = "";
    codeHash_ = "";
    source_ = "";
    builder_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CodeInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.secret.compute.v1beta1.QueryProto.internal_static_secret_compute_v1beta1_CodeInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.secret.compute.v1beta1.QueryProto.internal_static_secret_compute_v1beta1_CodeInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.secret.compute.v1beta1.CodeInfoResponse.class, com.secret.compute.v1beta1.CodeInfoResponse.Builder.class);
  }

  public static final int CODE_ID_FIELD_NUMBER = 1;
  private long codeId_ = 0L;
  /**
   * <code>uint64 code_id = 1 [json_name = "codeId"];</code>
   * @return The codeId.
   */
  @java.lang.Override
  public long getCodeId() {
    return codeId_;
  }

  public static final int CREATOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <pre>
   * creator is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string creator = 2 [json_name = "creator"];</code>
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
   * creator is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string creator = 2 [json_name = "creator"];</code>
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

  public static final int CODE_HASH_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object codeHash_ = "";
  /**
   * <code>string code_hash = 3 [json_name = "codeHash"];</code>
   * @return The codeHash.
   */
  @java.lang.Override
  public java.lang.String getCodeHash() {
    java.lang.Object ref = codeHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codeHash_ = s;
      return s;
    }
  }
  /**
   * <code>string code_hash = 3 [json_name = "codeHash"];</code>
   * @return The bytes for codeHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeHashBytes() {
    java.lang.Object ref = codeHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codeHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object source_ = "";
  /**
   * <code>string source = 4 [json_name = "source"];</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>string source = 4 [json_name = "source"];</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILDER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object builder_ = "";
  /**
   * <code>string builder = 5 [json_name = "builder"];</code>
   * @return The builder.
   */
  @java.lang.Override
  public java.lang.String getBuilder() {
    java.lang.Object ref = builder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      builder_ = s;
      return s;
    }
  }
  /**
   * <code>string builder = 5 [json_name = "builder"];</code>
   * @return The bytes for builder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBuilderBytes() {
    java.lang.Object ref = builder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      builder_ = b;
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
    if (codeId_ != 0L) {
      output.writeUInt64(1, codeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeHash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, codeHash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(builder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, builder_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (codeId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, codeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeHash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, codeHash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(builder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, builder_);
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
    if (!(obj instanceof com.secret.compute.v1beta1.CodeInfoResponse)) {
      return super.equals(obj);
    }
    com.secret.compute.v1beta1.CodeInfoResponse other = (com.secret.compute.v1beta1.CodeInfoResponse) obj;

    if (getCodeId()
        != other.getCodeId()) return false;
    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getCodeHash()
        .equals(other.getCodeHash())) return false;
    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getBuilder()
        .equals(other.getBuilder())) return false;
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
    hash = (37 * hash) + CODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCodeId());
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + CODE_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getCodeHash().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (37 * hash) + BUILDER_FIELD_NUMBER;
    hash = (53 * hash) + getBuilder().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.secret.compute.v1beta1.CodeInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.secret.compute.v1beta1.CodeInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.secret.compute.v1beta1.CodeInfoResponse parseFrom(
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
  public static Builder newBuilder(com.secret.compute.v1beta1.CodeInfoResponse prototype) {
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
   * Protobuf type {@code secret.compute.v1beta1.CodeInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:secret.compute.v1beta1.CodeInfoResponse)
      com.secret.compute.v1beta1.CodeInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.secret.compute.v1beta1.QueryProto.internal_static_secret_compute_v1beta1_CodeInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.secret.compute.v1beta1.QueryProto.internal_static_secret_compute_v1beta1_CodeInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.secret.compute.v1beta1.CodeInfoResponse.class, com.secret.compute.v1beta1.CodeInfoResponse.Builder.class);
    }

    // Construct using com.secret.compute.v1beta1.CodeInfoResponse.newBuilder()
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
      codeId_ = 0L;
      creator_ = "";
      codeHash_ = "";
      source_ = "";
      builder_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.secret.compute.v1beta1.QueryProto.internal_static_secret_compute_v1beta1_CodeInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.secret.compute.v1beta1.CodeInfoResponse getDefaultInstanceForType() {
      return com.secret.compute.v1beta1.CodeInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.secret.compute.v1beta1.CodeInfoResponse build() {
      com.secret.compute.v1beta1.CodeInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.secret.compute.v1beta1.CodeInfoResponse buildPartial() {
      com.secret.compute.v1beta1.CodeInfoResponse result = new com.secret.compute.v1beta1.CodeInfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.secret.compute.v1beta1.CodeInfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.codeId_ = codeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.codeHash_ = codeHash_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.source_ = source_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.builder_ = builder_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.secret.compute.v1beta1.CodeInfoResponse) {
        return mergeFrom((com.secret.compute.v1beta1.CodeInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.secret.compute.v1beta1.CodeInfoResponse other) {
      if (other == com.secret.compute.v1beta1.CodeInfoResponse.getDefaultInstance()) return this;
      if (other.getCodeId() != 0L) {
        setCodeId(other.getCodeId());
      }
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCodeHash().isEmpty()) {
        codeHash_ = other.codeHash_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getBuilder().isEmpty()) {
        builder_ = other.builder_;
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
              codeId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              codeHash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              source_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              builder_ = input.readStringRequireUtf8();
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

    private long codeId_ ;
    /**
     * <code>uint64 code_id = 1 [json_name = "codeId"];</code>
     * @return The codeId.
     */
    @java.lang.Override
    public long getCodeId() {
      return codeId_;
    }
    /**
     * <code>uint64 code_id = 1 [json_name = "codeId"];</code>
     * @param value The codeId to set.
     * @return This builder for chaining.
     */
    public Builder setCodeId(long value) {

      codeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 code_id = 1 [json_name = "codeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCodeId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      codeId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object creator_ = "";
    /**
     * <pre>
     * creator is the bech32 human readable address of the contract
     * </pre>
     *
     * <code>string creator = 2 [json_name = "creator"];</code>
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
     * creator is the bech32 human readable address of the contract
     * </pre>
     *
     * <code>string creator = 2 [json_name = "creator"];</code>
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
     * creator is the bech32 human readable address of the contract
     * </pre>
     *
     * <code>string creator = 2 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creator is the bech32 human readable address of the contract
     * </pre>
     *
     * <code>string creator = 2 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creator is the bech32 human readable address of the contract
     * </pre>
     *
     * <code>string creator = 2 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object codeHash_ = "";
    /**
     * <code>string code_hash = 3 [json_name = "codeHash"];</code>
     * @return The codeHash.
     */
    public java.lang.String getCodeHash() {
      java.lang.Object ref = codeHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codeHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string code_hash = 3 [json_name = "codeHash"];</code>
     * @return The bytes for codeHash.
     */
    public com.google.protobuf.ByteString
        getCodeHashBytes() {
      java.lang.Object ref = codeHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codeHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string code_hash = 3 [json_name = "codeHash"];</code>
     * @param value The codeHash to set.
     * @return This builder for chaining.
     */
    public Builder setCodeHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      codeHash_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string code_hash = 3 [json_name = "codeHash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCodeHash() {
      codeHash_ = getDefaultInstance().getCodeHash();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string code_hash = 3 [json_name = "codeHash"];</code>
     * @param value The bytes for codeHash to set.
     * @return This builder for chaining.
     */
    public Builder setCodeHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      codeHash_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <code>string source = 4 [json_name = "source"];</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source = 4 [json_name = "source"];</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source = 4 [json_name = "source"];</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      source_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string source = 4 [json_name = "source"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      source_ = getDefaultInstance().getSource();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string source = 4 [json_name = "source"];</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      source_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object builder_ = "";
    /**
     * <code>string builder = 5 [json_name = "builder"];</code>
     * @return The builder.
     */
    public java.lang.String getBuilder() {
      java.lang.Object ref = builder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        builder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string builder = 5 [json_name = "builder"];</code>
     * @return The bytes for builder.
     */
    public com.google.protobuf.ByteString
        getBuilderBytes() {
      java.lang.Object ref = builder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        builder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string builder = 5 [json_name = "builder"];</code>
     * @param value The builder to set.
     * @return This builder for chaining.
     */
    public Builder setBuilder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      builder_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string builder = 5 [json_name = "builder"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBuilder() {
      builder_ = getDefaultInstance().getBuilder();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string builder = 5 [json_name = "builder"];</code>
     * @param value The bytes for builder to set.
     * @return This builder for chaining.
     */
    public Builder setBuilderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      builder_ = value;
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


    // @@protoc_insertion_point(builder_scope:secret.compute.v1beta1.CodeInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:secret.compute.v1beta1.CodeInfoResponse)
  private static final com.secret.compute.v1beta1.CodeInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.secret.compute.v1beta1.CodeInfoResponse();
  }

  public static com.secret.compute.v1beta1.CodeInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CodeInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<CodeInfoResponse>() {
    @java.lang.Override
    public CodeInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CodeInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CodeInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.secret.compute.v1beta1.CodeInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

