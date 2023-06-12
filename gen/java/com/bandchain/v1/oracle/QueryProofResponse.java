// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/bandchain/v1/oracle/proof.proto

package com.bandchain.v1.oracle;

/**
 * <pre>
 * QueryChainIDResponse is response type for the Service/Proof RPC method.
 * </pre>
 *
 * Protobuf type {@code bandchain.v1.oracle.QueryProofResponse}
 */
public final class QueryProofResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bandchain.v1.oracle.QueryProofResponse)
    QueryProofResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProofResponse.newBuilder() to construct.
  private QueryProofResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProofResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProofResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_QueryProofResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_QueryProofResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bandchain.v1.oracle.QueryProofResponse.class, com.bandchain.v1.oracle.QueryProofResponse.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <pre>
   * height is block height
   * </pre>
   *
   * <code>int64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.bandchain.v1.oracle.SingleProofResponse result_;
  /**
   * <pre>
   * result is the proof
   * </pre>
   *
   * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * result is the proof
   * </pre>
   *
   * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.bandchain.v1.oracle.SingleProofResponse getResult() {
    return result_ == null ? com.bandchain.v1.oracle.SingleProofResponse.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * result is the proof
   * </pre>
   *
   * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.bandchain.v1.oracle.SingleProofResponseOrBuilder getResultOrBuilder() {
    return result_ == null ? com.bandchain.v1.oracle.SingleProofResponse.getDefaultInstance() : result_;
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
    if (height_ != 0L) {
      output.writeInt64(1, height_);
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, height_);
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.bandchain.v1.oracle.QueryProofResponse)) {
      return super.equals(obj);
    }
    com.bandchain.v1.oracle.QueryProofResponse other = (com.bandchain.v1.oracle.QueryProofResponse) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.bandchain.v1.oracle.QueryProofResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.bandchain.v1.oracle.QueryProofResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bandchain.v1.oracle.QueryProofResponse parseFrom(
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
  public static Builder newBuilder(com.bandchain.v1.oracle.QueryProofResponse prototype) {
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
   * QueryChainIDResponse is response type for the Service/Proof RPC method.
   * </pre>
   *
   * Protobuf type {@code bandchain.v1.oracle.QueryProofResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bandchain.v1.oracle.QueryProofResponse)
      com.bandchain.v1.oracle.QueryProofResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_QueryProofResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_QueryProofResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bandchain.v1.oracle.QueryProofResponse.class, com.bandchain.v1.oracle.QueryProofResponse.Builder.class);
    }

    // Construct using com.bandchain.v1.oracle.QueryProofResponse.newBuilder()
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
      height_ = 0L;
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_QueryProofResponse_descriptor;
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.QueryProofResponse getDefaultInstanceForType() {
      return com.bandchain.v1.oracle.QueryProofResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.QueryProofResponse build() {
      com.bandchain.v1.oracle.QueryProofResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.QueryProofResponse buildPartial() {
      com.bandchain.v1.oracle.QueryProofResponse result = new com.bandchain.v1.oracle.QueryProofResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.bandchain.v1.oracle.QueryProofResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bandchain.v1.oracle.QueryProofResponse) {
        return mergeFrom((com.bandchain.v1.oracle.QueryProofResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bandchain.v1.oracle.QueryProofResponse other) {
      if (other == com.bandchain.v1.oracle.QueryProofResponse.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
              height_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
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

    private long height_ ;
    /**
     * <pre>
     * height is block height
     * </pre>
     *
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <pre>
     * height is block height
     * </pre>
     *
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height is block height
     * </pre>
     *
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private com.bandchain.v1.oracle.SingleProofResponse result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bandchain.v1.oracle.SingleProofResponse, com.bandchain.v1.oracle.SingleProofResponse.Builder, com.bandchain.v1.oracle.SingleProofResponseOrBuilder> resultBuilder_;
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     * @return The result.
     */
    public com.bandchain.v1.oracle.SingleProofResponse getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.bandchain.v1.oracle.SingleProofResponse.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder setResult(com.bandchain.v1.oracle.SingleProofResponse value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder setResult(
        com.bandchain.v1.oracle.SingleProofResponse.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeResult(com.bandchain.v1.oracle.SingleProofResponse value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          result_ != null &&
          result_ != com.bandchain.v1.oracle.SingleProofResponse.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.SingleProofResponse.Builder getResultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.SingleProofResponseOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.bandchain.v1.oracle.SingleProofResponse.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * result is the proof
     * </pre>
     *
     * <code>.bandchain.v1.oracle.SingleProofResponse result = 2 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bandchain.v1.oracle.SingleProofResponse, com.bandchain.v1.oracle.SingleProofResponse.Builder, com.bandchain.v1.oracle.SingleProofResponseOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.bandchain.v1.oracle.SingleProofResponse, com.bandchain.v1.oracle.SingleProofResponse.Builder, com.bandchain.v1.oracle.SingleProofResponseOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bandchain.v1.oracle.QueryProofResponse)
  }

  // @@protoc_insertion_point(class_scope:bandchain.v1.oracle.QueryProofResponse)
  private static final com.bandchain.v1.oracle.QueryProofResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bandchain.v1.oracle.QueryProofResponse();
  }

  public static com.bandchain.v1.oracle.QueryProofResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProofResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryProofResponse>() {
    @java.lang.Override
    public QueryProofResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProofResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProofResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bandchain.v1.oracle.QueryProofResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

