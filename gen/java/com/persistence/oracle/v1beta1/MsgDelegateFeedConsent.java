// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persistence/oracle/v1beta1/tx.proto

package com.persistence.oracle.v1beta1;

/**
 * <pre>
 * MsgDelegateFeedConsent represents a message to delegate oracle voting rights
 * to another address.
 * </pre>
 *
 * Protobuf type {@code persistence.oracle.v1beta1.MsgDelegateFeedConsent}
 */
public final class MsgDelegateFeedConsent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:persistence.oracle.v1beta1.MsgDelegateFeedConsent)
    MsgDelegateFeedConsentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDelegateFeedConsent.newBuilder() to construct.
  private MsgDelegateFeedConsent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDelegateFeedConsent() {
    operator_ = "";
    delegate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDelegateFeedConsent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.persistence.oracle.v1beta1.TxProto.internal_static_persistence_oracle_v1beta1_MsgDelegateFeedConsent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.persistence.oracle.v1beta1.TxProto.internal_static_persistence_oracle_v1beta1_MsgDelegateFeedConsent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.class, com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.Builder.class);
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object operator_ = "";
  /**
   * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The operator.
   */
  @java.lang.Override
  public java.lang.String getOperator() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operator_ = s;
      return s;
    }
  }
  /**
   * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for operator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOperatorBytes() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELEGATE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegate_ = "";
  /**
   * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegate.
   */
  @java.lang.Override
  public java.lang.String getDelegate() {
    java.lang.Object ref = delegate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegate_ = s;
      return s;
    }
  }
  /**
   * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegateBytes() {
    java.lang.Object ref = delegate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegate_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, delegate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, delegate_);
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
    if (!(obj instanceof com.persistence.oracle.v1beta1.MsgDelegateFeedConsent)) {
      return super.equals(obj);
    }
    com.persistence.oracle.v1beta1.MsgDelegateFeedConsent other = (com.persistence.oracle.v1beta1.MsgDelegateFeedConsent) obj;

    if (!getOperator()
        .equals(other.getOperator())) return false;
    if (!getDelegate()
        .equals(other.getDelegate())) return false;
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getOperator().hashCode();
    hash = (37 * hash) + DELEGATE_FIELD_NUMBER;
    hash = (53 * hash) + getDelegate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent parseFrom(
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
  public static Builder newBuilder(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent prototype) {
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
   * MsgDelegateFeedConsent represents a message to delegate oracle voting rights
   * to another address.
   * </pre>
   *
   * Protobuf type {@code persistence.oracle.v1beta1.MsgDelegateFeedConsent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:persistence.oracle.v1beta1.MsgDelegateFeedConsent)
      com.persistence.oracle.v1beta1.MsgDelegateFeedConsentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.persistence.oracle.v1beta1.TxProto.internal_static_persistence_oracle_v1beta1_MsgDelegateFeedConsent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.persistence.oracle.v1beta1.TxProto.internal_static_persistence_oracle_v1beta1_MsgDelegateFeedConsent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.class, com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.Builder.class);
    }

    // Construct using com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.newBuilder()
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
      operator_ = "";
      delegate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.persistence.oracle.v1beta1.TxProto.internal_static_persistence_oracle_v1beta1_MsgDelegateFeedConsent_descriptor;
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.MsgDelegateFeedConsent getDefaultInstanceForType() {
      return com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.getDefaultInstance();
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.MsgDelegateFeedConsent build() {
      com.persistence.oracle.v1beta1.MsgDelegateFeedConsent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.persistence.oracle.v1beta1.MsgDelegateFeedConsent buildPartial() {
      com.persistence.oracle.v1beta1.MsgDelegateFeedConsent result = new com.persistence.oracle.v1beta1.MsgDelegateFeedConsent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operator_ = operator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.delegate_ = delegate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.persistence.oracle.v1beta1.MsgDelegateFeedConsent) {
        return mergeFrom((com.persistence.oracle.v1beta1.MsgDelegateFeedConsent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent other) {
      if (other == com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.getDefaultInstance()) return this;
      if (!other.getOperator().isEmpty()) {
        operator_ = other.operator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDelegate().isEmpty()) {
        delegate_ = other.delegate_;
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
              operator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              delegate_ = input.readStringRequireUtf8();
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

    private java.lang.Object operator_ = "";
    /**
     * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The operator.
     */
    public java.lang.String getOperator() {
      java.lang.Object ref = operator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for operator.
     */
    public com.google.protobuf.ByteString
        getOperatorBytes() {
      java.lang.Object ref = operator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      operator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      operator_ = getDefaultInstance().getOperator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string operator = 1 [json_name = "operator", (.gogoproto.moretags) = "yaml:&#92;"operator&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      operator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object delegate_ = "";
    /**
     * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The delegate.
     */
    public java.lang.String getDelegate() {
      java.lang.Object ref = delegate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for delegate.
     */
    public com.google.protobuf.ByteString
        getDelegateBytes() {
      java.lang.Object ref = delegate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The delegate to set.
     * @return This builder for chaining.
     */
    public Builder setDelegate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegate() {
      delegate_ = getDefaultInstance().getDelegate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string delegate = 2 [json_name = "delegate", (.gogoproto.moretags) = "yaml:&#92;"delegate&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for delegate to set.
     * @return This builder for chaining.
     */
    public Builder setDelegateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegate_ = value;
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


    // @@protoc_insertion_point(builder_scope:persistence.oracle.v1beta1.MsgDelegateFeedConsent)
  }

  // @@protoc_insertion_point(class_scope:persistence.oracle.v1beta1.MsgDelegateFeedConsent)
  private static final com.persistence.oracle.v1beta1.MsgDelegateFeedConsent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.persistence.oracle.v1beta1.MsgDelegateFeedConsent();
  }

  public static com.persistence.oracle.v1beta1.MsgDelegateFeedConsent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDelegateFeedConsent>
      PARSER = new com.google.protobuf.AbstractParser<MsgDelegateFeedConsent>() {
    @java.lang.Override
    public MsgDelegateFeedConsent parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDelegateFeedConsent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDelegateFeedConsent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.persistence.oracle.v1beta1.MsgDelegateFeedConsent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

