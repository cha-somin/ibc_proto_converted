// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/oracle/v1alpha1/query.proto

package com.shentu.oracle.v1alpha1;

/**
 * Protobuf type {@code shentu.oracle.v1alpha1.QueryOperatorResponse}
 */
public final class QueryOperatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.oracle.v1alpha1.QueryOperatorResponse)
    QueryOperatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOperatorResponse.newBuilder() to construct.
  private QueryOperatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOperatorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOperatorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.oracle.v1alpha1.QueryProto.internal_static_shentu_oracle_v1alpha1_QueryOperatorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.oracle.v1alpha1.QueryProto.internal_static_shentu_oracle_v1alpha1_QueryOperatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.oracle.v1alpha1.QueryOperatorResponse.class, com.shentu.oracle.v1alpha1.QueryOperatorResponse.Builder.class);
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  private com.shentu.oracle.v1alpha1.Operator operator_;
  /**
   * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
   * @return Whether the operator field is set.
   */
  @java.lang.Override
  public boolean hasOperator() {
    return operator_ != null;
  }
  /**
   * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
   * @return The operator.
   */
  @java.lang.Override
  public com.shentu.oracle.v1alpha1.Operator getOperator() {
    return operator_ == null ? com.shentu.oracle.v1alpha1.Operator.getDefaultInstance() : operator_;
  }
  /**
   * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.shentu.oracle.v1alpha1.OperatorOrBuilder getOperatorOrBuilder() {
    return operator_ == null ? com.shentu.oracle.v1alpha1.Operator.getDefaultInstance() : operator_;
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
    if (operator_ != null) {
      output.writeMessage(1, getOperator());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperator());
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
    if (!(obj instanceof com.shentu.oracle.v1alpha1.QueryOperatorResponse)) {
      return super.equals(obj);
    }
    com.shentu.oracle.v1alpha1.QueryOperatorResponse other = (com.shentu.oracle.v1alpha1.QueryOperatorResponse) obj;

    if (hasOperator() != other.hasOperator()) return false;
    if (hasOperator()) {
      if (!getOperator()
          .equals(other.getOperator())) return false;
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
    if (hasOperator()) {
      hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
      hash = (53 * hash) + getOperator().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse parseFrom(
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
  public static Builder newBuilder(com.shentu.oracle.v1alpha1.QueryOperatorResponse prototype) {
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
   * Protobuf type {@code shentu.oracle.v1alpha1.QueryOperatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.oracle.v1alpha1.QueryOperatorResponse)
      com.shentu.oracle.v1alpha1.QueryOperatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.oracle.v1alpha1.QueryProto.internal_static_shentu_oracle_v1alpha1_QueryOperatorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.oracle.v1alpha1.QueryProto.internal_static_shentu_oracle_v1alpha1_QueryOperatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.oracle.v1alpha1.QueryOperatorResponse.class, com.shentu.oracle.v1alpha1.QueryOperatorResponse.Builder.class);
    }

    // Construct using com.shentu.oracle.v1alpha1.QueryOperatorResponse.newBuilder()
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
      operator_ = null;
      if (operatorBuilder_ != null) {
        operatorBuilder_.dispose();
        operatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.oracle.v1alpha1.QueryProto.internal_static_shentu_oracle_v1alpha1_QueryOperatorResponse_descriptor;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.QueryOperatorResponse getDefaultInstanceForType() {
      return com.shentu.oracle.v1alpha1.QueryOperatorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.QueryOperatorResponse build() {
      com.shentu.oracle.v1alpha1.QueryOperatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.QueryOperatorResponse buildPartial() {
      com.shentu.oracle.v1alpha1.QueryOperatorResponse result = new com.shentu.oracle.v1alpha1.QueryOperatorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.oracle.v1alpha1.QueryOperatorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operator_ = operatorBuilder_ == null
            ? operator_
            : operatorBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.oracle.v1alpha1.QueryOperatorResponse) {
        return mergeFrom((com.shentu.oracle.v1alpha1.QueryOperatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.oracle.v1alpha1.QueryOperatorResponse other) {
      if (other == com.shentu.oracle.v1alpha1.QueryOperatorResponse.getDefaultInstance()) return this;
      if (other.hasOperator()) {
        mergeOperator(other.getOperator());
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
                  getOperatorFieldBuilder().getBuilder(),
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

    private com.shentu.oracle.v1alpha1.Operator operator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.shentu.oracle.v1alpha1.Operator, com.shentu.oracle.v1alpha1.Operator.Builder, com.shentu.oracle.v1alpha1.OperatorOrBuilder> operatorBuilder_;
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     * @return Whether the operator field is set.
     */
    public boolean hasOperator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     * @return The operator.
     */
    public com.shentu.oracle.v1alpha1.Operator getOperator() {
      if (operatorBuilder_ == null) {
        return operator_ == null ? com.shentu.oracle.v1alpha1.Operator.getDefaultInstance() : operator_;
      } else {
        return operatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOperator(com.shentu.oracle.v1alpha1.Operator value) {
      if (operatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operator_ = value;
      } else {
        operatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOperator(
        com.shentu.oracle.v1alpha1.Operator.Builder builderForValue) {
      if (operatorBuilder_ == null) {
        operator_ = builderForValue.build();
      } else {
        operatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeOperator(com.shentu.oracle.v1alpha1.Operator value) {
      if (operatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          operator_ != null &&
          operator_ != com.shentu.oracle.v1alpha1.Operator.getDefaultInstance()) {
          getOperatorBuilder().mergeFrom(value);
        } else {
          operator_ = value;
        }
      } else {
        operatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operator_ = null;
      if (operatorBuilder_ != null) {
        operatorBuilder_.dispose();
        operatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public com.shentu.oracle.v1alpha1.Operator.Builder getOperatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOperatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    public com.shentu.oracle.v1alpha1.OperatorOrBuilder getOperatorOrBuilder() {
      if (operatorBuilder_ != null) {
        return operatorBuilder_.getMessageOrBuilder();
      } else {
        return operator_ == null ?
            com.shentu.oracle.v1alpha1.Operator.getDefaultInstance() : operator_;
      }
    }
    /**
     * <code>.shentu.oracle.v1alpha1.Operator operator = 1 [json_name = "operator", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.shentu.oracle.v1alpha1.Operator, com.shentu.oracle.v1alpha1.Operator.Builder, com.shentu.oracle.v1alpha1.OperatorOrBuilder> 
        getOperatorFieldBuilder() {
      if (operatorBuilder_ == null) {
        operatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.shentu.oracle.v1alpha1.Operator, com.shentu.oracle.v1alpha1.Operator.Builder, com.shentu.oracle.v1alpha1.OperatorOrBuilder>(
                getOperator(),
                getParentForChildren(),
                isClean());
        operator_ = null;
      }
      return operatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:shentu.oracle.v1alpha1.QueryOperatorResponse)
  }

  // @@protoc_insertion_point(class_scope:shentu.oracle.v1alpha1.QueryOperatorResponse)
  private static final com.shentu.oracle.v1alpha1.QueryOperatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.oracle.v1alpha1.QueryOperatorResponse();
  }

  public static com.shentu.oracle.v1alpha1.QueryOperatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOperatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryOperatorResponse>() {
    @java.lang.Override
    public QueryOperatorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryOperatorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOperatorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.oracle.v1alpha1.QueryOperatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

