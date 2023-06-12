// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/bandchain/v1/oracle/proof.proto

package com.bandchain.v1.oracle;

/**
 * <pre>
 * OracleDataProof contains result, version and merkle paths
 * </pre>
 *
 * Protobuf type {@code bandchain.v1.oracle.OracleDataProof}
 */
public final class OracleDataProof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bandchain.v1.oracle.OracleDataProof)
    OracleDataProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleDataProof.newBuilder() to construct.
  private OracleDataProof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleDataProof() {
    merklePaths_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleDataProof();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_OracleDataProof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_OracleDataProof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bandchain.v1.oracle.OracleDataProof.class, com.bandchain.v1.oracle.OracleDataProof.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private com.oracle.v1.Result result_;
  /**
   * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.oracle.v1.Result getResult() {
    return result_ == null ? com.oracle.v1.Result.getDefaultInstance() : result_;
  }
  /**
   * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.oracle.v1.ResultOrBuilder getResultOrBuilder() {
    return result_ == null ? com.oracle.v1.Result.getDefaultInstance() : result_;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private long version_ = 0L;
  /**
   * <code>uint64 version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int MERKLE_PATHS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.bandchain.v1.oracle.IAVLMerklePath> merklePaths_;
  /**
   * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.bandchain.v1.oracle.IAVLMerklePath> getMerklePathsList() {
    return merklePaths_;
  }
  /**
   * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.bandchain.v1.oracle.IAVLMerklePathOrBuilder> 
      getMerklePathsOrBuilderList() {
    return merklePaths_;
  }
  /**
   * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMerklePathsCount() {
    return merklePaths_.size();
  }
  /**
   * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.bandchain.v1.oracle.IAVLMerklePath getMerklePaths(int index) {
    return merklePaths_.get(index);
  }
  /**
   * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.bandchain.v1.oracle.IAVLMerklePathOrBuilder getMerklePathsOrBuilder(
      int index) {
    return merklePaths_.get(index);
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    if (version_ != 0L) {
      output.writeUInt64(2, version_);
    }
    for (int i = 0; i < merklePaths_.size(); i++) {
      output.writeMessage(3, merklePaths_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, version_);
    }
    for (int i = 0; i < merklePaths_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, merklePaths_.get(i));
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
    if (!(obj instanceof com.bandchain.v1.oracle.OracleDataProof)) {
      return super.equals(obj);
    }
    com.bandchain.v1.oracle.OracleDataProof other = (com.bandchain.v1.oracle.OracleDataProof) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (getVersion()
        != other.getVersion()) return false;
    if (!getMerklePathsList()
        .equals(other.getMerklePathsList())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    if (getMerklePathsCount() > 0) {
      hash = (37 * hash) + MERKLE_PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getMerklePathsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.bandchain.v1.oracle.OracleDataProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.bandchain.v1.oracle.OracleDataProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bandchain.v1.oracle.OracleDataProof parseFrom(
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
  public static Builder newBuilder(com.bandchain.v1.oracle.OracleDataProof prototype) {
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
   * OracleDataProof contains result, version and merkle paths
   * </pre>
   *
   * Protobuf type {@code bandchain.v1.oracle.OracleDataProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bandchain.v1.oracle.OracleDataProof)
      com.bandchain.v1.oracle.OracleDataProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_OracleDataProof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_OracleDataProof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bandchain.v1.oracle.OracleDataProof.class, com.bandchain.v1.oracle.OracleDataProof.Builder.class);
    }

    // Construct using com.bandchain.v1.oracle.OracleDataProof.newBuilder()
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
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      version_ = 0L;
      if (merklePathsBuilder_ == null) {
        merklePaths_ = java.util.Collections.emptyList();
      } else {
        merklePaths_ = null;
        merklePathsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bandchain.v1.oracle.ProofProto.internal_static_bandchain_v1_oracle_OracleDataProof_descriptor;
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.OracleDataProof getDefaultInstanceForType() {
      return com.bandchain.v1.oracle.OracleDataProof.getDefaultInstance();
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.OracleDataProof build() {
      com.bandchain.v1.oracle.OracleDataProof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bandchain.v1.oracle.OracleDataProof buildPartial() {
      com.bandchain.v1.oracle.OracleDataProof result = new com.bandchain.v1.oracle.OracleDataProof(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.bandchain.v1.oracle.OracleDataProof result) {
      if (merklePathsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          merklePaths_ = java.util.Collections.unmodifiableList(merklePaths_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.merklePaths_ = merklePaths_;
      } else {
        result.merklePaths_ = merklePathsBuilder_.build();
      }
    }

    private void buildPartial0(com.bandchain.v1.oracle.OracleDataProof result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bandchain.v1.oracle.OracleDataProof) {
        return mergeFrom((com.bandchain.v1.oracle.OracleDataProof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bandchain.v1.oracle.OracleDataProof other) {
      if (other == com.bandchain.v1.oracle.OracleDataProof.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (merklePathsBuilder_ == null) {
        if (!other.merklePaths_.isEmpty()) {
          if (merklePaths_.isEmpty()) {
            merklePaths_ = other.merklePaths_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMerklePathsIsMutable();
            merklePaths_.addAll(other.merklePaths_);
          }
          onChanged();
        }
      } else {
        if (!other.merklePaths_.isEmpty()) {
          if (merklePathsBuilder_.isEmpty()) {
            merklePathsBuilder_.dispose();
            merklePathsBuilder_ = null;
            merklePaths_ = other.merklePaths_;
            bitField0_ = (bitField0_ & ~0x00000004);
            merklePathsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMerklePathsFieldBuilder() : null;
          } else {
            merklePathsBuilder_.addAllMessages(other.merklePaths_);
          }
        }
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
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              version_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              com.bandchain.v1.oracle.IAVLMerklePath m =
                  input.readMessage(
                      com.bandchain.v1.oracle.IAVLMerklePath.parser(),
                      extensionRegistry);
              if (merklePathsBuilder_ == null) {
                ensureMerklePathsIsMutable();
                merklePaths_.add(m);
              } else {
                merklePathsBuilder_.addMessage(m);
              }
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

    private com.oracle.v1.Result result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.oracle.v1.Result, com.oracle.v1.Result.Builder, com.oracle.v1.ResultOrBuilder> resultBuilder_;
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     * @return The result.
     */
    public com.oracle.v1.Result getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.oracle.v1.Result.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder setResult(com.oracle.v1.Result value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder setResult(
        com.oracle.v1.Result.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeResult(com.oracle.v1.Result value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.oracle.v1.Result.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public com.oracle.v1.Result.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public com.oracle.v1.ResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.oracle.v1.Result.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.oracle.v1.Result result = 1 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.oracle.v1.Result, com.oracle.v1.Result.Builder, com.oracle.v1.ResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.oracle.v1.Result, com.oracle.v1.Result.Builder, com.oracle.v1.ResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private long version_ ;
    /**
     * <code>uint64 version = 2 [json_name = "version"];</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     * <code>uint64 version = 2 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {

      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 version = 2 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.bandchain.v1.oracle.IAVLMerklePath> merklePaths_ =
      java.util.Collections.emptyList();
    private void ensureMerklePathsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        merklePaths_ = new java.util.ArrayList<com.bandchain.v1.oracle.IAVLMerklePath>(merklePaths_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bandchain.v1.oracle.IAVLMerklePath, com.bandchain.v1.oracle.IAVLMerklePath.Builder, com.bandchain.v1.oracle.IAVLMerklePathOrBuilder> merklePathsBuilder_;

    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.bandchain.v1.oracle.IAVLMerklePath> getMerklePathsList() {
      if (merklePathsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(merklePaths_);
      } else {
        return merklePathsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public int getMerklePathsCount() {
      if (merklePathsBuilder_ == null) {
        return merklePaths_.size();
      } else {
        return merklePathsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.IAVLMerklePath getMerklePaths(int index) {
      if (merklePathsBuilder_ == null) {
        return merklePaths_.get(index);
      } else {
        return merklePathsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMerklePaths(
        int index, com.bandchain.v1.oracle.IAVLMerklePath value) {
      if (merklePathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerklePathsIsMutable();
        merklePaths_.set(index, value);
        onChanged();
      } else {
        merklePathsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMerklePaths(
        int index, com.bandchain.v1.oracle.IAVLMerklePath.Builder builderForValue) {
      if (merklePathsBuilder_ == null) {
        ensureMerklePathsIsMutable();
        merklePaths_.set(index, builderForValue.build());
        onChanged();
      } else {
        merklePathsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMerklePaths(com.bandchain.v1.oracle.IAVLMerklePath value) {
      if (merklePathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerklePathsIsMutable();
        merklePaths_.add(value);
        onChanged();
      } else {
        merklePathsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMerklePaths(
        int index, com.bandchain.v1.oracle.IAVLMerklePath value) {
      if (merklePathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerklePathsIsMutable();
        merklePaths_.add(index, value);
        onChanged();
      } else {
        merklePathsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMerklePaths(
        com.bandchain.v1.oracle.IAVLMerklePath.Builder builderForValue) {
      if (merklePathsBuilder_ == null) {
        ensureMerklePathsIsMutable();
        merklePaths_.add(builderForValue.build());
        onChanged();
      } else {
        merklePathsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMerklePaths(
        int index, com.bandchain.v1.oracle.IAVLMerklePath.Builder builderForValue) {
      if (merklePathsBuilder_ == null) {
        ensureMerklePathsIsMutable();
        merklePaths_.add(index, builderForValue.build());
        onChanged();
      } else {
        merklePathsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMerklePaths(
        java.lang.Iterable<? extends com.bandchain.v1.oracle.IAVLMerklePath> values) {
      if (merklePathsBuilder_ == null) {
        ensureMerklePathsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, merklePaths_);
        onChanged();
      } else {
        merklePathsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMerklePaths() {
      if (merklePathsBuilder_ == null) {
        merklePaths_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        merklePathsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeMerklePaths(int index) {
      if (merklePathsBuilder_ == null) {
        ensureMerklePathsIsMutable();
        merklePaths_.remove(index);
        onChanged();
      } else {
        merklePathsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.IAVLMerklePath.Builder getMerklePathsBuilder(
        int index) {
      return getMerklePathsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.IAVLMerklePathOrBuilder getMerklePathsOrBuilder(
        int index) {
      if (merklePathsBuilder_ == null) {
        return merklePaths_.get(index);  } else {
        return merklePathsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.bandchain.v1.oracle.IAVLMerklePathOrBuilder> 
         getMerklePathsOrBuilderList() {
      if (merklePathsBuilder_ != null) {
        return merklePathsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(merklePaths_);
      }
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.IAVLMerklePath.Builder addMerklePathsBuilder() {
      return getMerklePathsFieldBuilder().addBuilder(
          com.bandchain.v1.oracle.IAVLMerklePath.getDefaultInstance());
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public com.bandchain.v1.oracle.IAVLMerklePath.Builder addMerklePathsBuilder(
        int index) {
      return getMerklePathsFieldBuilder().addBuilder(
          index, com.bandchain.v1.oracle.IAVLMerklePath.getDefaultInstance());
    }
    /**
     * <code>repeated .bandchain.v1.oracle.IAVLMerklePath merkle_paths = 3 [json_name = "merklePaths", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.bandchain.v1.oracle.IAVLMerklePath.Builder> 
         getMerklePathsBuilderList() {
      return getMerklePathsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bandchain.v1.oracle.IAVLMerklePath, com.bandchain.v1.oracle.IAVLMerklePath.Builder, com.bandchain.v1.oracle.IAVLMerklePathOrBuilder> 
        getMerklePathsFieldBuilder() {
      if (merklePathsBuilder_ == null) {
        merklePathsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bandchain.v1.oracle.IAVLMerklePath, com.bandchain.v1.oracle.IAVLMerklePath.Builder, com.bandchain.v1.oracle.IAVLMerklePathOrBuilder>(
                merklePaths_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        merklePaths_ = null;
      }
      return merklePathsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bandchain.v1.oracle.OracleDataProof)
  }

  // @@protoc_insertion_point(class_scope:bandchain.v1.oracle.OracleDataProof)
  private static final com.bandchain.v1.oracle.OracleDataProof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bandchain.v1.oracle.OracleDataProof();
  }

  public static com.bandchain.v1.oracle.OracleDataProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleDataProof>
      PARSER = new com.google.protobuf.AbstractParser<OracleDataProof>() {
    @java.lang.Override
    public OracleDataProof parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleDataProof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleDataProof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bandchain.v1.oracle.OracleDataProof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

