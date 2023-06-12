// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datapool/v2alpha1/query.proto

package com.panacea.datapool.v2alpha1;

/**
 * <pre>
 * QueryDataPassRedeemHistoryResponse is the response type for the Query/DataPassRedeemHistory RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse}
 */
public final class QueryDataPassRedeemHistoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)
    QueryDataPassRedeemHistoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDataPassRedeemHistoryResponse.newBuilder() to construct.
  private QueryDataPassRedeemHistoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDataPassRedeemHistoryResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDataPassRedeemHistoryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.datapool.v2alpha1.QueryProto.internal_static_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.datapool.v2alpha1.QueryProto.internal_static_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.class, com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.Builder.class);
  }

  public static final int DATA_PASS_REDEEM_HISTORIES_FIELD_NUMBER = 1;
  private com.panacea.datapool.v2alpha1.DataPassRedeemHistory dataPassRedeemHistories_;
  /**
   * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
   * @return Whether the dataPassRedeemHistories field is set.
   */
  @java.lang.Override
  public boolean hasDataPassRedeemHistories() {
    return dataPassRedeemHistories_ != null;
  }
  /**
   * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
   * @return The dataPassRedeemHistories.
   */
  @java.lang.Override
  public com.panacea.datapool.v2alpha1.DataPassRedeemHistory getDataPassRedeemHistories() {
    return dataPassRedeemHistories_ == null ? com.panacea.datapool.v2alpha1.DataPassRedeemHistory.getDefaultInstance() : dataPassRedeemHistories_;
  }
  /**
   * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.panacea.datapool.v2alpha1.DataPassRedeemHistoryOrBuilder getDataPassRedeemHistoriesOrBuilder() {
    return dataPassRedeemHistories_ == null ? com.panacea.datapool.v2alpha1.DataPassRedeemHistory.getDefaultInstance() : dataPassRedeemHistories_;
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
    if (dataPassRedeemHistories_ != null) {
      output.writeMessage(1, getDataPassRedeemHistories());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataPassRedeemHistories_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataPassRedeemHistories());
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
    if (!(obj instanceof com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)) {
      return super.equals(obj);
    }
    com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse other = (com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse) obj;

    if (hasDataPassRedeemHistories() != other.hasDataPassRedeemHistories()) return false;
    if (hasDataPassRedeemHistories()) {
      if (!getDataPassRedeemHistories()
          .equals(other.getDataPassRedeemHistories())) return false;
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
    if (hasDataPassRedeemHistories()) {
      hash = (37 * hash) + DATA_PASS_REDEEM_HISTORIES_FIELD_NUMBER;
      hash = (53 * hash) + getDataPassRedeemHistories().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse parseFrom(
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
  public static Builder newBuilder(com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse prototype) {
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
   * QueryDataPassRedeemHistoryResponse is the response type for the Query/DataPassRedeemHistory RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)
      com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.datapool.v2alpha1.QueryProto.internal_static_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.datapool.v2alpha1.QueryProto.internal_static_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.class, com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.Builder.class);
    }

    // Construct using com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.newBuilder()
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
      dataPassRedeemHistories_ = null;
      if (dataPassRedeemHistoriesBuilder_ != null) {
        dataPassRedeemHistoriesBuilder_.dispose();
        dataPassRedeemHistoriesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.datapool.v2alpha1.QueryProto.internal_static_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse_descriptor;
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse getDefaultInstanceForType() {
      return com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse build() {
      com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse buildPartial() {
      com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse result = new com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataPassRedeemHistories_ = dataPassRedeemHistoriesBuilder_ == null
            ? dataPassRedeemHistories_
            : dataPassRedeemHistoriesBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse) {
        return mergeFrom((com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse other) {
      if (other == com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse.getDefaultInstance()) return this;
      if (other.hasDataPassRedeemHistories()) {
        mergeDataPassRedeemHistories(other.getDataPassRedeemHistories());
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
                  getDataPassRedeemHistoriesFieldBuilder().getBuilder(),
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

    private com.panacea.datapool.v2alpha1.DataPassRedeemHistory dataPassRedeemHistories_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.datapool.v2alpha1.DataPassRedeemHistory, com.panacea.datapool.v2alpha1.DataPassRedeemHistory.Builder, com.panacea.datapool.v2alpha1.DataPassRedeemHistoryOrBuilder> dataPassRedeemHistoriesBuilder_;
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     * @return Whether the dataPassRedeemHistories field is set.
     */
    public boolean hasDataPassRedeemHistories() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     * @return The dataPassRedeemHistories.
     */
    public com.panacea.datapool.v2alpha1.DataPassRedeemHistory getDataPassRedeemHistories() {
      if (dataPassRedeemHistoriesBuilder_ == null) {
        return dataPassRedeemHistories_ == null ? com.panacea.datapool.v2alpha1.DataPassRedeemHistory.getDefaultInstance() : dataPassRedeemHistories_;
      } else {
        return dataPassRedeemHistoriesBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDataPassRedeemHistories(com.panacea.datapool.v2alpha1.DataPassRedeemHistory value) {
      if (dataPassRedeemHistoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataPassRedeemHistories_ = value;
      } else {
        dataPassRedeemHistoriesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDataPassRedeemHistories(
        com.panacea.datapool.v2alpha1.DataPassRedeemHistory.Builder builderForValue) {
      if (dataPassRedeemHistoriesBuilder_ == null) {
        dataPassRedeemHistories_ = builderForValue.build();
      } else {
        dataPassRedeemHistoriesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDataPassRedeemHistories(com.panacea.datapool.v2alpha1.DataPassRedeemHistory value) {
      if (dataPassRedeemHistoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dataPassRedeemHistories_ != null &&
          dataPassRedeemHistories_ != com.panacea.datapool.v2alpha1.DataPassRedeemHistory.getDefaultInstance()) {
          getDataPassRedeemHistoriesBuilder().mergeFrom(value);
        } else {
          dataPassRedeemHistories_ = value;
        }
      } else {
        dataPassRedeemHistoriesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearDataPassRedeemHistories() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataPassRedeemHistories_ = null;
      if (dataPassRedeemHistoriesBuilder_ != null) {
        dataPassRedeemHistoriesBuilder_.dispose();
        dataPassRedeemHistoriesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public com.panacea.datapool.v2alpha1.DataPassRedeemHistory.Builder getDataPassRedeemHistoriesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataPassRedeemHistoriesFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    public com.panacea.datapool.v2alpha1.DataPassRedeemHistoryOrBuilder getDataPassRedeemHistoriesOrBuilder() {
      if (dataPassRedeemHistoriesBuilder_ != null) {
        return dataPassRedeemHistoriesBuilder_.getMessageOrBuilder();
      } else {
        return dataPassRedeemHistories_ == null ?
            com.panacea.datapool.v2alpha1.DataPassRedeemHistory.getDefaultInstance() : dataPassRedeemHistories_;
      }
    }
    /**
     * <code>.panacea.datapool.v2alpha1.DataPassRedeemHistory data_pass_redeem_histories = 1 [json_name = "dataPassRedeemHistories", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.datapool.v2alpha1.DataPassRedeemHistory, com.panacea.datapool.v2alpha1.DataPassRedeemHistory.Builder, com.panacea.datapool.v2alpha1.DataPassRedeemHistoryOrBuilder> 
        getDataPassRedeemHistoriesFieldBuilder() {
      if (dataPassRedeemHistoriesBuilder_ == null) {
        dataPassRedeemHistoriesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.panacea.datapool.v2alpha1.DataPassRedeemHistory, com.panacea.datapool.v2alpha1.DataPassRedeemHistory.Builder, com.panacea.datapool.v2alpha1.DataPassRedeemHistoryOrBuilder>(
                getDataPassRedeemHistories(),
                getParentForChildren(),
                isClean());
        dataPassRedeemHistories_ = null;
      }
      return dataPassRedeemHistoriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse)
  private static final com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse();
  }

  public static com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDataPassRedeemHistoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDataPassRedeemHistoryResponse>() {
    @java.lang.Override
    public QueryDataPassRedeemHistoryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDataPassRedeemHistoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDataPassRedeemHistoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

