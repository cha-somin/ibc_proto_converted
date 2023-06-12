// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/tx.proto

package com.regen.data.v1alpha2;

/**
 * <pre>
 * MsgAnchorData is the Msg/AnchorData response type.
 * </pre>
 *
 * Protobuf type {@code regen.data.v1alpha2.MsgAnchorDataResponse}
 */
public final class MsgAnchorDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.data.v1alpha2.MsgAnchorDataResponse)
    MsgAnchorDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAnchorDataResponse.newBuilder() to construct.
  private MsgAnchorDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAnchorDataResponse() {
    iri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAnchorDataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.data.v1alpha2.TxProto.internal_static_regen_data_v1alpha2_MsgAnchorDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.data.v1alpha2.TxProto.internal_static_regen_data_v1alpha2_MsgAnchorDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.data.v1alpha2.MsgAnchorDataResponse.class, com.regen.data.v1alpha2.MsgAnchorDataResponse.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }

  public static final int IRI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iri_ = "";
  /**
   * <pre>
   * iri is the IRI of the data that was anchored.
   * </pre>
   *
   * <code>string iri = 2 [json_name = "iri"];</code>
   * @return The iri.
   */
  @java.lang.Override
  public java.lang.String getIri() {
    java.lang.Object ref = iri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * iri is the IRI of the data that was anchored.
   * </pre>
   *
   * <code>string iri = 2 [json_name = "iri"];</code>
   * @return The bytes for iri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIriBytes() {
    java.lang.Object ref = iri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iri_ = b;
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
    if (timestamp_ != null) {
      output.writeMessage(1, getTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, iri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, iri_);
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
    if (!(obj instanceof com.regen.data.v1alpha2.MsgAnchorDataResponse)) {
      return super.equals(obj);
    }
    com.regen.data.v1alpha2.MsgAnchorDataResponse other = (com.regen.data.v1alpha2.MsgAnchorDataResponse) obj;

    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (!getIri()
        .equals(other.getIri())) return false;
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
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (37 * hash) + IRI_FIELD_NUMBER;
    hash = (53 * hash) + getIri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.data.v1alpha2.MsgAnchorDataResponse parseFrom(
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
  public static Builder newBuilder(com.regen.data.v1alpha2.MsgAnchorDataResponse prototype) {
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
   * MsgAnchorData is the Msg/AnchorData response type.
   * </pre>
   *
   * Protobuf type {@code regen.data.v1alpha2.MsgAnchorDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.data.v1alpha2.MsgAnchorDataResponse)
      com.regen.data.v1alpha2.MsgAnchorDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.data.v1alpha2.TxProto.internal_static_regen_data_v1alpha2_MsgAnchorDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.data.v1alpha2.TxProto.internal_static_regen_data_v1alpha2_MsgAnchorDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.data.v1alpha2.MsgAnchorDataResponse.class, com.regen.data.v1alpha2.MsgAnchorDataResponse.Builder.class);
    }

    // Construct using com.regen.data.v1alpha2.MsgAnchorDataResponse.newBuilder()
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
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      iri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.data.v1alpha2.TxProto.internal_static_regen_data_v1alpha2_MsgAnchorDataResponse_descriptor;
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.MsgAnchorDataResponse getDefaultInstanceForType() {
      return com.regen.data.v1alpha2.MsgAnchorDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.MsgAnchorDataResponse build() {
      com.regen.data.v1alpha2.MsgAnchorDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.MsgAnchorDataResponse buildPartial() {
      com.regen.data.v1alpha2.MsgAnchorDataResponse result = new com.regen.data.v1alpha2.MsgAnchorDataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.data.v1alpha2.MsgAnchorDataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.iri_ = iri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.data.v1alpha2.MsgAnchorDataResponse) {
        return mergeFrom((com.regen.data.v1alpha2.MsgAnchorDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.data.v1alpha2.MsgAnchorDataResponse other) {
      if (other == com.regen.data.v1alpha2.MsgAnchorDataResponse.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (!other.getIri().isEmpty()) {
        iri_ = other.iri_;
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
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              iri_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <pre>
     * timestamp is the timestamp of the block at which the data was anchored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private java.lang.Object iri_ = "";
    /**
     * <pre>
     * iri is the IRI of the data that was anchored.
     * </pre>
     *
     * <code>string iri = 2 [json_name = "iri"];</code>
     * @return The iri.
     */
    public java.lang.String getIri() {
      java.lang.Object ref = iri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * iri is the IRI of the data that was anchored.
     * </pre>
     *
     * <code>string iri = 2 [json_name = "iri"];</code>
     * @return The bytes for iri.
     */
    public com.google.protobuf.ByteString
        getIriBytes() {
      java.lang.Object ref = iri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * iri is the IRI of the data that was anchored.
     * </pre>
     *
     * <code>string iri = 2 [json_name = "iri"];</code>
     * @param value The iri to set.
     * @return This builder for chaining.
     */
    public Builder setIri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * iri is the IRI of the data that was anchored.
     * </pre>
     *
     * <code>string iri = 2 [json_name = "iri"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIri() {
      iri_ = getDefaultInstance().getIri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * iri is the IRI of the data that was anchored.
     * </pre>
     *
     * <code>string iri = 2 [json_name = "iri"];</code>
     * @param value The bytes for iri to set.
     * @return This builder for chaining.
     */
    public Builder setIriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iri_ = value;
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


    // @@protoc_insertion_point(builder_scope:regen.data.v1alpha2.MsgAnchorDataResponse)
  }

  // @@protoc_insertion_point(class_scope:regen.data.v1alpha2.MsgAnchorDataResponse)
  private static final com.regen.data.v1alpha2.MsgAnchorDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.data.v1alpha2.MsgAnchorDataResponse();
  }

  public static com.regen.data.v1alpha2.MsgAnchorDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAnchorDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgAnchorDataResponse>() {
    @java.lang.Override
    public MsgAnchorDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAnchorDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAnchorDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.data.v1alpha2.MsgAnchorDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

