// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/service.proto

package com.irismod.service;

/**
 * <pre>
 * PromotionByTime defines a standard for service promotion by time
 * </pre>
 *
 * Protobuf type {@code irismod.service.PromotionByTime}
 */
public final class PromotionByTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.service.PromotionByTime)
    PromotionByTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromotionByTime.newBuilder() to construct.
  private PromotionByTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromotionByTime() {
    discount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromotionByTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.service.ServiceProto.internal_static_irismod_service_PromotionByTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.service.ServiceProto.internal_static_irismod_service_PromotionByTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.service.PromotionByTime.class, com.irismod.service.PromotionByTime.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endTime_;
  /**
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }

  public static final int DISCOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object discount_ = "";
  /**
   * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The discount.
   */
  @java.lang.Override
  public java.lang.String getDiscount() {
    java.lang.Object ref = discount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      discount_ = s;
      return s;
    }
  }
  /**
   * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for discount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiscountBytes() {
    java.lang.Object ref = discount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      discount_ = b;
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
    if (startTime_ != null) {
      output.writeMessage(1, getStartTime());
    }
    if (endTime_ != null) {
      output.writeMessage(2, getEndTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(discount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, discount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(discount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, discount_);
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
    if (!(obj instanceof com.irismod.service.PromotionByTime)) {
      return super.equals(obj);
    }
    com.irismod.service.PromotionByTime other = (com.irismod.service.PromotionByTime) obj;

    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime()
          .equals(other.getEndTime())) return false;
    }
    if (!getDiscount()
        .equals(other.getDiscount())) return false;
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
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (37 * hash) + DISCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDiscount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.service.PromotionByTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.PromotionByTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.PromotionByTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.service.PromotionByTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.service.PromotionByTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.PromotionByTime parseFrom(
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
  public static Builder newBuilder(com.irismod.service.PromotionByTime prototype) {
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
   * PromotionByTime defines a standard for service promotion by time
   * </pre>
   *
   * Protobuf type {@code irismod.service.PromotionByTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.service.PromotionByTime)
      com.irismod.service.PromotionByTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_PromotionByTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_PromotionByTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.service.PromotionByTime.class, com.irismod.service.PromotionByTime.Builder.class);
    }

    // Construct using com.irismod.service.PromotionByTime.newBuilder()
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
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      discount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_PromotionByTime_descriptor;
    }

    @java.lang.Override
    public com.irismod.service.PromotionByTime getDefaultInstanceForType() {
      return com.irismod.service.PromotionByTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.service.PromotionByTime build() {
      com.irismod.service.PromotionByTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.service.PromotionByTime buildPartial() {
      com.irismod.service.PromotionByTime result = new com.irismod.service.PromotionByTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.service.PromotionByTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startTime_ = startTimeBuilder_ == null
            ? startTime_
            : startTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endTime_ = endTimeBuilder_ == null
            ? endTime_
            : endTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.discount_ = discount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.service.PromotionByTime) {
        return mergeFrom((com.irismod.service.PromotionByTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.service.PromotionByTime other) {
      if (other == com.irismod.service.PromotionByTime.getDefaultInstance()) return this;
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (!other.getDiscount().isEmpty()) {
        discount_ = other.discount_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              input.readMessage(
                  getStartTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              discount_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startTime_ != null &&
          startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
      } else {
        endTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endTime_ != null &&
          endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndTime(),
                getParentForChildren(),
                isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private java.lang.Object discount_ = "";
    /**
     * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The discount.
     */
    public java.lang.String getDiscount() {
      java.lang.Object ref = discount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        discount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for discount.
     */
    public com.google.protobuf.ByteString
        getDiscountBytes() {
      java.lang.Object ref = discount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        discount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The discount to set.
     * @return This builder for chaining.
     */
    public Builder setDiscount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      discount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiscount() {
      discount_ = getDefaultInstance().getDiscount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string discount = 3 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for discount to set.
     * @return This builder for chaining.
     */
    public Builder setDiscountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      discount_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:irismod.service.PromotionByTime)
  }

  // @@protoc_insertion_point(class_scope:irismod.service.PromotionByTime)
  private static final com.irismod.service.PromotionByTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.service.PromotionByTime();
  }

  public static com.irismod.service.PromotionByTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromotionByTime>
      PARSER = new com.google.protobuf.AbstractParser<PromotionByTime>() {
    @java.lang.Override
    public PromotionByTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<PromotionByTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromotionByTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.service.PromotionByTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

