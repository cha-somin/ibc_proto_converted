// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/oracle/v1alpha1/tx.proto

package com.shentu.oracle.v1alpha1;

/**
 * Protobuf type {@code shentu.oracle.v1alpha1.MsgTxTaskResponse}
 */
public final class MsgTxTaskResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.oracle.v1alpha1.MsgTxTaskResponse)
    MsgTxTaskResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgTxTaskResponse.newBuilder() to construct.
  private MsgTxTaskResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgTxTaskResponse() {
    atxHash_ = com.google.protobuf.ByteString.EMPTY;
    operator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgTxTaskResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgTxTaskResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgTxTaskResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.oracle.v1alpha1.MsgTxTaskResponse.class, com.shentu.oracle.v1alpha1.MsgTxTaskResponse.Builder.class);
  }

  public static final int ATX_HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString atxHash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * sha256 hash of the application chain transaction
   * </pre>
   *
   * <code>bytes atx_hash = 1 [json_name = "atxHash", (.gogoproto.moretags) = "yaml:&#92;"atx_hash&#92;""];</code>
   * @return The atxHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAtxHash() {
    return atxHash_;
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private long score_ = 0L;
  /**
   * <code>int64 score = 2 [json_name = "score", (.gogoproto.moretags) = "yaml:&#92;"score&#92;""];</code>
   * @return The score.
   */
  @java.lang.Override
  public long getScore() {
    return score_;
  }

  public static final int OPERATOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object operator_ = "";
  /**
   * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
   * @return The operator.
   */
  @java.lang.Override
  public java.lang.String getOperator() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operator_ = s;
      return s;
    }
  }
  /**
   * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
   * @return The bytes for operator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperatorBytes() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operator_ = b;
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
    if (!atxHash_.isEmpty()) {
      output.writeBytes(1, atxHash_);
    }
    if (score_ != 0L) {
      output.writeInt64(2, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, operator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!atxHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, atxHash_);
    }
    if (score_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, operator_);
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
    if (!(obj instanceof com.shentu.oracle.v1alpha1.MsgTxTaskResponse)) {
      return super.equals(obj);
    }
    com.shentu.oracle.v1alpha1.MsgTxTaskResponse other = (com.shentu.oracle.v1alpha1.MsgTxTaskResponse) obj;

    if (!getAtxHash()
        .equals(other.getAtxHash())) return false;
    if (getScore()
        != other.getScore()) return false;
    if (!getOperator()
        .equals(other.getOperator())) return false;
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
    hash = (37 * hash) + ATX_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getAtxHash().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScore());
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getOperator().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse parseFrom(
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
  public static Builder newBuilder(com.shentu.oracle.v1alpha1.MsgTxTaskResponse prototype) {
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
   * Protobuf type {@code shentu.oracle.v1alpha1.MsgTxTaskResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.oracle.v1alpha1.MsgTxTaskResponse)
      com.shentu.oracle.v1alpha1.MsgTxTaskResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgTxTaskResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgTxTaskResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.oracle.v1alpha1.MsgTxTaskResponse.class, com.shentu.oracle.v1alpha1.MsgTxTaskResponse.Builder.class);
    }

    // Construct using com.shentu.oracle.v1alpha1.MsgTxTaskResponse.newBuilder()
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
      atxHash_ = com.google.protobuf.ByteString.EMPTY;
      score_ = 0L;
      operator_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgTxTaskResponse_descriptor;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgTxTaskResponse getDefaultInstanceForType() {
      return com.shentu.oracle.v1alpha1.MsgTxTaskResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgTxTaskResponse build() {
      com.shentu.oracle.v1alpha1.MsgTxTaskResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgTxTaskResponse buildPartial() {
      com.shentu.oracle.v1alpha1.MsgTxTaskResponse result = new com.shentu.oracle.v1alpha1.MsgTxTaskResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.oracle.v1alpha1.MsgTxTaskResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.atxHash_ = atxHash_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.score_ = score_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.operator_ = operator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.oracle.v1alpha1.MsgTxTaskResponse) {
        return mergeFrom((com.shentu.oracle.v1alpha1.MsgTxTaskResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.oracle.v1alpha1.MsgTxTaskResponse other) {
      if (other == com.shentu.oracle.v1alpha1.MsgTxTaskResponse.getDefaultInstance()) return this;
      if (other.getAtxHash() != com.google.protobuf.ByteString.EMPTY) {
        setAtxHash(other.getAtxHash());
      }
      if (other.getScore() != 0L) {
        setScore(other.getScore());
      }
      if (!other.getOperator().isEmpty()) {
        operator_ = other.operator_;
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
            case 10: {
              atxHash_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              score_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              operator_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString atxHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * sha256 hash of the application chain transaction
     * </pre>
     *
     * <code>bytes atx_hash = 1 [json_name = "atxHash", (.gogoproto.moretags) = "yaml:&#92;"atx_hash&#92;""];</code>
     * @return The atxHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAtxHash() {
      return atxHash_;
    }
    /**
     * <pre>
     * sha256 hash of the application chain transaction
     * </pre>
     *
     * <code>bytes atx_hash = 1 [json_name = "atxHash", (.gogoproto.moretags) = "yaml:&#92;"atx_hash&#92;""];</code>
     * @param value The atxHash to set.
     * @return This builder for chaining.
     */
    public Builder setAtxHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      atxHash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sha256 hash of the application chain transaction
     * </pre>
     *
     * <code>bytes atx_hash = 1 [json_name = "atxHash", (.gogoproto.moretags) = "yaml:&#92;"atx_hash&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAtxHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      atxHash_ = getDefaultInstance().getAtxHash();
      onChanged();
      return this;
    }

    private long score_ ;
    /**
     * <code>int64 score = 2 [json_name = "score", (.gogoproto.moretags) = "yaml:&#92;"score&#92;""];</code>
     * @return The score.
     */
    @java.lang.Override
    public long getScore() {
      return score_;
    }
    /**
     * <code>int64 score = 2 [json_name = "score", (.gogoproto.moretags) = "yaml:&#92;"score&#92;""];</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(long value) {

      score_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 score = 2 [json_name = "score", (.gogoproto.moretags) = "yaml:&#92;"score&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      score_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object operator_ = "";
    /**
     * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     * @return The operator.
     */
    public java.lang.String getOperator() {
      java.lang.Object ref = operator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     * @return The bytes for operator.
     */
    public com.google.protobuf.ByteString
        getOperatorBytes() {
      java.lang.Object ref = operator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      operator_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      operator_ = getDefaultInstance().getOperator();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string operator = 3 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;""];</code>
     * @param value The bytes for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      operator_ = value;
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


    // @@protoc_insertion_point(builder_scope:shentu.oracle.v1alpha1.MsgTxTaskResponse)
  }

  // @@protoc_insertion_point(class_scope:shentu.oracle.v1alpha1.MsgTxTaskResponse)
  private static final com.shentu.oracle.v1alpha1.MsgTxTaskResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.oracle.v1alpha1.MsgTxTaskResponse();
  }

  public static com.shentu.oracle.v1alpha1.MsgTxTaskResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgTxTaskResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgTxTaskResponse>() {
    @java.lang.Override
    public MsgTxTaskResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgTxTaskResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgTxTaskResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.oracle.v1alpha1.MsgTxTaskResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

