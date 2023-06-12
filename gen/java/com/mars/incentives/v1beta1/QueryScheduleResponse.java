// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/incentives/v1beta1/query.proto

package com.mars.incentives.v1beta1;

/**
 * <pre>
 * QueryScheduleResponse is the response type for the Query/Schedule RPC method
 * </pre>
 *
 * Protobuf type {@code mars.incentives.v1beta1.QueryScheduleResponse}
 */
public final class QueryScheduleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mars.incentives.v1beta1.QueryScheduleResponse)
    QueryScheduleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryScheduleResponse.newBuilder() to construct.
  private QueryScheduleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryScheduleResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryScheduleResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mars.incentives.v1beta1.QueryProto.internal_static_mars_incentives_v1beta1_QueryScheduleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mars.incentives.v1beta1.QueryProto.internal_static_mars_incentives_v1beta1_QueryScheduleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mars.incentives.v1beta1.QueryScheduleResponse.class, com.mars.incentives.v1beta1.QueryScheduleResponse.Builder.class);
  }

  public static final int SCHEDULE_FIELD_NUMBER = 1;
  private com.mars.incentives.v1beta1.Schedule schedule_;
  /**
   * <pre>
   * Schedule is the parameters of the incentives schedule
   * </pre>
   *
   * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
   * @return Whether the schedule field is set.
   */
  @java.lang.Override
  public boolean hasSchedule() {
    return schedule_ != null;
  }
  /**
   * <pre>
   * Schedule is the parameters of the incentives schedule
   * </pre>
   *
   * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
   * @return The schedule.
   */
  @java.lang.Override
  public com.mars.incentives.v1beta1.Schedule getSchedule() {
    return schedule_ == null ? com.mars.incentives.v1beta1.Schedule.getDefaultInstance() : schedule_;
  }
  /**
   * <pre>
   * Schedule is the parameters of the incentives schedule
   * </pre>
   *
   * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.mars.incentives.v1beta1.ScheduleOrBuilder getScheduleOrBuilder() {
    return schedule_ == null ? com.mars.incentives.v1beta1.Schedule.getDefaultInstance() : schedule_;
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
    if (schedule_ != null) {
      output.writeMessage(1, getSchedule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schedule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSchedule());
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
    if (!(obj instanceof com.mars.incentives.v1beta1.QueryScheduleResponse)) {
      return super.equals(obj);
    }
    com.mars.incentives.v1beta1.QueryScheduleResponse other = (com.mars.incentives.v1beta1.QueryScheduleResponse) obj;

    if (hasSchedule() != other.hasSchedule()) return false;
    if (hasSchedule()) {
      if (!getSchedule()
          .equals(other.getSchedule())) return false;
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
    if (hasSchedule()) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getSchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mars.incentives.v1beta1.QueryScheduleResponse parseFrom(
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
  public static Builder newBuilder(com.mars.incentives.v1beta1.QueryScheduleResponse prototype) {
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
   * QueryScheduleResponse is the response type for the Query/Schedule RPC method
   * </pre>
   *
   * Protobuf type {@code mars.incentives.v1beta1.QueryScheduleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mars.incentives.v1beta1.QueryScheduleResponse)
      com.mars.incentives.v1beta1.QueryScheduleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mars.incentives.v1beta1.QueryProto.internal_static_mars_incentives_v1beta1_QueryScheduleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mars.incentives.v1beta1.QueryProto.internal_static_mars_incentives_v1beta1_QueryScheduleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mars.incentives.v1beta1.QueryScheduleResponse.class, com.mars.incentives.v1beta1.QueryScheduleResponse.Builder.class);
    }

    // Construct using com.mars.incentives.v1beta1.QueryScheduleResponse.newBuilder()
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
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mars.incentives.v1beta1.QueryProto.internal_static_mars_incentives_v1beta1_QueryScheduleResponse_descriptor;
    }

    @java.lang.Override
    public com.mars.incentives.v1beta1.QueryScheduleResponse getDefaultInstanceForType() {
      return com.mars.incentives.v1beta1.QueryScheduleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.mars.incentives.v1beta1.QueryScheduleResponse build() {
      com.mars.incentives.v1beta1.QueryScheduleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mars.incentives.v1beta1.QueryScheduleResponse buildPartial() {
      com.mars.incentives.v1beta1.QueryScheduleResponse result = new com.mars.incentives.v1beta1.QueryScheduleResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.mars.incentives.v1beta1.QueryScheduleResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schedule_ = scheduleBuilder_ == null
            ? schedule_
            : scheduleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mars.incentives.v1beta1.QueryScheduleResponse) {
        return mergeFrom((com.mars.incentives.v1beta1.QueryScheduleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mars.incentives.v1beta1.QueryScheduleResponse other) {
      if (other == com.mars.incentives.v1beta1.QueryScheduleResponse.getDefaultInstance()) return this;
      if (other.hasSchedule()) {
        mergeSchedule(other.getSchedule());
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
                  getScheduleFieldBuilder().getBuilder(),
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

    private com.mars.incentives.v1beta1.Schedule schedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.incentives.v1beta1.Schedule, com.mars.incentives.v1beta1.Schedule.Builder, com.mars.incentives.v1beta1.ScheduleOrBuilder> scheduleBuilder_;
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     * @return Whether the schedule field is set.
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     * @return The schedule.
     */
    public com.mars.incentives.v1beta1.Schedule getSchedule() {
      if (scheduleBuilder_ == null) {
        return schedule_ == null ? com.mars.incentives.v1beta1.Schedule.getDefaultInstance() : schedule_;
      } else {
        return scheduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSchedule(com.mars.incentives.v1beta1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedule_ = value;
      } else {
        scheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSchedule(
        com.mars.incentives.v1beta1.Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        schedule_ = builderForValue.build();
      } else {
        scheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeSchedule(com.mars.incentives.v1beta1.Schedule value) {
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          schedule_ != null &&
          schedule_ != com.mars.incentives.v1beta1.Schedule.getDefaultInstance()) {
          getScheduleBuilder().mergeFrom(value);
        } else {
          schedule_ = value;
        }
      } else {
        scheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearSchedule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public com.mars.incentives.v1beta1.Schedule.Builder getScheduleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScheduleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    public com.mars.incentives.v1beta1.ScheduleOrBuilder getScheduleOrBuilder() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilder();
      } else {
        return schedule_ == null ?
            com.mars.incentives.v1beta1.Schedule.getDefaultInstance() : schedule_;
      }
    }
    /**
     * <pre>
     * Schedule is the parameters of the incentives schedule
     * </pre>
     *
     * <code>.mars.incentives.v1beta1.Schedule schedule = 1 [json_name = "schedule", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.incentives.v1beta1.Schedule, com.mars.incentives.v1beta1.Schedule.Builder, com.mars.incentives.v1beta1.ScheduleOrBuilder> 
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mars.incentives.v1beta1.Schedule, com.mars.incentives.v1beta1.Schedule.Builder, com.mars.incentives.v1beta1.ScheduleOrBuilder>(
                getSchedule(),
                getParentForChildren(),
                isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mars.incentives.v1beta1.QueryScheduleResponse)
  }

  // @@protoc_insertion_point(class_scope:mars.incentives.v1beta1.QueryScheduleResponse)
  private static final com.mars.incentives.v1beta1.QueryScheduleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mars.incentives.v1beta1.QueryScheduleResponse();
  }

  public static com.mars.incentives.v1beta1.QueryScheduleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryScheduleResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryScheduleResponse>() {
    @java.lang.Override
    public QueryScheduleResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryScheduleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryScheduleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mars.incentives.v1beta1.QueryScheduleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

