// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/tx.proto

package com.cosmos.evidence.v1beta1;

/**
 * <pre>
 * MsgSubmitEvidenceResponse defines the Msg/SubmitEvidence response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse}
 */
public final class MsgSubmitEvidenceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)
    MsgSubmitEvidenceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSubmitEvidenceResponse.newBuilder() to construct.
  private MsgSubmitEvidenceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSubmitEvidenceResponse() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSubmitEvidenceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.evidence.v1beta1.TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.evidence.v1beta1.TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.class, com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * hash defines the hash of the evidence.
   * </pre>
   *
   * <code>bytes hash = 4 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHash() {
    return hash_;
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
    if (!hash_.isEmpty()) {
      output.writeBytes(4, hash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, hash_);
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
    if (!(obj instanceof com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)) {
      return super.equals(obj);
    }
    com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse other = (com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse) obj;

    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse prototype) {
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
   * MsgSubmitEvidenceResponse defines the Msg/SubmitEvidence response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)
      com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.evidence.v1beta1.TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.evidence.v1beta1.TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.class, com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.Builder.class);
    }

    // Construct using com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.newBuilder()
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
      hash_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.evidence.v1beta1.TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse getDefaultInstanceForType() {
      return com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse build() {
      com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse buildPartial() {
      com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse result = new com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hash_ = hash_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse) {
        return mergeFrom((com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse other) {
      if (other == com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse.getDefaultInstance()) return this;
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
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
            case 34: {
              hash_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
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

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * hash defines the hash of the evidence.
     * </pre>
     *
     * <code>bytes hash = 4 [json_name = "hash"];</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <pre>
     * hash defines the hash of the evidence.
     * </pre>
     *
     * <code>bytes hash = 4 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash defines the hash of the evidence.
     * </pre>
     *
     * <code>bytes hash = 4 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hash_ = getDefaultInstance().getHash();
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


    // @@protoc_insertion_point(builder_scope:cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse)
  private static final com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse();
  }

  public static com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSubmitEvidenceResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgSubmitEvidenceResponse>() {
    @java.lang.Override
    public MsgSubmitEvidenceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSubmitEvidenceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSubmitEvidenceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.evidence.v1beta1.MsgSubmitEvidenceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

