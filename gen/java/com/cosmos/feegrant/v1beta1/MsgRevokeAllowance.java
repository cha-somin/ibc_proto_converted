// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package com.cosmos.feegrant.v1beta1;

/**
 * <pre>
 * MsgRevokeAllowance removes any existing Allowance from Granter to Grantee.
 * </pre>
 *
 * Protobuf type {@code cosmos.feegrant.v1beta1.MsgRevokeAllowance}
 */
public final class MsgRevokeAllowance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.feegrant.v1beta1.MsgRevokeAllowance)
    MsgRevokeAllowanceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRevokeAllowance.newBuilder() to construct.
  private MsgRevokeAllowance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRevokeAllowance() {
    granter_ = "";
    grantee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRevokeAllowance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.feegrant.v1beta1.TxProto.internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.feegrant.v1beta1.TxProto.internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.class, com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.Builder.class);
  }

  public static final int GRANTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object granter_ = "";
  /**
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
   * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The granter.
   */
  @java.lang.Override
  public java.lang.String getGranter() {
    java.lang.Object ref = granter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      granter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
   * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for granter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGranterBytes() {
    java.lang.Object ref = granter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      granter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANTEE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object grantee_ = "";
  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The grantee.
   */
  @java.lang.Override
  public java.lang.String getGrantee() {
    java.lang.Object ref = grantee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grantee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for grantee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGranteeBytes() {
    java.lang.Object ref = grantee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grantee_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, granter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, grantee_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, granter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, grantee_);
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
    if (!(obj instanceof com.cosmos.feegrant.v1beta1.MsgRevokeAllowance)) {
      return super.equals(obj);
    }
    com.cosmos.feegrant.v1beta1.MsgRevokeAllowance other = (com.cosmos.feegrant.v1beta1.MsgRevokeAllowance) obj;

    if (!getGranter()
        .equals(other.getGranter())) return false;
    if (!getGrantee()
        .equals(other.getGrantee())) return false;
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
    hash = (37 * hash) + GRANTER_FIELD_NUMBER;
    hash = (53 * hash) + getGranter().hashCode();
    hash = (37 * hash) + GRANTEE_FIELD_NUMBER;
    hash = (53 * hash) + getGrantee().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance parseFrom(
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
  public static Builder newBuilder(com.cosmos.feegrant.v1beta1.MsgRevokeAllowance prototype) {
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
   * MsgRevokeAllowance removes any existing Allowance from Granter to Grantee.
   * </pre>
   *
   * Protobuf type {@code cosmos.feegrant.v1beta1.MsgRevokeAllowance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.feegrant.v1beta1.MsgRevokeAllowance)
      com.cosmos.feegrant.v1beta1.MsgRevokeAllowanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.feegrant.v1beta1.TxProto.internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.feegrant.v1beta1.TxProto.internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.class, com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.Builder.class);
    }

    // Construct using com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.newBuilder()
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
      granter_ = "";
      grantee_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.feegrant.v1beta1.TxProto.internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor;
    }

    @java.lang.Override
    public com.cosmos.feegrant.v1beta1.MsgRevokeAllowance getDefaultInstanceForType() {
      return com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.feegrant.v1beta1.MsgRevokeAllowance build() {
      com.cosmos.feegrant.v1beta1.MsgRevokeAllowance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.feegrant.v1beta1.MsgRevokeAllowance buildPartial() {
      com.cosmos.feegrant.v1beta1.MsgRevokeAllowance result = new com.cosmos.feegrant.v1beta1.MsgRevokeAllowance(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.feegrant.v1beta1.MsgRevokeAllowance result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granter_ = granter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grantee_ = grantee_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.feegrant.v1beta1.MsgRevokeAllowance) {
        return mergeFrom((com.cosmos.feegrant.v1beta1.MsgRevokeAllowance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.feegrant.v1beta1.MsgRevokeAllowance other) {
      if (other == com.cosmos.feegrant.v1beta1.MsgRevokeAllowance.getDefaultInstance()) return this;
      if (!other.getGranter().isEmpty()) {
        granter_ = other.granter_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGrantee().isEmpty()) {
        grantee_ = other.grantee_;
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
              granter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              grantee_ = input.readStringRequireUtf8();
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

    private java.lang.Object granter_ = "";
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The granter.
     */
    public java.lang.String getGranter() {
      java.lang.Object ref = granter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        granter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for granter.
     */
    public com.google.protobuf.ByteString
        getGranterBytes() {
      java.lang.Object ref = granter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        granter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The granter to set.
     * @return This builder for chaining.
     */
    public Builder setGranter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      granter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGranter() {
      granter_ = getDefaultInstance().getGranter();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for granter to set.
     * @return This builder for chaining.
     */
    public Builder setGranterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      granter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object grantee_ = "";
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The grantee.
     */
    public java.lang.String getGrantee() {
      java.lang.Object ref = grantee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for grantee.
     */
    public com.google.protobuf.ByteString
        getGranteeBytes() {
      java.lang.Object ref = grantee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The grantee to set.
     * @return This builder for chaining.
     */
    public Builder setGrantee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      grantee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantee() {
      grantee_ = getDefaultInstance().getGrantee();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for grantee to set.
     * @return This builder for chaining.
     */
    public Builder setGranteeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      grantee_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.feegrant.v1beta1.MsgRevokeAllowance)
  }

  // @@protoc_insertion_point(class_scope:cosmos.feegrant.v1beta1.MsgRevokeAllowance)
  private static final com.cosmos.feegrant.v1beta1.MsgRevokeAllowance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.feegrant.v1beta1.MsgRevokeAllowance();
  }

  public static com.cosmos.feegrant.v1beta1.MsgRevokeAllowance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRevokeAllowance>
      PARSER = new com.google.protobuf.AbstractParser<MsgRevokeAllowance>() {
    @java.lang.Override
    public MsgRevokeAllowance parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRevokeAllowance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRevokeAllowance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.feegrant.v1beta1.MsgRevokeAllowance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

