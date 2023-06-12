// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryParamsResponse is the response type for the Query/Params RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryParamsResponse}
 */
public final class QueryParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryParamsResponse)
    QueryParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryParamsResponse.newBuilder() to construct.
  private QueryParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryParamsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.gov.v1beta1.QueryParamsResponse.class, com.cosmos.gov.v1beta1.QueryParamsResponse.Builder.class);
  }

  public static final int VOTING_PARAMS_FIELD_NUMBER = 1;
  private com.cosmos.gov.v1beta1.VotingParams votingParams_;
  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the votingParams field is set.
   */
  @java.lang.Override
  public boolean hasVotingParams() {
    return votingParams_ != null;
  }
  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The votingParams.
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.VotingParams getVotingParams() {
    return votingParams_ == null ? com.cosmos.gov.v1beta1.VotingParams.getDefaultInstance() : votingParams_;
  }
  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.VotingParamsOrBuilder getVotingParamsOrBuilder() {
    return votingParams_ == null ? com.cosmos.gov.v1beta1.VotingParams.getDefaultInstance() : votingParams_;
  }

  public static final int DEPOSIT_PARAMS_FIELD_NUMBER = 2;
  private com.cosmos.gov.v1beta1.DepositParams depositParams_;
  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the depositParams field is set.
   */
  @java.lang.Override
  public boolean hasDepositParams() {
    return depositParams_ != null;
  }
  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The depositParams.
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.DepositParams getDepositParams() {
    return depositParams_ == null ? com.cosmos.gov.v1beta1.DepositParams.getDefaultInstance() : depositParams_;
  }
  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.DepositParamsOrBuilder getDepositParamsOrBuilder() {
    return depositParams_ == null ? com.cosmos.gov.v1beta1.DepositParams.getDefaultInstance() : depositParams_;
  }

  public static final int TALLY_PARAMS_FIELD_NUMBER = 3;
  private com.cosmos.gov.v1beta1.TallyParams tallyParams_;
  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the tallyParams field is set.
   */
  @java.lang.Override
  public boolean hasTallyParams() {
    return tallyParams_ != null;
  }
  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The tallyParams.
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.TallyParams getTallyParams() {
    return tallyParams_ == null ? com.cosmos.gov.v1beta1.TallyParams.getDefaultInstance() : tallyParams_;
  }
  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.TallyParamsOrBuilder getTallyParamsOrBuilder() {
    return tallyParams_ == null ? com.cosmos.gov.v1beta1.TallyParams.getDefaultInstance() : tallyParams_;
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
    if (votingParams_ != null) {
      output.writeMessage(1, getVotingParams());
    }
    if (depositParams_ != null) {
      output.writeMessage(2, getDepositParams());
    }
    if (tallyParams_ != null) {
      output.writeMessage(3, getTallyParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (votingParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVotingParams());
    }
    if (depositParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDepositParams());
    }
    if (tallyParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTallyParams());
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
    if (!(obj instanceof com.cosmos.gov.v1beta1.QueryParamsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.gov.v1beta1.QueryParamsResponse other = (com.cosmos.gov.v1beta1.QueryParamsResponse) obj;

    if (hasVotingParams() != other.hasVotingParams()) return false;
    if (hasVotingParams()) {
      if (!getVotingParams()
          .equals(other.getVotingParams())) return false;
    }
    if (hasDepositParams() != other.hasDepositParams()) return false;
    if (hasDepositParams()) {
      if (!getDepositParams()
          .equals(other.getDepositParams())) return false;
    }
    if (hasTallyParams() != other.hasTallyParams()) return false;
    if (hasTallyParams()) {
      if (!getTallyParams()
          .equals(other.getTallyParams())) return false;
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
    if (hasVotingParams()) {
      hash = (37 * hash) + VOTING_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getVotingParams().hashCode();
    }
    if (hasDepositParams()) {
      hash = (37 * hash) + DEPOSIT_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getDepositParams().hashCode();
    }
    if (hasTallyParams()) {
      hash = (37 * hash) + TALLY_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getTallyParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryParamsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.gov.v1beta1.QueryParamsResponse prototype) {
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
   * QueryParamsResponse is the response type for the Query/Params RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryParamsResponse)
      com.cosmos.gov.v1beta1.QueryParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.gov.v1beta1.QueryParamsResponse.class, com.cosmos.gov.v1beta1.QueryParamsResponse.Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.QueryParamsResponse.newBuilder()
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
      votingParams_ = null;
      if (votingParamsBuilder_ != null) {
        votingParamsBuilder_.dispose();
        votingParamsBuilder_ = null;
      }
      depositParams_ = null;
      if (depositParamsBuilder_ != null) {
        depositParamsBuilder_.dispose();
        depositParamsBuilder_ = null;
      }
      tallyParams_ = null;
      if (tallyParamsBuilder_ != null) {
        tallyParamsBuilder_.dispose();
        tallyParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
      return com.cosmos.gov.v1beta1.QueryParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryParamsResponse build() {
      com.cosmos.gov.v1beta1.QueryParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryParamsResponse buildPartial() {
      com.cosmos.gov.v1beta1.QueryParamsResponse result = new com.cosmos.gov.v1beta1.QueryParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.gov.v1beta1.QueryParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.votingParams_ = votingParamsBuilder_ == null
            ? votingParams_
            : votingParamsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.depositParams_ = depositParamsBuilder_ == null
            ? depositParams_
            : depositParamsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tallyParams_ = tallyParamsBuilder_ == null
            ? tallyParams_
            : tallyParamsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.gov.v1beta1.QueryParamsResponse) {
        return mergeFrom((com.cosmos.gov.v1beta1.QueryParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.gov.v1beta1.QueryParamsResponse other) {
      if (other == com.cosmos.gov.v1beta1.QueryParamsResponse.getDefaultInstance()) return this;
      if (other.hasVotingParams()) {
        mergeVotingParams(other.getVotingParams());
      }
      if (other.hasDepositParams()) {
        mergeDepositParams(other.getDepositParams());
      }
      if (other.hasTallyParams()) {
        mergeTallyParams(other.getTallyParams());
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
                  getVotingParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDepositParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTallyParamsFieldBuilder().getBuilder(),
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

    private com.cosmos.gov.v1beta1.VotingParams votingParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.VotingParams, com.cosmos.gov.v1beta1.VotingParams.Builder, com.cosmos.gov.v1beta1.VotingParamsOrBuilder> votingParamsBuilder_;
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the votingParams field is set.
     */
    public boolean hasVotingParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The votingParams.
     */
    public com.cosmos.gov.v1beta1.VotingParams getVotingParams() {
      if (votingParamsBuilder_ == null) {
        return votingParams_ == null ? com.cosmos.gov.v1beta1.VotingParams.getDefaultInstance() : votingParams_;
      } else {
        return votingParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setVotingParams(com.cosmos.gov.v1beta1.VotingParams value) {
      if (votingParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        votingParams_ = value;
      } else {
        votingParamsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setVotingParams(
        com.cosmos.gov.v1beta1.VotingParams.Builder builderForValue) {
      if (votingParamsBuilder_ == null) {
        votingParams_ = builderForValue.build();
      } else {
        votingParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder mergeVotingParams(com.cosmos.gov.v1beta1.VotingParams value) {
      if (votingParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          votingParams_ != null &&
          votingParams_ != com.cosmos.gov.v1beta1.VotingParams.getDefaultInstance()) {
          getVotingParamsBuilder().mergeFrom(value);
        } else {
          votingParams_ = value;
        }
      } else {
        votingParamsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearVotingParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      votingParams_ = null;
      if (votingParamsBuilder_ != null) {
        votingParamsBuilder_.dispose();
        votingParamsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.VotingParams.Builder getVotingParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVotingParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.VotingParamsOrBuilder getVotingParamsOrBuilder() {
      if (votingParamsBuilder_ != null) {
        return votingParamsBuilder_.getMessageOrBuilder();
      } else {
        return votingParams_ == null ?
            com.cosmos.gov.v1beta1.VotingParams.getDefaultInstance() : votingParams_;
      }
    }
    /**
     * <pre>
     * voting_params defines the parameters related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [json_name = "votingParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.VotingParams, com.cosmos.gov.v1beta1.VotingParams.Builder, com.cosmos.gov.v1beta1.VotingParamsOrBuilder> 
        getVotingParamsFieldBuilder() {
      if (votingParamsBuilder_ == null) {
        votingParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.gov.v1beta1.VotingParams, com.cosmos.gov.v1beta1.VotingParams.Builder, com.cosmos.gov.v1beta1.VotingParamsOrBuilder>(
                getVotingParams(),
                getParentForChildren(),
                isClean());
        votingParams_ = null;
      }
      return votingParamsBuilder_;
    }

    private com.cosmos.gov.v1beta1.DepositParams depositParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.DepositParams, com.cosmos.gov.v1beta1.DepositParams.Builder, com.cosmos.gov.v1beta1.DepositParamsOrBuilder> depositParamsBuilder_;
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the depositParams field is set.
     */
    public boolean hasDepositParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The depositParams.
     */
    public com.cosmos.gov.v1beta1.DepositParams getDepositParams() {
      if (depositParamsBuilder_ == null) {
        return depositParams_ == null ? com.cosmos.gov.v1beta1.DepositParams.getDefaultInstance() : depositParams_;
      } else {
        return depositParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setDepositParams(com.cosmos.gov.v1beta1.DepositParams value) {
      if (depositParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        depositParams_ = value;
      } else {
        depositParamsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setDepositParams(
        com.cosmos.gov.v1beta1.DepositParams.Builder builderForValue) {
      if (depositParamsBuilder_ == null) {
        depositParams_ = builderForValue.build();
      } else {
        depositParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder mergeDepositParams(com.cosmos.gov.v1beta1.DepositParams value) {
      if (depositParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          depositParams_ != null &&
          depositParams_ != com.cosmos.gov.v1beta1.DepositParams.getDefaultInstance()) {
          getDepositParamsBuilder().mergeFrom(value);
        } else {
          depositParams_ = value;
        }
      } else {
        depositParamsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearDepositParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      depositParams_ = null;
      if (depositParamsBuilder_ != null) {
        depositParamsBuilder_.dispose();
        depositParamsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.DepositParams.Builder getDepositParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDepositParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.DepositParamsOrBuilder getDepositParamsOrBuilder() {
      if (depositParamsBuilder_ != null) {
        return depositParamsBuilder_.getMessageOrBuilder();
      } else {
        return depositParams_ == null ?
            com.cosmos.gov.v1beta1.DepositParams.getDefaultInstance() : depositParams_;
      }
    }
    /**
     * <pre>
     * deposit_params defines the parameters related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [json_name = "depositParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.DepositParams, com.cosmos.gov.v1beta1.DepositParams.Builder, com.cosmos.gov.v1beta1.DepositParamsOrBuilder> 
        getDepositParamsFieldBuilder() {
      if (depositParamsBuilder_ == null) {
        depositParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.gov.v1beta1.DepositParams, com.cosmos.gov.v1beta1.DepositParams.Builder, com.cosmos.gov.v1beta1.DepositParamsOrBuilder>(
                getDepositParams(),
                getParentForChildren(),
                isClean());
        depositParams_ = null;
      }
      return depositParamsBuilder_;
    }

    private com.cosmos.gov.v1beta1.TallyParams tallyParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.TallyParams, com.cosmos.gov.v1beta1.TallyParams.Builder, com.cosmos.gov.v1beta1.TallyParamsOrBuilder> tallyParamsBuilder_;
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the tallyParams field is set.
     */
    public boolean hasTallyParams() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The tallyParams.
     */
    public com.cosmos.gov.v1beta1.TallyParams getTallyParams() {
      if (tallyParamsBuilder_ == null) {
        return tallyParams_ == null ? com.cosmos.gov.v1beta1.TallyParams.getDefaultInstance() : tallyParams_;
      } else {
        return tallyParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setTallyParams(com.cosmos.gov.v1beta1.TallyParams value) {
      if (tallyParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tallyParams_ = value;
      } else {
        tallyParamsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setTallyParams(
        com.cosmos.gov.v1beta1.TallyParams.Builder builderForValue) {
      if (tallyParamsBuilder_ == null) {
        tallyParams_ = builderForValue.build();
      } else {
        tallyParamsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder mergeTallyParams(com.cosmos.gov.v1beta1.TallyParams value) {
      if (tallyParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          tallyParams_ != null &&
          tallyParams_ != com.cosmos.gov.v1beta1.TallyParams.getDefaultInstance()) {
          getTallyParamsBuilder().mergeFrom(value);
        } else {
          tallyParams_ = value;
        }
      } else {
        tallyParamsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearTallyParams() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tallyParams_ = null;
      if (tallyParamsBuilder_ != null) {
        tallyParamsBuilder_.dispose();
        tallyParamsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.TallyParams.Builder getTallyParamsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTallyParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.TallyParamsOrBuilder getTallyParamsOrBuilder() {
      if (tallyParamsBuilder_ != null) {
        return tallyParamsBuilder_.getMessageOrBuilder();
      } else {
        return tallyParams_ == null ?
            com.cosmos.gov.v1beta1.TallyParams.getDefaultInstance() : tallyParams_;
      }
    }
    /**
     * <pre>
     * tally_params defines the parameters related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [json_name = "tallyParams", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.TallyParams, com.cosmos.gov.v1beta1.TallyParams.Builder, com.cosmos.gov.v1beta1.TallyParamsOrBuilder> 
        getTallyParamsFieldBuilder() {
      if (tallyParamsBuilder_ == null) {
        tallyParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.gov.v1beta1.TallyParams, com.cosmos.gov.v1beta1.TallyParams.Builder, com.cosmos.gov.v1beta1.TallyParamsOrBuilder>(
                getTallyParams(),
                getParentForChildren(),
                isClean());
        tallyParams_ = null;
      }
      return tallyParamsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryParamsResponse)
  private static final com.cosmos.gov.v1beta1.QueryParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.gov.v1beta1.QueryParamsResponse();
  }

  public static com.cosmos.gov.v1beta1.QueryParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryParamsResponse>() {
    @java.lang.Override
    public QueryParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.gov.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

