// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/plan/v2/querier.proto

package com.sentinel.plan.v2;

/**
 * Protobuf type {@code sentinel.plan.v2.QueryPlanResponse}
 */
public final class QueryPlanResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.plan.v2.QueryPlanResponse)
    QueryPlanResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPlanResponse.newBuilder() to construct.
  private QueryPlanResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPlanResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPlanResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlanResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlanResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.plan.v2.QueryPlanResponse.class, com.sentinel.plan.v2.QueryPlanResponse.Builder.class);
  }

  public static final int PLAN_FIELD_NUMBER = 1;
  private com.sentinel.plan.v2.Plan plan_;
  /**
   * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
   * @return Whether the plan field is set.
   */
  @java.lang.Override
  public boolean hasPlan() {
    return plan_ != null;
  }
  /**
   * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
   * @return The plan.
   */
  @java.lang.Override
  public com.sentinel.plan.v2.Plan getPlan() {
    return plan_ == null ? com.sentinel.plan.v2.Plan.getDefaultInstance() : plan_;
  }
  /**
   * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.plan.v2.PlanOrBuilder getPlanOrBuilder() {
    return plan_ == null ? com.sentinel.plan.v2.Plan.getDefaultInstance() : plan_;
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
    if (plan_ != null) {
      output.writeMessage(1, getPlan());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (plan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlan());
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
    if (!(obj instanceof com.sentinel.plan.v2.QueryPlanResponse)) {
      return super.equals(obj);
    }
    com.sentinel.plan.v2.QueryPlanResponse other = (com.sentinel.plan.v2.QueryPlanResponse) obj;

    if (hasPlan() != other.hasPlan()) return false;
    if (hasPlan()) {
      if (!getPlan()
          .equals(other.getPlan())) return false;
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
    if (hasPlan()) {
      hash = (37 * hash) + PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getPlan().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.plan.v2.QueryPlanResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.plan.v2.QueryPlanResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.plan.v2.QueryPlanResponse parseFrom(
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
  public static Builder newBuilder(com.sentinel.plan.v2.QueryPlanResponse prototype) {
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
   * Protobuf type {@code sentinel.plan.v2.QueryPlanResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.plan.v2.QueryPlanResponse)
      com.sentinel.plan.v2.QueryPlanResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlanResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlanResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.plan.v2.QueryPlanResponse.class, com.sentinel.plan.v2.QueryPlanResponse.Builder.class);
    }

    // Construct using com.sentinel.plan.v2.QueryPlanResponse.newBuilder()
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
      plan_ = null;
      if (planBuilder_ != null) {
        planBuilder_.dispose();
        planBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlanResponse_descriptor;
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlanResponse getDefaultInstanceForType() {
      return com.sentinel.plan.v2.QueryPlanResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlanResponse build() {
      com.sentinel.plan.v2.QueryPlanResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlanResponse buildPartial() {
      com.sentinel.plan.v2.QueryPlanResponse result = new com.sentinel.plan.v2.QueryPlanResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.sentinel.plan.v2.QueryPlanResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.plan_ = planBuilder_ == null
            ? plan_
            : planBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.plan.v2.QueryPlanResponse) {
        return mergeFrom((com.sentinel.plan.v2.QueryPlanResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.plan.v2.QueryPlanResponse other) {
      if (other == com.sentinel.plan.v2.QueryPlanResponse.getDefaultInstance()) return this;
      if (other.hasPlan()) {
        mergePlan(other.getPlan());
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
                  getPlanFieldBuilder().getBuilder(),
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

    private com.sentinel.plan.v2.Plan plan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder> planBuilder_;
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     * @return Whether the plan field is set.
     */
    public boolean hasPlan() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     * @return The plan.
     */
    public com.sentinel.plan.v2.Plan getPlan() {
      if (planBuilder_ == null) {
        return plan_ == null ? com.sentinel.plan.v2.Plan.getDefaultInstance() : plan_;
      } else {
        return planBuilder_.getMessage();
      }
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPlan(com.sentinel.plan.v2.Plan value) {
      if (planBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plan_ = value;
      } else {
        planBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPlan(
        com.sentinel.plan.v2.Plan.Builder builderForValue) {
      if (planBuilder_ == null) {
        plan_ = builderForValue.build();
      } else {
        planBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergePlan(com.sentinel.plan.v2.Plan value) {
      if (planBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          plan_ != null &&
          plan_ != com.sentinel.plan.v2.Plan.getDefaultInstance()) {
          getPlanBuilder().mergeFrom(value);
        } else {
          plan_ = value;
        }
      } else {
        planBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPlan() {
      bitField0_ = (bitField0_ & ~0x00000001);
      plan_ = null;
      if (planBuilder_ != null) {
        planBuilder_.dispose();
        planBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.Plan.Builder getPlanBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPlanFieldBuilder().getBuilder();
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.PlanOrBuilder getPlanOrBuilder() {
      if (planBuilder_ != null) {
        return planBuilder_.getMessageOrBuilder();
      } else {
        return plan_ == null ?
            com.sentinel.plan.v2.Plan.getDefaultInstance() : plan_;
      }
    }
    /**
     * <code>.sentinel.plan.v2.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder> 
        getPlanFieldBuilder() {
      if (planBuilder_ == null) {
        planBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder>(
                getPlan(),
                getParentForChildren(),
                isClean());
        plan_ = null;
      }
      return planBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.plan.v2.QueryPlanResponse)
  }

  // @@protoc_insertion_point(class_scope:sentinel.plan.v2.QueryPlanResponse)
  private static final com.sentinel.plan.v2.QueryPlanResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.plan.v2.QueryPlanResponse();
  }

  public static com.sentinel.plan.v2.QueryPlanResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPlanResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPlanResponse>() {
    @java.lang.Override
    public QueryPlanResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPlanResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPlanResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.plan.v2.QueryPlanResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

