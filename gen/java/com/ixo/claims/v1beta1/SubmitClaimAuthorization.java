// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/authz.proto

package com.ixo.claims.v1beta1;

/**
 * Protobuf type {@code ixo.claims.v1beta1.SubmitClaimAuthorization}
 */
public final class SubmitClaimAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.claims.v1beta1.SubmitClaimAuthorization)
    SubmitClaimAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitClaimAuthorization.newBuilder() to construct.
  private SubmitClaimAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitClaimAuthorization() {
    admin_ = "";
    constraints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitClaimAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.claims.v1beta1.AuthzProto.internal_static_ixo_claims_v1beta1_SubmitClaimAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.claims.v1beta1.AuthzProto.internal_static_ixo_claims_v1beta1_SubmitClaimAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.claims.v1beta1.SubmitClaimAuthorization.class, com.ixo.claims.v1beta1.SubmitClaimAuthorization.Builder.class);
  }

  public static final int ADMIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object admin_ = "";
  /**
   * <pre>
   * address of admin
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  @java.lang.Override
  public java.lang.String getAdmin() {
    java.lang.Object ref = admin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      admin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * address of admin
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdminBytes() {
    java.lang.Object ref = admin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      admin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSTRAINTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.ixo.claims.v1beta1.SubmitClaimConstraints> constraints_;
  /**
   * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public java.util.List<com.ixo.claims.v1beta1.SubmitClaimConstraints> getConstraintsList() {
    return constraints_;
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder> 
      getConstraintsOrBuilderList() {
    return constraints_;
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public int getConstraintsCount() {
    return constraints_.size();
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.SubmitClaimConstraints getConstraints(int index) {
    return constraints_.get(index);
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder getConstraintsOrBuilder(
      int index) {
    return constraints_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_);
    }
    for (int i = 0; i < constraints_.size(); i++) {
      output.writeMessage(2, constraints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, admin_);
    }
    for (int i = 0; i < constraints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, constraints_.get(i));
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
    if (!(obj instanceof com.ixo.claims.v1beta1.SubmitClaimAuthorization)) {
      return super.equals(obj);
    }
    com.ixo.claims.v1beta1.SubmitClaimAuthorization other = (com.ixo.claims.v1beta1.SubmitClaimAuthorization) obj;

    if (!getAdmin()
        .equals(other.getAdmin())) return false;
    if (!getConstraintsList()
        .equals(other.getConstraintsList())) return false;
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
    hash = (37 * hash) + ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + getAdmin().hashCode();
    if (getConstraintsCount() > 0) {
      hash = (37 * hash) + CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getConstraintsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization parseFrom(
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
  public static Builder newBuilder(com.ixo.claims.v1beta1.SubmitClaimAuthorization prototype) {
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
   * Protobuf type {@code ixo.claims.v1beta1.SubmitClaimAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.claims.v1beta1.SubmitClaimAuthorization)
      com.ixo.claims.v1beta1.SubmitClaimAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.claims.v1beta1.AuthzProto.internal_static_ixo_claims_v1beta1_SubmitClaimAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.claims.v1beta1.AuthzProto.internal_static_ixo_claims_v1beta1_SubmitClaimAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.claims.v1beta1.SubmitClaimAuthorization.class, com.ixo.claims.v1beta1.SubmitClaimAuthorization.Builder.class);
    }

    // Construct using com.ixo.claims.v1beta1.SubmitClaimAuthorization.newBuilder()
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
      admin_ = "";
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
      } else {
        constraints_ = null;
        constraintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.claims.v1beta1.AuthzProto.internal_static_ixo_claims_v1beta1_SubmitClaimAuthorization_descriptor;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.SubmitClaimAuthorization getDefaultInstanceForType() {
      return com.ixo.claims.v1beta1.SubmitClaimAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.SubmitClaimAuthorization build() {
      com.ixo.claims.v1beta1.SubmitClaimAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.SubmitClaimAuthorization buildPartial() {
      com.ixo.claims.v1beta1.SubmitClaimAuthorization result = new com.ixo.claims.v1beta1.SubmitClaimAuthorization(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ixo.claims.v1beta1.SubmitClaimAuthorization result) {
      if (constraintsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          constraints_ = java.util.Collections.unmodifiableList(constraints_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.constraints_ = constraints_;
      } else {
        result.constraints_ = constraintsBuilder_.build();
      }
    }

    private void buildPartial0(com.ixo.claims.v1beta1.SubmitClaimAuthorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.admin_ = admin_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.claims.v1beta1.SubmitClaimAuthorization) {
        return mergeFrom((com.ixo.claims.v1beta1.SubmitClaimAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.claims.v1beta1.SubmitClaimAuthorization other) {
      if (other == com.ixo.claims.v1beta1.SubmitClaimAuthorization.getDefaultInstance()) return this;
      if (!other.getAdmin().isEmpty()) {
        admin_ = other.admin_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (constraintsBuilder_ == null) {
        if (!other.constraints_.isEmpty()) {
          if (constraints_.isEmpty()) {
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureConstraintsIsMutable();
            constraints_.addAll(other.constraints_);
          }
          onChanged();
        }
      } else {
        if (!other.constraints_.isEmpty()) {
          if (constraintsBuilder_.isEmpty()) {
            constraintsBuilder_.dispose();
            constraintsBuilder_ = null;
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000002);
            constraintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConstraintsFieldBuilder() : null;
          } else {
            constraintsBuilder_.addAllMessages(other.constraints_);
          }
        }
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
              admin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.ixo.claims.v1beta1.SubmitClaimConstraints m =
                  input.readMessage(
                      com.ixo.claims.v1beta1.SubmitClaimConstraints.parser(),
                      extensionRegistry);
              if (constraintsBuilder_ == null) {
                ensureConstraintsIsMutable();
                constraints_.add(m);
              } else {
                constraintsBuilder_.addMessage(m);
              }
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

    private java.lang.Object admin_ = "";
    /**
     * <pre>
     * address of admin
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return The admin.
     */
    public java.lang.String getAdmin() {
      java.lang.Object ref = admin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        admin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * address of admin
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return The bytes for admin.
     */
    public com.google.protobuf.ByteString
        getAdminBytes() {
      java.lang.Object ref = admin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        admin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * address of admin
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @param value The admin to set.
     * @return This builder for chaining.
     */
    public Builder setAdmin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      admin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of admin
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdmin() {
      admin_ = getDefaultInstance().getAdmin();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of admin
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @param value The bytes for admin to set.
     * @return This builder for chaining.
     */
    public Builder setAdminBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      admin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.ixo.claims.v1beta1.SubmitClaimConstraints> constraints_ =
      java.util.Collections.emptyList();
    private void ensureConstraintsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        constraints_ = new java.util.ArrayList<com.ixo.claims.v1beta1.SubmitClaimConstraints>(constraints_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.claims.v1beta1.SubmitClaimConstraints, com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder, com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder> constraintsBuilder_;

    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public java.util.List<com.ixo.claims.v1beta1.SubmitClaimConstraints> getConstraintsList() {
      if (constraintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(constraints_);
      } else {
        return constraintsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public int getConstraintsCount() {
      if (constraintsBuilder_ == null) {
        return constraints_.size();
      } else {
        return constraintsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public com.ixo.claims.v1beta1.SubmitClaimConstraints getConstraints(int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);
      } else {
        return constraintsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder setConstraints(
        int index, com.ixo.claims.v1beta1.SubmitClaimConstraints value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.set(index, value);
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder setConstraints(
        int index, com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.set(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(com.ixo.claims.v1beta1.SubmitClaimConstraints value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        int index, com.ixo.claims.v1beta1.SubmitClaimConstraints value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(index, value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder addConstraints(
        int index, com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder addAllConstraints(
        java.lang.Iterable<? extends com.ixo.claims.v1beta1.SubmitClaimConstraints> values) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, constraints_);
        onChanged();
      } else {
        constraintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder clearConstraints() {
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        constraintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public Builder removeConstraints(int index) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.remove(index);
        onChanged();
      } else {
        constraintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder getConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder getConstraintsOrBuilder(
        int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);  } else {
        return constraintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public java.util.List<? extends com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder> 
         getConstraintsOrBuilderList() {
      if (constraintsBuilder_ != null) {
        return constraintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(constraints_);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder addConstraintsBuilder() {
      return getConstraintsFieldBuilder().addBuilder(
          com.ixo.claims.v1beta1.SubmitClaimConstraints.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder addConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().addBuilder(
          index, com.ixo.claims.v1beta1.SubmitClaimConstraints.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.SubmitClaimConstraints constraints = 2 [json_name = "constraints"];</code>
     */
    public java.util.List<com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder> 
         getConstraintsBuilderList() {
      return getConstraintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.claims.v1beta1.SubmitClaimConstraints, com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder, com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder> 
        getConstraintsFieldBuilder() {
      if (constraintsBuilder_ == null) {
        constraintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ixo.claims.v1beta1.SubmitClaimConstraints, com.ixo.claims.v1beta1.SubmitClaimConstraints.Builder, com.ixo.claims.v1beta1.SubmitClaimConstraintsOrBuilder>(
                constraints_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        constraints_ = null;
      }
      return constraintsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.claims.v1beta1.SubmitClaimAuthorization)
  }

  // @@protoc_insertion_point(class_scope:ixo.claims.v1beta1.SubmitClaimAuthorization)
  private static final com.ixo.claims.v1beta1.SubmitClaimAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.claims.v1beta1.SubmitClaimAuthorization();
  }

  public static com.ixo.claims.v1beta1.SubmitClaimAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitClaimAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<SubmitClaimAuthorization>() {
    @java.lang.Override
    public SubmitClaimAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubmitClaimAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitClaimAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.claims.v1beta1.SubmitClaimAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

