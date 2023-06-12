// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * QuerySequenceResponse is the request type for the
 * Query/QueryNextSequenceReceiveResponse RPC method
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.QueryNextSequenceReceiveResponse}
 */
public final class QueryNextSequenceReceiveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.QueryNextSequenceReceiveResponse)
    QueryNextSequenceReceiveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryNextSequenceReceiveResponse.newBuilder() to construct.
  private QueryNextSequenceReceiveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryNextSequenceReceiveResponse() {
    proof_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryNextSequenceReceiveResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryNextSequenceReceiveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryNextSequenceReceiveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.class, com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.Builder.class);
  }

  public static final int NEXT_SEQUENCE_RECEIVE_FIELD_NUMBER = 1;
  private long nextSequenceReceive_ = 0L;
  /**
   * <pre>
   * next sequence receive number
   * </pre>
   *
   * <code>uint64 next_sequence_receive = 1 [json_name = "nextSequenceReceive"];</code>
   * @return The nextSequenceReceive.
   */
  @java.lang.Override
  public long getNextSequenceReceive() {
    return nextSequenceReceive_;
  }

  public static final int PROOF_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 2 [json_name = "proof"];</code>
   * @return The proof.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProof() {
    return proof_;
  }

  public static final int PROOF_HEIGHT_FIELD_NUMBER = 3;
  private com.ibc.core.client.v1.Height proofHeight_;
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the proofHeight field is set.
   */
  @java.lang.Override
  public boolean hasProofHeight() {
    return proofHeight_ != null;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return The proofHeight.
   */
  @java.lang.Override
  public com.ibc.core.client.v1.Height getProofHeight() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
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
    if (nextSequenceReceive_ != 0L) {
      output.writeUInt64(1, nextSequenceReceive_);
    }
    if (!proof_.isEmpty()) {
      output.writeBytes(2, proof_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(3, getProofHeight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nextSequenceReceive_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, nextSequenceReceive_);
    }
    if (!proof_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, proof_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProofHeight());
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
    if (!(obj instanceof com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse)) {
      return super.equals(obj);
    }
    com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse other = (com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse) obj;

    if (getNextSequenceReceive()
        != other.getNextSequenceReceive()) return false;
    if (!getProof()
        .equals(other.getProof())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
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
    hash = (37 * hash) + NEXT_SEQUENCE_RECEIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNextSequenceReceive());
    hash = (37 * hash) + PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getProof().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse prototype) {
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
   * QuerySequenceResponse is the request type for the
   * Query/QueryNextSequenceReceiveResponse RPC method
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.QueryNextSequenceReceiveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.QueryNextSequenceReceiveResponse)
      com.ibc.core.channel.v1.QueryNextSequenceReceiveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryNextSequenceReceiveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryNextSequenceReceiveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.class, com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.Builder.class);
    }

    // Construct using com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.newBuilder()
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
      nextSequenceReceive_ = 0L;
      proof_ = com.google.protobuf.ByteString.EMPTY;
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryNextSequenceReceiveResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse getDefaultInstanceForType() {
      return com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse build() {
      com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse buildPartial() {
      com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse result = new com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextSequenceReceive_ = nextSequenceReceive_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.proof_ = proof_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.proofHeight_ = proofHeightBuilder_ == null
            ? proofHeight_
            : proofHeightBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse) {
        return mergeFrom((com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse other) {
      if (other == com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.getDefaultInstance()) return this;
      if (other.getNextSequenceReceive() != 0L) {
        setNextSequenceReceive(other.getNextSequenceReceive());
      }
      if (other.getProof() != com.google.protobuf.ByteString.EMPTY) {
        setProof(other.getProof());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
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
              nextSequenceReceive_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              proof_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProofHeightFieldBuilder().getBuilder(),
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

    private long nextSequenceReceive_ ;
    /**
     * <pre>
     * next sequence receive number
     * </pre>
     *
     * <code>uint64 next_sequence_receive = 1 [json_name = "nextSequenceReceive"];</code>
     * @return The nextSequenceReceive.
     */
    @java.lang.Override
    public long getNextSequenceReceive() {
      return nextSequenceReceive_;
    }
    /**
     * <pre>
     * next sequence receive number
     * </pre>
     *
     * <code>uint64 next_sequence_receive = 1 [json_name = "nextSequenceReceive"];</code>
     * @param value The nextSequenceReceive to set.
     * @return This builder for chaining.
     */
    public Builder setNextSequenceReceive(long value) {

      nextSequenceReceive_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next sequence receive number
     * </pre>
     *
     * <code>uint64 next_sequence_receive = 1 [json_name = "nextSequenceReceive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextSequenceReceive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nextSequenceReceive_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @return The proof.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProof() {
      return proof_;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @param value The proof to set.
     * @return This builder for chaining.
     */
    public Builder setProof(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      proof_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProof() {
      bitField0_ = (bitField0_ & ~0x00000002);
      proof_ = getDefaultInstance().getProof();
      onChanged();
      return this;
    }

    private com.ibc.core.client.v1.Height proofHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> proofHeightBuilder_;
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    public boolean hasProofHeight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return The proofHeight.
     */
    public com.ibc.core.client.v1.Height getProofHeight() {
      if (proofHeightBuilder_ == null) {
        return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      } else {
        return proofHeightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proofHeight_ = value;
      } else {
        proofHeightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProofHeight(
        com.ibc.core.client.v1.Height.Builder builderForValue) {
      if (proofHeightBuilder_ == null) {
        proofHeight_ = builderForValue.build();
      } else {
        proofHeightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          proofHeight_ != null &&
          proofHeight_ != com.ibc.core.client.v1.Height.getDefaultInstance()) {
          getProofHeightBuilder().mergeFrom(value);
        } else {
          proofHeight_ = value;
        }
      } else {
        proofHeightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearProofHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.Height.Builder getProofHeightBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getProofHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
      if (proofHeightBuilder_ != null) {
        return proofHeightBuilder_.getMessageOrBuilder();
      } else {
        return proofHeight_ == null ?
            com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      }
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> 
        getProofHeightFieldBuilder() {
      if (proofHeightBuilder_ == null) {
        proofHeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder>(
                getProofHeight(),
                getParentForChildren(),
                isClean());
        proofHeight_ = null;
      }
      return proofHeightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.QueryNextSequenceReceiveResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.QueryNextSequenceReceiveResponse)
  private static final com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse();
  }

  public static com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryNextSequenceReceiveResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryNextSequenceReceiveResponse>() {
    @java.lang.Override
    public QueryNextSequenceReceiveResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryNextSequenceReceiveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryNextSequenceReceiveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

