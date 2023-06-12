// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/tx.proto

package com.provenance.name.v1;

/**
 * <pre>
 * MsgBindNameRequest defines an sdk.Msg type that is used to add an address/name binding under an optional parent name.
 * The record may optionally be restricted to prevent additional names from being added under this one without the
 * owner signing the request.
 * </pre>
 *
 * Protobuf type {@code provenance.name.v1.MsgBindNameRequest}
 */
public final class MsgBindNameRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.name.v1.MsgBindNameRequest)
    MsgBindNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgBindNameRequest.newBuilder() to construct.
  private MsgBindNameRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgBindNameRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgBindNameRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgBindNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgBindNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.name.v1.MsgBindNameRequest.class, com.provenance.name.v1.MsgBindNameRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private com.provenance.name.v1.NameRecord parent_;
  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return parent_ != null;
  }
  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   * @return The parent.
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecord getParent() {
    return parent_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : parent_;
  }
  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecordOrBuilder getParentOrBuilder() {
    return parent_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : parent_;
  }

  public static final int RECORD_FIELD_NUMBER = 2;
  private com.provenance.name.v1.NameRecord record_;
  /**
   * <pre>
   * The name record to bind under the parent
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
   * The name record to bind under the parent
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
   * The name record to bind under the parent
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
    if (parent_ != null) {
      output.writeMessage(1, getParent());
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
    if (parent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParent());
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
    if (!(obj instanceof com.provenance.name.v1.MsgBindNameRequest)) {
      return super.equals(obj);
    }
    com.provenance.name.v1.MsgBindNameRequest other = (com.provenance.name.v1.MsgBindNameRequest) obj;

    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (!getParent()
          .equals(other.getParent())) return false;
    }
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
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getParent().hashCode();
    }
    if (hasRecord()) {
      hash = (37 * hash) + RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRecord().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.name.v1.MsgBindNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.name.v1.MsgBindNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.MsgBindNameRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.name.v1.MsgBindNameRequest prototype) {
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
   * MsgBindNameRequest defines an sdk.Msg type that is used to add an address/name binding under an optional parent name.
   * The record may optionally be restricted to prevent additional names from being added under this one without the
   * owner signing the request.
   * </pre>
   *
   * Protobuf type {@code provenance.name.v1.MsgBindNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.name.v1.MsgBindNameRequest)
      com.provenance.name.v1.MsgBindNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgBindNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgBindNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.name.v1.MsgBindNameRequest.class, com.provenance.name.v1.MsgBindNameRequest.Builder.class);
    }

    // Construct using com.provenance.name.v1.MsgBindNameRequest.newBuilder()
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
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
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
      return com.provenance.name.v1.TxProto.internal_static_provenance_name_v1_MsgBindNameRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgBindNameRequest getDefaultInstanceForType() {
      return com.provenance.name.v1.MsgBindNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgBindNameRequest build() {
      com.provenance.name.v1.MsgBindNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.name.v1.MsgBindNameRequest buildPartial() {
      com.provenance.name.v1.MsgBindNameRequest result = new com.provenance.name.v1.MsgBindNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.name.v1.MsgBindNameRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parentBuilder_ == null
            ? parent_
            : parentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.record_ = recordBuilder_ == null
            ? record_
            : recordBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.name.v1.MsgBindNameRequest) {
        return mergeFrom((com.provenance.name.v1.MsgBindNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.name.v1.MsgBindNameRequest other) {
      if (other == com.provenance.name.v1.MsgBindNameRequest.getDefaultInstance()) return this;
      if (other.hasParent()) {
        mergeParent(other.getParent());
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
              input.readMessage(
                  getParentFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.provenance.name.v1.NameRecord parent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> parentBuilder_;
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     * @return Whether the parent field is set.
     */
    public boolean hasParent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     * @return The parent.
     */
    public com.provenance.name.v1.NameRecord getParent() {
      if (parentBuilder_ == null) {
        return parent_ == null ? com.provenance.name.v1.NameRecord.getDefaultInstance() : parent_;
      } else {
        return parentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParent(com.provenance.name.v1.NameRecord value) {
      if (parentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parent_ = value;
      } else {
        parentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParent(
        com.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (parentBuilder_ == null) {
        parent_ = builderForValue.build();
      } else {
        parentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParent(com.provenance.name.v1.NameRecord value) {
      if (parentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          parent_ != null &&
          parent_ != com.provenance.name.v1.NameRecord.getDefaultInstance()) {
          getParentBuilder().mergeFrom(value);
        } else {
          parent_ = value;
        }
      } else {
        parentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parent_ = null;
      if (parentBuilder_ != null) {
        parentBuilder_.dispose();
        parentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord.Builder getParentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecordOrBuilder getParentOrBuilder() {
      if (parentBuilder_ != null) {
        return parentBuilder_.getMessageOrBuilder();
      } else {
        return parent_ == null ?
            com.provenance.name.v1.NameRecord.getDefaultInstance() : parent_;
      }
    }
    /**
     * <pre>
     * The parent record to bind this name under.
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> 
        getParentFieldBuilder() {
      if (parentBuilder_ == null) {
        parentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder>(
                getParent(),
                getParentForChildren(),
                isClean());
        parent_ = null;
      }
      return parentBuilder_;
    }

    private com.provenance.name.v1.NameRecord record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> recordBuilder_;
    /**
     * <pre>
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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
     * The name record to bind under the parent
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


    // @@protoc_insertion_point(builder_scope:provenance.name.v1.MsgBindNameRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.name.v1.MsgBindNameRequest)
  private static final com.provenance.name.v1.MsgBindNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.name.v1.MsgBindNameRequest();
  }

  public static com.provenance.name.v1.MsgBindNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgBindNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgBindNameRequest>() {
    @java.lang.Override
    public MsgBindNameRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgBindNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgBindNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.name.v1.MsgBindNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

