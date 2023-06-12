// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainstaking/v1/query.proto

package com.quicksilver.interchainstaking.v1;

/**
 * Protobuf type {@code quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse}
 */
public final class QueryWithdrawalRecordsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)
    QueryWithdrawalRecordsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryWithdrawalRecordsResponse.newBuilder() to construct.
  private QueryWithdrawalRecordsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryWithdrawalRecordsResponse() {
    withdrawals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryWithdrawalRecordsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.class, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.Builder.class);
  }

  public static final int WITHDRAWALS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.quicksilver.interchainstaking.v1.WithdrawalRecord> withdrawals_;
  /**
   * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.quicksilver.interchainstaking.v1.WithdrawalRecord> getWithdrawalsList() {
    return withdrawals_;
  }
  /**
   * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder> 
      getWithdrawalsOrBuilderList() {
    return withdrawals_;
  }
  /**
   * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getWithdrawalsCount() {
    return withdrawals_.size();
  }
  /**
   * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quicksilver.interchainstaking.v1.WithdrawalRecord getWithdrawals(int index) {
    return withdrawals_.get(index);
  }
  /**
   * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder getWithdrawalsOrBuilder(
      int index) {
    return withdrawals_.get(index);
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
    for (int i = 0; i < withdrawals_.size(); i++) {
      output.writeMessage(1, withdrawals_.get(i));
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
    for (int i = 0; i < withdrawals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, withdrawals_.get(i));
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
    if (!(obj instanceof com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)) {
      return super.equals(obj);
    }
    com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse other = (com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse) obj;

    if (!getWithdrawalsList()
        .equals(other.getWithdrawalsList())) return false;
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
    if (getWithdrawalsCount() > 0) {
      hash = (37 * hash) + WITHDRAWALS_FIELD_NUMBER;
      hash = (53 * hash) + getWithdrawalsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse parseFrom(
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
  public static Builder newBuilder(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse prototype) {
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
   * Protobuf type {@code quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.class, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.Builder.class);
    }

    // Construct using com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.newBuilder()
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
      if (withdrawalsBuilder_ == null) {
        withdrawals_ = java.util.Collections.emptyList();
      } else {
        withdrawals_ = null;
        withdrawalsBuilder_.clear();
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
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse getDefaultInstanceForType() {
      return com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse build() {
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse buildPartial() {
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse result = new com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse result) {
      if (withdrawalsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          withdrawals_ = java.util.Collections.unmodifiableList(withdrawals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.withdrawals_ = withdrawals_;
      } else {
        result.withdrawals_ = withdrawalsBuilder_.build();
      }
    }

    private void buildPartial0(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse) {
        return mergeFrom((com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse other) {
      if (other == com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.getDefaultInstance()) return this;
      if (withdrawalsBuilder_ == null) {
        if (!other.withdrawals_.isEmpty()) {
          if (withdrawals_.isEmpty()) {
            withdrawals_ = other.withdrawals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWithdrawalsIsMutable();
            withdrawals_.addAll(other.withdrawals_);
          }
          onChanged();
        }
      } else {
        if (!other.withdrawals_.isEmpty()) {
          if (withdrawalsBuilder_.isEmpty()) {
            withdrawalsBuilder_.dispose();
            withdrawalsBuilder_ = null;
            withdrawals_ = other.withdrawals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            withdrawalsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWithdrawalsFieldBuilder() : null;
          } else {
            withdrawalsBuilder_.addAllMessages(other.withdrawals_);
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
              com.quicksilver.interchainstaking.v1.WithdrawalRecord m =
                  input.readMessage(
                      com.quicksilver.interchainstaking.v1.WithdrawalRecord.parser(),
                      extensionRegistry);
              if (withdrawalsBuilder_ == null) {
                ensureWithdrawalsIsMutable();
                withdrawals_.add(m);
              } else {
                withdrawalsBuilder_.addMessage(m);
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

    private java.util.List<com.quicksilver.interchainstaking.v1.WithdrawalRecord> withdrawals_ =
      java.util.Collections.emptyList();
    private void ensureWithdrawalsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        withdrawals_ = new java.util.ArrayList<com.quicksilver.interchainstaking.v1.WithdrawalRecord>(withdrawals_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quicksilver.interchainstaking.v1.WithdrawalRecord, com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder, com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder> withdrawalsBuilder_;

    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quicksilver.interchainstaking.v1.WithdrawalRecord> getWithdrawalsList() {
      if (withdrawalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(withdrawals_);
      } else {
        return withdrawalsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public int getWithdrawalsCount() {
      if (withdrawalsBuilder_ == null) {
        return withdrawals_.size();
      } else {
        return withdrawalsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.interchainstaking.v1.WithdrawalRecord getWithdrawals(int index) {
      if (withdrawalsBuilder_ == null) {
        return withdrawals_.get(index);
      } else {
        return withdrawalsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder setWithdrawals(
        int index, com.quicksilver.interchainstaking.v1.WithdrawalRecord value) {
      if (withdrawalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawalsIsMutable();
        withdrawals_.set(index, value);
        onChanged();
      } else {
        withdrawalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder setWithdrawals(
        int index, com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder builderForValue) {
      if (withdrawalsBuilder_ == null) {
        ensureWithdrawalsIsMutable();
        withdrawals_.set(index, builderForValue.build());
        onChanged();
      } else {
        withdrawalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawals(com.quicksilver.interchainstaking.v1.WithdrawalRecord value) {
      if (withdrawalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawalsIsMutable();
        withdrawals_.add(value);
        onChanged();
      } else {
        withdrawalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawals(
        int index, com.quicksilver.interchainstaking.v1.WithdrawalRecord value) {
      if (withdrawalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWithdrawalsIsMutable();
        withdrawals_.add(index, value);
        onChanged();
      } else {
        withdrawalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawals(
        com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder builderForValue) {
      if (withdrawalsBuilder_ == null) {
        ensureWithdrawalsIsMutable();
        withdrawals_.add(builderForValue.build());
        onChanged();
      } else {
        withdrawalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder addWithdrawals(
        int index, com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder builderForValue) {
      if (withdrawalsBuilder_ == null) {
        ensureWithdrawalsIsMutable();
        withdrawals_.add(index, builderForValue.build());
        onChanged();
      } else {
        withdrawalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllWithdrawals(
        java.lang.Iterable<? extends com.quicksilver.interchainstaking.v1.WithdrawalRecord> values) {
      if (withdrawalsBuilder_ == null) {
        ensureWithdrawalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, withdrawals_);
        onChanged();
      } else {
        withdrawalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearWithdrawals() {
      if (withdrawalsBuilder_ == null) {
        withdrawals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        withdrawalsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeWithdrawals(int index) {
      if (withdrawalsBuilder_ == null) {
        ensureWithdrawalsIsMutable();
        withdrawals_.remove(index);
        onChanged();
      } else {
        withdrawalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder getWithdrawalsBuilder(
        int index) {
      return getWithdrawalsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder getWithdrawalsOrBuilder(
        int index) {
      if (withdrawalsBuilder_ == null) {
        return withdrawals_.get(index);  } else {
        return withdrawalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder> 
         getWithdrawalsOrBuilderList() {
      if (withdrawalsBuilder_ != null) {
        return withdrawalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(withdrawals_);
      }
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder addWithdrawalsBuilder() {
      return getWithdrawalsFieldBuilder().addBuilder(
          com.quicksilver.interchainstaking.v1.WithdrawalRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder addWithdrawalsBuilder(
        int index) {
      return getWithdrawalsFieldBuilder().addBuilder(
          index, com.quicksilver.interchainstaking.v1.WithdrawalRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .quicksilver.interchainstaking.v1.WithdrawalRecord withdrawals = 1 [json_name = "withdrawals", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder> 
         getWithdrawalsBuilderList() {
      return getWithdrawalsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quicksilver.interchainstaking.v1.WithdrawalRecord, com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder, com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder> 
        getWithdrawalsFieldBuilder() {
      if (withdrawalsBuilder_ == null) {
        withdrawalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.quicksilver.interchainstaking.v1.WithdrawalRecord, com.quicksilver.interchainstaking.v1.WithdrawalRecord.Builder, com.quicksilver.interchainstaking.v1.WithdrawalRecordOrBuilder>(
                withdrawals_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        withdrawals_ = null;
      }
      return withdrawalsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse)
  private static final com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse();
  }

  public static com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWithdrawalRecordsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryWithdrawalRecordsResponse>() {
    @java.lang.Override
    public QueryWithdrawalRecordsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryWithdrawalRecordsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWithdrawalRecordsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

