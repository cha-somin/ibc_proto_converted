// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/plan/v2/querier.proto

package com.sentinel.plan.v2;

/**
 * Protobuf type {@code sentinel.plan.v2.QueryPlansResponse}
 */
public final class QueryPlansResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.plan.v2.QueryPlansResponse)
    QueryPlansResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPlansResponse.newBuilder() to construct.
  private QueryPlansResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPlansResponse() {
    plans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPlansResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlansResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlansResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.plan.v2.QueryPlansResponse.class, com.sentinel.plan.v2.QueryPlansResponse.Builder.class);
  }

  public static final int PLANS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.sentinel.plan.v2.Plan> plans_;
  /**
   * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.sentinel.plan.v2.Plan> getPlansList() {
    return plans_;
  }
  /**
   * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sentinel.plan.v2.PlanOrBuilder> 
      getPlansOrBuilderList() {
    return plans_;
  }
  /**
   * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getPlansCount() {
    return plans_.size();
  }
  /**
   * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.plan.v2.Plan getPlans(int index) {
    return plans_.get(index);
  }
  /**
   * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.plan.v2.PlanOrBuilder getPlansOrBuilder(
      int index) {
    return plans_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < plans_.size(); i++) {
      output.writeMessage(1, plans_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < plans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, plans_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.sentinel.plan.v2.QueryPlansResponse)) {
      return super.equals(obj);
    }
    com.sentinel.plan.v2.QueryPlansResponse other = (com.sentinel.plan.v2.QueryPlansResponse) obj;

    if (!getPlansList()
        .equals(other.getPlansList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getPlansCount() > 0) {
      hash = (37 * hash) + PLANS_FIELD_NUMBER;
      hash = (53 * hash) + getPlansList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.plan.v2.QueryPlansResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.plan.v2.QueryPlansResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.plan.v2.QueryPlansResponse parseFrom(
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
  public static Builder newBuilder(com.sentinel.plan.v2.QueryPlansResponse prototype) {
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
   * Protobuf type {@code sentinel.plan.v2.QueryPlansResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.plan.v2.QueryPlansResponse)
      com.sentinel.plan.v2.QueryPlansResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlansResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlansResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.plan.v2.QueryPlansResponse.class, com.sentinel.plan.v2.QueryPlansResponse.Builder.class);
    }

    // Construct using com.sentinel.plan.v2.QueryPlansResponse.newBuilder()
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
      if (plansBuilder_ == null) {
        plans_ = java.util.Collections.emptyList();
      } else {
        plans_ = null;
        plansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.plan.v2.QuerierProto.internal_static_sentinel_plan_v2_QueryPlansResponse_descriptor;
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlansResponse getDefaultInstanceForType() {
      return com.sentinel.plan.v2.QueryPlansResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlansResponse build() {
      com.sentinel.plan.v2.QueryPlansResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.plan.v2.QueryPlansResponse buildPartial() {
      com.sentinel.plan.v2.QueryPlansResponse result = new com.sentinel.plan.v2.QueryPlansResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sentinel.plan.v2.QueryPlansResponse result) {
      if (plansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          plans_ = java.util.Collections.unmodifiableList(plans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.plans_ = plans_;
      } else {
        result.plans_ = plansBuilder_.build();
      }
    }

    private void buildPartial0(com.sentinel.plan.v2.QueryPlansResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.plan.v2.QueryPlansResponse) {
        return mergeFrom((com.sentinel.plan.v2.QueryPlansResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.plan.v2.QueryPlansResponse other) {
      if (other == com.sentinel.plan.v2.QueryPlansResponse.getDefaultInstance()) return this;
      if (plansBuilder_ == null) {
        if (!other.plans_.isEmpty()) {
          if (plans_.isEmpty()) {
            plans_ = other.plans_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlansIsMutable();
            plans_.addAll(other.plans_);
          }
          onChanged();
        }
      } else {
        if (!other.plans_.isEmpty()) {
          if (plansBuilder_.isEmpty()) {
            plansBuilder_.dispose();
            plansBuilder_ = null;
            plans_ = other.plans_;
            bitField0_ = (bitField0_ & ~0x00000001);
            plansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlansFieldBuilder() : null;
          } else {
            plansBuilder_.addAllMessages(other.plans_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.sentinel.plan.v2.Plan m =
                  input.readMessage(
                      com.sentinel.plan.v2.Plan.parser(),
                      extensionRegistry);
              if (plansBuilder_ == null) {
                ensurePlansIsMutable();
                plans_.add(m);
              } else {
                plansBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
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

    private java.util.List<com.sentinel.plan.v2.Plan> plans_ =
      java.util.Collections.emptyList();
    private void ensurePlansIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        plans_ = new java.util.ArrayList<com.sentinel.plan.v2.Plan>(plans_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder> plansBuilder_;

    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.plan.v2.Plan> getPlansList() {
      if (plansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(plans_);
      } else {
        return plansBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public int getPlansCount() {
      if (plansBuilder_ == null) {
        return plans_.size();
      } else {
        return plansBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.Plan getPlans(int index) {
      if (plansBuilder_ == null) {
        return plans_.get(index);
      } else {
        return plansBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPlans(
        int index, com.sentinel.plan.v2.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.set(index, value);
        onChanged();
      } else {
        plansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPlans(
        int index, com.sentinel.plan.v2.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.set(index, builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPlans(com.sentinel.plan.v2.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.add(value);
        onChanged();
      } else {
        plansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPlans(
        int index, com.sentinel.plan.v2.Plan value) {
      if (plansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlansIsMutable();
        plans_.add(index, value);
        onChanged();
      } else {
        plansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPlans(
        com.sentinel.plan.v2.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.add(builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPlans(
        int index, com.sentinel.plan.v2.Plan.Builder builderForValue) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.add(index, builderForValue.build());
        onChanged();
      } else {
        plansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllPlans(
        java.lang.Iterable<? extends com.sentinel.plan.v2.Plan> values) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, plans_);
        onChanged();
      } else {
        plansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPlans() {
      if (plansBuilder_ == null) {
        plans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        plansBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public Builder removePlans(int index) {
      if (plansBuilder_ == null) {
        ensurePlansIsMutable();
        plans_.remove(index);
        onChanged();
      } else {
        plansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.Plan.Builder getPlansBuilder(
        int index) {
      return getPlansFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.PlanOrBuilder getPlansOrBuilder(
        int index) {
      if (plansBuilder_ == null) {
        return plans_.get(index);  } else {
        return plansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.sentinel.plan.v2.PlanOrBuilder> 
         getPlansOrBuilderList() {
      if (plansBuilder_ != null) {
        return plansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(plans_);
      }
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.Plan.Builder addPlansBuilder() {
      return getPlansFieldBuilder().addBuilder(
          com.sentinel.plan.v2.Plan.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.plan.v2.Plan.Builder addPlansBuilder(
        int index) {
      return getPlansFieldBuilder().addBuilder(
          index, com.sentinel.plan.v2.Plan.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.plan.v2.Plan plans = 1 [json_name = "plans", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.plan.v2.Plan.Builder> 
         getPlansBuilderList() {
      return getPlansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder> 
        getPlansFieldBuilder() {
      if (plansBuilder_ == null) {
        plansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sentinel.plan.v2.Plan, com.sentinel.plan.v2.Plan.Builder, com.sentinel.plan.v2.PlanOrBuilder>(
                plans_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        plans_ = null;
      }
      return plansBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.plan.v2.QueryPlansResponse)
  }

  // @@protoc_insertion_point(class_scope:sentinel.plan.v2.QueryPlansResponse)
  private static final com.sentinel.plan.v2.QueryPlansResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.plan.v2.QueryPlansResponse();
  }

  public static com.sentinel.plan.v2.QueryPlansResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPlansResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPlansResponse>() {
    @java.lang.Override
    public QueryPlansResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPlansResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPlansResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.plan.v2.QueryPlansResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

