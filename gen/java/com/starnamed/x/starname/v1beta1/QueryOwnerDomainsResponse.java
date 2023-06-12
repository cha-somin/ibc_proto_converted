// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iov/starname/v1beta1/query.proto

package com.starnamed.x.starname.v1beta1;

/**
 * <pre>
 * QueryOwnerDomainsResponse is the response type for the Query/OwnerDomains RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse}
 */
public final class QueryOwnerDomainsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)
    QueryOwnerDomainsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOwnerDomainsResponse.newBuilder() to construct.
  private QueryOwnerDomainsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOwnerDomainsResponse() {
    domains_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOwnerDomainsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.starnamed.x.starname.v1beta1.QueryProto.internal_static_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.starnamed.x.starname.v1beta1.QueryProto.internal_static_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.class, com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.Builder.class);
  }

  public static final int DOMAINS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.starnamed.x.starname.v1beta1.Domain> domains_;
  /**
   * <pre>
   * Accounts is the accounts associated with owner.
   * </pre>
   *
   * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.starnamed.x.starname.v1beta1.Domain> getDomainsList() {
    return domains_;
  }
  /**
   * <pre>
   * Accounts is the accounts associated with owner.
   * </pre>
   *
   * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.starnamed.x.starname.v1beta1.DomainOrBuilder> 
      getDomainsOrBuilderList() {
    return domains_;
  }
  /**
   * <pre>
   * Accounts is the accounts associated with owner.
   * </pre>
   *
   * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
   */
  @java.lang.Override
  public int getDomainsCount() {
    return domains_.size();
  }
  /**
   * <pre>
   * Accounts is the accounts associated with owner.
   * </pre>
   *
   * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
   */
  @java.lang.Override
  public com.starnamed.x.starname.v1beta1.Domain getDomains(int index) {
    return domains_.get(index);
  }
  /**
   * <pre>
   * Accounts is the accounts associated with owner.
   * </pre>
   *
   * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
   */
  @java.lang.Override
  public com.starnamed.x.starname.v1beta1.DomainOrBuilder getDomainsOrBuilder(
      int index) {
    return domains_.get(index);
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse page_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return page_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
   * @return The page.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPage() {
    return page_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : page_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPageOrBuilder() {
    return page_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : page_;
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
    for (int i = 0; i < domains_.size(); i++) {
      output.writeMessage(1, domains_.get(i));
    }
    if (page_ != null) {
      output.writeMessage(2, getPage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < domains_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, domains_.get(i));
    }
    if (page_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPage());
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
    if (!(obj instanceof com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)) {
      return super.equals(obj);
    }
    com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse other = (com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse) obj;

    if (!getDomainsList()
        .equals(other.getDomainsList())) return false;
    if (hasPage() != other.hasPage()) return false;
    if (hasPage()) {
      if (!getPage()
          .equals(other.getPage())) return false;
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
    if (getDomainsCount() > 0) {
      hash = (37 * hash) + DOMAINS_FIELD_NUMBER;
      hash = (53 * hash) + getDomainsList().hashCode();
    }
    if (hasPage()) {
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse parseFrom(
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
  public static Builder newBuilder(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse prototype) {
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
   * QueryOwnerDomainsResponse is the response type for the Query/OwnerDomains RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)
      com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.starnamed.x.starname.v1beta1.QueryProto.internal_static_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.starnamed.x.starname.v1beta1.QueryProto.internal_static_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.class, com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.Builder.class);
    }

    // Construct using com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.newBuilder()
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
      if (domainsBuilder_ == null) {
        domains_ = java.util.Collections.emptyList();
      } else {
        domains_ = null;
        domainsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.starnamed.x.starname.v1beta1.QueryProto.internal_static_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse_descriptor;
    }

    @java.lang.Override
    public com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse getDefaultInstanceForType() {
      return com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse build() {
      com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse buildPartial() {
      com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse result = new com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse result) {
      if (domainsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          domains_ = java.util.Collections.unmodifiableList(domains_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.domains_ = domains_;
      } else {
        result.domains_ = domainsBuilder_.build();
      }
    }

    private void buildPartial0(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse) {
        return mergeFrom((com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse other) {
      if (other == com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.getDefaultInstance()) return this;
      if (domainsBuilder_ == null) {
        if (!other.domains_.isEmpty()) {
          if (domains_.isEmpty()) {
            domains_ = other.domains_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDomainsIsMutable();
            domains_.addAll(other.domains_);
          }
          onChanged();
        }
      } else {
        if (!other.domains_.isEmpty()) {
          if (domainsBuilder_.isEmpty()) {
            domainsBuilder_.dispose();
            domainsBuilder_ = null;
            domains_ = other.domains_;
            bitField0_ = (bitField0_ & ~0x00000001);
            domainsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDomainsFieldBuilder() : null;
          } else {
            domainsBuilder_.addAllMessages(other.domains_);
          }
        }
      }
      if (other.hasPage()) {
        mergePage(other.getPage());
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
              com.starnamed.x.starname.v1beta1.Domain m =
                  input.readMessage(
                      com.starnamed.x.starname.v1beta1.Domain.parser(),
                      extensionRegistry);
              if (domainsBuilder_ == null) {
                ensureDomainsIsMutable();
                domains_.add(m);
              } else {
                domainsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPageFieldBuilder().getBuilder(),
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

    private java.util.List<com.starnamed.x.starname.v1beta1.Domain> domains_ =
      java.util.Collections.emptyList();
    private void ensureDomainsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        domains_ = new java.util.ArrayList<com.starnamed.x.starname.v1beta1.Domain>(domains_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.starnamed.x.starname.v1beta1.Domain, com.starnamed.x.starname.v1beta1.Domain.Builder, com.starnamed.x.starname.v1beta1.DomainOrBuilder> domainsBuilder_;

    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public java.util.List<com.starnamed.x.starname.v1beta1.Domain> getDomainsList() {
      if (domainsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(domains_);
      } else {
        return domainsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public int getDomainsCount() {
      if (domainsBuilder_ == null) {
        return domains_.size();
      } else {
        return domainsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public com.starnamed.x.starname.v1beta1.Domain getDomains(int index) {
      if (domainsBuilder_ == null) {
        return domains_.get(index);
      } else {
        return domainsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder setDomains(
        int index, com.starnamed.x.starname.v1beta1.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.set(index, value);
        onChanged();
      } else {
        domainsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder setDomains(
        int index, com.starnamed.x.starname.v1beta1.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.set(index, builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder addDomains(com.starnamed.x.starname.v1beta1.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.add(value);
        onChanged();
      } else {
        domainsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder addDomains(
        int index, com.starnamed.x.starname.v1beta1.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.add(index, value);
        onChanged();
      } else {
        domainsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder addDomains(
        com.starnamed.x.starname.v1beta1.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.add(builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder addDomains(
        int index, com.starnamed.x.starname.v1beta1.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.add(index, builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder addAllDomains(
        java.lang.Iterable<? extends com.starnamed.x.starname.v1beta1.Domain> values) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, domains_);
        onChanged();
      } else {
        domainsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder clearDomains() {
      if (domainsBuilder_ == null) {
        domains_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        domainsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public Builder removeDomains(int index) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.remove(index);
        onChanged();
      } else {
        domainsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public com.starnamed.x.starname.v1beta1.Domain.Builder getDomainsBuilder(
        int index) {
      return getDomainsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public com.starnamed.x.starname.v1beta1.DomainOrBuilder getDomainsOrBuilder(
        int index) {
      if (domainsBuilder_ == null) {
        return domains_.get(index);  } else {
        return domainsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public java.util.List<? extends com.starnamed.x.starname.v1beta1.DomainOrBuilder> 
         getDomainsOrBuilderList() {
      if (domainsBuilder_ != null) {
        return domainsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(domains_);
      }
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public com.starnamed.x.starname.v1beta1.Domain.Builder addDomainsBuilder() {
      return getDomainsFieldBuilder().addBuilder(
          com.starnamed.x.starname.v1beta1.Domain.getDefaultInstance());
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public com.starnamed.x.starname.v1beta1.Domain.Builder addDomainsBuilder(
        int index) {
      return getDomainsFieldBuilder().addBuilder(
          index, com.starnamed.x.starname.v1beta1.Domain.getDefaultInstance());
    }
    /**
     * <pre>
     * Accounts is the accounts associated with owner.
     * </pre>
     *
     * <code>repeated .starnamed.x.starname.v1beta1.Domain domains = 1 [json_name = "domains", (.gogoproto.moretags) = "yaml:&#92;"domains&#92;""];</code>
     */
    public java.util.List<com.starnamed.x.starname.v1beta1.Domain.Builder> 
         getDomainsBuilderList() {
      return getDomainsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.starnamed.x.starname.v1beta1.Domain, com.starnamed.x.starname.v1beta1.Domain.Builder, com.starnamed.x.starname.v1beta1.DomainOrBuilder> 
        getDomainsFieldBuilder() {
      if (domainsBuilder_ == null) {
        domainsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.starnamed.x.starname.v1beta1.Domain, com.starnamed.x.starname.v1beta1.Domain.Builder, com.starnamed.x.starname.v1beta1.DomainOrBuilder>(
                domains_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        domains_ = null;
      }
      return domainsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> pageBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     * @return The page.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public Builder setPage(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public Builder setPage(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public Builder mergePage(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          page_ != null &&
          page_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : page_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse page = 2 [json_name = "page"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)
  }

  // @@protoc_insertion_point(class_scope:starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse)
  private static final com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse();
  }

  public static com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOwnerDomainsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryOwnerDomainsResponse>() {
    @java.lang.Override
    public QueryOwnerDomainsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryOwnerDomainsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOwnerDomainsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

