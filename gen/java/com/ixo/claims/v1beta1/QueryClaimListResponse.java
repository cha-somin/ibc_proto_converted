// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/query.proto

package com.ixo.claims.v1beta1;

/**
 * Protobuf type {@code ixo.claims.v1beta1.QueryClaimListResponse}
 */
public final class QueryClaimListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.claims.v1beta1.QueryClaimListResponse)
    QueryClaimListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClaimListResponse.newBuilder() to construct.
  private QueryClaimListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClaimListResponse() {
    claims_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClaimListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.claims.v1beta1.QueryProto.internal_static_ixo_claims_v1beta1_QueryClaimListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.claims.v1beta1.QueryProto.internal_static_ixo_claims_v1beta1_QueryClaimListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.claims.v1beta1.QueryClaimListResponse.class, com.ixo.claims.v1beta1.QueryClaimListResponse.Builder.class);
  }

  public static final int CLAIMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.ixo.claims.v1beta1.Claim> claims_;
  /**
   * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.ixo.claims.v1beta1.Claim> getClaimsList() {
    return claims_;
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ixo.claims.v1beta1.ClaimOrBuilder> 
      getClaimsOrBuilderList() {
    return claims_;
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getClaimsCount() {
    return claims_.size();
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.Claim getClaims(int index) {
    return claims_.get(index);
  }
  /**
   * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.ClaimOrBuilder getClaimsOrBuilder(
      int index) {
    return claims_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < claims_.size(); i++) {
      output.writeMessage(1, claims_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < claims_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, claims_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.ixo.claims.v1beta1.QueryClaimListResponse)) {
      return super.equals(obj);
    }
    com.ixo.claims.v1beta1.QueryClaimListResponse other = (com.ixo.claims.v1beta1.QueryClaimListResponse) obj;

    if (!getClaimsList()
        .equals(other.getClaimsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getClaimsCount() > 0) {
      hash = (37 * hash) + CLAIMS_FIELD_NUMBER;
      hash = (53 * hash) + getClaimsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.QueryClaimListResponse parseFrom(
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
  public static Builder newBuilder(com.ixo.claims.v1beta1.QueryClaimListResponse prototype) {
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
   * Protobuf type {@code ixo.claims.v1beta1.QueryClaimListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.claims.v1beta1.QueryClaimListResponse)
      com.ixo.claims.v1beta1.QueryClaimListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.claims.v1beta1.QueryProto.internal_static_ixo_claims_v1beta1_QueryClaimListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.claims.v1beta1.QueryProto.internal_static_ixo_claims_v1beta1_QueryClaimListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.claims.v1beta1.QueryClaimListResponse.class, com.ixo.claims.v1beta1.QueryClaimListResponse.Builder.class);
    }

    // Construct using com.ixo.claims.v1beta1.QueryClaimListResponse.newBuilder()
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
      if (claimsBuilder_ == null) {
        claims_ = java.util.Collections.emptyList();
      } else {
        claims_ = null;
        claimsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.claims.v1beta1.QueryProto.internal_static_ixo_claims_v1beta1_QueryClaimListResponse_descriptor;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.QueryClaimListResponse getDefaultInstanceForType() {
      return com.ixo.claims.v1beta1.QueryClaimListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.QueryClaimListResponse build() {
      com.ixo.claims.v1beta1.QueryClaimListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.QueryClaimListResponse buildPartial() {
      com.ixo.claims.v1beta1.QueryClaimListResponse result = new com.ixo.claims.v1beta1.QueryClaimListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ixo.claims.v1beta1.QueryClaimListResponse result) {
      if (claimsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          claims_ = java.util.Collections.unmodifiableList(claims_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.claims_ = claims_;
      } else {
        result.claims_ = claimsBuilder_.build();
      }
    }

    private void buildPartial0(com.ixo.claims.v1beta1.QueryClaimListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.claims.v1beta1.QueryClaimListResponse) {
        return mergeFrom((com.ixo.claims.v1beta1.QueryClaimListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.claims.v1beta1.QueryClaimListResponse other) {
      if (other == com.ixo.claims.v1beta1.QueryClaimListResponse.getDefaultInstance()) return this;
      if (claimsBuilder_ == null) {
        if (!other.claims_.isEmpty()) {
          if (claims_.isEmpty()) {
            claims_ = other.claims_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClaimsIsMutable();
            claims_.addAll(other.claims_);
          }
          onChanged();
        }
      } else {
        if (!other.claims_.isEmpty()) {
          if (claimsBuilder_.isEmpty()) {
            claimsBuilder_.dispose();
            claimsBuilder_ = null;
            claims_ = other.claims_;
            bitField0_ = (bitField0_ & ~0x00000001);
            claimsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClaimsFieldBuilder() : null;
          } else {
            claimsBuilder_.addAllMessages(other.claims_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.ixo.claims.v1beta1.Claim m =
                  input.readMessage(
                      com.ixo.claims.v1beta1.Claim.parser(),
                      extensionRegistry);
              if (claimsBuilder_ == null) {
                ensureClaimsIsMutable();
                claims_.add(m);
              } else {
                claimsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<com.ixo.claims.v1beta1.Claim> claims_ =
      java.util.Collections.emptyList();
    private void ensureClaimsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        claims_ = new java.util.ArrayList<com.ixo.claims.v1beta1.Claim>(claims_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.claims.v1beta1.Claim, com.ixo.claims.v1beta1.Claim.Builder, com.ixo.claims.v1beta1.ClaimOrBuilder> claimsBuilder_;

    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ixo.claims.v1beta1.Claim> getClaimsList() {
      if (claimsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(claims_);
      } else {
        return claimsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public int getClaimsCount() {
      if (claimsBuilder_ == null) {
        return claims_.size();
      } else {
        return claimsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.claims.v1beta1.Claim getClaims(int index) {
      if (claimsBuilder_ == null) {
        return claims_.get(index);
      } else {
        return claimsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClaims(
        int index, com.ixo.claims.v1beta1.Claim value) {
      if (claimsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimsIsMutable();
        claims_.set(index, value);
        onChanged();
      } else {
        claimsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClaims(
        int index, com.ixo.claims.v1beta1.Claim.Builder builderForValue) {
      if (claimsBuilder_ == null) {
        ensureClaimsIsMutable();
        claims_.set(index, builderForValue.build());
        onChanged();
      } else {
        claimsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaims(com.ixo.claims.v1beta1.Claim value) {
      if (claimsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimsIsMutable();
        claims_.add(value);
        onChanged();
      } else {
        claimsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaims(
        int index, com.ixo.claims.v1beta1.Claim value) {
      if (claimsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimsIsMutable();
        claims_.add(index, value);
        onChanged();
      } else {
        claimsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaims(
        com.ixo.claims.v1beta1.Claim.Builder builderForValue) {
      if (claimsBuilder_ == null) {
        ensureClaimsIsMutable();
        claims_.add(builderForValue.build());
        onChanged();
      } else {
        claimsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaims(
        int index, com.ixo.claims.v1beta1.Claim.Builder builderForValue) {
      if (claimsBuilder_ == null) {
        ensureClaimsIsMutable();
        claims_.add(index, builderForValue.build());
        onChanged();
      } else {
        claimsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllClaims(
        java.lang.Iterable<? extends com.ixo.claims.v1beta1.Claim> values) {
      if (claimsBuilder_ == null) {
        ensureClaimsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, claims_);
        onChanged();
      } else {
        claimsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearClaims() {
      if (claimsBuilder_ == null) {
        claims_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        claimsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeClaims(int index) {
      if (claimsBuilder_ == null) {
        ensureClaimsIsMutable();
        claims_.remove(index);
        onChanged();
      } else {
        claimsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.claims.v1beta1.Claim.Builder getClaimsBuilder(
        int index) {
      return getClaimsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.claims.v1beta1.ClaimOrBuilder getClaimsOrBuilder(
        int index) {
      if (claimsBuilder_ == null) {
        return claims_.get(index);  } else {
        return claimsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.ixo.claims.v1beta1.ClaimOrBuilder> 
         getClaimsOrBuilderList() {
      if (claimsBuilder_ != null) {
        return claimsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(claims_);
      }
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.claims.v1beta1.Claim.Builder addClaimsBuilder() {
      return getClaimsFieldBuilder().addBuilder(
          com.ixo.claims.v1beta1.Claim.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.claims.v1beta1.Claim.Builder addClaimsBuilder(
        int index) {
      return getClaimsFieldBuilder().addBuilder(
          index, com.ixo.claims.v1beta1.Claim.getDefaultInstance());
    }
    /**
     * <code>repeated .ixo.claims.v1beta1.Claim claims = 1 [json_name = "claims", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ixo.claims.v1beta1.Claim.Builder> 
         getClaimsBuilderList() {
      return getClaimsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ixo.claims.v1beta1.Claim, com.ixo.claims.v1beta1.Claim.Builder, com.ixo.claims.v1beta1.ClaimOrBuilder> 
        getClaimsFieldBuilder() {
      if (claimsBuilder_ == null) {
        claimsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ixo.claims.v1beta1.Claim, com.ixo.claims.v1beta1.Claim.Builder, com.ixo.claims.v1beta1.ClaimOrBuilder>(
                claims_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        claims_ = null;
      }
      return claimsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.claims.v1beta1.QueryClaimListResponse)
  }

  // @@protoc_insertion_point(class_scope:ixo.claims.v1beta1.QueryClaimListResponse)
  private static final com.ixo.claims.v1beta1.QueryClaimListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.claims.v1beta1.QueryClaimListResponse();
  }

  public static com.ixo.claims.v1beta1.QueryClaimListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClaimListResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClaimListResponse>() {
    @java.lang.Override
    public QueryClaimListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClaimListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClaimListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.claims.v1beta1.QueryClaimListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

