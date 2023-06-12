// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/reward/v1/query.proto

package com.provenance.reward.v1;

/**
 * <pre>
 * QueryClaimPeriodRewardDistributionsByIDResponse returns the requested ClaimPeriodRewardDistribution
 * </pre>
 *
 * Protobuf type {@code provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse}
 */
public final class QueryClaimPeriodRewardDistributionsByIDResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)
    QueryClaimPeriodRewardDistributionsByIDResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClaimPeriodRewardDistributionsByIDResponse.newBuilder() to construct.
  private QueryClaimPeriodRewardDistributionsByIDResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClaimPeriodRewardDistributionsByIDResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClaimPeriodRewardDistributionsByIDResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.reward.v1.QueryProto.internal_static_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.reward.v1.QueryProto.internal_static_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.class, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.Builder.class);
  }

  public static final int CLAIM_PERIOD_REWARD_DISTRIBUTION_FIELD_NUMBER = 1;
  private com.provenance.reward.v1.ClaimPeriodRewardDistribution claimPeriodRewardDistribution_;
  /**
   * <pre>
   * The ClaimPeriodRewardDistribution object that was queried for.
   * </pre>
   *
   * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
   * @return Whether the claimPeriodRewardDistribution field is set.
   */
  @java.lang.Override
  public boolean hasClaimPeriodRewardDistribution() {
    return claimPeriodRewardDistribution_ != null;
  }
  /**
   * <pre>
   * The ClaimPeriodRewardDistribution object that was queried for.
   * </pre>
   *
   * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
   * @return The claimPeriodRewardDistribution.
   */
  @java.lang.Override
  public com.provenance.reward.v1.ClaimPeriodRewardDistribution getClaimPeriodRewardDistribution() {
    return claimPeriodRewardDistribution_ == null ? com.provenance.reward.v1.ClaimPeriodRewardDistribution.getDefaultInstance() : claimPeriodRewardDistribution_;
  }
  /**
   * <pre>
   * The ClaimPeriodRewardDistribution object that was queried for.
   * </pre>
   *
   * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
   */
  @java.lang.Override
  public com.provenance.reward.v1.ClaimPeriodRewardDistributionOrBuilder getClaimPeriodRewardDistributionOrBuilder() {
    return claimPeriodRewardDistribution_ == null ? com.provenance.reward.v1.ClaimPeriodRewardDistribution.getDefaultInstance() : claimPeriodRewardDistribution_;
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
    if (claimPeriodRewardDistribution_ != null) {
      output.writeMessage(1, getClaimPeriodRewardDistribution());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (claimPeriodRewardDistribution_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClaimPeriodRewardDistribution());
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
    if (!(obj instanceof com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)) {
      return super.equals(obj);
    }
    com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse other = (com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse) obj;

    if (hasClaimPeriodRewardDistribution() != other.hasClaimPeriodRewardDistribution()) return false;
    if (hasClaimPeriodRewardDistribution()) {
      if (!getClaimPeriodRewardDistribution()
          .equals(other.getClaimPeriodRewardDistribution())) return false;
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
    if (hasClaimPeriodRewardDistribution()) {
      hash = (37 * hash) + CLAIM_PERIOD_REWARD_DISTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getClaimPeriodRewardDistribution().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse parseFrom(
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
  public static Builder newBuilder(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse prototype) {
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
   * QueryClaimPeriodRewardDistributionsByIDResponse returns the requested ClaimPeriodRewardDistribution
   * </pre>
   *
   * Protobuf type {@code provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.reward.v1.QueryProto.internal_static_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.reward.v1.QueryProto.internal_static_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.class, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.Builder.class);
    }

    // Construct using com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.newBuilder()
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
      claimPeriodRewardDistribution_ = null;
      if (claimPeriodRewardDistributionBuilder_ != null) {
        claimPeriodRewardDistributionBuilder_.dispose();
        claimPeriodRewardDistributionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.reward.v1.QueryProto.internal_static_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse_descriptor;
    }

    @java.lang.Override
    public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse getDefaultInstanceForType() {
      return com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse build() {
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse buildPartial() {
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse result = new com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.claimPeriodRewardDistribution_ = claimPeriodRewardDistributionBuilder_ == null
            ? claimPeriodRewardDistribution_
            : claimPeriodRewardDistributionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse) {
        return mergeFrom((com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse other) {
      if (other == com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.getDefaultInstance()) return this;
      if (other.hasClaimPeriodRewardDistribution()) {
        mergeClaimPeriodRewardDistribution(other.getClaimPeriodRewardDistribution());
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
                  getClaimPeriodRewardDistributionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.provenance.reward.v1.ClaimPeriodRewardDistribution claimPeriodRewardDistribution_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.reward.v1.ClaimPeriodRewardDistribution, com.provenance.reward.v1.ClaimPeriodRewardDistribution.Builder, com.provenance.reward.v1.ClaimPeriodRewardDistributionOrBuilder> claimPeriodRewardDistributionBuilder_;
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     * @return Whether the claimPeriodRewardDistribution field is set.
     */
    public boolean hasClaimPeriodRewardDistribution() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     * @return The claimPeriodRewardDistribution.
     */
    public com.provenance.reward.v1.ClaimPeriodRewardDistribution getClaimPeriodRewardDistribution() {
      if (claimPeriodRewardDistributionBuilder_ == null) {
        return claimPeriodRewardDistribution_ == null ? com.provenance.reward.v1.ClaimPeriodRewardDistribution.getDefaultInstance() : claimPeriodRewardDistribution_;
      } else {
        return claimPeriodRewardDistributionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public Builder setClaimPeriodRewardDistribution(com.provenance.reward.v1.ClaimPeriodRewardDistribution value) {
      if (claimPeriodRewardDistributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        claimPeriodRewardDistribution_ = value;
      } else {
        claimPeriodRewardDistributionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public Builder setClaimPeriodRewardDistribution(
        com.provenance.reward.v1.ClaimPeriodRewardDistribution.Builder builderForValue) {
      if (claimPeriodRewardDistributionBuilder_ == null) {
        claimPeriodRewardDistribution_ = builderForValue.build();
      } else {
        claimPeriodRewardDistributionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public Builder mergeClaimPeriodRewardDistribution(com.provenance.reward.v1.ClaimPeriodRewardDistribution value) {
      if (claimPeriodRewardDistributionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          claimPeriodRewardDistribution_ != null &&
          claimPeriodRewardDistribution_ != com.provenance.reward.v1.ClaimPeriodRewardDistribution.getDefaultInstance()) {
          getClaimPeriodRewardDistributionBuilder().mergeFrom(value);
        } else {
          claimPeriodRewardDistribution_ = value;
        }
      } else {
        claimPeriodRewardDistributionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public Builder clearClaimPeriodRewardDistribution() {
      bitField0_ = (bitField0_ & ~0x00000001);
      claimPeriodRewardDistribution_ = null;
      if (claimPeriodRewardDistributionBuilder_ != null) {
        claimPeriodRewardDistributionBuilder_.dispose();
        claimPeriodRewardDistributionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public com.provenance.reward.v1.ClaimPeriodRewardDistribution.Builder getClaimPeriodRewardDistributionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClaimPeriodRewardDistributionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    public com.provenance.reward.v1.ClaimPeriodRewardDistributionOrBuilder getClaimPeriodRewardDistributionOrBuilder() {
      if (claimPeriodRewardDistributionBuilder_ != null) {
        return claimPeriodRewardDistributionBuilder_.getMessageOrBuilder();
      } else {
        return claimPeriodRewardDistribution_ == null ?
            com.provenance.reward.v1.ClaimPeriodRewardDistribution.getDefaultInstance() : claimPeriodRewardDistribution_;
      }
    }
    /**
     * <pre>
     * The ClaimPeriodRewardDistribution object that was queried for.
     * </pre>
     *
     * <code>.provenance.reward.v1.ClaimPeriodRewardDistribution claim_period_reward_distribution = 1 [json_name = "claimPeriodRewardDistribution"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.reward.v1.ClaimPeriodRewardDistribution, com.provenance.reward.v1.ClaimPeriodRewardDistribution.Builder, com.provenance.reward.v1.ClaimPeriodRewardDistributionOrBuilder> 
        getClaimPeriodRewardDistributionFieldBuilder() {
      if (claimPeriodRewardDistributionBuilder_ == null) {
        claimPeriodRewardDistributionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.reward.v1.ClaimPeriodRewardDistribution, com.provenance.reward.v1.ClaimPeriodRewardDistribution.Builder, com.provenance.reward.v1.ClaimPeriodRewardDistributionOrBuilder>(
                getClaimPeriodRewardDistribution(),
                getParentForChildren(),
                isClean());
        claimPeriodRewardDistribution_ = null;
      }
      return claimPeriodRewardDistributionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse)
  private static final com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse();
  }

  public static com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClaimPeriodRewardDistributionsByIDResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClaimPeriodRewardDistributionsByIDResponse>() {
    @java.lang.Override
    public QueryClaimPeriodRewardDistributionsByIDResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClaimPeriodRewardDistributionsByIDResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClaimPeriodRewardDistributionsByIDResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

