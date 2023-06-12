// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reports/v1/msgs.proto

package com.desmos.reports.v1;

/**
 * <pre>
 * MsgRemoveReason represents the message to be used when removing an exiting
 * reporting reason
 * </pre>
 *
 * Protobuf type {@code desmos.reports.v1.MsgRemoveReason}
 */
public final class MsgRemoveReason extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.reports.v1.MsgRemoveReason)
    MsgRemoveReasonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRemoveReason.newBuilder() to construct.
  private MsgRemoveReason(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRemoveReason() {
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRemoveReason();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgRemoveReason_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgRemoveReason_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.reports.v1.MsgRemoveReason.class, com.desmos.reports.v1.MsgRemoveReason.Builder.class);
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 1;
  private long subspaceId_ = 0L;
  /**
   * <pre>
   * Id of the subspace from which to remove the reason
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
  }

  public static final int REASON_ID_FIELD_NUMBER = 2;
  private int reasonId_ = 0;
  /**
   * <pre>
   * Id of the reason to be deleted
   * </pre>
   *
   * <code>uint32 reason_id = 2 [json_name = "reasonId", (.gogoproto.customname) = "ReasonID", (.gogoproto.moretags) = "yaml:&#92;"reason_id&#92;""];</code>
   * @return The reasonId.
   */
  @java.lang.Override
  public int getReasonId() {
    return reasonId_;
  }

  public static final int SIGNER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <pre>
   * Address of the user adding the supported reason
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the user adding the supported reason
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (subspaceId_ != 0L) {
      output.writeUInt64(1, subspaceId_);
    }
    if (reasonId_ != 0) {
      output.writeUInt32(2, reasonId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, signer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subspaceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, subspaceId_);
    }
    if (reasonId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, reasonId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, signer_);
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
    if (!(obj instanceof com.desmos.reports.v1.MsgRemoveReason)) {
      return super.equals(obj);
    }
    com.desmos.reports.v1.MsgRemoveReason other = (com.desmos.reports.v1.MsgRemoveReason) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getReasonId()
        != other.getReasonId()) return false;
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + SUBSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubspaceId());
    hash = (37 * hash) + REASON_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReasonId();
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.reports.v1.MsgRemoveReason parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.reports.v1.MsgRemoveReason parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reports.v1.MsgRemoveReason parseFrom(
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
  public static Builder newBuilder(com.desmos.reports.v1.MsgRemoveReason prototype) {
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
   * MsgRemoveReason represents the message to be used when removing an exiting
   * reporting reason
   * </pre>
   *
   * Protobuf type {@code desmos.reports.v1.MsgRemoveReason}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.reports.v1.MsgRemoveReason)
      com.desmos.reports.v1.MsgRemoveReasonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgRemoveReason_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgRemoveReason_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.reports.v1.MsgRemoveReason.class, com.desmos.reports.v1.MsgRemoveReason.Builder.class);
    }

    // Construct using com.desmos.reports.v1.MsgRemoveReason.newBuilder()
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
      subspaceId_ = 0L;
      reasonId_ = 0;
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.reports.v1.MsgsProto.internal_static_desmos_reports_v1_MsgRemoveReason_descriptor;
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgRemoveReason getDefaultInstanceForType() {
      return com.desmos.reports.v1.MsgRemoveReason.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgRemoveReason build() {
      com.desmos.reports.v1.MsgRemoveReason result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.reports.v1.MsgRemoveReason buildPartial() {
      com.desmos.reports.v1.MsgRemoveReason result = new com.desmos.reports.v1.MsgRemoveReason(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.reports.v1.MsgRemoveReason result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reasonId_ = reasonId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.reports.v1.MsgRemoveReason) {
        return mergeFrom((com.desmos.reports.v1.MsgRemoveReason)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.reports.v1.MsgRemoveReason other) {
      if (other == com.desmos.reports.v1.MsgRemoveReason.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getReasonId() != 0) {
        setReasonId(other.getReasonId());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
        bitField0_ |= 0x00000004;
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
              subspaceId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              reasonId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              signer_ = input.readStringRequireUtf8();
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

    private long subspaceId_ ;
    /**
     * <pre>
     * Id of the subspace from which to remove the reason
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <pre>
     * Id of the subspace from which to remove the reason
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @param value The subspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubspaceId(long value) {

      subspaceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the subspace from which to remove the reason
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubspaceId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subspaceId_ = 0L;
      onChanged();
      return this;
    }

    private int reasonId_ ;
    /**
     * <pre>
     * Id of the reason to be deleted
     * </pre>
     *
     * <code>uint32 reason_id = 2 [json_name = "reasonId", (.gogoproto.customname) = "ReasonID", (.gogoproto.moretags) = "yaml:&#92;"reason_id&#92;""];</code>
     * @return The reasonId.
     */
    @java.lang.Override
    public int getReasonId() {
      return reasonId_;
    }
    /**
     * <pre>
     * Id of the reason to be deleted
     * </pre>
     *
     * <code>uint32 reason_id = 2 [json_name = "reasonId", (.gogoproto.customname) = "ReasonID", (.gogoproto.moretags) = "yaml:&#92;"reason_id&#92;""];</code>
     * @param value The reasonId to set.
     * @return This builder for chaining.
     */
    public Builder setReasonId(int value) {

      reasonId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the reason to be deleted
     * </pre>
     *
     * <code>uint32 reason_id = 2 [json_name = "reasonId", (.gogoproto.customname) = "ReasonID", (.gogoproto.moretags) = "yaml:&#92;"reason_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearReasonId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reasonId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object signer_ = "";
    /**
     * <pre>
     * Address of the user adding the supported reason
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of the user adding the supported reason
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of the user adding the supported reason
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user adding the supported reason
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user adding the supported reason
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:desmos.reports.v1.MsgRemoveReason)
  }

  // @@protoc_insertion_point(class_scope:desmos.reports.v1.MsgRemoveReason)
  private static final com.desmos.reports.v1.MsgRemoveReason DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.reports.v1.MsgRemoveReason();
  }

  public static com.desmos.reports.v1.MsgRemoveReason getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRemoveReason>
      PARSER = new com.google.protobuf.AbstractParser<MsgRemoveReason>() {
    @java.lang.Override
    public MsgRemoveReason parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRemoveReason> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRemoveReason> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.reports.v1.MsgRemoveReason getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

