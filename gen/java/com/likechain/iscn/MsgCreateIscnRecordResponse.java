// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/iscn/tx.proto

package com.likechain.iscn;

/**
 * Protobuf type {@code likechain.iscn.MsgCreateIscnRecordResponse}
 */
public final class MsgCreateIscnRecordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.iscn.MsgCreateIscnRecordResponse)
    MsgCreateIscnRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateIscnRecordResponse.newBuilder() to construct.
  private MsgCreateIscnRecordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateIscnRecordResponse() {
    iscnId_ = "";
    recordIpld_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateIscnRecordResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.iscn.TxProto.internal_static_likechain_iscn_MsgCreateIscnRecordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.iscn.TxProto.internal_static_likechain_iscn_MsgCreateIscnRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.iscn.MsgCreateIscnRecordResponse.class, com.likechain.iscn.MsgCreateIscnRecordResponse.Builder.class);
  }

  public static final int ISCN_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iscnId_ = "";
  /**
   * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
   * @return The iscnId.
   */
  @java.lang.Override
  public java.lang.String getIscnId() {
    java.lang.Object ref = iscnId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iscnId_ = s;
      return s;
    }
  }
  /**
   * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
   * @return The bytes for iscnId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIscnIdBytes() {
    java.lang.Object ref = iscnId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iscnId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORD_IPLD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object recordIpld_ = "";
  /**
   * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
   * @return The recordIpld.
   */
  @java.lang.Override
  public java.lang.String getRecordIpld() {
    java.lang.Object ref = recordIpld_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordIpld_ = s;
      return s;
    }
  }
  /**
   * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
   * @return The bytes for recordIpld.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordIpldBytes() {
    java.lang.Object ref = recordIpld_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordIpld_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iscnId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordIpld_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recordIpld_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iscnId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordIpld_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recordIpld_);
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
    if (!(obj instanceof com.likechain.iscn.MsgCreateIscnRecordResponse)) {
      return super.equals(obj);
    }
    com.likechain.iscn.MsgCreateIscnRecordResponse other = (com.likechain.iscn.MsgCreateIscnRecordResponse) obj;

    if (!getIscnId()
        .equals(other.getIscnId())) return false;
    if (!getRecordIpld()
        .equals(other.getRecordIpld())) return false;
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
    hash = (37 * hash) + ISCN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIscnId().hashCode();
    hash = (37 * hash) + RECORD_IPLD_FIELD_NUMBER;
    hash = (53 * hash) + getRecordIpld().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.iscn.MsgCreateIscnRecordResponse parseFrom(
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
  public static Builder newBuilder(com.likechain.iscn.MsgCreateIscnRecordResponse prototype) {
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
   * Protobuf type {@code likechain.iscn.MsgCreateIscnRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.iscn.MsgCreateIscnRecordResponse)
      com.likechain.iscn.MsgCreateIscnRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.iscn.TxProto.internal_static_likechain_iscn_MsgCreateIscnRecordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.iscn.TxProto.internal_static_likechain_iscn_MsgCreateIscnRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.iscn.MsgCreateIscnRecordResponse.class, com.likechain.iscn.MsgCreateIscnRecordResponse.Builder.class);
    }

    // Construct using com.likechain.iscn.MsgCreateIscnRecordResponse.newBuilder()
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
      iscnId_ = "";
      recordIpld_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.iscn.TxProto.internal_static_likechain_iscn_MsgCreateIscnRecordResponse_descriptor;
    }

    @java.lang.Override
    public com.likechain.iscn.MsgCreateIscnRecordResponse getDefaultInstanceForType() {
      return com.likechain.iscn.MsgCreateIscnRecordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.iscn.MsgCreateIscnRecordResponse build() {
      com.likechain.iscn.MsgCreateIscnRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.iscn.MsgCreateIscnRecordResponse buildPartial() {
      com.likechain.iscn.MsgCreateIscnRecordResponse result = new com.likechain.iscn.MsgCreateIscnRecordResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.iscn.MsgCreateIscnRecordResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iscnId_ = iscnId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recordIpld_ = recordIpld_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.iscn.MsgCreateIscnRecordResponse) {
        return mergeFrom((com.likechain.iscn.MsgCreateIscnRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.iscn.MsgCreateIscnRecordResponse other) {
      if (other == com.likechain.iscn.MsgCreateIscnRecordResponse.getDefaultInstance()) return this;
      if (!other.getIscnId().isEmpty()) {
        iscnId_ = other.iscnId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRecordIpld().isEmpty()) {
        recordIpld_ = other.recordIpld_;
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
            case 10: {
              iscnId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              recordIpld_ = input.readStringRequireUtf8();
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

    private java.lang.Object iscnId_ = "";
    /**
     * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
     * @return The iscnId.
     */
    public java.lang.String getIscnId() {
      java.lang.Object ref = iscnId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iscnId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
     * @return The bytes for iscnId.
     */
    public com.google.protobuf.ByteString
        getIscnIdBytes() {
      java.lang.Object ref = iscnId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iscnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
     * @param value The iscnId to set.
     * @return This builder for chaining.
     */
    public Builder setIscnId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iscnId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIscnId() {
      iscnId_ = getDefaultInstance().getIscnId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string iscn_id = 1 [json_name = "iscnId"];</code>
     * @param value The bytes for iscnId to set.
     * @return This builder for chaining.
     */
    public Builder setIscnIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iscnId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object recordIpld_ = "";
    /**
     * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
     * @return The recordIpld.
     */
    public java.lang.String getRecordIpld() {
      java.lang.Object ref = recordIpld_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordIpld_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
     * @return The bytes for recordIpld.
     */
    public com.google.protobuf.ByteString
        getRecordIpldBytes() {
      java.lang.Object ref = recordIpld_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordIpld_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
     * @param value The recordIpld to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIpld(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      recordIpld_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordIpld() {
      recordIpld_ = getDefaultInstance().getRecordIpld();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string record_ipld = 2 [json_name = "recordIpld"];</code>
     * @param value The bytes for recordIpld to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIpldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      recordIpld_ = value;
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


    // @@protoc_insertion_point(builder_scope:likechain.iscn.MsgCreateIscnRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:likechain.iscn.MsgCreateIscnRecordResponse)
  private static final com.likechain.iscn.MsgCreateIscnRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.iscn.MsgCreateIscnRecordResponse();
  }

  public static com.likechain.iscn.MsgCreateIscnRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateIscnRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateIscnRecordResponse>() {
    @java.lang.Override
    public MsgCreateIscnRecordResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateIscnRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateIscnRecordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.iscn.MsgCreateIscnRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

