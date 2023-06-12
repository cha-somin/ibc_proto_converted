// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/tx.proto

package com.provenance.name.v1;

/**
 * <pre>
 * MsgModifyNameRequest defines a governance method that is used to update an existing address/name binding.
 * </pre>
 *
 * Protobuf type {@code provenance.name.v1.MsgModifyNameRequest}
 */
public final class MsgModifyNameRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.name.v1.MsgModifyNameRequest)
    MsgModifyNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgModifyNameRequest.newBuilder() to construct.
  private MsgModifyNameRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgModifyNameRequest() {
    authority_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgModifyNameRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgModifyNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgModifyNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.name.v1.MsgModifyNameRequest.class, com.provenance.name.v1.MsgModifyNameRequest.Builder.class);
  }

  public static final int AUTHORITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object authority_ = "";
  /**
   * <pre>
   * The address signing the message
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  @java.lang.Override
  public java.lang.String getAuthority() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authority_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The address signing the message
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorityBytes() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authority_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORD_FIELD_NUMBER = 2;
  private com.provenance.name.v1.NameRecord record_;
  /**
   * <pre>
   * The record being updated
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   * @return Whether the record field is set.
   */
  @java.lang.Override
  public boolean hasRecord() {
    return record_ != null;
  }
  /**
   * <pre>
   * The record being updated
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   * @return The record.
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecord getRecord() {
    return record_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
  }
  /**
   * <pre>
   * The record being updated
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecordOrBuilder getRecordOrBuilder() {
    return record_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authority_);
    }
    if (record_ != null) {
      output.writeMessage(2, getRecord());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authority_);
    }
    if (record_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRecord());
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
    if (!(obj instanceof com.provenance.name.v1.MsgModifyNameRequest)) {
      return super.equals(obj);
    }
    com.provenance.name.v1.MsgModifyNameRequest other = (com.provenance.name.v1.MsgModifyNameRequest) obj;

    if (!getAuthority()
        .equals(other.getAuthority())) return false;
    if (hasRecord() != other.hasRecord()) return false;
    if (hasRecord()) {
      if (!getRecord()
          .equals(other.getRecord())) return false;
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
    hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
    hash = (53 * hash) + getAuthority().hashCode();
    if (hasRecord()) {
      hash = (37 * hash) + RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRecord().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.name.v1.MsgModifyNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.name.v1.MsgModifyNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.MsgModifyNameRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.name.v1.MsgModifyNameRequest prototype) {
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
   * MsgModifyNameRequest defines a governance method that is used to update an existing address/name binding.
   * </pre>
   *
   * Protobuf type {@code provenance.name.v1.MsgModifyNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.name.v1.MsgModifyNameRequest)
      com.provenance.name.v1.MsgModifyNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgModifyNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgModifyNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.name.v1.MsgModifyNameRequest.class, com.provenance.name.v1.MsgModifyNameRequest.Builder.class);
    }

    // Construct using com.provenance.name.v1.MsgModifyNameRequest.newBuilder()
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
      authority_ = "";
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgModifyNameRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgModifyNameRequest getDefaultInstanceForType() {
      return com.provenance.name.v1.MsgModifyNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgModifyNameRequest build() {
      com.provenance.name.v1.MsgModifyNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgModifyNameRequest buildPartial() {
      com.provenance.name.v1.MsgModifyNameRequest result = new com.provenance.name.v1.MsgModifyNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.name.v1.MsgModifyNameRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authority_ = authority_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.record_ = recordBuilder_ == null
            ? record_
            : recordBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.name.v1.MsgModifyNameRequest) {
        return mergeFrom((com.provenance.name.v1.MsgModifyNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.name.v1.MsgModifyNameRequest other) {
      if (other == com.provenance.name.v1.MsgModifyNameRequest.getDefaultInstance()) return this;
      if (!other.getAuthority().isEmpty()) {
        authority_ = other.authority_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRecord()) {
        mergeRecord(other.getRecord());
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
              authority_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRecordFieldBuilder().getBuilder(),
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

    private java.lang.Object authority_ = "";
    /**
     * <pre>
     * The address signing the message
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The authority.
     */
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The address signing the message
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for authority.
     */
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The address signing the message
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthority(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The address signing the message
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthority() {
      authority_ = getDefaultInstance().getAuthority();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The address signing the message
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.provenance.name.v1.NameRecord record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> recordBuilder_;
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     * @return Whether the record field is set.
     */
    public boolean hasRecord() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     * @return The record.
     */
    public com.provenance.name.v1.NameRecord getRecord() {
      if (recordBuilder_ == null) {
        return record_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
      } else {
        return recordBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRecord(com.provenance.name.v1.NameRecord value) {
      if (recordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        record_ = value;
      } else {
        recordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRecord(
        com.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (recordBuilder_ == null) {
        record_ = builderForValue.build();
      } else {
        recordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeRecord(com.provenance.name.v1.NameRecord value) {
      if (recordBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          record_ != null &&
          record_ != com.provenance.name.v1.NameRecord.getDefaultInstance()) {
          getRecordBuilder().mergeFrom(value);
        } else {
          record_ = value;
        }
      } else {
        recordBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearRecord() {
      bitField0_ = (bitField0_ & ~0x00000002);
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord.Builder getRecordBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRecordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecordOrBuilder getRecordOrBuilder() {
      if (recordBuilder_ != null) {
        return recordBuilder_.getMessageOrBuilder();
      } else {
        return record_ == null ?
            com.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
      }
    }
    /**
     * <pre>
     * The record being updated
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> 
        getRecordFieldBuilder() {
      if (recordBuilder_ == null) {
        recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder>(
                getRecord(),
                getParentForChildren(),
                isClean());
        record_ = null;
      }
      return recordBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.name.v1.MsgModifyNameRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.name.v1.MsgModifyNameRequest)
  private static final com.provenance.name.v1.MsgModifyNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.name.v1.MsgModifyNameRequest();
  }

  public static com.provenance.name.v1.MsgModifyNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgModifyNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgModifyNameRequest>() {
    @java.lang.Override
    public MsgModifyNameRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgModifyNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgModifyNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.name.v1.MsgModifyNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

