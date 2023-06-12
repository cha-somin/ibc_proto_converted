// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/query.proto

package com.oracle.v1;

/**
 * <pre>
 * QueryIsReporterRequest is request type for the Query/Reporter RPC method.
 * </pre>
 *
 * Protobuf type {@code oracle.v1.QueryIsReporterRequest}
 */
public final class QueryIsReporterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:oracle.v1.QueryIsReporterRequest)
    QueryIsReporterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryIsReporterRequest.newBuilder() to construct.
  private QueryIsReporterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryIsReporterRequest() {
    validatorAddress_ = "";
    reporterAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryIsReporterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oracle.v1.QueryIsReporterRequest.class, com.oracle.v1.QueryIsReporterRequest.Builder.class);
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validatorAddress_ = "";
  /**
   * <pre>
   * ValidatorAddress is a validator address
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ValidatorAddress is a validator address
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The bytes for validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTER_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reporterAddress_ = "";
  /**
   * <pre>
   * ReporterAddress is a candidate account
   * </pre>
   *
   * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
   * @return The reporterAddress.
   */
  @java.lang.Override
  public java.lang.String getReporterAddress() {
    java.lang.Object ref = reporterAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reporterAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ReporterAddress is a candidate account
   * </pre>
   *
   * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
   * @return The bytes for reporterAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReporterAddressBytes() {
    java.lang.Object ref = reporterAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reporterAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reporterAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reporterAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reporterAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reporterAddress_);
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
    if (!(obj instanceof com.oracle.v1.QueryIsReporterRequest)) {
      return super.equals(obj);
    }
    com.oracle.v1.QueryIsReporterRequest other = (com.oracle.v1.QueryIsReporterRequest) obj;

    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (!getReporterAddress()
        .equals(other.getReporterAddress())) return false;
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
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (37 * hash) + REPORTER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getReporterAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.oracle.v1.QueryIsReporterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.oracle.v1.QueryIsReporterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryIsReporterRequest parseFrom(
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
  public static Builder newBuilder(com.oracle.v1.QueryIsReporterRequest prototype) {
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
   * QueryIsReporterRequest is request type for the Query/Reporter RPC method.
   * </pre>
   *
   * Protobuf type {@code oracle.v1.QueryIsReporterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:oracle.v1.QueryIsReporterRequest)
      com.oracle.v1.QueryIsReporterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oracle.v1.QueryIsReporterRequest.class, com.oracle.v1.QueryIsReporterRequest.Builder.class);
    }

    // Construct using com.oracle.v1.QueryIsReporterRequest.newBuilder()
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
      validatorAddress_ = "";
      reporterAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterRequest_descriptor;
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterRequest getDefaultInstanceForType() {
      return com.oracle.v1.QueryIsReporterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterRequest build() {
      com.oracle.v1.QueryIsReporterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterRequest buildPartial() {
      com.oracle.v1.QueryIsReporterRequest result = new com.oracle.v1.QueryIsReporterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.oracle.v1.QueryIsReporterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validatorAddress_ = validatorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reporterAddress_ = reporterAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.oracle.v1.QueryIsReporterRequest) {
        return mergeFrom((com.oracle.v1.QueryIsReporterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oracle.v1.QueryIsReporterRequest other) {
      if (other == com.oracle.v1.QueryIsReporterRequest.getDefaultInstance()) return this;
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getReporterAddress().isEmpty()) {
        reporterAddress_ = other.reporterAddress_;
        bitField0_ |= 0x00000002;
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
              validatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              reporterAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object validatorAddress_ = "";
    /**
     * <pre>
     * ValidatorAddress is a validator address
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The validatorAddress.
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ValidatorAddress is a validator address
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ValidatorAddress is a validator address
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ValidatorAddress is a validator address
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ValidatorAddress is a validator address
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object reporterAddress_ = "";
    /**
     * <pre>
     * ReporterAddress is a candidate account
     * </pre>
     *
     * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
     * @return The reporterAddress.
     */
    public java.lang.String getReporterAddress() {
      java.lang.Object ref = reporterAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reporterAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ReporterAddress is a candidate account
     * </pre>
     *
     * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
     * @return The bytes for reporterAddress.
     */
    public com.google.protobuf.ByteString
        getReporterAddressBytes() {
      java.lang.Object ref = reporterAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reporterAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ReporterAddress is a candidate account
     * </pre>
     *
     * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
     * @param value The reporterAddress to set.
     * @return This builder for chaining.
     */
    public Builder setReporterAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reporterAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ReporterAddress is a candidate account
     * </pre>
     *
     * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReporterAddress() {
      reporterAddress_ = getDefaultInstance().getReporterAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ReporterAddress is a candidate account
     * </pre>
     *
     * <code>string reporter_address = 2 [json_name = "reporterAddress"];</code>
     * @param value The bytes for reporterAddress to set.
     * @return This builder for chaining.
     */
    public Builder setReporterAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reporterAddress_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:oracle.v1.QueryIsReporterRequest)
  }

  // @@protoc_insertion_point(class_scope:oracle.v1.QueryIsReporterRequest)
  private static final com.oracle.v1.QueryIsReporterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oracle.v1.QueryIsReporterRequest();
  }

  public static com.oracle.v1.QueryIsReporterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryIsReporterRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryIsReporterRequest>() {
    @java.lang.Override
    public QueryIsReporterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryIsReporterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryIsReporterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oracle.v1.QueryIsReporterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

