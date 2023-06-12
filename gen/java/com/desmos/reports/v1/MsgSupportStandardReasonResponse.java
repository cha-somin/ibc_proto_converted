// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reports/v1/msgs.proto

package com.desmos.reports.v1;

/**
 * <pre>
 * MsgSupportStandardReasonResponse represents the Msg/SupportStandardReason
 * response type
 * </pre>
 *
 * Protobuf type {@code desmos.reports.v1.MsgSupportStandardReasonResponse}
 */
public final class MsgSupportStandardReasonResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.reports.v1.MsgSupportStandardReasonResponse)
    MsgSupportStandardReasonResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSupportStandardReasonResponse.newBuilder() to construct.
  private MsgSupportStandardReasonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSupportStandardReasonResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSupportStandardReasonResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgSupportStandardReasonResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgSupportStandardReasonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.reports.v1.MsgSupportStandardReasonResponse.class, com.desmos.reports.v1.MsgSupportStandardReasonResponse.Builder.class);
  }

  public static final int REASONS_IDS_FIELD_NUMBER = 1;
  private int reasonsIds_ = 0;
  /**
   * <pre>
   * Id of the newly added reason
   * </pre>
   *
   * <code>uint32 reasons_ids = 1 [json_name = "reasonsIds", (.gogoproto.customname) = "ReasonsID", (.gogoproto.moretags) = "yaml:&#92;"reasons_ids&#92;""];</code>
   * @return The reasonsIds.
   */
  @java.lang.Override
  public int getReasonsIds() {
    return reasonsIds_;
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
    if (reasonsIds_ != 0) {
      output.writeUInt32(1, reasonsIds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reasonsIds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, reasonsIds_);
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
    if (!(obj instanceof com.desmos.reports.v1.MsgSupportStandardReasonResponse)) {
      return super.equals(obj);
    }
    com.desmos.reports.v1.MsgSupportStandardReasonResponse other = (com.desmos.reports.v1.MsgSupportStandardReasonResponse) obj;

    if (getReasonsIds()
        != other.getReasonsIds()) return false;
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
    hash = (37 * hash) + REASONS_IDS_FIELD_NUMBER;
    hash = (53 * hash) + getReasonsIds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.reports.v1.MsgSupportStandardReasonResponse prototype) {
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
   * MsgSupportStandardReasonResponse represents the Msg/SupportStandardReason
   * response type
   * </pre>
   *
   * Protobuf type {@code desmos.reports.v1.MsgSupportStandardReasonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.reports.v1.MsgSupportStandardReasonResponse)
      com.desmos.reports.v1.MsgSupportStandardReasonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgSupportStandardReasonResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgSupportStandardReasonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.reports.v1.MsgSupportStandardReasonResponse.class, com.desmos.reports.v1.MsgSupportStandardReasonResponse.Builder.class);
    }

    // Construct using com.desmos.reports.v1.MsgSupportStandardReasonResponse.newBuilder()
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
      reasonsIds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgSupportStandardReasonResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgSupportStandardReasonResponse getDefaultInstanceForType() {
      return com.desmos.reports.v1.MsgSupportStandardReasonResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgSupportStandardReasonResponse build() {
      com.desmos.reports.v1.MsgSupportStandardReasonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgSupportStandardReasonResponse buildPartial() {
      com.desmos.reports.v1.MsgSupportStandardReasonResponse result = new com.desmos.reports.v1.MsgSupportStandardReasonResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.reports.v1.MsgSupportStandardReasonResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reasonsIds_ = reasonsIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.reports.v1.MsgSupportStandardReasonResponse) {
        return mergeFrom((com.desmos.reports.v1.MsgSupportStandardReasonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.reports.v1.MsgSupportStandardReasonResponse other) {
      if (other == com.desmos.reports.v1.MsgSupportStandardReasonResponse.getDefaultInstance()) return this;
      if (other.getReasonsIds() != 0) {
        setReasonsIds(other.getReasonsIds());
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
              reasonsIds_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int reasonsIds_ ;
    /**
     * <pre>
     * Id of the newly added reason
     * </pre>
     *
     * <code>uint32 reasons_ids = 1 [json_name = "reasonsIds", (.gogoproto.customname) = "ReasonsID", (.gogoproto.moretags) = "yaml:&#92;"reasons_ids&#92;""];</code>
     * @return The reasonsIds.
     */
    @java.lang.Override
    public int getReasonsIds() {
      return reasonsIds_;
    }
    /**
     * <pre>
     * Id of the newly added reason
     * </pre>
     *
     * <code>uint32 reasons_ids = 1 [json_name = "reasonsIds", (.gogoproto.customname) = "ReasonsID", (.gogoproto.moretags) = "yaml:&#92;"reasons_ids&#92;""];</code>
     * @param value The reasonsIds to set.
     * @return This builder for chaining.
     */
    public Builder setReasonsIds(int value) {

      reasonsIds_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the newly added reason
     * </pre>
     *
     * <code>uint32 reasons_ids = 1 [json_name = "reasonsIds", (.gogoproto.customname) = "ReasonsID", (.gogoproto.moretags) = "yaml:&#92;"reasons_ids&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearReasonsIds() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reasonsIds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:desmos.reports.v1.MsgSupportStandardReasonResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.reports.v1.MsgSupportStandardReasonResponse)
  private static final com.desmos.reports.v1.MsgSupportStandardReasonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.reports.v1.MsgSupportStandardReasonResponse();
  }

  public static com.desmos.reports.v1.MsgSupportStandardReasonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSupportStandardReasonResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgSupportStandardReasonResponse>() {
    @java.lang.Override
    public MsgSupportStandardReasonResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSupportStandardReasonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSupportStandardReasonResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.reports.v1.MsgSupportStandardReasonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

