// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/insurance/v1beta1/insurance.proto

package com.injective.insurance.v1beta1;

/**
 * Protobuf type {@code injective.insurance.v1beta1.EventInsuranceFundUpdate}
 */
public final class EventInsuranceFundUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.insurance.v1beta1.EventInsuranceFundUpdate)
    EventInsuranceFundUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventInsuranceFundUpdate.newBuilder() to construct.
  private EventInsuranceFundUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventInsuranceFundUpdate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventInsuranceFundUpdate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.insurance.v1beta1.InsuranceProto.internal_static_injective_insurance_v1beta1_EventInsuranceFundUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.insurance.v1beta1.InsuranceProto.internal_static_injective_insurance_v1beta1_EventInsuranceFundUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.insurance.v1beta1.EventInsuranceFundUpdate.class, com.injective.insurance.v1beta1.EventInsuranceFundUpdate.Builder.class);
  }

  public static final int FUND_FIELD_NUMBER = 1;
  private com.injective.insurance.v1beta1.InsuranceFund fund_;
  /**
   * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
   * @return Whether the fund field is set.
   */
  @java.lang.Override
  public boolean hasFund() {
    return fund_ != null;
  }
  /**
   * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
   * @return The fund.
   */
  @java.lang.Override
  public com.injective.insurance.v1beta1.InsuranceFund getFund() {
    return fund_ == null ? com.injective.insurance.v1beta1.InsuranceFund.getDefaultInstance() : fund_;
  }
  /**
   * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
   */
  @java.lang.Override
  public com.injective.insurance.v1beta1.InsuranceFundOrBuilder getFundOrBuilder() {
    return fund_ == null ? com.injective.insurance.v1beta1.InsuranceFund.getDefaultInstance() : fund_;
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
    if (fund_ != null) {
      output.writeMessage(1, getFund());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fund_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFund());
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
    if (!(obj instanceof com.injective.insurance.v1beta1.EventInsuranceFundUpdate)) {
      return super.equals(obj);
    }
    com.injective.insurance.v1beta1.EventInsuranceFundUpdate other = (com.injective.insurance.v1beta1.EventInsuranceFundUpdate) obj;

    if (hasFund() != other.hasFund()) return false;
    if (hasFund()) {
      if (!getFund()
          .equals(other.getFund())) return false;
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
    if (hasFund()) {
      hash = (37 * hash) + FUND_FIELD_NUMBER;
      hash = (53 * hash) + getFund().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate parseFrom(
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
  public static Builder newBuilder(com.injective.insurance.v1beta1.EventInsuranceFundUpdate prototype) {
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
   * Protobuf type {@code injective.insurance.v1beta1.EventInsuranceFundUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.insurance.v1beta1.EventInsuranceFundUpdate)
      com.injective.insurance.v1beta1.EventInsuranceFundUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.insurance.v1beta1.InsuranceProto.internal_static_injective_insurance_v1beta1_EventInsuranceFundUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.insurance.v1beta1.InsuranceProto.internal_static_injective_insurance_v1beta1_EventInsuranceFundUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.insurance.v1beta1.EventInsuranceFundUpdate.class, com.injective.insurance.v1beta1.EventInsuranceFundUpdate.Builder.class);
    }

    // Construct using com.injective.insurance.v1beta1.EventInsuranceFundUpdate.newBuilder()
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
      fund_ = null;
      if (fundBuilder_ != null) {
        fundBuilder_.dispose();
        fundBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.insurance.v1beta1.InsuranceProto.internal_static_injective_insurance_v1beta1_EventInsuranceFundUpdate_descriptor;
    }

    @java.lang.Override
    public com.injective.insurance.v1beta1.EventInsuranceFundUpdate getDefaultInstanceForType() {
      return com.injective.insurance.v1beta1.EventInsuranceFundUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.insurance.v1beta1.EventInsuranceFundUpdate build() {
      com.injective.insurance.v1beta1.EventInsuranceFundUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.insurance.v1beta1.EventInsuranceFundUpdate buildPartial() {
      com.injective.insurance.v1beta1.EventInsuranceFundUpdate result = new com.injective.insurance.v1beta1.EventInsuranceFundUpdate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.insurance.v1beta1.EventInsuranceFundUpdate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fund_ = fundBuilder_ == null
            ? fund_
            : fundBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.insurance.v1beta1.EventInsuranceFundUpdate) {
        return mergeFrom((com.injective.insurance.v1beta1.EventInsuranceFundUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.insurance.v1beta1.EventInsuranceFundUpdate other) {
      if (other == com.injective.insurance.v1beta1.EventInsuranceFundUpdate.getDefaultInstance()) return this;
      if (other.hasFund()) {
        mergeFund(other.getFund());
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
                  getFundFieldBuilder().getBuilder(),
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

    private com.injective.insurance.v1beta1.InsuranceFund fund_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.insurance.v1beta1.InsuranceFund, com.injective.insurance.v1beta1.InsuranceFund.Builder, com.injective.insurance.v1beta1.InsuranceFundOrBuilder> fundBuilder_;
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     * @return Whether the fund field is set.
     */
    public boolean hasFund() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     * @return The fund.
     */
    public com.injective.insurance.v1beta1.InsuranceFund getFund() {
      if (fundBuilder_ == null) {
        return fund_ == null ? com.injective.insurance.v1beta1.InsuranceFund.getDefaultInstance() : fund_;
      } else {
        return fundBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public Builder setFund(com.injective.insurance.v1beta1.InsuranceFund value) {
      if (fundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fund_ = value;
      } else {
        fundBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public Builder setFund(
        com.injective.insurance.v1beta1.InsuranceFund.Builder builderForValue) {
      if (fundBuilder_ == null) {
        fund_ = builderForValue.build();
      } else {
        fundBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public Builder mergeFund(com.injective.insurance.v1beta1.InsuranceFund value) {
      if (fundBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fund_ != null &&
          fund_ != com.injective.insurance.v1beta1.InsuranceFund.getDefaultInstance()) {
          getFundBuilder().mergeFrom(value);
        } else {
          fund_ = value;
        }
      } else {
        fundBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public Builder clearFund() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fund_ = null;
      if (fundBuilder_ != null) {
        fundBuilder_.dispose();
        fundBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public com.injective.insurance.v1beta1.InsuranceFund.Builder getFundBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFundFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    public com.injective.insurance.v1beta1.InsuranceFundOrBuilder getFundOrBuilder() {
      if (fundBuilder_ != null) {
        return fundBuilder_.getMessageOrBuilder();
      } else {
        return fund_ == null ?
            com.injective.insurance.v1beta1.InsuranceFund.getDefaultInstance() : fund_;
      }
    }
    /**
     * <code>.injective.insurance.v1beta1.InsuranceFund fund = 1 [json_name = "fund"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.insurance.v1beta1.InsuranceFund, com.injective.insurance.v1beta1.InsuranceFund.Builder, com.injective.insurance.v1beta1.InsuranceFundOrBuilder> 
        getFundFieldBuilder() {
      if (fundBuilder_ == null) {
        fundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.insurance.v1beta1.InsuranceFund, com.injective.insurance.v1beta1.InsuranceFund.Builder, com.injective.insurance.v1beta1.InsuranceFundOrBuilder>(
                getFund(),
                getParentForChildren(),
                isClean());
        fund_ = null;
      }
      return fundBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.insurance.v1beta1.EventInsuranceFundUpdate)
  }

  // @@protoc_insertion_point(class_scope:injective.insurance.v1beta1.EventInsuranceFundUpdate)
  private static final com.injective.insurance.v1beta1.EventInsuranceFundUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.insurance.v1beta1.EventInsuranceFundUpdate();
  }

  public static com.injective.insurance.v1beta1.EventInsuranceFundUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventInsuranceFundUpdate>
      PARSER = new com.google.protobuf.AbstractParser<EventInsuranceFundUpdate>() {
    @java.lang.Override
    public EventInsuranceFundUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventInsuranceFundUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventInsuranceFundUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.insurance.v1beta1.EventInsuranceFundUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

