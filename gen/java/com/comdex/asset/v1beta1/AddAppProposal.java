// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/gov.proto

package com.comdex.asset.v1beta1;

/**
 * Protobuf type {@code comdex.asset.v1beta1.AddAppProposal}
 */
public final class AddAppProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.asset.v1beta1.AddAppProposal)
    AddAppProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddAppProposal.newBuilder() to construct.
  private AddAppProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddAppProposal() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddAppProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.asset.v1beta1.GovProto.internal_static_comdex_asset_v1beta1_AddAppProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.asset.v1beta1.GovProto.internal_static_comdex_asset_v1beta1_AddAppProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.asset.v1beta1.AddAppProposal.class, com.comdex.asset.v1beta1.AddAppProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_FIELD_NUMBER = 3;
  private com.comdex.asset.v1beta1.AppData app_;
  /**
   * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
   * @return Whether the app field is set.
   */
  @java.lang.Override
  public boolean hasApp() {
    return app_ != null;
  }
  /**
   * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
   * @return The app.
   */
  @java.lang.Override
  public com.comdex.asset.v1beta1.AppData getApp() {
    return app_ == null ? com.comdex.asset.v1beta1.AppData.getDefaultInstance() : app_;
  }
  /**
   * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.comdex.asset.v1beta1.AppDataOrBuilder getAppOrBuilder() {
    return app_ == null ? com.comdex.asset.v1beta1.AppData.getDefaultInstance() : app_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (app_ != null) {
      output.writeMessage(3, getApp());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (app_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getApp());
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
    if (!(obj instanceof com.comdex.asset.v1beta1.AddAppProposal)) {
      return super.equals(obj);
    }
    com.comdex.asset.v1beta1.AddAppProposal other = (com.comdex.asset.v1beta1.AddAppProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasApp() != other.hasApp()) return false;
    if (hasApp()) {
      if (!getApp()
          .equals(other.getApp())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasApp()) {
      hash = (37 * hash) + APP_FIELD_NUMBER;
      hash = (53 * hash) + getApp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.asset.v1beta1.AddAppProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.asset.v1beta1.AddAppProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.asset.v1beta1.AddAppProposal parseFrom(
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
  public static Builder newBuilder(com.comdex.asset.v1beta1.AddAppProposal prototype) {
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
   * Protobuf type {@code comdex.asset.v1beta1.AddAppProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.asset.v1beta1.AddAppProposal)
      com.comdex.asset.v1beta1.AddAppProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.asset.v1beta1.GovProto.internal_static_comdex_asset_v1beta1_AddAppProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.asset.v1beta1.GovProto.internal_static_comdex_asset_v1beta1_AddAppProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.asset.v1beta1.AddAppProposal.class, com.comdex.asset.v1beta1.AddAppProposal.Builder.class);
    }

    // Construct using com.comdex.asset.v1beta1.AddAppProposal.newBuilder()
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
      title_ = "";
      description_ = "";
      app_ = null;
      if (appBuilder_ != null) {
        appBuilder_.dispose();
        appBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.asset.v1beta1.GovProto.internal_static_comdex_asset_v1beta1_AddAppProposal_descriptor;
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.AddAppProposal getDefaultInstanceForType() {
      return com.comdex.asset.v1beta1.AddAppProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.AddAppProposal build() {
      com.comdex.asset.v1beta1.AddAppProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.AddAppProposal buildPartial() {
      com.comdex.asset.v1beta1.AddAppProposal result = new com.comdex.asset.v1beta1.AddAppProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.asset.v1beta1.AddAppProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.app_ = appBuilder_ == null
            ? app_
            : appBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.asset.v1beta1.AddAppProposal) {
        return mergeFrom((com.comdex.asset.v1beta1.AddAppProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.asset.v1beta1.AddAppProposal other) {
      if (other == com.comdex.asset.v1beta1.AddAppProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasApp()) {
        mergeApp(other.getApp());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAppFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.comdex.asset.v1beta1.AppData app_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.asset.v1beta1.AppData, com.comdex.asset.v1beta1.AppData.Builder, com.comdex.asset.v1beta1.AppDataOrBuilder> appBuilder_;
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     * @return Whether the app field is set.
     */
    public boolean hasApp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     * @return The app.
     */
    public com.comdex.asset.v1beta1.AppData getApp() {
      if (appBuilder_ == null) {
        return app_ == null ? com.comdex.asset.v1beta1.AppData.getDefaultInstance() : app_;
      } else {
        return appBuilder_.getMessage();
      }
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public Builder setApp(com.comdex.asset.v1beta1.AppData value) {
      if (appBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        app_ = value;
      } else {
        appBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public Builder setApp(
        com.comdex.asset.v1beta1.AppData.Builder builderForValue) {
      if (appBuilder_ == null) {
        app_ = builderForValue.build();
      } else {
        appBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeApp(com.comdex.asset.v1beta1.AppData value) {
      if (appBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          app_ != null &&
          app_ != com.comdex.asset.v1beta1.AppData.getDefaultInstance()) {
          getAppBuilder().mergeFrom(value);
        } else {
          app_ = value;
        }
      } else {
        appBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearApp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      app_ = null;
      if (appBuilder_ != null) {
        appBuilder_.dispose();
        appBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.asset.v1beta1.AppData.Builder getAppBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAppFieldBuilder().getBuilder();
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    public com.comdex.asset.v1beta1.AppDataOrBuilder getAppOrBuilder() {
      if (appBuilder_ != null) {
        return appBuilder_.getMessageOrBuilder();
      } else {
        return app_ == null ?
            com.comdex.asset.v1beta1.AppData.getDefaultInstance() : app_;
      }
    }
    /**
     * <code>.comdex.asset.v1beta1.AppData app = 3 [json_name = "app", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.asset.v1beta1.AppData, com.comdex.asset.v1beta1.AppData.Builder, com.comdex.asset.v1beta1.AppDataOrBuilder> 
        getAppFieldBuilder() {
      if (appBuilder_ == null) {
        appBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.comdex.asset.v1beta1.AppData, com.comdex.asset.v1beta1.AppData.Builder, com.comdex.asset.v1beta1.AppDataOrBuilder>(
                getApp(),
                getParentForChildren(),
                isClean());
        app_ = null;
      }
      return appBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.asset.v1beta1.AddAppProposal)
  }

  // @@protoc_insertion_point(class_scope:comdex.asset.v1beta1.AddAppProposal)
  private static final com.comdex.asset.v1beta1.AddAppProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.asset.v1beta1.AddAppProposal();
  }

  public static com.comdex.asset.v1beta1.AddAppProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddAppProposal>
      PARSER = new com.google.protobuf.AbstractParser<AddAppProposal>() {
    @java.lang.Override
    public AddAppProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddAppProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddAppProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.asset.v1beta1.AddAppProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

