// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/bundles.proto

package com.kyve.query.v1beta1;

/**
 * <pre>
 * QueryCanVoteRequest is the request type for the Query/CanVote RPC method.
 * </pre>
 *
 * Protobuf type {@code kyve.query.v1beta1.QueryCanVoteRequest}
 */
public final class QueryCanVoteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.query.v1beta1.QueryCanVoteRequest)
    QueryCanVoteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCanVoteRequest.newBuilder() to construct.
  private QueryCanVoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCanVoteRequest() {
    staker_ = "";
    voter_ = "";
    storageId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCanVoteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryCanVoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryCanVoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.query.v1beta1.QueryCanVoteRequest.class, com.kyve.query.v1beta1.QueryCanVoteRequest.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <pre>
   * pool_id defines the unique ID of the pool.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int STAKER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object staker_ = "";
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  @java.lang.Override
  public java.lang.String getStaker() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staker_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStakerBytes() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOTER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object voter_ = "";
  /**
   * <pre>
   * voter ...
   * </pre>
   *
   * <code>string voter = 3 [json_name = "voter"];</code>
   * @return The voter.
   */
  @java.lang.Override
  public java.lang.String getVoter() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * voter ...
   * </pre>
   *
   * <code>string voter = 3 [json_name = "voter"];</code>
   * @return The bytes for voter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVoterBytes() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storageId_ = "";
  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The storageId.
   */
  @java.lang.Override
  public java.lang.String getStorageId() {
    java.lang.Object ref = storageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The bytes for storageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStorageIdBytes() {
    java.lang.Object ref = storageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storageId_ = b;
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
    if (poolId_ != 0L) {
      output.writeUInt64(1, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, staker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, voter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, storageId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, staker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, voter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, storageId_);
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
    if (!(obj instanceof com.kyve.query.v1beta1.QueryCanVoteRequest)) {
      return super.equals(obj);
    }
    com.kyve.query.v1beta1.QueryCanVoteRequest other = (com.kyve.query.v1beta1.QueryCanVoteRequest) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (!getStaker()
        .equals(other.getStaker())) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (!getStorageId()
        .equals(other.getStorageId())) return false;
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
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + STAKER_FIELD_NUMBER;
    hash = (53 * hash) + getStaker().hashCode();
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    hash = (37 * hash) + STORAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStorageId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.QueryCanVoteRequest parseFrom(
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
  public static Builder newBuilder(com.kyve.query.v1beta1.QueryCanVoteRequest prototype) {
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
   * QueryCanVoteRequest is the request type for the Query/CanVote RPC method.
   * </pre>
   *
   * Protobuf type {@code kyve.query.v1beta1.QueryCanVoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.query.v1beta1.QueryCanVoteRequest)
      com.kyve.query.v1beta1.QueryCanVoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryCanVoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryCanVoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.query.v1beta1.QueryCanVoteRequest.class, com.kyve.query.v1beta1.QueryCanVoteRequest.Builder.class);
    }

    // Construct using com.kyve.query.v1beta1.QueryCanVoteRequest.newBuilder()
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
      poolId_ = 0L;
      staker_ = "";
      voter_ = "";
      storageId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryCanVoteRequest_descriptor;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryCanVoteRequest getDefaultInstanceForType() {
      return com.kyve.query.v1beta1.QueryCanVoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryCanVoteRequest build() {
      com.kyve.query.v1beta1.QueryCanVoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryCanVoteRequest buildPartial() {
      com.kyve.query.v1beta1.QueryCanVoteRequest result = new com.kyve.query.v1beta1.QueryCanVoteRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.query.v1beta1.QueryCanVoteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.staker_ = staker_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.voter_ = voter_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.storageId_ = storageId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.query.v1beta1.QueryCanVoteRequest) {
        return mergeFrom((com.kyve.query.v1beta1.QueryCanVoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.query.v1beta1.QueryCanVoteRequest other) {
      if (other == com.kyve.query.v1beta1.QueryCanVoteRequest.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (!other.getStaker().isEmpty()) {
        staker_ = other.staker_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getStorageId().isEmpty()) {
        storageId_ = other.storageId_;
        bitField0_ |= 0x00000008;
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
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              staker_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              voter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              storageId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
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

    private long poolId_ ;
    /**
     * <pre>
     * pool_id defines the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <pre>
     * pool_id defines the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool_id defines the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object staker_ = "";
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The staker.
     */
    public java.lang.String getStaker() {
      java.lang.Object ref = staker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The bytes for staker.
     */
    public com.google.protobuf.ByteString
        getStakerBytes() {
      java.lang.Object ref = staker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The staker to set.
     * @return This builder for chaining.
     */
    public Builder setStaker(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      staker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStaker() {
      staker_ = getDefaultInstance().getStaker();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The bytes for staker to set.
     * @return This builder for chaining.
     */
    public Builder setStakerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      staker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object voter_ = "";
    /**
     * <pre>
     * voter ...
     * </pre>
     *
     * <code>string voter = 3 [json_name = "voter"];</code>
     * @return The voter.
     */
    public java.lang.String getVoter() {
      java.lang.Object ref = voter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * voter ...
     * </pre>
     *
     * <code>string voter = 3 [json_name = "voter"];</code>
     * @return The bytes for voter.
     */
    public com.google.protobuf.ByteString
        getVoterBytes() {
      java.lang.Object ref = voter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * voter ...
     * </pre>
     *
     * <code>string voter = 3 [json_name = "voter"];</code>
     * @param value The voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      voter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voter ...
     * </pre>
     *
     * <code>string voter = 3 [json_name = "voter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoter() {
      voter_ = getDefaultInstance().getVoter();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voter ...
     * </pre>
     *
     * <code>string voter = 3 [json_name = "voter"];</code>
     * @param value The bytes for voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      voter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object storageId_ = "";
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return The storageId.
     */
    public java.lang.String getStorageId() {
      java.lang.Object ref = storageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return The bytes for storageId.
     */
    public com.google.protobuf.ByteString
        getStorageIdBytes() {
      java.lang.Object ref = storageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @param value The storageId to set.
     * @return This builder for chaining.
     */
    public Builder setStorageId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storageId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStorageId() {
      storageId_ = getDefaultInstance().getStorageId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage_id ...
     * </pre>
     *
     * <code>string storage_id = 4 [json_name = "storageId"];</code>
     * @param value The bytes for storageId to set.
     * @return This builder for chaining.
     */
    public Builder setStorageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storageId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:kyve.query.v1beta1.QueryCanVoteRequest)
  }

  // @@protoc_insertion_point(class_scope:kyve.query.v1beta1.QueryCanVoteRequest)
  private static final com.kyve.query.v1beta1.QueryCanVoteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.query.v1beta1.QueryCanVoteRequest();
  }

  public static com.kyve.query.v1beta1.QueryCanVoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCanVoteRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryCanVoteRequest>() {
    @java.lang.Override
    public QueryCanVoteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCanVoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCanVoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.query.v1beta1.QueryCanVoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

