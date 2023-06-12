// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/gov/v1alpha1/query.proto

package com.shentu.gov.v1alpha1;

/**
 * Protobuf type {@code shentu.gov.v1alpha1.QueryCertVotedRequest}
 */
public final class QueryCertVotedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.gov.v1alpha1.QueryCertVotedRequest)
    QueryCertVotedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCertVotedRequest.newBuilder() to construct.
  private QueryCertVotedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCertVotedRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCertVotedRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.gov.v1alpha1.QueryProto.internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.gov.v1alpha1.QueryProto.internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.gov.v1alpha1.QueryCertVotedRequest.class, com.shentu.gov.v1alpha1.QueryCertVotedRequest.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <pre>
   * proposal_id defines the unique id of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
   * @return The proposalId.
   */
  @java.lang.Override
  public long getProposalId() {
    return proposalId_;
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
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
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
    if (!(obj instanceof com.shentu.gov.v1alpha1.QueryCertVotedRequest)) {
      return super.equals(obj);
    }
    com.shentu.gov.v1alpha1.QueryCertVotedRequest other = (com.shentu.gov.v1alpha1.QueryCertVotedRequest) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
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
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest parseFrom(
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
  public static Builder newBuilder(com.shentu.gov.v1alpha1.QueryCertVotedRequest prototype) {
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
   * Protobuf type {@code shentu.gov.v1alpha1.QueryCertVotedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.gov.v1alpha1.QueryCertVotedRequest)
      com.shentu.gov.v1alpha1.QueryCertVotedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.gov.v1alpha1.QueryProto.internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.gov.v1alpha1.QueryProto.internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.gov.v1alpha1.QueryCertVotedRequest.class, com.shentu.gov.v1alpha1.QueryCertVotedRequest.Builder.class);
    }

    // Construct using com.shentu.gov.v1alpha1.QueryCertVotedRequest.newBuilder()
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
      proposalId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.gov.v1alpha1.QueryProto.internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor;
    }

    @java.lang.Override
    public com.shentu.gov.v1alpha1.QueryCertVotedRequest getDefaultInstanceForType() {
      return com.shentu.gov.v1alpha1.QueryCertVotedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.gov.v1alpha1.QueryCertVotedRequest build() {
      com.shentu.gov.v1alpha1.QueryCertVotedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.gov.v1alpha1.QueryCertVotedRequest buildPartial() {
      com.shentu.gov.v1alpha1.QueryCertVotedRequest result = new com.shentu.gov.v1alpha1.QueryCertVotedRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.gov.v1alpha1.QueryCertVotedRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.gov.v1alpha1.QueryCertVotedRequest) {
        return mergeFrom((com.shentu.gov.v1alpha1.QueryCertVotedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.gov.v1alpha1.QueryCertVotedRequest other) {
      if (other == com.shentu.gov.v1alpha1.QueryCertVotedRequest.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
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
              proposalId_ = input.readUInt64();
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

    private long proposalId_ ;
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return The proposalId.
     */
    @java.lang.Override
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @param value The proposalId to set.
     * @return This builder for chaining.
     */
    public Builder setProposalId(long value) {

      proposalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:shentu.gov.v1alpha1.QueryCertVotedRequest)
  }

  // @@protoc_insertion_point(class_scope:shentu.gov.v1alpha1.QueryCertVotedRequest)
  private static final com.shentu.gov.v1alpha1.QueryCertVotedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.gov.v1alpha1.QueryCertVotedRequest();
  }

  public static com.shentu.gov.v1alpha1.QueryCertVotedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCertVotedRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryCertVotedRequest>() {
    @java.lang.Override
    public QueryCertVotedRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCertVotedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCertVotedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.gov.v1alpha1.QueryCertVotedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

