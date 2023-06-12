// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package com.cosmos.authz.v1beta1;

/**
 * <pre>
 * GrantAuthorization extends a grant with both the addresses of the grantee and granter.
 * It is used in genesis.proto and query.proto
 * </pre>
 *
 * Protobuf type {@code cosmos.authz.v1beta1.GrantAuthorization}
 */
public final class GrantAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.authz.v1beta1.GrantAuthorization)
    GrantAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrantAuthorization.newBuilder() to construct.
  private GrantAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrantAuthorization() {
    granter_ = "";
    grantee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrantAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.authz.v1beta1.AuthzProto.internal_static_cosmos_authz_v1beta1_GrantAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.authz.v1beta1.AuthzProto.internal_static_cosmos_authz_v1beta1_GrantAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.authz.v1beta1.GrantAuthorization.class, com.cosmos.authz.v1beta1.GrantAuthorization.Builder.class);
  }

  public static final int GRANTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object granter_ = "";
  /**
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

  public static final int AUTHORIZATION_FIELD_NUMBER = 3;
  private com.google.protobuf.Any authorization_;
  /**
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
   * @return Whether the authorization field is set.
   */
  @java.lang.Override
  public boolean hasAuthorization() {
    return authorization_ != null;
  }
  /**
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
   * @return The authorization.
   */
  @java.lang.Override
  public com.google.protobuf.Any getAuthorization() {
    return authorization_ == null ? com.google.protobuf.Any.getDefaultInstance() : authorization_;
  }
  /**
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getAuthorizationOrBuilder() {
    return authorization_ == null ? com.google.protobuf.Any.getDefaultInstance() : authorization_;
  }

  public static final int EXPIRATION_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp expiration_;
  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
   * @return Whether the expiration field is set.
   */
  @java.lang.Override
  public boolean hasExpiration() {
    return expiration_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
   * @return The expiration.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpiration() {
    return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
  }
  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder() {
    return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
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
    if (authorization_ != null) {
      output.writeMessage(3, getAuthorization());
    }
    if (expiration_ != null) {
      output.writeMessage(4, getExpiration());
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
    if (authorization_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAuthorization());
    }
    if (expiration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getExpiration());
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
    if (!(obj instanceof com.cosmos.authz.v1beta1.GrantAuthorization)) {
      return super.equals(obj);
    }
    com.cosmos.authz.v1beta1.GrantAuthorization other = (com.cosmos.authz.v1beta1.GrantAuthorization) obj;

    if (!getGranter()
        .equals(other.getGranter())) return false;
    if (!getGrantee()
        .equals(other.getGrantee())) return false;
    if (hasAuthorization() != other.hasAuthorization()) return false;
    if (hasAuthorization()) {
      if (!getAuthorization()
          .equals(other.getAuthorization())) return false;
    }
    if (hasExpiration() != other.hasExpiration()) return false;
    if (hasExpiration()) {
      if (!getExpiration()
          .equals(other.getExpiration())) return false;
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
    hash = (37 * hash) + GRANTER_FIELD_NUMBER;
    hash = (53 * hash) + getGranter().hashCode();
    hash = (37 * hash) + GRANTEE_FIELD_NUMBER;
    hash = (53 * hash) + getGrantee().hashCode();
    if (hasAuthorization()) {
      hash = (37 * hash) + AUTHORIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorization().hashCode();
    }
    if (hasExpiration()) {
      hash = (37 * hash) + EXPIRATION_FIELD_NUMBER;
      hash = (53 * hash) + getExpiration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.authz.v1beta1.GrantAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.authz.v1beta1.GrantAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.authz.v1beta1.GrantAuthorization parseFrom(
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
  public static Builder newBuilder(com.cosmos.authz.v1beta1.GrantAuthorization prototype) {
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
   * GrantAuthorization extends a grant with both the addresses of the grantee and granter.
   * It is used in genesis.proto and query.proto
   * </pre>
   *
   * Protobuf type {@code cosmos.authz.v1beta1.GrantAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.authz.v1beta1.GrantAuthorization)
      com.cosmos.authz.v1beta1.GrantAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.authz.v1beta1.AuthzProto.internal_static_cosmos_authz_v1beta1_GrantAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.authz.v1beta1.AuthzProto.internal_static_cosmos_authz_v1beta1_GrantAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.authz.v1beta1.GrantAuthorization.class, com.cosmos.authz.v1beta1.GrantAuthorization.Builder.class);
    }

    // Construct using com.cosmos.authz.v1beta1.GrantAuthorization.newBuilder()
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
      authorization_ = null;
      if (authorizationBuilder_ != null) {
        authorizationBuilder_.dispose();
        authorizationBuilder_ = null;
      }
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.authz.v1beta1.AuthzProto.internal_static_cosmos_authz_v1beta1_GrantAuthorization_descriptor;
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.GrantAuthorization getDefaultInstanceForType() {
      return com.cosmos.authz.v1beta1.GrantAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.GrantAuthorization build() {
      com.cosmos.authz.v1beta1.GrantAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.GrantAuthorization buildPartial() {
      com.cosmos.authz.v1beta1.GrantAuthorization result = new com.cosmos.authz.v1beta1.GrantAuthorization(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.authz.v1beta1.GrantAuthorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granter_ = granter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grantee_ = grantee_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.authorization_ = authorizationBuilder_ == null
            ? authorization_
            : authorizationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expiration_ = expirationBuilder_ == null
            ? expiration_
            : expirationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.authz.v1beta1.GrantAuthorization) {
        return mergeFrom((com.cosmos.authz.v1beta1.GrantAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.authz.v1beta1.GrantAuthorization other) {
      if (other == com.cosmos.authz.v1beta1.GrantAuthorization.getDefaultInstance()) return this;
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
      if (other.hasAuthorization()) {
        mergeAuthorization(other.getAuthorization());
      }
      if (other.hasExpiration()) {
        mergeExpiration(other.getExpiration());
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
            case 26: {
              input.readMessage(
                  getAuthorizationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getExpirationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.protobuf.Any authorization_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> authorizationBuilder_;
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     * @return Whether the authorization field is set.
     */
    public boolean hasAuthorization() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     * @return The authorization.
     */
    public com.google.protobuf.Any getAuthorization() {
      if (authorizationBuilder_ == null) {
        return authorization_ == null ? com.google.protobuf.Any.getDefaultInstance() : authorization_;
      } else {
        return authorizationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public Builder setAuthorization(com.google.protobuf.Any value) {
      if (authorizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorization_ = value;
      } else {
        authorizationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public Builder setAuthorization(
        com.google.protobuf.Any.Builder builderForValue) {
      if (authorizationBuilder_ == null) {
        authorization_ = builderForValue.build();
      } else {
        authorizationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public Builder mergeAuthorization(com.google.protobuf.Any value) {
      if (authorizationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          authorization_ != null &&
          authorization_ != com.google.protobuf.Any.getDefaultInstance()) {
          getAuthorizationBuilder().mergeFrom(value);
        } else {
          authorization_ = value;
        }
      } else {
        authorizationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public Builder clearAuthorization() {
      bitField0_ = (bitField0_ & ~0x00000004);
      authorization_ = null;
      if (authorizationBuilder_ != null) {
        authorizationBuilder_.dispose();
        authorizationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public com.google.protobuf.Any.Builder getAuthorizationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAuthorizationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getAuthorizationOrBuilder() {
      if (authorizationBuilder_ != null) {
        return authorizationBuilder_.getMessageOrBuilder();
      } else {
        return authorization_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : authorization_;
      }
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "cosmos.authz.v1beta1.Authorization"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAuthorizationFieldBuilder() {
      if (authorizationBuilder_ == null) {
        authorizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getAuthorization(),
                getParentForChildren(),
                isClean());
        authorization_ = null;
      }
      return authorizationBuilder_;
    }

    private com.google.protobuf.Timestamp expiration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expirationBuilder_;
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     * @return Whether the expiration field is set.
     */
    public boolean hasExpiration() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     * @return The expiration.
     */
    public com.google.protobuf.Timestamp getExpiration() {
      if (expirationBuilder_ == null) {
        return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
      } else {
        return expirationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setExpiration(com.google.protobuf.Timestamp value) {
      if (expirationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expiration_ = value;
      } else {
        expirationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setExpiration(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expirationBuilder_ == null) {
        expiration_ = builderForValue.build();
      } else {
        expirationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeExpiration(com.google.protobuf.Timestamp value) {
      if (expirationBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          expiration_ != null &&
          expiration_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpirationBuilder().mergeFrom(value);
        } else {
          expiration_ = value;
        }
      } else {
        expirationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearExpiration() {
      bitField0_ = (bitField0_ & ~0x00000008);
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpirationBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getExpirationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder() {
      if (expirationBuilder_ != null) {
        return expirationBuilder_.getMessageOrBuilder();
      } else {
        return expiration_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpirationFieldBuilder() {
      if (expirationBuilder_ == null) {
        expirationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpiration(),
                getParentForChildren(),
                isClean());
        expiration_ = null;
      }
      return expirationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.authz.v1beta1.GrantAuthorization)
  }

  // @@protoc_insertion_point(class_scope:cosmos.authz.v1beta1.GrantAuthorization)
  private static final com.cosmos.authz.v1beta1.GrantAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.authz.v1beta1.GrantAuthorization();
  }

  public static com.cosmos.authz.v1beta1.GrantAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrantAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<GrantAuthorization>() {
    @java.lang.Override
    public GrantAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<GrantAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrantAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.authz.v1beta1.GrantAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

